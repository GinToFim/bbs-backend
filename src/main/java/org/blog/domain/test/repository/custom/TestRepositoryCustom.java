package org.blog.domain.test.repository.custom;

import java.util.List;
import org.blog.domain.test.repository.entity.TestEntity;

public interface TestRepositoryCustom {

    List<TestEntity> findByContents(String contents);
}

