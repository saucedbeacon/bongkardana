package com.facebook.stetho.common.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.List;
import o.onSupportActionModeFinished;

public final class AccessibilityUtil {
    private AccessibilityUtil() {
    }

    public static boolean hasText(@Nullable onSupportActionModeFinished onsupportactionmodefinished) {
        if (onsupportactionmodefinished == null) {
            return false;
        }
        return !TextUtils.isEmpty(onsupportactionmodefinished.b()) || !TextUtils.isEmpty(onsupportactionmodefinished.create());
    }

    public static boolean isSpeakingNode(@Nullable onSupportActionModeFinished onsupportactionmodefinished, @Nullable View view) {
        int isInside;
        if (onsupportactionmodefinished == null || view == null || !onsupportactionmodefinished.equals() || (isInside = ViewCompat.isInside(view)) == 4 || (isInside == 2 && onsupportactionmodefinished.getMax() <= 0)) {
            return false;
        }
        if (onsupportactionmodefinished.IsOverlapping() || hasText(onsupportactionmodefinished) || hasNonActionableSpeakingDescendants(onsupportactionmodefinished, view)) {
            return true;
        }
        return false;
    }

    public static boolean hasNonActionableSpeakingDescendants(@Nullable onSupportActionModeFinished onsupportactionmodefinished, @Nullable View view) {
        if (!(onsupportactionmodefinished == null || view == null || !(view instanceof ViewGroup))) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    onSupportActionModeFinished length = onSupportActionModeFinished.length();
                    try {
                        ViewCompat.setMin(childAt, length);
                        if (!isAccessibilityFocusable(length, childAt)) {
                            if (isSpeakingNode(length, childAt)) {
                                length.ICustomTabsCallback();
                                return true;
                            }
                        }
                    } finally {
                        length.ICustomTabsCallback();
                    }
                }
            }
        }
        return false;
    }

    public static boolean isAccessibilityFocusable(@Nullable onSupportActionModeFinished onsupportactionmodefinished, @Nullable View view) {
        if (onsupportactionmodefinished == null || view == null || !onsupportactionmodefinished.equals()) {
            return false;
        }
        if (isActionableForAccessibility(onsupportactionmodefinished)) {
            return true;
        }
        if (!isTopLevelScrollItem(onsupportactionmodefinished, view) || !isSpeakingNode(onsupportactionmodefinished, view)) {
            return false;
        }
        return true;
    }

    public static boolean isTopLevelScrollItem(@Nullable onSupportActionModeFinished onsupportactionmodefinished, @Nullable View view) {
        View view2;
        if (onsupportactionmodefinished == null || view == null || (view2 = (View) ViewCompat.toIntRange(view)) == null) {
            return false;
        }
        if (onsupportactionmodefinished.Mean$Arithmetic()) {
            return true;
        }
        List<onSupportActionModeFinished.setMax> onMessageChannelReady = onsupportactionmodefinished.onMessageChannelReady();
        if (!onMessageChannelReady.contains(4096) && !onMessageChannelReady.contains(8192)) {
            if (view2 instanceof Spinner) {
                return false;
            }
            if ((view2 instanceof AdapterView) || (view2 instanceof ScrollView) || (view2 instanceof HorizontalScrollView)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean isActionableForAccessibility(@Nullable onSupportActionModeFinished onsupportactionmodefinished) {
        if (onsupportactionmodefinished == null) {
            return false;
        }
        if (!onsupportactionmodefinished.values() && !onsupportactionmodefinished.invoke() && !onsupportactionmodefinished.isInside()) {
            List<onSupportActionModeFinished.setMax> onMessageChannelReady = onsupportactionmodefinished.onMessageChannelReady();
            return onMessageChannelReady.contains(16) || onMessageChannelReady.contains(32) || onMessageChannelReady.contains(1);
        }
    }

    public static boolean hasFocusableAncestor(@Nullable onSupportActionModeFinished onsupportactionmodefinished, @Nullable View view) {
        if (onsupportactionmodefinished == null || view == null) {
            return false;
        }
        ViewParent intRange = ViewCompat.toIntRange(view);
        if (!(intRange instanceof View)) {
            return false;
        }
        onSupportActionModeFinished length = onSupportActionModeFinished.length();
        try {
            ViewCompat.setMin((View) intRange, length);
            if (length == null) {
                return false;
            }
            if (isAccessibilityFocusable(length, (View) intRange)) {
                length.ICustomTabsCallback();
                return true;
            } else if (hasFocusableAncestor(length, (View) intRange)) {
                length.ICustomTabsCallback();
                return true;
            } else {
                length.ICustomTabsCallback();
                return false;
            }
        } finally {
            length.ICustomTabsCallback();
        }
    }
}
