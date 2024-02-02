package org.blog.domain.test.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.blog.domain.test.repository.entity.TestEntity;

@Getter
@AllArgsConstructor
public class TestDto {

    private final String contents;

    public TestEntity toEntity(){
        return TestEntity.builder()
            .contents(contents)
            .build();
    }
}
