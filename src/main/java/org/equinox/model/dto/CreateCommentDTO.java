package org.equinox.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCommentDTO {
    @NotNull
    private Long blogPostId;

    private Long rootCommentId;
    private Long referredCommentId;

    @NotBlank
    @Size(max = 3500)
    private String content;
}
