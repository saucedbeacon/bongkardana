package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import javax.inject.Inject;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

class CreationContextFactory {
    private final Context applicationContext;
    private final Clock monotonicClock;
    private final Clock wallClock;

    @Inject
    CreationContextFactory(Context context, @WallTime Clock clock, @Monotonic Clock clock2) {
        this.applicationContext = context;
        this.wallClock = clock;
        this.monotonicClock = clock2;
    }

    /* access modifiers changed from: package-private */
    public CreationContext create(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1314366083, oncanceled);
            onCancelLoad.getMin(-1314366083, oncanceled);
        }
        return CreationContext.create(this.applicationContext, this.wallClock, this.monotonicClock, str);
    }
}
