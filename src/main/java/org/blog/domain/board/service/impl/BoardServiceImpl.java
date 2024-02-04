package org.blog.domain.board.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.blog.domain.board.controller.dto.response.BoardCreateResponse;
import org.blog.domain.board.controller.dto.response.BoardReadResponse;
import org.blog.domain.board.repository.BoardRepository;
import org.blog.domain.board.repository.entity.BoardEntity;
import org.blog.domain.board.service.BoardService;
import org.blog.domain.board.service.dto.BoardDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    @Transactional
    public BoardCreateResponse create(BoardDto boardDto){
        BoardEntity boardEntity = boardRepository.save(boardDto.toEntity());
        return BoardCreateResponse.from(boardEntity);
    }

    @Override
    @Transactional
    public List<BoardReadResponse> findAllBoards() {
        return boardRepository.findAll().stream()
            .map(BoardReadResponse::from)
            .collect(Collectors.toList());
    }

}
