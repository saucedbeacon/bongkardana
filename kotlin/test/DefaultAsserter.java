package kotlin.test;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.test.Asserter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlin/test/DefaultAsserter;", "Lkotlin/test/Asserter;", "()V", "fail", "", "message", "", "kotlin-test"}, k = 1, mv = {1, 1, 15})
public final class DefaultAsserter implements Asserter {
    public static final DefaultAsserter INSTANCE = new DefaultAsserter();

    private DefaultAsserter() {
    }

    public final void assertEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        Asserter.DefaultImpls.assertEquals(this, str, obj, obj2);
    }

    public final void assertNotEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        Asserter.DefaultImpls.assertNotEquals(this, str, obj, obj2);
    }

    public final void assertNotNull(@Nullable String str, @Nullable Object obj) {
        Asserter.DefaultImpls.assertNotNull(this, str, obj);
    }

    public final void assertNotSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        Asserter.DefaultImpls.assertNotSame(this, str, obj, obj2);
    }

    public final void assertNull(@Nullable String str, @Nullable Object obj) {
        Asserter.DefaultImpls.assertNull(this, str, obj);
    }

    public final void assertSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        Asserter.DefaultImpls.assertSame(this, str, obj, obj2);
    }

    public final void assertTrue(@Nullable String str, boolean z) {
        Asserter.DefaultImpls.assertTrue((Asserter) this, str, z);
    }

    public final void assertTrue(@NotNull Function0<String> function0, boolean z) {
        Intrinsics.checkParameterIsNotNull(function0, "lazyMessage");
        Asserter.DefaultImpls.assertTrue((Asserter) this, function0, z);
    }

    @NotNull
    public final Void fail(@Nullable String str) {
        if (str == null) {
            throw new AssertionError();
        }
        throw new AssertionError(str);
    }
}
