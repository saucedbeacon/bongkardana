package o;

public final class onNestedFling extends setOnMenuItemClickListener {
    public int length = 80;
    private float setMax = 3.0f;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        if (r6 != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        r15 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r6 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long setMax(android.view.ViewGroup r18, androidx.transition.Transition r19, o.hasIcon r20, o.hasIcon r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L_0x000b
            if (r21 != 0) goto L_0x000b
            return r2
        L_0x000b:
            android.graphics.Rect r4 = r19.getEpicenter()
            r5 = -1
            r6 = 1
            if (r21 == 0) goto L_0x0030
            r7 = 8
            if (r1 != 0) goto L_0x0018
            goto L_0x0029
        L_0x0018:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r1.setMax
            java.lang.String r9 = "android:visibilityPropagation:visibility"
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            int r7 = r8.intValue()
        L_0x0029:
            if (r7 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            r1 = r21
            r7 = 1
            goto L_0x0031
        L_0x0030:
            r7 = -1
        L_0x0031:
            java.lang.String r8 = "android:visibilityPropagation:center"
            r9 = 0
            if (r1 != 0) goto L_0x0038
        L_0x0036:
            r10 = -1
            goto L_0x0045
        L_0x0038:
            java.util.Map<java.lang.String, java.lang.Object> r10 = r1.setMax
            java.lang.Object r10 = r10.get(r8)
            int[] r10 = (int[]) r10
            if (r10 != 0) goto L_0x0043
            goto L_0x0036
        L_0x0043:
            r10 = r10[r9]
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.setMax
            java.lang.Object r1 = r1.get(r8)
            int[] r1 = (int[]) r1
            if (r1 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r5 = r1[r6]
        L_0x0055:
            r1 = 2
            int[] r8 = new int[r1]
            r11 = r18
            r11.getLocationOnScreen(r8)
            r12 = r8[r9]
            float r13 = r18.getTranslationX()
            int r13 = java.lang.Math.round(r13)
            int r12 = r12 + r13
            r8 = r8[r6]
            float r13 = r18.getTranslationY()
            int r13 = java.lang.Math.round(r13)
            int r8 = r8 + r13
            int r13 = r18.getWidth()
            int r13 = r13 + r12
            int r14 = r18.getHeight()
            int r14 = r14 + r8
            if (r4 == 0) goto L_0x0088
            int r1 = r4.centerX()
            int r4 = r4.centerY()
            goto L_0x0094
        L_0x0088:
            int r4 = r12 + r13
            int r4 = r4 / r1
            int r15 = r8 + r14
            int r1 = r15 / 2
            r16 = r4
            r4 = r1
            r1 = r16
        L_0x0094:
            int r15 = r0.length
            r9 = 8388613(0x800005, float:1.175495E-38)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r3 = 3
            if (r15 != r2) goto L_0x00ad
            int r15 = androidx.core.view.ViewCompat.IsOverlapping(r18)
            if (r15 != r6) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            if (r6 == 0) goto L_0x00ab
        L_0x00a9:
            r15 = 5
            goto L_0x00ba
        L_0x00ab:
            r15 = 3
            goto L_0x00ba
        L_0x00ad:
            if (r15 != r9) goto L_0x00ba
            int r15 = androidx.core.view.ViewCompat.IsOverlapping(r18)
            if (r15 != r6) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            if (r6 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00ba:
            if (r15 == r3) goto L_0x00e1
            r6 = 5
            if (r15 == r6) goto L_0x00d9
            r4 = 48
            if (r15 == r4) goto L_0x00d1
            r4 = 80
            if (r15 == r4) goto L_0x00c9
            r1 = 0
            goto L_0x00e8
        L_0x00c9:
            int r5 = r5 - r8
            int r1 = r1 - r10
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + r5
            goto L_0x00e8
        L_0x00d1:
            int r14 = r14 - r5
            int r1 = r1 - r10
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + r14
            goto L_0x00e8
        L_0x00d9:
            int r10 = r10 - r12
            int r4 = r4 - r5
            int r1 = java.lang.Math.abs(r4)
            int r1 = r1 + r10
            goto L_0x00e8
        L_0x00e1:
            int r13 = r13 - r10
            int r4 = r4 - r5
            int r1 = java.lang.Math.abs(r4)
            int r1 = r1 + r13
        L_0x00e8:
            float r1 = (float) r1
            int r4 = r0.length
            if (r4 == r3) goto L_0x00f9
            r3 = 5
            if (r4 == r3) goto L_0x00f9
            if (r4 == r2) goto L_0x00f9
            if (r4 == r9) goto L_0x00f9
            int r2 = r18.getHeight()
            goto L_0x00fd
        L_0x00f9:
            int r2 = r18.getWidth()
        L_0x00fd:
            float r2 = (float) r2
            float r1 = r1 / r2
            long r2 = r19.getDuration()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x010b
            r2 = 300(0x12c, double:1.48E-321)
        L_0x010b:
            long r4 = (long) r7
            long r2 = r2 * r4
            float r2 = (float) r2
            float r3 = r0.setMax
            float r2 = r2 / r3
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            long r1 = (long) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onNestedFling.setMax(android.view.ViewGroup, androidx.transition.Transition, o.hasIcon, o.hasIcon):long");
    }
}
