package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import java.util.ArrayList;
import java.util.List;

public class BridgeDSLRegistry {

    /* renamed from: a  reason: collision with root package name */
    private List<BridgeDSL> f9013a;

    public void register(List<BridgeDSL> list) {
        if (this.f9013a == null) {
            this.f9013a = new ArrayList();
        }
        this.f9013a.addAll(list);
    }

    public void unRegister(BridgeDSL bridgeDSL) {
        List<BridgeDSL> list = this.f9013a;
        if (list != null) {
            list.remove(bridgeDSL);
        }
    }

    public List<BridgeDSL> getBridgeDSLs() {
        List<BridgeDSL> list = this.f9013a;
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }
}
