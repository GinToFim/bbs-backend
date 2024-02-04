package org.blog.domain.board.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.blog.domain.board.controller.dto.response.BoardReadResponse;
import org.blog.domain.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public ResponseEntity<List<BoardReadResponse>> readBoards() {
        List<BoardReadResponse> readBoardResponses = boardService.findAllBoards();

        return ResponseEntity.ok(readBoardResponses);
    }


}
