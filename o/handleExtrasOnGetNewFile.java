package o;

import java.util.Map;

public final class handleExtrasOnGetNewFile implements Map.Entry<String, String>, Cloneable {
    LogFileLogAppender getMax;
    public String length;
    public String setMax;

    public final /* synthetic */ Object setValue(Object obj) {
        String str;
        int min;
        String str2 = (String) obj;
        LogFileLogAppender logFileLogAppender = this.getMax;
        int min2 = logFileLogAppender.setMin(this.length);
        if (min2 == -1) {
            str = "";
        } else {
            str = LogFileLogAppender.length(logFileLogAppender.getMin[min2]);
        }
        LogFileLogAppender logFileLogAppender2 = this.getMax;
        if (!(logFileLogAppender2 == null || (min = logFileLogAppender2.setMin(this.length)) == -1)) {
            this.getMax.getMin[min] = str2;
        }
        this.setMax = str2;
        return str;
    }

    public handleExtrasOnGetNewFile(String str, String str2, LogFileLogAppender logFileLogAppender) {
        if (str != null) {
            this.length = str.trim();
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            this.setMax = str2;
            this.getMax = logFileLogAppender;
            return;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            handleExtrasOnGetNewFile handleextrasongetnewfile = (handleExtrasOnGetNewFile) obj;
            String str = this.length;
            if (str == null ? handleextrasongetnewfile.length != null : !str.equals(handleextrasongetnewfile.length)) {
                return false;
            }
            String str2 = this.setMax;
            String str3 = handleextrasongetnewfile.setMax;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.length;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMax;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    /* access modifiers changed from: private */
    /* renamed from: setMin */
    public handleExtrasOnGetNewFile clone() {
        try {
            return (handleExtrasOnGetNewFile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.setMax;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.length;
    }
}
