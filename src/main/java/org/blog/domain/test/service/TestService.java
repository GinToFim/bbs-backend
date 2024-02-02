package org.blog.domain.test.service;

import java.util.List;
import org.blog.domain.test.controller.dto.response.TestCreateResponse;
import org.blog.domain.test.controller.dto.response.TestReadResponse;
import org.blog.domain.test.service.dto.TestDto;

public interface TestService {

    TestCreateResponse create(TestDto testDto);

    List<TestReadResponse> findTestsByContents(String contents);
}
