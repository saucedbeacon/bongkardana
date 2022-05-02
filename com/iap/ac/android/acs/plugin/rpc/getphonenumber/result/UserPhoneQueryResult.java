package com.iap.ac.android.acs.plugin.rpc.getphonenumber.result;

import com.iap.ac.android.acs.plugin.rpc.getphonenumber.model.MobilePhoneInfo;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.List;

public class UserPhoneQueryResult extends BaseRpcResult {
    public List<MobilePhoneInfo> mobilePhoneInfoList;
}
