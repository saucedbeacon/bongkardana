package o;

import android.text.TextUtils;

public final class AppResumePoint {
    private static String DEFAULT_VERSION = "0";
    private static final String PREFIX = "AE";
    public String errorLevel;
    public String errorPrefix;
    public String errorScene;
    public String errorSpecific;
    public String errorType;
    public String version;

    public static String getPrefix() {
        return PREFIX;
    }

    public AppResumePoint() {
        this.version = DEFAULT_VERSION;
    }

    public AppResumePoint(String str) {
        this.version = DEFAULT_VERSION;
        buildAliErrorCode(str);
    }

    public AppResumePoint(String str, String str2) {
        String str3 = DEFAULT_VERSION;
        this.version = str3;
        if (TextUtils.equals(str2, str3)) {
            buildAliErrorCode(str);
        } else {
            buildFcErrorCode(str);
        }
    }

    public final void buildAliErrorCode(String str) {
        try {
            checkString(str, 12);
            spliteErrorCode(str);
        } catch (Throwable unused) {
            spliteErrorCode("AE0509998998");
        }
    }

    public final void buildFcErrorCode(String str) {
        try {
            checkString(str, 16);
            splitFcErrorCode(str);
        } catch (Throwable unused) {
            splitFcErrorCode("AE15999999999999");
        }
    }

    private void splitFcErrorCode(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder("");
        sb.append(charArray[0]);
        sb.append(charArray[1]);
        this.errorPrefix = sb.toString();
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(charArray[2]);
        this.version = sb2.toString();
        StringBuilder sb3 = new StringBuilder("");
        sb3.append(charArray[3]);
        this.errorLevel = sb3.toString();
        StringBuilder sb4 = new StringBuilder("");
        sb4.append(charArray[4]);
        this.errorType = sb4.toString();
        StringBuilder sb5 = new StringBuilder("");
        sb5.append(charArray[5]);
        sb5.append(charArray[6]);
        sb5.append(charArray[7]);
        sb5.append(charArray[8]);
        sb5.append(charArray[9]);
        sb5.append(charArray[10]);
        sb5.append(charArray[11]);
        sb5.append(charArray[12]);
        this.errorScene = sb5.toString();
        StringBuilder sb6 = new StringBuilder("");
        sb6.append(charArray[13]);
        sb6.append(charArray[14]);
        sb6.append(charArray[15]);
        this.errorSpecific = sb6.toString();
    }

    public AppResumePoint(String str, String str2, String str3, String str4, String str5, String str6) {
        this.version = str;
        this.errorLevel = str2;
        this.errorType = str3;
        this.errorScene = str4;
        this.errorSpecific = str5;
        this.errorPrefix = str6;
    }

    public AppResumePoint(String str, String str2, String str3, String str4, String str5) {
        this.version = DEFAULT_VERSION;
        this.version = str;
        this.errorLevel = str2;
        this.errorType = str3;
        this.errorScene = str4;
        this.errorSpecific = str5;
    }

    public AppResumePoint(String str, String str2, String str3, String str4) {
        this.version = DEFAULT_VERSION;
        this.errorLevel = str;
        this.errorType = str2;
        this.errorScene = str3;
        this.errorSpecific = str4;
    }

    public final String toString() {
        try {
            checkString(this.version, 1);
            checkString(this.errorLevel, 1);
            checkString(this.errorScene, getErrorSceneLenByVersion(this.version));
            checkString(this.errorSpecific, 3);
            checkString(this.errorType, 1);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getPrefixByVersion(this.version));
            stringBuffer.append(this.version);
            stringBuffer.append(this.errorLevel);
            stringBuffer.append(this.errorType);
            stringBuffer.append(this.errorScene);
            stringBuffer.append(this.errorSpecific);
            return stringBuffer.toString();
        } catch (IllegalArgumentException unused) {
            return "AE15999999999999";
        }
    }

    private String getPrefixByVersion(String str) {
        return TextUtils.equals(DEFAULT_VERSION, str) ? PREFIX : this.errorPrefix;
    }

    private int getErrorSceneLenByVersion(String str) {
        if (!TextUtils.isEmpty(str)) {
            return TextUtils.equals(DEFAULT_VERSION, str) ? 4 : 8;
        }
        throw new IllegalArgumentException();
    }

    private void spliteErrorCode(String str) {
        if (str.startsWith(PREFIX)) {
            char[] charArray = str.toCharArray();
            StringBuilder sb = new StringBuilder("");
            sb.append(charArray[2]);
            this.version = sb.toString();
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(charArray[3]);
            this.errorLevel = sb2.toString();
            StringBuilder sb3 = new StringBuilder("");
            sb3.append(charArray[4]);
            this.errorType = sb3.toString();
            StringBuilder sb4 = new StringBuilder("");
            sb4.append(charArray[5]);
            sb4.append(charArray[6]);
            sb4.append(charArray[7]);
            sb4.append(charArray[8]);
            this.errorScene = sb4.toString();
            StringBuilder sb5 = new StringBuilder("");
            sb5.append(charArray[9]);
            sb5.append(charArray[10]);
            sb5.append(charArray[11]);
            this.errorSpecific = sb5.toString();
            return;
        }
        throw new IllegalArgumentException();
    }

    private void checkString(String str, int i) {
        if (str == null || str.length() != i) {
            throw new IllegalArgumentException();
        }
    }
}
