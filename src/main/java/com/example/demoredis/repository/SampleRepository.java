package com.example.demoredis.repository;

import com.example.demoredis.entity.SampleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends CrudRepository<SampleEntity, String> {
}
