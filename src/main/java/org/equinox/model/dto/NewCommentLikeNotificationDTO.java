package org.equinox.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.equinox.model.domain.NotificationType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewCommentLikeNotificationDTO implements NotificationDTO {
    private Long id;
    private Long recipientId;
    private CommentLikeDTO commentLike;
    private CommentMinifiedDTO comment;
    private boolean read;
    private final NotificationType type = NotificationType.NEW_COMMENT_LIKE;
}
