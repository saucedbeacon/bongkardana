package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/twilio/verify/domain/challenge/ChallengeMapper;", "", "()V", "fromApi", "Lcom/twilio/verify/models/Challenge;", "jsonObject", "Lorg/json/JSONObject;", "signatureFieldsHeader", "", "toChallengeDetails", "Lcom/twilio/verify/models/ChallengeDetails;", "details", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class setAutoMeasureEnabled {
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010d A[Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010f A[Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112 A[Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0113 A[Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0116 A[Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012c A[Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }] */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.detachAndScrapViewAt setMax(@org.jetbrains.annotations.NotNull org.json.JSONObject r23, @org.jetbrains.annotations.Nullable java.lang.String r24) throws com.twilio.verify.TwilioVerifyException {
        /*
            r0 = r23
            java.lang.String r1 = "message"
            java.lang.String r2 = "details"
            java.lang.String r3 = "jsonObject"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r4 = "date_created"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r5 = "date_updated"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            com.twilio.verify.models.ChallengeStatus[] r6 = com.twilio.verify.models.ChallengeStatus.values()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            int r7 = r6.length     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r9 = 0
        L_0x0021:
            r10 = 0
            if (r9 >= r7) goto L_0x003b
            r11 = r6[r9]     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r12 = r11.getValue()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r13 = "status"
            java.lang.String r13 = r0.getString(r13)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            if (r12 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            int r9 = r9 + 1
            goto L_0x0021
        L_0x003b:
            r11 = r10
        L_0x003c:
            if (r11 != 0) goto L_0x0040
            com.twilio.verify.models.ChallengeStatus r11 = com.twilio.verify.models.ChallengeStatus.Expired     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
        L_0x0040:
            com.twilio.verify.models.ChallengeStatus r6 = com.twilio.verify.models.ChallengeStatus.Pending     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            if (r11 != r6) goto L_0x005d
            if (r24 == 0) goto L_0x005d
            r12 = r24
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r6 = ","
            java.lang.String[] r13 = new java.lang.String[]{r6}     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            java.util.List r6 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r12, (java.lang.String[]) r13, (boolean) r14, (int) r15, (int) r16, (java.lang.Object) r17)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r21 = r6
            goto L_0x005f
        L_0x005d:
            r21 = r10
        L_0x005f:
            com.twilio.verify.models.ChallengeStatus r6 = com.twilio.verify.models.ChallengeStatus.Pending     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            if (r11 != r6) goto L_0x0068
            if (r21 == 0) goto L_0x0068
            r22 = r0
            goto L_0x006a
        L_0x0068:
            r22 = r10
        L_0x006a:
            java.lang.String r6 = "sid"
            java.lang.String r13 = r0.getString(r6)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r6 = "jsonObject.getString(sidKey)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r13, r6)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r6 = "factor_sid"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r7 = "jsonObject.getString(factorSidKey)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r7)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r7 = "expiration_date"
            java.lang.String r7 = r0.getString(r7)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r9 = "jsonObject.getString(expirationDateKey)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r9)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.util.Date r20 = o.onItemRangeRemoved.setMax(r7)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r7 = "createdDate"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r7)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.util.Date r18 = o.onItemRangeRemoved.setMax(r4)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r4 = "updatedDate"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r4)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.util.Date r19 = o.onItemRangeRemoved.setMax(r5)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r2)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r2 = r3.getString(r1)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r4 = "fields"
            org.json.JSONArray r4 = r3.optJSONArray(r4)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            if (r4 == 0) goto L_0x00f5
            int r7 = r4.length()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            if (r7 <= 0) goto L_0x00ba
            r7 = 1
            goto L_0x00bb
        L_0x00ba:
            r7 = 0
        L_0x00bb:
            if (r7 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r4 = r10
        L_0x00bf:
            if (r4 == 0) goto L_0x00f5
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r7.<init>()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.util.List r7 = (java.util.List) r7     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            int r9 = r4.length()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r12 = 0
        L_0x00cd:
            if (r12 >= r9) goto L_0x00f9
            org.json.JSONObject r14 = r4.getJSONObject(r12)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            o.getHeightMode r15 = new o.getHeightMode     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r5 = "label"
            java.lang.String r5 = r14.getString(r5)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r8 = "jsonObject.getString(labelKey)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r8)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r8 = "value"
            java.lang.String r8 = r14.getString(r8)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r14 = "jsonObject.getString(valueKey)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r14)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r15.<init>(r5, r8)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r7.add(r15)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            int r12 = r12 + 1
            goto L_0x00cd
        L_0x00f5:
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
        L_0x00f9:
            java.lang.String r4 = "date"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            int r4 = r4.length()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            if (r4 <= 0) goto L_0x010f
            r8 = 1
            goto L_0x0110
        L_0x010f:
            r8 = 0
        L_0x0110:
            if (r8 == 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r3 = r10
        L_0x0114:
            if (r3 == 0) goto L_0x011b
            java.util.Date r3 = o.onItemRangeRemoved.setMax(r3)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            goto L_0x011c
        L_0x011b:
            r3 = r10
        L_0x011c:
            o.removeAndRecycleView r14 = new o.removeAndRecycleView     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r1)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r14.<init>(r2, r7, r3)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r1 = "hidden_details"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            if (r0 == 0) goto L_0x015d
            java.util.Iterator r1 = r0.keys()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r2 = "it.keys()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.asSequence(r1)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r2.<init>()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
        L_0x0142:
            boolean r3 = r1.hasNext()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            if (r3 == 0) goto L_0x015a
            java.lang.Object r3 = r1.next()     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r4 = r2
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r4.put(r3, r5)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            goto L_0x0142
        L_0x015a:
            r10 = r2
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
        L_0x015d:
            r15 = r10
            o.isSmoothScrolling r0 = new o.isSmoothScrolling     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            r12 = r0
            r16 = r6
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            o.detachAndScrapViewAt r0 = (o.detachAndScrapViewAt) r0     // Catch:{ JSONException -> 0x016d, ParseException -> 0x016b }
            return r0
        L_0x016b:
            r0 = move-exception
            goto L_0x016f
        L_0x016d:
            r0 = move-exception
            goto L_0x017b
        L_0x016f:
            com.twilio.verify.TwilioVerifyException r1 = new com.twilio.verify.TwilioVerifyException
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.twilio.verify.TwilioVerifyException$ErrorCode r2 = com.twilio.verify.TwilioVerifyException.ErrorCode.MapperError
            r1.<init>(r0, r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x017b:
            com.twilio.verify.TwilioVerifyException r1 = new com.twilio.verify.TwilioVerifyException
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.twilio.verify.TwilioVerifyException$ErrorCode r2 = com.twilio.verify.TwilioVerifyException.ErrorCode.MapperError
            r1.<init>(r0, r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            goto L_0x0188
        L_0x0187:
            throw r1
        L_0x0188:
            goto L_0x0187
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAutoMeasureEnabled.setMax(org.json.JSONObject, java.lang.String):o.detachAndScrapViewAt");
    }
}
