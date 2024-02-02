package org.blog.domain.test.repository;

import org.blog.domain.test.repository.custom.TestRepositoryCustom;
import org.blog.domain.test.repository.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long>, TestRepositoryCustom {

}
