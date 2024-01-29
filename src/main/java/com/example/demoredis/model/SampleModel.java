package com.example.demoredis.model;

import com.example.demoredis.entity.SampleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class SampleModel extends SampleEntity {
}
