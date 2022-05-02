package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Locale;

public final class UrlTemplate {
    private static final String BANDWIDTH = "Bandwidth";
    private static final int BANDWIDTH_ID = 3;
    private static final String DEFAULT_FORMAT_TAG = "%01d";
    private static final String ESCAPED_DOLLAR = "$$";
    private static final String NUMBER = "Number";
    private static final int NUMBER_ID = 2;
    private static final String REPRESENTATION = "RepresentationID";
    private static final int REPRESENTATION_ID = 1;
    private static final String TIME = "Time";
    private static final int TIME_ID = 4;
    private final int identifierCount;
    private final String[] identifierFormatTags;
    private final int[] identifiers;
    private final String[] urlPieces;

    public static UrlTemplate compile(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new UrlTemplate(strArr, iArr, strArr2, parseTemplate(str, strArr, iArr, strArr2));
    }

    private UrlTemplate(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.urlPieces = strArr;
        this.identifiers = iArr;
        this.identifierFormatTags = strArr2;
        this.identifierCount = i;
    }

    public final String buildUri(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.identifierCount;
            if (i2 < i3) {
                sb.append(this.urlPieces[i2]);
                int[] iArr = this.identifiers;
                if (iArr[i2] == 1) {
                    sb.append(str);
                } else if (iArr[i2] == 2) {
                    sb.append(String.format(Locale.US, this.identifierFormatTags[i2], new Object[]{Long.valueOf(j)}));
                } else if (iArr[i2] == 3) {
                    sb.append(String.format(Locale.US, this.identifierFormatTags[i2], new Object[]{Integer.valueOf(i)}));
                } else if (iArr[i2] == 4) {
                    sb.append(String.format(Locale.US, this.identifierFormatTags[i2], new Object[]{Long.valueOf(j2)}));
                }
                i2++;
            } else {
                sb.append(this.urlPieces[i3]);
                return sb.toString();
            }
        }
    }

    private static int parseTemplate(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            char c = 65535;
            if (indexOf == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i2]);
                sb.append(str.substring(i));
                strArr[i2] = sb.toString();
                i = str.length();
            } else if (indexOf != i) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr[i2]);
                sb2.append(str.substring(i, indexOf));
                strArr[i2] = sb2.toString();
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strArr[i2]);
                sb3.append("$");
                strArr[i2] = sb3.toString();
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = str.indexOf("$", i3);
                String substring = str.substring(i3, indexOf2);
                if (substring.equals(REPRESENTATION)) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d")) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str2);
                            sb4.append("d");
                            str2 = sb4.toString();
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = DEFAULT_FORMAT_TAG;
                    }
                    int hashCode = substring.hashCode();
                    if (hashCode != -1950496919) {
                        if (hashCode != 2606829) {
                            if (hashCode == 38199441 && substring.equals(BANDWIDTH)) {
                                c = 1;
                            }
                        } else if (substring.equals("Time")) {
                            c = 2;
                        }
                    } else if (substring.equals("Number")) {
                        c = 0;
                    }
                    if (c == 0) {
                        iArr[i2] = 2;
                    } else if (c == 1) {
                        iArr[i2] = 3;
                    } else if (c == 2) {
                        iArr[i2] = 4;
                    } else {
                        throw new IllegalArgumentException("Invalid template: ".concat(String.valueOf(str)));
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return i2;
    }
}
