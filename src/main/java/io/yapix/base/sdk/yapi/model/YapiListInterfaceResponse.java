package io.yapix.base.sdk.yapi.model;

import java.util.List;
import lombok.Data;

/**
 * 获取接口列表响应参数
 */
@Data
public class YapiListInterfaceResponse {

    private Integer count;

    private Integer total;

    private List<InterfaceVo> list;

}
