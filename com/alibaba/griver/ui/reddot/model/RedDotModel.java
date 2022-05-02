package com.alibaba.griver.ui.reddot.model;

import com.alibaba.griver.ui.reddot.OnStateChangeListener;
import java.util.HashSet;
import java.util.Set;

public class RedDotModel {

    /* renamed from: a  reason: collision with root package name */
    private String f10611a;
    private Set<String> b = new HashSet();
    private boolean c;
    private OnStateChangeListener d;

    public boolean isShow() {
        return this.c;
    }

    public void setShow(boolean z) {
        this.c = z;
    }

    public String getRedDotParentModelKey() {
        return this.f10611a;
    }

    public void setRedDotParentModelKey(String str) {
        this.f10611a = str;
    }

    public void addChild(String str) {
        this.b.add(str);
    }

    public boolean removeChild(String str) {
        return this.b.remove(str);
    }

    public int childSize() {
        return this.b.size();
    }

    public Set<String> getChildren() {
        return this.b;
    }

    public OnStateChangeListener getListener() {
        return this.d;
    }

    public void setListener(OnStateChangeListener onStateChangeListener) {
        this.d = onStateChangeListener;
    }
}
