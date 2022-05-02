package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private static int length = 0;
    private static int setMax = 0;
    private static int setMin = 1;
    private final HlsMasterPlaylist masterPlaylist;

    static void setMax() {
        length = 54;
    }

    static {
        setMax();
        try {
            int i = setMin + 31;
            setMax = i % 128;
            if ((i % 2 != 0 ? 'I' : 'W') == 'I') {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HlsPlaylistParser() {
        this(HlsMasterPlaylist.EMPTY);
        try {
        } catch (Exception e) {
            throw e;
        }
    }

    public HlsPlaylistParser(HlsMasterPlaylist hlsMasterPlaylist) {
        this.masterPlaylist = hlsMasterPlaylist;
    }

    public final HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (checkPlaylistHeader(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if ((readLine != null ? '#' : ':') == '#') {
                        try {
                            int i = setMax + 51;
                            setMin = i % 128;
                            if (i % 2 == 0) {
                                str = readLine.trim();
                                boolean isEmpty = str.isEmpty();
                                Object[] objArr = null;
                                int length2 = objArr.length;
                                if (isEmpty) {
                                    continue;
                                }
                            } else {
                                str = readLine.trim();
                                if (str.isEmpty()) {
                                    continue;
                                }
                            }
                            if (!str.startsWith(TAG_STREAM_INF)) {
                                if ((!str.startsWith(TAG_TARGET_DURATION) ? 'B' : 'X') == 'B') {
                                    if ((!str.startsWith(TAG_MEDIA_SEQUENCE) ? '\\' : '@') == '\\') {
                                        int i2 = setMin + 83;
                                        setMax = i2 % 128;
                                        boolean z = false;
                                        if ((i2 % 2 != 0 ? 13 : '(') == 13) {
                                            int i3 = 59 / 0;
                                            if (str.startsWith(TAG_MEDIA_DURATION)) {
                                                break;
                                            }
                                        } else {
                                            if ((!str.startsWith(TAG_MEDIA_DURATION) ? 'X' : 'U') != 'X') {
                                                break;
                                            }
                                        }
                                        if (!str.startsWith(TAG_KEY)) {
                                            if (!str.startsWith(TAG_BYTERANGE)) {
                                                z = true;
                                            }
                                            if (z) {
                                                if (str.equals(TAG_DISCONTINUITY) || str.equals(TAG_DISCONTINUITY_SEQUENCE)) {
                                                    break;
                                                } else if (str.equals(TAG_ENDLIST)) {
                                                    break;
                                                } else {
                                                    arrayDeque.add(str);
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                arrayDeque.add(str);
                                HlsMasterPlaylist parseMasterPlaylist = parseMasterPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                                Util.closeQuietly((Closeable) bufferedReader);
                                return parseMasterPlaylist;
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        Util.closeQuietly((Closeable) bufferedReader);
                        throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(str);
                return parseMediaPlaylist(this.masterPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
            }
            throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
        } finally {
            Util.closeQuietly((Closeable) bufferedReader);
        }
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            int i = setMax + 45;
            setMin = i % 128;
            int i2 = i % 2;
            if (bufferedReader.read() == 187) {
                int i3 = setMin + 97;
                setMax = i3 % 128;
                int i4 = i3 % 2;
                if (!(bufferedReader.read() != 191)) {
                    read = bufferedReader.read();
                }
            }
            return false;
        }
        int skipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, read);
        int i5 = 0;
        while (i5 < 7) {
            try {
                if (!(skipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i5))) {
                    skipIgnorableWhitespace = bufferedReader.read();
                    i5++;
                } else {
                    int i6 = setMin + 109;
                    setMax = i6 % 128;
                    return i6 % 2 != 0;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, skipIgnorableWhitespace));
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (true) {
            if ((i != -1 ? 6 : 'b') == 'b') {
                break;
            }
            int i2 = setMax + 59;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            if ((Character.isWhitespace(i) ? '=' : 9) != '=') {
                break;
            }
            if (!z) {
                int i4 = setMax + 25;
                setMin = i4 % 128;
                int i5 = i4 % 2;
                if ((!Util.isLinebreak(i) ? 21 : '\'') != 21) {
                    break;
                }
            }
            try {
                i = bufferedReader.read();
            } catch (Exception e) {
                throw e;
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        if ((r15 != null ? ':' : 'O') != ':') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c4, code lost:
        if (r15 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist parseMasterPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.LineIterator r31, java.lang.String r32) throws java.io.IOException {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            r9 = 0
            r10 = 0
        L_0x002b:
            boolean r12 = r31.hasNext()
            r14 = 2
            if (r12 == 0) goto L_0x0171
            java.lang.String r12 = r31.next()
            java.lang.String r15 = "#EXT"
            boolean r15 = r12.startsWith(r15)
            if (r15 == 0) goto L_0x0041
            r4.add(r12)
        L_0x0041:
            java.lang.String r15 = "#EXT-X-DEFINE"
            boolean r15 = r12.startsWith(r15)
            if (r15 == 0) goto L_0x004b
            r15 = 1
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 == 0) goto L_0x005f
            java.util.regex.Pattern r13 = REGEX_NAME
            java.lang.String r13 = parseStringAttr(r12, r13, r11)
            java.util.regex.Pattern r14 = REGEX_VALUE
            java.lang.String r12 = parseStringAttr(r12, r14, r11)
            r11.put(r13, r12)
            goto L_0x016b
        L_0x005f:
            java.lang.String r15 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0069
            r10 = 1
            goto L_0x002b
        L_0x0069:
            java.lang.String r15 = "#EXT-X-MEDIA"
            boolean r15 = r12.startsWith(r15)     // Catch:{ Exception -> 0x02c3 }
            if (r15 == 0) goto L_0x007f
            int r13 = setMax
            int r13 = r13 + 73
            int r15 = r13 % 128
            setMin = r15
            int r13 = r13 % r14
            r2.add(r12)
            goto L_0x016b
        L_0x007f:
            java.lang.String r15 = "#EXT-X-STREAM-INF"
            boolean r15 = r12.startsWith(r15)
            if (r15 == 0) goto L_0x016b
            int r15 = setMin
            int r15 = r15 + 91
            int r13 = r15 % 128
            setMax = r13
            int r15 = r15 % r14
            java.lang.String r13 = "CLOSED-CAPTIONS=NONE"
            if (r15 == 0) goto L_0x00b3
            boolean r13 = r12.contains(r13)
            r9 = r9 & r13
            java.util.regex.Pattern r13 = REGEX_BANDWIDTH
            int r13 = parseIntAttr(r12, r13)
            java.util.regex.Pattern r15 = REGEX_AVERAGE_BANDWIDTH
            java.lang.String r15 = parseOptionalStringAttr(r12, r15, r11)
            r14 = 58
            if (r15 == 0) goto L_0x00ac
            r8 = 58
            goto L_0x00b0
        L_0x00ac:
            r17 = 79
            r8 = 79
        L_0x00b0:
            if (r8 == r14) goto L_0x00c6
            goto L_0x00ca
        L_0x00b3:
            boolean r8 = r12.contains(r13)
            r9 = r9 | r8
            java.util.regex.Pattern r8 = REGEX_BANDWIDTH
            int r13 = parseIntAttr(r12, r8)
            java.util.regex.Pattern r8 = REGEX_AVERAGE_BANDWIDTH
            java.lang.String r15 = parseOptionalStringAttr(r12, r8, r11)
            if (r15 == 0) goto L_0x00ca
        L_0x00c6:
            int r13 = java.lang.Integer.parseInt(r15)
        L_0x00ca:
            r23 = r13
            java.util.regex.Pattern r8 = REGEX_CODECS
            java.lang.String r8 = parseOptionalStringAttr(r12, r8, r11)
            java.util.regex.Pattern r13 = REGEX_RESOLUTION
            java.lang.String r13 = parseOptionalStringAttr(r12, r13, r11)
            if (r13 == 0) goto L_0x00ff
            java.lang.String r14 = "x"
            java.lang.String[] r13 = r13.split(r14)
            r14 = r13[r3]
            int r14 = java.lang.Integer.parseInt(r14)
            r15 = 1
            r13 = r13[r15]
            int r13 = java.lang.Integer.parseInt(r13)
            if (r14 <= 0) goto L_0x00f7
            if (r13 > 0) goto L_0x00f3
            goto L_0x00f7
        L_0x00f3:
            r16 = r13
            r13 = r14
            goto L_0x00fa
        L_0x00f7:
            r13 = -1
            r16 = -1
        L_0x00fa:
            r24 = r13
            r25 = r16
            goto L_0x0103
        L_0x00ff:
            r24 = -1
            r25 = -1
        L_0x0103:
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.regex.Pattern r14 = REGEX_FRAME_RATE
            java.lang.String r14 = parseOptionalStringAttr(r12, r14, r11)
            r15 = 9
            if (r14 == 0) goto L_0x0114
            r16 = 39
            r3 = 39
            goto L_0x0116
        L_0x0114:
            r3 = 9
        L_0x0116:
            if (r3 == r15) goto L_0x011f
            float r3 = java.lang.Float.parseFloat(r14)
            r26 = r3
            goto L_0x0121
        L_0x011f:
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0121:
            java.util.regex.Pattern r3 = REGEX_AUDIO
            java.lang.String r3 = parseOptionalStringAttr(r12, r3, r11)
            if (r3 == 0) goto L_0x013d
            if (r8 == 0) goto L_0x013d
            int r12 = setMin
            int r12 = r12 + 93
            int r13 = r12 % 128
            setMax = r13
            r13 = 2
            int r12 = r12 % r13
            r12 = 1
            java.lang.String r13 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r8, r12)
            r1.put(r3, r13)
        L_0x013d:
            java.lang.String r3 = r31.next()
            java.lang.String r3 = replaceVariableReferences(r3, r11)
            boolean r12 = r0.add(r3)
            if (r12 == 0) goto L_0x016b
            int r12 = r5.size()
            java.lang.String r18 = java.lang.Integer.toString(r12)
            r19 = 0
            r21 = 0
            r27 = 0
            r28 = 0
            java.lang.String r20 = "application/x-mpegURL"
            r22 = r8
            com.google.android.exoplayer2.Format r8 = com.google.android.exoplayer2.Format.createVideoContainerFormat(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl r12 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl
            r12.<init>(r3, r8)
            r5.add(r12)
        L_0x016b:
            r3 = 0
            goto L_0x002b
        L_0x016e:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0171:
            r3 = 0
            r8 = 0
            r12 = 0
        L_0x0174:
            int r13 = r2.size()
            if (r3 >= r13) goto L_0x017c
            r13 = 1
            goto L_0x017d
        L_0x017c:
            r13 = 0
        L_0x017d:
            r14 = 1
            if (r13 == r14) goto L_0x0197
            if (r9 == 0) goto L_0x0184
            r3 = 0
            goto L_0x0185
        L_0x0184:
            r3 = 1
        L_0x0185:
            if (r3 == 0) goto L_0x0189
            r9 = r12
            goto L_0x018e
        L_0x0189:
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
        L_0x018e:
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist
            r2 = r0
            r3 = r32
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0197:
            java.lang.Object r13 = r2.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            int r27 = parseSelectionFlags(r13)
            java.util.regex.Pattern r14 = REGEX_URI
            java.lang.String r14 = parseOptionalStringAttr(r13, r14, r11)
            java.util.regex.Pattern r15 = REGEX_NAME
            java.lang.String r19 = parseStringAttr(r13, r15, r11)
            java.util.regex.Pattern r15 = REGEX_LANGUAGE
            java.lang.String r28 = parseOptionalStringAttr(r13, r15, r11)
            java.util.regex.Pattern r15 = REGEX_GROUP_ID
            java.lang.String r15 = parseOptionalStringAttr(r13, r15, r11)
            java.util.regex.Pattern r0 = REGEX_TYPE
            java.lang.String r0 = parseStringAttr(r13, r0, r11)
            r29 = r2
            int r2 = r0.hashCode()
            r30 = r4
            r4 = -959297733(0xffffffffc6d2473b, float:-26915.615)
            if (r2 == r4) goto L_0x01ed
            r4 = -333210994(0xffffffffec239a8e, float:-7.911391E26)
            if (r2 == r4) goto L_0x01e2
            r4 = 62628790(0x3bba3b6, float:1.1028458E-36)
            if (r2 == r4) goto L_0x01d8
        L_0x01d6:
            r2 = 2
            goto L_0x0201
        L_0x01d8:
            java.lang.String r2 = "AUDIO"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01d6
            r0 = 0
            goto L_0x01eb
        L_0x01e2:
            java.lang.String r2 = "CLOSED-CAPTIONS"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01d6
            r0 = 2
        L_0x01eb:
            r2 = 2
            goto L_0x0202
        L_0x01ed:
            java.lang.String r2 = "SUBTITLES"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x01d6
            int r0 = setMax
            int r0 = r0 + 71
            int r2 = r0 % 128
            setMin = r2
            r2 = 2
            int r0 = r0 % r2
            r0 = 1
            goto L_0x0202
        L_0x0201:
            r0 = -1
        L_0x0202:
            if (r0 == 0) goto L_0x0280
            r4 = 1
            if (r0 == r4) goto L_0x0264
            if (r0 == r2) goto L_0x020a
            goto L_0x0262
        L_0x020a:
            java.util.regex.Pattern r0 = REGEX_INSTREAM_ID
            java.lang.String r0 = parseStringAttr(r13, r0, r11)
            java.lang.String r2 = "CC"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x022e
            int r2 = setMax     // Catch:{ Exception -> 0x02c3 }
            int r2 = r2 + 45
            int r13 = r2 % 128
            setMin = r13     // Catch:{ Exception -> 0x02c3 }
            int r2 = r2 % 2
            r2 = 2
            java.lang.String r0 = r0.substring(r2)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r2 = "application/cea-608"
            goto L_0x0239
        L_0x022e:
            r2 = 7
            java.lang.String r0 = r0.substring(r2)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r2 = "application/cea-708"
        L_0x0239:
            r26 = r0
            r21 = r2
            if (r12 != 0) goto L_0x024f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = setMax
            int r2 = r2 + 107
            int r12 = r2 % 128
            setMin = r12
            r12 = 2
            int r2 = r2 % r12
            r12 = r0
        L_0x024f:
            r20 = 0
            r22 = 0
            r23 = -1
            r18 = r19
            r24 = r27
            r25 = r28
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.createTextContainerFormat(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r12.add(r0)
        L_0x0262:
            r13 = 2
            goto L_0x02bb
        L_0x0264:
            r22 = 0
            r23 = -1
            java.lang.String r20 = "application/x-mpegURL"
            java.lang.String r21 = "text/vtt"
            r18 = r19
            r24 = r27
            r25 = r28
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.createTextContainerFormat(r18, r19, r20, r21, r22, r23, r24, r25)
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl r2 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl
            r2.<init>(r14, r0)
            r7.add(r2)
            goto L_0x0262
        L_0x0280:
            r4 = 1
            java.lang.Object r0 = r1.get(r15)
            r22 = r0
            java.lang.String r22 = (java.lang.String) r22
            if (r22 == 0) goto L_0x0292
            java.lang.String r0 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r22)
            r21 = r0
            goto L_0x0294
        L_0x0292:
            r21 = 0
        L_0x0294:
            r23 = -1
            r24 = -1
            r25 = -1
            r26 = 0
            java.lang.String r20 = "application/x-mpegURL"
            r18 = r19
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.createAudioContainerFormat(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r14 != 0) goto L_0x02b2
            int r2 = setMin
            int r2 = r2 + 61
            int r8 = r2 % 128
            setMax = r8
            r13 = 2
            int r2 = r2 % r13
            r8 = r0
            goto L_0x02bb
        L_0x02b2:
            r13 = 2
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl r2 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl
            r2.<init>(r14, r0)
            r6.add(r2)
        L_0x02bb:
            int r3 = r3 + 1
            r2 = r29
            r4 = r30
            goto L_0x0174
        L_0x02c3:
            r0 = move-exception
            goto L_0x02c6
        L_0x02c5:
            throw r0
        L_0x02c6:
            goto L_0x02c5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.parseMasterPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int parseSelectionFlags(java.lang.String r5) {
        /*
            int r0 = setMin
            int r0 = r0 + 51
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 76
            if (r0 == 0) goto L_0x0011
            r0 = 86
            goto L_0x0013
        L_0x0011:
            r0 = 76
        L_0x0013:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0020
            java.util.regex.Pattern r0 = REGEX_DEFAULT     // Catch:{ Exception -> 0x001e }
            boolean r0 = parseOptionalBooleanAttribute(r5, r0, r3)     // Catch:{ Exception -> 0x001e }
            goto L_0x0028
        L_0x001e:
            r5 = move-exception
            goto L_0x0052
        L_0x0020:
            java.util.regex.Pattern r0 = REGEX_DEFAULT
            boolean r0 = parseOptionalBooleanAttribute(r5, r0, r3)
            if (r0 == 0) goto L_0x002a
        L_0x0028:
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            java.util.regex.Pattern r1 = REGEX_FORCED
            boolean r1 = parseOptionalBooleanAttribute(r5, r1, r3)
            if (r1 == 0) goto L_0x0047
            int r1 = setMax
            int r1 = r1 + 31
            int r4 = r1 % 128
            setMin = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0040
            r2 = 0
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r0 = r0 | 2
            goto L_0x0047
        L_0x0045:
            r0 = r0 ^ 3
        L_0x0047:
            java.util.regex.Pattern r1 = REGEX_AUTOSELECT     // Catch:{ Exception -> 0x001e }
            boolean r5 = parseOptionalBooleanAttribute(r5, r1, r3)     // Catch:{ Exception -> 0x001e }
            if (r5 == 0) goto L_0x0051
            r0 = r0 | 4
        L_0x0051:
            return r0
        L_0x0052:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.parseSelectionFlags(java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (r10 != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0344, code lost:
        if (r53 == null) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x034f, code lost:
        if ((r53 != null) != false) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x035d, code lost:
        r42 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        if (r8.startsWith(TAG_PREFIX) != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0220, code lost:
        if (r10 != false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022a, code lost:
        if (METHOD_AES_128.equals(r10) != false) goto L_0x022c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist parseMediaPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist r60, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.LineIterator r61, java.lang.String r62) throws java.io.IOException {
        /*
            r0 = r60
            boolean r1 = r0.hasIndependentSegments
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r7 = ""
            r12 = 0
            r13 = 0
            r14 = 1
            r26 = r1
            r16 = r4
            r24 = r16
            r34 = r7
            r5 = r12
            r28 = r5
            r33 = r28
            r53 = r33
            r54 = r53
            r55 = r54
            r1 = 0
            r4 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 1
            r27 = 0
            r29 = 0
            r31 = 0
            r47 = 0
            r48 = -1
            r50 = 0
            r51 = 0
        L_0x004d:
            r56 = 0
        L_0x004f:
            boolean r35 = r61.hasNext()
            if (r35 == 0) goto L_0x041d
            int r35 = setMax
            int r8 = r35 + 107
            int r9 = r8 % 128
            setMin = r9
            r9 = 2
            int r8 = r8 % r9
            r10 = 67
            if (r8 != 0) goto L_0x0065
            r8 = 0
            goto L_0x0067
        L_0x0065:
            r8 = 67
        L_0x0067:
            java.lang.String r11 = "#EXT"
            if (r8 == r10) goto L_0x007a
            java.lang.String r8 = r61.next()
            boolean r10 = r8.startsWith(r11)
            int r11 = r12.length     // Catch:{ all -> 0x0077 }
            if (r10 == 0) goto L_0x0087
            goto L_0x0084
        L_0x0077:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x007a:
            java.lang.String r8 = r61.next()
            boolean r10 = r8.startsWith(r11)
            if (r10 == 0) goto L_0x0087
        L_0x0084:
            r6.add(r8)
        L_0x0087:
            java.lang.String r10 = "#EXT-X-PLAYLIST-TYPE"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x00a9
            java.util.regex.Pattern r10 = REGEX_PLAYLIST_TYPE
            java.lang.String r8 = parseStringAttr(r8, r10, r2)
            java.lang.String r10 = "VOD"
            boolean r10 = r10.equals(r8)
            if (r10 == 0) goto L_0x009f
            r4 = 1
            goto L_0x004f
        L_0x009f:
            java.lang.String r10 = "EVENT"
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x004f
            r4 = 2
            goto L_0x004f
        L_0x00a9:
            java.lang.String r10 = "#EXT-X-START"
            boolean r10 = r8.startsWith(r10)
            r11 = 99
            if (r10 == 0) goto L_0x00b6
            r10 = 49
            goto L_0x00b8
        L_0x00b6:
            r10 = 99
        L_0x00b8:
            r35 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r10 == r11) goto L_0x00d5
            int r10 = setMax
            int r10 = r10 + 87
            int r11 = r10 % 128
            setMin = r11
            int r10 = r10 % r9
            java.util.regex.Pattern r9 = REGEX_TIME_OFFSET
            double r8 = parseDoubleAttr(r8, r9)
            double r8 = r8 * r35
            long r8 = (long) r8
            r16 = r8
            goto L_0x004f
        L_0x00d5:
            java.lang.String r10 = "#EXT-X-MAP"
            boolean r10 = r8.startsWith(r10)
            java.lang.String r11 = "@"
            r12 = 58
            if (r10 == 0) goto L_0x0120
            java.util.regex.Pattern r9 = REGEX_URI
            java.lang.String r36 = parseStringAttr(r8, r9, r2)
            java.util.regex.Pattern r9 = REGEX_ATTR_BYTERANGE
            java.lang.String r8 = parseOptionalStringAttr(r8, r9, r2)
            if (r8 == 0) goto L_0x00f2
            r9 = 34
            goto L_0x00f4
        L_0x00f2:
            r9 = 58
        L_0x00f4:
            if (r9 == r12) goto L_0x010e
            java.lang.String[] r8 = r8.split(r11)
            r9 = r8[r13]
            long r48 = java.lang.Long.parseLong(r9)
            int r9 = r8.length
            if (r9 <= r14) goto L_0x0105
            r9 = 1
            goto L_0x0106
        L_0x0105:
            r9 = 0
        L_0x0106:
            if (r9 == 0) goto L_0x010e
            r8 = r8[r14]
            long r29 = java.lang.Long.parseLong(r8)
        L_0x010e:
            r37 = r29
            r39 = r48
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r55 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment
            r35 = r55
            r35.<init>(r36, r37, r39)
            r12 = 0
            r29 = 0
            r48 = -1
            goto L_0x004f
        L_0x0120:
            java.lang.String r10 = "#EXT-X-TARGETDURATION"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x014c
            int r10 = setMin
            int r10 = r10 + 39
            int r11 = r10 % 128
            setMax = r11
            int r10 = r10 % r9
            r11 = 1000000(0xf4240, double:4.940656E-318)
            if (r10 == 0) goto L_0x0140
            java.util.regex.Pattern r9 = REGEX_TARGET_DURATION
            int r8 = parseIntAttr(r8, r9)
            long r8 = (long) r8
            long r24 = r8 / r11
            goto L_0x0149
        L_0x0140:
            java.util.regex.Pattern r9 = REGEX_TARGET_DURATION
            int r8 = parseIntAttr(r8, r9)
            long r8 = (long) r8
            long r24 = r8 * r11
        L_0x0149:
            r12 = 0
            goto L_0x004f
        L_0x014c:
            java.lang.String r10 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x015d
            java.util.regex.Pattern r9 = REGEX_MEDIA_SEQUENCE
            long r31 = parseLongAttr(r8, r9)
            r21 = r31
            goto L_0x0149
        L_0x015d:
            java.lang.String r10 = "#EXT-X-VERSION"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x0167
            r10 = 1
            goto L_0x0168
        L_0x0167:
            r10 = 0
        L_0x0168:
            if (r10 == 0) goto L_0x0171
            java.util.regex.Pattern r9 = REGEX_VERSION
            int r23 = parseIntAttr(r8, r9)
            goto L_0x0149
        L_0x0171:
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x01a5
            java.util.regex.Pattern r9 = REGEX_IMPORT
            java.lang.String r9 = parseOptionalStringAttr(r8, r9, r2)
            if (r9 == 0) goto L_0x018f
            java.util.Map<java.lang.String, java.lang.String> r8 = r0.variableDefinitions
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x019e
            r2.put(r9, r8)
            goto L_0x019e
        L_0x018f:
            java.util.regex.Pattern r9 = REGEX_NAME
            java.lang.String r9 = parseStringAttr(r8, r9, r2)
            java.util.regex.Pattern r10 = REGEX_VALUE
            java.lang.String r8 = parseStringAttr(r8, r10, r2)
            r2.put(r9, r8)
        L_0x019e:
            r58 = r3
            r3 = 0
            r8 = -1
            goto L_0x0404
        L_0x01a5:
            java.lang.String r10 = "#EXTINF"
            boolean r10 = r8.startsWith(r10)
            r37 = 33
            if (r10 == 0) goto L_0x01d6
            int r10 = setMin
            int r10 = r10 + 17
            int r11 = r10 % 128
            setMax = r11
            int r10 = r10 % r9
            java.util.regex.Pattern r10 = REGEX_MEDIA_DURATION
            double r10 = parseDoubleAttr(r8, r10)
            double r10 = r10 * r35
            long r10 = (long) r10
            java.util.regex.Pattern r12 = REGEX_MEDIA_TITLE
            java.lang.String r8 = parseOptionalStringAttr(r8, r12, r7, r2)
            r34 = r8
            r56 = r10
            int r8 = setMax
            int r8 = r8 + 33
            int r10 = r8 % 128
            setMin = r10
            int r8 = r8 % r9
            goto L_0x0149
        L_0x01d6:
            java.lang.String r10 = "#EXT-X-KEY"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x028a
            java.util.regex.Pattern r10 = REGEX_METHOD
            java.lang.String r10 = parseStringAttr(r8, r10, r2)
            java.util.regex.Pattern r11 = REGEX_KEYFORMAT
            java.lang.String r12 = "identity"
            java.lang.String r11 = parseOptionalStringAttr(r8, r11, r12, r2)
            java.lang.String r13 = "NONE"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto L_0x0201
            r3.clear()
            r12 = 0
            r13 = 0
            r33 = 0
            r53 = 0
            r54 = 0
            goto L_0x004f
        L_0x0201:
            java.util.regex.Pattern r13 = REGEX_IV
            java.lang.String r54 = parseOptionalStringAttr(r8, r13, r2)
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x024b
            int r11 = setMin
            int r11 = r11 + 9
            int r12 = r11 % 128
            setMax = r12
            int r11 = r11 % r9
            java.lang.String r12 = "AES-128"
            if (r11 == 0) goto L_0x0226
            boolean r10 = r12.equals(r10)
            r11 = 0
            int r12 = r11.length     // Catch:{ all -> 0x0223 }
            if (r10 == 0) goto L_0x0284
            goto L_0x022c
        L_0x0223:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0226:
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x0284
        L_0x022c:
            int r10 = setMin
            int r10 = r10 + 85
            int r11 = r10 % 128
            setMax = r11
            int r10 = r10 % r9
            if (r10 == 0) goto L_0x0244
            java.util.regex.Pattern r9 = REGEX_URI
            java.lang.String r53 = parseStringAttr(r8, r9, r2)
            r8 = 0
            int r9 = r8.length     // Catch:{ all -> 0x0241 }
            goto L_0x02b1
        L_0x0241:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0244:
            java.util.regex.Pattern r9 = REGEX_URI
            java.lang.String r53 = parseStringAttr(r8, r9, r2)
            goto L_0x02b1
        L_0x024b:
            if (r5 != 0) goto L_0x0263
            java.lang.String r5 = "SAMPLE-AES-CENC"
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L_0x0261
            java.lang.String r5 = "SAMPLE-AES-CTR"
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x025e
            goto L_0x0261
        L_0x025e:
            java.lang.String r5 = "cbcs"
            goto L_0x0263
        L_0x0261:
            java.lang.String r5 = "cenc"
        L_0x0263:
            java.lang.String r10 = "com.microsoft.playready"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x041b }
            if (r10 == 0) goto L_0x0270
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = parsePlayReadySchemeData(r8, r2)
            goto L_0x0274
        L_0x0270:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = parseWidevineSchemeData(r8, r11, r2)
        L_0x0274:
            if (r8 == 0) goto L_0x0284
            int r10 = setMax
            int r10 = r10 + 53
            int r12 = r10 % 128
            setMin = r12
            int r10 = r10 % r9
            r3.put(r11, r8)
            r33 = 0
        L_0x0284:
            r12 = 0
            r13 = 0
            r53 = 0
            goto L_0x004f
        L_0x028a:
            java.lang.String r10 = "#EXT-X-BYTERANGE"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x0294
            r10 = 0
            goto L_0x0295
        L_0x0294:
            r10 = 1
        L_0x0295:
            if (r10 == r14) goto L_0x02b5
            java.util.regex.Pattern r9 = REGEX_BYTERANGE
            java.lang.String r8 = parseStringAttr(r8, r9, r2)
            java.lang.String[] r8 = r8.split(r11)
            r9 = 0
            r10 = r8[r9]
            long r48 = java.lang.Long.parseLong(r10)
            int r9 = r8.length
            if (r9 <= r14) goto L_0x02b1
            r8 = r8[r14]
            long r29 = java.lang.Long.parseLong(r8)
        L_0x02b1:
            r12 = 0
            r13 = 0
            goto L_0x004f
        L_0x02b5:
            java.lang.String r10 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r10 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0418 }
            if (r10 == 0) goto L_0x02cc
            int r1 = r8.indexOf(r12)
            int r1 = r1 + r14
            java.lang.String r1 = r8.substring(r1)
            int r20 = java.lang.Integer.parseInt(r1)
            r1 = 1
            goto L_0x02b1
        L_0x02cc:
            java.lang.String r10 = "#EXT-X-DISCONTINUITY"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L_0x02d7
            int r50 = r50 + 1
            goto L_0x02b1
        L_0x02d7:
            java.lang.String r10 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x0300
            r9 = 0
            int r11 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x02e7
            r9 = 0
            goto L_0x02e8
        L_0x02e7:
            r9 = 1
        L_0x02e8:
            if (r9 == 0) goto L_0x02ec
            goto L_0x019e
        L_0x02ec:
            int r9 = r8.indexOf(r12)
            int r9 = r9 + r14
            java.lang.String r8 = r8.substring(r9)
            long r8 = com.google.android.exoplayer2.util.Util.parseXsDateTime(r8)
            long r8 = com.google.android.exoplayer2.C.msToUs(r8)
            long r18 = r8 - r51
            goto L_0x02b1
        L_0x0300:
            java.lang.String r10 = "#EXT-X-GAP"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L_0x030e
            r12 = 0
            r13 = 0
            r47 = 1
            goto L_0x004f
        L_0x030e:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L_0x031c
            r12 = 0
            r13 = 0
            r26 = 1
            goto L_0x004f
        L_0x031c:
            java.lang.String r10 = "#EXT-X-ENDLIST"
            boolean r10 = r8.equals(r10)
            r11 = 36
            if (r10 == 0) goto L_0x0329
            r10 = 36
            goto L_0x032b
        L_0x0329:
            r10 = 33
        L_0x032b:
            if (r10 == r11) goto L_0x040d
            java.lang.String r10 = "#"
            boolean r10 = r8.startsWith(r10)
            if (r10 != 0) goto L_0x019e
            int r10 = setMax
            int r10 = r10 + 121
            int r11 = r10 % 128
            setMin = r11
            int r10 = r10 % r9
            if (r10 != 0) goto L_0x034a
            r10 = 18
            r11 = 0
            int r10 = r10 / r11
            if (r53 != 0) goto L_0x0351
            goto L_0x035d
        L_0x0347:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x034a:
            if (r53 != 0) goto L_0x034e
            r10 = 0
            goto L_0x034f
        L_0x034e:
            r10 = 1
        L_0x034f:
            if (r10 == 0) goto L_0x035d
        L_0x0351:
            if (r54 == 0) goto L_0x0356
            r42 = r54
            goto L_0x035f
        L_0x0356:
            java.lang.String r10 = java.lang.Long.toHexString(r31)
            r42 = r10
            goto L_0x035f
        L_0x035d:
            r42 = 0
        L_0x035f:
            r10 = 1
            long r10 = r31 + r10
            r12 = -1
            int r31 = (r48 > r12 ? 1 : (r48 == r12 ? 0 : -1))
            if (r31 != 0) goto L_0x036b
            r29 = 0
        L_0x036b:
            if (r33 != 0) goto L_0x03c4
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L_0x03c4
            java.util.Collection r12 = r3.values()
            r13 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r14 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r13]
            java.lang.Object[] r12 = r12.toArray(r14)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r12 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r12
            com.google.android.exoplayer2.drm.DrmInitData r14 = new com.google.android.exoplayer2.drm.DrmInitData
            r14.<init>((java.lang.String) r5, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r12)
            if (r28 != 0) goto L_0x03c0
            int r28 = setMin
            int r13 = r28 + 81
            int r0 = r13 % 128
            setMax = r0
            int r13 = r13 % r9
            if (r13 == 0) goto L_0x0397
            int r0 = r12.length
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r0]
            r9 = 1
            goto L_0x039b
        L_0x0397:
            int r0 = r12.length
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r0]
            r9 = 0
        L_0x039b:
            int r13 = r12.length
            if (r9 >= r13) goto L_0x03a3
            r58 = r3
            r3 = 1
            r13 = 0
            goto L_0x03a7
        L_0x03a3:
            r58 = r3
            r3 = 1
            r13 = 1
        L_0x03a7:
            if (r13 == r3) goto L_0x03b7
            r13 = r12[r9]
            r3 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r13 = r13.copyWithData(r3)
            r0[r9] = r13
            int r9 = r9 + 1
            r3 = r58
            goto L_0x039b
        L_0x03b7:
            r3 = 0
            com.google.android.exoplayer2.drm.DrmInitData r9 = new com.google.android.exoplayer2.drm.DrmInitData
            r9.<init>((java.lang.String) r5, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r0)
            r28 = r9
            goto L_0x03c9
        L_0x03c0:
            r58 = r3
            r3 = 0
            goto L_0x03c9
        L_0x03c4:
            r58 = r3
            r3 = 0
            r14 = r33
        L_0x03c9:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment
            r31 = r0
            java.lang.String r32 = replaceVariableReferences(r8, r2)
            r33 = r55
            r35 = r56
            r37 = r50
            r38 = r51
            r40 = r14
            r41 = r53
            r43 = r29
            r45 = r48
            r31.<init>(r32, r33, r34, r35, r37, r38, r40, r41, r42, r43, r45, r47)
            r15.add(r0)
            long r51 = r51 + r56
            r8 = -1
            int r0 = (r48 > r8 ? 1 : (r48 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x03f1
            long r29 = r29 + r48
        L_0x03f1:
            r0 = r60
            r12 = r3
            r34 = r7
            r48 = r8
            r31 = r10
            r33 = r14
            r3 = r58
            r13 = 0
            r14 = 1
            r47 = 0
            goto L_0x004d
        L_0x0404:
            r0 = r60
            r12 = r3
            r3 = r58
            r13 = 0
            r14 = 1
            goto L_0x004f
        L_0x040d:
            r58 = r3
            r12 = 0
            r13 = 0
            r14 = 1
            r27 = 1
            r0 = r60
            goto L_0x004f
        L_0x0418:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x041b:
            r0 = move-exception
            throw r0
        L_0x041d:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist
            r2 = 0
            int r5 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0428
            r59 = 1
            goto L_0x042a
        L_0x0428:
            r59 = 0
        L_0x042a:
            r3 = r0
            r5 = r62
            r7 = r16
            r9 = r18
            r11 = r1
            r12 = r20
            r13 = r21
            r1 = r15
            r15 = r23
            r16 = r24
            r18 = r26
            r19 = r27
            r20 = r59
            r21 = r28
            r22 = r1
            r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.parseMediaPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist");
    }

    @Nullable
    private static DrmInitData.SchemeData parsePlayReadySchemeData(String str, Map<String, String> map) throws ParserException {
        int i;
        if ((!"1".equals(parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map)) ? '4' : '!') != '!') {
            try {
                i = setMin + 105;
            } catch (Exception e) {
                throw e;
            }
            try {
                setMax = i % 128;
                DrmInitData.SchemeData schemeData = null;
                if (i % 2 != 0) {
                    super.hashCode();
                }
                int i2 = setMin + 79;
                setMax = i2 % 128;
                if ((i2 % 2 != 0 ? Typography.less : 'A') != '<') {
                    return schemeData;
                }
                super.hashCode();
                return schemeData;
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            String parseStringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C.PLAYREADY_UUID, MimeTypes.VIDEO_MP4, PsshAtomUtil.buildPsshAtom(C.PLAYREADY_UUID, Base64.decode(parseStringAttr.substring(parseStringAttr.indexOf(44)), 0)));
        }
    }

    @Nullable
    private static DrmInitData.SchemeData parseWidevineSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        int i = setMin + 101;
        setMax = i % 128;
        int i2 = i % 2;
        boolean z = false;
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String parseStringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, MimeTypes.VIDEO_MP4, Base64.decode(parseStringAttr.substring(parseStringAttr.indexOf(44)), 0));
        } else if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            try {
                return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", str.getBytes(length(123 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), TextUtils.indexOf("", '0', 0, 0) + 5, new char[]{65513, 2, 16, 17, 65524}, true ^ PhoneNumberUtils.isGlobalPhoneNumber(""), ExpandableListView.getPackedPositionChild(0) + 6).intern()));
            } catch (UnsupportedEncodingException e) {
                throw new ParserException((Throwable) e);
            }
        } else {
            int i3 = setMin + 119;
            setMax = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            DrmInitData.SchemeData schemeData = null;
            if (!z) {
                return schemeData;
            }
            super.hashCode();
            return schemeData;
        }
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        int i;
        int i2 = setMin + 121;
        setMax = i2 % 128;
        if (i2 % 2 != 0) {
            i = Integer.parseInt(parseStringAttr(str, pattern, Collections.emptyMap()));
            Object[] objArr = null;
            int length2 = objArr.length;
        } else {
            i = Integer.parseInt(parseStringAttr(str, pattern, Collections.emptyMap()));
        }
        int i3 = setMax + 95;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return i;
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        int i = setMin + 109;
        setMax = i % 128;
        int i2 = i % 2;
        long parseLong = Long.parseLong(parseStringAttr(str, pattern, Collections.emptyMap()));
        int i3 = setMax + 23;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return parseLong;
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        int i = setMin + 45;
        setMax = i % 128;
        int i2 = i % 2;
        double parseDouble = Double.parseDouble(parseStringAttr(str, pattern, Collections.emptyMap()));
        int i3 = setMax + 15;
        setMin = i3 % 128;
        if ((i3 % 2 == 0 ? 'A' : '*') != 'A') {
            return parseDouble;
        }
        Object obj = null;
        super.hashCode();
        return parseDouble;
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        int i = setMin + 19;
        setMax = i % 128;
        int i2 = i % 2;
        String parseOptionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if ((parseOptionalStringAttr != null ? 'G' : 'Q') == 'G') {
            int i3 = setMax + 75;
            setMin = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return parseOptionalStringAttr;
            }
            int i4 = 16 / 0;
            return parseOptionalStringAttr;
        }
        StringBuilder sb = new StringBuilder("Couldn't match ");
        sb.append(pattern.pattern());
        sb.append(" in ");
        sb.append(str);
        throw new ParserException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.String] */
    @Nullable
    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        try {
            int i = setMin + 77;
            setMax = i % 128;
            int i2 = i % 2;
            ? r0 = 0;
            String parseOptionalStringAttr = parseOptionalStringAttr(str, pattern, r0, map);
            int i3 = setMin + 3;
            setMax = i3 % 128;
            if (i3 % 2 == 0) {
                return parseOptionalStringAttr;
            }
            int length2 = r0.length;
            return parseOptionalStringAttr;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if ((r4.find() ? 'U' : 9) != 9) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r4.find() != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005b, code lost:
        if (r6 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0060, code lost:
        if (r6 == null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String parseOptionalStringAttr(java.lang.String r4, java.util.regex.Pattern r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            int r0 = setMax
            int r0 = r0 + 113
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 63
            if (r0 != 0) goto L_0x0011
            r0 = 52
            goto L_0x0013
        L_0x0011:
            r0 = 63
        L_0x0013:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0033
            java.util.regex.Matcher r4 = r5.matcher(r4)     // Catch:{ Exception -> 0x0031 }
            boolean r5 = r4.find()     // Catch:{ Exception -> 0x002f }
            r0 = 5
            int r0 = r0 / r2
            r0 = 9
            if (r5 == 0) goto L_0x0028
            r5 = 85
            goto L_0x002a
        L_0x0028:
            r5 = 9
        L_0x002a:
            if (r5 == r0) goto L_0x0041
            goto L_0x003d
        L_0x002d:
            r4 = move-exception
            throw r4
        L_0x002f:
            r4 = move-exception
            goto L_0x0068
        L_0x0031:
            r4 = move-exception
            throw r4
        L_0x0033:
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.find()
            if (r5 == 0) goto L_0x0041
        L_0x003d:
            java.lang.String r6 = r4.group(r3)
        L_0x0041:
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x0069
            int r4 = setMin     // Catch:{ Exception -> 0x002f }
            int r4 = r4 + 19
            int r5 = r4 % 128
            setMax = r5     // Catch:{ Exception -> 0x002f }
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = 1
        L_0x0055:
            if (r2 == r3) goto L_0x0060
            r4 = 0
            super.hashCode()     // Catch:{ all -> 0x005e }
            if (r6 != 0) goto L_0x0063
            goto L_0x0069
        L_0x005e:
            r4 = move-exception
            throw r4
        L_0x0060:
            if (r6 != 0) goto L_0x0063
            goto L_0x0069
        L_0x0063:
            java.lang.String r4 = replaceVariableReferences(r6, r7)
            return r4
        L_0x0068:
            throw r4
        L_0x0069:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.parseOptionalStringAttr(java.lang.String, java.util.regex.Pattern, java.lang.String, java.util.Map):java.lang.String");
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        String str2;
        try {
            try {
                Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    if ((matcher.find() ? '2' : 'b') != 'b') {
                        int i = setMin + 111;
                        setMax = i % 128;
                        if (i % 2 != 0) {
                            str2 = matcher.group(0);
                            if (!map.containsKey(str2)) {
                            }
                        } else {
                            str2 = matcher.group(1);
                            if ((map.containsKey(str2) ? (char) 28 : 21) == 21) {
                            }
                        }
                        int i2 = setMax + 91;
                        setMin = i2 % 128;
                        int i3 = i2 % 2;
                        matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(str2)));
                        int i4 = setMin + 15;
                        setMax = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        matcher.appendTail(stringBuffer);
                        return stringBuffer.toString();
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if ((!r3.find()) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = r3.group(1).equals("YES");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r4 = setMin + 41;
        setMax = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if ((r4 % 2) == 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r4 = '3';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        r4 = ')';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r4 == ')') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r4 = 28 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0060, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0061, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3.find() ? '.' : 'B') != 'B') goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean parseOptionalBooleanAttribute(java.lang.String r3, java.util.regex.Pattern r4, boolean r5) {
        /*
            int r0 = setMax
            int r0 = r0 + 33
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r1) goto L_0x0027
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.find()
            r0 = 66
            if (r4 == 0) goto L_0x0022
            r4 = 46
            goto L_0x0024
        L_0x0022:
            r4 = 66
        L_0x0024:
            if (r4 == r0) goto L_0x0038
            goto L_0x0039
        L_0x0027:
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.find()
            r0 = 5
            int r0 = r0 / r2
            if (r4 == 0) goto L_0x0035
            r4 = 0
            goto L_0x0036
        L_0x0035:
            r4 = 1
        L_0x0036:
            if (r4 == 0) goto L_0x0039
        L_0x0038:
            return r5
        L_0x0039:
            java.lang.String r3 = r3.group(r1)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r4 = "YES"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x005e }
            int r4 = setMin
            r5 = 41
            int r4 = r4 + r5
            int r0 = r4 % 128
            setMax = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0053
            r4 = 51
            goto L_0x0055
        L_0x0053:
            r4 = 41
        L_0x0055:
            if (r4 == r5) goto L_0x005d
            r4 = 28
            int r4 = r4 / r2
            return r3
        L_0x005b:
            r3 = move-exception
            throw r3
        L_0x005d:
            return r3
        L_0x005e:
            r3 = move-exception
            throw r3
        L_0x0060:
            r3 = move-exception
            throw r3
        L_0x0062:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.parseOptionalBooleanAttribute(java.lang.String, java.util.regex.Pattern, boolean):boolean");
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=(NO|YES)");
        Pattern compile = Pattern.compile(sb.toString());
        int i = setMin + 115;
        setMax = i % 128;
        int i2 = i % 2;
        return compile;
    }

    static class LineIterator {
        private final Queue<String> extraLines;
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        public boolean hasNext() throws IOException {
            String trim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = this.extraLines.poll();
                return true;
            }
            do {
                String readLine = this.reader.readLine();
                this.next = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.next = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String next() throws IOException {
            if (!hasNext()) {
                return null;
            }
            String str = this.next;
            this.next = null;
            return str;
        }
    }

    private static String length(int i, int i2, char[] cArr, boolean z, int i3) {
        char[] cArr2 = new char[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = setMax + 79;
            setMin = i5 % 128;
            if (i5 % 2 == 0) {
                cArr2[i4] = (char) (i >> cArr[i4]);
                cArr2[i4] = (char) (cArr2[i4] / length);
                i4 += 53;
            } else {
                cArr2[i4] = (char) (cArr[i4] + i);
                try {
                    cArr2[i4] = (char) (cArr2[i4] - length);
                    i4++;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        if ((i2 > 0 ? '7' : 13) == '7') {
            char[] cArr3 = new char[i3];
            try {
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                int i6 = i3 - i2;
                System.arraycopy(cArr3, 0, cArr2, i6, i2);
                System.arraycopy(cArr3, i2, cArr2, 0, i6);
            } catch (Exception e2) {
                throw e2;
            }
        }
        if ((z ? 22 : JSONLexer.EOI) == 22) {
            int i7 = setMax + 97;
            setMin = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            for (int i9 = 0; i9 < i3; i9++) {
                cArr4[i9] = cArr2[(i3 - i9) - 1];
            }
            int i10 = setMin + 67;
            setMax = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr4;
        }
        return new String(cArr2);
    }
}
