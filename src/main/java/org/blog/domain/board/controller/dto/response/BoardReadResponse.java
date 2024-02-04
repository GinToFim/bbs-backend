package org.blog.domain.board.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.blog.domain.board.repository.entity.BoardEntity;

@Getter
@Builder
@AllArgsConstructor
public class BoardReadResponse {

    private final Long id;
    private final String title;
    private final String content;
    private final String writer;
    private final Long view;

    public static BoardReadResponse from(BoardEntity entity) {
        return BoardReadResponse.builder()
            .id(entity.getId())
            .title(entity.getTitle())
            .content(entity.getContent())
            .writer(entity.getWriter())
            .view(entity.getView())
            .build();
    }
}
