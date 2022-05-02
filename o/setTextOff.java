package o;

final class setTextOff {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.content.Mask length(com.airbnb.lottie.parser.moshi.JsonReader r12, o.setVerticalGravity r13) throws java.io.IOException {
        /*
            r12.setMin()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = 0
        L_0x0008:
            boolean r5 = r12.getMin()
            if (r5 == 0) goto L_0x0101
            java.lang.String r5 = r12.toFloatRange()
            int r6 = r5.hashCode()
            r7 = 111(0x6f, float:1.56E-43)
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            if (r6 == r7) goto L_0x004b
            r7 = 3588(0xe04, float:5.028E-42)
            if (r6 == r7) goto L_0x0041
            r7 = 104433(0x197f1, float:1.46342E-40)
            if (r6 == r7) goto L_0x0037
            r7 = 3357091(0x3339a3, float:4.704286E-39)
            if (r6 == r7) goto L_0x002d
            goto L_0x0055
        L_0x002d:
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 0
            goto L_0x0056
        L_0x0037:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 3
            goto L_0x0056
        L_0x0041:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 1
            goto L_0x0056
        L_0x004b:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 2
            goto L_0x0056
        L_0x0055:
            r6 = -1
        L_0x0056:
            if (r6 == 0) goto L_0x0085
            if (r6 == r11) goto L_0x0075
            if (r6 == r10) goto L_0x0067
            if (r6 == r9) goto L_0x0062
            r12.FastBitmap$CoordinateSystem()
            goto L_0x0008
        L_0x0062:
            boolean r4 = r12.equals()
            goto L_0x0008
        L_0x0067:
            o.onCloseClicked r3 = new o.onCloseClicked
            o.applyThumbTint r5 = o.applyThumbTint.length
            r6 = 1065353216(0x3f800000, float:1.0)
            java.util.List r5 = o.getSplitTrack.setMin(r12, r13, r6, r5, r1)
            r3.<init>(r5)
            goto L_0x0008
        L_0x0075:
            o.onItemClicked r2 = new o.onItemClicked
            float r5 = o.setTitleMarginStart.getMax()
            o.getTargetCheckedState r6 = o.getTargetCheckedState.getMin
            java.util.List r5 = o.getSplitTrack.setMin(r12, r13, r5, r6, r1)
            r2.<init>(r5)
            goto L_0x0008
        L_0x0085:
            java.lang.String r0 = r12.toIntRange()
            int r6 = r0.hashCode()
            r7 = 97
            if (r6 == r7) goto L_0x00bc
            r7 = 105(0x69, float:1.47E-43)
            if (r6 == r7) goto L_0x00b2
            r7 = 110(0x6e, float:1.54E-43)
            if (r6 == r7) goto L_0x00a8
            r7 = 115(0x73, float:1.61E-43)
            if (r6 == r7) goto L_0x009e
            goto L_0x00c5
        L_0x009e:
            java.lang.String r6 = "s"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00c5
            r8 = 1
            goto L_0x00c5
        L_0x00a8:
            java.lang.String r6 = "n"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00c5
            r8 = 2
            goto L_0x00c5
        L_0x00b2:
            java.lang.String r6 = "i"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00c5
            r8 = 3
            goto L_0x00c5
        L_0x00bc:
            java.lang.String r6 = "a"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00c5
            r8 = 0
        L_0x00c5:
            if (r8 == 0) goto L_0x00fd
            if (r8 == r11) goto L_0x00f9
            if (r8 == r10) goto L_0x00f5
            if (r8 == r9) goto L_0x00e7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Unknown mask mode "
            r0.<init>(r6)
            r0.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            o.setTitleMargin.setMax(r0)
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD
            goto L_0x0008
        L_0x00e7:
            java.lang.String r0 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            o.setTitleMargin.setMax(r0)
            java.util.HashSet<java.lang.String> r5 = r13.length
            r5.add(r0)
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT
            goto L_0x0008
        L_0x00f5:
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE
            goto L_0x0008
        L_0x00f9:
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT
            goto L_0x0008
        L_0x00fd:
            com.airbnb.lottie.model.content.Mask$MaskMode r0 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD
            goto L_0x0008
        L_0x0101:
            r12.setMax()
            com.airbnb.lottie.model.content.Mask r12 = new com.airbnb.lottie.model.content.Mask
            r12.<init>(r0, r2, r3, r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTextOff.length(com.airbnb.lottie.parser.moshi.JsonReader, o.setVerticalGravity):com.airbnb.lottie.model.content.Mask");
    }
}
