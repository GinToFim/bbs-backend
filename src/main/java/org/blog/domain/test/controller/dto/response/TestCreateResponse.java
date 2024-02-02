package org.blog.domain.test.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.blog.domain.test.repository.entity.TestEntity;

@Getter
@AllArgsConstructor
public class TestCreateResponse {

    private final Long id;

    public static TestCreateResponse from(TestEntity entity) {
        return new TestCreateResponse(entity.getId());
    }
}
