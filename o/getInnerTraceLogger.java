package o;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.Draft_75;
import o.LogContextImpl;
import o.checkAlloc;
import o.createChallenge;
import o.initCrashLog;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Url;

public final class getInnerTraceLogger<R, T> {
    static final Pattern getMax = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    static final Pattern setMin = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    private final Draft_76 IsOverlapping;
    private final translateRegularFrame equals;
    private final checkAlloc.getMin getMin;
    private final boolean hashCode;
    private final String isInside;
    public final LogContextImpl.AppendWorker<R, T> length;
    final LogContextImpl.AnonymousClass2<NotSendableException, R> setMax;
    private final initCrashLog<?>[] toDoubleRange;
    private final Draft_75 toFloatRange;
    private final String toIntRange;
    private final boolean toString;
    private final boolean values;

    getInnerTraceLogger(setMax<R, T> setmax) {
        this.getMin = setmax.length.getMax;
        this.length = setmax.b;
        this.IsOverlapping = setmax.length.length;
        this.setMax = setmax.create;
        this.isInside = setmax.values;
        this.toIntRange = setmax.invoke;
        this.toFloatRange = setmax.Grayscale$Algorithm;
        this.equals = setmax.invokeSuspend;
        this.values = setmax.toDoubleRange;
        this.toString = setmax.hashCode;
        this.hashCode = setmax.valueOf;
        this.toDoubleRange = setmax.onNavigationEvent;
    }

    /* access modifiers changed from: package-private */
    public final checkAlloc getMin(@Nullable Object... objArr) throws IOException {
        getTraceLogger gettracelogger = new getTraceLogger(this.isInside, this.IsOverlapping, this.toIntRange, this.toFloatRange, this.equals, this.values, this.toString, this.hashCode);
        initCrashLog<?>[] initcrashlogArr = this.toDoubleRange;
        int length2 = objArr != null ? objArr.length : 0;
        if (length2 == initcrashlogArr.length) {
            for (int i = 0; i < length2; i++) {
                initcrashlogArr[i].getMin(gettracelogger, objArr[i]);
            }
            return this.getMin.length(gettracelogger.setMax());
        }
        StringBuilder sb = new StringBuilder("Argument count (");
        sb.append(length2);
        sb.append(") doesn't match expected count (");
        sb.append(initcrashlogArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    static final class setMax<T, R> {
        boolean FastBitmap$CoordinateSystem;
        Draft_75 Grayscale$Algorithm;
        boolean IsOverlapping;
        Set<String> Mean$Arithmetic;
        LogContextImpl.AppendWorker<T, R> b;
        LogContextImpl.AnonymousClass2<NotSendableException, T> create;
        boolean equals;
        final Annotation[] getMax;
        final Type[] getMin;
        boolean hashCode;
        String invoke;
        translateRegularFrame invokeSuspend;
        boolean isInside;
        final UtdidDeviceIdProvider length;
        initCrashLog<?>[] onNavigationEvent;
        final Annotation[][] setMax;
        final Method setMin;
        boolean toDoubleRange;
        Type toFloatRange;
        boolean toIntRange;
        boolean toString;
        boolean valueOf;
        String values;

        setMax(UtdidDeviceIdProvider utdidDeviceIdProvider, Method method) {
            this.length = utdidDeviceIdProvider;
            this.setMin = method;
            this.getMax = method.getAnnotations();
            this.getMin = method.getGenericParameterTypes();
            this.setMax = method.getParameterAnnotations();
        }

        /* access modifiers changed from: package-private */
        public final LogContextImpl.AppendWorker<T, R> setMin() {
            Type genericReturnType = this.setMin.getGenericReturnType();
            if (ProcessInfoImpl.setMax(genericReturnType)) {
                throw setMax((Throwable) null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                Annotation[] annotations = this.setMin.getAnnotations();
                try {
                    UtdidDeviceIdProvider utdidDeviceIdProvider = this.length;
                    ProcessInfoImpl.getMin(genericReturnType, "returnType == null");
                    ProcessInfoImpl.getMin(annotations, "annotations == null");
                    int indexOf = utdidDeviceIdProvider.getMin.indexOf((Object) null) + 1;
                    int size = utdidDeviceIdProvider.getMin.size();
                    for (int i = indexOf; i < size; i++) {
                        LogContextImpl.AppendWorker<?, ?> length2 = utdidDeviceIdProvider.getMin.get(i).length(genericReturnType);
                        if (length2 != null) {
                            return length2;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
                    sb.append(genericReturnType);
                    sb.append(".\n");
                    sb.append("  Tried:");
                    int size2 = utdidDeviceIdProvider.getMin.size();
                    while (indexOf < size2) {
                        sb.append("\n   * ");
                        sb.append(utdidDeviceIdProvider.getMin.get(indexOf).getClass().getName());
                        indexOf++;
                    }
                    throw new IllegalArgumentException(sb.toString());
                } catch (RuntimeException e) {
                    throw setMax(e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw setMax((Throwable) null, "Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: package-private */
        public final void length(String str, String str2, boolean z) {
            String str3 = this.values;
            if (str3 == null) {
                this.values = str;
                this.toDoubleRange = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (getInnerTraceLogger.setMin.matcher(substring).find()) {
                            throw setMax((Throwable) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.invoke = str2;
                    this.Mean$Arithmetic = getInnerTraceLogger.getMax(str2);
                    return;
                }
                return;
            }
            throw setMax((Throwable) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* access modifiers changed from: package-private */
        public final Draft_75 setMin(String[] strArr) {
            Draft_75.length length2 = new Draft_75.length();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw setMax((Throwable) null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    translateRegularFrame length3 = translateRegularFrame.length(trim);
                    if (length3 != null) {
                        this.invokeSuspend = length3;
                    } else {
                        throw setMax((Throwable) null, "Malformed content type: %s", trim);
                    }
                } else {
                    length2.getMax(substring, trim);
                }
            }
            return new Draft_75(length2);
        }

        /* access modifiers changed from: package-private */
        public final initCrashLog<?> getMax(int i, Type type, Annotation[] annotationArr) {
            initCrashLog<?> initcrashlog = null;
            for (Annotation min : annotationArr) {
                initCrashLog<?> min2 = getMin(i, type, annotationArr, min);
                if (min2 != null) {
                    if (initcrashlog == null) {
                        initcrashlog = min2;
                    } else {
                        throw getMax(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (initcrashlog != null) {
                return initcrashlog;
            }
            throw getMax(i, "No Retrofit annotation found.", new Object[0]);
        }

        private initCrashLog<?> getMin(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                if (this.toString) {
                    throw getMax(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.isInside) {
                    throw getMax(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.FastBitmap$CoordinateSystem) {
                    throw getMax(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.invoke == null) {
                    this.toString = true;
                    if (type == Draft_76.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new initCrashLog.values();
                    }
                    throw getMax(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw getMax(i, "@Url cannot be used with @%s URL", this.values);
                }
            } else if (annotation instanceof Path) {
                if (this.FastBitmap$CoordinateSystem) {
                    throw getMax(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.toString) {
                    throw getMax(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.invoke != null) {
                    this.isInside = true;
                    Path path = (Path) annotation;
                    String value = path.value();
                    if (!getInnerTraceLogger.getMax.matcher(value).matches()) {
                        throw getMax(i, "@Path parameter name must match %s. Found: %s", getInnerTraceLogger.setMin.pattern(), value);
                    } else if (this.Mean$Arithmetic.contains(value)) {
                        return new initCrashLog.toIntRange(value, this.length.getMax(type, annotationArr), path.encoded());
                    } else {
                        throw getMax(i, "URL \"%s\" does not contain \"{%s}\".", this.invoke, value);
                    }
                } else {
                    throw getMax(i, "@Path can only be used with relative url on @%s", this.values);
                }
            } else if (annotation instanceof Query) {
                Query query = (Query) annotation;
                String value2 = query.value();
                boolean encoded = query.encoded();
                Class<?> length2 = ProcessInfoImpl.length(type);
                this.FastBitmap$CoordinateSystem = true;
                if (Iterable.class.isAssignableFrom(length2)) {
                    if (type instanceof ParameterizedType) {
                        return new initCrashLog<Iterable<T>>() {
                            /* access modifiers changed from: package-private */
                            public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                                Iterable<Object> iterable = (Iterable) obj;
                                if (iterable != null) {
                                    for (Object min : iterable) {
                                        initCrashLog.this.getMin(gettracelogger, min);
                                    }
                                }
                            }
                        };
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(length2.getSimpleName());
                    sb.append(" must include generic type (e.g., ");
                    sb.append(length2.getSimpleName());
                    sb.append("<String>)");
                    throw getMax(i, sb.toString(), new Object[0]);
                } else if (!length2.isArray()) {
                    return new initCrashLog.toFloatRange(value2, this.length.getMax(type, annotationArr), encoded);
                } else {
                    return new initCrashLog<Object>() {
                        /* access modifiers changed from: package-private */
                        public final void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                            if (obj != null) {
                                int length2 = Array.getLength(obj);
                                for (int i = 0; i < length2; i++) {
                                    initCrashLog.this.getMin(gettracelogger, Array.get(obj, i));
                                }
                            }
                        }
                    };
                }
            } else if (annotation instanceof QueryName) {
                boolean encoded2 = ((QueryName) annotation).encoded();
                Class<?> length3 = ProcessInfoImpl.length(type);
                this.FastBitmap$CoordinateSystem = true;
                if (Iterable.class.isAssignableFrom(length3)) {
                    if (type instanceof ParameterizedType) {
                        return new initCrashLog<Iterable<T>>() {
                            /* access modifiers changed from: package-private */
                            public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                                Iterable<Object> iterable = (Iterable) obj;
                                if (iterable != null) {
                                    for (Object min : iterable) {
                                        initCrashLog.this.getMin(gettracelogger, min);
                                    }
                                }
                            }
                        };
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(length3.getSimpleName());
                    sb2.append(" must include generic type (e.g., ");
                    sb2.append(length3.getSimpleName());
                    sb2.append("<String>)");
                    throw getMax(i, sb2.toString(), new Object[0]);
                } else if (!length3.isArray()) {
                    return new initCrashLog$FastBitmap$CoordinateSystem(this.length.getMax(type, annotationArr), encoded2);
                } else {
                    return new initCrashLog<Object>() {
                        /* access modifiers changed from: package-private */
                        public final void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                            if (obj != null) {
                                int length2 = Array.getLength(obj);
                                for (int i = 0; i < length2; i++) {
                                    initCrashLog.this.getMin(gettracelogger, Array.get(obj, i));
                                }
                            }
                        }
                    };
                }
            } else if (annotation instanceof QueryMap) {
                Class<?> length4 = ProcessInfoImpl.length(type);
                if (Map.class.isAssignableFrom(length4)) {
                    Type max = ProcessInfoImpl.getMax(type, length4, (Class<?>) Map.class);
                    if (max instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) max;
                        Type length5 = ProcessInfoImpl.length(0, parameterizedType);
                        if (String.class == length5) {
                            return new initCrashLog.IsOverlapping(this.length.getMax(ProcessInfoImpl.length(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
                        }
                        throw getMax(i, "@QueryMap keys must be of type String: ".concat(String.valueOf(length5)), new Object[0]);
                    }
                    throw getMax(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw getMax(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof Header) {
                String value3 = ((Header) annotation).value();
                Class<?> length6 = ProcessInfoImpl.length(type);
                if (Iterable.class.isAssignableFrom(length6)) {
                    if (type instanceof ParameterizedType) {
                        return new initCrashLog<Iterable<T>>() {
                            /* access modifiers changed from: package-private */
                            public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                                Iterable<Object> iterable = (Iterable) obj;
                                if (iterable != null) {
                                    for (Object min : iterable) {
                                        initCrashLog.this.getMin(gettracelogger, min);
                                    }
                                }
                            }
                        };
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(length6.getSimpleName());
                    sb3.append(" must include generic type (e.g., ");
                    sb3.append(length6.getSimpleName());
                    sb3.append("<String>)");
                    throw getMax(i, sb3.toString(), new Object[0]);
                } else if (!length6.isArray()) {
                    return new initCrashLog.getMin(value3, this.length.getMax(type, annotationArr));
                } else {
                    return new initCrashLog<Object>() {
                        /* access modifiers changed from: package-private */
                        public final void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                            if (obj != null) {
                                int length2 = Array.getLength(obj);
                                for (int i = 0; i < length2; i++) {
                                    initCrashLog.this.getMin(gettracelogger, Array.get(obj, i));
                                }
                            }
                        }
                    };
                }
            } else if (annotation instanceof HeaderMap) {
                Class<?> length7 = ProcessInfoImpl.length(type);
                if (Map.class.isAssignableFrom(length7)) {
                    Type max2 = ProcessInfoImpl.getMax(type, length7, (Class<?>) Map.class);
                    if (max2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) max2;
                        Type length8 = ProcessInfoImpl.length(0, parameterizedType2);
                        if (String.class == length8) {
                            return new initCrashLog.getMax(this.length.getMax(ProcessInfoImpl.length(1, parameterizedType2), annotationArr));
                        }
                        throw getMax(i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(length8)), new Object[0]);
                    }
                    throw getMax(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw getMax(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof Field) {
                if (this.hashCode) {
                    Field field = (Field) annotation;
                    String value4 = field.value();
                    boolean encoded3 = field.encoded();
                    this.toIntRange = true;
                    Class<?> length9 = ProcessInfoImpl.length(type);
                    if (Iterable.class.isAssignableFrom(length9)) {
                        if (type instanceof ParameterizedType) {
                            return new initCrashLog<Iterable<T>>() {
                                /* access modifiers changed from: package-private */
                                public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                                    Iterable<Object> iterable = (Iterable) obj;
                                    if (iterable != null) {
                                        for (Object min : iterable) {
                                            initCrashLog.this.getMin(gettracelogger, min);
                                        }
                                    }
                                }
                            };
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(length9.getSimpleName());
                        sb4.append(" must include generic type (e.g., ");
                        sb4.append(length9.getSimpleName());
                        sb4.append("<String>)");
                        throw getMax(i, sb4.toString(), new Object[0]);
                    } else if (!length9.isArray()) {
                        return new initCrashLog.setMin(value4, this.length.getMax(type, annotationArr), encoded3);
                    } else {
                        return new initCrashLog<Object>() {
                            /* access modifiers changed from: package-private */
                            public final void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                                if (obj != null) {
                                    int length2 = Array.getLength(obj);
                                    for (int i = 0; i < length2; i++) {
                                        initCrashLog.this.getMin(gettracelogger, Array.get(obj, i));
                                    }
                                }
                            }
                        };
                    }
                } else {
                    throw getMax(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof FieldMap) {
                if (this.hashCode) {
                    Class<?> length10 = ProcessInfoImpl.length(type);
                    if (Map.class.isAssignableFrom(length10)) {
                        Type max3 = ProcessInfoImpl.getMax(type, length10, (Class<?>) Map.class);
                        if (max3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) max3;
                            Type length11 = ProcessInfoImpl.length(0, parameterizedType3);
                            if (String.class == length11) {
                                LogContextImpl.AnonymousClass2 max4 = this.length.getMax(ProcessInfoImpl.length(1, parameterizedType3), annotationArr);
                                this.toIntRange = true;
                                return new initCrashLog.length(max4, ((FieldMap) annotation).encoded());
                            }
                            throw getMax(i, "@FieldMap keys must be of type String: ".concat(String.valueOf(length11)), new Object[0]);
                        }
                        throw getMax(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw getMax(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw getMax(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof Part) {
                if (this.valueOf) {
                    Part part = (Part) annotation;
                    this.IsOverlapping = true;
                    String value5 = part.value();
                    Class<?> length12 = ProcessInfoImpl.length(type);
                    if (!value5.isEmpty()) {
                        StringBuilder sb5 = new StringBuilder("form-data; name=\"");
                        sb5.append(value5);
                        sb5.append("\"");
                        Draft_75 max5 = Draft_75.setMax(HttpHeaders.CONTENT_DISPOSITION, sb5.toString(), "Content-Transfer-Encoding", part.encoding());
                        if (Iterable.class.isAssignableFrom(length12)) {
                            if (type instanceof ParameterizedType) {
                                Type length13 = ProcessInfoImpl.length(0, (ParameterizedType) type);
                                if (!createChallenge.getMax.class.isAssignableFrom(ProcessInfoImpl.length(length13))) {
                                    return new initCrashLog<Iterable<T>>() {
                                        /* access modifiers changed from: package-private */
                                        public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                                            Iterable<Object> iterable = (Iterable) obj;
                                            if (iterable != null) {
                                                for (Object min : iterable) {
                                                    initCrashLog.this.getMin(gettracelogger, min);
                                                }
                                            }
                                        }
                                    };
                                }
                                throw getMax(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(length12.getSimpleName());
                            sb6.append(" must include generic type (e.g., ");
                            sb6.append(length12.getSimpleName());
                            sb6.append("<String>)");
                            throw getMax(i, sb6.toString(), new Object[0]);
                        } else if (length12.isArray()) {
                            Class<?> max6 = getInnerTraceLogger.getMax(length12.getComponentType());
                            if (!createChallenge.getMax.class.isAssignableFrom(max6)) {
                                return new initCrashLog<Object>() {
                                    /* access modifiers changed from: package-private */
                                    public final void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                                        if (obj != null) {
                                            int length2 = Array.getLength(obj);
                                            for (int i = 0; i < length2; i++) {
                                                initCrashLog.this.getMin(gettracelogger, Array.get(obj, i));
                                            }
                                        }
                                    }
                                };
                            }
                            throw getMax(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!createChallenge.getMax.class.isAssignableFrom(length12)) {
                            return new initCrashLog.isInside(max5, this.length.setMax(type, annotationArr, this.getMax));
                        } else {
                            throw getMax(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(length12)) {
                        if (!(type instanceof ParameterizedType)) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(length12.getSimpleName());
                            sb7.append(" must include generic type (e.g., ");
                            sb7.append(length12.getSimpleName());
                            sb7.append("<String>)");
                            throw getMax(i, sb7.toString(), new Object[0]);
                        } else if (createChallenge.getMax.class.isAssignableFrom(ProcessInfoImpl.length(ProcessInfoImpl.length(0, (ParameterizedType) type)))) {
                            return new initCrashLog<Iterable<T>>() {
                                /* access modifiers changed from: package-private */
                                public final /* synthetic */ void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                                    Iterable<Object> iterable = (Iterable) obj;
                                    if (iterable != null) {
                                        for (Object min : iterable) {
                                            initCrashLog.this.getMin(gettracelogger, min);
                                        }
                                    }
                                }
                            };
                        } else {
                            throw getMax(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (length12.isArray()) {
                        if (createChallenge.getMax.class.isAssignableFrom(length12.getComponentType())) {
                            return new initCrashLog<Object>() {
                                /* access modifiers changed from: package-private */
                                public final void getMin(getTraceLogger gettracelogger, @Nullable Object obj) throws IOException {
                                    if (obj != null) {
                                        int length2 = Array.getLength(obj);
                                        for (int i = 0; i < length2; i++) {
                                            initCrashLog.this.getMin(gettracelogger, Array.get(obj, i));
                                        }
                                    }
                                }
                            };
                        }
                        throw getMax(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (createChallenge.getMax.class.isAssignableFrom(length12)) {
                        return initCrashLog.hashCode.getMin;
                    } else {
                        throw getMax(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw getMax(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof PartMap) {
                if (this.valueOf) {
                    this.IsOverlapping = true;
                    Class<?> length14 = ProcessInfoImpl.length(type);
                    if (Map.class.isAssignableFrom(length14)) {
                        Type max7 = ProcessInfoImpl.getMax(type, length14, (Class<?>) Map.class);
                        if (max7 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) max7;
                            Type length15 = ProcessInfoImpl.length(0, parameterizedType4);
                            if (String.class == length15) {
                                Type length16 = ProcessInfoImpl.length(1, parameterizedType4);
                                if (!createChallenge.getMax.class.isAssignableFrom(ProcessInfoImpl.length(length16))) {
                                    return new initCrashLog.equals(this.length.setMax(length16, annotationArr, this.getMax), ((PartMap) annotation).encoding());
                                }
                                throw getMax(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw getMax(i, "@PartMap keys must be of type String: ".concat(String.valueOf(length15)), new Object[0]);
                        }
                        throw getMax(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw getMax(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw getMax(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof Body)) {
                return null;
            } else {
                if (this.hashCode || this.valueOf) {
                    throw getMax(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.equals) {
                    try {
                        LogContextImpl.AnonymousClass2 max8 = this.length.setMax(type, annotationArr, this.getMax);
                        this.equals = true;
                        return new initCrashLog.setMax(max8);
                    } catch (RuntimeException e) {
                        Object[] objArr = {type};
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Unable to create @Body converter for %s");
                        sb8.append(" (parameter #");
                        sb8.append(i + 1);
                        sb8.append(")");
                        throw setMax(e, sb8.toString(), objArr);
                    }
                } else {
                    throw getMax(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final LogContextImpl.AnonymousClass2<NotSendableException, T> getMin() {
            Annotation[] annotations = this.setMin.getAnnotations();
            try {
                UtdidDeviceIdProvider utdidDeviceIdProvider = this.length;
                Type type = this.toFloatRange;
                ProcessInfoImpl.getMin(type, "type == null");
                ProcessInfoImpl.getMin(annotations, "annotations == null");
                int indexOf = utdidDeviceIdProvider.setMax.indexOf((Object) null) + 1;
                int size = utdidDeviceIdProvider.setMax.size();
                for (int i = indexOf; i < size; i++) {
                    LogContextImpl.AnonymousClass2<NotSendableException, ?> min = utdidDeviceIdProvider.setMax.get(i).setMin(type, annotations);
                    if (min != null) {
                        return min;
                    }
                }
                StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
                sb.append(type);
                sb.append(".\n");
                sb.append("  Tried:");
                int size2 = utdidDeviceIdProvider.setMax.size();
                while (indexOf < size2) {
                    sb.append("\n   * ");
                    sb.append(utdidDeviceIdProvider.setMax.get(indexOf).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(sb.toString());
            } catch (RuntimeException e) {
                throw setMax(e, "Unable to create converter for %s", this.toFloatRange);
            }
        }

        /* access modifiers changed from: package-private */
        public final RuntimeException setMax(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append("\n    for method ");
            sb.append(this.setMin.getDeclaringClass().getSimpleName());
            sb.append(".");
            sb.append(this.setMin.getName());
            return new IllegalArgumentException(sb.toString(), th);
        }

        /* access modifiers changed from: package-private */
        public final RuntimeException getMax(int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return setMax((Throwable) null, sb.toString(), objArr);
        }
    }

    static Set<String> getMax(String str) {
        Matcher matcher = setMin.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    static Class<?> getMax(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }
}
