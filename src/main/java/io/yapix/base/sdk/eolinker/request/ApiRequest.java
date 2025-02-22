package io.yapix.base.sdk.eolinker.request;

import lombok.Data;

@Data
public class ApiRequest {

    /**
     * ID
     */
    private Long apiID;

    /**
     * 项目标识
     */
    private String projectHashKey;

    /**
     * 空间标识
     */
    private String spaceKey;

}
