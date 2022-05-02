package o;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;
import o.CheckResult;

public final class ColorLong {
    private static CheckResult.setMax setMin = new CheckResult.setMax();

    private static void getMin(ConstraintWidget constraintWidget, CheckResult.getMax getmax, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!(constraintWidget instanceof AnimRes) && constraintWidget.Grayscale$Algorithm() && getMin(constraintWidget)) {
            AnimRes.setMax(constraintWidget, getmax, new CheckResult.setMax(), CheckResult.setMax.getMax);
        }
        ConstraintAnchor max = constraintWidget.setMax(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor max2 = constraintWidget.setMax(ConstraintAnchor.Type.RIGHT);
        if (!max.setMin) {
            i = 0;
        } else {
            i = max.getMin;
        }
        if (!max2.setMin) {
            i2 = 0;
        } else {
            i2 = max2.getMin;
        }
        if (max.length != null && max.setMax()) {
            Iterator<ConstraintAnchor> it = max.length.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.setMax;
                boolean min = getMin(constraintWidget2);
                if (constraintWidget2.Grayscale$Algorithm() && min) {
                    AnimRes.setMax(constraintWidget2, getmax, new CheckResult.setMax(), CheckResult.setMax.getMax);
                }
                if (constraintWidget2.extraCommand[0] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || min) {
                    if (!constraintWidget2.Grayscale$Algorithm()) {
                        if (next == constraintWidget2.ICustomTabsCallback$Default && constraintWidget2.ICustomTabsCallback$Stub$Proxy.toIntRange == null) {
                            int min2 = constraintWidget2.ICustomTabsCallback$Default.getMin() + i;
                            if (constraintWidget2.areNotificationsEnabled == 8) {
                                i6 = 0;
                            } else {
                                i6 = constraintWidget2.requestPostMessageChannelWithExtras;
                            }
                            constraintWidget2.getMax(min2, i6 + min2);
                            getMin(constraintWidget2, getmax, z);
                        } else if (next == constraintWidget2.ICustomTabsCallback$Stub$Proxy && constraintWidget2.ICustomTabsCallback$Default.toIntRange == null) {
                            int min3 = i - constraintWidget2.ICustomTabsCallback$Stub$Proxy.getMin();
                            if (constraintWidget2.areNotificationsEnabled == 8) {
                                i5 = 0;
                            } else {
                                i5 = constraintWidget2.requestPostMessageChannelWithExtras;
                            }
                            constraintWidget2.getMax(min3 - i5, min3);
                            getMin(constraintWidget2, getmax, z);
                        } else if (next == constraintWidget2.ICustomTabsCallback$Default && constraintWidget2.ICustomTabsCallback$Stub$Proxy.toIntRange != null && constraintWidget2.ICustomTabsCallback$Stub$Proxy.toIntRange.setMax() && !constraintWidget2.extraCallback()) {
                            getMax(getmax, constraintWidget2, z);
                        }
                    }
                } else if (constraintWidget2.extraCommand[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.Grayscale$Algorithm >= 0 && constraintWidget2.invokeSuspend >= 0) {
                    if ((constraintWidget2.areNotificationsEnabled == 8 || (constraintWidget2.Mean$Arithmetic == 0 && constraintWidget2.updateVisuals == 0.0f)) && !constraintWidget2.extraCallback() && !constraintWidget2.FastBitmap$CoordinateSystem()) {
                        if (((next == constraintWidget2.ICustomTabsCallback$Default && constraintWidget2.ICustomTabsCallback$Stub$Proxy.toIntRange != null && constraintWidget2.ICustomTabsCallback$Stub$Proxy.toIntRange.setMax()) || (next == constraintWidget2.ICustomTabsCallback$Stub$Proxy && constraintWidget2.ICustomTabsCallback$Default.toIntRange != null && constraintWidget2.ICustomTabsCallback$Default.toIntRange.setMax())) && !constraintWidget2.extraCallback()) {
                            getMax(constraintWidget, getmax, constraintWidget2, z);
                        }
                    }
                }
            }
        }
        if (!(constraintWidget instanceof AnimatorRes) && max2.length != null && max2.setMax()) {
            Iterator<ConstraintAnchor> it2 = max2.length.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.setMax;
                boolean min4 = getMin(constraintWidget3);
                if (constraintWidget3.Grayscale$Algorithm() && min4) {
                    AnimRes.setMax(constraintWidget3, getmax, new CheckResult.setMax(), CheckResult.setMax.getMax);
                }
                boolean z2 = (next2 == constraintWidget3.ICustomTabsCallback$Default && constraintWidget3.ICustomTabsCallback$Stub$Proxy.toIntRange != null && constraintWidget3.ICustomTabsCallback$Stub$Proxy.toIntRange.setMax()) || (next2 == constraintWidget3.ICustomTabsCallback$Stub$Proxy && constraintWidget3.ICustomTabsCallback$Default.toIntRange != null && constraintWidget3.ICustomTabsCallback$Default.toIntRange.setMax());
                if (constraintWidget3.extraCommand[0] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || min4) {
                    if (!constraintWidget3.Grayscale$Algorithm()) {
                        if (next2 == constraintWidget3.ICustomTabsCallback$Default && constraintWidget3.ICustomTabsCallback$Stub$Proxy.toIntRange == null) {
                            int min5 = constraintWidget3.ICustomTabsCallback$Default.getMin() + i2;
                            if (constraintWidget3.areNotificationsEnabled == 8) {
                                i4 = 0;
                            } else {
                                i4 = constraintWidget3.requestPostMessageChannelWithExtras;
                            }
                            constraintWidget3.getMax(min5, i4 + min5);
                            getMin(constraintWidget3, getmax, z);
                        } else if (next2 == constraintWidget3.ICustomTabsCallback$Stub$Proxy && constraintWidget3.ICustomTabsCallback$Default.toIntRange == null) {
                            int min6 = i2 - constraintWidget3.ICustomTabsCallback$Stub$Proxy.getMin();
                            if (constraintWidget3.areNotificationsEnabled == 8) {
                                i3 = 0;
                            } else {
                                i3 = constraintWidget3.requestPostMessageChannelWithExtras;
                            }
                            constraintWidget3.getMax(min6 - i3, min6);
                            getMin(constraintWidget3, getmax, z);
                        } else if (z2 && !constraintWidget3.extraCallback()) {
                            getMax(getmax, constraintWidget3, z);
                        }
                    }
                } else if (constraintWidget3.extraCommand[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.Grayscale$Algorithm >= 0 && constraintWidget3.invokeSuspend >= 0) {
                    if ((constraintWidget3.areNotificationsEnabled == 8 || (constraintWidget3.Mean$Arithmetic == 0 && constraintWidget3.updateVisuals == 0.0f)) && !constraintWidget3.extraCallback() && !constraintWidget3.FastBitmap$CoordinateSystem() && z2 && !constraintWidget3.extraCallback()) {
                        getMax(constraintWidget, getmax, constraintWidget3, z);
                    }
                }
            }
        }
    }

    private static void getMin(ConstraintWidget constraintWidget, CheckResult.getMax getmax) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!(constraintWidget instanceof AnimRes) && constraintWidget.Grayscale$Algorithm() && getMin(constraintWidget)) {
            AnimRes.setMax(constraintWidget, getmax, new CheckResult.setMax(), CheckResult.setMax.getMax);
        }
        ConstraintAnchor max = constraintWidget.setMax(ConstraintAnchor.Type.TOP);
        ConstraintAnchor max2 = constraintWidget.setMax(ConstraintAnchor.Type.BOTTOM);
        int i7 = 0;
        if (!max.setMin) {
            i = 0;
        } else {
            i = max.getMin;
        }
        if (!max2.setMin) {
            i2 = 0;
        } else {
            i2 = max2.getMin;
        }
        if (max.length != null && max.setMax()) {
            Iterator<ConstraintAnchor> it = max.length.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.setMax;
                boolean min = getMin(constraintWidget2);
                if (constraintWidget2.Grayscale$Algorithm() && min) {
                    AnimRes.setMax(constraintWidget2, getmax, new CheckResult.setMax(), CheckResult.setMax.getMax);
                }
                if (constraintWidget2.extraCommand[1] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || min) {
                    if (!constraintWidget2.Grayscale$Algorithm()) {
                        if (next == constraintWidget2.setDefaultImpl && constraintWidget2.getInterfaceDescriptor.toIntRange == null) {
                            int min2 = constraintWidget2.setDefaultImpl.getMin() + i;
                            if (constraintWidget2.areNotificationsEnabled == 8) {
                                i6 = 0;
                            } else {
                                i6 = constraintWidget2.postMessage;
                            }
                            constraintWidget2.setMin(min2, i6 + min2);
                            getMin(constraintWidget2, getmax);
                        } else if (next == constraintWidget2.getInterfaceDescriptor && constraintWidget2.getInterfaceDescriptor.toIntRange == null) {
                            int min3 = i - constraintWidget2.getInterfaceDescriptor.getMin();
                            if (constraintWidget2.areNotificationsEnabled == 8) {
                                i5 = 0;
                            } else {
                                i5 = constraintWidget2.postMessage;
                            }
                            constraintWidget2.setMin(min3 - i5, min3);
                            getMin(constraintWidget2, getmax);
                        } else if (next == constraintWidget2.setDefaultImpl && constraintWidget2.getInterfaceDescriptor.toIntRange != null && constraintWidget2.getInterfaceDescriptor.toIntRange.setMax()) {
                            getMax(getmax, constraintWidget2);
                        }
                    }
                } else if (constraintWidget2.extraCommand[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.getCause >= 0 && constraintWidget2.onNavigationEvent >= 0) {
                    if ((constraintWidget2.areNotificationsEnabled == 8 || (constraintWidget2.invoke == 0 && constraintWidget2.updateVisuals == 0.0f)) && !constraintWidget2.onMessageChannelReady() && !constraintWidget2.FastBitmap$CoordinateSystem()) {
                        if (((next == constraintWidget2.setDefaultImpl && constraintWidget2.getInterfaceDescriptor.toIntRange != null && constraintWidget2.getInterfaceDescriptor.toIntRange.setMax()) || (next == constraintWidget2.getInterfaceDescriptor && constraintWidget2.setDefaultImpl.toIntRange != null && constraintWidget2.setDefaultImpl.toIntRange.setMax())) && !constraintWidget2.onMessageChannelReady()) {
                            setMax(constraintWidget, getmax, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (!(constraintWidget instanceof AnimatorRes)) {
            if (max2.length != null && max2.setMax()) {
                Iterator<ConstraintAnchor> it2 = max2.length.iterator();
                while (it2.hasNext()) {
                    ConstraintAnchor next2 = it2.next();
                    ConstraintWidget constraintWidget3 = next2.setMax;
                    boolean min4 = getMin(constraintWidget3);
                    if (constraintWidget3.Grayscale$Algorithm() && min4) {
                        AnimRes.setMax(constraintWidget3, getmax, new CheckResult.setMax(), CheckResult.setMax.getMax);
                    }
                    boolean z = (next2 == constraintWidget3.setDefaultImpl && constraintWidget3.getInterfaceDescriptor.toIntRange != null && constraintWidget3.getInterfaceDescriptor.toIntRange.setMax()) || (next2 == constraintWidget3.getInterfaceDescriptor && constraintWidget3.setDefaultImpl.toIntRange != null && constraintWidget3.setDefaultImpl.toIntRange.setMax());
                    if (constraintWidget3.extraCommand[1] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || min4) {
                        if (!constraintWidget3.Grayscale$Algorithm()) {
                            if (next2 == constraintWidget3.setDefaultImpl && constraintWidget3.getInterfaceDescriptor.toIntRange == null) {
                                int min5 = constraintWidget3.setDefaultImpl.getMin() + i2;
                                if (constraintWidget3.areNotificationsEnabled == 8) {
                                    i4 = 0;
                                } else {
                                    i4 = constraintWidget3.postMessage;
                                }
                                constraintWidget3.setMin(min5, i4 + min5);
                                getMin(constraintWidget3, getmax);
                            } else if (next2 == constraintWidget3.getInterfaceDescriptor && constraintWidget3.setDefaultImpl.toIntRange == null) {
                                int min6 = i2 - constraintWidget3.getInterfaceDescriptor.getMin();
                                if (constraintWidget3.areNotificationsEnabled == 8) {
                                    i3 = 0;
                                } else {
                                    i3 = constraintWidget3.postMessage;
                                }
                                constraintWidget3.setMin(min6 - i3, min6);
                                getMin(constraintWidget3, getmax);
                            } else if (z && !constraintWidget3.onMessageChannelReady()) {
                                getMax(getmax, constraintWidget3);
                            }
                        }
                    } else if (constraintWidget3.extraCommand[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.getCause >= 0 && constraintWidget3.onNavigationEvent >= 0) {
                        if ((constraintWidget3.areNotificationsEnabled == 8 || (constraintWidget3.invoke == 0 && constraintWidget3.updateVisuals == 0.0f)) && !constraintWidget3.onMessageChannelReady() && !constraintWidget3.FastBitmap$CoordinateSystem() && z && !constraintWidget3.onMessageChannelReady()) {
                            setMax(constraintWidget, getmax, constraintWidget3);
                        }
                    }
                }
            }
            ConstraintAnchor max3 = constraintWidget.setMax(ConstraintAnchor.Type.BASELINE);
            if (max3.length != null && max3.setMax()) {
                if (max3.setMin) {
                    i7 = max3.getMin;
                }
                Iterator<ConstraintAnchor> it3 = max3.length.iterator();
                while (it3.hasNext()) {
                    ConstraintAnchor next3 = it3.next();
                    ConstraintWidget constraintWidget4 = next3.setMax;
                    boolean min7 = getMin(constraintWidget4);
                    if (constraintWidget4.Grayscale$Algorithm() && min7) {
                        AnimRes.setMax(constraintWidget4, getmax, new CheckResult.setMax(), CheckResult.setMax.getMax);
                    }
                    if ((constraintWidget4.extraCommand[1] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || min7) && !constraintWidget4.Grayscale$Algorithm() && next3 == constraintWidget4.getDefaultImpl) {
                        constraintWidget4.setMax(i7);
                        getMin(constraintWidget4, getmax);
                    }
                }
            }
        }
    }

    public static void length(AnimRes animRes, CheckResult.getMax getmax) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = animRes.extraCommand[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = animRes.extraCommand[1];
        animRes.e_();
        ArrayList<ConstraintWidget> arrayList = animRes.onVolumeInfoChanged;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get(i7).e_();
        }
        boolean floatRange = animRes.toFloatRange();
        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            if (animRes.areNotificationsEnabled == 8) {
                i6 = 0;
            } else {
                i6 = animRes.requestPostMessageChannelWithExtras;
            }
            animRes.getMax(0, i6);
        } else {
            animRes.d_();
        }
        boolean z = false;
        boolean z2 = false;
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget = arrayList.get(i8);
            if (constraintWidget instanceof AnimatorRes) {
                AnimatorRes animatorRes = (AnimatorRes) constraintWidget;
                if (animatorRes.MediaBrowserCompat$ItemReceiver == 1) {
                    if (animatorRes.length() != -1) {
                        int length = animatorRes.length();
                        ConstraintAnchor constraintAnchor = animatorRes.length;
                        constraintAnchor.getMin = length;
                        constraintAnchor.setMin = true;
                        animatorRes.MediaBrowserCompat$MediaItem = true;
                    } else if (animatorRes.isInside() != -1 && animRes.getMin()) {
                        if (animRes.areNotificationsEnabled == 8) {
                            i5 = 0;
                        } else {
                            i5 = animRes.requestPostMessageChannelWithExtras;
                        }
                        int isInside = i5 - animatorRes.isInside();
                        ConstraintAnchor constraintAnchor2 = animatorRes.length;
                        constraintAnchor2.getMin = isInside;
                        constraintAnchor2.setMin = true;
                        animatorRes.MediaBrowserCompat$MediaItem = true;
                    } else if (animRes.getMin()) {
                        float max = animatorRes.setMax();
                        if (animRes.areNotificationsEnabled == 8) {
                            i4 = 0;
                        } else {
                            i4 = animRes.requestPostMessageChannelWithExtras;
                        }
                        ConstraintAnchor constraintAnchor3 = animatorRes.length;
                        constraintAnchor3.getMin = (int) ((max * ((float) i4)) + 0.5f);
                        constraintAnchor3.setMin = true;
                        animatorRes.MediaBrowserCompat$MediaItem = true;
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) && ((OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) constraintWidget).isInside() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget2 = arrayList.get(i9);
                if (constraintWidget2 instanceof AnimatorRes) {
                    AnimatorRes animatorRes2 = (AnimatorRes) constraintWidget2;
                    if (animatorRes2.MediaBrowserCompat$ItemReceiver == 1) {
                        getMin(animatorRes2, getmax, floatRange);
                    }
                }
            }
        }
        getMin(animRes, getmax, floatRange);
        if (z2) {
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget3 = arrayList.get(i10);
                if (constraintWidget3 instanceof OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) {
                    OnBackPressedDispatcher$LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable = (OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) constraintWidget3;
                    if (onBackPressedDispatcher$LifecycleOnBackPressedCancellable.isInside() == 0 && onBackPressedDispatcher$LifecycleOnBackPressedCancellable.toFloatRange()) {
                        getMin(onBackPressedDispatcher$LifecycleOnBackPressedCancellable, getmax, floatRange);
                    }
                }
            }
        }
        if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED) {
            if (animRes.areNotificationsEnabled == 8) {
                i3 = 0;
            } else {
                i3 = animRes.postMessage;
            }
            animRes.setMin(0, i3);
        } else {
            animRes.equals();
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget4 = arrayList.get(i11);
            if (constraintWidget4 instanceof AnimatorRes) {
                AnimatorRes animatorRes3 = (AnimatorRes) constraintWidget4;
                if (animatorRes3.MediaBrowserCompat$ItemReceiver == 0) {
                    if (animatorRes3.length() != -1) {
                        int length2 = animatorRes3.length();
                        ConstraintAnchor constraintAnchor4 = animatorRes3.length;
                        constraintAnchor4.getMin = length2;
                        constraintAnchor4.setMin = true;
                        animatorRes3.MediaBrowserCompat$MediaItem = true;
                    } else if (animatorRes3.isInside() != -1 && animRes.setMin()) {
                        if (animRes.areNotificationsEnabled == 8) {
                            i2 = 0;
                        } else {
                            i2 = animRes.postMessage;
                        }
                        int isInside2 = i2 - animatorRes3.isInside();
                        ConstraintAnchor constraintAnchor5 = animatorRes3.length;
                        constraintAnchor5.getMin = isInside2;
                        constraintAnchor5.setMin = true;
                        animatorRes3.MediaBrowserCompat$MediaItem = true;
                    } else if (animRes.setMin()) {
                        float max2 = animatorRes3.setMax();
                        if (animRes.areNotificationsEnabled == 8) {
                            i = 0;
                        } else {
                            i = animRes.postMessage;
                        }
                        ConstraintAnchor constraintAnchor6 = animatorRes3.length;
                        constraintAnchor6.getMin = (int) ((max2 * ((float) i)) + 0.5f);
                        constraintAnchor6.setMin = true;
                        animatorRes3.MediaBrowserCompat$MediaItem = true;
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) && ((OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) constraintWidget4).isInside() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget5 = arrayList.get(i12);
                if (constraintWidget5 instanceof AnimatorRes) {
                    AnimatorRes animatorRes4 = (AnimatorRes) constraintWidget5;
                    if (animatorRes4.MediaBrowserCompat$ItemReceiver == 0) {
                        getMin(animatorRes4, getmax);
                    }
                }
            }
        }
        getMin(animRes, getmax);
        if (z4) {
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget6 = arrayList.get(i13);
                if (constraintWidget6 instanceof OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) {
                    OnBackPressedDispatcher$LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable2 = (OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) constraintWidget6;
                    if (onBackPressedDispatcher$LifecycleOnBackPressedCancellable2.isInside() == 1 && onBackPressedDispatcher$LifecycleOnBackPressedCancellable2.toFloatRange()) {
                        getMin(onBackPressedDispatcher$LifecycleOnBackPressedCancellable2, getmax);
                    }
                }
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            ConstraintWidget constraintWidget7 = arrayList.get(i14);
            if (constraintWidget7.Grayscale$Algorithm() && getMin(constraintWidget7)) {
                AnimRes.setMax(constraintWidget7, getmax, setMin, CheckResult.setMax.getMax);
                getMin(constraintWidget7, getmax, floatRange);
                getMin(constraintWidget7, getmax);
            }
        }
    }

    private static void getMax(CheckResult.getMax getmax, ConstraintWidget constraintWidget, boolean z) {
        int i;
        int i2;
        float f = constraintWidget.ITrustedWebActivityCallback$Default;
        ConstraintAnchor constraintAnchor = constraintWidget.ICustomTabsCallback$Default.toIntRange;
        int i3 = 0;
        if (!constraintAnchor.setMin) {
            i = 0;
        } else {
            i = constraintAnchor.getMin;
        }
        ConstraintAnchor constraintAnchor2 = constraintWidget.ICustomTabsCallback$Stub$Proxy.toIntRange;
        if (!constraintAnchor2.setMin) {
            i2 = 0;
        } else {
            i2 = constraintAnchor2.getMin;
        }
        int min = constraintWidget.ICustomTabsCallback$Default.getMin() + i;
        int min2 = i2 - constraintWidget.ICustomTabsCallback$Stub$Proxy.getMin();
        if (i == i2) {
            f = 0.5f;
        } else {
            i = min;
            i2 = min2;
        }
        if (constraintWidget.areNotificationsEnabled != 8) {
            i3 = constraintWidget.requestPostMessageChannelWithExtras;
        }
        int i4 = (i2 - i) - i3;
        if (i > i2) {
            i4 = (i - i2) - i3;
        }
        int i5 = ((int) ((f * ((float) i4)) + 0.5f)) + i;
        int i6 = i5 + i3;
        if (i > i2) {
            i6 = i5 - i3;
        }
        constraintWidget.getMax(i5, i6);
        getMin(constraintWidget, getmax, z);
    }

    private static void getMax(CheckResult.getMax getmax, ConstraintWidget constraintWidget) {
        int i;
        int i2;
        float f = constraintWidget.ITrustedWebActivityCallback$Stub;
        ConstraintAnchor constraintAnchor = constraintWidget.setDefaultImpl.toIntRange;
        int i3 = 0;
        if (!constraintAnchor.setMin) {
            i = 0;
        } else {
            i = constraintAnchor.getMin;
        }
        ConstraintAnchor constraintAnchor2 = constraintWidget.getInterfaceDescriptor.toIntRange;
        if (!constraintAnchor2.setMin) {
            i2 = 0;
        } else {
            i2 = constraintAnchor2.getMin;
        }
        int min = constraintWidget.setDefaultImpl.getMin() + i;
        int min2 = i2 - constraintWidget.getInterfaceDescriptor.getMin();
        if (i == i2) {
            f = 0.5f;
        } else {
            i = min;
            i2 = min2;
        }
        if (constraintWidget.areNotificationsEnabled != 8) {
            i3 = constraintWidget.postMessage;
        }
        int i4 = (i2 - i) - i3;
        if (i > i2) {
            i4 = (i - i2) - i3;
        }
        int i5 = (int) ((f * ((float) i4)) + 0.5f);
        int i6 = i + i5;
        int i7 = i6 + i3;
        if (i > i2) {
            i6 = i - i5;
            i7 = i6 - i3;
        }
        constraintWidget.setMin(i6, i7);
        getMin(constraintWidget, getmax);
    }

    private static void getMax(ConstraintWidget constraintWidget, CheckResult.getMax getmax, ConstraintWidget constraintWidget2, boolean z) {
        int i;
        int i2;
        int i3;
        float f = constraintWidget2.ITrustedWebActivityCallback$Default;
        ConstraintAnchor constraintAnchor = constraintWidget2.ICustomTabsCallback$Default.toIntRange;
        int i4 = 0;
        if (!constraintAnchor.setMin) {
            i = 0;
        } else {
            i = constraintAnchor.getMin;
        }
        int min = i + constraintWidget2.ICustomTabsCallback$Default.getMin();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.ICustomTabsCallback$Stub$Proxy.toIntRange;
        if (!constraintAnchor2.setMin) {
            i2 = 0;
        } else {
            i2 = constraintAnchor2.getMin;
        }
        int min2 = i2 - constraintWidget2.ICustomTabsCallback$Stub$Proxy.getMin();
        if (min2 >= min) {
            if (constraintWidget2.areNotificationsEnabled == 8) {
                i3 = 0;
            } else {
                i3 = constraintWidget2.requestPostMessageChannelWithExtras;
            }
            if (constraintWidget2.areNotificationsEnabled != 8) {
                if (constraintWidget2.Mean$Arithmetic == 2) {
                    if (!(constraintWidget instanceof AnimRes)) {
                        ConstraintWidget constraintWidget3 = constraintWidget.requestPostMessageChannel;
                        if (constraintWidget3.areNotificationsEnabled != 8) {
                            i4 = constraintWidget3.requestPostMessageChannelWithExtras;
                        }
                    } else if (constraintWidget.areNotificationsEnabled != 8) {
                        i4 = constraintWidget.requestPostMessageChannelWithExtras;
                    }
                    i3 = (int) (constraintWidget2.ITrustedWebActivityCallback$Default * 0.5f * ((float) i4));
                } else if (constraintWidget2.Mean$Arithmetic == 0) {
                    i3 = min2 - min;
                }
                i3 = Math.max(constraintWidget2.invokeSuspend, i3);
                if (constraintWidget2.Grayscale$Algorithm > 0) {
                    i3 = Math.min(constraintWidget2.Grayscale$Algorithm, i3);
                }
            }
            int i5 = min + ((int) ((f * ((float) ((min2 - min) - i3))) + 0.5f));
            constraintWidget2.getMax(i5, i3 + i5);
            getMin(constraintWidget2, getmax, z);
        }
    }

    private static void setMax(ConstraintWidget constraintWidget, CheckResult.getMax getmax, ConstraintWidget constraintWidget2) {
        int i;
        int i2;
        int i3;
        float f = constraintWidget2.ITrustedWebActivityCallback$Stub;
        ConstraintAnchor constraintAnchor = constraintWidget2.setDefaultImpl.toIntRange;
        int i4 = 0;
        if (!constraintAnchor.setMin) {
            i = 0;
        } else {
            i = constraintAnchor.getMin;
        }
        int min = i + constraintWidget2.setDefaultImpl.getMin();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.getInterfaceDescriptor.toIntRange;
        if (!constraintAnchor2.setMin) {
            i2 = 0;
        } else {
            i2 = constraintAnchor2.getMin;
        }
        int min2 = i2 - constraintWidget2.getInterfaceDescriptor.getMin();
        if (min2 >= min) {
            if (constraintWidget2.areNotificationsEnabled == 8) {
                i3 = 0;
            } else {
                i3 = constraintWidget2.postMessage;
            }
            if (constraintWidget2.areNotificationsEnabled != 8) {
                if (constraintWidget2.invoke == 2) {
                    if (!(constraintWidget instanceof AnimRes)) {
                        ConstraintWidget constraintWidget3 = constraintWidget.requestPostMessageChannel;
                        if (constraintWidget3.areNotificationsEnabled != 8) {
                            i4 = constraintWidget3.postMessage;
                        }
                    } else if (constraintWidget.areNotificationsEnabled != 8) {
                        i4 = constraintWidget.postMessage;
                    }
                    i3 = (int) (f * 0.5f * ((float) i4));
                } else if (constraintWidget2.invoke == 0) {
                    i3 = min2 - min;
                }
                i3 = Math.max(constraintWidget2.onNavigationEvent, i3);
                if (constraintWidget2.getCause > 0) {
                    i3 = Math.min(constraintWidget2.getCause, i3);
                }
            }
            int i5 = min + ((int) ((f * ((float) ((min2 - min) - i3))) + 0.5f));
            constraintWidget2.setMin(i5, i3 + i5);
            getMin(constraintWidget2, getmax);
        }
    }

    private static boolean getMin(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.extraCommand[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.extraCommand[1];
        AnimRes animRes = constraintWidget.requestPostMessageChannel != null ? (AnimRes) constraintWidget.requestPostMessageChannel : null;
        if (animRes != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (animRes != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        boolean z = dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.Mean$Arithmetic == 0 && constraintWidget.updateVisuals == 0.0f && constraintWidget.getMin(0)) || constraintWidget.getMin();
        boolean z2 = dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.invoke == 0 && constraintWidget.updateVisuals == 0.0f && constraintWidget.getMin(1)) || constraintWidget.setMin();
        if (constraintWidget.updateVisuals > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
