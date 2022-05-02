package kotlin.test;

import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¨\u0006\u0006"}, d2 = {"messagePrefix", "", "message", "overrideAsserter", "Lkotlin/test/Asserter;", "value", "kotlin-test"}, k = 2, mv = {1, 1, 15})
public final class UtilsKt {
    @NotNull
    public static final String messagePrefix(@Nullable String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(". ");
        return sb.toString();
    }

    @Nullable
    @PublishedApi
    public static final Asserter overrideAsserter(@Nullable Asserter asserter) {
        Asserter asserter2 = AssertionsKt.get_asserter();
        AssertionsKt.set_asserter(asserter);
        return asserter2;
    }
}
