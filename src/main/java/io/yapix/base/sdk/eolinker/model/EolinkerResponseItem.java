package io.yapix.base.sdk.eolinker.model;

import java.util.List;
import lombok.Data;

/**
 * @author chengliang
 * @date 2022/7/29 15:36
 */
@Data
public class EolinkerResponseItem {

    private Integer responseID;

    private final String responseCode = "200";

    private final String responseName = "成功";

    private final Integer responseType = 0;

    private final Integer paramJsonType = 0;

    private List<EolinkerProperty> paramList;

    private final String raw = "";

    private final String binary = "";

    private final Integer isDefault = 1;

    public EolinkerResponseItem(List<EolinkerProperty> paramList) {
        this.paramList = paramList;
    }

}
