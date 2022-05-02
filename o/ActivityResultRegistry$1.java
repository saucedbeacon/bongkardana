package o;

public final class ActivityResultRegistry$1 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX WARNING: type inference failed for: r5v8, types: [androidx.constraintlayout.solver.SolverVariable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0494  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getMax(o.AnimRes r33, o.reportFullyDrawn r34, java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r35, int r36) {
        /*
            r0 = r33
            r10 = r34
            r11 = r35
            if (r36 != 0) goto L_0x0011
            int r1 = r0.MediaMetadataCompat$BitmapKey
            o.IntentSenderRequest[] r2 = r0.RatingCompat
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x0019
        L_0x0011:
            int r1 = r0.MediaMetadataCompat
            o.IntentSenderRequest[] r2 = r0.IMediaControllerCallback
            r14 = r1
            r15 = r2
            r16 = 2
        L_0x0019:
            r9 = 0
        L_0x001a:
            if (r9 >= r14) goto L_0x062e
            r1 = r15[r9]
            boolean r2 = r1.Grayscale$Algorithm
            if (r2 != 0) goto L_0x0025
            r1.getMin()
        L_0x0025:
            r2 = 1
            r1.Grayscale$Algorithm = r2
            if (r11 == 0) goto L_0x003c
            if (r11 == 0) goto L_0x0035
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r1.length
            boolean r3 = r11.contains(r3)
            if (r3 == 0) goto L_0x0035
            goto L_0x003c
        L_0x0035:
            r12 = r9
            r26 = r14
            r24 = r15
            goto L_0x0622
        L_0x003c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r1.length
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r1.getMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r1.setMin
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r1.getMin
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r1.setMax
            float r4 = r1.values
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r13 = r0.extraCommand
            r13 = r13[r36]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != r12) goto L_0x0052
            r12 = 1
            goto L_0x0053
        L_0x0052:
            r12 = 0
        L_0x0053:
            if (r36 != 0) goto L_0x0078
            int r13 = r3.cancelAll
            r18 = r4
            if (r13 != 0) goto L_0x005d
            r13 = 1
            goto L_0x005e
        L_0x005d:
            r13 = 0
        L_0x005e:
            int r4 = r3.cancelAll
            if (r4 != r2) goto L_0x0064
            r4 = 1
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            int r2 = r3.cancelAll
            r20 = r4
            r4 = 2
            if (r2 != r4) goto L_0x006e
            r2 = 1
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            r17 = r13
            r13 = r20
            r4 = 0
            r20 = r9
            r9 = r8
            goto L_0x0099
        L_0x0078:
            r18 = r4
            int r2 = r3.INotificationSideChannel$Stub$Proxy
            if (r2 != 0) goto L_0x0080
            r2 = 1
            goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            int r4 = r3.INotificationSideChannel$Stub$Proxy
            r13 = 1
            if (r4 != r13) goto L_0x0088
            r4 = 1
            goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            int r13 = r3.INotificationSideChannel$Stub$Proxy
            r20 = r9
            r9 = 2
            if (r13 != r9) goto L_0x0092
            r13 = 1
            goto L_0x0093
        L_0x0092:
            r13 = 0
        L_0x0093:
            r17 = r2
            r9 = r8
            r2 = r13
            r13 = r4
            r4 = 0
        L_0x0099:
            r23 = 0
            if (r4 != 0) goto L_0x018a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r11 = r9.newSession
            r11 = r11[r16]
            if (r2 == 0) goto L_0x00a6
            r22 = 1
            goto L_0x00a8
        L_0x00a6:
            r22 = 4
        L_0x00a8:
            int r24 = r11.getMin()
            r25 = r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r9.extraCommand
            r4 = r4[r36]
            r26 = r14
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r14) goto L_0x00c0
            int[] r4 = r9.valueOf
            r4 = r4[r36]
            if (r4 != 0) goto L_0x00c0
            r4 = 1
            goto L_0x00c1
        L_0x00c0:
            r4 = 0
        L_0x00c1:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r11.toIntRange
            if (r14 == 0) goto L_0x00cf
            if (r9 == r8) goto L_0x00cf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r11.toIntRange
            int r14 = r14.getMin()
            int r24 = r24 + r14
        L_0x00cf:
            r14 = r24
            if (r2 == 0) goto L_0x00dc
            if (r9 == r8) goto L_0x00dc
            if (r9 == r6) goto L_0x00dc
            r24 = r15
            r22 = 8
            goto L_0x00de
        L_0x00dc:
            r24 = r15
        L_0x00de:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r11.toIntRange
            if (r15 == 0) goto L_0x0114
            if (r9 != r6) goto L_0x00f3
            androidx.constraintlayout.solver.SolverVariable r15 = r11.IsOverlapping
            r27 = r13
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r11.toIntRange
            androidx.constraintlayout.solver.SolverVariable r13 = r13.IsOverlapping
            r28 = r3
            r3 = 6
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r15, (androidx.constraintlayout.solver.SolverVariable) r13, (int) r14, (int) r3)
            goto L_0x0102
        L_0x00f3:
            r28 = r3
            r27 = r13
            androidx.constraintlayout.solver.SolverVariable r3 = r11.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r11.toIntRange
            androidx.constraintlayout.solver.SolverVariable r13 = r13.IsOverlapping
            r15 = 8
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r3, (androidx.constraintlayout.solver.SolverVariable) r13, (int) r14, (int) r15)
        L_0x0102:
            if (r4 == 0) goto L_0x0108
            if (r2 != 0) goto L_0x0108
            r3 = 5
            goto L_0x010a
        L_0x0108:
            r3 = r22
        L_0x010a:
            androidx.constraintlayout.solver.SolverVariable r4 = r11.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.toIntRange
            androidx.constraintlayout.solver.SolverVariable r11 = r11.IsOverlapping
            r10.getMax(r4, r11, r14, r3)
            goto L_0x0118
        L_0x0114:
            r28 = r3
            r27 = r13
        L_0x0118:
            if (r12 == 0) goto L_0x014e
            int r3 = r9.areNotificationsEnabled
            r4 = 8
            if (r3 == r4) goto L_0x013c
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r9.extraCommand
            r3 = r3[r36]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x013c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r9.newSession
            int r4 = r16 + 1
            r3 = r3[r4]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r9.newSession
            r4 = r4[r16]
            androidx.constraintlayout.solver.SolverVariable r4 = r4.IsOverlapping
            r11 = 5
            r13 = 0
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r3, (androidx.constraintlayout.solver.SolverVariable) r4, (int) r13, (int) r11)
            goto L_0x013d
        L_0x013c:
            r13 = 0
        L_0x013d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r9.newSession
            r3 = r3[r16]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r0.newSession
            r4 = r4[r16]
            androidx.constraintlayout.solver.SolverVariable r4 = r4.IsOverlapping
            r11 = 8
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r3, (androidx.constraintlayout.solver.SolverVariable) r4, (int) r13, (int) r11)
        L_0x014e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r9.newSession
            int r4 = r16 + 1
            r3 = r3[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.toIntRange
            if (r3 == 0) goto L_0x016f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.setMax
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r3.newSession
            r4 = r4[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.toIntRange
            if (r4 == 0) goto L_0x016f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r3.newSession
            r4 = r4[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.toIntRange
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r4.setMax
            if (r4 == r9) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r23 = r3
        L_0x016f:
            if (r23 == 0) goto L_0x017f
            r9 = r23
            r15 = r24
            r4 = r25
            r14 = r26
            r13 = r27
            r3 = r28
            goto L_0x0099
        L_0x017f:
            r15 = r24
            r14 = r26
            r13 = r27
            r3 = r28
            r4 = 1
            goto L_0x0099
        L_0x018a:
            r28 = r3
            r27 = r13
            r26 = r14
            r24 = r15
            if (r5 == 0) goto L_0x01f7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r7.newSession
            int r4 = r16 + 1
            r3 = r3[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.toIntRange
            if (r3 == 0) goto L_0x01f7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r5.newSession
            r3 = r3[r4]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r5.extraCommand
            r9 = r9[r36]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x01b2
            int[] r9 = r5.valueOf
            r9 = r9[r36]
            if (r9 != 0) goto L_0x01b2
            r9 = 1
            goto L_0x01b3
        L_0x01b2:
            r9 = 0
        L_0x01b3:
            if (r9 == 0) goto L_0x01cd
            if (r2 != 0) goto L_0x01cd
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.toIntRange
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r9.setMax
            if (r9 != r0) goto L_0x01cd
            androidx.constraintlayout.solver.SolverVariable r9 = r3.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.toIntRange
            androidx.constraintlayout.solver.SolverVariable r11 = r11.IsOverlapping
            int r13 = r3.getMin()
            int r13 = -r13
            r14 = 5
            r10.getMax(r9, r11, r13, r14)
            goto L_0x01e4
        L_0x01cd:
            if (r2 == 0) goto L_0x01e4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r3.toIntRange
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r9.setMax
            if (r9 != r0) goto L_0x01e4
            androidx.constraintlayout.solver.SolverVariable r9 = r3.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.toIntRange
            androidx.constraintlayout.solver.SolverVariable r11 = r11.IsOverlapping
            int r13 = r3.getMin()
            int r13 = -r13
            r14 = 4
            r10.getMax(r9, r11, r13, r14)
        L_0x01e4:
            androidx.constraintlayout.solver.SolverVariable r9 = r3.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r11 = r7.newSession
            r4 = r11[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.toIntRange
            androidx.constraintlayout.solver.SolverVariable r4 = r4.IsOverlapping
            int r3 = r3.getMin()
            int r3 = -r3
            r11 = 6
            r10.getMin(r9, r4, r3, r11)
        L_0x01f7:
            if (r12 == 0) goto L_0x0214
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r0.newSession
            int r4 = r16 + 1
            r3 = r3[r4]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r7.newSession
            r9 = r9[r4]
            androidx.constraintlayout.solver.SolverVariable r9 = r9.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r11 = r7.newSession
            r4 = r11[r4]
            int r4 = r4.getMin()
            r11 = 8
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r3, (androidx.constraintlayout.solver.SolverVariable) r9, (int) r4, (int) r11)
        L_0x0214:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r1.toIntRange
            if (r3 == 0) goto L_0x0330
            int r4 = r3.size()
            r9 = 1
            if (r4 <= r9) goto L_0x0330
            boolean r11 = r1.invokeSuspend
            if (r11 == 0) goto L_0x022c
            boolean r11 = r1.invoke
            if (r11 != 0) goto L_0x022c
            int r11 = r1.equals
            float r11 = (float) r11
            r18 = r11
        L_0x022c:
            r11 = 0
            r12 = r23
            r13 = 0
            r14 = 0
        L_0x0231:
            if (r13 >= r4) goto L_0x0330
            java.lang.Object r15 = r3.get(r13)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            float[] r9 = r15.IconCompatParcelizer
            r9 = r9[r36]
            int r21 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r21 >= 0) goto L_0x025d
            boolean r9 = r1.invoke
            if (r9 == 0) goto L_0x0259
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r15.newSession
            int r9 = r16 + 1
            r0 = r0[r9]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r15.newSession
            r9 = r9[r16]
            androidx.constraintlayout.solver.SolverVariable r9 = r9.IsOverlapping
            r11 = 0
            r15 = 4
            r10.getMax(r0, r9, r11, r15)
            goto L_0x0278
        L_0x0259:
            r11 = 4
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x025e
        L_0x025d:
            r11 = 4
        L_0x025e:
            r21 = 0
            int r22 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r22 != 0) goto L_0x0280
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r15.newSession
            int r9 = r16 + 1
            r0 = r0[r9]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r15.newSession
            r9 = r9[r16]
            androidx.constraintlayout.solver.SolverVariable r9 = r9.IsOverlapping
            r11 = 0
            r15 = 8
            r10.getMax(r0, r9, r11, r15)
        L_0x0278:
            r21 = r1
            r29 = r3
            r25 = r4
            goto L_0x0322
        L_0x0280:
            r11 = 0
            if (r12 == 0) goto L_0x0317
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r11 = r12.newSession
            r11 = r11[r16]
            androidx.constraintlayout.solver.SolverVariable r11 = r11.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r12 = r12.newSession
            int r25 = r16 + 1
            r12 = r12[r25]
            androidx.constraintlayout.solver.SolverVariable r12 = r12.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r15.newSession
            r0 = r0[r16]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.IsOverlapping
            r29 = r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r15.newSession
            r3 = r3[r25]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.IsOverlapping
            r25 = r4
            o.registerForActivityResult r4 = r34.length()
            r30 = r15
            r15 = 0
            r4.setMin = r15
            r21 = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r31 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r31 == 0) goto L_0x02fb
            int r31 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r31 != 0) goto L_0x02b7
            goto L_0x02fb
        L_0x02b7:
            int r31 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r31 != 0) goto L_0x02c8
            o.registerForActivityResult$getMin r0 = r4.length
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.length(r11, r3)
            o.registerForActivityResult$getMin r0 = r4.length
            r0.length(r12, r1)
            goto L_0x0313
        L_0x02c8:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r31 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r31 != 0) goto L_0x02db
            o.registerForActivityResult$getMin r11 = r4.length
            r11.length(r0, r1)
            o.registerForActivityResult$getMin r0 = r4.length
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.length(r3, r1)
            goto L_0x0313
        L_0x02db:
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r14 = r14 / r18
            float r31 = r9 / r18
            float r14 = r14 / r31
            o.registerForActivityResult$getMin r15 = r4.length
            r15.length(r11, r1)
            o.registerForActivityResult$getMin r1 = r4.length
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.length(r12, r15)
            o.registerForActivityResult$getMin r1 = r4.length
            r1.length(r3, r14)
            o.registerForActivityResult$getMin r1 = r4.length
            float r3 = -r14
            r1.length(r0, r3)
            goto L_0x0313
        L_0x02fb:
            r1 = 1065353216(0x3f800000, float:1.0)
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            o.registerForActivityResult$getMin r14 = r4.length
            r14.length(r11, r1)
            o.registerForActivityResult$getMin r11 = r4.length
            r11.length(r12, r15)
            o.registerForActivityResult$getMin r11 = r4.length
            r11.length(r3, r1)
            o.registerForActivityResult$getMin r1 = r4.length
            r1.length(r0, r15)
        L_0x0313:
            r10.getMin((o.registerForActivityResult) r4)
            goto L_0x031f
        L_0x0317:
            r21 = r1
            r29 = r3
            r25 = r4
            r30 = r15
        L_0x031f:
            r14 = r9
            r12 = r30
        L_0x0322:
            int r13 = r13 + 1
            r9 = 1
            r11 = 0
            r0 = r33
            r1 = r21
            r4 = r25
            r3 = r29
            goto L_0x0231
        L_0x0330:
            r21 = r1
            if (r6 == 0) goto L_0x0399
            if (r6 == r5) goto L_0x0338
            if (r2 == 0) goto L_0x0399
        L_0x0338:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r8.newSession
            r0 = r0[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r7.newSession
            int r2 = r16 + 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.toIntRange
            if (r3 == 0) goto L_0x034c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.toIntRange
            androidx.constraintlayout.solver.SolverVariable r0 = r0.IsOverlapping
            r3 = r0
            goto L_0x034e
        L_0x034c:
            r3 = r23
        L_0x034e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.toIntRange
            if (r0 == 0) goto L_0x0357
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.toIntRange
            androidx.constraintlayout.solver.SolverVariable r0 = r0.IsOverlapping
            goto L_0x0359
        L_0x0357:
            r0 = r23
        L_0x0359:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r6.newSession
            r1 = r1[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r5.newSession
            r2 = r4[r2]
            if (r3 == 0) goto L_0x0391
            if (r0 == 0) goto L_0x0391
            if (r36 != 0) goto L_0x036c
            r4 = r28
            float r4 = r4.ITrustedWebActivityCallback$Default
            goto L_0x0370
        L_0x036c:
            r4 = r28
            float r4 = r4.ITrustedWebActivityCallback$Stub
        L_0x0370:
            r8 = r4
            int r4 = r1.getMin()
            int r9 = r2.getMin()
            androidx.constraintlayout.solver.SolverVariable r11 = r1.IsOverlapping
            androidx.constraintlayout.solver.SolverVariable r12 = r2.IsOverlapping
            r13 = 7
            r1 = r34
            r2 = r11
            r11 = r5
            r5 = r8
            r14 = r6
            r6 = r0
            r0 = r7
            r7 = r12
            r8 = r9
            r12 = r20
            r15 = 2
            r9 = r13
            r1.getMin(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x05b5
        L_0x0391:
            r11 = r5
            r14 = r6
            r0 = r7
            r12 = r20
            r15 = 2
            goto L_0x05b5
        L_0x0399:
            r11 = r5
            r14 = r6
            r0 = r7
            r12 = r20
            r15 = 2
            if (r17 == 0) goto L_0x049c
            if (r14 == 0) goto L_0x049c
            r1 = r21
            int r2 = r1.equals
            if (r2 <= 0) goto L_0x03b2
            int r2 = r1.IsOverlapping
            int r1 = r1.equals
            if (r2 != r1) goto L_0x03b2
            r19 = 1
            goto L_0x03b4
        L_0x03b2:
            r19 = 0
        L_0x03b4:
            r9 = r14
            r13 = r9
        L_0x03b6:
            if (r13 == 0) goto L_0x05b5
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r13.MediaBrowserCompat$CustomActionResultReceiver
            r1 = r1[r36]
            r7 = r1
        L_0x03bd:
            if (r7 == 0) goto L_0x03ca
            int r1 = r7.areNotificationsEnabled
            r2 = 8
            if (r1 != r2) goto L_0x03ca
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r7 = r1[r36]
            goto L_0x03bd
        L_0x03ca:
            if (r7 != 0) goto L_0x03d6
            if (r13 != r11) goto L_0x03cf
            goto L_0x03d6
        L_0x03cf:
            r15 = r7
            r32 = r8
        L_0x03d2:
            r18 = r9
            goto L_0x048c
        L_0x03d6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r13.newSession
            r1 = r1[r16]
            androidx.constraintlayout.solver.SolverVariable r2 = r1.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.toIntRange
            if (r3 == 0) goto L_0x03e5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.toIntRange
            androidx.constraintlayout.solver.SolverVariable r3 = r3.IsOverlapping
            goto L_0x03e7
        L_0x03e5:
            r3 = r23
        L_0x03e7:
            if (r9 == r13) goto L_0x03f2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r9.newSession
            int r4 = r16 + 1
            r3 = r3[r4]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.IsOverlapping
            goto L_0x0409
        L_0x03f2:
            if (r13 != r14) goto L_0x0409
            if (r9 != r13) goto L_0x0409
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r8.newSession
            r3 = r3[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.toIntRange
            if (r3 == 0) goto L_0x0407
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r8.newSession
            r3 = r3[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.toIntRange
            androidx.constraintlayout.solver.SolverVariable r3 = r3.IsOverlapping
            goto L_0x0409
        L_0x0407:
            r3 = r23
        L_0x0409:
            int r1 = r1.getMin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r13.newSession
            int r5 = r16 + 1
            r4 = r4[r5]
            int r4 = r4.getMin()
            if (r7 == 0) goto L_0x0422
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r7.newSession
            r6 = r6[r16]
            androidx.constraintlayout.solver.SolverVariable r15 = r6.IsOverlapping
        L_0x041f:
            r18 = r7
            goto L_0x0431
        L_0x0422:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r0.newSession
            r6 = r6[r5]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.toIntRange
            if (r6 == 0) goto L_0x042d
            androidx.constraintlayout.solver.SolverVariable r15 = r6.IsOverlapping
            goto L_0x041f
        L_0x042d:
            r18 = r7
            r15 = r23
        L_0x0431:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r13.newSession
            r7 = r7[r5]
            androidx.constraintlayout.solver.SolverVariable r7 = r7.IsOverlapping
            if (r6 == 0) goto L_0x043e
            int r6 = r6.getMin()
            int r4 = r4 + r6
        L_0x043e:
            if (r9 == 0) goto L_0x0449
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r9.newSession
            r6 = r6[r5]
            int r6 = r6.getMin()
            int r1 = r1 + r6
        L_0x0449:
            if (r2 == 0) goto L_0x0486
            if (r3 == 0) goto L_0x0486
            if (r15 == 0) goto L_0x0486
            if (r7 == 0) goto L_0x0486
            if (r13 != r14) goto L_0x045b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r14.newSession
            r1 = r1[r16]
            int r1 = r1.getMin()
        L_0x045b:
            r6 = r1
            if (r13 != r11) goto L_0x0469
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r11.newSession
            r1 = r1[r5]
            int r1 = r1.getMin()
            r20 = r1
            goto L_0x046b
        L_0x0469:
            r20 = r4
        L_0x046b:
            if (r19 == 0) goto L_0x0470
            r21 = 8
            goto L_0x0472
        L_0x0470:
            r21 = 5
        L_0x0472:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r34
            r4 = r6
            r6 = r15
            r15 = r18
            r32 = r8
            r8 = r20
            r18 = r9
            r9 = r21
            r1.getMin(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x048c
        L_0x0486:
            r32 = r8
            r15 = r18
            goto L_0x03d2
        L_0x048c:
            int r1 = r13.areNotificationsEnabled
            r2 = 8
            if (r1 == r2) goto L_0x0494
            r9 = r13
            goto L_0x0496
        L_0x0494:
            r9 = r18
        L_0x0496:
            r13 = r15
            r8 = r32
            r15 = 2
            goto L_0x03b6
        L_0x049c:
            r32 = r8
            r1 = r21
            if (r27 == 0) goto L_0x05b5
            if (r14 == 0) goto L_0x05b5
            int r2 = r1.equals
            if (r2 <= 0) goto L_0x04b1
            int r2 = r1.IsOverlapping
            int r1 = r1.equals
            if (r2 != r1) goto L_0x04b1
            r19 = 1
            goto L_0x04b3
        L_0x04b1:
            r19 = 0
        L_0x04b3:
            r13 = r14
            r15 = r13
        L_0x04b5:
            if (r13 == 0) goto L_0x0557
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r13.MediaBrowserCompat$CustomActionResultReceiver
            r1 = r1[r36]
        L_0x04bb:
            if (r1 == 0) goto L_0x04c8
            int r2 = r1.areNotificationsEnabled
            r3 = 8
            if (r2 != r3) goto L_0x04c8
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r1 = r1[r36]
            goto L_0x04bb
        L_0x04c8:
            if (r13 == r14) goto L_0x054c
            if (r13 == r11) goto L_0x054c
            if (r1 == 0) goto L_0x054c
            if (r1 != r11) goto L_0x04d3
            r9 = r23
            goto L_0x04d4
        L_0x04d3:
            r9 = r1
        L_0x04d4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r13.newSession
            r1 = r1[r16]
            androidx.constraintlayout.solver.SolverVariable r2 = r1.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r15.newSession
            int r4 = r16 + 1
            r3 = r3[r4]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.IsOverlapping
            int r1 = r1.getMin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r13.newSession
            r5 = r5[r4]
            int r5 = r5.getMin()
            if (r9 == 0) goto L_0x0502
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r9.newSession
            r6 = r6[r16]
            androidx.constraintlayout.solver.SolverVariable r7 = r6.IsOverlapping
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r6.toIntRange
            if (r8 == 0) goto L_0x04ff
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r6.toIntRange
            androidx.constraintlayout.solver.SolverVariable r8 = r8.IsOverlapping
            goto L_0x0513
        L_0x04ff:
            r8 = r23
            goto L_0x0513
        L_0x0502:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r11.newSession
            r6 = r6[r16]
            if (r6 == 0) goto L_0x050b
            androidx.constraintlayout.solver.SolverVariable r7 = r6.IsOverlapping
            goto L_0x050d
        L_0x050b:
            r7 = r23
        L_0x050d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r13.newSession
            r8 = r8[r4]
            androidx.constraintlayout.solver.SolverVariable r8 = r8.IsOverlapping
        L_0x0513:
            if (r6 == 0) goto L_0x051a
            int r6 = r6.getMin()
            int r5 = r5 + r6
        L_0x051a:
            r18 = r5
            if (r15 == 0) goto L_0x0527
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r15.newSession
            r4 = r5[r4]
            int r4 = r4.getMin()
            int r1 = r1 + r4
        L_0x0527:
            r4 = r1
            if (r19 == 0) goto L_0x052d
            r20 = 8
            goto L_0x052f
        L_0x052d:
            r20 = 4
        L_0x052f:
            if (r2 == 0) goto L_0x0547
            if (r3 == 0) goto L_0x0547
            if (r7 == 0) goto L_0x0547
            if (r8 == 0) goto L_0x0547
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r34
            r6 = r7
            r7 = r8
            r8 = r18
            r18 = r9
            r9 = r20
            r1.getMin(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0549
        L_0x0547:
            r18 = r9
        L_0x0549:
            r6 = r18
            goto L_0x054d
        L_0x054c:
            r6 = r1
        L_0x054d:
            int r1 = r13.areNotificationsEnabled
            r2 = 8
            if (r1 == r2) goto L_0x0554
            r15 = r13
        L_0x0554:
            r13 = r6
            goto L_0x04b5
        L_0x0557:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r14.newSession
            r1 = r1[r16]
            r2 = r32
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.newSession
            r2 = r2[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.toIntRange
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r11.newSession
            int r4 = r16 + 1
            r13 = r3[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r0.newSession
            r3 = r3[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r3.toIntRange
            if (r2 == 0) goto L_0x05a4
            if (r14 == r11) goto L_0x0580
            androidx.constraintlayout.solver.SolverVariable r3 = r1.IsOverlapping
            androidx.constraintlayout.solver.SolverVariable r2 = r2.IsOverlapping
            int r1 = r1.getMin()
            r4 = 5
            r10.getMax(r3, r2, r1, r4)
            goto L_0x05a4
        L_0x0580:
            if (r15 == 0) goto L_0x05a4
            androidx.constraintlayout.solver.SolverVariable r3 = r1.IsOverlapping
            androidx.constraintlayout.solver.SolverVariable r4 = r2.IsOverlapping
            int r5 = r1.getMin()
            r6 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.solver.SolverVariable r7 = r13.IsOverlapping
            androidx.constraintlayout.solver.SolverVariable r8 = r15.IsOverlapping
            int r9 = r13.getMin()
            r18 = 5
            r1 = r34
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r18
            r1.getMin(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x05a4:
            if (r15 == 0) goto L_0x05b5
            if (r14 == r11) goto L_0x05b5
            androidx.constraintlayout.solver.SolverVariable r1 = r13.IsOverlapping
            androidx.constraintlayout.solver.SolverVariable r2 = r15.IsOverlapping
            int r3 = r13.getMin()
            int r3 = -r3
            r4 = 5
            r10.getMax(r1, r2, r3, r4)
        L_0x05b5:
            if (r17 != 0) goto L_0x05b9
            if (r27 == 0) goto L_0x0622
        L_0x05b9:
            if (r14 == 0) goto L_0x0622
            if (r14 == r11) goto L_0x0622
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r14.newSession
            r1 = r1[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.newSession
            int r3 = r16 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.toIntRange
            if (r4 == 0) goto L_0x05d0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.toIntRange
            androidx.constraintlayout.solver.SolverVariable r4 = r4.IsOverlapping
            goto L_0x05d2
        L_0x05d0:
            r4 = r23
        L_0x05d2:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r2.toIntRange
            if (r5 == 0) goto L_0x05db
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r2.toIntRange
            androidx.constraintlayout.solver.SolverVariable r5 = r5.IsOverlapping
            goto L_0x05dd
        L_0x05db:
            r5 = r23
        L_0x05dd:
            if (r0 == r11) goto L_0x05f0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r0.newSession
            r5 = r5[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r5.toIntRange
            if (r6 == 0) goto L_0x05ed
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.toIntRange
            androidx.constraintlayout.solver.SolverVariable r5 = r5.IsOverlapping
            r23 = r5
        L_0x05ed:
            r6 = r23
            goto L_0x05f1
        L_0x05f0:
            r6 = r5
        L_0x05f1:
            if (r14 != r11) goto L_0x05fb
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r14.newSession
            r1 = r1[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r14.newSession
            r2 = r2[r3]
        L_0x05fb:
            if (r4 == 0) goto L_0x0622
            if (r6 == 0) goto L_0x0622
            int r5 = r1.getMin()
            if (r11 != 0) goto L_0x0607
            r7 = r0
            goto L_0x0608
        L_0x0607:
            r7 = r11
        L_0x0608:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r7.newSession
            r0 = r0[r3]
            int r8 = r0.getMin()
            androidx.constraintlayout.solver.SolverVariable r0 = r1.IsOverlapping
            r7 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.solver.SolverVariable r9 = r2.IsOverlapping
            r11 = 5
            r1 = r34
            r2 = r0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r9
            r9 = r11
            r1.getMin(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0622:
            int r9 = r12 + 1
            r0 = r33
            r11 = r35
            r15 = r24
            r14 = r26
            goto L_0x001a
        L_0x062e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ActivityResultRegistry$1.getMax(o.AnimRes, o.reportFullyDrawn, java.util.ArrayList, int):void");
    }
}
