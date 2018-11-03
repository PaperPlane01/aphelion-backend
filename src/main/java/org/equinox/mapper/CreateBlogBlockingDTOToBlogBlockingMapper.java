package org.equinox.mapper;

import org.equinox.exception.UserNotFoundException;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.equinox.exception.BlogNotFoundException;
import org.equinox.model.domain.BlogBlocking;
import org.equinox.model.dto.CreateBlogBlockingDTO;
import org.equinox.repository.BlogRepository;
import org.equinox.repository.UserRepository;
import org.equinox.security.AuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.util.Date;

@Mapper
public abstract class CreateBlogBlockingDTOToBlogBlockingMapper {
    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @BeanMapping(resultType = BlogBlocking.class)
    public abstract BlogBlocking map(CreateBlogBlockingDTO createBlogBlockingDTO);

    @AfterMapping
    protected void setRemainingFields(CreateBlogBlockingDTO createBlogBlockingDTO,
                                      @MappingTarget BlogBlocking blogBlocking) {
        blogBlocking.setStartDate(Date.from(Instant.now()));
        blogBlocking.setBlockedUser(userRepository.findById(createBlogBlockingDTO
                .getBlockedUserId())
                .orElseThrow(() -> new UserNotFoundException("Could not find user with given id: "
                        + createBlogBlockingDTO.getBlockedUserId())));
        blogBlocking.setBlog(blogRepository.findById(createBlogBlockingDTO.getBlogId())
                .orElseThrow(() -> new BlogNotFoundException("Could not find blog with given id: "
                        + createBlogBlockingDTO.getBlogId())));
        blogBlocking.setBlockedBy(authenticationFacade.getCurrentUser());
    }
}
