package com.google.android.exoplayer2.text.webvtt;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.NonNull;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.google.android.exoplayer2.text.webvtt.WebvttCue;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import id.dana.data.socialshare.ShareAppKey;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
    private static final String ENTITY_AMPERSAND = "amp";
    private static final String ENTITY_GREATER_THAN = "gt";
    private static final String ENTITY_LESS_THAN = "lt";
    private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final String TAG = "WebvttCueParser";
    private static final String TAG_BOLD = "b";
    private static final String TAG_CLASS = "c";
    private static final String TAG_ITALIC = "i";
    private static final String TAG_LANG = "lang";
    private static final String TAG_UNDERLINE = "u";
    private static final String TAG_VOICE = "v";
    private final StringBuilder textBuilder = new StringBuilder();

    public final boolean parseCue(ParsableByteArray parsableByteArray, WebvttCue.Builder builder, List<WebvttCssStyle> list) {
        String readLine = parsableByteArray.readLine();
        if (readLine == null) {
            return false;
        }
        Matcher matcher = CUE_HEADER_PATTERN.matcher(readLine);
        if (matcher.matches()) {
            return parseCue((String) null, matcher, parsableByteArray, builder, this.textBuilder, list);
        }
        String readLine2 = parsableByteArray.readLine();
        if (readLine2 == null) {
            return false;
        }
        Matcher matcher2 = CUE_HEADER_PATTERN.matcher(readLine2);
        if (!matcher2.matches()) {
            return false;
        }
        return parseCue(readLine.trim(), matcher2, parsableByteArray, builder, this.textBuilder, list);
    }

    static void parseCueSettingsList(String str, WebvttCue.Builder builder) {
        Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if (ShareAppKey.LINE.equals(group)) {
                    parseLineAttribute(group2, builder);
                } else if ("align".equals(group)) {
                    builder.setTextAlignment(parseTextAlignment(group2));
                } else if ("position".equals(group)) {
                    parsePositionAttribute(group2, builder);
                } else if (GriverMonitorConstants.KEY_SIZE.equals(group)) {
                    builder.setWidth(WebvttParserUtil.parsePercentage(group2));
                } else {
                    StringBuilder sb = new StringBuilder("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    Log.w(TAG, sb.toString());
                }
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder("Skipping bad cue setting: ");
                sb2.append(matcher.group());
                Log.w(TAG, sb2.toString());
            }
        }
    }

    static void parseCueText(String str, String str2, WebvttCue.Builder builder, List<WebvttCssStyle> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    applyEntity(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = findEndOfTag(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    String tagName = getTagName(substring);
                    if (tagName != null && isSupportedTag(tagName)) {
                        if (z) {
                            while (!arrayDeque.isEmpty()) {
                                StartTag startTag = (StartTag) arrayDeque.pop();
                                applySpansForTag(str, startTag, spannableStringBuilder, list, arrayList);
                                if (startTag.name.equals(tagName)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            arrayDeque.push(StartTag.buildStartTag(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (StartTag) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        applySpansForTag(str, StartTag.buildWholeCueVirtualTag(), spannableStringBuilder, list, arrayList);
        builder.setText(spannableStringBuilder);
    }

    private static boolean parseCue(String str, Matcher matcher, ParsableByteArray parsableByteArray, WebvttCue.Builder builder, StringBuilder sb, List<WebvttCssStyle> list) {
        try {
            builder.setStartTime(WebvttParserUtil.parseTimestampUs(matcher.group(1))).setEndTime(WebvttParserUtil.parseTimestampUs(matcher.group(2)));
            parseCueSettingsList(matcher.group(3), builder);
            sb.setLength(0);
            while (true) {
                String readLine = parsableByteArray.readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(readLine.trim());
                } else {
                    parseCueText(str, sb.toString(), builder, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder("Skipping cue with bad header: ");
            sb2.append(matcher.group());
            Log.w(TAG, sb2.toString());
            return false;
        }
    }

    private static void parseLineAttribute(String str, WebvttCue.Builder builder) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            builder.setLineAnchor(parsePositionAnchor(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            builder.setLineAnchor(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            builder.setLine(WebvttParserUtil.parsePercentage(str)).setLineType(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        builder.setLine((float) parseInt).setLineType(1);
    }

    private static void parsePositionAttribute(String str, WebvttCue.Builder builder) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            builder.setPositionAnchor(parsePositionAnchor(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            builder.setPositionAnchor(Integer.MIN_VALUE);
        }
        builder.setPosition(WebvttParserUtil.parsePercentage(str));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int parsePositionAnchor(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x002b;
                case -1074341483: goto L_0x0021;
                case 100571: goto L_0x0017;
                case 109757538: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0035
        L_0x000c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0017:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 3
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 2
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x0052
            if (r0 == r4) goto L_0x0051
            if (r0 == r3) goto L_0x0051
            if (r0 == r2) goto L_0x0050
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "Invalid anchor value: "
            java.lang.String r5 = r0.concat(r5)
            java.lang.String r0 = "WebvttCueParser"
            com.google.android.exoplayer2.util.Log.w(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x0050:
            return r3
        L_0x0051:
            return r4
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttCueParser.parsePositionAnchor(java.lang.String):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Layout.Alignment parseTextAlignment(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1364013995: goto L_0x0040;
                case -1074341483: goto L_0x0036;
                case 100571: goto L_0x002c;
                case 3317767: goto L_0x0022;
                case 108511772: goto L_0x0018;
                case 109757538: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x004a
        L_0x000d:
            java.lang.String r0 = "start"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "right"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 5
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "left"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 4
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "middle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "center"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 2
            goto L_0x004b
        L_0x004a:
            r0 = -1
        L_0x004b:
            if (r0 == 0) goto L_0x006e
            if (r0 == r5) goto L_0x006e
            if (r0 == r4) goto L_0x006b
            if (r0 == r3) goto L_0x006b
            if (r0 == r2) goto L_0x0068
            if (r0 == r1) goto L_0x0068
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Invalid alignment value: "
            java.lang.String r6 = r0.concat(r6)
            java.lang.String r0 = "WebvttCueParser"
            com.google.android.exoplayer2.util.Log.w(r0, r6)
            r6 = 0
            return r6
        L_0x0068:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r6
        L_0x006b:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            return r6
        L_0x006e:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttCueParser.parseTextAlignment(java.lang.String):android.text.Layout$Alignment");
    }

    private static int findEndOfTag(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void applyEntity(java.lang.String r5, android.text.SpannableStringBuilder r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L_0x002e
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L_0x0024
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "nbsp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "amp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 3
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "lt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "gt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0076
            if (r0 == r4) goto L_0x0070
            if (r0 == r3) goto L_0x006a
            if (r0 == r2) goto L_0x0064
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "ignoring unsupported entity: '&"
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = ";'"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "WebvttCueParser"
            com.google.android.exoplayer2.util.Log.w(r6, r5)
            return
        L_0x0064:
            r5 = 38
            r6.append(r5)
            return
        L_0x006a:
            r5 = 32
            r6.append(r5)
            return
        L_0x0070:
            r5 = 62
            r6.append(r5)
            return
        L_0x0076:
            r5 = 60
            r6.append(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttCueParser.applyEntity(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isSupportedTag(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 98
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == r1) goto L_0x0058
            r1 = 99
            if (r0 == r1) goto L_0x004e
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L_0x0044
            r1 = 3314158(0x3291ee, float:4.644125E-39)
            if (r0 == r1) goto L_0x003a
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L_0x002f
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L_0x0024
            goto L_0x0062
        L_0x0024:
            java.lang.String r0 = "v"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0062
            r8 = 5
            goto L_0x0063
        L_0x002f:
            java.lang.String r0 = "u"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0062
            r8 = 4
            goto L_0x0063
        L_0x003a:
            java.lang.String r0 = "lang"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0062
            r8 = 3
            goto L_0x0063
        L_0x0044:
            java.lang.String r0 = "i"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0062
            r8 = 2
            goto L_0x0063
        L_0x004e:
            java.lang.String r0 = "c"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0062
            r8 = 1
            goto L_0x0063
        L_0x0058:
            java.lang.String r0 = "b"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0062
            r8 = 0
            goto L_0x0063
        L_0x0062:
            r8 = -1
        L_0x0063:
            if (r8 == 0) goto L_0x0070
            if (r8 == r7) goto L_0x0070
            if (r8 == r6) goto L_0x0070
            if (r8 == r5) goto L_0x0070
            if (r8 == r4) goto L_0x0070
            if (r8 == r3) goto L_0x0070
            return r2
        L_0x0070:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttCueParser.isSupportedTag(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a0 A[LOOP:0: B:43:0x009e->B:44:0x00a0, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void applySpansForTag(java.lang.String r8, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag r9, android.text.SpannableStringBuilder r10, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r11, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch> r12) {
        /*
            int r0 = r9.position
            int r1 = r10.length()
            java.lang.String r2 = r9.name
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0069
            r7 = 105(0x69, float:1.47E-43)
            if (r3 == r7) goto L_0x005f
            r7 = 3314158(0x3291ee, float:4.644125E-39)
            if (r3 == r7) goto L_0x0055
            r7 = 98
            if (r3 == r7) goto L_0x004b
            r7 = 99
            if (r3 == r7) goto L_0x0041
            r7 = 117(0x75, float:1.64E-43)
            if (r3 == r7) goto L_0x0036
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L_0x002b
            goto L_0x0073
        L_0x002b:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 5
            goto L_0x0074
        L_0x0036:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 2
            goto L_0x0074
        L_0x0041:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 3
            goto L_0x0074
        L_0x004b:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 0
            goto L_0x0074
        L_0x0055:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 4
            goto L_0x0074
        L_0x005f:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 1
            goto L_0x0074
        L_0x0069:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0073
            r2 = 6
            goto L_0x0074
        L_0x0073:
            r2 = -1
        L_0x0074:
            r3 = 33
            switch(r2) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0083;
                case 2: goto L_0x007a;
                case 3: goto L_0x0094;
                case 4: goto L_0x0094;
                case 5: goto L_0x0094;
                case 6: goto L_0x0094;
                default: goto L_0x0079;
            }
        L_0x0079:
            return
        L_0x007a:
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            r10.setSpan(r2, r0, r1, r3)
            goto L_0x0094
        L_0x0083:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r5)
            r10.setSpan(r2, r0, r1, r3)
            goto L_0x0094
        L_0x008c:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
            r10.setSpan(r2, r0, r1, r3)
        L_0x0094:
            r12.clear()
            getApplicableStyles(r11, r8, r9, r12)
            int r8 = r12.size()
        L_0x009e:
            if (r4 >= r8) goto L_0x00ae
            java.lang.Object r9 = r12.get(r4)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StyleMatch r9 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch) r9
            com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r9 = r9.style
            applyStyleToText(r10, r9, r0, r1)
            int r4 = r4 + 1
            goto L_0x009e
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttCueParser.applySpansForTag(java.lang.String, com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    private static void applyStyleToText(SpannableStringBuilder spannableStringBuilder, WebvttCssStyle webvttCssStyle, int i, int i2) {
        if (webvttCssStyle != null) {
            if (webvttCssStyle.getStyle() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(webvttCssStyle.getStyle()), i, i2, 33);
            }
            if (webvttCssStyle.isLinethrough()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (webvttCssStyle.isUnderline()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (webvttCssStyle.hasFontColor()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(webvttCssStyle.getFontColor()), i, i2, 33);
            }
            if (webvttCssStyle.hasBackgroundColor()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(webvttCssStyle.getBackgroundColor()), i, i2, 33);
            }
            if (webvttCssStyle.getFontFamily() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(webvttCssStyle.getFontFamily()), i, i2, 33);
            }
            if (webvttCssStyle.getTextAlign() != null) {
                spannableStringBuilder.setSpan(new AlignmentSpan.Standard(webvttCssStyle.getTextAlign()), i, i2, 33);
            }
            int fontSizeUnit = webvttCssStyle.getFontSizeUnit();
            if (fontSizeUnit == 1) {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) webvttCssStyle.getFontSize(), true), i, i2, 33);
            } else if (fontSizeUnit == 2) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(webvttCssStyle.getFontSize()), i, i2, 33);
            } else if (fontSizeUnit == 3) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(webvttCssStyle.getFontSize() / 100.0f), i, i2, 33);
            }
        }
    }

    private static String getTagName(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return Util.splitAtFirst(trim, "[ \\.]")[0];
    }

    private static void getApplicableStyles(List<WebvttCssStyle> list, String str, StartTag startTag, List<StyleMatch> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WebvttCssStyle webvttCssStyle = list.get(i);
            int specificityScore = webvttCssStyle.getSpecificityScore(str, startTag.name, startTag.classes, startTag.voice);
            if (specificityScore > 0) {
                list2.add(new StyleMatch(specificityScore, webvttCssStyle));
            }
        }
        Collections.sort(list2);
    }

    static final class StyleMatch implements Comparable<StyleMatch> {
        public final int score;
        public final WebvttCssStyle style;

        public StyleMatch(int i, WebvttCssStyle webvttCssStyle) {
            this.score = i;
            this.style = webvttCssStyle;
        }

        public final int compareTo(@NonNull StyleMatch styleMatch) {
            return this.score - styleMatch.score;
        }
    }

    static final class StartTag {
        private static final String[] NO_CLASSES = new String[0];
        public final String[] classes;
        public final String name;
        public final int position;
        public final String voice;

        private StartTag(String str, int i, String str2, String[] strArr) {
            this.position = i;
            this.name = str;
            this.voice = str2;
            this.classes = strArr;
        }

        public static StartTag buildStartTag(String str, int i) {
            String str2;
            String[] strArr;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] split = Util.split(trim, "\\.");
            String str3 = split[0];
            if (split.length > 1) {
                strArr = (String[]) Arrays.copyOfRange(split, 1, split.length);
            } else {
                strArr = NO_CLASSES;
            }
            return new StartTag(str3, i, str2, strArr);
        }

        public static StartTag buildWholeCueVirtualTag() {
            return new StartTag("", 0, "", new String[0]);
        }
    }
}
