package com.iap.ac.android.biz.common.model.multilanguage.queryregioncode;

import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.List;

public class RegionCodeQueryRpcResult extends BaseRpcResult {
    public List<RegionsGroupByInitial> regionsGroupByInitials = new ArrayList();
}
