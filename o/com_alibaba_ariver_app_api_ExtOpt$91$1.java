package o;

import java.util.ArrayList;
import java.util.List;
import o.GriverRVTransortServiceImpl;

public class com_alibaba_ariver_app_api_ExtOpt$91$1 extends setSpeed<List<com_alibaba_ariver_app_api_ExtOpt$98$1>, List<GriverRVTransortServiceImpl.AnonymousClass1>> {
    public GriverRVTransortServiceImpl.AnonymousClass1 transform(com_alibaba_ariver_app_api_ExtOpt$98$1 com_alibaba_ariver_app_api_extopt_98_1) {
        if (com_alibaba_ariver_app_api_extopt_98_1 == null) {
            return null;
        }
        GriverRVTransortServiceImpl.AnonymousClass1 r0 = new Object() {

            /* renamed from: id  reason: collision with root package name */
            private String f9912id;
            private String name;

            public String getName() {
                return this.name;
            }

            public void setName(String str) {
                this.name = str;
            }

            public String getId() {
                return this.f9912id;
            }

            public void setId(String str) {
                this.f9912id = str;
            }
        };
        r0.setId(com_alibaba_ariver_app_api_extopt_98_1.f9900id);
        r0.setName(com_alibaba_ariver_app_api_extopt_98_1.name);
        return r0;
    }

    /* access modifiers changed from: protected */
    public List<GriverRVTransortServiceImpl.AnonymousClass1> map(List<com_alibaba_ariver_app_api_ExtOpt$98$1> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (com_alibaba_ariver_app_api_ExtOpt$98$1 transform : list) {
            arrayList.add(transform(transform));
        }
        return arrayList;
    }
}
