package o;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

public final class codename {
    private static boolean getMax(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        return (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT));
    }

    private static Dimension length(ArrayList<Dimension> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Dimension dimension = arrayList.get(i2);
            if (i == dimension.getMin) {
                return dimension;
            }
        }
        return null;
    }

    public static Dimension getMin(ConstraintWidget constraintWidget, int i, ArrayList<Dimension> arrayList, Dimension dimension) {
        int i2;
        int doubleRange;
        if (i == 0) {
            i2 = constraintWidget.MediaBrowserCompat$MediaItem$Flags;
        } else {
            i2 = constraintWidget.MediaDescriptionCompat;
        }
        int i3 = 0;
        if (i2 != -1 && (dimension == null || i2 != dimension.getMin)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                Dimension dimension2 = arrayList.get(i4);
                if (dimension2.getMin == i2) {
                    if (dimension != null) {
                        dimension.setMax(i, dimension2);
                        arrayList.remove(dimension);
                    }
                    dimension = dimension2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return dimension;
        }
        if (dimension == null) {
            if ((constraintWidget instanceof AnyThread) && (doubleRange = ((AnyThread) constraintWidget).toDoubleRange(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    Dimension dimension3 = arrayList.get(i5);
                    if (dimension3.getMin == doubleRange) {
                        dimension = dimension3;
                        break;
                    }
                    i5++;
                }
            }
            if (dimension == null) {
                dimension = new Dimension(i);
            }
            arrayList.add(dimension);
        }
        if (dimension.setMax(constraintWidget)) {
            if (constraintWidget instanceof AnimatorRes) {
                AnimatorRes animatorRes = (AnimatorRes) constraintWidget;
                ConstraintAnchor constraintAnchor = animatorRes.length;
                if (animatorRes.MediaBrowserCompat$ItemReceiver == 0) {
                    i3 = 1;
                }
                constraintAnchor.setMin(i3, arrayList, dimension);
            }
            if (i == 0) {
                constraintWidget.MediaBrowserCompat$MediaItem$Flags = dimension.getMin;
                constraintWidget.ICustomTabsCallback$Default.setMin(i, arrayList, dimension);
                constraintWidget.ICustomTabsCallback$Stub$Proxy.setMin(i, arrayList, dimension);
            } else {
                constraintWidget.MediaDescriptionCompat = dimension.getMin;
                constraintWidget.setDefaultImpl.setMin(i, arrayList, dimension);
                constraintWidget.getDefaultImpl.setMin(i, arrayList, dimension);
                constraintWidget.getInterfaceDescriptor.setMin(i, arrayList, dimension);
            }
            constraintWidget.warmup.setMin(i, arrayList, dimension);
        }
        return dimension;
    }

    /* JADX WARNING: Removed duplicated region for block: B:181:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x037d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getMax(o.AnimRes r17, o.CheckResult.getMax r18) {
        /*
            r0 = r17
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r1 = r0.onVolumeInfoChanged
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000a:
            r5 = 1
            if (r4 >= r2) goto L_0x0032
            java.lang.Object r6 = r1.get(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r0.extraCommand
            r7 = r7[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r0.extraCommand
            r8 = r8[r5]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r6.extraCommand
            r9 = r9[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r6.extraCommand
            r5 = r10[r5]
            boolean r5 = getMax(r7, r8, r9, r5)
            if (r5 != 0) goto L_0x002a
            return r3
        L_0x002a:
            boolean r5 = r6 instanceof o.AnyRes
            if (r5 == 0) goto L_0x002f
            return r3
        L_0x002f:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0032:
            o.ComponentActivity$5 r4 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r4 == 0) goto L_0x003f
            o.ComponentActivity$5 r4 = r0.MediaBrowserCompat$SearchResultReceiver
            long r6 = r4.onTransact
            r8 = 1
            long r6 = r6 + r8
            r4.onTransact = r6
        L_0x003f:
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0046:
            if (r6 >= r2) goto L_0x011a
            java.lang.Object r13 = r1.get(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r13
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r14 = r0.extraCommand
            r14 = r14[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r15 = r0.extraCommand
            r15 = r15[r5]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r13.extraCommand
            r4 = r4[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r13.extraCommand
            r3 = r3[r5]
            boolean r3 = getMax(r14, r15, r4, r3)
            if (r3 != 0) goto L_0x006e
            o.CheckResult$setMax r3 = r0.onCaptioningEnabledChanged
            int r4 = o.CheckResult.setMax.getMax
            r14 = r18
            o.AnimRes.setMax(r13, r14, r3, r4)
            goto L_0x0070
        L_0x006e:
            r14 = r18
        L_0x0070:
            boolean r3 = r13 instanceof o.AnimatorRes
            if (r3 == 0) goto L_0x0093
            r4 = r13
            o.AnimatorRes r4 = (o.AnimatorRes) r4
            int r15 = r4.MediaBrowserCompat$ItemReceiver
            if (r15 != 0) goto L_0x0085
            if (r9 != 0) goto L_0x0082
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0082:
            r9.add(r4)
        L_0x0085:
            int r15 = r4.MediaBrowserCompat$ItemReceiver
            if (r15 != r5) goto L_0x0093
            if (r7 != 0) goto L_0x0090
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0090:
            r7.add(r4)
        L_0x0093:
            boolean r4 = r13 instanceof o.AnyThread
            if (r4 == 0) goto L_0x00d6
            boolean r4 = r13 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r4 == 0) goto L_0x00bf
            r4 = r13
            o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r4 = (o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) r4
            int r15 = r4.isInside()
            if (r15 != 0) goto L_0x00ae
            if (r8 != 0) goto L_0x00ab
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x00ab:
            r8.add(r4)
        L_0x00ae:
            int r15 = r4.isInside()
            if (r15 != r5) goto L_0x00d6
            if (r10 != 0) goto L_0x00bb
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x00bb:
            r10.add(r4)
            goto L_0x00d6
        L_0x00bf:
            r4 = r13
            o.AnyThread r4 = (o.AnyThread) r4
            if (r8 != 0) goto L_0x00c9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x00c9:
            r8.add(r4)
            if (r10 != 0) goto L_0x00d3
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x00d3:
            r10.add(r4)
        L_0x00d6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r13.ICustomTabsCallback$Default
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.toIntRange
            if (r4 != 0) goto L_0x00f2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r13.ICustomTabsCallback$Stub$Proxy
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.toIntRange
            if (r4 != 0) goto L_0x00f2
            if (r3 != 0) goto L_0x00f2
            boolean r4 = r13 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r4 != 0) goto L_0x00f2
            if (r11 != 0) goto L_0x00ef
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x00ef:
            r11.add(r13)
        L_0x00f2:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r13.setDefaultImpl
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.toIntRange
            if (r4 != 0) goto L_0x0115
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r13.getInterfaceDescriptor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.toIntRange
            if (r4 != 0) goto L_0x0115
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r13.getDefaultImpl
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.toIntRange
            if (r4 != 0) goto L_0x0115
            if (r3 != 0) goto L_0x0115
            boolean r3 = r13 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r3 != 0) goto L_0x0115
            if (r12 != 0) goto L_0x0112
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r12 = r3
        L_0x0112:
            r12.add(r13)
        L_0x0115:
            int r6 = r6 + 1
            r3 = 0
            goto L_0x0046
        L_0x011a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r7 == 0) goto L_0x0137
            java.util.Iterator r4 = r7.iterator()
        L_0x0125:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0137
            java.lang.Object r6 = r4.next()
            o.AnimatorRes r6 = (o.AnimatorRes) r6
            r7 = 0
            r13 = 0
            getMin(r6, r13, r3, r7)
            goto L_0x0125
        L_0x0137:
            r7 = 0
            r13 = 0
            if (r8 == 0) goto L_0x0158
            java.util.Iterator r4 = r8.iterator()
        L_0x013f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0158
            java.lang.Object r6 = r4.next()
            o.AnyThread r6 = (o.AnyThread) r6
            o.Dimension r8 = getMin(r6, r13, r3, r7)
            r6.getMax(r3, r13, r8)
            r8.length(r3)
            r7 = 0
            r13 = 0
            goto L_0x013f
        L_0x0158:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r6 = r4.length
            if (r6 == 0) goto L_0x017c
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r4.length
            java.util.Iterator r4 = r4.iterator()
        L_0x0168:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x017c
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.setMax
            r7 = 0
            r8 = 0
            getMin(r6, r8, r3, r7)
            goto L_0x0168
        L_0x017c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r6 = r4.length
            if (r6 == 0) goto L_0x01a0
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r4.length
            java.util.Iterator r4 = r4.iterator()
        L_0x018c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01a0
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.setMax
            r7 = 0
            r8 = 0
            getMin(r6, r8, r3, r7)
            goto L_0x018c
        L_0x01a0:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r6 = r4.length
            if (r6 == 0) goto L_0x01c4
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r4.length
            java.util.Iterator r4 = r4.iterator()
        L_0x01b0:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01c4
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.setMax
            r7 = 0
            r8 = 0
            getMin(r6, r8, r3, r7)
            goto L_0x01b0
        L_0x01c4:
            r7 = 0
            r8 = 0
            if (r11 == 0) goto L_0x01dc
            java.util.Iterator r4 = r11.iterator()
        L_0x01cc:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01dc
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r6
            getMin(r6, r8, r3, r7)
            goto L_0x01cc
        L_0x01dc:
            if (r9 == 0) goto L_0x01f2
            java.util.Iterator r4 = r9.iterator()
        L_0x01e2:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01f2
            java.lang.Object r6 = r4.next()
            o.AnimatorRes r6 = (o.AnimatorRes) r6
            getMin(r6, r5, r3, r7)
            goto L_0x01e2
        L_0x01f2:
            if (r10 == 0) goto L_0x0210
            java.util.Iterator r4 = r10.iterator()
        L_0x01f8:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0210
            java.lang.Object r6 = r4.next()
            o.AnyThread r6 = (o.AnyThread) r6
            o.Dimension r8 = getMin(r6, r5, r3, r7)
            r6.getMax(r3, r5, r8)
            r8.length(r3)
            r7 = 0
            goto L_0x01f8
        L_0x0210:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r6 = r4.length
            if (r6 == 0) goto L_0x0233
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r4.length
            java.util.Iterator r4 = r4.iterator()
        L_0x0220:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0233
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.setMax
            r7 = 0
            getMin(r6, r5, r3, r7)
            goto L_0x0220
        L_0x0233:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r6 = r4.length
            if (r6 == 0) goto L_0x0256
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r4.length
            java.util.Iterator r4 = r4.iterator()
        L_0x0243:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0256
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.setMax
            r7 = 0
            getMin(r6, r5, r3, r7)
            goto L_0x0243
        L_0x0256:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r6 = r4.length
            if (r6 == 0) goto L_0x0279
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r4.length
            java.util.Iterator r4 = r4.iterator()
        L_0x0266:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0279
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.setMax
            r7 = 0
            getMin(r6, r5, r3, r7)
            goto L_0x0266
        L_0x0279:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r6 = r4.length
            if (r6 == 0) goto L_0x029c
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r4.length
            java.util.Iterator r4 = r4.iterator()
        L_0x0289:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x029c
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.setMax
            r7 = 0
            getMin(r6, r5, r3, r7)
            goto L_0x0289
        L_0x029c:
            r7 = 0
            if (r12 == 0) goto L_0x02b3
            java.util.Iterator r4 = r12.iterator()
        L_0x02a3:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02b3
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r6
            getMin(r6, r5, r3, r7)
            goto L_0x02a3
        L_0x02b3:
            r4 = 0
        L_0x02b4:
            if (r4 >= r2) goto L_0x02df
            java.lang.Object r6 = r1.get(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r6
            boolean r8 = r6.invokeSuspend()
            if (r8 == 0) goto L_0x02dc
            int r8 = r6.MediaBrowserCompat$MediaItem$Flags
            o.Dimension r8 = length(r3, r8)
            int r6 = r6.MediaDescriptionCompat
            o.Dimension r6 = length(r3, r6)
            if (r8 == 0) goto L_0x02dc
            if (r6 == 0) goto L_0x02dc
            r9 = 0
            r8.setMax(r9, r6)
            r9 = 2
            r6.getMax = r9
            r3.remove(r8)
        L_0x02dc:
            int r4 = r4 + 1
            goto L_0x02b4
        L_0x02df:
            int r1 = r3.size()
            if (r1 > r5) goto L_0x02e7
            r1 = 0
            return r1
        L_0x02e7:
            r1 = 0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.extraCommand
            r2 = r2[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r4) goto L_0x0331
            java.util.Iterator r2 = r3.iterator()
            r4 = r7
            r6 = 0
        L_0x02f6:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0323
            java.lang.Object r8 = r2.next()
            o.Dimension r8 = (o.Dimension) r8
            int r9 = r8.getMax
            if (r9 == r5) goto L_0x02f6
            r8.setMax = r1
            o.reportFullyDrawn r9 = r17.ICustomTabsCallback$Stub()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r10 = r8.setMin
            int r10 = r10.size()
            if (r10 != 0) goto L_0x0316
            r9 = 0
            goto L_0x031e
        L_0x0316:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r10 = r8.setMin
            int r16 = r8.setMax(r9, r10, r1)
            r9 = r16
        L_0x031e:
            if (r9 <= r6) goto L_0x02f6
            r4 = r8
            r6 = r9
            goto L_0x02f6
        L_0x0323:
            if (r4 == 0) goto L_0x0331
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r0.extraCommand
            r8[r1] = r2
            r0.getMax((int) r6)
            r4.setMax = r5
            goto L_0x0332
        L_0x0331:
            r4 = r7
        L_0x0332:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r0.extraCommand
            r1 = r1[r5]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x037a
            java.util.Iterator r1 = r3.iterator()
            r2 = r7
            r13 = 0
        L_0x0340:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x036c
            java.lang.Object r3 = r1.next()
            o.Dimension r3 = (o.Dimension) r3
            int r6 = r3.getMax
            if (r6 == 0) goto L_0x0340
            r6 = 0
            r3.setMax = r6
            o.reportFullyDrawn r6 = r17.ICustomTabsCallback$Stub()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r3.setMin
            int r8 = r8.size()
            if (r8 != 0) goto L_0x0361
            r6 = 0
            goto L_0x0367
        L_0x0361:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r3.setMin
            int r6 = r3.setMax(r6, r8, r5)
        L_0x0367:
            if (r6 <= r13) goto L_0x0340
            r2 = r3
            r13 = r6
            goto L_0x0340
        L_0x036c:
            if (r2 == 0) goto L_0x037a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r0.extraCommand
            r3[r5] = r1
            r0.toFloatRange(r13)
            r2.setMax = r5
            goto L_0x037b
        L_0x037a:
            r2 = r7
        L_0x037b:
            if (r4 != 0) goto L_0x0382
            if (r2 == 0) goto L_0x0380
            goto L_0x0382
        L_0x0380:
            r0 = 0
            return r0
        L_0x0382:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.codename.getMax(o.AnimRes, o.CheckResult$getMax):boolean");
    }
}
