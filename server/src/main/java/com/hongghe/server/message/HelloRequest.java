package com.hongghe.server.message;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-22 16:34
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class HelloRequest {
    private String key;
    private String message;
}
