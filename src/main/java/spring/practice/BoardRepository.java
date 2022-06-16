package spring.practice;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.practice.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
