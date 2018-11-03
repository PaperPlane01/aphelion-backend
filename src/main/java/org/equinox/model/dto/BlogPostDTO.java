package org.equinox.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.equinox.model.domain.BlogPostPublisherType;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BlogPostDTO {
    private Long id;
    private String title;
    private Map<Object, Object> content;
    private BlogPostPublisher publisher;
    private Long blogId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    private Collection<TagDTO> tags;
    private Integer numberOfLikes;
    private Integer numberOfComments;
    private boolean likedByCurrentUser;
    private Long likeId;
    private int numberOfViews;
    private boolean deleted;
    private Long deletedByUserId;
    private BlogPostPublisherType publishedBy;
}
