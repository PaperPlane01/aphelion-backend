package aphelion.model.dto;

import aphelion.model.domain.BlogManagersVisibilityLevel;
import aphelion.model.domain.BlogPostPublisherType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogDTO {
    private Long id;
    private String name;
    private UserDTO owner;
    private String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private Date createdAt;
    private String avatarUri;
    private String letterAvatarColor;
    private boolean currentUserSubscribed;
    private Long subscriptionId;
    private BlogManagersVisibilityLevel blogManagersVisibilityLevel;
    private BlogPostPublisherType defaultPublisherType;
}
