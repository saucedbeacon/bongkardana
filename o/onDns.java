package o;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0004H\bJ1\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u001e0!H\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "()V", "PREFIX", "", "createInstanceOf", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "Ljava/lang/Class;", "serviceClass", "getProviderInstance", "S", "name", "loader", "Ljava/lang/ClassLoader;", "service", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "load", "", "loadMainDispatcherFactory", "loadMainDispatcherFactory$kotlinx_coroutines_core", "loadProviders", "loadProviders$kotlinx_coroutines_core", "parse", "url", "Ljava/net/URL;", "parseFile", "r", "Ljava/io/BufferedReader;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class onDns {
    private static int equals = 1;
    private static char getMax;
    private static char getMin;
    private static char length;
    @NotNull
    public static final onDns setMax = new onDns();
    private static char setMin;
    private static int toFloatRange;

    static void setMin() {
        getMin = 21365;
        getMax = 29449;
        setMin = 34423;
        length = 1858;
    }

    static {
        setMin();
        int i = toFloatRange + 51;
        equals = i % 128;
        if ((i % 2 == 0 ? '9' : 14) != 14) {
            int i2 = 99 / 0;
        }
    }

    private onDns() {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        kotlin.ExceptionsKt.addSuppressed(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c6, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.String> getMin(java.net.URL r9) {
        /*
            java.lang.String r0 = r9.toString()
            r1 = 0
            r2 = 2
            r3 = 0
            java.lang.String r4 = "jar"
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r0, r4, r1, r2, r3)
            r5 = 1
            if (r4 == 0) goto L_0x0092
            java.lang.String r9 = "jar:file:"
            java.lang.String r9 = kotlin.text.StringsKt.substringAfter$default((java.lang.String) r0, (java.lang.String) r9, (java.lang.String) r3, (int) r2, (java.lang.Object) r3)
            r4 = 33
            java.lang.String r9 = kotlin.text.StringsKt.substringBefore$default((java.lang.String) r9, (char) r4, (java.lang.String) r3, (int) r2, (java.lang.Object) r3)
            java.lang.String r4 = "!/"
            java.lang.String r0 = kotlin.text.StringsKt.substringAfter$default((java.lang.String) r0, (java.lang.String) r4, (java.lang.String) r3, (int) r2, (java.lang.Object) r3)
            java.util.jar.JarFile r4 = new java.util.jar.JarFile
            r4.<init>(r9, r1)
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ all -> 0x0086 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0086 }
            java.util.zip.ZipEntry r7 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0086 }
            r7.<init>(r0)     // Catch:{ all -> 0x0086 }
            java.io.InputStream r0 = r4.getInputStream(r7)     // Catch:{ all -> 0x0086 }
            r7 = 6
            char[] r7 = new char[r7]     // Catch:{ all -> 0x0086 }
            r8 = 53459(0xd0d3, float:7.4912E-41)
            r7[r1] = r8     // Catch:{ all -> 0x0086 }
            r1 = 11927(0x2e97, float:1.6713E-41)
            r7[r5] = r1     // Catch:{ all -> 0x0086 }
            r1 = 20064(0x4e60, float:2.8116E-41)
            r7[r2] = r1     // Catch:{ all -> 0x0086 }
            r1 = 3
            r5 = 21165(0x52ad, float:2.9658E-41)
            r7[r1] = r5     // Catch:{ all -> 0x0086 }
            r1 = 4
            r5 = 1235(0x4d3, float:1.73E-42)
            r7[r1] = r5     // Catch:{ all -> 0x0086 }
            r1 = 5
            r5 = 49983(0xc33f, float:7.0041E-41)
            r7[r1] = r5     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = getMin((char[]) r7)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = r1.intern()     // Catch:{ all -> 0x0086 }
            r6.<init>(r0, r1)     // Catch:{ all -> 0x0086 }
            java.io.Reader r6 = (java.io.Reader) r6     // Catch:{ all -> 0x0086 }
            r9.<init>(r6)     // Catch:{ all -> 0x0086 }
            java.io.Closeable r9 = (java.io.Closeable) r9     // Catch:{ all -> 0x0086 }
            r0 = r9
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x007f }
            java.util.List r0 = length(r0)     // Catch:{ all -> 0x007f }
            kotlin.io.CloseableKt.closeFinally(r9, r3)     // Catch:{ all -> 0x0086 }
            r4.close()     // Catch:{ all -> 0x007d }
            int r9 = equals
            int r9 = r9 + 35
            int r1 = r9 % 128
            toFloatRange = r1
            int r9 = r9 % r2
            return r0
        L_0x007d:
            r9 = move-exception
            throw r9
        L_0x007f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r9, r0)     // Catch:{ all -> 0x0086 }
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x008d }
            throw r0
        L_0x008d:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r9, r0)
            throw r9
        L_0x0092:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.io.InputStream r9 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r9)
            r4.<init>(r9)
            java.io.Reader r4 = (java.io.Reader) r4
            r0.<init>(r4)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r9 = r0
            java.io.BufferedReader r9 = (java.io.BufferedReader) r9     // Catch:{ all -> 0x00c3 }
            java.util.List r9 = length(r9)     // Catch:{ all -> 0x00c3 }
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            int r0 = toFloatRange
            int r0 = r0 + 107
            int r4 = r0 % 128
            equals = r4
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x00ba
            r1 = 1
        L_0x00ba:
            if (r1 == 0) goto L_0x00c2
            super.hashCode()     // Catch:{ all -> 0x00c0 }
            return r9
        L_0x00c0:
            r9 = move-exception
            throw r9
        L_0x00c2:
            return r9
        L_0x00c3:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onDns.getMin(java.net.URL):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079 A[LOOP:1: B:21:0x004f->B:39:0x0079, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0077 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.String> length(java.io.BufferedReader r9) {
        /*
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = (java.util.Set) r0
        L_0x0007:
            java.lang.String r1 = r9.readLine()
            r2 = 84
            if (r1 != 0) goto L_0x0012
            r3 = 76
            goto L_0x0014
        L_0x0012:
            r3 = 84
        L_0x0014:
            r4 = 0
            r5 = 2
            if (r3 == r2) goto L_0x002e
            int r9 = equals
            int r9 = r9 + 93
            int r1 = r9 % 128
            toFloatRange = r1
            int r9 = r9 % r5
            if (r9 == 0) goto L_0x0027
            int r9 = r4.length     // Catch:{ all -> 0x0025 }
            goto L_0x0027
        L_0x0025:
            r9 = move-exception
            throw r9
        L_0x0027:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r9 = kotlin.collections.CollectionsKt.toList(r0)
            return r9
        L_0x002e:
            java.lang.String r2 = "#"
            java.lang.String r1 = kotlin.text.StringsKt.substringBefore$default((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r4, (int) r5, (java.lang.Object) r4)
            if (r1 == 0) goto L_0x00b7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r1)
            java.lang.String r1 = r1.toString()
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r3 = toFloatRange     // Catch:{ Exception -> 0x00b5 }
            int r3 = r3 + 93
            int r4 = r3 % 128
            equals = r4     // Catch:{ Exception -> 0x00b5 }
            int r3 = r3 % 2
            r3 = 0
            r4 = 0
        L_0x004f:
            int r6 = r2.length()
            r7 = 1
            if (r4 >= r6) goto L_0x0058
            r6 = 0
            goto L_0x0059
        L_0x0058:
            r6 = 1
        L_0x0059:
            if (r6 == r7) goto L_0x007c
            char r6 = r2.charAt(r4)     // Catch:{ Exception -> 0x00b5 }
            r8 = 46
            if (r6 == r8) goto L_0x0074
            boolean r6 = java.lang.Character.isJavaIdentifierPart(r6)
            r8 = 41
            if (r6 == 0) goto L_0x006e
            r6 = 41
            goto L_0x0070
        L_0x006e:
            r6 = 9
        L_0x0070:
            if (r6 == r8) goto L_0x0074
            r6 = 0
            goto L_0x0075
        L_0x0074:
            r6 = 1
        L_0x0075:
            if (r6 != 0) goto L_0x0079
            r4 = 0
            goto L_0x0086
        L_0x0079:
            int r4 = r4 + 1
            goto L_0x004f
        L_0x007c:
            int r4 = equals
            int r4 = r4 + 73
            int r6 = r4 % 128
            toFloatRange = r6
            int r4 = r4 % r5
            r4 = 1
        L_0x0086:
            if (r4 == 0) goto L_0x009f
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x008f
            r3 = 1
        L_0x008f:
            r2 = 32
            if (r3 == 0) goto L_0x0096
            r3 = 64
            goto L_0x0098
        L_0x0096:
            r3 = 32
        L_0x0098:
            if (r3 == r2) goto L_0x0007
            r0.add(r1)
            goto L_0x0007
        L_0x009f:
            java.lang.String r9 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Illegal service provider class name: "
            java.lang.String r9 = r0.concat(r9)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00b5:
            r9 = move-exception
            throw r9
        L_0x00b7:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r9.<init>(r0)
            goto L_0x00c0
        L_0x00bf:
            throw r9
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onDns.length(java.io.BufferedReader):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.internal.MainDispatcherFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.internal.MainDispatcherFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.internal.MainDispatcherFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: kotlinx.coroutines.internal.MainDispatcherFactory} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if ((!o.startConnectionTimer.length() ? 12 : '.') != 12) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008d, code lost:
        r0 = setMax(r0, r0.getClassLoader());
        r3 = toFloatRange + 17;
        equals = r3 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
        if ((r3 % 2) != 0) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        r3 = 'S';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        r3 = 'E';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        if (r3 == 'S') goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a9, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r3 == false) goto L_0x008d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> length() {
        /*
            int r0 = toFloatRange
            int r0 = r0 + 91
            int r1 = r0 % 128
            equals = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            if (r0 != 0) goto L_0x001c
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            boolean r3 = o.startConnectionTimer.length()
            super.hashCode()     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x002d
            goto L_0x008d
        L_0x001a:
            r0 = move-exception
            throw r0
        L_0x001c:
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            boolean r3 = o.startConnectionTimer.length()     // Catch:{ Exception -> 0x00ae }
            r4 = 12
            if (r3 != 0) goto L_0x0029
            r3 = 12
            goto L_0x002b
        L_0x0029:
            r3 = 46
        L_0x002b:
            if (r3 == r4) goto L_0x008d
        L_0x002d:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0084 }
            r3.<init>(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r4 = 1
            r5 = 0
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.Class r1 = java.lang.Class.forName(r1, r4, r6)     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.Object r1 = r1.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.Object r1 = r0.cast(r1)     // Catch:{ ClassNotFoundException -> 0x0051 }
            kotlinx.coroutines.internal.MainDispatcherFactory r1 = (kotlinx.coroutines.internal.MainDispatcherFactory) r1     // Catch:{ ClassNotFoundException -> 0x0051 }
            goto L_0x0052
        L_0x0051:
            r1 = r2
        L_0x0052:
            if (r1 == 0) goto L_0x0056
            r6 = 1
            goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            if (r6 == r4) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            r3.add(r1)     // Catch:{ all -> 0x0084 }
        L_0x005d:
            java.lang.String r1 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x007b }
            java.lang.Class r1 = java.lang.Class.forName(r1, r4, r6)     // Catch:{ ClassNotFoundException -> 0x007b }
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x007b }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x007b }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x007b }
            java.lang.Object r1 = r1.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x007b }
            java.lang.Object r1 = r0.cast(r1)     // Catch:{ ClassNotFoundException -> 0x007b }
            kotlinx.coroutines.internal.MainDispatcherFactory r1 = (kotlinx.coroutines.internal.MainDispatcherFactory) r1     // Catch:{ ClassNotFoundException -> 0x007b }
            r2 = r1
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            if (r2 == 0) goto L_0x0081
            r3.add(r2)     // Catch:{ all -> 0x0084 }
        L_0x0081:
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0084 }
            goto L_0x008c
        L_0x0084:
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.List r3 = setMax(r0, r1)
        L_0x008c:
            return r3
        L_0x008d:
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.util.List r0 = setMax(r0, r3)
            int r3 = toFloatRange
            int r3 = r3 + 17
            int r4 = r3 % 128
            equals = r4
            int r3 = r3 % r1
            r1 = 83
            if (r3 != 0) goto L_0x00a5
            r3 = 83
            goto L_0x00a7
        L_0x00a5:
            r3 = 69
        L_0x00a7:
            if (r3 == r1) goto L_0x00aa
            return r0
        L_0x00aa:
            int r1 = r2.length     // Catch:{ all -> 0x00ac }
            return r0
        L_0x00ac:
            r0 = move-exception
            throw r0
        L_0x00ae:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onDns.length():java.util.List");
    }

    private static <S> List<S> setMax(Class<S> cls, ClassLoader classLoader) {
        boolean z;
        try {
            StringBuilder sb = new StringBuilder("META-INF/services/");
            sb.append(cls.getName());
            ArrayList<T> list = Collections.list(classLoader.getResources(sb.toString()));
            Intrinsics.checkNotNullExpressionValue(list, "java.util.Collections.list(this)");
            Collection arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                z = true;
                if (!(it.hasNext())) {
                    break;
                }
                CollectionsKt.addAll(arrayList, getMin((URL) it.next()));
            }
            Set set = CollectionsKt.toSet((List) arrayList);
            if (!set.isEmpty()) {
                try {
                    int i = equals + 75;
                    try {
                        toFloatRange = i % 128;
                        int i2 = i % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                z = false;
            }
            if (z) {
                Iterable iterable = set;
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (true) {
                    if ((it2.hasNext() ? '*' : 'S') != '*') {
                        List<S> list2 = (List) arrayList2;
                        int i3 = toFloatRange + 79;
                        equals = i3 % 128;
                        int i4 = i3 % 2;
                        return list2;
                    }
                    Class<?> cls2 = Class.forName((String) it2.next(), false, classLoader);
                    if (cls.isAssignableFrom(cls2)) {
                        arrayList2.add(cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                    } else {
                        StringBuilder sb2 = new StringBuilder("Expected service of class ");
                        sb2.append(cls);
                        sb2.append(", but found ");
                        sb2.append(cls2);
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
            } else {
                throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
            }
        } catch (Throwable unused) {
            return CollectionsKt.toList(ServiceLoader.load(cls, classLoader));
        }
    }

    private static String getMin(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        try {
            int i = equals + 99;
            try {
                toFloatRange = i % 128;
                int i2 = i % 2;
                int i3 = 0;
                while (true) {
                    if (!(i3 < cArr.length)) {
                        return new String(cArr2, 1, cArr2[0]);
                    }
                    cArr3[0] = cArr[i3];
                    int i4 = i3 + 1;
                    cArr3[1] = cArr[i4];
                    onActivityPostCreated.setMax(cArr3, getMin, length, getMax, setMin);
                    cArr2[i3] = cArr3[0];
                    cArr2[i4] = cArr3[1];
                    i3 += 2;
                    int i5 = toFloatRange + 63;
                    equals = i5 % 128;
                    int i6 = i5 % 2;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
