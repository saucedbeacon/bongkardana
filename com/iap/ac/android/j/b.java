package com.iap.ac.android.j;

import com.iap.ac.android.common.account.OAuthService;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9721a;

    public b(c cVar) {
        this.f9721a = cVar;
    }

    public void run() {
        this.f9721a.d.a();
        this.f9721a.a();
        OAuthService.INSTANCE.authLogout();
    }
}
