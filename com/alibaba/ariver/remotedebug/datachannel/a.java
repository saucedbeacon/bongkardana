package com.alibaba.ariver.remotedebug.datachannel;

import com.alibaba.ariver.remotedebug.datachannel.DataChannel;

public abstract class a implements DataChannel {

    /* renamed from: a  reason: collision with root package name */
    private DataChannel.DataStatusChangedListener f10144a;
    private String b;

    public a(String str, DataChannel.DataStatusChangedListener dataStatusChangedListener) {
        this.f10144a = dataStatusChangedListener;
        this.b = str;
    }

    public DataChannel.DataStatusChangedListener a() {
        return this.f10144a;
    }

    public String b() {
        return this.b;
    }
}
