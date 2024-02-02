package org.blog.domain.test.controller.dto.response;

import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.blog.domain.test.repository.entity.TestEntity;
import org.blog.domain.test.service.dto.TestDto;

@Getter
@Builder
@AllArgsConstructor
public class TestReadResponse {

    private final Long id;
    private final String contents;

    public static TestReadResponse from(TestEntity entity) {
        return TestReadResponse.builder()
            .id(entity.getId())
            .contents(entity.getContents())
            .build();
    }
}
