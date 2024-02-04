package org.blog.domain.board.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.blog.domain.board.repository.entity.BoardEntity;
import org.blog.domain.member.repository.entity.MemberEntity;

@Getter
@AllArgsConstructor
public class BoardDto {

    private final String title;
    private final String content;
    private final String writer;
//    private final Long view;

    public BoardEntity toEntity() {
        return BoardEntity.builder()
            .title(title)
            .content(content)
            .writer(writer)
            .view(0L)
            .build();
    }
}
