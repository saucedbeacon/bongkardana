package com.iap.ac.android.s;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.RegionCodeQueryRpcRequest;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.RegionCodeQueryRpcResult;

public class c extends BaseNetwork<a> {

    public class a implements BaseNetwork.a<a, RegionCodeQueryRpcResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RegionCodeQueryRpcRequest f11067a;

        public a(c cVar, RegionCodeQueryRpcRequest regionCodeQueryRpcRequest) {
            this.f11067a = regionCodeQueryRpcRequest;
        }

        public Object a(Object obj) {
            return ((a) obj).a(this.f11067a);
        }
    }

    public RegionCodeQueryRpcResult a(@NonNull String str) throws Exception {
        RegionCodeQueryRpcRequest regionCodeQueryRpcRequest = new RegionCodeQueryRpcRequest();
        regionCodeQueryRpcRequest.locale = str;
        return (RegionCodeQueryRpcResult) wrapper(new a(this, regionCodeQueryRpcRequest));
    }

    public Class<a> getFacadeClass() {
        return a.class;
    }
}
