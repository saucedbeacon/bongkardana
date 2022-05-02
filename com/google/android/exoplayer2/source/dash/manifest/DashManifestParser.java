package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import android.webkit.URLUtil;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import id.dana.data.constant.BranchLinkConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final String TAG = "MpdParser";
    private static int getMin = 0;
    private static char[] length = null;
    private static int setMax = 1;
    private final String contentId;
    private final XmlPullParserFactory xmlParserFactory;

    static void getMin() {
        length = new char[]{28, '2', '9', 'M', 'T'};
    }

    /* access modifiers changed from: protected */
    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = getMin + 67;
        setMax = i % 128;
        int i2 = i % 2;
    }

    static {
        getMin();
        int i = getMin + 15;
        setMax = i % 128;
        if ((i % 2 == 0 ? '[' : 'Q') == '[') {
            Object obj = null;
            super.hashCode();
        }
    }

    public DashManifestParser() {
        this((String) null);
    }

    public DashManifestParser(String str) {
        this.contentId = str;
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r7 != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if ("MPD".equals(r0.getName()) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.DashManifest parse(android.net.Uri r6, java.io.InputStream r7) throws java.io.IOException {
        /*
            r5 = this;
            org.xmlpull.v1.XmlPullParserFactory r0 = r5.xmlParserFactory     // Catch:{ XmlPullParserException -> 0x0065 }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x0065 }
            r1 = 0
            r0.setInput(r7, r1)     // Catch:{ XmlPullParserException -> 0x0065 }
            int r7 = r0.next()     // Catch:{ XmlPullParserException -> 0x0065 }
            r2 = 1
            r3 = 2
            if (r7 != r3) goto L_0x0014
            r7 = 1
            goto L_0x0015
        L_0x0014:
            r7 = 0
        L_0x0015:
            if (r7 != r2) goto L_0x005d
            int r7 = setMax     // Catch:{ Exception -> 0x005b }
            int r7 = r7 + 67
            int r2 = r7 % 128
            getMin = r2     // Catch:{ Exception -> 0x005b }
            int r7 = r7 % r3
            r2 = 30
            if (r7 == 0) goto L_0x0027
            r7 = 34
            goto L_0x0029
        L_0x0027:
            r7 = 30
        L_0x0029:
            java.lang.String r4 = "MPD"
            if (r7 == r2) goto L_0x003d
            java.lang.String r7 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0065 }
            boolean r7 = r4.equals(r7)     // Catch:{ XmlPullParserException -> 0x0065 }
            super.hashCode()     // Catch:{ all -> 0x003b }
            if (r7 == 0) goto L_0x005d
            goto L_0x0047
        L_0x003b:
            r6 = move-exception
            throw r6
        L_0x003d:
            java.lang.String r7 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0065 }
            boolean r7 = r4.equals(r7)     // Catch:{ XmlPullParserException -> 0x0065 }
            if (r7 == 0) goto L_0x005d
        L_0x0047:
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0065 }
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r6 = r5.parseMediaPresentationDescription(r0, r6)     // Catch:{ XmlPullParserException -> 0x0065 }
            int r7 = setMax     // Catch:{ Exception -> 0x0059 }
            int r7 = r7 + 109
            int r0 = r7 % 128
            getMin = r0     // Catch:{ Exception -> 0x0059 }
            int r7 = r7 % r3
            return r6
        L_0x0059:
            r6 = move-exception
            throw r6
        L_0x005b:
            r6 = move-exception
            throw r6
        L_0x005d:
            com.google.android.exoplayer2.ParserException r6 = new com.google.android.exoplayer2.ParserException     // Catch:{ XmlPullParserException -> 0x0065 }
            java.lang.String r7 = "inputStream does not contain a valid media presentation description"
            r6.<init>((java.lang.String) r7)     // Catch:{ XmlPullParserException -> 0x0065 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0065 }
        L_0x0065:
            r6 = move-exception
            com.google.android.exoplayer2.ParserException r7 = new com.google.android.exoplayer2.ParserException
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parse(android.net.Uri, java.io.InputStream):com.google.android.exoplayer2.source.dash.manifest.DashManifest");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.String] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if ((r8 ? 'X' : '7') != 'X') goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if ("dynamic".equals(r8) != false) goto L_0x0051;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f1 A[LOOP:0: B:60:0x00db->B:116:0x01f1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01f9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.DashManifest parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser r35, java.lang.String r36) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r34 = this;
            r0 = r35
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r3 = "availabilityStartTime"
            long r5 = parseDateTime(r0, r3, r1)
            java.lang.String r3 = "mediaPresentationDuration"
            long r3 = parseDuration(r0, r3, r1)
            java.lang.String r7 = "minBufferTime"
            long r9 = parseDuration(r0, r7, r1)
            r7 = 0
            java.lang.String r8 = "type"
            java.lang.String r8 = r0.getAttributeValue(r7, r8)
            r11 = 0
            r12 = 1
            if (r8 == 0) goto L_0x0053
            int r13 = setMax
            int r13 = r13 + 113
            int r14 = r13 % 128
            getMin = r14
            int r13 = r13 % 2
            if (r13 == 0) goto L_0x0032
            r13 = 1
            goto L_0x0033
        L_0x0032:
            r13 = 0
        L_0x0033:
            java.lang.String r14 = "dynamic"
            if (r13 == 0) goto L_0x004b
            boolean r8 = r14.equals(r8)
            int r13 = r7.length     // Catch:{ all -> 0x0048 }
            r13 = 88
            if (r8 == 0) goto L_0x0043
            r8 = 88
            goto L_0x0045
        L_0x0043:
            r8 = 55
        L_0x0045:
            if (r8 == r13) goto L_0x0051
            goto L_0x0053
        L_0x0048:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x004b:
            boolean r8 = r14.equals(r8)
            if (r8 == 0) goto L_0x0053
        L_0x0051:
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            if (r13 == 0) goto L_0x0058
            r8 = 1
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            if (r8 == r12) goto L_0x0067
            int r8 = setMax
            int r8 = r8 + 13
            int r14 = r8 % 128
            getMin = r14
            int r8 = r8 % 2
            r14 = r1
            goto L_0x0084
        L_0x0067:
            int r8 = setMax
            int r8 = r8 + 99
            int r14 = r8 % 128
            getMin = r14
            int r8 = r8 % 2
            java.lang.String r14 = "minimumUpdatePeriod"
            if (r8 == 0) goto L_0x0080
            long r14 = parseDuration(r0, r14, r1)
            r8 = 56
            int r8 = r8 / r11
            goto L_0x0084
        L_0x007d:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0080:
            long r14 = parseDuration(r0, r14, r1)
        L_0x0084:
            if (r13 == 0) goto L_0x0092
            java.lang.String r8 = "timeShiftBufferDepth"
            long r16 = parseDuration(r0, r8, r1)     // Catch:{ Exception -> 0x008d }
            goto L_0x0094
        L_0x008d:
            r0 = move-exception
            r12 = r34
            goto L_0x01d3
        L_0x0092:
            r16 = r1
        L_0x0094:
            if (r13 == 0) goto L_0x00b2
            int r8 = getMin
            int r8 = r8 + 95
            int r11 = r8 % 128
            setMax = r11
            int r8 = r8 % 2
            java.lang.String r11 = "suggestedPresentationDelay"
            if (r8 != 0) goto L_0x00ad
            long r19 = parseDuration(r0, r11, r1)
            int r8 = r7.length     // Catch:{ all -> 0x00aa }
            goto L_0x00be
        L_0x00aa:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00ad:
            long r19 = parseDuration(r0, r11, r1)
            goto L_0x00be
        L_0x00b2:
            int r8 = setMax
            int r8 = r8 + 87
            int r11 = r8 % 128
            getMin = r11
            int r8 = r8 % 2
            r19 = r1
        L_0x00be:
            java.lang.String r8 = "publishTime"
            long r21 = parseDateTime(r0, r8, r1)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r13 == 0) goto L_0x00ce
            r23 = r1
            goto L_0x00d0
        L_0x00ce:
            r23 = 0
        L_0x00d0:
            r8 = r7
            r1 = r23
            r26 = 0
            r27 = 0
            r7 = r36
            r23 = r8
        L_0x00db:
            r35.next()
            java.lang.String r12 = "BaseURL"
            boolean r12 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r12)
            if (r12 == 0) goto L_0x010e
            if (r26 != 0) goto L_0x00ed
            r36 = r8
            r8 = 1
            r12 = 0
            goto L_0x00f1
        L_0x00ed:
            r36 = r8
            r8 = 1
            r12 = 1
        L_0x00f1:
            if (r12 == r8) goto L_0x0102
            java.lang.String r7 = parseBaseUrl(r0, r7)
            r12 = r34
            r32 = r3
            r30 = r14
            r18 = 0
            r26 = 1
            goto L_0x015b
        L_0x0102:
            r12 = r34
            r28 = r1
            r32 = r3
            r30 = r14
            r18 = 0
            goto L_0x01dc
        L_0x010e:
            r36 = r8
            java.lang.String r8 = "UTCTiming"
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r8)
            if (r8 == 0) goto L_0x0141
            int r8 = getMin
            int r8 = r8 + 103
            int r12 = r8 % 128
            setMax = r12
            int r8 = r8 % 2
            if (r8 != 0) goto L_0x0132
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r8 = r34.parseUtcTiming(r35)
            r12 = 16
            r18 = 0
            int r12 = r12 / 0
            goto L_0x0138
        L_0x012f:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0132:
            r18 = 0
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r8 = r34.parseUtcTiming(r35)
        L_0x0138:
            r12 = r34
            r32 = r3
            r3 = r8
            r30 = r14
            goto L_0x01e0
        L_0x0141:
            r18 = 0
            java.lang.String r8 = "Location"
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r8)
            if (r8 == 0) goto L_0x015f
            java.lang.String r8 = r35.nextText()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r12 = r34
            r32 = r3
            r23 = r8
            r30 = r14
        L_0x015b:
            r3 = r36
            goto L_0x01e0
        L_0x015f:
            java.lang.String r8 = "Period"
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r8)
            if (r8 == 0) goto L_0x01d4
            if (r27 != 0) goto L_0x016b
            r8 = 0
            goto L_0x016c
        L_0x016b:
            r8 = 1
        L_0x016c:
            r12 = 1
            if (r8 == r12) goto L_0x01d4
            r12 = r34
            android.util.Pair r8 = r12.parsePeriod(r0, r7, r1)
            r28 = r1
            java.lang.Object r1 = r8.first
            com.google.android.exoplayer2.source.dash.manifest.Period r1 = (com.google.android.exoplayer2.source.dash.manifest.Period) r1
            r30 = r14
            long r14 = r1.startMs
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r2 != 0) goto L_0x01b0
            if (r13 == 0) goto L_0x018d
            r2 = 1
            r8 = 1
            goto L_0x018f
        L_0x018d:
            r2 = 1
            r8 = 0
        L_0x018f:
            if (r8 != r2) goto L_0x0198
            r32 = r3
            r1 = r28
            r27 = 1
            goto L_0x015b
        L_0x0198:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to determine start of period "
            r1.<init>(r2)
            int r2 = r11.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01b0:
            r2 = 1
            java.lang.Object r8 = r8.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r14 = r8.longValue()
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            r32 = r3
            if (r8 != 0) goto L_0x01ca
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01cd
        L_0x01ca:
            long r2 = r1.startMs
            long r2 = r2 + r14
        L_0x01cd:
            r11.add(r1)     // Catch:{ Exception -> 0x01d2 }
            r1 = r2
            goto L_0x015b
        L_0x01d2:
            r0 = move-exception
        L_0x01d3:
            throw r0
        L_0x01d4:
            r12 = r34
            r28 = r1
            r32 = r3
            r30 = r14
        L_0x01dc:
            r3 = r36
            r1 = r28
        L_0x01e0:
            java.lang.String r4 = "MPD"
            boolean r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r4)
            r8 = 65
            if (r4 == 0) goto L_0x01ed
            r4 = 65
            goto L_0x01ef
        L_0x01ed:
            r4 = 71
        L_0x01ef:
            if (r4 == r8) goto L_0x01f9
            r8 = r3
            r14 = r30
            r3 = r32
            r12 = 1
            goto L_0x00db
        L_0x01f9:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r32 > r7 ? 1 : (r32 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x021d
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0212
            int r0 = setMax
            int r0 = r0 + 95
            int r4 = r0 % 128
            getMin = r4
            int r0 = r0 % 2
            r7 = r1
            goto L_0x021f
        L_0x0212:
            if (r13 == 0) goto L_0x0215
            goto L_0x021d
        L_0x0215:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Unable to determine duration of static manifest."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x021d:
            r7 = r32
        L_0x021f:
            boolean r0 = r11.isEmpty()     // Catch:{ Exception -> 0x0244 }
            if (r0 != 0) goto L_0x023c
            r4 = r34
            r0 = r11
            r11 = r13
            r12 = r30
            r14 = r16
            r16 = r19
            r18 = r21
            r20 = r3
            r21 = r23
            r22 = r0
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r4.buildMediaPresentationDescription(r5, r7, r9, r11, r12, r14, r16, r18, r20, r21, r22)
            return r0
        L_0x023c:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "No periods found."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0244:
            r0 = move-exception
            r1 = r0
            goto L_0x0248
        L_0x0247:
            throw r1
        L_0x0248:
            goto L_0x0247
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser, java.lang.String):com.google.android.exoplayer2.source.dash.manifest.DashManifest");
    }

    /* access modifiers changed from: protected */
    public DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, UtcTimingElement utcTimingElement, Uri uri, List<Period> list) {
        DashManifest dashManifest = new DashManifest(j, j2, j3, z, j4, j5, j6, j7, utcTimingElement, uri, list);
        try {
            int i = getMin + 75;
            setMax = i % 128;
            if (i % 2 != 0) {
                return dashManifest;
            }
            Object[] objArr = null;
            try {
                int length2 = objArr.length;
                return dashManifest;
            } catch (Throwable th) {
                throw th;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        try {
            int i = setMax + 101;
            getMin = i % 128;
            int i2 = i % 2;
            UtcTimingElement buildUtcTimingElement = buildUtcTimingElement(xmlPullParser.getAttributeValue((String) null, "schemeIdUri"), xmlPullParser.getAttributeValue((String) null, "value"));
            int i3 = getMin + 61;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return buildUtcTimingElement;
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public UtcTimingElement buildUtcTimingElement(String str, String str2) {
        UtcTimingElement utcTimingElement = new UtcTimingElement(str, str2);
        int i = getMin + 113;
        setMax = i % 128;
        int i2 = i % 2;
        return utcTimingElement;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate, com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList, java.lang.Object, java.lang.String, com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase] */
    /* access modifiers changed from: protected */
    public Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, String str, long j) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ? r8 = 0;
        String attributeValue = xmlPullParser2.getAttributeValue(r8, "id");
        long parseDuration = parseDuration(xmlPullParser2, "start", j);
        long parseDuration2 = parseDuration(xmlPullParser2, "duration", C.TIME_UNSET);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str2 = str;
        SegmentBase segmentBase = r8;
        boolean z = false;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                int i = setMax + 25;
                getMin = i % 128;
                int i2 = i % 2;
                if (!z) {
                    str2 = parseBaseUrl(xmlPullParser2, str2);
                    z = true;
                }
            } else {
                try {
                    if (!(!XmlPullParserUtil.isStartTag(xmlPullParser2, "AdaptationSet"))) {
                        arrayList.add(parseAdaptationSet(xmlPullParser2, str2, segmentBase));
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EventStream")) {
                        int i3 = setMax + 93;
                        getMin = i3 % 128;
                        int i4 = i3 % 2;
                        arrayList2.add(parseEventStream(xmlPullParser));
                    } else {
                        if ((XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase") ? '#' : 'W') != '#') {
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                                segmentBase = parseSegmentList(xmlPullParser2, r8);
                            } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                int i5 = getMin + 43;
                                setMax = i5 % 128;
                                int i6 = i5 % 2;
                                segmentBase = parseSegmentTemplate(xmlPullParser2, r8);
                            }
                        } else {
                            int i7 = setMax + 51;
                            getMin = i7 % 128;
                            if (i7 % 2 == 0) {
                                segmentBase = parseSegmentBase(xmlPullParser2, r8);
                            } else {
                                segmentBase = parseSegmentBase(xmlPullParser2, r8);
                                try {
                                    int length2 = r8.length;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser2, "Period"));
        int i8 = setMax + 1;
        getMin = i8 % 128;
        if ((i8 % 2 != 0 ? '[' : ')') != '[') {
            return Pair.create(buildPeriod(attributeValue, parseDuration, arrayList, arrayList2), Long.valueOf(parseDuration2));
        }
        Pair<Period, Long> create = Pair.create(buildPeriod(attributeValue, parseDuration, arrayList, arrayList2), Long.valueOf(parseDuration2));
        try {
            super.hashCode();
            return create;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public Period buildPeriod(String str, long j, List<AdaptationSet> list, List<EventStream> list2) {
        Period period = new Period(str, j, list, list2);
        int i = setMax + 73;
        getMin = i % 128;
        int i2 = i % 2;
        return period;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008a, code lost:
        if (r27 == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0084, code lost:
        if (r27 == false) goto L_0x008c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0322 A[LOOP:0: B:1:0x0069->B:114:0x0322, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02e2 A[EDGE_INSN: B:115:0x02e2->B:105:0x02e2 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.AdaptationSet parseAdaptationSet(org.xmlpull.v1.XmlPullParser r40, java.lang.String r41, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r42) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r39 = this;
            r15 = r39
            r0 = r40
            r1 = -1
            java.lang.String r2 = "id"
            int r16 = parseInt(r0, r2, r1)
            int r2 = r39.parseContentType(r40)
            r14 = 0
            java.lang.String r3 = "mimeType"
            java.lang.String r17 = r0.getAttributeValue(r14, r3)
            java.lang.String r3 = "codecs"
            java.lang.String r18 = r0.getAttributeValue(r14, r3)
            java.lang.String r3 = "width"
            int r19 = parseInt(r0, r3, r1)
            java.lang.String r3 = "height"
            int r20 = parseInt(r0, r3, r1)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r21 = parseFrameRate(r0, r3)
            java.lang.String r3 = "audioSamplingRate"
            int r22 = parseInt(r0, r3, r1)
            java.lang.String r13 = "lang"
            java.lang.String r3 = r0.getAttributeValue(r14, r13)
            java.lang.String r4 = "label"
            java.lang.String r23 = r0.getAttributeValue(r14, r4)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r24 = 0
            r7 = r41
            r25 = r42
            r6 = r2
            r5 = r3
            r29 = r14
            r26 = -1
            r27 = 0
            r28 = 0
        L_0x0069:
            r40.next()
            java.lang.String r1 = "BaseURL"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            r2 = 1
            if (r1 == 0) goto L_0x00b3
            int r1 = setMax
            int r1 = r1 + 25
            int r3 = r1 % 128
            getMin = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x008a
            super.hashCode()     // Catch:{ all -> 0x0087 }
            if (r27 != 0) goto L_0x00a1
            goto L_0x008c
        L_0x0087:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x008a:
            if (r27 != 0) goto L_0x00a1
        L_0x008c:
            java.lang.String r1 = parseBaseUrl(r0, r7)
            r31 = r1
            r34 = r10
            r37 = r13
            r38 = r14
            r7 = r15
            r27 = 1
        L_0x009b:
            r10 = r9
            r9 = r11
            r11 = r12
            r12 = r6
            goto L_0x02da
        L_0x00a1:
            r30 = r5
            r3 = r6
            r31 = r7
            r34 = r10
            r36 = r12
            r37 = r13
            r38 = r14
            r7 = r15
            r10 = r9
            r9 = r11
            goto L_0x028e
        L_0x00b3:
            java.lang.String r1 = "ContentProtection"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L_0x00bd
            r1 = 0
            goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            if (r1 == 0) goto L_0x0297
            java.lang.String r1 = "ContentComponent"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)     // Catch:{ Exception -> 0x0294 }
            if (r1 == 0) goto L_0x011c
            int r1 = getMin
            int r1 = r1 + 111
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            r2 = 46
            if (r1 != 0) goto L_0x00d9
            r1 = 82
            goto L_0x00db
        L_0x00d9:
            r1 = 46
        L_0x00db:
            if (r1 == r2) goto L_0x00f2
            java.lang.String r1 = r0.getAttributeValue(r14, r13)
            java.lang.String r1 = checkLanguageConsistency(r5, r1)
            int r2 = r39.parseContentType(r40)
            int r2 = checkContentTypeConsistency(r6, r2)
            int r3 = r14.length     // Catch:{ all -> 0x00ef }
            goto L_0x0102
        L_0x00ef:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00f2:
            java.lang.String r1 = r0.getAttributeValue(r14, r13)
            java.lang.String r1 = checkLanguageConsistency(r5, r1)
            int r2 = r39.parseContentType(r40)
            int r2 = checkContentTypeConsistency(r6, r2)
        L_0x0102:
            int r3 = getMin
            int r3 = r3 + 49
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            r5 = r1
            r31 = r7
            r34 = r10
            r37 = r13
            r38 = r14
            r7 = r15
            r10 = r9
            r9 = r11
            r11 = r12
            r12 = r2
            goto L_0x02da
        L_0x011c:
            java.lang.String r1 = "Role"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L_0x0135
            int r1 = r39.parseRole(r40)
            r28 = r28 | r1
        L_0x012a:
            r31 = r7
            r34 = r10
            r37 = r13
            r38 = r14
            r7 = r15
            goto L_0x009b
        L_0x0135:
            java.lang.String r1 = "AudioChannelConfiguration"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L_0x014e
            int r1 = getMin
            int r1 = r1 + 7
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            int r1 = r39.parseAudioChannelConfiguration(r40)
            r26 = r1
            goto L_0x012a
        L_0x014e:
            java.lang.String r1 = "Accessibility"
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r3 == 0) goto L_0x015f
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r10.add(r1)
            goto L_0x00a1
        L_0x015f:
            java.lang.String r1 = "SupplementalProperty"
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            r4 = 88
            if (r3 == 0) goto L_0x016c
            r3 = 88
            goto L_0x016e
        L_0x016c:
            r3 = 50
        L_0x016e:
            if (r3 == r4) goto L_0x0274
            java.lang.String r1 = "Representation"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L_0x01d4
            int r1 = getMin
            int r1 = r1 + 83
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            r1 = r39
            r2 = r40
            r3 = r7
            r4 = r23
            r30 = r5
            r5 = r17
            r0 = r6
            r6 = r18
            r31 = r7
            r7 = r19
            r32 = r8
            r8 = r20
            r33 = r9
            r9 = r21
            r34 = r10
            r10 = r26
            r35 = r11
            r11 = r22
            r36 = r12
            r12 = r30
            r37 = r13
            r13 = r28
            r38 = r14
            r14 = r34
            r15 = r25
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo r1 = r1.parseRepresentation(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.google.android.exoplayer2.Format r2 = r1.format
            r7 = r39
            int r2 = r7.getContentType(r2)
            int r0 = checkContentTypeConsistency(r0, r2)
            r8 = r32
            r8.add(r1)
            r12 = r0
            r5 = r30
            r10 = r33
            r9 = r35
            r11 = r36
            r0 = r40
            goto L_0x02da
        L_0x01d4:
            r30 = r5
            r0 = r6
            r31 = r7
            r33 = r9
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r7 = r15
            java.lang.String r1 = "SegmentBase"
            r3 = r0
            r0 = r40
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L_0x0204
            r1 = r25
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r1 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase) r1
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r1 = r7.parseSegmentBase(r0, r1)
        L_0x01f9:
            r25 = r1
            r12 = r3
            r5 = r30
            r10 = r33
            r9 = r35
            goto L_0x0291
        L_0x0204:
            java.lang.String r1 = "SegmentList"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)     // Catch:{ Exception -> 0x0272 }
            if (r1 == 0) goto L_0x0215
            r1 = r25
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r1 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList) r1
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r1 = r7.parseSegmentList(r0, r1)
            goto L_0x01f9
        L_0x0215:
            java.lang.String r1 = "SegmentTemplate"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L_0x0226
            r1 = r25
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r1 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate) r1
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r1 = r7.parseSegmentTemplate(r0, r1)
            goto L_0x01f9
        L_0x0226:
            java.lang.String r1 = "InbandEventStream"
            boolean r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r4 == 0) goto L_0x0256
            int r2 = getMin     // Catch:{ Exception -> 0x0254 }
            int r2 = r2 + 9
            int r4 = r2 % 128
            setMax = r4
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x024a
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r9 = r35
            r9.add(r1)
            r1 = 3
            int r1 = r1 / 0
            goto L_0x026f
        L_0x0247:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x024a:
            r9 = r35
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r9.add(r1)
            goto L_0x026f
        L_0x0254:
            r0 = move-exception
            goto L_0x0296
        L_0x0256:
            r9 = r35
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r40)
            if (r1 == 0) goto L_0x025f
            goto L_0x0260
        L_0x025f:
            r2 = 0
        L_0x0260:
            if (r2 == 0) goto L_0x026f
            int r1 = setMax
            int r1 = r1 + 85
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            r39.parseAdaptationSetChild(r40)
        L_0x026f:
            r10 = r33
            goto L_0x028e
        L_0x0272:
            r0 = move-exception
            throw r0
        L_0x0274:
            r30 = r5
            r3 = r6
            r31 = r7
            r33 = r9
            r34 = r10
            r9 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r7 = r15
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r10 = r33
            r10.add(r1)
        L_0x028e:
            r12 = r3
            r5 = r30
        L_0x0291:
            r11 = r36
            goto L_0x02da
        L_0x0294:
            r0 = move-exception
            r7 = r15
        L_0x0296:
            throw r0
        L_0x0297:
            r30 = r5
            r3 = r6
            r31 = r7
            r34 = r10
            r36 = r12
            r37 = r13
            r38 = r14
            r7 = r15
            r10 = r9
            r9 = r11
            int r1 = setMax
            int r1 = r1 + 23
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            android.util.Pair r1 = r39.parseContentProtection(r40)
            java.lang.Object r2 = r1.first
            if (r2 == 0) goto L_0x02bf
            java.lang.Object r2 = r1.first
            r29 = r2
            java.lang.String r29 = (java.lang.String) r29
        L_0x02bf:
            java.lang.Object r2 = r1.second
            if (r2 == 0) goto L_0x02d5
            int r2 = setMax
            int r2 = r2 + 71
            int r4 = r2 % 128
            getMin = r4
            int r2 = r2 % 2
            java.lang.Object r1 = r1.second
            r11 = r36
            r11.add(r1)
            goto L_0x02d7
        L_0x02d5:
            r11 = r36
        L_0x02d7:
            r12 = r3
            r5 = r30
        L_0x02da:
            java.lang.String r1 = "AdaptationSet"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r1)
            if (r1 == 0) goto L_0x0322
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r8.size()
            r13.<init>(r0)
            r0 = 0
        L_0x02ec:
            int r1 = r8.size()
            r2 = 11
            if (r0 >= r1) goto L_0x02f7
            r1 = 11
            goto L_0x02f9
        L_0x02f7:
            r1 = 68
        L_0x02f9:
            if (r1 == r2) goto L_0x0309
            r1 = r39
            r2 = r16
            r3 = r12
            r4 = r13
            r5 = r34
            r6 = r10
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r0 = r1.buildAdaptationSet(r2, r3, r4, r5, r6)
            return r0
        L_0x0309:
            java.lang.Object r1 = r8.get(r0)
            r2 = r1
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo r2 = (com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.RepresentationInfo) r2
            java.lang.String r3 = r7.contentId
            r1 = r39
            r4 = r29
            r5 = r11
            r6 = r9
            com.google.android.exoplayer2.source.dash.manifest.Representation r1 = r1.buildRepresentation(r2, r3, r4, r5, r6)
            r13.add(r1)
            int r0 = r0 + 1
            goto L_0x02ec
        L_0x0322:
            r15 = r7
            r6 = r12
            r7 = r31
            r13 = r37
            r14 = r38
            r12 = r11
            r11 = r9
            r9 = r10
            r10 = r34
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseAdaptationSet(org.xmlpull.v1.XmlPullParser, java.lang.String, com.google.android.exoplayer2.source.dash.manifest.SegmentBase):com.google.android.exoplayer2.source.dash.manifest.AdaptationSet");
    }

    /* access modifiers changed from: protected */
    public AdaptationSet buildAdaptationSet(int i, int i2, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3) {
        AdaptationSet adaptationSet = new AdaptationSet(i, i2, list, list2, list3);
        try {
            int i3 = setMax + 119;
            getMin = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return adaptationSet;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return adaptationSet;
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        boolean z = false;
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        try {
            if ("audio".equals(attributeValue)) {
                int i = setMax + 35;
                getMin = i % 128;
                int i2 = i % 2;
                int i3 = setMax + 5;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return 1;
            }
            try {
                if (!"video".equals(attributeValue)) {
                    z = true;
                }
                if (!z) {
                    int i5 = getMin + 31;
                    setMax = i5 % 128;
                    int i6 = i5 % 2;
                    return 2;
                } else if ("text".equals(attributeValue)) {
                    return 3;
                } else {
                    return -1;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    public int getContentType(Format format) {
        int i = getMin + 9;
        setMax = i % 128;
        int i2 = i % 2;
        String str = format.sampleMimeType;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            if (MimeTypes.isVideo(str)) {
                int i3 = setMax + 33;
                getMin = i3 % 128;
                if (i3 % 2 != 0) {
                }
                return 2;
            }
            if (MimeTypes.isAudio(str)) {
                z = true;
            }
            if (z) {
                int i4 = setMax + 39;
                getMin = i4 % 128;
                if ((i4 % 2 != 0 ? '[' : '*') != '[') {
                    return 1;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return 1;
            } else if (mimeTypeIsRawText(str)) {
                return 3;
            } else {
                return -1;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.util.UUID} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, java.lang.String, byte[]] */
    /* JADX WARNING: type inference failed for: r6v32, types: [com.google.android.exoplayer2.drm.DrmInitData$SchemeData] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01a1, code lost:
        if (com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTagIgnorePrefix(r14, "pssh") != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ae, code lost:
        if ((!r9) != false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01cb, code lost:
        r2 = android.util.Base64.decode(r14.getText(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01da, code lost:
        r2 = android.util.Base64.decode(r14.getText(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r5 != 1812765994) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r5 != 1812765994) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cd, code lost:
        if (r6 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00db, code lost:
        if ((!"00000000-0000-0000-0000-000000000000".equals(r5)) != true) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x016b, code lost:
        if (r8 != null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0174, code lost:
        if (r8 != null) goto L_0x0176;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0235 A[LOOP:1: B:77:0x0125->B:153:0x0235, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0226 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> parseContentProtection(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r13 = this;
            int r0 = getMin
            int r0 = r0 + 105
            int r1 = r0 % 128
            setMax = r1
            r1 = 2
            int r0 = r0 % r1
            r0 = 0
            java.lang.String r2 = "schemeIdUri"
            java.lang.String r2 = r14.getAttributeValue(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0017
            r5 = 0
            goto L_0x0018
        L_0x0017:
            r5 = 1
        L_0x0018:
            if (r5 == 0) goto L_0x001c
            goto L_0x0099
        L_0x001c:
            int r5 = setMax     // Catch:{ Exception -> 0x023b }
            int r5 = r5 + 3
            int r6 = r5 % 128
            getMin = r6     // Catch:{ Exception -> 0x023b }
            int r5 = r5 % r1
            r6 = 1812765994(0x6c0c9d2a, float:6.799672E26)
            r7 = 755418770(0x2d06c692, float:7.66111E-12)
            r8 = 489446379(0x1d2c5beb, float:2.281153E-21)
            r9 = -1
            if (r5 == 0) goto L_0x0045
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r2)
            int r5 = r2.hashCode()
            r10 = 8
            int r10 = r10 / r4
            if (r5 == r8) goto L_0x008a
            if (r5 == r7) goto L_0x0075
            if (r5 == r6) goto L_0x0054
            goto L_0x0093
        L_0x0043:
            r14 = move-exception
            throw r14
        L_0x0045:
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r2)
            int r5 = r2.hashCode()
            if (r5 == r8) goto L_0x008a
            if (r5 == r7) goto L_0x0075
            if (r5 == r6) goto L_0x0054
            goto L_0x0093
        L_0x0054:
            java.lang.String r5 = "urn:mpeg:dash:mp4protection:2011"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005e
            r2 = 1
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x0093
            int r2 = getMin
            int r2 = r2 + 29
            int r5 = r2 % 128
            setMax = r5
            int r2 = r2 % r1
            r5 = 93
            if (r2 != 0) goto L_0x0071
            r2 = 87
            goto L_0x0073
        L_0x0071:
            r2 = 93
        L_0x0073:
            r9 = 0
            goto L_0x0093
        L_0x0075:
            java.lang.String r5 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x023b }
            if (r2 == 0) goto L_0x0093
            int r2 = getMin
            int r2 = r2 + 43
            int r5 = r2 % 128
            setMax = r5
            int r2 = r2 % r1
            r9 = 2
            goto L_0x0093
        L_0x0088:
            r14 = move-exception
            throw r14
        L_0x008a:
            java.lang.String r5 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0093
            r9 = 1
        L_0x0093:
            if (r9 == 0) goto L_0x00a7
            if (r9 == r3) goto L_0x00a3
            if (r9 == r1) goto L_0x00a0
        L_0x0099:
            r2 = r0
            r5 = r2
        L_0x009b:
            r6 = r5
            r7 = r6
            r8 = 0
            goto L_0x0125
        L_0x00a0:
            java.util.UUID r2 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            goto L_0x00a5
        L_0x00a3:
            java.util.UUID r2 = com.google.android.exoplayer2.C.PLAYREADY_UUID
        L_0x00a5:
            r5 = r0
            goto L_0x009b
        L_0x00a7:
            java.lang.String r2 = "value"
            java.lang.String r2 = r14.getAttributeValue(r0, r2)
            java.lang.String r5 = "default_KID"
            java.lang.String r5 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValueIgnorePrefix(r14, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0120
            int r6 = setMax
            int r6 = r6 + 31
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % r1
            java.lang.String r7 = "00000000-0000-0000-0000-000000000000"
            if (r6 == 0) goto L_0x00d2
            boolean r6 = r7.equals(r5)
            super.hashCode()     // Catch:{ all -> 0x00d0 }
            if (r6 != 0) goto L_0x0120
            goto L_0x00de
        L_0x00d0:
            r14 = move-exception
            throw r14
        L_0x00d2:
            boolean r6 = r7.equals(r5)
            if (r6 != 0) goto L_0x00da
            r6 = 1
            goto L_0x00db
        L_0x00da:
            r6 = 0
        L_0x00db:
            if (r6 == r3) goto L_0x00de
            goto L_0x0120
        L_0x00de:
            java.lang.String r6 = "\\s+"
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            java.util.UUID[] r6 = new java.util.UUID[r6]
            r7 = 0
        L_0x00e8:
            int r8 = r5.length
            if (r7 >= r8) goto L_0x0111
            int r8 = setMax
            int r8 = r8 + 5
            int r9 = r8 % 128
            getMin = r9
            int r8 = r8 % r1
            if (r8 == 0) goto L_0x00f8
            r8 = 0
            goto L_0x00f9
        L_0x00f8:
            r8 = 1
        L_0x00f9:
            if (r8 == r3) goto L_0x0106
            r8 = r5[r7]
            java.util.UUID r8 = java.util.UUID.fromString(r8)
            r6[r7] = r8
            int r7 = r7 + 123
            goto L_0x00e8
        L_0x0106:
            r8 = r5[r7]
            java.util.UUID r8 = java.util.UUID.fromString(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x00e8
        L_0x0111:
            java.util.UUID r5 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            byte[] r5 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(r5, r6, r0)
            java.util.UUID r6 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            r7 = r0
            r8 = 0
            r12 = r5
            r5 = r2
            r2 = r6
            r6 = r12
            goto L_0x0125
        L_0x0120:
            r6 = r0
            r7 = r6
            r5 = r2
            r8 = 0
            r2 = r7
        L_0x0125:
            r14.next()
            java.lang.String r9 = "ms:laurl"
            boolean r9 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r14, r9)
            if (r9 == 0) goto L_0x0151
            int r7 = getMin
            int r7 = r7 + 123
            int r9 = r7 % 128
            setMax = r9
            int r7 = r7 % r1
            java.lang.String r9 = "licenseUrl"
            if (r7 != 0) goto L_0x0147
            java.lang.String r7 = r14.getAttributeValue(r0, r9)
            super.hashCode()     // Catch:{ all -> 0x0145 }
            goto L_0x014b
        L_0x0145:
            r14 = move-exception
            throw r14
        L_0x0147:
            java.lang.String r7 = r14.getAttributeValue(r0, r9)
        L_0x014b:
            r10 = r6
            r11 = r8
            r8 = r7
            r7 = r2
            goto L_0x021e
        L_0x0151:
            java.lang.String r9 = "widevine:license"
            boolean r9 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r14, r9)
            if (r9 == 0) goto L_0x0187
            int r8 = setMax
            int r8 = r8 + 27
            int r9 = r8 % 128
            getMin = r9
            int r8 = r8 % r1
            java.lang.String r9 = "robustness_level"
            if (r8 == 0) goto L_0x0170
            java.lang.String r8 = r14.getAttributeValue(r0, r9)
            int r9 = r0.length     // Catch:{ all -> 0x016e }
            if (r8 == 0) goto L_0x0185
            goto L_0x0176
        L_0x016e:
            r14 = move-exception
            throw r14
        L_0x0170:
            java.lang.String r8 = r14.getAttributeValue(r0, r9)
            if (r8 == 0) goto L_0x0185
        L_0x0176:
            java.lang.String r9 = "HW"
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x0180
            r8 = 0
            goto L_0x0181
        L_0x0180:
            r8 = 1
        L_0x0181:
            if (r8 == r3) goto L_0x0185
            r8 = 1
            goto L_0x014b
        L_0x0185:
            r8 = 0
            goto L_0x014b
        L_0x0187:
            if (r6 != 0) goto L_0x014b
            int r9 = getMin     // Catch:{ Exception -> 0x023b }
            int r9 = r9 + 95
            int r10 = r9 % 128
            setMax = r10     // Catch:{ Exception -> 0x023b }
            int r9 = r9 % 2
            if (r9 != 0) goto L_0x0197
            r9 = 1
            goto L_0x0198
        L_0x0197:
            r9 = 0
        L_0x0198:
            r10 = 4
            java.lang.String r11 = "pssh"
            if (r9 == r3) goto L_0x01a4
            boolean r9 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTagIgnorePrefix(r14, r11)
            if (r9 == 0) goto L_0x01f6
            goto L_0x01b1
        L_0x01a4:
            boolean r9 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTagIgnorePrefix(r14, r11)
            int r11 = r0.length     // Catch:{ all -> 0x021c }
            if (r9 == 0) goto L_0x01ad
            r9 = 0
            goto L_0x01ae
        L_0x01ad:
            r9 = 1
        L_0x01ae:
            if (r9 == 0) goto L_0x01b1
            goto L_0x01f6
        L_0x01b1:
            int r9 = r14.next()
            if (r9 != r10) goto L_0x01f6
            int r2 = getMin
            int r2 = r2 + 13
            int r6 = r2 % 128
            setMax = r6
            int r2 = r2 % r1
            r6 = 19
            if (r2 != 0) goto L_0x01c7
            r2 = 19
            goto L_0x01c9
        L_0x01c7:
            r2 = 26
        L_0x01c9:
            if (r2 == r6) goto L_0x01da
            java.lang.String r2 = r14.getText()
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.util.UUID r6 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseUuid(r2)
            if (r6 != 0) goto L_0x01f1
            goto L_0x01e8
        L_0x01da:
            java.lang.String r2 = r14.getText()
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.util.UUID r6 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseUuid(r2)
            if (r6 != 0) goto L_0x01f1
        L_0x01e8:
            java.lang.String r2 = "MpdParser"
            java.lang.String r9 = "Skipping malformed cenc:pssh data"
            com.google.android.exoplayer2.util.Log.w(r2, r9)
            r10 = r0
            goto L_0x01f2
        L_0x01f1:
            r10 = r2
        L_0x01f2:
            r11 = r8
            r8 = r7
            r7 = r6
            goto L_0x021e
        L_0x01f6:
            java.util.UUID r9 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x014b
            java.lang.String r9 = "mspr:pro"
            boolean r9 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r14, r9)
            if (r9 == 0) goto L_0x014b
            int r9 = r14.next()
            if (r9 != r10) goto L_0x014b
            java.util.UUID r6 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            java.lang.String r9 = r14.getText()
            byte[] r9 = android.util.Base64.decode(r9, r4)
            byte[] r6 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(r6, r9)
            goto L_0x014b
        L_0x021c:
            r14 = move-exception
            throw r14
        L_0x021e:
            java.lang.String r2 = "ContentProtection"
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r14, r2)
            if (r2 == 0) goto L_0x0235
            if (r7 == 0) goto L_0x0230
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r9 = "video/mp4"
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0230:
            android.util.Pair r14 = android.util.Pair.create(r5, r0)
            return r14
        L_0x0235:
            r2 = r7
            r7 = r8
            r6 = r10
            r8 = r11
            goto L_0x0125
        L_0x023b:
            r14 = move-exception
            goto L_0x023e
        L_0x023d:
            throw r14
        L_0x023e:
            goto L_0x023d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseContentProtection(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
    /* access modifiers changed from: protected */
    public int parseRole(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z;
        int i = setMax + 69;
        getMin = i % 128;
        int i2 = i % 2;
        ? r1 = 0;
        try {
            String parseString = parseString(xmlPullParser, "schemeIdUri", r1);
            try {
                String parseString2 = parseString(xmlPullParser, "value", r1);
                int i3 = setMax + 119;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                do {
                    xmlPullParser.next();
                    if (XmlPullParserUtil.isEndTag(xmlPullParser, "Role")) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } while (!z);
                if ("urn:mpeg:dash:role:2011".equals(parseString)) {
                    int i5 = setMax + 9;
                    getMin = i5 % 128;
                    int i6 = i5 % 2;
                    if (("main".equals(parseString2) ? ',' : '?') != '?') {
                        return 1;
                    }
                }
                int i7 = setMax + 81;
                getMin = i7 % 128;
                if (i7 % 2 == 0) {
                    return 0;
                }
                int length2 = r1.length;
                return 0;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01e0 A[LOOP:0: B:1:0x0059->B:87:0x01e0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019e A[EDGE_INSN: B:90:0x019e->B:82:0x019e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.RepresentationInfo parseRepresentation(org.xmlpull.v1.XmlPullParser r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, int r31, float r32, int r33, int r34, java.lang.String r35, int r36, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r37, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r38) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r24 = this;
            r15 = r24
            r0 = r25
            r1 = 0
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.getAttributeValue(r1, r2)
            r3 = -1
            java.lang.String r4 = "bandwidth"
            int r10 = parseInt(r0, r4, r3)
            java.lang.String r3 = "mimeType"
            r4 = r28
            java.lang.String r4 = parseString(r0, r3, r4)
            java.lang.String r3 = "codecs"
            r5 = r29
            java.lang.String r14 = parseString(r0, r3, r5)
            java.lang.String r3 = "width"
            r5 = r30
            int r5 = parseInt(r0, r3, r5)
            java.lang.String r3 = "height"
            r6 = r31
            int r6 = parseInt(r0, r3, r6)
            r3 = r32
            float r7 = parseFrameRate(r0, r3)
            java.lang.String r3 = "audioSamplingRate"
            r8 = r34
            int r9 = parseInt(r0, r3, r8)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r8 = r26
            r16 = r33
            r17 = r38
            r19 = r1
            r18 = 0
        L_0x0059:
            r25.next()
            java.lang.String r3 = "BaseURL"
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r3)
            r20 = 1
            if (r3 == 0) goto L_0x0078
            if (r18 != 0) goto L_0x0073
            java.lang.String r3 = parseBaseUrl(r0, r8)
            r8 = r16
            r18 = 1
            r16 = r3
            goto L_0x0087
        L_0x0073:
            r3 = r1
            r26 = r8
            goto L_0x0177
        L_0x0078:
            java.lang.String r3 = "AudioChannelConfiguration"
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r3)
            if (r3 == 0) goto L_0x008a
            int r3 = r24.parseAudioChannelConfiguration(r25)
            r16 = r8
            r8 = r3
        L_0x0087:
            r3 = r1
            goto L_0x0196
        L_0x008a:
            java.lang.String r3 = "SegmentBase"
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r3)
            if (r3 == 0) goto L_0x00a5
            r3 = r17
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r3 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase) r3
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r3 = r15.parseSegmentBase(r0, r3)
            r17 = r3
            r3 = r1
            r23 = r16
            r16 = r8
            r8 = r23
            goto L_0x0196
        L_0x00a5:
            java.lang.String r3 = "SegmentList"
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r3)     // Catch:{ Exception -> 0x01eb }
            r1 = 95
            if (r3 == 0) goto L_0x00b2
            r3 = 95
            goto L_0x00b4
        L_0x00b2:
            r3 = 24
        L_0x00b4:
            if (r3 == r1) goto L_0x0188
            java.lang.String r1 = "SegmentTemplate"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L_0x00c0
            r1 = 0
            goto L_0x00c1
        L_0x00c0:
            r1 = 1
        L_0x00c1:
            if (r1 == 0) goto L_0x017c
            java.lang.String r1 = "ContentProtection"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L_0x010f
            android.util.Pair r1 = r24.parseContentProtection(r25)
            java.lang.Object r3 = r1.first
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r1.first
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
        L_0x00d9:
            java.lang.Object r3 = r1.second
            if (r3 == 0) goto L_0x00fe
            int r3 = setMax
            int r3 = r3 + 13
            r26 = r8
            int r8 = r3 % 128
            getMin = r8
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x00f6
            java.lang.Object r1 = r1.second
            r13.add(r1)
            r1 = 0
            int r3 = r1.length     // Catch:{ all -> 0x00f3 }
            goto L_0x0100
        L_0x00f3:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00f6:
            java.lang.Object r1 = r1.second     // Catch:{ Exception -> 0x00fc }
            r13.add(r1)     // Catch:{ Exception -> 0x00fc }
            goto L_0x0100
        L_0x00fc:
            r0 = move-exception
            goto L_0x013d
        L_0x00fe:
            r26 = r8
        L_0x0100:
            int r1 = setMax
            int r1 = r1 + 77
            int r3 = r1 % 128
            getMin = r3
            int r1 = r1 % 2
            r8 = r16
            r3 = 0
            goto L_0x0179
        L_0x010f:
            r26 = r8
            java.lang.String r1 = "InbandEventStream"
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r3 == 0) goto L_0x013e
            int r3 = setMax
            int r3 = r3 + 123
            int r8 = r3 % 128
            getMin = r8
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x0134
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r12.add(r1)
            r1 = 60
            r3 = 0
            int r1 = r1 / r3
            goto L_0x014b
        L_0x0131:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0134:
            r3 = 0
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r12.add(r1)
            goto L_0x014b
        L_0x013d:
            throw r0
        L_0x013e:
            r3 = 0
            java.lang.String r1 = "SupplementalProperty"
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r8 == 0) goto L_0x0149
            r20 = 0
        L_0x0149:
            if (r20 == 0) goto L_0x014d
        L_0x014b:
            r3 = 0
            goto L_0x0177
        L_0x014d:
            int r8 = setMax
            int r8 = r8 + 39
            int r3 = r8 % 128
            getMin = r3
            int r8 = r8 % 2
            r3 = 83
            if (r8 == 0) goto L_0x015e
            r8 = 93
            goto L_0x0160
        L_0x015e:
            r8 = 83
        L_0x0160:
            if (r8 == r3) goto L_0x016f
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r11.add(r1)
            r3 = 0
            int r1 = r3.length     // Catch:{ all -> 0x016c }
            goto L_0x0177
        L_0x016c:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x016f:
            r3 = 0
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r11.add(r1)
        L_0x0177:
            r8 = r16
        L_0x0179:
            r16 = r26
            goto L_0x0196
        L_0x017c:
            r26 = r8
            r3 = 0
            r1 = r17
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r1 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate) r1
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r1 = r15.parseSegmentTemplate(r0, r1)
            goto L_0x0193
        L_0x0188:
            r26 = r8
            r3 = 0
            r1 = r17
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r1 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList) r1
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r1 = r15.parseSegmentList(r0, r1)
        L_0x0193:
            r17 = r1
            goto L_0x0177
        L_0x0196:
            java.lang.String r1 = "Representation"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r1)
            if (r1 == 0) goto L_0x01e0
            r1 = r24
            r3 = r27
            r20 = r11
            r11 = r35
            r21 = r12
            r12 = r36
            r22 = r13
            r13 = r37
            r15 = r20
            com.google.android.exoplayer2.Format r0 = r1.buildFormat(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r17 == 0) goto L_0x01b7
            goto L_0x01c8
        L_0x01b7:
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r1 = new com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase
            r1.<init>()
            int r2 = getMin
            int r2 = r2 + 11
            int r3 = r2 % 128
            setMax = r3
            int r2 = r2 % 2
            r17 = r1
        L_0x01c8:
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo r1 = new com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo
            r2 = -1
            r25 = r1
            r26 = r0
            r27 = r16
            r28 = r17
            r29 = r19
            r30 = r22
            r31 = r21
            r32 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            return r1
        L_0x01e0:
            r15 = r24
            r1 = r3
            r23 = r16
            r16 = r8
            r8 = r23
            goto L_0x0059
        L_0x01eb:
            r0 = move-exception
            goto L_0x01ee
        L_0x01ed:
            throw r0
        L_0x01ee:
            goto L_0x01ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseRepresentation(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, int, java.util.List, com.google.android.exoplayer2.source.dash.manifest.SegmentBase):com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo");
    }

    /* access modifiers changed from: protected */
    public Format buildFormat(String str, String str2, String str3, int i, int i2, float f, int i3, int i4, int i5, String str4, int i6, List<Descriptor> list, String str5, List<Descriptor> list2) {
        String str6;
        int i7;
        int parseCea708AccessibilityChannel;
        String str7 = str3;
        String sampleMimeType = getSampleMimeType(str3, str5);
        if ((sampleMimeType != null ? '(' : ',') != ',') {
            if (MimeTypes.AUDIO_E_AC3.equals(sampleMimeType)) {
                int i8 = getMin + 51;
                setMax = i8 % 128;
                int i9 = i8 % 2;
                sampleMimeType = parseEac3SupplementalProperties(list2);
            }
            str6 = sampleMimeType;
            if (MimeTypes.isVideo(str6)) {
                Format createVideoContainerFormat = Format.createVideoContainerFormat(str, str2, str3, str6, str5, i5, i, i2, f, (List<byte[]>) null, i6);
                int i10 = getMin + 31;
                setMax = i10 % 128;
                int i11 = i10 % 2;
                return createVideoContainerFormat;
            } else if (MimeTypes.isAudio(str6)) {
                try {
                    Format createAudioContainerFormat = Format.createAudioContainerFormat(str, str2, str3, str6, str5, i5, i3, i4, (List<byte[]>) null, i6, str4);
                    int i12 = setMax + 49;
                    getMin = i12 % 128;
                    if (i12 % 2 == 0) {
                        return createAudioContainerFormat;
                    }
                    Object[] objArr = null;
                    try {
                        int length2 = objArr.length;
                        return createAudioContainerFormat;
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else if (mimeTypeIsRawText(str6)) {
                if ((MimeTypes.APPLICATION_CEA608.equals(str6) ? '5' : 'K') != 'K') {
                    try {
                        parseCea708AccessibilityChannel = parseCea608AccessibilityChannel(list);
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else if (MimeTypes.APPLICATION_CEA708.equals(str6)) {
                    parseCea708AccessibilityChannel = parseCea708AccessibilityChannel(list);
                    int i13 = getMin + 79;
                    setMax = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    i7 = -1;
                    Format createTextContainerFormat = Format.createTextContainerFormat(str, str2, str3, str6, str5, i5, i6, str4, i7);
                    int i15 = getMin + 119;
                    setMax = i15 % 128;
                    int i16 = i15 % 2;
                    return createTextContainerFormat;
                }
                i7 = parseCea708AccessibilityChannel;
                Format createTextContainerFormat2 = Format.createTextContainerFormat(str, str2, str3, str6, str5, i5, i6, str4, i7);
                int i152 = getMin + 119;
                setMax = i152 % 128;
                int i162 = i152 % 2;
                return createTextContainerFormat2;
            }
        } else {
            str6 = sampleMimeType;
        }
        return Format.createContainerFormat(str, str2, str3, str6, str5, i5, i6, str4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if ((r9.drmSchemeType != null ? 4 : 'O') != 'O') goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r1 != null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.Representation buildRepresentation(com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.RepresentationInfo r9, java.lang.String r10, java.lang.String r11, java.util.ArrayList<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r12, java.util.ArrayList<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r13) {
        /*
            r8 = this;
            int r0 = getMin
            int r0 = r0 + 117
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == r1) goto L_0x001f
            com.google.android.exoplayer2.Format r0 = r9.format
            java.lang.String r1 = r9.drmSchemeType
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0039
            goto L_0x002d
        L_0x001d:
            r9 = move-exception
            throw r9
        L_0x001f:
            com.google.android.exoplayer2.Format r0 = r9.format
            java.lang.String r1 = r9.drmSchemeType
            r2 = 79
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002b
        L_0x0029:
            r1 = 79
        L_0x002b:
            if (r1 == r2) goto L_0x0039
        L_0x002d:
            int r11 = getMin
            int r11 = r11 + 45
            int r1 = r11 % 128
            setMax = r1
            int r11 = r11 % 2
            java.lang.String r11 = r9.drmSchemeType
        L_0x0039:
            java.util.ArrayList<com.google.android.exoplayer2.drm.DrmInitData$SchemeData> r1 = r9.drmSchemeDatas
            r1.addAll(r12)
            boolean r12 = r1.isEmpty()
            if (r12 != 0) goto L_0x0050
            filterRedundantIncompleteSchemeDatas(r1)
            com.google.android.exoplayer2.drm.DrmInitData r12 = new com.google.android.exoplayer2.drm.DrmInitData
            r12.<init>((java.lang.String) r11, (java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData>) r1)
            com.google.android.exoplayer2.Format r0 = r0.copyWithDrmInitData(r12)
        L_0x0050:
            r4 = r0
            java.util.ArrayList<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r7 = r9.inbandEventStreams
            r7.addAll(r13)
            long r2 = r9.revisionId
            java.lang.String r5 = r9.baseUrl
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase r6 = r9.segmentBase
            r1 = r10
            com.google.android.exoplayer2.source.dash.manifest.Representation r9 = com.google.android.exoplayer2.source.dash.manifest.Representation.newInstance(r1, r2, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.buildRepresentation(com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList):com.google.android.exoplayer2.source.dash.manifest.Representation");
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase parseSegmentBase(org.xmlpull.v1.XmlPullParser r20, com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x000a
            r4 = 1
            goto L_0x000b
        L_0x000a:
            r4 = 0
        L_0x000b:
            if (r4 == r3) goto L_0x0010
            r7 = 1
            goto L_0x0012
        L_0x0010:
            long r7 = r1.timescale     // Catch:{ Exception -> 0x00dc }
        L_0x0012:
            java.lang.String r4 = "timescale"
            long r11 = parseLong(r0, r4, r7)
            if (r1 == 0) goto L_0x001d
            long r9 = r1.presentationTimeOffset
            goto L_0x0029
        L_0x001d:
            int r4 = getMin
            int r4 = r4 + 57
            int r9 = r4 % 128
            setMax = r9
            int r4 = r4 % 2
            r9 = 0
        L_0x0029:
            java.lang.String r4 = "presentationTimeOffset"
            long r13 = parseLong(r0, r4, r9)
            r4 = 53
            r9 = 68
            if (r1 == 0) goto L_0x0038
            r10 = 68
            goto L_0x003a
        L_0x0038:
            r10 = 53
        L_0x003a:
            if (r10 == r4) goto L_0x003f
            long r7 = r1.indexStart
            goto L_0x0041
        L_0x003f:
            r7 = 0
        L_0x0041:
            r4 = 0
            if (r1 == 0) goto L_0x0062
            int r10 = setMax
            int r10 = r10 + 13
            int r15 = r10 % 128
            getMin = r15
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x0052
            r10 = 0
            goto L_0x0053
        L_0x0052:
            r10 = 1
        L_0x0053:
            if (r10 == r3) goto L_0x005f
            long r5 = r1.indexLength     // Catch:{ Exception -> 0x005c }
            int r10 = r4.length     // Catch:{ all -> 0x0059 }
            goto L_0x0064
        L_0x0059:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x005c:
            r0 = move-exception
            goto L_0x00db
        L_0x005f:
            long r5 = r1.indexLength
            goto L_0x0064
        L_0x0062:
            r5 = 0
        L_0x0064:
            java.lang.String r10 = "indexRange"
            java.lang.String r10 = r0.getAttributeValue(r4, r10)
            if (r10 == 0) goto L_0x006f
            r15 = 68
            goto L_0x0071
        L_0x006f:
            r15 = 14
        L_0x0071:
            if (r15 == r9) goto L_0x0077
            r17 = r5
            r15 = r7
            goto L_0x0090
        L_0x0077:
            java.lang.String r5 = "-"
            java.lang.String[] r5 = r10.split(r5)
            r2 = r5[r2]
            long r6 = java.lang.Long.parseLong(r2)
            r2 = r5[r3]
            long r2 = java.lang.Long.parseLong(r2)
            long r2 = r2 - r6
            r8 = 1
            long r2 = r2 + r8
            r17 = r2
            r15 = r6
        L_0x0090:
            if (r1 == 0) goto L_0x009e
            int r2 = getMin
            int r2 = r2 + 19
            int r3 = r2 % 128
            setMax = r3
            int r2 = r2 % 2
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r4 = r1.initialization
        L_0x009e:
            r20.next()     // Catch:{ Exception -> 0x005c }
            java.lang.String r1 = "Initialization"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)     // Catch:{ Exception -> 0x005c }
            r2 = 37
            if (r1 == 0) goto L_0x00ae
            r1 = 37
            goto L_0x00b0
        L_0x00ae:
            r1 = 59
        L_0x00b0:
            if (r1 == r2) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r19.parseInitialization(r20)
            r4 = r1
        L_0x00b8:
            java.lang.String r1 = "SegmentBase"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r1)
            r2 = 71
            if (r1 == 0) goto L_0x00c5
            r1 = 87
            goto L_0x00c7
        L_0x00c5:
            r1 = 71
        L_0x00c7:
            if (r1 == r2) goto L_0x009e
            int r0 = getMin
            int r0 = r0 + 21
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r9 = r19
            r10 = r4
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r0 = r9.buildSingleSegmentBase(r10, r11, r13, r15, r17)
            return r0
        L_0x00db:
            throw r0
        L_0x00dc:
            r0 = move-exception
            r1 = r0
            goto L_0x00e0
        L_0x00df:
            throw r1
        L_0x00e0:
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseSegmentBase(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase):com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase");
    }

    /* access modifiers changed from: protected */
    public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
        SegmentBase.SingleSegmentBase singleSegmentBase = new SegmentBase.SingleSegmentBase(rangedUri, j, j2, j3, j4);
        try {
            int i = setMax + 59;
            try {
                getMin = i % 128;
                int i2 = i % 2;
                return singleSegmentBase;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.util.List<com.google.android.exoplayer2.source.dash.manifest.RangedUri>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d7, code lost:
        if (r1 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r1 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e1, code lost:
        if (r2 != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1 != null) goto L_0x001e;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList parseSegmentList(org.xmlpull.v1.XmlPullParser r21, com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            int r2 = setMax
            int r2 = r2 + 57
            int r3 = r2 % 128
            getMin = r3
            int r2 = r2 % 2
            r3 = 1
            r5 = 0
            if (r2 == 0) goto L_0x001c
            r2 = 66
            int r2 = r2 / r5
            if (r1 == 0) goto L_0x0021
            goto L_0x001e
        L_0x0019:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x001c:
            if (r1 == 0) goto L_0x0021
        L_0x001e:
            long r6 = r1.timescale
            goto L_0x0022
        L_0x0021:
            r6 = r3
        L_0x0022:
            java.lang.String r2 = "timescale"
            long r10 = parseLong(r0, r2, r6)
            r2 = 1
            if (r1 == 0) goto L_0x002d
            r6 = 0
            goto L_0x002e
        L_0x002d:
            r6 = 1
        L_0x002e:
            if (r6 == r2) goto L_0x0035
            long r6 = r1.presentationTimeOffset     // Catch:{ Exception -> 0x0033 }
            goto L_0x0041
        L_0x0033:
            r0 = move-exception
            goto L_0x0098
        L_0x0035:
            r6 = 0
            int r8 = setMax
            int r8 = r8 + 57
            int r9 = r8 % 128
            getMin = r9
            int r8 = r8 % 2
        L_0x0041:
            java.lang.String r8 = "presentationTimeOffset"
            long r12 = parseLong(r0, r8, r6)
            if (r1 == 0) goto L_0x0056
            long r6 = r1.duration
            int r8 = getMin
            int r8 = r8 + 77
            int r9 = r8 % 128
            setMax = r9
            int r8 = r8 % 2
            goto L_0x005b
        L_0x0056:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x005b:
            java.lang.String r8 = "duration"
            long r16 = parseLong(r0, r8, r6)
            if (r1 == 0) goto L_0x006f
            int r3 = setMax
            int r3 = r3 + 15
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % 2
            long r3 = r1.startNumber
        L_0x006f:
            java.lang.String r6 = "startNumber"
            long r14 = parseLong(r0, r6, r3)
            r3 = 0
            r4 = r3
            r6 = r4
            r7 = r6
        L_0x0079:
            r21.next()
            java.lang.String r8 = "Initialization"
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r8)
            if (r8 == 0) goto L_0x0086
            r8 = 1
            goto L_0x0087
        L_0x0086:
            r8 = 0
        L_0x0087:
            if (r8 == 0) goto L_0x0099
            int r6 = setMax     // Catch:{ Exception -> 0x0033 }
            int r6 = r6 + 119
            int r8 = r6 % 128
            getMin = r8     // Catch:{ Exception -> 0x0033 }
            int r6 = r6 % 2
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = r20.parseInitialization(r21)
            goto L_0x00c1
        L_0x0098:
            throw r0
        L_0x0099:
            java.lang.String r8 = "SegmentTimeline"
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r8)
            if (r8 == 0) goto L_0x00a3
            r8 = 0
            goto L_0x00a4
        L_0x00a3:
            r8 = 1
        L_0x00a4:
            if (r8 == 0) goto L_0x00bd
            java.lang.String r8 = "SegmentURL"
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r8)
            if (r8 == 0) goto L_0x00c1
            if (r4 != 0) goto L_0x00b5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x00b5:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r8 = r20.parseSegmentUrl(r21)
            r4.add(r8)
            goto L_0x00c1
        L_0x00bd:
            java.util.List r7 = r20.parseSegmentTimeline(r21)
        L_0x00c1:
            java.lang.String r8 = "SegmentList"
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r8)
            if (r8 == 0) goto L_0x0079
            int r0 = getMin
            r8 = 99
            int r0 = r0 + r8
            int r9 = r0 % 128
            setMax = r9
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x00dd
            int r0 = r3.length     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x011c
            goto L_0x00e3
        L_0x00da:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00dd:
            if (r1 == 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r2 = 0
        L_0x00e1:
            if (r2 == 0) goto L_0x011c
        L_0x00e3:
            r0 = 35
            if (r6 == 0) goto L_0x00ea
            r2 = 35
            goto L_0x00ec
        L_0x00ea:
            r2 = 34
        L_0x00ec:
            if (r2 == r0) goto L_0x00f0
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = r1.initialization
        L_0x00f0:
            if (r7 == 0) goto L_0x0104
            int r0 = getMin
            int r0 = r0 + 89
            int r2 = r0 % 128
            setMax = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0106
            r0 = 4
            int r0 = r0 / r5
            goto L_0x0106
        L_0x0101:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0104:
            java.util.List r7 = r1.segmentTimeline
        L_0x0106:
            r0 = 96
            if (r4 == 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r8 = 96
        L_0x010d:
            if (r8 == r0) goto L_0x0110
            goto L_0x011c
        L_0x0110:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.RangedUri> r4 = r1.mediaSegments
            int r0 = setMax
            int r0 = r0 + 119
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
        L_0x011c:
            r19 = r4
            r9 = r6
            r18 = r7
            r8 = r20
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r0 = r8.buildSegmentList(r9, r10, r12, r14, r16, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseSegmentList(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList):com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList");
    }

    /* access modifiers changed from: protected */
    public SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, List<SegmentBase.SegmentTimelineElement> list, List<RangedUri> list2) {
        SegmentBase.SegmentList segmentList = new SegmentBase.SegmentList(rangedUri, j, j2, j3, j4, list, list2);
        int i = setMax + 117;
        getMin = i % 128;
        int i2 = i % 2;
        return segmentList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.google.android.exoplayer2.source.dash.manifest.UrlTemplate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.exoplayer2.source.dash.manifest.UrlTemplate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.exoplayer2.source.dash.manifest.UrlTemplate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.google.android.exoplayer2.source.dash.manifest.UrlTemplate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.google.android.exoplayer2.source.dash.manifest.UrlTemplate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.google.android.exoplayer2.source.dash.manifest.UrlTemplate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: com.google.android.exoplayer2.source.dash.manifest.UrlTemplate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: com.google.android.exoplayer2.source.dash.manifest.RangedUri} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate parseSegmentTemplate(org.xmlpull.v1.XmlPullParser r19, com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r18 = this;
            r14 = r18
            r0 = r19
            r1 = r20
            r3 = 9
            if (r1 == 0) goto L_0x000d
            r4 = 94
            goto L_0x000f
        L_0x000d:
            r4 = 9
        L_0x000f:
            r5 = 1
            if (r4 == r3) goto L_0x0019
            long r3 = r1.timescale     // Catch:{ Exception -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r0 = move-exception
            goto L_0x0138
        L_0x0019:
            r3 = r5
        L_0x001a:
            java.lang.String r7 = "timescale"
            long r3 = parseLong(r0, r7, r3)
            if (r1 == 0) goto L_0x0025
            long r7 = r1.presentationTimeOffset
            goto L_0x0027
        L_0x0025:
            r7 = 0
        L_0x0027:
            java.lang.String r9 = "presentationTimeOffset"
            long r7 = parseLong(r0, r9, r7)
            if (r1 == 0) goto L_0x0032
            long r9 = r1.duration
            goto L_0x0037
        L_0x0032:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0037:
            java.lang.String r11 = "duration"
            long r9 = parseLong(r0, r11, r9)
            if (r1 == 0) goto L_0x0041
            long r5 = r1.startNumber
        L_0x0041:
            java.lang.String r11 = "startNumber"
            long r11 = parseLong(r0, r11, r5)
            r5 = 0
            if (r1 == 0) goto L_0x004d
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r6 = r1.mediaTemplate
            goto L_0x004e
        L_0x004d:
            r6 = r5
        L_0x004e:
            java.lang.String r13 = "media"
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r13 = r14.parseUrlTemplate(r0, r13, r6)
            r6 = 1
            if (r1 == 0) goto L_0x0059
            r2 = 0
            goto L_0x005a
        L_0x0059:
            r2 = 1
        L_0x005a:
            if (r2 == r6) goto L_0x0077
            int r2 = setMax
            int r2 = r2 + 77
            int r6 = r2 % 128
            getMin = r6
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x006a
            r6 = 1
            goto L_0x006b
        L_0x006a:
            r6 = 0
        L_0x006b:
            if (r6 == 0) goto L_0x0074
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r2 = r1.initializationTemplate
            int r6 = r5.length     // Catch:{ all -> 0x0071 }
            goto L_0x0078
        L_0x0071:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0074:
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r2 = r1.initializationTemplate
            goto L_0x0078
        L_0x0077:
            r2 = r5
        L_0x0078:
            java.lang.String r6 = "initialization"
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r17 = r14.parseUrlTemplate(r0, r6, r2)
            r2 = r5
            r6 = r2
        L_0x0080:
            r19.next()
            java.lang.String r15 = "Initialization"
            boolean r15 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r15)
            if (r15 == 0) goto L_0x00a7
            int r2 = setMax
            int r2 = r2 + 111
            int r15 = r2 % 128
            getMin = r15
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x00a2
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r2 = r18.parseInitialization(r19)
            super.hashCode()     // Catch:{ all -> 0x009f }
            goto L_0x00bd
        L_0x009f:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00a2:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r2 = r18.parseInitialization(r19)
            goto L_0x00bd
        L_0x00a7:
            java.lang.String r15 = "SegmentTimeline"
            boolean r15 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r15)
            if (r15 == 0) goto L_0x00bd
            int r6 = getMin
            int r6 = r6 + 125
            int r15 = r6 % 128
            setMax = r15
            int r6 = r6 % 2
            java.util.List r6 = r18.parseSegmentTimeline(r19)
        L_0x00bd:
            java.lang.String r15 = "SegmentTemplate"
            boolean r15 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r15)     // Catch:{ Exception -> 0x0016 }
            r5 = 43
            if (r15 == 0) goto L_0x00ca
            r15 = 27
            goto L_0x00cc
        L_0x00ca:
            r15 = 43
        L_0x00cc:
            if (r15 == r5) goto L_0x0133
            r0 = 35
            if (r1 == 0) goto L_0x0109
            r5 = 38
            if (r2 == 0) goto L_0x00d9
            r15 = 38
            goto L_0x00db
        L_0x00d9:
            r15 = 26
        L_0x00db:
            if (r15 == r5) goto L_0x00e0
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r2 = r1.initialization
            goto L_0x00f4
        L_0x00e0:
            int r5 = getMin
            int r5 = r5 + 105
            int r15 = r5 % 128
            setMax = r15
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x00f4
            r5 = 94
            r15 = 0
            int r5 = r5 / r15
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00f4:
            if (r6 == 0) goto L_0x0107
            int r1 = setMax
            int r1 = r1 + r0
            int r5 = r1 % 128
            getMin = r5
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0109
            r15 = 0
            int r1 = r15.length     // Catch:{ all -> 0x0104 }
            goto L_0x0109
        L_0x0104:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0107:
            java.util.List r6 = r1.segmentTimeline
        L_0x0109:
            r15 = r6
            r1 = r18
            r5 = r7
            r7 = r11
            r11 = r15
            r12 = r17
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r1 = r1.buildSegmentTemplate(r2, r3, r5, r7, r9, r11, r12, r13)     // Catch:{ Exception -> 0x0131 }
            int r2 = setMax     // Catch:{ Exception -> 0x0131 }
            int r2 = r2 + 125
            int r3 = r2 % 128
            getMin = r3
            int r2 = r2 % 2
            r3 = 78
            if (r2 == 0) goto L_0x0125
            r0 = 78
        L_0x0125:
            if (r0 == r3) goto L_0x0128
            return r1
        L_0x0128:
            r0 = 7
            r16 = 0
            int r0 = r0 / 0
            return r1
        L_0x012e:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0131:
            r0 = move-exception
            throw r0
        L_0x0133:
            r5 = 94
            r5 = 0
            goto L_0x0080
        L_0x0138:
            goto L_0x013a
        L_0x0139:
            throw r0
        L_0x013a:
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseSegmentTemplate(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate):com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate");
    }

    /* access modifiers changed from: protected */
    public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, List<SegmentBase.SegmentTimelineElement> list, UrlTemplate urlTemplate, UrlTemplate urlTemplate2) {
        SegmentBase.SegmentTemplate segmentTemplate = new SegmentBase.SegmentTemplate(rangedUri, j, j2, j3, j4, list, urlTemplate, urlTemplate2);
        int i = setMax + 9;
        getMin = i % 128;
        int i2 = i % 2;
        return segmentTemplate;
    }

    /* access modifiers changed from: protected */
    public EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        char c;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        try {
            String parseString = parseString(xmlPullParser2, "schemeIdUri", "");
            String parseString2 = parseString(xmlPullParser2, "value", "");
            long parseLong = parseLong(xmlPullParser2, "timescale", 1);
            ArrayList arrayList = new ArrayList();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            do {
                xmlPullParser.next();
                c = 0;
                if (!(!XmlPullParserUtil.isStartTag(xmlPullParser2, "Event"))) {
                    int i = setMax + 23;
                    getMin = i % 128;
                    int i2 = i % 2;
                    arrayList.add(parseEvent(xmlPullParser, parseString, parseString2, parseLong, byteArrayOutputStream));
                }
            } while (!XmlPullParserUtil.isEndTag(xmlPullParser2, "EventStream"));
            int i3 = setMax + 55;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            long[] jArr = new long[arrayList.size()];
            EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
            int i5 = 0;
            while (true) {
                if (!(i5 < arrayList.size())) {
                    break;
                }
                int i6 = getMin + 117;
                setMax = i6 % 128;
                int i7 = i6 % 2;
                EventMessage eventMessage = (EventMessage) arrayList.get(i5);
                jArr[i5] = eventMessage.presentationTimeUs;
                eventMessageArr[i5] = eventMessage;
                i5++;
            }
            EventStream buildEventStream = buildEventStream(parseString, parseString2, parseLong, jArr, eventMessageArr);
            int i8 = getMin + 57;
            setMax = i8 % 128;
            if (i8 % 2 == 0) {
                c = '#';
            }
            if (c == 0) {
                return buildEventStream;
            }
            Object obj = null;
            try {
                super.hashCode();
                return buildEventStream;
            } catch (Throwable th) {
                throw th;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public EventStream buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        EventStream eventStream = new EventStream(str, str2, j, jArr, eventMessageArr);
        int i = getMin + 29;
        setMax = i % 128;
        int i2 = i % 2;
        return eventStream;
    }

    /* access modifiers changed from: protected */
    public EventMessage parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int i = getMin + 99;
        setMax = i % 128;
        int i2 = i % 2;
        long parseLong = parseLong(xmlPullParser2, "id", 0);
        long parseLong2 = parseLong(xmlPullParser2, "duration", C.TIME_UNSET);
        long parseLong3 = parseLong(xmlPullParser2, "presentationTime", 0);
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(parseLong2, 1000, j);
        long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parseLong3, 1000000, j);
        String parseString = parseString(xmlPullParser2, "messageData", (String) null);
        byte[] parseEventObject = parseEventObject(xmlPullParser2, byteArrayOutputStream);
        if ((parseString == null ? '/' : 13) != '/') {
            parseEventObject = Util.getUtf8Bytes(parseString);
        } else {
            try {
                int i3 = getMin + 31;
                setMax = i3 % 128;
                if ((i3 % 2 == 0 ? (char) 4 : 25) == 4) {
                    try {
                        int i4 = 45 / 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return buildEvent(str, str2, parseLong, scaleLargeTimestamp, parseEventObject, scaleLargeTimestamp2);
    }

    /* access modifiers changed from: protected */
    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        int i;
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, setMin(new int[]{0, 5, 0, 0}, new byte[]{0, 1, 1, 0, 1}, URLUtil.isJavaScriptUrl(RDConstant.JAVASCRIPT_SCHEME)).intern());
        xmlPullParser.nextToken();
        while (true) {
            int i2 = 0;
            if (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
                switch (xmlPullParser.getEventType()) {
                    case 0:
                        newSerializer.startDocument((String) null, Boolean.FALSE);
                        continue;
                    case 1:
                        newSerializer.endDocument();
                        continue;
                    case 2:
                        newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                        while (i2 < xmlPullParser.getAttributeCount()) {
                            int i3 = getMin + 91;
                            setMax = i3 % 128;
                            if (i3 % 2 == 0) {
                                newSerializer.attribute(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
                                i2 += 41;
                            } else {
                                newSerializer.attribute(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
                                i2++;
                            }
                            int i4 = getMin + 83;
                            setMax = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        continue;
                    case 3:
                        newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                        continue;
                    case 4:
                        newSerializer.text(xmlPullParser.getText());
                        continue;
                    case 5:
                        newSerializer.cdsect(xmlPullParser.getText());
                        continue;
                    case 6:
                        newSerializer.entityRef(xmlPullParser.getText());
                        continue;
                    case 7:
                        newSerializer.ignorableWhitespace(xmlPullParser.getText());
                        i = getMin + 85;
                        setMax = i % 128;
                        break;
                    case 8:
                        newSerializer.processingInstruction(xmlPullParser.getText());
                        i = setMax + 103;
                        getMin = i % 128;
                        break;
                    case 9:
                        newSerializer.comment(xmlPullParser.getText());
                        continue;
                    case 10:
                        newSerializer.docdecl(xmlPullParser.getText());
                        continue;
                }
                int i6 = i % 2;
                xmlPullParser.nextToken();
            } else {
                newSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* access modifiers changed from: protected */
    public EventMessage buildEvent(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        EventMessage eventMessage = new EventMessage(str, str2, j2, j, bArr, j3);
        int i = setMax + 117;
        getMin = i % 128;
        int i2 = i % 2;
        return eventMessage;
    }

    /* access modifiers changed from: protected */
    public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j;
        int i;
        int i2;
        long j2;
        int i3;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        do {
            xmlPullParser.next();
            if ((XmlPullParserUtil.isStartTag(xmlPullParser, "S") ? 'C' : 'O') == 'C') {
                try {
                    int i4 = getMin + 59;
                    setMax = i4 % 128;
                    if (i4 % 2 == 0) {
                        j3 = parseLong(xmlPullParser, SecurityConstants.KEY_TEXT, j3);
                        j = parseLong(xmlPullParser, "d", C.TIME_UNSET);
                        i2 = parseInt(xmlPullParser, BranchLinkConstant.PayloadKey.REFERRAL, 1) * 0;
                        i = 1;
                    } else {
                        j3 = parseLong(xmlPullParser, SecurityConstants.KEY_TEXT, j3);
                        j = parseLong(xmlPullParser, "d", C.TIME_UNSET);
                        i2 = parseInt(xmlPullParser, BranchLinkConstant.PayloadKey.REFERRAL, 0) + 1;
                        i = 0;
                    }
                    int i5 = getMin + 27;
                    setMax = i5 % 128;
                    int i6 = i5 % 2;
                    while (true) {
                        if (i >= i2) {
                            break;
                        }
                        try {
                            int i7 = getMin + 73;
                            setMax = i7 % 128;
                            if (i7 % 2 != 0) {
                                arrayList.add(buildSegmentTimelineElement(j3, j));
                                j2 = j3 + j;
                                i3 = i + 1;
                            } else {
                                arrayList.add(buildSegmentTimelineElement(j3, j));
                                j2 = j3 | j;
                                i3 = i + 27;
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        int i8 = getMin + 93;
        setMax = i8 % 128;
        if ((i8 % 2 == 0 ? ')' : 'b') == 'b') {
            return arrayList;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        SegmentBase.SegmentTimelineElement segmentTimelineElement = new SegmentBase.SegmentTimelineElement(j, j2);
        int i = setMax + 39;
        getMin = i % 128;
        if (!(i % 2 != 0)) {
            return segmentTimelineElement;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return segmentTimelineElement;
    }

    /* access modifiers changed from: protected */
    public UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, UrlTemplate urlTemplate) {
        int i = getMin + 57;
        setMax = i % 128;
        int i2 = i % 2;
        String str2 = null;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(str2, str);
            boolean z = false;
            if (!(attributeValue != null)) {
                return urlTemplate;
            }
            UrlTemplate compile = UrlTemplate.compile(attributeValue);
            int i3 = setMax + 69;
            getMin = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (!z) {
                return compile;
            }
            super.hashCode();
            return compile;
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        int i = setMax + 113;
        getMin = i % 128;
        if ((i % 2 != 0 ? 'N' : '/') != '/') {
            RangedUri parseRangedUrl = parseRangedUrl(xmlPullParser, "sourceURL", "range");
            Object[] objArr = null;
            int length2 = objArr.length;
            return parseRangedUrl;
        }
        try {
            return parseRangedUrl(xmlPullParser, "sourceURL", "range");
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        RangedUri rangedUri;
        int i = setMax + 21;
        getMin = i % 128;
        boolean z = true;
        if (i % 2 != 0) {
            try {
                rangedUri = parseRangedUrl(xmlPullParser, "media", "mediaRange");
                int i2 = 30 / 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            rangedUri = parseRangedUrl(xmlPullParser, "media", "mediaRange");
        }
        int i3 = getMin + 35;
        setMax = i3 % 128;
        if (i3 % 2 == 0) {
            z = false;
        }
        if (z) {
            return rangedUri;
        }
        Object obj = null;
        super.hashCode();
        return rangedUri;
    }

    /* access modifiers changed from: protected */
    public RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        long j = 0;
        long j2 = -1;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        boolean z = false;
        if (attributeValue2 != null) {
            try {
                int i = setMax + 39;
                try {
                    getMin = i % 128;
                    int i2 = i % 2;
                    String[] split = attributeValue2.split("-");
                    j = Long.parseLong(split[0]);
                    if (split.length != 2) {
                        z = true;
                    }
                    if (!z) {
                        int i3 = getMin + 97;
                        setMax = i3 % 128;
                        int i4 = i3 % 2;
                        j2 = (Long.parseLong(split[1]) - j) + 1;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return buildRangedUri(attributeValue, j, j2);
    }

    /* access modifiers changed from: protected */
    public RangedUri buildRangedUri(String str, long j, long j2) {
        RangedUri rangedUri = new RangedUri(str, j, j2);
        int i = setMax + 97;
        getMin = i % 128;
        int i2 = i % 2;
        return rangedUri;
    }

    /* access modifiers changed from: protected */
    public int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String parseString = parseString(xmlPullParser, "schemeIdUri", (String) null);
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(parseString)) {
            i = parseInt(xmlPullParser, "value", -1);
        } else {
            if (!(!"tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(parseString))) {
                try {
                    i = parseDolbyChannelConfiguration(xmlPullParser);
                    int i2 = getMin + 35;
                    setMax = i2 % 128;
                    int i3 = i2 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        int i4 = setMax + 9;
        getMin = i4 % 128;
        if (i4 % 2 == 0) {
            return i;
        }
        int i5 = 24 / 0;
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = getMin + 111;
        setMax = r2 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if ((r2 % 2) != 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r3 == true) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        r7.remove(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void filterRedundantIncompleteSchemeDatas(java.util.ArrayList<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r7) {
        /*
            int r0 = r7.size()
            r1 = 1
            int r0 = r0 - r1
        L_0x0006:
            if (r0 < 0) goto L_0x006e
            java.lang.Object r2 = r7.get(r0)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r2 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r2
            boolean r3 = r2.hasData()
            if (r3 != 0) goto L_0x006b
            int r3 = setMax
            int r3 = r3 + 73
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % 2
            r3 = 0
            r4 = 0
        L_0x0020:
            int r5 = r7.size()
            if (r4 >= r5) goto L_0x0028
            r5 = 0
            goto L_0x0029
        L_0x0028:
            r5 = 1
        L_0x0029:
            if (r5 == r1) goto L_0x006b
            int r5 = setMax     // Catch:{ Exception -> 0x0069 }
            int r5 = r5 + 43
            int r6 = r5 % 128
            getMin = r6     // Catch:{ Exception -> 0x0069 }
            int r5 = r5 % 2
            java.lang.Object r5 = r7.get(r4)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r5 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r5
            boolean r5 = r5.canReplace(r2)
            if (r5 == 0) goto L_0x0043
            r5 = 0
            goto L_0x0044
        L_0x0043:
            r5 = 1
        L_0x0044:
            if (r5 == r1) goto L_0x0066
            int r2 = getMin     // Catch:{ Exception -> 0x0064 }
            int r2 = r2 + 111
            int r4 = r2 % 128
            setMax = r4     // Catch:{ Exception -> 0x0064 }
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r3 = 1
        L_0x0054:
            if (r3 == r1) goto L_0x0060
            r7.remove(r0)     // Catch:{ Exception -> 0x0069 }
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x005e }
            goto L_0x006b
        L_0x005e:
            r7 = move-exception
            throw r7
        L_0x0060:
            r7.remove(r0)
            goto L_0x006b
        L_0x0064:
            r7 = move-exception
            throw r7
        L_0x0066:
            int r4 = r4 + 1
            goto L_0x0020
        L_0x0069:
            r7 = move-exception
            throw r7
        L_0x006b:
            int r0 = r0 + -1
            goto L_0x0006
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.filterRedundantIncompleteSchemeDatas(java.util.ArrayList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        if (r4 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0065, code lost:
        if (r4 != null) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getSampleMimeType(java.lang.String r3, java.lang.String r4) {
        /*
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r3)
            if (r0 == 0) goto L_0x000b
            java.lang.String r3 = com.google.android.exoplayer2.util.MimeTypes.getAudioMediaMimeType(r4)
            return r3
        L_0x000b:
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r3)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == r1) goto L_0x00b8
            boolean r0 = mimeTypeIsRawText(r3)
            if (r0 == 0) goto L_0x001f
            return r3
        L_0x001f:
            java.lang.String r0 = "application/mp4"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x00b4 }
            r1 = 0
            if (r0 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x00b3
            java.lang.String r3 = "stpp"
            boolean r3 = r4.startsWith(r3)
            r0 = 22
            if (r3 == 0) goto L_0x0037
            r3 = 22
            goto L_0x0039
        L_0x0037:
            r3 = 48
        L_0x0039:
            if (r3 == r0) goto L_0x0046
            java.lang.String r3 = "wvtt"
            boolean r3 = r4.startsWith(r3)
            if (r3 == 0) goto L_0x00b3
            java.lang.String r3 = "application/x-mp4-vtt"
            return r3
        L_0x0046:
            java.lang.String r3 = "application/ttml+xml"
            return r3
        L_0x0049:
            java.lang.String r0 = "application/x-rawcc"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00b3
            int r3 = setMax
            int r3 = r3 + 69
            int r0 = r3 % 128
            getMin = r0
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x0065
            super.hashCode()     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x00a1
            goto L_0x0067
        L_0x0063:
            r3 = move-exception
            throw r3
        L_0x0065:
            if (r4 == 0) goto L_0x00a1
        L_0x0067:
            java.lang.String r3 = "cea708"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x007c
            int r3 = getMin
            int r3 = r3 + 99
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            java.lang.String r3 = "application/cea-708"
            return r3
        L_0x007c:
            java.lang.String r3 = "eia608"
            boolean r3 = r4.contains(r3)
            r0 = 30
            if (r3 != 0) goto L_0x0088
            r3 = 7
            goto L_0x008a
        L_0x0088:
            r3 = 30
        L_0x008a:
            if (r3 == r0) goto L_0x009e
            int r3 = setMax     // Catch:{ Exception -> 0x00b6 }
            int r3 = r3 + 125
            int r0 = r3 % 128
            getMin = r0     // Catch:{ Exception -> 0x00b6 }
            int r3 = r3 % 2
            java.lang.String r3 = "cea608"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x00a1
        L_0x009e:
            java.lang.String r3 = "application/cea-608"
            return r3
        L_0x00a1:
            int r3 = setMax
            int r3 = r3 + 3
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x00b3
            r3 = 11
            int r3 = r3 / r2
            return r1
        L_0x00b1:
            r3 = move-exception
            throw r3
        L_0x00b3:
            return r1
        L_0x00b4:
            r3 = move-exception
            throw r3
        L_0x00b6:
            r3 = move-exception
            throw r3
        L_0x00b8:
            java.lang.String r3 = com.google.android.exoplayer2.util.MimeTypes.getVideoMediaMimeType(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.getSampleMimeType(java.lang.String, java.lang.String):java.lang.String");
    }

    private static boolean mimeTypeIsRawText(String str) {
        int i = getMin + 113;
        setMax = i % 128;
        int i2 = i % 2;
        if (!MimeTypes.isText(str)) {
            if (!(MimeTypes.APPLICATION_TTML.equals(str))) {
                int i3 = setMax + 117;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                if ((!MimeTypes.APPLICATION_MP4VTT.equals(str) ? (char) 17 : 14) == 17) {
                    try {
                        if (!MimeTypes.APPLICATION_CEA708.equals(str) && !MimeTypes.APPLICATION_CEA608.equals(str)) {
                            int i5 = setMax + 69;
                            getMin = i5 % 128;
                            int i6 = i5 % 2;
                            return false;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
        }
        int i7 = setMax + 73;
        getMin = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private static String checkLanguageConsistency(String str, String str2) {
        int i = getMin + 95;
        setMax = i % 128;
        int i2 = i % 2;
        if (str == null) {
            char c = 15;
            int i3 = getMin + 15;
            setMax = i3 % 128;
            if (i3 % 2 != 0) {
                c = 'X';
            }
            if (c == 'X') {
                return str2;
            }
            int i4 = 88 / 0;
            return str2;
        }
        if ((str2 == null ? 'B' : '[') != 'B') {
            try {
                try {
                    Assertions.checkState(str.equals(str2));
                    return str;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int i5 = setMax + 21;
            getMin = i5 % 128;
            if (!(i5 % 2 != 0)) {
                return str;
            }
            int i6 = 87 / 0;
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r5 == -1 ? '4' : ']') != '4') goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if ((r5 == -1) != true) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int checkContentTypeConsistency(int r5, int r6) {
        /*
            int r0 = getMin
            int r0 = r0 + 35
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 52
            r3 = -1
            r4 = 1
            if (r0 != 0) goto L_0x001f
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x001d }
            if (r5 != r3) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == r4) goto L_0x004f
            goto L_0x0028
        L_0x001d:
            r5 = move-exception
            throw r5
        L_0x001f:
            if (r5 != r3) goto L_0x0024
            r0 = 52
            goto L_0x0026
        L_0x0024:
            r0 = 93
        L_0x0026:
            if (r0 == r2) goto L_0x004f
        L_0x0028:
            if (r6 != r3) goto L_0x0035
            int r6 = setMax
            int r6 = r6 + 123
            int r0 = r6 % 128
            getMin = r0
            int r6 = r6 % 2
            return r5
        L_0x0035:
            r0 = 81
            if (r5 != r6) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = 81
        L_0x003c:
            if (r2 == r0) goto L_0x0049
            int r6 = getMin
            int r6 = r6 + 33
            int r0 = r6 % 128
            setMax = r0
            int r6 = r6 % 2
            r1 = 1
        L_0x0049:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)     // Catch:{ Exception -> 0x004d }
            return r5
        L_0x004d:
            r5 = move-exception
            throw r5
        L_0x004f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.checkContentTypeConsistency(int, int):int");
    }

    protected static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        String str4;
        int i = setMax + 51;
        getMin = i % 128;
        if ((i % 2 != 0 ? 28 : 'W') != 'W') {
            str4 = parseString(xmlPullParser, "schemeIdUri", "");
            str3 = parseString(xmlPullParser, "value", (String) null);
            str2 = parseString(xmlPullParser, "id", (String) null);
            int i2 = 24 / 0;
        } else {
            str4 = parseString(xmlPullParser, "schemeIdUri", "");
            str3 = parseString(xmlPullParser, "value", (String) null);
            str2 = parseString(xmlPullParser, "id", (String) null);
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        Descriptor descriptor = new Descriptor(str4, str3, str2);
        try {
            int i3 = getMin + 31;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return descriptor;
        } catch (Exception e) {
            throw e;
        }
    }

    protected static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        Descriptor descriptor;
        Matcher matcher;
        for (int i = 0; i < list.size(); i++) {
            int i2 = getMin + 23;
            setMax = i2 % 128;
            if ((i2 % 2 == 0 ? 'L' : 27) != 'L') {
                descriptor = list.get(i);
                if (!"urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri)) {
                    continue;
                }
            } else {
                try {
                    descriptor = list.get(i);
                    boolean equals = "urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri);
                    Object obj = null;
                    super.hashCode();
                    if (!equals) {
                        continue;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            char c = 'W';
            int i3 = setMax + 87;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            if (descriptor.value != null) {
                int i5 = getMin + 25;
                setMax = i5 % 128;
                if (i5 % 2 == 0) {
                    matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(descriptor.value);
                    int i6 = 83 / 0;
                    if (matcher.matches()) {
                        c = 9;
                    }
                    if (c == 9) {
                        return Integer.parseInt(matcher.group(1));
                    }
                } else {
                    matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(descriptor.value);
                    if (matcher.matches()) {
                        return Integer.parseInt(matcher.group(1));
                    }
                }
                StringBuilder sb = new StringBuilder("Unable to parse CEA-608 channel number from: ");
                sb.append(descriptor.value);
                Log.w(TAG, sb.toString());
            } else {
                continue;
            }
        }
        return -1;
    }

    protected static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        Descriptor descriptor;
        int i = setMax + 45;
        getMin = i % 128;
        if (i % 2 != 0) {
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = getMin + 13;
            setMax = i3 % 128;
            if (!(i3 % 2 != 0)) {
                descriptor = list.get(i2);
                boolean equals = "urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri);
                Object[] objArr = null;
                int length2 = objArr.length;
                if ((equals ? 7 : 'F') != 7) {
                    continue;
                }
            } else {
                descriptor = list.get(i2);
                if (!"urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri)) {
                    continue;
                }
            }
            if (descriptor.value == null) {
                continue;
            } else {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(descriptor.value);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder sb = new StringBuilder("Unable to parse CEA-708 service block number from: ");
                sb.append(descriptor.value);
                Log.w(TAG, sb.toString());
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if ((r2 ? 'U' : 15) != 15) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(r1.schemeIdUri) != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String parseEac3SupplementalProperties(java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r4) {
        /*
            int r0 = setMax     // Catch:{ Exception -> 0x0087 }
            int r0 = r0 + 123
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x0087 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            int r1 = r4.size()     // Catch:{ Exception -> 0x0087 }
            r2 = 51
            if (r0 >= r1) goto L_0x001a
            r1 = 37
            goto L_0x001c
        L_0x001a:
            r1 = 51
        L_0x001c:
            if (r1 == r2) goto L_0x0084
            int r1 = getMin
            int r1 = r1 + 7
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            r2 = 42
            if (r1 != 0) goto L_0x002f
            r1 = 75
            goto L_0x0031
        L_0x002f:
            r1 = 42
        L_0x0031:
            java.lang.String r3 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            if (r1 == r2) goto L_0x0053
            java.lang.Object r1 = r4.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r1
            java.lang.String r2 = r1.schemeIdUri
            boolean r2 = r3.equals(r2)
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x0051 }
            r3 = 15
            if (r2 == 0) goto L_0x004c
            r2 = 85
            goto L_0x004e
        L_0x004c:
            r2 = 15
        L_0x004e:
            if (r2 == r3) goto L_0x0077
            goto L_0x0061
        L_0x0051:
            r4 = move-exception
            throw r4
        L_0x0053:
            java.lang.Object r1 = r4.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r1
            java.lang.String r2 = r1.schemeIdUri
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0077
        L_0x0061:
            java.lang.String r1 = r1.value
            java.lang.String r2 = "ec+3"
            boolean r1 = r2.equals(r1)
            r2 = 64
            if (r1 == 0) goto L_0x0070
            r1 = 98
            goto L_0x0072
        L_0x0070:
            r1 = 64
        L_0x0072:
            if (r1 == r2) goto L_0x0077
            java.lang.String r4 = "audio/eac3-joc"
            return r4
        L_0x0077:
            int r0 = r0 + 1
            int r1 = setMax     // Catch:{ Exception -> 0x0087 }
            int r1 = r1 + 63
            int r2 = r1 % 128
            getMin = r2     // Catch:{ Exception -> 0x0087 }
            int r1 = r1 % 2
            goto L_0x000f
        L_0x0084:
            java.lang.String r4 = "audio/eac3"
            return r4
        L_0x0087:
            r4 = move-exception
            goto L_0x008a
        L_0x0089:
            throw r4
        L_0x008a:
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseEac3SupplementalProperties(java.util.List):java.lang.String");
    }

    protected static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        try {
            int i = getMin + 97;
            try {
                setMax = i % 128;
                int i2 = i % 2;
                String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
                if (attributeValue != null) {
                    Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
                    if (matcher.matches()) {
                        int i3 = setMax + 77;
                        getMin = i3 % 128;
                        int i4 = i3 % 2;
                        int parseInt = Integer.parseInt(matcher.group(1));
                        String group = matcher.group(2);
                        if ((!TextUtils.isEmpty(group) ? 12 : '9') != '9') {
                            int i5 = getMin + 43;
                            setMax = i5 % 128;
                            int i6 = i5 % 2;
                            float f2 = (float) parseInt;
                            float parseInt2 = (float) Integer.parseInt(group);
                            f = i6 == 0 ? f2 % parseInt2 : f2 / parseInt2;
                        } else {
                            f = (float) parseInt;
                        }
                    }
                }
                int i7 = getMin + 61;
                setMax = i7 % 128;
                if ((i7 % 2 == 0 ? 12 : '-') != 12) {
                    return f;
                }
                int i8 = 75 / 0;
                return f;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    protected static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        try {
            int i = setMax + 67;
            try {
                getMin = i % 128;
                int i2 = i % 2;
                String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
                if ((attributeValue == null ? 'F' : 'c') != 'F') {
                    return Util.parseXsDuration(attributeValue);
                }
                int i3 = getMin + 65;
                setMax = i3 % 128;
                int i4 = i3 % 2;
                return j;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    protected static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        int i = setMax + 49;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if ((attributeValue == null ? 'L' : 27) != 'L') {
                long parseXsDateTime = Util.parseXsDateTime(attributeValue);
                int i3 = setMax + 109;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return parseXsDateTime;
            }
            int i5 = getMin + 47;
            setMax = i5 % 128;
            int i6 = i5 % 2;
            return j;
        } catch (Exception e) {
            throw e;
        }
    }

    protected static String parseBaseUrl(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int i = setMax + 47;
        getMin = i % 128;
        int i2 = i % 2;
        xmlPullParser.next();
        String resolve = UriUtil.resolve(str, xmlPullParser.getText());
        int i3 = getMin + 53;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return resolve;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if ((r5 == null) != true) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if ((r5 == null) != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r5 = java.lang.Integer.parseInt(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6 = setMax + 125;
        getMin = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if ((r6 % 2) == 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        if (r3 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r6 = 16 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0050, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int parseInt(org.xmlpull.v1.XmlPullParser r5, java.lang.String r6, int r7) {
        /*
            int r0 = getMin
            int r0 = r0 + 13
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 57
            if (r0 != 0) goto L_0x0011
            r0 = 59
            goto L_0x0013
        L_0x0011:
            r0 = 57
        L_0x0013:
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L_0x0027
            java.lang.String r5 = r5.getAttributeValue(r2, r6)
            int r6 = r2.length     // Catch:{ all -> 0x0025 }
            if (r5 != 0) goto L_0x0021
            r6 = 1
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            if (r6 == r3) goto L_0x0032
            goto L_0x0033
        L_0x0025:
            r5 = move-exception
            throw r5
        L_0x0027:
            java.lang.String r5 = r5.getAttributeValue(r2, r6)
            if (r5 != 0) goto L_0x002f
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            if (r6 == 0) goto L_0x0033
        L_0x0032:
            return r7
        L_0x0033:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x004f }
            int r6 = setMax     // Catch:{ Exception -> 0x004d }
            int r6 = r6 + 125
            int r7 = r6 % 128
            getMin = r7     // Catch:{ Exception -> 0x004d }
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0044
            r3 = 0
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            return r5
        L_0x0047:
            r6 = 16
            int r6 = r6 / r4
            return r5
        L_0x004b:
            r5 = move-exception
            throw r5
        L_0x004d:
            r5 = move-exception
            throw r5
        L_0x004f:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseInt(org.xmlpull.v1.XmlPullParser, java.lang.String, int):int");
    }

    protected static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        int i = getMin + 113;
        setMax = i % 128;
        int i2 = i % 2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if ((attributeValue == null ? '%' : 'V') != '%') {
            return Long.parseLong(attributeValue);
        }
        try {
            int i3 = getMin + 23;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return j;
        } catch (Exception e) {
            throw e;
        }
    }

    protected static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String str3 = null;
        String attributeValue = xmlPullParser.getAttributeValue(str3, str);
        if ((attributeValue == null ? 'V' : 'C') != 'V') {
            return attributeValue;
        }
        int i = setMax + 113;
        getMin = i % 128;
        if ((i % 2 != 0 ? 20 : '?') == 20) {
            super.hashCode();
        }
        try {
            int i2 = setMax + 5;
            try {
                getMin = i2 % 128;
                int i3 = i2 % 2;
                return str2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        if (r6.equals("a000") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0080, code lost:
        if (r6 != '?') goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0083, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0084, code lost:
        if (r0 == 0) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0086, code lost:
        if (r0 == 1) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0088, code lost:
        if (r0 == 2) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008a, code lost:
        if (r0 == 3) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008c, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008d, code lost:
        return 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0090, code lost:
        return 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0092, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0093, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser r6) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r6 = r6.getAttributeValue(r0, r1)
            java.lang.String r6 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r6)
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L_0x0011
            r2 = 1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            r3 = -1
            if (r2 == 0) goto L_0x0016
            return r3
        L_0x0016:
            int r2 = r6.hashCode()
            r4 = 3
            r5 = 2
            switch(r2) {
                case 1596796: goto L_0x0066;
                case 2937391: goto L_0x005c;
                case 3094035: goto L_0x0047;
                case 3133436: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0083
        L_0x0021:
            java.lang.String r2 = "fa01"
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x0045 }
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 == r1) goto L_0x0083
            int r6 = setMax     // Catch:{ Exception -> 0x005a }
            int r6 = r6 + 121
            int r0 = r6 % 128
            getMin = r0     // Catch:{ Exception -> 0x005a }
            int r6 = r6 % r5
            r0 = 99
            if (r6 == 0) goto L_0x003d
            r6 = 99
            goto L_0x003f
        L_0x003d:
            r6 = 47
        L_0x003f:
            if (r6 == r0) goto L_0x0043
            r0 = 3
            goto L_0x0084
        L_0x0043:
            r0 = 2
            goto L_0x0084
        L_0x0045:
            r6 = move-exception
            goto L_0x0059
        L_0x0047:
            java.lang.String r0 = "f801"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0083
            int r6 = getMin     // Catch:{ Exception -> 0x005a }
            int r6 = r6 + 113
            int r0 = r6 % 128
            setMax = r0     // Catch:{ Exception -> 0x0045 }
            int r6 = r6 % r5
            goto L_0x0043
        L_0x0059:
            throw r6
        L_0x005a:
            r6 = move-exception
            throw r6
        L_0x005c:
            java.lang.String r0 = "a000"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0083
        L_0x0064:
            r0 = 1
            goto L_0x0084
        L_0x0066:
            java.lang.String r2 = "4000"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0083
            int r6 = getMin
            int r6 = r6 + 97
            int r2 = r6 % 128
            setMax = r2
            int r6 = r6 % r5
            r2 = 63
            if (r6 != 0) goto L_0x007e
            r6 = 70
            goto L_0x0080
        L_0x007e:
            r6 = 63
        L_0x0080:
            if (r6 == r2) goto L_0x0084
            goto L_0x0064
        L_0x0083:
            r0 = -1
        L_0x0084:
            if (r0 == 0) goto L_0x0093
            if (r0 == r1) goto L_0x0092
            if (r0 == r5) goto L_0x0090
            if (r0 == r4) goto L_0x008d
            return r3
        L_0x008d:
            r6 = 8
            return r6
        L_0x0090:
            r6 = 6
            return r6
        L_0x0092:
            return r5
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser):int");
    }

    protected static final class RepresentationInfo {
        public final String baseUrl;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;
        public final String drmSchemeType;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;

        public RepresentationInfo(Format format2, String str, SegmentBase segmentBase2, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, long j) {
            this.format = format2;
            this.baseUrl = str;
            this.segmentBase = segmentBase2;
            this.drmSchemeType = str2;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.revisionId = j;
        }
    }

    private static String setMin(int[] iArr, byte[] bArr, boolean z) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = new char[i2];
        System.arraycopy(length, i, cArr, 0, i2);
        if (bArr != null) {
            char[] cArr2 = new char[i2];
            int i5 = 0;
            char c = 0;
            while (true) {
                if (i5 >= i2) {
                    break;
                }
                int i6 = getMin + 61;
                setMax = i6 % 128;
                int i7 = i6 % 2;
                if (bArr[i5] == 1) {
                    cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                } else {
                    cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                }
                c = cArr2[i5];
                i5++;
            }
            cArr = cArr2;
        }
        if (i4 > 0) {
            int i8 = getMin + 33;
            setMax = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, 0, cArr3, 0, i2);
            int i10 = i2 - i4;
            System.arraycopy(cArr3, 0, cArr, i10, i4);
            System.arraycopy(cArr3, i4, cArr, 0, i10);
        }
        if ((z ? '0' : 30) != 30) {
            char[] cArr4 = new char[i2];
            int i11 = getMin + 105;
            setMax = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (true) {
                if (i13 >= i2) {
                    break;
                }
                int i14 = getMin + 109;
                setMax = i14 % 128;
                int i15 = i14 % 2;
                cArr4[i13] = cArr[(i2 - i13) - 1];
                i13++;
            }
            cArr = cArr4;
        }
        if (i3 > 0) {
            try {
                int i16 = getMin + 7;
                setMax = i16 % 128;
                int i17 = i16 % 2;
                for (int i18 = 0; i18 < i2; i18++) {
                    cArr[i18] = (char) (cArr[i18] - iArr[2]);
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return new String(cArr);
    }
}
