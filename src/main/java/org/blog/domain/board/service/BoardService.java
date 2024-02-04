package org.blog.domain.board.service;

import java.util.List;
import org.blog.domain.board.controller.dto.response.BoardCreateResponse;
import org.blog.domain.board.controller.dto.response.BoardReadResponse;
import org.blog.domain.board.service.dto.BoardDto;

public interface BoardService {

    BoardCreateResponse create(BoardDto boardDto);

    List<BoardReadResponse> findAllBoards();
}
