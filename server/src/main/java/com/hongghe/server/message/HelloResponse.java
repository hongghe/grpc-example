package com.hongghe.server.message;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-22 16:35
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class HelloResponse {
    private String key;
    private String message;
}
