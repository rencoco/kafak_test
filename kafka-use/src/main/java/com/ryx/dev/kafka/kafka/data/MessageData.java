package com.ryx.dev.kafka.kafka.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class MessageData implements Serializable {

    private String id;
    private String name;
    private Integer age;
    private Long createTime;
    private Long uddateTime;
    private String operator;

}
