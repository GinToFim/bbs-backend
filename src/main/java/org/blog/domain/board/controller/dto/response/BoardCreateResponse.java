package org.blog.domain.board.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.blog.domain.board.repository.entity.BoardEntity;

@Getter
@AllArgsConstructor
public class BoardCreateResponse {

    private final Long id;

    public static BoardCreateResponse from(BoardEntity entity) {
        return new BoardCreateResponse(entity.getId());
    }
}
