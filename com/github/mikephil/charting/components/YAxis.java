package com.github.mikephil.charting.components;

import android.graphics.Paint;
import o.getDrawerLockMode;
import o.getTargetFragment;

public class YAxis extends getDrawerLockMode {
    protected float ICustomTabsCallback$Stub$Proxy;
    protected int ICustomTabsService;
    public YAxisLabelPosition extraCommand;
    public boolean getDefaultImpl;
    protected boolean getInterfaceDescriptor;
    protected float mayLaunchUrl;
    protected float newSession;
    public AxisDependency newSessionWithExtras;
    private boolean postMessage;
    private boolean requestPostMessageChannel;
    protected float requestPostMessageChannelWithExtras;
    protected boolean setDefaultImpl;
    private boolean validateRelationship;
    protected float warmup;

    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis() {
        this.postMessage = true;
        this.getDefaultImpl = true;
        this.setDefaultImpl = false;
        this.getInterfaceDescriptor = false;
        this.requestPostMessageChannel = false;
        this.validateRelationship = false;
        this.ICustomTabsService = -7829368;
        this.ICustomTabsCallback$Stub$Proxy = 1.0f;
        this.warmup = 10.0f;
        this.mayLaunchUrl = 10.0f;
        this.extraCommand = YAxisLabelPosition.OUTSIDE_CHART;
        this.newSession = 0.0f;
        this.requestPostMessageChannelWithExtras = Float.POSITIVE_INFINITY;
        this.newSessionWithExtras = AxisDependency.LEFT;
        this.ICustomTabsCallback$Default = 0.0f;
    }

    public YAxis(AxisDependency axisDependency) {
        this.postMessage = true;
        this.getDefaultImpl = true;
        this.setDefaultImpl = false;
        this.getInterfaceDescriptor = false;
        this.requestPostMessageChannel = false;
        this.validateRelationship = false;
        this.ICustomTabsService = -7829368;
        this.ICustomTabsCallback$Stub$Proxy = 1.0f;
        this.warmup = 10.0f;
        this.mayLaunchUrl = 10.0f;
        this.extraCommand = YAxisLabelPosition.OUTSIDE_CHART;
        this.newSession = 0.0f;
        this.requestPostMessageChannelWithExtras = Float.POSITIVE_INFINITY;
        this.newSessionWithExtras = axisDependency;
        this.ICustomTabsCallback$Default = 0.0f;
    }

    public final boolean b() {
        return this.getDefaultImpl;
    }

    public final boolean onRelationshipValidationResult() {
        return this.postMessage;
    }

    public final boolean extraCallbackWithResult() {
        return this.setDefaultImpl;
    }

    public final boolean onPostMessage() {
        return this.getInterfaceDescriptor;
    }

    public final void onMessageChannelReady() {
        this.getInterfaceDescriptor = false;
    }

    public final int extraCallback() {
        return this.ICustomTabsService;
    }

    public final float ICustomTabsCallback$Stub() {
        return this.ICustomTabsCallback$Stub$Proxy;
    }

    public final float getMin(Paint paint) {
        paint.setTextSize(this.ICustomTabsCallback$Stub);
        float min = ((float) getTargetFragment.getMin(paint, values())) + (invokeSuspend() * 2.0f);
        float f = this.newSession;
        float f2 = this.requestPostMessageChannelWithExtras;
        if (f > 0.0f) {
            f = getTargetFragment.setMax(f);
        }
        if (f2 > 0.0f && f2 != Float.POSITIVE_INFINITY) {
            f2 = getTargetFragment.setMax(f2);
        }
        if (((double) f2) <= 0.0d) {
            f2 = min;
        }
        return Math.max(f, Math.min(min, f2));
    }

    public final float setMin(Paint paint) {
        paint.setTextSize(this.ICustomTabsCallback$Stub);
        return ((float) getTargetFragment.setMax(paint, values())) + (Mean$Arithmetic() * 2.0f);
    }

    public final boolean onTransact() {
        return create() && length() && this.extraCommand == YAxisLabelPosition.OUTSIDE_CHART;
    }

    public final void setMax(float f, float f2) {
        float f3;
        float f4;
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float abs = Math.abs(f2 - f);
        if (this.b) {
            f3 = this.onPostMessage;
        } else {
            f3 = f - ((abs / 100.0f) * this.mayLaunchUrl);
        }
        this.onPostMessage = f3;
        if (this.extraCallback) {
            f4 = this.onMessageChannelReady;
        } else {
            f4 = f2 + ((abs / 100.0f) * this.warmup);
        }
        this.onMessageChannelReady = f4;
        this.extraCallbackWithResult = Math.abs(this.onPostMessage - this.onMessageChannelReady);
    }
}
