package o;

import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.calculateDyToMakeVisible;
import o.saveFocusInfo;

public final class postAnimationRunner {
    public isComputingLayout getMax;
    public isComputingLayout setMin;

    public postAnimationRunner(@NonNull TypedArray typedArray) {
        isComputingLayout iscomputinglayout;
        isComputingLayout iscomputinglayout2;
        ArrayList arrayList = new ArrayList(3);
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.asInterface)) {
            arrayList.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.asInterface, 0)) {
                final /* synthetic */ int length;

                {
                    this.length = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMax >= this.length;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.ICustomTabsCallback$Stub)) {
            arrayList.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.ICustomTabsCallback$Stub, 0)) {
                final /* synthetic */ int getMax;

                {
                    this.getMax = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMax <= this.getMax;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.onTransact)) {
            arrayList.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.onTransact, 0)) {
                final /* synthetic */ int setMax;

                {
                    this.setMax = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMin >= this.setMax;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.extraCallbackWithResult)) {
            arrayList.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.extraCallbackWithResult, 0)) {
                final /* synthetic */ int length;

                {
                    this.length = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMin <= this.length;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.asBinder)) {
            arrayList.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.asBinder, 0)) {
                final /* synthetic */ int setMin;

                {
                    this.setMin = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMin * shoulddeferaccessibilityevent.getMax >= this.setMin;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.onPostMessage)) {
            arrayList.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.onPostMessage, 0)) {
                final /* synthetic */ int getMax;

                {
                    this.getMax = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMin * shoulddeferaccessibilityevent.getMax <= this.getMax;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.onRelationshipValidationResult)) {
            predictiveItemAnimationsEnabled min = predictiveItemAnimationsEnabled.setMin(typedArray.getString(calculateDyToMakeVisible.setMax.onRelationshipValidationResult));
            arrayList.add(new saveFocusInfo.setMax(new saveFocusInfo.length(((float) min.setMin) / ((float) min.getMax)) {
                final /* synthetic */ float setMax = 0.0f;
                final /* synthetic */ float setMin;

                {
                    this.setMin = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    predictiveItemAnimationsEnabled max = predictiveItemAnimationsEnabled.setMax(shoulddeferaccessibilityevent.getMax, shoulddeferaccessibilityevent.getMin);
                    float f = ((float) max.setMin) / ((float) max.getMax);
                    float f2 = this.setMin;
                    float f3 = this.setMax;
                    return f >= f2 - f3 && f <= f2 + f3;
                }
            }, (byte) 0));
        }
        if (typedArray.getBoolean(calculateDyToMakeVisible.setMax.ICustomTabsCallback$Default, false)) {
            arrayList.add(new isComputingLayout() {
                @NonNull
                public final List<shouldDeferAccessibilityEvent> setMin(@NonNull List<shouldDeferAccessibilityEvent> list) {
                    Collections.sort(list);
                    return list;
                }
            });
        }
        if (typedArray.getBoolean(calculateDyToMakeVisible.setMax.extraCallback, false)) {
            arrayList.add(new isComputingLayout() {
                @NonNull
                public final List<shouldDeferAccessibilityEvent> setMin(@NonNull List<shouldDeferAccessibilityEvent> list) {
                    Collections.sort(list);
                    Collections.reverse(list);
                    return list;
                }
            });
        }
        if (!arrayList.isEmpty()) {
            iscomputinglayout = new saveFocusInfo.setMin((isComputingLayout[]) arrayList.toArray(new isComputingLayout[0]), (byte) 0);
        } else {
            iscomputinglayout = new isComputingLayout() {
                @NonNull
                public final List<shouldDeferAccessibilityEvent> setMin(@NonNull List<shouldDeferAccessibilityEvent> list) {
                    Collections.sort(list);
                    Collections.reverse(list);
                    return list;
                }
            };
        }
        this.getMax = iscomputinglayout;
        ArrayList arrayList2 = new ArrayList(3);
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.receiveFile)) {
            arrayList2.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.receiveFile, 0)) {
                final /* synthetic */ int length;

                {
                    this.length = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMax >= this.length;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.IPostMessageService)) {
            arrayList2.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.IPostMessageService, 0)) {
                final /* synthetic */ int getMax;

                {
                    this.getMax = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMax <= this.getMax;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.ICustomTabsService$Default)) {
            arrayList2.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.ICustomTabsService$Default, 0)) {
                final /* synthetic */ int setMax;

                {
                    this.setMax = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMin >= this.setMax;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.ICustomTabsService$Stub)) {
            arrayList2.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.ICustomTabsService$Stub, 0)) {
                final /* synthetic */ int length;

                {
                    this.length = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMin <= this.length;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.ICustomTabsService$Stub$Proxy)) {
            arrayList2.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.ICustomTabsService$Stub$Proxy, 0)) {
                final /* synthetic */ int setMin;

                {
                    this.setMin = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMin * shoulddeferaccessibilityevent.getMax >= this.setMin;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.requestPostMessageChannelWithExtras)) {
            arrayList2.add(new saveFocusInfo.setMax(new saveFocusInfo.length(typedArray.getInteger(calculateDyToMakeVisible.setMax.requestPostMessageChannelWithExtras, 0)) {
                final /* synthetic */ int getMax;

                {
                    this.getMax = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    return shoulddeferaccessibilityevent.getMin * shoulddeferaccessibilityevent.getMax <= this.getMax;
                }
            }, (byte) 0));
        }
        if (typedArray.hasValue(calculateDyToMakeVisible.setMax.requestPostMessageChannel)) {
            predictiveItemAnimationsEnabled min2 = predictiveItemAnimationsEnabled.setMin(typedArray.getString(calculateDyToMakeVisible.setMax.requestPostMessageChannel));
            arrayList2.add(new saveFocusInfo.setMax(new saveFocusInfo.length(((float) min2.setMin) / ((float) min2.getMax)) {
                final /* synthetic */ float setMax = 0.0f;
                final /* synthetic */ float setMin;

                {
                    this.setMin = r1;
                }

                public final boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
                    predictiveItemAnimationsEnabled max = predictiveItemAnimationsEnabled.setMax(shoulddeferaccessibilityevent.getMax, shoulddeferaccessibilityevent.getMin);
                    float f = ((float) max.setMin) / ((float) max.getMax);
                    float f2 = this.setMin;
                    float f3 = this.setMax;
                    return f >= f2 - f3 && f <= f2 + f3;
                }
            }, (byte) 0));
        }
        if (typedArray.getBoolean(calculateDyToMakeVisible.setMax.IPostMessageService$Default, false)) {
            arrayList2.add(new isComputingLayout() {
                @NonNull
                public final List<shouldDeferAccessibilityEvent> setMin(@NonNull List<shouldDeferAccessibilityEvent> list) {
                    Collections.sort(list);
                    return list;
                }
            });
        }
        if (typedArray.getBoolean(calculateDyToMakeVisible.setMax.updateVisuals, false)) {
            arrayList2.add(new isComputingLayout() {
                @NonNull
                public final List<shouldDeferAccessibilityEvent> setMin(@NonNull List<shouldDeferAccessibilityEvent> list) {
                    Collections.sort(list);
                    Collections.reverse(list);
                    return list;
                }
            });
        }
        if (!arrayList2.isEmpty()) {
            iscomputinglayout2 = new saveFocusInfo.setMin((isComputingLayout[]) arrayList2.toArray(new isComputingLayout[0]), (byte) 0);
        } else {
            iscomputinglayout2 = new isComputingLayout() {
                @NonNull
                public final List<shouldDeferAccessibilityEvent> setMin(@NonNull List<shouldDeferAccessibilityEvent> list) {
                    Collections.sort(list);
                    Collections.reverse(list);
                    return list;
                }
            };
        }
        this.setMin = iscomputinglayout2;
    }
}
