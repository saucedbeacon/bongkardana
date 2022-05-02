package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002\u001a1\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00072\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0006H\b\u001a!\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00052\u0006\u0010\u0011\u001a\u0002H\u0010H\u0000¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\b\b\u0002\u0010\u0014\u001a\u00020\tH\u0010\u001a\u0018\u0010\u0015\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0016\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"4\u0010\u0002\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00070\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00062\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006¨\u0006\u0018"}, d2 = {"cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "throwableFields", "", "createConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", "E", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
public final class onWsHandshake {
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> getMin = new WeakHashMap<>();
    private static final ReentrantReadWriteLock setMax = new ReentrantReadWriteLock();
    private static final int setMin = length(Throwable.class, -1);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "", "it", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1 {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        @Nullable
        public final Void invoke(@NotNull Throwable th) {
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "", "it", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1 {
        public static final isInside INSTANCE = new isInside();

        isInside() {
            super(1);
        }

        @Nullable
        public final Void invoke(@NotNull Throwable th) {
            return null;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @org.jetbrains.annotations.Nullable
    public static final <E extends java.lang.Throwable> E setMax(@org.jetbrains.annotations.NotNull E r9) {
        /*
            boolean r0 = r9 instanceof o.APExpansion.ExpansionForEvent
            r1 = 0
            if (r0 == 0) goto L_0x0028
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0012 }
            o.APExpansion$ExpansionForEvent r9 = (o.APExpansion.ExpansionForEvent) r9     // Catch:{ all -> 0x0012 }
            java.lang.Throwable r9 = r9.createCopy()     // Catch:{ all -> 0x0012 }
            java.lang.Object r9 = kotlin.Result.m1constructorimpl(r9)     // Catch:{ all -> 0x0012 }
            goto L_0x001d
        L_0x0012:
            r9 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m1constructorimpl(r9)
        L_0x001d:
            boolean r0 = kotlin.Result.m7isFailureimpl(r9)
            if (r0 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = r9
        L_0x0025:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x0028:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = setMax
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r2 = getMin     // Catch:{ all -> 0x0174 }
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x0174 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0174 }
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch:{ all -> 0x0174 }
            r0.unlock()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r9 = r2.invoke(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x0049:
            int r0 = setMin
            java.lang.Class r2 = r9.getClass()
            r3 = 0
            int r2 = length(r2, r3)
            if (r0 == r2) goto L_0x00a0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = setMax
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r4 = r0.getWriteHoldCount()
            if (r4 != 0) goto L_0x0067
            int r4 = r0.getReadHoldCount()
            goto L_0x0068
        L_0x0067:
            r4 = 0
        L_0x0068:
            r5 = 0
        L_0x0069:
            if (r5 >= r4) goto L_0x0071
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x0069
        L_0x0071:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r5 = getMin     // Catch:{ all -> 0x0093 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x0093 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0093 }
            o.onWsHandshake$isInside r6 = o.onWsHandshake.isInside.INSTANCE     // Catch:{ all -> 0x0093 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0093 }
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0093 }
        L_0x0087:
            if (r3 >= r4) goto L_0x008f
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0087
        L_0x008f:
            r0.unlock()
            return r1
        L_0x0093:
            r9 = move-exception
        L_0x0094:
            if (r3 >= r4) goto L_0x009c
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0094
        L_0x009c:
            r0.unlock()
            throw r9
        L_0x00a0:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            o.onWsHandshake$setMin r2 = new o.onWsHandshake$setMin
            r2.<init>()
            java.util.Comparator r2 = (java.util.Comparator) r2
            java.util.List r0 = kotlin.collections.ArraysKt.sortedWith((T[]) r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00b8:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x011b
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.Class[] r4 = r2.getParameterTypes()
            int r5 = r4.length
            if (r5 == 0) goto L_0x0111
            r6 = 1
            if (r5 == r6) goto L_0x00ef
            r7 = 2
            if (r5 == r7) goto L_0x00d3
        L_0x00d1:
            r2 = r1
            goto L_0x0119
        L_0x00d3:
            r5 = r4[r3]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r5 == 0) goto L_0x00d1
            r4 = r4[r6]
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x00d1
            o.onWsHandshake$length r4 = new o.onWsHandshake$length
            r4.<init>(r2)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            goto L_0x0118
        L_0x00ef:
            r4 = r4[r3]
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0101
            o.onWsHandshake$getMin r4 = new o.onWsHandshake$getMin
            r4.<init>(r2)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            goto L_0x0118
        L_0x0101:
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x00d1
            o.onWsHandshake$setMax r4 = new o.onWsHandshake$setMax
            r4.<init>(r2)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            goto L_0x0118
        L_0x0111:
            o.onWsHandshake$getMax r4 = new o.onWsHandshake$getMax
            r4.<init>(r2)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
        L_0x0118:
            r2 = r4
        L_0x0119:
            if (r2 == 0) goto L_0x00b8
        L_0x011b:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = setMax
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x012c
            int r5 = r0.getReadHoldCount()
            goto L_0x012d
        L_0x012c:
            r5 = 0
        L_0x012d:
            r6 = 0
        L_0x012e:
            if (r6 >= r5) goto L_0x0136
            r4.unlock()
            int r6 = r6 + 1
            goto L_0x012e
        L_0x0136:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r6 = getMin     // Catch:{ all -> 0x0167 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x0167 }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x0167 }
            if (r2 != 0) goto L_0x014c
            o.onWsHandshake$IsOverlapping r8 = o.onWsHandshake.IsOverlapping.INSTANCE     // Catch:{ all -> 0x0167 }
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8     // Catch:{ all -> 0x0167 }
            goto L_0x014d
        L_0x014c:
            r8 = r2
        L_0x014d:
            r6.put(r7, r8)     // Catch:{ all -> 0x0167 }
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0167 }
        L_0x0152:
            if (r3 >= r5) goto L_0x015a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0152
        L_0x015a:
            r0.unlock()
            if (r2 == 0) goto L_0x0166
            java.lang.Object r9 = r2.invoke(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x0166:
            return r1
        L_0x0167:
            r9 = move-exception
        L_0x0168:
            if (r3 >= r5) goto L_0x0170
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0168
        L_0x0170:
            r0.unlock()
            throw r9
        L_0x0174:
            r9 = move-exception
            r0.unlock()
            goto L_0x017a
        L_0x0179:
            throw r9
        L_0x017a:
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onWsHandshake.setMax(java.lang.Throwable):java.lang.Throwable");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstuctorKt$safeCtor$1"}, k = 3, mv = {1, 4, 2})
    public static final class getMax extends Lambda implements Function1<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        @Nullable
        public final Throwable invoke(@NotNull Throwable th) {
            Object obj;
            try {
                Result.Companion companion = Result.Companion;
                Object newInstance = this.$constructor$inlined.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = Result.m1constructorimpl(th2);
                    if (Result.m7isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m1constructorimpl(ResultKt.createFailure(th3));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstuctorKt$safeCtor$1"}, k = 3, mv = {1, 4, 2})
    public static final class getMin extends Lambda implements Function1<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        @Nullable
        public final Throwable invoke(@NotNull Throwable th) {
            Object obj;
            try {
                Result.Companion companion = Result.Companion;
                Object newInstance = this.$constructor$inlined.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = Result.m1constructorimpl((Throwable) newInstance);
                    if (Result.m7isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m1constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstuctorKt$safeCtor$1"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function1<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        @Nullable
        public final Throwable invoke(@NotNull Throwable th) {
            Object obj;
            try {
                Result.Companion companion = Result.Companion;
                Object newInstance = this.$constructor$inlined.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = Result.m1constructorimpl((Throwable) newInstance);
                    if (Result.m7isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m1constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstuctorKt$safeCtor$1"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function1<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        @Nullable
        public final Throwable invoke(@NotNull Throwable th) {
            Object obj;
            try {
                Result.Companion companion = Result.Companion;
                Object newInstance = this.$constructor$inlined.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = Result.m1constructorimpl(th2);
                    if (Result.m7isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m1constructorimpl(ResultKt.createFailure(th3));
            }
        }
    }

    private static final int length(Class<?> cls, int i) {
        Integer num;
        Class<? super Object> superclass;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.Companion;
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            do {
                Field[] declaredFields = cls2.getDeclaredFields();
                int length2 = declaredFields.length;
                int i3 = 0;
                for (int i4 = 0; i4 < length2; i4++) {
                    if (!Modifier.isStatic(declaredFields[i4].getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                superclass = cls2.getSuperclass();
                cls2 = superclass;
            } while (superclass != null);
            num = Result.m1constructorimpl(Integer.valueOf(i2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            num = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (Result.m7isFailureimpl(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class setMin<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }
}
