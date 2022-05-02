package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;

final class getCompoundPaddingRight {
    private static JsonReader.setMax getMin = JsonReader.setMax.getMin("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.setMax setMin = JsonReader.setMax.getMin("n", SecurityConstants.KEY_VALUE);

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.content.ShapeStroke setMin(com.airbnb.lottie.parser.moshi.JsonReader r18, o.setVerticalGravity r19) throws java.io.IOException {
        /*
            r0 = r18
            r1 = r19
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
            r5 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0014:
            boolean r14 = r18.getMin()
            if (r14 == 0) goto L_0x0122
            com.airbnb.lottie.parser.moshi.JsonReader$setMax r14 = getMin
            int r14 = r0.setMin((com.airbnb.lottie.parser.moshi.JsonReader.setMax) r14)
            r4 = 1
            switch(r14) {
                case 0: goto L_0x011a;
                case 1: goto L_0x010b;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00eb;
                case 4: goto L_0x00de;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00cb;
                case 7: goto L_0x00c6;
                case 8: goto L_0x002a;
                default: goto L_0x0024;
            }
        L_0x0024:
            r14 = 0
            r18.FastBitmap$CoordinateSystem()
            goto L_0x011f
        L_0x002a:
            r18.length()
        L_0x002d:
            boolean r14 = r18.getMin()
            if (r14 == 0) goto L_0x00b3
            r18.setMin()
            r14 = 0
            r16 = 0
        L_0x0039:
            boolean r17 = r18.getMin()
            if (r17 == 0) goto L_0x0066
            com.airbnb.lottie.parser.moshi.JsonReader$setMax r15 = setMin
            int r15 = r0.setMin((com.airbnb.lottie.parser.moshi.JsonReader.setMax) r15)
            if (r15 == 0) goto L_0x0060
            if (r15 == r4) goto L_0x0050
            r18.isInside()
            r18.FastBitmap$CoordinateSystem()
            goto L_0x0039
        L_0x0050:
            o.onTextFocusChanged r14 = new o.onTextFocusChanged
            float r15 = o.setTitleMarginStart.getMax()
            o.getThumbDrawable r4 = o.getThumbDrawable.getMax
            java.util.List r4 = o.getSplitTrack.setMin(r0, r1, r15, r4, r2)
            r14.<init>(r4)
            goto L_0x0064
        L_0x0060:
            java.lang.String r16 = r18.toIntRange()
        L_0x0064:
            r4 = 1
            goto L_0x0039
        L_0x0066:
            r18.setMax()
            int r15 = r16.hashCode()
            r4 = 2
            r2 = 100
            if (r15 == r2) goto L_0x0093
            r2 = 103(0x67, float:1.44E-43)
            if (r15 == r2) goto L_0x0087
            r2 = 111(0x6f, float:1.56E-43)
            if (r15 == r2) goto L_0x007b
            goto L_0x009f
        L_0x007b:
            java.lang.String r2 = "o"
            r15 = r16
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x009f
            r2 = 0
            goto L_0x00a0
        L_0x0087:
            r15 = r16
            java.lang.String r2 = "g"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x009f
            r2 = 2
            goto L_0x00a0
        L_0x0093:
            r15 = r16
            java.lang.String r2 = "d"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x009f
            r2 = 1
            goto L_0x00a0
        L_0x009f:
            r2 = -1
        L_0x00a0:
            if (r2 == 0) goto L_0x00b1
            r15 = 1
            if (r2 == r15) goto L_0x00a8
            if (r2 == r4) goto L_0x00a8
            goto L_0x00ad
        L_0x00a8:
            r1.FastBitmap$CoordinateSystem = r15
            r3.add(r14)
        L_0x00ad:
            r2 = 0
            r4 = 1
            goto L_0x002d
        L_0x00b1:
            r6 = r14
            goto L_0x00ad
        L_0x00b3:
            r15 = 1
            r18.getMax()
            int r2 = r3.size()
            if (r2 != r15) goto L_0x011f
            r2 = 0
            java.lang.Object r4 = r3.get(r2)
            r3.add(r4)
            goto L_0x011f
        L_0x00c6:
            boolean r12 = r18.equals()
            goto L_0x011f
        L_0x00cb:
            double r14 = r18.toDoubleRange()
            float r11 = (float) r14
            goto L_0x011f
        L_0x00d1:
            com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r2 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
            int r4 = r18.values()
            r14 = 1
            int r4 = r4 - r14
            r10 = r2[r4]
            goto L_0x011f
        L_0x00de:
            r14 = 1
            com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r2 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
            int r4 = r18.values()
            int r4 = r4 - r14
            r9 = r2[r4]
            goto L_0x011f
        L_0x00eb:
            o.onCloseClicked r13 = new o.onCloseClicked
            o.applyThumbTint r2 = o.applyThumbTint.length
            r4 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            java.util.List r2 = o.getSplitTrack.setMin(r0, r1, r4, r2, r14)
            r13.<init>(r2)
            goto L_0x011f
        L_0x00fa:
            r14 = 0
            o.onTextFocusChanged r8 = new o.onTextFocusChanged
            float r2 = o.setTitleMarginStart.getMax()
            o.getThumbDrawable r4 = o.getThumbDrawable.getMax
            java.util.List r2 = o.getSplitTrack.setMin(r0, r1, r2, r4, r14)
            r8.<init>(r2)
            goto L_0x011f
        L_0x010b:
            r4 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            o.onQueryRefine r7 = new o.onQueryRefine
            o.setThumbResource r2 = o.setThumbResource.getMax
            java.util.List r2 = o.getSplitTrack.setMin(r0, r1, r4, r2, r14)
            r7.<init>(r2)
            goto L_0x011f
        L_0x011a:
            r14 = 0
            java.lang.String r5 = r18.toIntRange()
        L_0x011f:
            r2 = 0
            goto L_0x0014
        L_0x0122:
            if (r13 != 0) goto L_0x0139
            o.onCloseClicked r0 = new o.onCloseClicked
            o.setTitleMarginTop r1 = new o.setTitleMarginTop
            r2 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.<init>(r1)
            r13 = r0
        L_0x0139:
            com.airbnb.lottie.model.content.ShapeStroke r14 = new com.airbnb.lottie.model.content.ShapeStroke
            r0 = r14
            r1 = r5
            r2 = r6
            r4 = r7
            r5 = r13
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCompoundPaddingRight.setMin(com.airbnb.lottie.parser.moshi.JsonReader, o.setVerticalGravity):com.airbnb.lottie.model.content.ShapeStroke");
    }
}
