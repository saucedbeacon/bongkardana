package o;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Nullable;
import o.LogContextImpl;
import o.createChallenge;

abstract class initCrashLog<T> {
    /* access modifiers changed from: package-private */
    public abstract void getMin(getTraceLogger gettracelogger, @Nullable T t) throws IOException;

    initCrashLog() {
    }

    static final class values extends initCrashLog<Object> {
        values() {
        }

        /* access modifiers changed from: package-private */
        public final void getMin(getTraceLogger gettracelogger, @Nullable Object obj) {
            ProcessInfoImpl.getMin(obj, "@Url parameter is null.");
            gettracelogger.length = obj.toString();
        }
    }

    static final class getMin<T> extends initCrashLog<T> {
        private final LogContextImpl.AnonymousClass2<T, String> getMax;
        private final String getMin;

        getMin(String str, LogContextImpl.AnonymousClass2<T, String> r3) {
            this.getMin = (String) ProcessInfoImpl.getMin(str, "name == null");
            this.getMax = r3;
        }

        /* access modifiers changed from: package-private */
        public final void getMin(getTraceLogger gettracelogger, @Nullable T t) throws IOException {
            String max;
            if (t != null && (max = this.getMax.getMax(t)) != null) {
                gettracelogger.setMin(this.getMin, max);
            }
        }
    }

    static final class toIntRange<T> extends initCrashLog<T> {
        private final String getMax;
        private final LogContextImpl.AnonymousClass2<T, String> getMin;
        private final boolean setMax;

        toIntRange(String str, LogContextImpl.AnonymousClass2<T, String> r3, boolean z) {
            this.getMax = (String) ProcessInfoImpl.getMin(str, "name == null");
            this.getMin = r3;
            this.setMax = z;
        }

        /* access modifiers changed from: package-private */
        public final void getMin(getTraceLogger gettracelogger, @Nullable T t) throws IOException {
            if (t != null) {
                String str = this.getMax;
                String max = this.getMin.getMax(t);
                boolean z = this.setMax;
                if (gettracelogger.length != null) {
                    String str2 = gettracelogger.length;
                    StringBuilder sb = new StringBuilder("{");
                    sb.append(str);
                    sb.append("}");
                    gettracelogger.length = str2.replace(sb.toString(), getTraceLogger.length(max, z));
                    return;
                }
                throw new AssertionError();
            }
            StringBuilder sb2 = new StringBuilder("Path parameter \"");
            sb2.append(this.getMax);
            sb2.append("\" value must not be null.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    static final class toFloatRange<T> extends initCrashLog<T> {
        private final String getMax;
        private final boolean getMin;
        private final LogContextImpl.AnonymousClass2<T, String> setMin;

        toFloatRange(String str, LogContextImpl.AnonymousClass2<T, String> r3, boolean z) {
            this.getMax = (String) ProcessInfoImpl.getMin(str, "name == null");
            this.setMin = r3;
            this.getMin = z;
        }

        /* access modifiers changed from: package-private */
        public final void getMin(getTraceLogger gettracelogger, @Nullable T t) throws IOException {
            String max;
            if (t != null && (max = this.setMin.getMax(t)) != null) {
                gettracelogger.getMin(this.getMax, max, this.getMin);
            }
        }
    }

    static final class IsOverlapping<T> extends initCrashLog<Map<String, T>> {
        private final boolean getMax;
        private final LogContextImpl.AnonymousClass2<T, String> setMax;

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String max = this.setMax.getMax(value);
                            if (max != null) {
                                gettracelogger.getMin(str, max, this.getMax);
                            } else {
                                StringBuilder sb = new StringBuilder("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.setMax.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Query map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }

        IsOverlapping(LogContextImpl.AnonymousClass2<T, String> r1, boolean z) {
            this.setMax = r1;
            this.getMax = z;
        }
    }

    static final class getMax<T> extends initCrashLog<Map<String, T>> {
        private final LogContextImpl.AnonymousClass2<T, String> getMax;

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            gettracelogger.setMin(str, this.getMax.getMax(value));
                        } else {
                            StringBuilder sb = new StringBuilder("Header map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }

        getMax(LogContextImpl.AnonymousClass2<T, String> r1) {
            this.getMax = r1;
        }
    }

    static final class setMin<T> extends initCrashLog<T> {
        private final LogContextImpl.AnonymousClass2<T, String> length;
        private final String setMax;
        private final boolean setMin;

        setMin(String str, LogContextImpl.AnonymousClass2<T, String> r3, boolean z) {
            this.setMax = (String) ProcessInfoImpl.getMin(str, "name == null");
            this.length = r3;
            this.setMin = z;
        }

        /* access modifiers changed from: package-private */
        public final void getMin(getTraceLogger gettracelogger, @Nullable T t) throws IOException {
            String max;
            if (t != null && (max = this.length.getMax(t)) != null) {
                String str = this.setMax;
                if (this.setMin) {
                    gettracelogger.setMax.getMin(str, max);
                } else {
                    gettracelogger.setMax.setMax(str, max);
                }
            }
        }
    }

    static final class length<T> extends initCrashLog<Map<String, T>> {
        private final boolean getMin;
        private final LogContextImpl.AnonymousClass2<T, String> length;

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String max = this.length.getMax(value);
                            if (max == null) {
                                StringBuilder sb = new StringBuilder("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.length.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw new IllegalArgumentException(sb.toString());
                            } else if (this.getMin) {
                                gettracelogger.setMax.getMin(str, max);
                            } else {
                                gettracelogger.setMax.setMax(str, max);
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Field map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }

        length(LogContextImpl.AnonymousClass2<T, String> r1, boolean z) {
            this.length = r1;
            this.getMin = z;
        }
    }

    static final class isInside<T> extends initCrashLog<T> {
        private final LogContextImpl.AnonymousClass2<T, getPart> setMax;
        private final Draft_75 setMin;

        isInside(Draft_75 draft_75, LogContextImpl.AnonymousClass2<T, getPart> r2) {
            this.setMin = draft_75;
            this.setMax = r2;
        }

        /* access modifiers changed from: package-private */
        public final void getMin(getTraceLogger gettracelogger, @Nullable T t) {
            if (t != null) {
                try {
                    getPart max = this.setMax.getMax(t);
                    Draft_75 draft_75 = this.setMin;
                    createChallenge.setMax setmax = gettracelogger.getMax;
                    setmax.getMin.add(createChallenge.getMax.setMax(draft_75, max));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    static final class hashCode extends initCrashLog<createChallenge.getMax> {
        static final hashCode getMin = new hashCode();

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
            createChallenge.getMax getmax = (createChallenge.getMax) obj;
            if (getmax != null) {
                createChallenge.setMax setmax = gettracelogger.getMax;
                if (getmax != null) {
                    setmax.getMin.add(getmax);
                    return;
                }
                throw new NullPointerException("part == null");
            }
        }

        private hashCode() {
        }
    }

    static final class equals<T> extends initCrashLog<Map<String, T>> {
        private final LogContextImpl.AnonymousClass2<T, getPart> length;
        private final String setMin;

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            StringBuilder sb = new StringBuilder("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            String[] strArr = {HttpHeaders.CONTENT_DISPOSITION, sb.toString(), "Content-Transfer-Encoding", this.setMin};
                            createChallenge.setMax setmax = gettracelogger.getMax;
                            setmax.getMin.add(createChallenge.getMax.setMax(Draft_75.setMax(strArr), this.length.getMax(value)));
                        } else {
                            StringBuilder sb2 = new StringBuilder("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }

        equals(LogContextImpl.AnonymousClass2<T, getPart> r1, String str) {
            this.length = r1;
            this.setMin = str;
        }
    }

    static final class setMax<T> extends initCrashLog<T> {
        private final LogContextImpl.AnonymousClass2<T, getPart> setMin;

        setMax(LogContextImpl.AnonymousClass2<T, getPart> r1) {
            this.setMin = r1;
        }

        /* access modifiers changed from: package-private */
        public final void getMin(getTraceLogger gettracelogger, @Nullable T t) {
            if (t != null) {
                try {
                    gettracelogger.getMin = this.setMin.getMax(t);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }
}
