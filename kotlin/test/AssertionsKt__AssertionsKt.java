package kotlin.test;

import com.alibaba.griver.image.photo.utils.DiskFormatter;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0000\u001a2\u0010\n\u001a\u00020\u000b\"\t\b\u0000\u0010\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\f2\u0006\u0010\u000f\u001a\u0002H\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\b¢\u0006\u0002\b\u0017\u001a&\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\b¢\u0006\u0002\b\u0017\u001a4\u0010\u0018\u001a\u0002H\f\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u00142\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\b¢\u0006\u0002\u0010\u0019\u001a6\u0010\u0018\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\f0\u001b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a@\u0010\u0018\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\f0\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\b¢\u0006\u0004\b\u001c\u0010\u001e\u001a'\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020 2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0002\n\n\b\b\u0000\u001a\u0004\b\u0001\u0010\u0001\u001a \u0010\u001f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020 0\u0016\u001a2\u0010!\u001a\u00020\u000b\"\t\b\u0000\u0010\f¢\u0006\u0002\b\r2\u0006\u0010\"\u001a\u0002H\f2\u0006\u0010\u000f\u001a\u0002H\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a8\u0010#\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020$2\b\u0010\u000f\u001a\u0004\u0018\u0001H\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010%\u001aR\u0010#\u001a\u00020\u000b\"\b\b\u0000\u0010\f*\u00020$\"\u0004\b\u0001\u0010&2\b\u0010\u000f\u001a\u0004\u0018\u0001H\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H&0'\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010(\u001a2\u0010)\u001a\u00020\u000b\"\t\b\u0000\u0010\f¢\u0006\u0002\b\r2\u0006\u0010\"\u001a\u0002H\f2\u0006\u0010\u000f\u001a\u0002H\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a\u001c\u0010*\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u001a2\u0010+\u001a\u00020\u000b\"\t\b\u0000\u0010\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\f2\u0006\u0010\u000f\u001a\u0002H\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a%\u0010,\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020 2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a \u0010,\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020 0\u0016\u001a(\u0010-\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0/H\u0001ø\u0001\u0000¢\u0006\u0002\u00100\u001a,\u00101\u001a\u00020\u000b\"\t\b\u0000\u0010\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\f0\u0016¢\u0006\u0002\u00102\u001a6\u00101\u001a\u00020\u000b\"\t\b\u0000\u0010\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\f0\u0016¢\u0006\u0002\u00103\u001a\u0012\u00104\u001a\u0002052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\"&\u0010\u0000\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"_asserter", "Lkotlin/test/Asserter;", "_asserter$annotations", "()V", "get_asserter", "()Lkotlin/test/Asserter;", "set_asserter", "(Lkotlin/test/Asserter;)V", "asserter", "getAsserter", "assertEquals", "", "T", "Lkotlin/internal/OnlyInputTypes;", "expected", "actual", "message", "", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "assertFails", "", "block", "Lkotlin/Function0;", "assertFailsInline", "assertFailsWith", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "exceptionClass", "Lkotlin/reflect/KClass;", "assertFailsWithInline", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "assertFalse", "", "assertNotEquals", "illegal", "assertNotNull", "", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "R", "Lkotlin/Function1;", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "assertNotSame", "assertNull", "assertSame", "assertTrue", "checkResultIsFailure", "blockResult", "Lkotlin/Result;", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Throwable;", "expect", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "fail", "", "kotlin-test"}, k = 5, mv = {1, 1, 15}, xs = "kotlin/test/AssertionsKt")
final /* synthetic */ class AssertionsKt__AssertionsKt {
    @Nullable
    private static Asserter _asserter;

    public static /* synthetic */ void _asserter$annotations() {
    }

    @NotNull
    public static final Asserter getAsserter() {
        Asserter asserter = _asserter;
        return asserter == null ? AsserterLookupKt.lookupAsserter() : asserter;
    }

    @Nullable
    public static final Asserter get_asserter() {
        return _asserter;
    }

    public static final void set_asserter(@Nullable Asserter asserter) {
        _asserter = asserter;
    }

    public static final void assertTrue(@Nullable String str, @NotNull Function0<Boolean> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "block");
        AssertionsKt.assertTrue(function0.invoke().booleanValue(), str);
    }

    public static /* synthetic */ void assertTrue$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        AssertionsKt.assertTrue(str, (Function0<Boolean>) function0);
    }

    public static /* synthetic */ void assertTrue$default(boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        AssertionsKt.assertTrue(z, str);
    }

    public static final void assertTrue(boolean z, @Nullable String str) {
        Asserter asserter = AssertionsKt.getAsserter();
        if (str == null) {
            str = "Expected value to be true.";
        }
        asserter.assertTrue(str, z);
    }

    public static final void assertFalse(@Nullable String str, @NotNull Function0<Boolean> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "block");
        AssertionsKt.assertFalse(function0.invoke().booleanValue(), str);
    }

    public static /* synthetic */ void assertFalse$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        AssertionsKt.assertFalse(str, (Function0<Boolean>) function0);
    }

    public static /* synthetic */ void assertFalse$default(boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        AssertionsKt.assertFalse(z, str);
    }

    public static final void assertFalse(boolean z, @Nullable String str) {
        Asserter asserter = AssertionsKt.getAsserter();
        if (str == null) {
            str = "Expected value to be false.";
        }
        asserter.assertTrue(str, !z);
    }

    public static /* synthetic */ void assertEquals$default(Object obj, Object obj2, String str, int i, Object obj3) {
        if ((i & 4) != 0) {
            str = null;
        }
        AssertionsKt.assertEquals(obj, obj2, str);
    }

    public static final <T> void assertEquals(T t, T t2, @Nullable String str) {
        AssertionsKt.getAsserter().assertEquals(str, t, t2);
    }

    public static /* synthetic */ void assertNotEquals$default(Object obj, Object obj2, String str, int i, Object obj3) {
        if ((i & 4) != 0) {
            str = null;
        }
        AssertionsKt.assertNotEquals(obj, obj2, str);
    }

    public static final <T> void assertNotEquals(T t, T t2, @Nullable String str) {
        AssertionsKt.getAsserter().assertNotEquals(str, t, t2);
    }

    public static /* synthetic */ void assertSame$default(Object obj, Object obj2, String str, int i, Object obj3) {
        if ((i & 4) != 0) {
            str = null;
        }
        AssertionsKt.assertSame(obj, obj2, str);
    }

    public static final <T> void assertSame(T t, T t2, @Nullable String str) {
        AssertionsKt.getAsserter().assertSame(str, t, t2);
    }

    public static /* synthetic */ void assertNotSame$default(Object obj, Object obj2, String str, int i, Object obj3) {
        if ((i & 4) != 0) {
            str = null;
        }
        AssertionsKt.assertNotSame(obj, obj2, str);
    }

    public static final <T> void assertNotSame(T t, T t2, @Nullable String str) {
        AssertionsKt.getAsserter().assertNotSame(str, t, t2);
    }

    public static /* synthetic */ Object assertNotNull$default(Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        return AssertionsKt.assertNotNull(obj, str);
    }

    @NotNull
    public static final <T> T assertNotNull(@Nullable T t, @Nullable String str) {
        AssertionsKt.getAsserter().assertNotNull(str, t);
        if (t == null) {
            Intrinsics.throwNpe();
        }
        return t;
    }

    public static /* synthetic */ void assertNotNull$default(Object obj, String str, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        AssertionsKt.assertNotNull(obj, str, function1);
    }

    public static final <T, R> void assertNotNull(@Nullable T t, @Nullable String str, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        AssertionsKt.getAsserter().assertNotNull(str, t);
        if (t != null) {
            function1.invoke(t);
        }
    }

    public static /* synthetic */ void assertNull$default(Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        AssertionsKt.assertNull(obj, str);
    }

    public static final void assertNull(@Nullable Object obj, @Nullable String str) {
        AssertionsKt.getAsserter().assertNull(str, obj);
    }

    public static /* synthetic */ Void fail$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return AssertionsKt.fail(str);
    }

    @NotNull
    public static final Void fail(@Nullable String str) {
        AssertionsKt.getAsserter().fail(str);
        throw null;
    }

    public static final <T> void expect(T t, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "block");
        assertEquals$default(t, function0.invoke(), (String) null, 4, (Object) null);
    }

    public static final <T> void expect(T t, @Nullable String str, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "block");
        AssertionsKt.assertEquals(t, function0.invoke(), str);
    }

    @InlineOnly
    @JvmName(name = "assertFailsInline")
    private static final Throwable assertFailsInline(Function0<Unit> function0) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure((String) null, obj);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @JvmName(name = "assertFailsInline")
    private static final Throwable assertFailsInline(String str, Function0<Unit> function0) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure(str, obj);
    }

    @NotNull
    @PublishedApi
    public static final Throwable checkResultIsFailure(@Nullable String str, @NotNull Object obj) {
        Throwable r2 = Result.m4exceptionOrNullimpl(obj);
        if (r2 != null) {
            return r2;
        }
        Asserter asserter = AssertionsKt.getAsserter();
        StringBuilder sb = new StringBuilder();
        sb.append(UtilsKt.messagePrefix(str));
        sb.append("Expected an exception to be thrown, but was completed successfully.");
        asserter.fail(sb.toString());
        throw null;
    }

    @InlineOnly
    private static final /* synthetic */ <T extends Throwable> T assertFailsWith(String str, Function0<Unit> function0) {
        Object obj;
        Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Throwable.class);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure(orCreateKotlinClass, str, obj);
    }

    @InlineOnly
    @JvmName(name = "assertFailsWithInline")
    private static final <T extends Throwable> T assertFailsWithInline(KClass<T> kClass, Function0<Unit> function0) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure(kClass, (String) null, obj);
    }

    @InlineOnly
    @JvmName(name = "assertFailsWithInline")
    private static final <T extends Throwable> T assertFailsWithInline(KClass<T> kClass, String str, Function0<Unit> function0) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure(kClass, str, obj);
    }

    static /* synthetic */ Throwable assertFailsWith$default(String str, Function0 function0, int i, Object obj) {
        Object obj2;
        if ((i & 1) != 0) {
            str = null;
        }
        Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Throwable.class);
        try {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure(orCreateKotlinClass, str, obj2);
    }
}
