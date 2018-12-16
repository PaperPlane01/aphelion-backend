package aphelion.model.dto;

import aphelion.model.domain.BlogManagersVisibilityLevel;
import aphelion.model.domain.BlogPostPublisherType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBlogDTO {
    private Long blogId;

    @NotBlank
    @Size(max = 50)
    private String name;

    @Nullable
    @Size(max = 100)
    private String description;

    @NotNull
    private BlogManagersVisibilityLevel blogManagersVisibilityLevel;

    @NotNull
    private BlogPostPublisherType defaultPublisherType;
}