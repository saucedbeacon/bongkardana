package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public final class ArrayRes {
    static boolean[] getMin = new boolean[3];

    public static final boolean setMin(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void getMin(AnimRes animRes, reportFullyDrawn reportfullydrawn, ConstraintWidget constraintWidget) {
        int i;
        constraintWidget.toDoubleRange = -1;
        constraintWidget.toString = -1;
        int i2 = 0;
        if (animRes.extraCommand[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.extraCommand[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i3 = constraintWidget.ICustomTabsCallback$Default.equals;
            if (animRes.areNotificationsEnabled == 8) {
                i = 0;
            } else {
                i = animRes.requestPostMessageChannelWithExtras;
            }
            int i4 = i - constraintWidget.ICustomTabsCallback$Stub$Proxy.equals;
            constraintWidget.ICustomTabsCallback$Default.IsOverlapping = reportfullydrawn.getMin((Object) constraintWidget.ICustomTabsCallback$Default);
            constraintWidget.ICustomTabsCallback$Stub$Proxy.IsOverlapping = reportfullydrawn.getMin((Object) constraintWidget.ICustomTabsCallback$Stub$Proxy);
            reportfullydrawn.setMin(constraintWidget.ICustomTabsCallback$Default.IsOverlapping, i3);
            reportfullydrawn.setMin(constraintWidget.ICustomTabsCallback$Stub$Proxy.IsOverlapping, i4);
            constraintWidget.toDoubleRange = 2;
            constraintWidget.getMin(i3, i4);
        }
        if (animRes.extraCommand[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.extraCommand[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i5 = constraintWidget.setDefaultImpl.equals;
            if (animRes.areNotificationsEnabled != 8) {
                i2 = animRes.postMessage;
            }
            int i6 = i2 - constraintWidget.getInterfaceDescriptor.equals;
            constraintWidget.setDefaultImpl.IsOverlapping = reportfullydrawn.getMin((Object) constraintWidget.setDefaultImpl);
            constraintWidget.getInterfaceDescriptor.IsOverlapping = reportfullydrawn.getMin((Object) constraintWidget.getInterfaceDescriptor);
            reportfullydrawn.setMin(constraintWidget.setDefaultImpl.IsOverlapping, i5);
            reportfullydrawn.setMin(constraintWidget.getInterfaceDescriptor.IsOverlapping, i6);
            if (constraintWidget.IPostMessageService$Stub > 0 || constraintWidget.areNotificationsEnabled == 8) {
                constraintWidget.getDefaultImpl.IsOverlapping = reportfullydrawn.getMin((Object) constraintWidget.getDefaultImpl);
                reportfullydrawn.setMin(constraintWidget.getDefaultImpl.IsOverlapping, constraintWidget.IPostMessageService$Stub + i5);
            }
            constraintWidget.toString = 2;
            constraintWidget.length(i5, i6);
        }
    }
}
