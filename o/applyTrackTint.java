package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

final class applyTrackTint {
    private static JsonReader.setMax setMax = JsonReader.setMax.getMin("ty", "d");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (r2.equals("gs") != false) goto L_0x00c0;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static o.isLandscapeMode setMin(com.airbnb.lottie.parser.moshi.JsonReader r7, o.setVerticalGravity r8) throws java.io.IOException {
        /*
            r7.setMin()
            r0 = 2
            r1 = 2
        L_0x0005:
            boolean r2 = r7.getMin()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0028
            com.airbnb.lottie.parser.moshi.JsonReader$setMax r2 = setMax
            int r2 = r7.setMin((com.airbnb.lottie.parser.moshi.JsonReader.setMax) r2)
            if (r2 == 0) goto L_0x0023
            if (r2 == r3) goto L_0x001e
            r7.isInside()
            r7.FastBitmap$CoordinateSystem()
            goto L_0x0005
        L_0x001e:
            int r1 = r7.values()
            goto L_0x0005
        L_0x0023:
            java.lang.String r2 = r7.toIntRange()
            goto L_0x0029
        L_0x0028:
            r2 = r4
        L_0x0029:
            if (r2 != 0) goto L_0x002c
            return r4
        L_0x002c:
            r5 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case 3239: goto L_0x00b5;
                case 3270: goto L_0x00ab;
                case 3295: goto L_0x00a1;
                case 3307: goto L_0x0097;
                case 3308: goto L_0x008e;
                case 3488: goto L_0x0083;
                case 3633: goto L_0x0078;
                case 3646: goto L_0x006d;
                case 3669: goto L_0x0063;
                case 3679: goto L_0x0058;
                case 3681: goto L_0x004d;
                case 3705: goto L_0x0041;
                case 3710: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x00bf
        L_0x0036:
            java.lang.String r0 = "tr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 5
            goto L_0x00c0
        L_0x0041:
            java.lang.String r0 = "tm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 9
            goto L_0x00c0
        L_0x004d:
            java.lang.String r0 = "st"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 1
            goto L_0x00c0
        L_0x0058:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 10
            goto L_0x00c0
        L_0x0063:
            java.lang.String r0 = "sh"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 6
            goto L_0x00c0
        L_0x006d:
            java.lang.String r0 = "rp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 12
            goto L_0x00c0
        L_0x0078:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 8
            goto L_0x00c0
        L_0x0083:
            java.lang.String r0 = "mm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 11
            goto L_0x00c0
        L_0x008e:
            java.lang.String r3 = "gs"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x0097:
            java.lang.String r0 = "gr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 0
            goto L_0x00c0
        L_0x00a1:
            java.lang.String r0 = "gf"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 4
            goto L_0x00c0
        L_0x00ab:
            java.lang.String r0 = "fl"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 3
            goto L_0x00c0
        L_0x00b5:
            java.lang.String r0 = "el"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 7
            goto L_0x00c0
        L_0x00bf:
            r0 = -1
        L_0x00c0:
            switch(r0) {
                case 0: goto L_0x0117;
                case 1: goto L_0x0112;
                case 2: goto L_0x010d;
                case 3: goto L_0x0108;
                case 4: goto L_0x0103;
                case 5: goto L_0x00fe;
                case 6: goto L_0x00f9;
                case 7: goto L_0x00f4;
                case 8: goto L_0x00ef;
                case 9: goto L_0x00ea;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00d6;
                case 12: goto L_0x00d1;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            java.lang.String r8 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Unknown shape type "
            java.lang.String r8 = r0.concat(r8)
            o.setTitleMargin.setMax(r8)
            goto L_0x011b
        L_0x00d1:
            o.setThreshold r4 = o.animateThumbToCheckedState.setMax(r7, r8)
            goto L_0x011b
        L_0x00d6:
            com.airbnb.lottie.model.content.MergePaths r4 = o.getShowText.getMin(r7)
            java.lang.String r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            o.setTitleMargin.setMax(r0)
            java.util.HashSet<java.lang.String> r8 = r8.length
            r8.add(r0)
            goto L_0x011b
        L_0x00e5:
            com.airbnb.lottie.model.content.PolystarShape r4 = o.hitThumb.getMin(r7, r8)
            goto L_0x011b
        L_0x00ea:
            com.airbnb.lottie.model.content.ShapeTrimPath r4 = o.getThumbOffset.length(r7, r8)
            goto L_0x011b
        L_0x00ef:
            o.replaceText r4 = o.cancelSuperTouch.setMin(r7, r8)
            goto L_0x011b
        L_0x00f4:
            o.SearchView$SearchAutoComplete r4 = o.getTrackTintMode.getMax(r7, r8, r1)
            goto L_0x011b
        L_0x00f9:
            o.ensureImeVisible r4 = o.cancelPositionAnimator.getMin(r7, r8)
            goto L_0x011b
        L_0x00fe:
            o.forceSuggestionQuery r4 = o.setTrackTintMode.setMin(r7, r8)
            goto L_0x011b
        L_0x0103:
            o.isEmpty r4 = o.setThumbTintList.setMin(r7, r8)
            goto L_0x011b
        L_0x0108:
            o.setImeVisibility r4 = o.setThumbPosition.getMin(r7, r8)
            goto L_0x011b
        L_0x010d:
            o.performCompletion r4 = o.setSplitTrack.length(r7, r8)
            goto L_0x011b
        L_0x0112:
            com.airbnb.lottie.model.content.ShapeStroke r4 = o.getCompoundPaddingRight.setMin(r7, r8)
            goto L_0x011b
        L_0x0117:
            o.showSoftInputIfNecessary r4 = o.toggle.getMin(r7, r8)
        L_0x011b:
            boolean r8 = r7.getMin()
            if (r8 == 0) goto L_0x0125
            r7.FastBitmap$CoordinateSystem()
            goto L_0x011b
        L_0x0125:
            r7.setMax()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.applyTrackTint.setMin(com.airbnb.lottie.parser.moshi.JsonReader, o.setVerticalGravity):o.isLandscapeMode");
    }
}
