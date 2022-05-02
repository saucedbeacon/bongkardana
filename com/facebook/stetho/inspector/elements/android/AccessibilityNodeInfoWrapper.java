package com.facebook.stetho.inspector.elements.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.stetho.common.android.AccessibilityUtil;
import o.onSupportActionModeFinished;

public final class AccessibilityNodeInfoWrapper {
    public static onSupportActionModeFinished createNodeInfoFromView(View view) {
        onSupportActionModeFinished length = onSupportActionModeFinished.length();
        ViewCompat.setMin(view, length);
        return length;
    }

    public static boolean getIsAccessibilityFocused(View view) {
        onSupportActionModeFinished createNodeInfoFromView = createNodeInfoFromView(view);
        boolean FastBitmap$CoordinateSystem = createNodeInfoFromView.FastBitmap$CoordinateSystem();
        createNodeInfoFromView.ICustomTabsCallback();
        return FastBitmap$CoordinateSystem;
    }

    public static boolean getIgnored(View view) {
        int isInside = ViewCompat.isInside(view);
        if (isInside == 2 || isInside == 4) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (ViewCompat.isInside((View) parent) == 4) {
                return true;
            }
        }
        onSupportActionModeFinished createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.equals()) {
                return true;
            }
            if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                if (createNodeInfoFromView.getMax() <= 0) {
                    createNodeInfoFromView.ICustomTabsCallback();
                    return false;
                } else if (AccessibilityUtil.isSpeakingNode(createNodeInfoFromView, view)) {
                    createNodeInfoFromView.ICustomTabsCallback();
                    return false;
                } else {
                    createNodeInfoFromView.ICustomTabsCallback();
                    return true;
                }
            } else if (AccessibilityUtil.hasFocusableAncestor(createNodeInfoFromView, view) || !AccessibilityUtil.hasText(createNodeInfoFromView)) {
                createNodeInfoFromView.ICustomTabsCallback();
                return true;
            } else {
                createNodeInfoFromView.ICustomTabsCallback();
                return false;
            }
        } finally {
            createNodeInfoFromView.ICustomTabsCallback();
        }
    }

    public static String getIgnoredReasons(View view) {
        int isInside = ViewCompat.isInside(view);
        if (isInside == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (isInside == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (ViewCompat.isInside((View) parent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        onSupportActionModeFinished createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.equals()) {
                return "View is not visible.";
            }
            if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                createNodeInfoFromView.ICustomTabsCallback();
                return "View is actionable, but has no description.";
            } else if (AccessibilityUtil.hasText(createNodeInfoFromView)) {
                createNodeInfoFromView.ICustomTabsCallback();
                return "View is not actionable, and an ancestor View has co-opted its description.";
            } else {
                createNodeInfoFromView.ICustomTabsCallback();
                return "View is not actionable and has no description.";
            }
        } finally {
            createNodeInfoFromView.ICustomTabsCallback();
        }
    }

    @Nullable
    public static String getFocusableReasons(View view) {
        onSupportActionModeFinished createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            boolean hasText = AccessibilityUtil.hasText(createNodeInfoFromView);
            boolean IsOverlapping = createNodeInfoFromView.IsOverlapping();
            boolean hasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(createNodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(createNodeInfoFromView)) {
                if (createNodeInfoFromView.getMax() <= 0) {
                    return "View is actionable and has no children.";
                }
                if (hasText) {
                    createNodeInfoFromView.ICustomTabsCallback();
                    return "View is actionable and has a description.";
                } else if (IsOverlapping) {
                    createNodeInfoFromView.ICustomTabsCallback();
                    return "View is actionable and checkable.";
                } else if (hasNonActionableSpeakingDescendants) {
                    createNodeInfoFromView.ICustomTabsCallback();
                    return "View is actionable and has non-actionable descendants with descriptions.";
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(createNodeInfoFromView, view)) {
                if (hasText) {
                    createNodeInfoFromView.ICustomTabsCallback();
                    return "View is a direct child of a scrollable container and has a description.";
                } else if (IsOverlapping) {
                    createNodeInfoFromView.ICustomTabsCallback();
                    return "View is a direct child of a scrollable container and is checkable.";
                } else if (hasNonActionableSpeakingDescendants) {
                    createNodeInfoFromView.ICustomTabsCallback();
                    return "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                }
            }
            if (hasText) {
                createNodeInfoFromView.ICustomTabsCallback();
                return "View has a description and is not actionable, but has no actionable ancestor.";
            }
            createNodeInfoFromView.ICustomTabsCallback();
            return null;
        } finally {
            createNodeInfoFromView.ICustomTabsCallback();
        }
    }

    @Nullable
    public static String getActions(View view) {
        onSupportActionModeFinished createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            StringBuilder sb = new StringBuilder();
            for (onSupportActionModeFinished.setMax next : createNodeInfoFromView.onMessageChannelReady()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                int length = next.length();
                if (length == 1) {
                    sb.append("focus");
                } else if (length != 2) {
                    switch (length) {
                        case 4:
                            sb.append("select");
                            break;
                        case 8:
                            sb.append("clear-selection");
                            break;
                        case 16:
                            sb.append("click");
                            break;
                        case 32:
                            sb.append("long-click");
                            break;
                        case 64:
                            sb.append("accessibility-focus");
                            break;
                        case 128:
                            sb.append("clear-accessibility-focus");
                            break;
                        case 256:
                            sb.append("next-at-movement-granularity");
                            break;
                        case 512:
                            sb.append("previous-at-movement-granularity");
                            break;
                        case 1024:
                            sb.append("next-html-element");
                            break;
                        case 2048:
                            sb.append("previous-html-element");
                            break;
                        case 4096:
                            sb.append("scroll-forward");
                            break;
                        case 8192:
                            sb.append("scroll-backward");
                            break;
                        case 16384:
                            sb.append("copy");
                            break;
                        case 32768:
                            sb.append("paste");
                            break;
                        case 65536:
                            sb.append("cut");
                            break;
                        case 131072:
                            sb.append("set-selection");
                            break;
                        default:
                            CharSequence max = next.getMax();
                            if (max == null) {
                                sb.append("unknown");
                                break;
                            } else {
                                sb.append(max);
                                break;
                            }
                    }
                } else {
                    sb.append("clear-focus");
                }
            }
            return sb.length() > 0 ? sb.toString() : null;
        } finally {
            createNodeInfoFromView.ICustomTabsCallback();
        }
    }

    @Nullable
    public static CharSequence getDescription(View view) {
        onSupportActionModeFinished createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            CharSequence create = createNodeInfoFromView.create();
            CharSequence b = createNodeInfoFromView.b();
            boolean z = !TextUtils.isEmpty(b);
            boolean z2 = view instanceof EditText;
            if (!TextUtils.isEmpty(create) && (!z2 || !z)) {
                return create;
            }
            if (z) {
                createNodeInfoFromView.ICustomTabsCallback();
                return b;
            }
            String str = null;
            if (view instanceof ViewGroup) {
                StringBuilder sb = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    onSupportActionModeFinished length = onSupportActionModeFinished.length();
                    ViewCompat.setMin(childAt, length);
                    CharSequence description = (!AccessibilityUtil.isSpeakingNode(length, childAt) || AccessibilityUtil.isAccessibilityFocusable(length, childAt)) ? null : getDescription(childAt);
                    if (!TextUtils.isEmpty(description)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(description);
                    }
                    length.ICustomTabsCallback();
                }
                if (sb.length() > 0) {
                    str = sb.toString();
                }
                createNodeInfoFromView.ICustomTabsCallback();
                return str;
            }
            createNodeInfoFromView.ICustomTabsCallback();
            return null;
        } finally {
            createNodeInfoFromView.ICustomTabsCallback();
        }
    }
}
