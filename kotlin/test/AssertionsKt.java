package kotlin.test;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlin/test/AssertionsKt__AssertionsImplKt", "kotlin/test/AssertionsKt__AssertionsKt"}, k = 4, mv = {1, 1, 15})
public final class AssertionsKt {
    public static final <T> void assertEquals(T t, T t2, @Nullable String str) {
        AssertionsKt__AssertionsKt.assertEquals(t, t2, str);
    }

    public static final void assertFalse(@Nullable String str, @NotNull Function0<Boolean> function0) {
        AssertionsKt__AssertionsKt.assertFalse(str, function0);
    }

    public static final void assertFalse(boolean z, @Nullable String str) {
        AssertionsKt__AssertionsKt.assertFalse(z, str);
    }

    public static final <T> void assertNotEquals(T t, T t2, @Nullable String str) {
        AssertionsKt__AssertionsKt.assertNotEquals(t, t2, str);
    }

    @NotNull
    public static final <T> T assertNotNull(@Nullable T t, @Nullable String str) {
        return AssertionsKt__AssertionsKt.assertNotNull(t, str);
    }

    public static final <T, R> void assertNotNull(@Nullable T t, @Nullable String str, @NotNull Function1<? super T, ? extends R> function1) {
        AssertionsKt__AssertionsKt.assertNotNull(t, str, function1);
    }

    public static final <T> void assertNotSame(T t, T t2, @Nullable String str) {
        AssertionsKt__AssertionsKt.assertNotSame(t, t2, str);
    }

    public static final void assertNull(@Nullable Object obj, @Nullable String str) {
        AssertionsKt__AssertionsKt.assertNull(obj, str);
    }

    public static final <T> void assertSame(T t, T t2, @Nullable String str) {
        AssertionsKt__AssertionsKt.assertSame(t, t2, str);
    }

    public static final void assertTrue(@Nullable String str, @NotNull Function0<Boolean> function0) {
        AssertionsKt__AssertionsKt.assertTrue(str, function0);
    }

    public static final void assertTrue(boolean z, @Nullable String str) {
        AssertionsKt__AssertionsKt.assertTrue(z, str);
    }

    @NotNull
    @PublishedApi
    public static final Throwable checkResultIsFailure(@Nullable String str, @NotNull Object obj) {
        return AssertionsKt__AssertionsKt.checkResultIsFailure(str, obj);
    }

    @NotNull
    @PublishedApi
    public static final <T extends Throwable> T checkResultIsFailure(@NotNull KClass<T> kClass, @Nullable String str, @NotNull Object obj) {
        return AssertionsKt__AssertionsImplKt.checkResultIsFailure(kClass, str, obj);
    }

    public static final <T> void expect(T t, @Nullable String str, @NotNull Function0<? extends T> function0) {
        AssertionsKt__AssertionsKt.expect(t, str, function0);
    }

    public static final <T> void expect(T t, @NotNull Function0<? extends T> function0) {
        AssertionsKt__AssertionsKt.expect(t, function0);
    }

    @NotNull
    public static final Void fail(@Nullable String str) {
        return AssertionsKt__AssertionsKt.fail(str);
    }

    @NotNull
    public static final Asserter getAsserter() {
        return AssertionsKt__AssertionsKt.getAsserter();
    }

    @Nullable
    public static final Asserter get_asserter() {
        return AssertionsKt__AssertionsKt.get_asserter();
    }

    public static final void set_asserter(@Nullable Asserter asserter) {
        AssertionsKt__AssertionsKt.set_asserter(asserter);
    }
}
