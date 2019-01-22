package com.hongghe.client.message;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-22 16:31
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class GreetingResponse {
    private String key;
    private String message;
}
