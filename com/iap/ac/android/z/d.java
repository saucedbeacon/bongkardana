package com.iap.ac.android.z;

import com.iap.ac.android.gol.model.SignContractBizContent;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SignContractBizContent f9784a;
    public final /* synthetic */ e b;

    public d(e eVar, SignContractBizContent signContractBizContent) {
        this.b = eVar;
        this.f9784a = signContractBizContent;
    }

    public void run() {
        this.b.a(this.f9784a);
    }
}
