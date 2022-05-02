package kotlin.test.junit;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.test.Asserter;
import o.MoneyKeyListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0001\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lkotlin/test/junit/JUnitAsserter;", "Lkotlin/test/Asserter;", "()V", "assertEquals", "", "message", "", "expected", "", "actual", "assertNotEquals", "illegal", "assertNotNull", "assertNotSame", "assertNull", "assertSame", "fail", "", "kotlin-test-junit"}, k = 1, mv = {1, 1, 15})
public final class JUnitAsserter implements Asserter {
    public static final JUnitAsserter INSTANCE = new JUnitAsserter();

    private JUnitAsserter() {
    }

    public final void assertTrue(@Nullable String str, boolean z) {
        Asserter.DefaultImpls.assertTrue((Asserter) this, str, z);
    }

    public final void assertTrue(@NotNull Function0<String> function0, boolean z) {
        Intrinsics.checkParameterIsNotNull(function0, "lazyMessage");
        Asserter.DefaultImpls.assertTrue((Asserter) this, function0, z);
    }

    public final void assertEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        MoneyKeyListener.length(str, obj, obj2);
    }

    public final void assertNotEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        MoneyKeyListener.getMax(str, obj, obj2);
    }

    public final void assertSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        MoneyKeyListener.getMin(str, obj, obj2);
    }

    public final void assertNotSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        MoneyKeyListener.setMax(str, obj, obj2);
    }

    public final void assertNotNull(@Nullable String str, @Nullable Object obj) {
        if (str == null) {
            str = "actual value is null";
        }
        MoneyKeyListener.setMax(str, obj);
    }

    public final void assertNull(@Nullable String str, @Nullable Object obj) {
        if (str == null) {
            str = "actual value is not null";
        }
        MoneyKeyListener.setMin(str, obj);
    }

    @NotNull
    public final Void fail(@Nullable String str) {
        MoneyKeyListener.getMin(str);
        throw new AssertionError(str);
    }
}
