package o;

import com.google.firebase.perf.FirebasePerformance;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.LogContextImpl;
import o.checkAlloc;
import o.getInnerTraceLogger;
import o.setAppLogAppendWorker;
import retrofit2.Retrofit$1;
import retrofit2.http.DELETE;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public final class UtdidDeviceIdProvider {
    final checkAlloc.getMin getMax;
    final List<LogContextImpl.AppendWorker.setMin> getMin;
    final Draft_76 length;
    final List<LogContextImpl.AnonymousClass2.getMax> setMax;
    @Nullable
    final Executor setMin;
    private final Map<Method, getInnerTraceLogger<?, ?>> toFloatRange = new ConcurrentHashMap();
    final boolean toIntRange;

    UtdidDeviceIdProvider(checkAlloc.getMin getmin, Draft_76 draft_76, List<LogContextImpl.AnonymousClass2.getMax> list, List<LogContextImpl.AppendWorker.setMin> list2, @Nullable Executor executor, boolean z) {
        this.getMax = getmin;
        this.length = draft_76;
        this.setMax = list;
        this.getMin = list2;
        this.setMin = executor;
        this.toIntRange = z;
    }

    public final <T> T setMin(Class<T> cls) {
        ProcessInfoImpl.length(cls);
        if (this.toIntRange) {
            getMax(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Retrofit$1(this, cls));
    }

    private void getMax(Class<?> cls) {
        getProcessInfo max = getProcessInfo.setMax();
        for (Method method : cls.getDeclaredMethods()) {
            if (!max.getMin(method)) {
                setMin(method);
            }
        }
    }

    public final getInnerTraceLogger<?, ?> setMin(Method method) {
        getInnerTraceLogger<?, ?> getinnertracelogger;
        getInnerTraceLogger<?, ?> getinnertracelogger2 = this.toFloatRange.get(method);
        if (getinnertracelogger2 != null) {
            return getinnertracelogger2;
        }
        synchronized (this.toFloatRange) {
            getinnertracelogger = this.toFloatRange.get(method);
            if (getinnertracelogger == null) {
                getInnerTraceLogger.setMax setmax = new getInnerTraceLogger.setMax(this, method);
                setmax.b = setmax.setMin();
                setmax.toFloatRange = setmax.b.getMin();
                if (setmax.toFloatRange == getAppenderManager.class || setmax.toFloatRange == InvalidHandshakeException.class) {
                    StringBuilder sb = new StringBuilder("'");
                    sb.append(ProcessInfoImpl.length(setmax.toFloatRange).getName());
                    sb.append("' is not a valid response body type. Did you mean ResponseBody?");
                    throw setmax.setMax((Throwable) null, sb.toString(), new Object[0]);
                }
                setmax.create = setmax.getMin();
                for (Annotation annotation : setmax.getMax) {
                    if (annotation instanceof DELETE) {
                        setmax.length(FirebasePerformance.HttpMethod.DELETE, ((DELETE) annotation).value(), false);
                    } else if (annotation instanceof GET) {
                        setmax.length("GET", ((GET) annotation).value(), false);
                    } else if (annotation instanceof HEAD) {
                        setmax.length(FirebasePerformance.HttpMethod.HEAD, ((HEAD) annotation).value(), false);
                        if (!Void.class.equals(setmax.toFloatRange)) {
                            throw setmax.setMax((Throwable) null, "HEAD method must use Void as response type.", new Object[0]);
                        }
                    } else if (annotation instanceof PATCH) {
                        setmax.length(FirebasePerformance.HttpMethod.PATCH, ((PATCH) annotation).value(), true);
                    } else if (annotation instanceof POST) {
                        setmax.length("POST", ((POST) annotation).value(), true);
                    } else if (annotation instanceof PUT) {
                        setmax.length(FirebasePerformance.HttpMethod.PUT, ((PUT) annotation).value(), true);
                    } else if (annotation instanceof OPTIONS) {
                        setmax.length(FirebasePerformance.HttpMethod.OPTIONS, ((OPTIONS) annotation).value(), false);
                    } else if (annotation instanceof HTTP) {
                        HTTP http = (HTTP) annotation;
                        setmax.length(http.method(), http.path(), http.hasBody());
                    } else if (annotation instanceof Headers) {
                        String[] value = ((Headers) annotation).value();
                        if (value.length != 0) {
                            setmax.Grayscale$Algorithm = setmax.setMin(value);
                        } else {
                            throw setmax.setMax((Throwable) null, "@Headers annotation is empty.", new Object[0]);
                        }
                    } else if (annotation instanceof Multipart) {
                        if (!setmax.hashCode) {
                            setmax.valueOf = true;
                        } else {
                            throw setmax.setMax((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                    } else if (!(annotation instanceof FormUrlEncoded)) {
                        continue;
                    } else if (!setmax.valueOf) {
                        setmax.hashCode = true;
                    } else {
                        throw setmax.setMax((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                }
                if (setmax.values != null) {
                    if (!setmax.toDoubleRange) {
                        if (setmax.valueOf) {
                            throw setmax.setMax((Throwable) null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        } else if (setmax.hashCode) {
                            throw setmax.setMax((Throwable) null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    int length2 = setmax.setMax.length;
                    setmax.onNavigationEvent = new initCrashLog[length2];
                    int i = 0;
                    while (i < length2) {
                        Type type = setmax.getMin[i];
                        if (!ProcessInfoImpl.setMax(type)) {
                            Annotation[] annotationArr = setmax.setMax[i];
                            if (annotationArr != null) {
                                setmax.onNavigationEvent[i] = setmax.getMax(i, type, annotationArr);
                                i++;
                            } else {
                                throw setmax.getMax(i, "No Retrofit annotation found.", new Object[0]);
                            }
                        } else {
                            throw setmax.getMax(i, "Parameter type must not include a type variable or wildcard: %s", type);
                        }
                    }
                    if (setmax.invoke == null) {
                        if (!setmax.toString) {
                            throw setmax.setMax((Throwable) null, "Missing either @%s URL or @Url parameter.", setmax.values);
                        }
                    }
                    if (!setmax.hashCode && !setmax.valueOf && !setmax.toDoubleRange) {
                        if (setmax.equals) {
                            throw setmax.setMax((Throwable) null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                        }
                    }
                    if (setmax.hashCode) {
                        if (!setmax.toIntRange) {
                            throw setmax.setMax((Throwable) null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                        }
                    }
                    if (setmax.valueOf) {
                        if (!setmax.IsOverlapping) {
                            throw setmax.setMax((Throwable) null, "Multipart method must contain at least one @Part.", new Object[0]);
                        }
                    }
                    getInnerTraceLogger<?, ?> getinnertracelogger3 = new getInnerTraceLogger<>(setmax);
                    this.toFloatRange.put(method, getinnertracelogger3);
                    getinnertracelogger = getinnertracelogger3;
                } else {
                    throw setmax.setMax((Throwable) null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
            }
        }
        return getinnertracelogger;
    }

    public final <T> LogContextImpl.AnonymousClass2<T, String> getMax(Type type, Annotation[] annotationArr) {
        ProcessInfoImpl.getMin(type, "type == null");
        ProcessInfoImpl.getMin(annotationArr, "annotations == null");
        int size = this.setMax.size();
        for (int i = 0; i < size; i++) {
            this.setMax.get(i);
        }
        return setAppLogAppendWorker.length.getMin;
    }

    public static final class getMin {
        private boolean equals;
        public final List<LogContextImpl.AppendWorker.setMin> getMax;
        private final getProcessInfo getMin;
        private Draft_76 length;
        public final List<LogContextImpl.AnonymousClass2.getMax> setMax;
        @Nullable
        public checkAlloc.getMin setMin;
        @Nullable
        private Executor toFloatRange;

        private getMin(getProcessInfo getprocessinfo) {
            this.setMax = new ArrayList();
            this.getMax = new ArrayList();
            this.getMin = getprocessinfo;
        }

        public getMin() {
            this(getProcessInfo.setMax());
        }

        public final getMin setMax(String str) {
            ProcessInfoImpl.getMin(str, "baseUrl == null");
            Draft_76 min = Draft_76.setMin(str);
            if (min != null) {
                return setMin(min);
            }
            throw new IllegalArgumentException("Illegal URL: ".concat(String.valueOf(str)));
        }

        private getMin setMin(Draft_76 draft_76) {
            ProcessInfoImpl.getMin(draft_76, "baseUrl == null");
            List<String> list = draft_76.getMax;
            if ("".equals(list.get(list.size() - 1))) {
                this.length = draft_76;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: ".concat(String.valueOf(draft_76)));
        }

        public final UtdidDeviceIdProvider getMax() {
            if (this.length != null) {
                checkAlloc.getMin getmin = this.setMin;
                if (getmin == null) {
                    getmin = new generateKey();
                }
                checkAlloc.getMin getmin2 = getmin;
                Executor executor = this.toFloatRange;
                if (executor == null) {
                    executor = this.getMin.getMin();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.getMax);
                arrayList.add(this.getMin.getMin(executor2));
                ArrayList arrayList2 = new ArrayList(this.setMax.size() + 1);
                arrayList2.add(new setAppLogAppendWorker());
                arrayList2.addAll(this.setMax);
                return new UtdidDeviceIdProvider(getmin2, this.length, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.equals);
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    public final <T> LogContextImpl.AnonymousClass2<T, getPart> setMax(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        ProcessInfoImpl.getMin(type, "type == null");
        ProcessInfoImpl.getMin(annotationArr, "parameterAnnotations == null");
        ProcessInfoImpl.getMin(annotationArr2, "methodAnnotations == null");
        int indexOf = this.setMax.indexOf((Object) null) + 1;
        int size = this.setMax.size();
        for (int i = indexOf; i < size; i++) {
            LogContextImpl.AnonymousClass2<?, getPart> length2 = this.setMax.get(i).length(type);
            if (length2 != null) {
                return length2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.setMax.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.setMax.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
