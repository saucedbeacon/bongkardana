package kotlin.test;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0016J\u001c\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0016J&\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0016J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0016J&\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0016J \u0010\u000e\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00102\u0006\u0010\u0007\u001a\u00020\u0011H\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0014"}, d2 = {"Lkotlin/test/Asserter;", "", "assertEquals", "", "message", "", "expected", "actual", "assertNotEquals", "illegal", "assertNotNull", "assertNotSame", "assertNull", "assertSame", "assertTrue", "lazyMessage", "Lkotlin/Function0;", "", "fail", "", "kotlin-test"}, k = 1, mv = {1, 1, 15})
public interface Asserter {
    void assertEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2);

    void assertNotEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2);

    void assertNotNull(@Nullable String str, @Nullable Object obj);

    void assertNotSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2);

    void assertNull(@Nullable String str, @Nullable Object obj);

    void assertSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2);

    void assertTrue(@Nullable String str, boolean z);

    void assertTrue(@NotNull Function0<String> function0, boolean z);

    @NotNull
    Void fail(@Nullable String str);

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class DefaultImpls {
        public static void assertTrue(Asserter asserter, @NotNull Function0<String> function0, boolean z) {
            Intrinsics.checkParameterIsNotNull(function0, "lazyMessage");
            if (!z) {
                asserter.fail(function0.invoke());
                throw null;
            }
        }

        public static void assertTrue(Asserter asserter, @Nullable String str, boolean z) {
            asserter.assertTrue((Function0<String>) new Asserter$assertTrue$1(str), z);
        }

        public static void assertEquals(Asserter asserter, @Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
            asserter.assertTrue((Function0<String>) new Asserter$assertEquals$1(str, obj, obj2), Intrinsics.areEqual(obj2, obj));
        }

        public static void assertNotEquals(Asserter asserter, @Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
            asserter.assertTrue((Function0<String>) new Asserter$assertNotEquals$1(str, obj2), !Intrinsics.areEqual(obj2, obj));
        }

        public static void assertSame(Asserter asserter, @Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
            asserter.assertTrue((Function0<String>) new Asserter$assertSame$1(str, obj, obj2), obj2 == obj);
        }

        public static void assertNotSame(Asserter asserter, @Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
            asserter.assertTrue((Function0<String>) new Asserter$assertNotSame$1(str, obj2), obj2 != obj);
        }

        public static void assertNull(Asserter asserter, @Nullable String str, @Nullable Object obj) {
            asserter.assertTrue((Function0<String>) new Asserter$assertNull$1(str, obj), obj == null);
        }

        public static void assertNotNull(Asserter asserter, @Nullable String str, @Nullable Object obj) {
            asserter.assertTrue((Function0<String>) new Asserter$assertNotNull$1(str), obj != null);
        }
    }
}
