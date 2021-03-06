package aphelion.repository;

import aphelion.model.domain.Comment;
import aphelion.model.domain.CommentReport;
import aphelion.model.domain.ReportStatus;
import aphelion.model.domain.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentReportRepository extends JpaRepository<CommentReport, Long>{
    Optional<CommentReport> findById(Long id);
    CommentReport save(CommentReport commentReport);
    void delete(CommentReport commentReport);
    List<CommentReport> findAllBy(Pageable pageable);
    List<CommentReport> findByComment(Comment comment, Pageable pageable);
    List<CommentReport> findByCommentAuthor(User user, Pageable pageable);
    List<CommentReport> findByStatus(ReportStatus status, Pageable pageable);
}
