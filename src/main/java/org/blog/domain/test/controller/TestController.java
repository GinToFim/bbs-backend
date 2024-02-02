package org.blog.domain.test.controller;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.blog.base.exception.BaseException;
import org.blog.base.exception.BaseExceptionType;
import org.blog.domain.test.controller.dto.request.TestCreateRequest;
import org.blog.domain.test.controller.dto.response.TestCreateResponse;
import org.blog.domain.test.controller.dto.response.TestReadResponse;
import org.blog.domain.test.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public ResponseEntity<List<TestReadResponse>> readTest(@RequestParam String contents) {
        List<TestReadResponse> readTestResponses = testService.findTestsByContents(contents);
        return ResponseEntity.ok(readTestResponses);
    }

    @PostMapping
    public ResponseEntity<TestCreateResponse> createTest(
        @RequestBody @Valid TestCreateRequest testCreateRequest) {
            TestCreateResponse testCreateResponse = testService.create(testCreateRequest.toDto());
            return ResponseEntity.created(URI.create("/tests" + testCreateResponse.getId()))
                .body(testCreateResponse);
    }

    @GetMapping("/error")
    public void testError() { throw new BaseException(BaseExceptionType.TEST_FAIL); }
}
