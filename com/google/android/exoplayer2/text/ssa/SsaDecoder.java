package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue: ";
    private static final String FORMAT_LINE_PREFIX = "Format: ";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    private static final String TAG = "SsaDecoder";
    private int formatEndIndex;
    private int formatKeyCount;
    private int formatStartIndex;
    private int formatTextIndex;
    private final boolean haveInitializationData;

    public SsaDecoder() {
        this((List<byte[]>) null);
    }

    public SsaDecoder(List<byte[]> list) {
        super(TAG);
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            return;
        }
        this.haveInitializationData = true;
        String fromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
        Assertions.checkArgument(fromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
        parseFormatLine(fromUtf8Bytes);
        parseHeader(new ParsableByteArray(list.get(1)));
    }

    /* access modifiers changed from: protected */
    public final SsaSubtitle decode(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        if (!this.haveInitializationData) {
            parseHeader(parsableByteArray);
        }
        parseEventBody(parsableByteArray, arrayList, longArray);
        Cue[] cueArr = new Cue[arrayList.size()];
        arrayList.toArray(cueArr);
        return new SsaSubtitle(cueArr, longArray.toArray());
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private void parseHeader(com.google.android.exoplayer2.util.ParsableByteArray r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.String r0 = r3.readLine()
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = "[Events]"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.SsaDecoder.parseHeader(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<Cue> list, LongArray longArray) {
        while (true) {
            String readLine = parsableByteArray.readLine();
            if (readLine == null) {
                return;
            }
            if (!this.haveInitializationData && readLine.startsWith(FORMAT_LINE_PREFIX)) {
                parseFormatLine(readLine);
            } else if (readLine.startsWith(DIALOGUE_LINE_PREFIX)) {
                parseDialogueLine(readLine, list, longArray);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseFormatLine(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 8
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
            int r0 = r9.length
            r8.formatKeyCount = r0
            r0 = -1
            r8.formatStartIndex = r0
            r8.formatEndIndex = r0
            r8.formatTextIndex = r0
            r1 = 0
            r2 = 0
        L_0x0018:
            int r3 = r8.formatKeyCount
            if (r2 >= r3) goto L_0x006f
            r3 = r9[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r3)
            int r4 = r3.hashCode()
            r5 = 100571(0x188db, float:1.4093E-40)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L_0x0052
            r5 = 3556653(0x36452d, float:4.983932E-39)
            if (r4 == r5) goto L_0x0047
            r5 = 109757538(0x68ac462, float:5.219839E-35)
            if (r4 == r5) goto L_0x003c
            goto L_0x005c
        L_0x003c:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005c
            r3 = 0
            goto L_0x005d
        L_0x0047:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005c
            r3 = 2
            goto L_0x005d
        L_0x0052:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x005c:
            r3 = -1
        L_0x005d:
            if (r3 == 0) goto L_0x006a
            if (r3 == r7) goto L_0x0067
            if (r3 == r6) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            r8.formatTextIndex = r2
            goto L_0x006c
        L_0x0067:
            r8.formatEndIndex = r2
            goto L_0x006c
        L_0x006a:
            r8.formatStartIndex = r2
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x006f:
            int r9 = r8.formatStartIndex
            if (r9 == r0) goto L_0x007b
            int r9 = r8.formatEndIndex
            if (r9 == r0) goto L_0x007b
            int r9 = r8.formatTextIndex
            if (r9 != r0) goto L_0x007d
        L_0x007b:
            r8.formatKeyCount = r1
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.SsaDecoder.parseFormatLine(java.lang.String):void");
    }

    private void parseDialogueLine(String str, List<Cue> list, LongArray longArray) {
        long j;
        if (this.formatKeyCount == 0) {
            Log.w(TAG, "Skipping dialogue line before complete format: ".concat(String.valueOf(str)));
            return;
        }
        String[] split = str.substring(10).split(",", this.formatKeyCount);
        if (split.length != this.formatKeyCount) {
            Log.w(TAG, "Skipping dialogue line with fewer columns than format: ".concat(String.valueOf(str)));
            return;
        }
        long parseTimecodeUs = parseTimecodeUs(split[this.formatStartIndex]);
        if (parseTimecodeUs == C.TIME_UNSET) {
            Log.w(TAG, "Skipping invalid timing: ".concat(String.valueOf(str)));
            return;
        }
        String str2 = split[this.formatEndIndex];
        if (!str2.trim().isEmpty()) {
            j = parseTimecodeUs(str2);
            if (j == C.TIME_UNSET) {
                Log.w(TAG, "Skipping invalid timing: ".concat(String.valueOf(str)));
                return;
            }
        } else {
            j = -9223372036854775807L;
        }
        list.add(new Cue(split[this.formatTextIndex].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
        longArray.add(parseTimecodeUs);
        if (j != C.TIME_UNSET) {
            list.add((Object) null);
            longArray.add(j);
        }
    }

    public static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }
}
