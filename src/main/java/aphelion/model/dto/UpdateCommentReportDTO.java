package aphelion.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCommentReportDTO {
    private Long id;
    @NotNull
    private String status;
}
