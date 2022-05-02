package com.iap.ac.android.biz.common.model.multilanguage.querycity;

import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.List;

public class CityQueryRpcResult extends BaseRpcResult {
    public List<CountryRegion> countryWithCities = new ArrayList();
}
