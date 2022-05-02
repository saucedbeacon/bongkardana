package com.github.mikephil.charting.data;

import o.getEmojiReplaceStrategy;

public final class PieDataSet extends DataSet<PieEntry> implements getEmojiReplaceStrategy {
    private ValuePosition ICustomTabsCallback;
    private int b;
    private ValuePosition create;
    private float extraCallback;
    private boolean extraCallbackWithResult;
    private boolean getCause;
    private float length;
    private float onMessageChannelReady;
    private float onNavigationEvent;
    private float onPostMessage;
    private float onRelationshipValidationResult;
    private boolean valueOf;

    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void length(Entry entry) {
        PieEntry pieEntry = (PieEntry) entry;
        if (pieEntry != null) {
            setMin(pieEntry);
        }
    }

    public final float getMin() {
        return this.length;
    }

    public final boolean extraCallback() {
        return this.valueOf;
    }

    public final float ICustomTabsCallback$Stub() {
        return this.onNavigationEvent;
    }

    public final ValuePosition onTransact() {
        return this.create;
    }

    public final ValuePosition ICustomTabsCallback$Default() {
        return this.ICustomTabsCallback;
    }

    public final boolean asBinder() {
        return this.getCause;
    }

    public final int asInterface() {
        return this.b;
    }

    public final float ICustomTabsCallback$Stub$Proxy() {
        return this.onRelationshipValidationResult;
    }

    public final float setDefaultImpl() {
        return this.extraCallback;
    }

    public final float getDefaultImpl() {
        return this.onPostMessage;
    }

    public final float ICustomTabsService() {
        return this.onMessageChannelReady;
    }

    public final boolean getInterfaceDescriptor() {
        return this.extraCallbackWithResult;
    }
}
