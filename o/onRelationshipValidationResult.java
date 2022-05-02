package o;

public final class onRelationshipValidationResult {
    public static final onRelationshipValidationResult setMax = new onRelationshipValidationResult();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r1 != null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r1 == null) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.hideBackButton setMin(@org.jetbrains.annotations.NotNull o.hideBackButton r17, @org.jetbrains.annotations.NotNull o.asBinder r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.NotNull o.hideTitleLoading r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "emoneyCardAttribute"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "apduCommandProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r0.getMax = r2
            java.lang.String r4 = r3.IsOverlapping
            r0.setMax = r4
            java.lang.String r4 = r0.isInside
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            r6 = 16
            r8 = 0
            if (r4 == 0) goto L_0x002e
            java.lang.String r4 = r4.substring(r8, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            java.lang.String r9 = ""
            if (r4 != 0) goto L_0x0034
            r4 = r9
        L_0x0034:
            java.lang.String r10 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r10)
            r0.equals = r4
            java.lang.String r4 = r3.IsOverlapping
            java.lang.String r10 = "OLD"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r10)
            java.lang.String r11 = "cardNumber"
            r12 = 2
            r13 = 1
            r14 = 4
            java.lang.String r15 = "transactionId"
            java.lang.String r7 = "approvalCode"
            if (r4 == 0) goto L_0x00da
            kotlin.Pair[] r4 = new kotlin.Pair[r14]
            java.lang.String r14 = r3.setMin
            if (r14 != 0) goto L_0x0055
            r14 = r9
        L_0x0055:
            kotlin.Pair r14 = kotlin.TuplesKt.to(r15, r14)
            r4[r8] = r14
            java.lang.String r14 = "message"
            if (r2 == 0) goto L_0x0094
            int r15 = r19.hashCode()
            r10 = -838846263(0xffffffffce0038c9, float:-5.3780128E8)
            if (r15 == r10) goto L_0x0080
            r10 = -264500914(0xfffffffff03c094e, float:-2.3277772E29)
            if (r15 != r10) goto L_0x0094
            java.lang.String r10 = "reversal"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0094
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.toIntRange
            java.lang.Object r1 = r1.get(r14)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0092
            goto L_0x00ab
        L_0x0080:
            java.lang.String r10 = "update"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0094
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.toIntRange
            java.lang.Object r1 = r1.get(r14)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x00ab
        L_0x0092:
            r1 = r9
            goto L_0x00ab
        L_0x0094:
            o.ICustomTabsService r2 = o.ICustomTabsService.setMax
            android.nfc.tech.IsoDep r1 = r1.setMax
            java.lang.String r2 = "00B300003F"
            byte[] r2 = o.ICustomTabsService.length(r2)
            byte[] r1 = r1.transceive(r2)
            java.lang.String r2 = "isoDep.transceive(hexStringToByteArray(CARD_INFO))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r1 = o.ICustomTabsService.getMin(r1)
        L_0x00ab:
            kotlin.Pair r1 = kotlin.TuplesKt.to(r14, r1)
            r4[r13] = r1
            java.lang.String r1 = r3.toFloatRange
            if (r1 != 0) goto L_0x00b6
            r1 = r9
        L_0x00b6:
            kotlin.Pair r1 = kotlin.TuplesKt.to(r7, r1)
            r4[r12] = r1
            java.lang.String r1 = r0.isInside
            if (r1 == 0) goto L_0x00c8
            java.lang.String r7 = r1.substring(r8, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            goto L_0x00c9
        L_0x00c8:
            r7 = 0
        L_0x00c9:
            if (r7 != 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r9 = r7
        L_0x00cd:
            kotlin.Pair r1 = kotlin.TuplesKt.to(r11, r9)
            r2 = 3
            r4[r2] = r1
            java.util.Map r1 = kotlin.collections.MapsKt.mutableMapOf(r4)
            goto L_0x0184
        L_0x00da:
            r2 = 7
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            java.lang.String r4 = r3.setMin
            if (r4 != 0) goto L_0x00e2
            r4 = r9
        L_0x00e2:
            kotlin.Pair r4 = kotlin.TuplesKt.to(r15, r4)
            r2[r8] = r4
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.toIntRange
            java.lang.String r10 = "session"
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00f5
            r4 = r9
        L_0x00f5:
            kotlin.Pair r4 = kotlin.TuplesKt.to(r10, r4)
            r2[r13] = r4
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.toIntRange
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0106
            r4 = r9
        L_0x0106:
            java.util.Map<java.lang.String, java.lang.String> r10 = r3.toIntRange
            java.lang.String r13 = "amount"
            java.lang.Object r10 = r10.get(r13)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x011c
            java.util.Map<java.lang.String, java.lang.String> r10 = r3.toIntRange
            java.lang.String r13 = "pendingTopup"
            java.lang.Object r10 = r10.get(r13)
            java.lang.String r10 = (java.lang.String) r10
        L_0x011c:
            if (r10 == 0) goto L_0x0127
            int r10 = java.lang.Integer.parseInt(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x0128
        L_0x0127:
            r10 = 0
        L_0x0128:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = r1.length(r4, r10)
            java.lang.String r4 = "dataToSam"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r4, r1)
            r2[r12] = r1
            java.lang.String r1 = r0.setMin
            if (r1 != 0) goto L_0x013d
            r1 = r9
        L_0x013d:
            java.lang.String r4 = "cardAttribute"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r4, r1)
            r4 = 3
            r2[r4] = r1
            java.lang.String r1 = r0.isInside
            if (r1 == 0) goto L_0x0154
            java.lang.String r1 = r1.substring(r8, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r16 = r1
            goto L_0x0156
        L_0x0154:
            r16 = 0
        L_0x0156:
            if (r16 != 0) goto L_0x015a
            r1 = r9
            goto L_0x015c
        L_0x015a:
            r1 = r16
        L_0x015c:
            kotlin.Pair r1 = kotlin.TuplesKt.to(r11, r1)
            r2[r14] = r1
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.toIntRange
            java.lang.Object r1 = r1.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x016d
            goto L_0x016e
        L_0x016d:
            r9 = r1
        L_0x016e:
            kotlin.Pair r1 = kotlin.TuplesKt.to(r7, r9)
            r3 = 5
            r2[r3] = r1
            java.lang.String r1 = r0.IsOverlapping
            java.lang.String r3 = "lastBalance"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r3, r1)
            r3 = 6
            r2[r3] = r1
            java.util.Map r1 = kotlin.collections.MapsKt.mutableMapOf(r2)
        L_0x0184:
            r0.values = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRelationshipValidationResult.setMin(o.hideBackButton, o.asBinder, java.lang.String, o.hideTitleLoading):o.hideBackButton");
    }
}
