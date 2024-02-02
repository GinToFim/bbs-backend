package org.blog.domain.test.controller.dto.request;

import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.blog.domain.test.service.dto.TestDto;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class TestCreateRequest {

    @NotNull(message = "내용이 입력되지 않았습니다.")
    private String contents;

    public TestDto toDto() {
        return new TestDto(contents);
    }
}
