package com.iap.ac.android.biz.common.model.multilanguage.querycity;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;
import java.util.List;

public class CityQueryRpcRequest extends BaseRpcRequest {
    public String locale;
    public List<String> regionList;
}
