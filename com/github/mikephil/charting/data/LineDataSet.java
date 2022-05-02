package com.github.mikephil.charting.data;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import id.dana.savings.activity.SavingsActivity;
import java.util.ArrayList;
import java.util.List;
import o.closeDrawer;
import o.dispatchGenericMotionEvent;
import o.isContentView;
import o.setMaxEmojiCount;

public class LineDataSet extends isContentView<Entry> implements setMaxEmojiCount {
    private List<Integer> ICustomTabsCallback$Default = null;
    private dispatchGenericMotionEvent ICustomTabsCallback$Stub = new closeDrawer();
    private boolean ICustomTabsCallback$Stub$Proxy = true;
    private Mode asBinder = Mode.LINEAR;
    private DashPathEffect asInterface = null;
    public float b = 4.0f;
    public float create = 8.0f;
    public boolean onNavigationEvent = true;
    private float onTransact = 0.2f;
    public int valueOf = -1;

    public enum Mode {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public LineDataSet(List<Entry> list, String str) {
        super(list, str);
        if (this.ICustomTabsCallback$Default == null) {
            this.ICustomTabsCallback$Default = new ArrayList();
        }
        this.ICustomTabsCallback$Default.clear();
        this.ICustomTabsCallback$Default.add(Integer.valueOf(Color.rgb(SavingsActivity.RV_BENEFIT_WIDTH, 234, 255)));
    }

    public final Mode extraCallback() {
        return this.asBinder;
    }

    public final float asBinder() {
        return this.onTransact;
    }

    public final float ICustomTabsCallback$Stub() {
        return this.create;
    }

    public final float onTransact() {
        return this.b;
    }

    public final boolean ICustomTabsCallback$Default() {
        return this.asInterface != null;
    }

    public final DashPathEffect asInterface() {
        return this.asInterface;
    }

    public final boolean setDefaultImpl() {
        return this.onNavigationEvent;
    }

    public final int equals(int i) {
        return this.ICustomTabsCallback$Default.get(i).intValue();
    }

    public final int getDefaultImpl() {
        return this.ICustomTabsCallback$Default.size();
    }

    public final int ICustomTabsService() {
        return this.valueOf;
    }

    public final boolean ICustomTabsCallback$Stub$Proxy() {
        return this.ICustomTabsCallback$Stub$Proxy;
    }

    public final dispatchGenericMotionEvent getInterfaceDescriptor() {
        return this.ICustomTabsCallback$Stub;
    }

    public final void IsOverlapping(int i) {
        if (this.ICustomTabsCallback$Default == null) {
            this.ICustomTabsCallback$Default = new ArrayList();
        }
        this.ICustomTabsCallback$Default.clear();
        this.ICustomTabsCallback$Default.add(Integer.valueOf(i));
    }
}
