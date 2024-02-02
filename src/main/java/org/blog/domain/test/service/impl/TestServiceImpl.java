package org.blog.domain.test.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.blog.domain.test.controller.dto.response.TestCreateResponse;
import org.blog.domain.test.controller.dto.response.TestReadResponse;
import org.blog.domain.test.repository.TestRepository;
import org.blog.domain.test.repository.entity.TestEntity;
import org.blog.domain.test.service.TestService;
import org.blog.domain.test.service.dto.TestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    @Transactional
    public TestCreateResponse create(TestDto testDto) {
        TestEntity testEntity = testRepository.save(testDto.toEntity());
        return TestCreateResponse.from(testEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TestReadResponse> findTestsByContents(String contents) {
        return testRepository.findByContents(contents).stream()
                .map(TestReadResponse::from)
                .collect(Collectors.toList());
    }
}
