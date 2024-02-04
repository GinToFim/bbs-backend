package org.blog.domain.board.repository;

import org.blog.domain.board.repository.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
