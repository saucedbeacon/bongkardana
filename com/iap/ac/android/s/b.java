package com.iap.ac.android.s;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CityQueryRpcRequest;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CityQueryRpcResult;
import java.util.List;

public class b extends BaseNetwork<a> {

    public class a implements BaseNetwork.a<a, CityQueryRpcResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CityQueryRpcRequest f11066a;

        public a(CityQueryRpcRequest cityQueryRpcRequest) {
            this.f11066a = cityQueryRpcRequest;
        }

        public Object a(Object obj) {
            return ((a) b.this.getFacade()).a(this.f11066a);
        }
    }

    public CityQueryRpcResult a(@NonNull String str, @NonNull List<String> list) throws Exception {
        CityQueryRpcRequest cityQueryRpcRequest = new CityQueryRpcRequest();
        cityQueryRpcRequest.locale = str;
        cityQueryRpcRequest.regionList = list;
        return (CityQueryRpcResult) wrapper(new a(cityQueryRpcRequest));
    }

    public Class<a> getFacadeClass() {
        return a.class;
    }
}
