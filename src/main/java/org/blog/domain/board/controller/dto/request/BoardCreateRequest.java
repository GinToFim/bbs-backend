package org.blog.domain.board.controller.dto.request;

import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.blog.domain.board.service.dto.BoardDto;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class BoardCreateRequest {

//    @NotNull(message = "내용이 입력되지 않았습니다.")
    private String title;

    private String content;

    private String writer;

    public BoardDto toDto() {
        return new BoardDto(title, content, writer);
    }
}
