package com.google.android.play.core.assetpacks;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final /* synthetic */ class ba implements az {

    /* renamed from: a  reason: collision with root package name */
    static final az f10855a = new ba();

    private ba() {
    }

    public final int a(int i, String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1403955610, oncanceled);
            onCancelLoad.getMin(1403955610, oncanceled);
        }
        return i;
    }
}
