package com.facebook.litho.widget;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import o.setPositiveButtonIcon;

@ThreadSafe
public final class ComponentTreeHolder {
    private static final setPositiveButtonIcon.setMax<ComponentTreeHolder> setMax = new setPositiveButtonIcon.setMax<>(8);
    private static final AtomicInteger setMin = new AtomicInteger(1);
    private boolean IsOverlapping = true;
    private boolean equals = false;
    private final AtomicBoolean getMax = new AtomicBoolean(false);
    @GuardedBy("this")
    private int getMin = -1;
    @GuardedBy("this")
    private int length = -1;
    private final AtomicInteger toIntRange = new AtomicInteger(0);

    public @interface RenderState {
    }
}
