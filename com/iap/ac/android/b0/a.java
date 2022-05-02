package com.iap.ac.android.b0;

import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.container.js.ContainerBridgeContext;
import com.iap.ac.android.mpm.biz.base.EntranceType;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final EntranceType f9675a;
    public IContainerPresenter b;
    public ContainerBridgeContext c;

    public a(EntranceType entranceType, IContainerPresenter iContainerPresenter) {
        this.f9675a = entranceType;
        this.b = iContainerPresenter;
    }

    public a(EntranceType entranceType, IContainerPresenter iContainerPresenter, ContainerBridgeContext containerBridgeContext) {
        this.f9675a = entranceType;
        this.b = iContainerPresenter;
        this.c = containerBridgeContext;
    }
}
