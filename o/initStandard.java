package o;

import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

public class initStandard implements addTraceInfo {
    protected ZimInitGwRequest IsOverlapping;
    protected ZimInitGwRequest getMax;
    protected String getMin;
    protected ZimInitGwRequest isInside;
    protected ZimInitGwRequest[] length;
    protected boolean setMax;
    protected ZimInitGwRequest setMin;

    public final boolean getMin(LogUtils logUtils) {
        return logUtils instanceof BisFaceUploadContent;
    }

    public final Object setMin(SecureQwertyKeyboard.AnonymousClass1 r2, String str, String str2) {
        return BisFaceUploadContent.compileRE(r2, str, str2, false);
    }

    public final LogUtils getMin(LogUtils logUtils, Object obj) {
        return new BisFaceUploadContent(logUtils, (MapStringString) obj);
    }

    public final Object getMin(SecureQwertyKeyboard.AnonymousClass1 r8, LogUtils logUtils, LogUtils logUtils2, Object[] objArr, int i) {
        BisFaceUploadContent bisFaceUploadContent;
        String str;
        String str2;
        doCheck docheck;
        int i2;
        Object obj;
        BisVideo bisVideo = new BisVideo();
        bisVideo.setMax = i;
        bisVideo.getMin = LogItem.getMin((Object) logUtils2);
        if (i == 1) {
            return bisVideo.setMin == null ? getMax(r8, logUtils, this, bisVideo, getMin(r8, logUtils, objArr, 1, false)) : bisVideo.setMin;
        } else if (i == 2) {
            boolean z = (objArr.length > 0 && (objArr[0] instanceof BisFaceUploadContent)) || objArr.length > 2;
            if (z) {
                bisFaceUploadContent = getMin(r8, logUtils, objArr, 2, true);
                str = null;
            } else {
                str = LogItem.getMin(objArr.length <= 0 ? checkOpen.instance : objArr[0]);
                bisFaceUploadContent = null;
            }
            Object obj2 = objArr.length < 2 ? checkOpen.instance : objArr[1];
            if (obj2 instanceof doCheck) {
                docheck = (doCheck) obj2;
                str2 = null;
            } else {
                str2 = LogItem.getMin(obj2);
                docheck = null;
            }
            bisVideo.getMax = docheck;
            bisVideo.equals = str2;
            if (str2 == null) {
                i2 = -1;
            } else {
                i2 = str2.indexOf(36);
            }
            bisVideo.toFloatRange = i2;
            bisVideo.isInside = null;
            bisVideo.IsOverlapping = 0;
            if (z) {
                obj = getMax(r8, logUtils, this, bisVideo, bisFaceUploadContent);
            } else {
                String str3 = bisVideo.getMin;
                int indexOf = str3.indexOf(str);
                if (indexOf >= 0) {
                    int length2 = str.length();
                    this.setMin = null;
                    this.IsOverlapping = new ZimInitGwRequest(str3, 0, indexOf);
                    this.getMax = new ZimInitGwRequest(str3, indexOf, length2);
                    this.isInside = new ZimInitGwRequest(str3, indexOf + length2, (str3.length() - indexOf) - length2);
                    obj = Boolean.TRUE;
                } else {
                    obj = Boolean.FALSE;
                }
            }
            if (bisVideo.isInside == null) {
                if (bisVideo.length || obj == null || !obj.equals(Boolean.TRUE)) {
                    return bisVideo.getMin;
                }
                ZimInitGwRequest zimInitGwRequest = this.IsOverlapping;
                length(bisVideo, r8, logUtils, this, zimInitGwRequest.setMax, zimInitGwRequest.getMax);
            }
            ZimInitGwRequest zimInitGwRequest2 = this.isInside;
            bisVideo.isInside.append(zimInitGwRequest2.getMin, zimInitGwRequest2.setMax, zimInitGwRequest2.setMax + zimInitGwRequest2.getMax);
            return bisVideo.isInside.toString();
        } else if (i == 3) {
            return getMax(r8, logUtils, this, bisVideo, getMin(r8, logUtils, objArr, 1, false));
        } else {
            throw getStyleId.setMin();
        }
    }

    private static BisFaceUploadContent getMin(SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, Object[] objArr, int i, boolean z) {
        BisFaceUploadContent bisFaceUploadContent;
        String str;
        LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
        if (objArr.length == 0 || objArr[0] == checkOpen.instance) {
            bisFaceUploadContent = new BisFaceUploadContent(topLevelScope, BisFaceUploadContent.compileRE(r3, "", "", false));
        } else if (objArr[0] instanceof BisFaceUploadContent) {
            return objArr[0];
        } else {
            String min = LogItem.getMin(objArr[0]);
            if (i < objArr.length) {
                objArr[0] = min;
                str = LogItem.getMin(objArr[i]);
            } else {
                str = null;
            }
            bisFaceUploadContent = new BisFaceUploadContent(topLevelScope, BisFaceUploadContent.compileRE(r3, min, str, z));
        }
        return bisFaceUploadContent;
    }

    private static Object getMax(SecureQwertyKeyboard.AnonymousClass1 r17, LogUtils logUtils, initStandard initstandard, BisVideo bisVideo, BisFaceUploadContent bisFaceUploadContent) {
        initStandard initstandard2 = initstandard;
        BisVideo bisVideo2 = bisVideo;
        String str = bisVideo2.getMin;
        bisVideo2.length = (bisFaceUploadContent.getFlags() & 1) != 0;
        int[] iArr = {0};
        Object obj = null;
        if (bisVideo2.setMax == 3) {
            Object executeRegExp = bisFaceUploadContent.executeRegExp(r17, logUtils, initstandard, str, iArr, 0);
            if (executeRegExp == null || !executeRegExp.equals(Boolean.TRUE)) {
                return -1;
            }
            return Integer.valueOf(initstandard2.IsOverlapping.getMax);
        } else if (bisVideo2.length) {
            bisFaceUploadContent.lastIndex = Double.valueOf(0.0d);
            int i = 0;
            while (iArr[0] <= str.length()) {
                Object executeRegExp2 = bisFaceUploadContent.executeRegExp(r17, logUtils, initstandard, str, iArr, 0);
                if (executeRegExp2 != null && executeRegExp2.equals(Boolean.TRUE)) {
                    if (bisVideo2.setMax == 1) {
                        setMin(bisVideo2, logUtils, i, initstandard2);
                    } else {
                        LogUtils logUtils2 = logUtils;
                        if (bisVideo2.setMax != 2) {
                            getStyleId.setMin();
                        }
                        ZimInitGwRequest zimInitGwRequest = initstandard2.getMax;
                        int i2 = bisVideo2.IsOverlapping;
                        int i3 = zimInitGwRequest.setMax - i2;
                        bisVideo2.IsOverlapping = zimInitGwRequest.setMax + zimInitGwRequest.getMax;
                        length(bisVideo, r17, logUtils, initstandard, i2, i3);
                    }
                    if (initstandard2.getMax.getMax == 0) {
                        if (iArr[0] != str.length()) {
                            iArr[0] = iArr[0] + 1;
                        }
                    }
                    i++;
                    obj = executeRegExp2;
                }
                return executeRegExp2;
            }
            return obj;
        } else {
            BisFaceUploadContent bisFaceUploadContent2 = bisFaceUploadContent;
            return bisFaceUploadContent.executeRegExp(r17, logUtils, initstandard, str, iArr, bisVideo2.setMax == 2 ? 0 : 1);
        }
    }

    public final int setMin(SecureQwertyKeyboard.AnonymousClass1 r15, LogUtils logUtils, String str, LogUtils logUtils2, int[] iArr, int[] iArr2, boolean[] zArr, String[][] strArr) {
        int i;
        int i2 = iArr[0];
        int length2 = str.length();
        int i3 = r15.IsOverlapping;
        BisFaceUploadContent bisFaceUploadContent = (BisFaceUploadContent) logUtils2;
        while (true) {
            int i4 = iArr[0];
            iArr[0] = i2;
            if (bisFaceUploadContent.executeRegExp(r15, logUtils, this, str, iArr, 0) != Boolean.TRUE) {
                iArr[0] = i4;
                iArr2[0] = 1;
                zArr[0] = false;
                return length2;
            }
            i = iArr[0];
            iArr[0] = i4;
            zArr[0] = true;
            iArr2[0] = this.getMax.getMax;
            if (iArr2[0] != 0 || i != iArr[0]) {
                i -= iArr2[0];
            } else if (i != length2) {
                i2 = i + 1;
            } else if (i3 == 120) {
                iArr2[0] = 1;
            } else {
                i = -1;
            }
        }
        i -= iArr2[0];
        ZimInitGwRequest[] zimInitGwRequestArr = this.length;
        int length3 = zimInitGwRequestArr == null ? 0 : zimInitGwRequestArr.length;
        strArr[0] = new String[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            strArr[0][i5] = setMin(i5).toString();
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final ZimInitGwRequest setMin(int i) {
        ZimInitGwRequest zimInitGwRequest;
        ZimInitGwRequest[] zimInitGwRequestArr = this.length;
        if (zimInitGwRequestArr == null || i >= zimInitGwRequestArr.length || (zimInitGwRequest = zimInitGwRequestArr[i]) == null) {
            return new ZimInitGwRequest();
        }
        return zimInitGwRequest;
    }

    private static void setMin(BisVideo bisVideo, LogUtils logUtils, int i, initStandard initstandard) {
        if (bisVideo.setMin == null) {
            bisVideo.setMin = SecureQwertyKeyboard.AnonymousClass1.getMax(logUtils, 0);
        }
        String obj = initstandard.getMax.toString();
        LogUtils logUtils2 = bisVideo.setMin;
        logUtils2.put(i, logUtils2, (Object) obj);
    }

    /* JADX INFO: finally extract failed */
    private static void length(BisVideo bisVideo, SecureQwertyKeyboard.AnonymousClass1 r7, LogUtils logUtils, initStandard initstandard, int i, int i2) {
        String str;
        int i3;
        int i4;
        int i5;
        if (bisVideo.getMax != null) {
            ZimInitGwRequest[] zimInitGwRequestArr = initstandard.length;
            if (zimInitGwRequestArr == null) {
                i5 = 0;
            } else {
                i5 = zimInitGwRequestArr.length;
            }
            Object[] objArr = new Object[(i5 + 3)];
            objArr[0] = initstandard.getMax.toString();
            for (int i6 = 0; i6 < i5; i6++) {
                ZimInitGwRequest zimInitGwRequest = zimInitGwRequestArr[i6];
                if (zimInitGwRequest != null) {
                    objArr[i6 + 1] = zimInitGwRequest.toString();
                } else {
                    objArr[i6 + 1] = checkOpen.instance;
                }
            }
            objArr[i5 + 1] = Integer.valueOf(initstandard.IsOverlapping.getMax);
            objArr[i5 + 2] = bisVideo.getMin;
            if (initstandard != LogItem.length(r7)) {
                getStyleId.setMin();
            }
            initStandard initstandard2 = new initStandard();
            initstandard2.setMax = initstandard.setMax;
            initstandard2.getMin = initstandard.getMin;
            LogItem.length(r7, (addTraceInfo) initstandard2);
            try {
                LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
                str = LogItem.getMin(bisVideo.getMax.call(r7, topLevelScope, topLevelScope, objArr));
                LogItem.length(r7, (addTraceInfo) initstandard);
                i3 = str.length();
            } catch (Throwable th) {
                LogItem.length(r7, (addTraceInfo) initstandard);
                throw th;
            }
        } else {
            str = null;
            i3 = bisVideo.equals.length();
            if (bisVideo.toFloatRange >= 0) {
                int[] iArr = new int[1];
                int i7 = bisVideo.toFloatRange;
                do {
                    ZimInitGwRequest min = getMin(r7, initstandard, bisVideo.equals, i7, iArr);
                    if (min != null) {
                        i3 += min.getMax - iArr[0];
                        i4 = i7 + iArr[0];
                    } else {
                        i4 = i7 + 1;
                    }
                    i7 = bisVideo.equals.indexOf(36, i4);
                } while (i7 >= 0);
            }
        }
        int i8 = i3 + i2 + initstandard.isInside.getMax;
        StringBuilder sb = bisVideo.isInside;
        if (sb == null) {
            sb = new StringBuilder(i8);
            bisVideo.isInside = sb;
        } else {
            sb.ensureCapacity(bisVideo.isInside.length() + i8);
        }
        sb.append(initstandard.IsOverlapping.getMin, i, i2 + i);
        if (bisVideo.getMax != null) {
            sb.append(str);
        } else {
            getMax(bisVideo, r7, initstandard);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x007f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.ZimInitGwRequest getMin(o.SecureQwertyKeyboard.AnonymousClass1 r7, o.initStandard r8, java.lang.String r9, int r10, int[] r11) {
        /*
            char r0 = r9.charAt(r10)
            r1 = 36
            if (r0 == r1) goto L_0x000b
            o.getStyleId.setMin()
        L_0x000b:
            int r7 = r7.IsOverlapping
            r0 = 140(0x8c, float:1.96E-43)
            r2 = 0
            if (r7 == 0) goto L_0x0021
            if (r7 > r0) goto L_0x0021
            if (r10 <= 0) goto L_0x0021
            int r3 = r10 + -1
            char r3 = r9.charAt(r3)
            r4 = 92
            if (r3 != r4) goto L_0x0021
            return r2
        L_0x0021:
            int r3 = r9.length()
            int r4 = r10 + 1
            if (r4 < r3) goto L_0x002a
            return r2
        L_0x002a:
            char r4 = r9.charAt(r4)
            boolean r5 = o.BisFaceUploadContent.isDigit(r4)
            r6 = 0
            if (r5 == 0) goto L_0x008a
            r1 = 48
            if (r7 == 0) goto L_0x0057
            if (r7 > r0) goto L_0x0057
            if (r4 != r1) goto L_0x003e
            return r2
        L_0x003e:
            r7 = r10
            r0 = 0
        L_0x0040:
            int r7 = r7 + 1
            if (r7 >= r3) goto L_0x0080
            char r1 = r9.charAt(r7)
            boolean r2 = o.BisFaceUploadContent.isDigit(r1)
            if (r2 == 0) goto L_0x0080
            int r2 = r0 * 10
            int r1 = r1 + -48
            int r2 = r2 + r1
            if (r2 < r0) goto L_0x0080
            r0 = r2
            goto L_0x0040
        L_0x0057:
            o.ZimInitGwRequest[] r7 = r8.length
            if (r7 != 0) goto L_0x005d
            r7 = 0
            goto L_0x005e
        L_0x005d:
            int r7 = r7.length
        L_0x005e:
            int r4 = r4 - r1
            if (r4 <= r7) goto L_0x0062
            return r2
        L_0x0062:
            int r0 = r10 + 2
            if (r0 >= r3) goto L_0x007b
            char r9 = r9.charAt(r0)
            boolean r3 = o.BisFaceUploadContent.isDigit(r9)
            if (r3 == 0) goto L_0x007b
            int r3 = r4 * 10
            int r9 = r9 - r1
            int r3 = r3 + r9
            if (r3 > r7) goto L_0x007b
            int r0 = r0 + 1
            r7 = r0
            r0 = r3
            goto L_0x007d
        L_0x007b:
            r7 = r0
            r0 = r4
        L_0x007d:
            if (r0 != 0) goto L_0x0080
            return r2
        L_0x0080:
            int r0 = r0 + -1
            int r7 = r7 - r10
            r11[r6] = r7
            o.ZimInitGwRequest r7 = r8.setMin(r0)
            return r7
        L_0x008a:
            r9 = 2
            r11[r6] = r9
            if (r4 == r1) goto L_0x00bc
            r9 = 43
            if (r4 == r9) goto L_0x00b9
            r9 = 96
            if (r4 == r9) goto L_0x00a6
            r7 = 38
            if (r4 == r7) goto L_0x00a3
            r7 = 39
            if (r4 == r7) goto L_0x00a0
            return r2
        L_0x00a0:
            o.ZimInitGwRequest r7 = r8.isInside
            return r7
        L_0x00a3:
            o.ZimInitGwRequest r7 = r8.getMax
            return r7
        L_0x00a6:
            r9 = 120(0x78, float:1.68E-43)
            if (r7 != r9) goto L_0x00b6
            o.ZimInitGwRequest r7 = r8.IsOverlapping
            r7.setMax = r6
            o.ZimInitGwRequest r7 = r8.IsOverlapping
            o.ZimInitGwRequest r9 = r8.getMax
            int r9 = r9.setMax
            r7.getMax = r9
        L_0x00b6:
            o.ZimInitGwRequest r7 = r8.IsOverlapping
            return r7
        L_0x00b9:
            o.ZimInitGwRequest r7 = r8.setMin
            return r7
        L_0x00bc:
            o.ZimInitGwRequest r7 = new o.ZimInitGwRequest
            java.lang.String r8 = "$"
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initStandard.getMin(o.SecureQwertyKeyboard$1, o.initStandard, java.lang.String, int, int[]):o.ZimInitGwRequest");
    }

    private static void getMax(BisVideo bisVideo, SecureQwertyKeyboard.AnonymousClass1 r10, initStandard initstandard) {
        int i;
        StringBuilder sb = bisVideo.isInside;
        String str = bisVideo.equals;
        int i2 = bisVideo.toFloatRange;
        int i3 = 0;
        if (i2 != -1) {
            int[] iArr = new int[1];
            int i4 = 0;
            do {
                sb.append(str.substring(i4, i2));
                ZimInitGwRequest min = getMin(r10, initstandard, str, i2, iArr);
                if (min != null) {
                    int i5 = min.getMax;
                    if (i5 > 0) {
                        sb.append(min.getMin, min.setMax, min.setMax + i5);
                    }
                    i4 = iArr[0] + i2;
                    i = i2 + iArr[0];
                } else {
                    i4 = i2;
                    i = i2 + 1;
                }
                i2 = str.indexOf(36, i);
            } while (i2 >= 0);
            i3 = i4;
        }
        int length2 = str.length();
        if (length2 > i3) {
            sb.append(str.substring(i3, length2));
        }
    }

    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: type inference failed for: r19v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016c, code lost:
        if (r0 != -1) goto L_0x0172;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=?, for r19v0, types: [boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ce A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a4 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getMax(o.SecureQwertyKeyboard.AnonymousClass1 r26, o.LogUtils r27, java.lang.String r28, java.lang.Object[] r29) {
        /*
            r25 = this;
            r9 = r28
            r0 = r29
            r10 = 0
            r11 = r27
            o.LogUtils r12 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((o.LogUtils) r11, (int) r10)
            int r1 = r0.length
            r13 = 1
            if (r1 <= r13) goto L_0x0017
            r1 = r0[r13]
            java.lang.Object r2 = o.checkOpen.instance
            if (r1 == r2) goto L_0x0017
            r14 = 1
            goto L_0x0018
        L_0x0017:
            r14 = 0
        L_0x0018:
            r1 = 0
            if (r14 == 0) goto L_0x0031
            r1 = r0[r13]
            long r1 = o.LogItem.toIntRange((java.lang.Object) r1)
            int r3 = r28.length()
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0031
            int r1 = r28.length()
            int r1 = r1 + r13
            long r1 = (long) r1
        L_0x0031:
            r15 = r1
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01e0
            r1 = r0[r10]
            java.lang.Object r2 = o.checkOpen.instance
            if (r1 != r2) goto L_0x003d
            goto L_0x01e0
        L_0x003d:
            int[] r8 = new int[r13]
            r1 = r0[r10]
            boolean r1 = r1 instanceof o.LogUtils
            r2 = 0
            if (r1 == 0) goto L_0x0060
            o.addTraceInfo r1 = o.LogItem.length((o.SecureQwertyKeyboard.AnonymousClass1) r26)
            if (r1 == 0) goto L_0x005b
            r3 = r0[r10]
            o.LogUtils r3 = (o.LogUtils) r3
            boolean r4 = r1.getMin(r3)
            if (r4 == 0) goto L_0x005b
            r17 = r1
            r18 = r3
            goto L_0x0064
        L_0x005b:
            r17 = r1
            r18 = r2
            goto L_0x0064
        L_0x0060:
            r17 = r2
            r18 = r17
        L_0x0064:
            if (r18 != 0) goto L_0x0074
            r0 = r0[r10]
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object) r0)
            int r1 = r0.length()
            r8[r10] = r1
            r7 = r0
            goto L_0x0075
        L_0x0074:
            r7 = r2
        L_0x0075:
            int[] r6 = new int[r13]
            r6[r10] = r10
            boolean[] r5 = new boolean[r13]
            r5[r10] = r10
            java.lang.String[][] r4 = new java.lang.String[r13][]
            r4[r10] = r2
            r3 = r26
            int r2 = r3.IsOverlapping
            r1 = 0
        L_0x0086:
            r0 = r6[r10]
            int r10 = r28.length()
            r13 = 120(0x78, float:1.68E-43)
            r20 = r1
            if (r2 != r13) goto L_0x00e9
            if (r18 != 0) goto L_0x00e9
            int r1 = r7.length()
            r13 = 1
            if (r1 != r13) goto L_0x00e9
            r1 = 0
            char r13 = r7.charAt(r1)
            r1 = 32
            if (r13 != r1) goto L_0x00e9
            if (r0 != 0) goto L_0x00b8
        L_0x00a6:
            if (r0 >= r10) goto L_0x00b5
            char r1 = r9.charAt(r0)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 == 0) goto L_0x00b5
            int r0 = r0 + 1
            goto L_0x00a6
        L_0x00b5:
            r1 = 0
            r6[r1] = r0
        L_0x00b8:
            if (r0 != r10) goto L_0x00bb
            goto L_0x00eb
        L_0x00bb:
            if (r0 >= r10) goto L_0x00ca
            char r1 = r9.charAt(r0)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto L_0x00ca
            int r0 = r0 + 1
            goto L_0x00bb
        L_0x00ca:
            r1 = r0
        L_0x00cb:
            if (r1 >= r10) goto L_0x00da
            char r13 = r9.charAt(r1)
            boolean r13 = java.lang.Character.isWhitespace(r13)
            if (r13 == 0) goto L_0x00da
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00da:
            int r1 = r1 - r0
            r10 = 0
            r8[r10] = r1
            r1 = r2
            r21 = r5
            r22 = r6
            r3 = r7
            r24 = r8
            r13 = r20
            goto L_0x00f6
        L_0x00e9:
            if (r0 <= r10) goto L_0x00fb
        L_0x00eb:
            r1 = r2
            r21 = r5
            r22 = r6
            r3 = r7
            r24 = r8
            r13 = r20
            r0 = -1
        L_0x00f6:
            r2 = 1
            r20 = r4
            goto L_0x0172
        L_0x00fb:
            if (r18 == 0) goto L_0x0123
            r0 = r17
            r13 = r20
            r1 = r26
            r10 = r2
            r2 = r27
            r3 = r28
            r20 = r4
            r4 = r18
            r21 = r5
            r5 = r6
            r22 = r6
            r6 = r8
            r23 = r7
            r7 = r21
            r24 = r8
            r8 = r20
            int r0 = r0.setMin(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r10
            r3 = r23
        L_0x0121:
            r2 = 1
            goto L_0x0172
        L_0x0123:
            r1 = r2
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r13 = r20
            r20 = r4
            if (r1 == 0) goto L_0x013c
            r2 = 130(0x82, float:1.82E-43)
            if (r1 >= r2) goto L_0x013c
            if (r10 != 0) goto L_0x013c
            r3 = r23
            r0 = -1
            goto L_0x0121
        L_0x013c:
            int r2 = r23.length()
            if (r2 != 0) goto L_0x015d
            r2 = 120(0x78, float:1.68E-43)
            if (r1 != r2) goto L_0x0150
            if (r0 != r10) goto L_0x014d
            r2 = 1
            r3 = 0
            r24[r3] = r2
            goto L_0x015a
        L_0x014d:
            r2 = 1
            r3 = 0
            goto L_0x0158
        L_0x0150:
            r2 = 1
            r3 = 0
            if (r0 != r10) goto L_0x0158
            r3 = r23
            r0 = -1
            goto L_0x0172
        L_0x0158:
            int r0 = r0 + 1
        L_0x015a:
            r3 = r23
            goto L_0x0172
        L_0x015d:
            r2 = 1
            r3 = 0
            r0 = r22[r3]
            if (r0 >= r10) goto L_0x016f
            r0 = r22[r3]
            r3 = r23
            int r0 = r9.indexOf(r3, r0)
            r4 = -1
            if (r0 == r4) goto L_0x0171
            goto L_0x0172
        L_0x016f:
            r3 = r23
        L_0x0171:
            r0 = r10
        L_0x0172:
            if (r0 < 0) goto L_0x01df
            if (r14 == 0) goto L_0x017b
            long r4 = (long) r13
            int r6 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r6 >= 0) goto L_0x01df
        L_0x017b:
            int r4 = r28.length()
            if (r0 > r4) goto L_0x01df
            int r4 = r28.length()
            if (r4 != 0) goto L_0x018b
            r4 = r9
            r19 = 0
            goto L_0x0193
        L_0x018b:
            r19 = 0
            r4 = r22[r19]
            java.lang.String r4 = r9.substring(r4, r0)
        L_0x0193:
            r12.put((int) r13, (o.LogUtils) r12, (java.lang.Object) r4)
            int r4 = r13 + 1
            if (r18 == 0) goto L_0x01b9
            boolean r5 = r21[r19]
            if (r5 == 0) goto L_0x01b9
            r5 = r20[r19]
            int r5 = r5.length
            r6 = 0
        L_0x01a2:
            if (r6 >= r5) goto L_0x01b7
            if (r14 == 0) goto L_0x01ab
            long r7 = (long) r4
            int r10 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x01b7
        L_0x01ab:
            r7 = r20[r19]
            r7 = r7[r6]
            r12.put((int) r4, (o.LogUtils) r12, (java.lang.Object) r7)
            int r4 = r4 + 1
            int r6 = r6 + 1
            goto L_0x01a2
        L_0x01b7:
            r21[r19] = r19
        L_0x01b9:
            r5 = r24[r19]
            int r0 = r0 + r5
            r22[r19] = r0
            r0 = 130(0x82, float:1.82E-43)
            if (r1 >= r0) goto L_0x01ce
            if (r1 == 0) goto L_0x01ce
            if (r14 != 0) goto L_0x01ce
            r0 = r22[r19]
            int r5 = r28.length()
            if (r0 == r5) goto L_0x01df
        L_0x01ce:
            r2 = r1
            r7 = r3
            r1 = r4
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r24
            r10 = 0
            r13 = 1
            r3 = r26
            goto L_0x0086
        L_0x01df:
            return r12
        L_0x01e0:
            r0 = 0
            r12.put((int) r0, (o.LogUtils) r12, (java.lang.Object) r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initStandard.getMax(o.SecureQwertyKeyboard$1, o.LogUtils, java.lang.String, java.lang.Object[]):java.lang.Object");
    }
}
