package o;

import o.b;

public final class getJsapiList implements getAdapterPosition<getSpecialConfigs> {
    private final b.C0007b<setNativeApiScopeConfig> length;
    private final b.C0007b<setJsapiList> setMin;

    private getJsapiList(b.C0007b<setNativeApiScopeConfig> bVar, b.C0007b<setJsapiList> bVar2) {
        this.length = bVar;
        this.setMin = bVar2;
    }

    public static getJsapiList setMin(b.C0007b<setNativeApiScopeConfig> bVar, b.C0007b<setJsapiList> bVar2) {
        return new getJsapiList(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new getSpecialConfigs(this.length.get(), this.setMin.get());
    }
}
