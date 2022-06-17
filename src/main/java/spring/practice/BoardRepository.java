package spring.practice;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.practice.domain.Board;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByTitleContaining(String keyword);
}
