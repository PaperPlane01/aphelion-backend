package org.equinox.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.equinox.model.domain.BlogPost;
import org.equinox.model.dto.BlogPostMinifiedDTO;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(uses = BlogToBlogMinifiedDTOMapper.class)
public abstract class BlogPostToBlogPostMinifiedDTOMapper {
    @Autowired
    private BlogPostPublisherExtractor blogPostPublisherExtractor;

    @BeanMapping(resultType = BlogPostMinifiedDTO.class)
    public abstract BlogPostMinifiedDTO map(BlogPost blogPost);

    @AfterMapping
    protected void setRemainingFields(BlogPost blogPost, @MappingTarget BlogPostMinifiedDTO blogPostMinifiedDTO) {
        blogPostMinifiedDTO.setPublisher(blogPostPublisherExtractor.getPublisher(blogPost));
    }
}
