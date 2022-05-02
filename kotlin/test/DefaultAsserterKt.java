package kotlin.test;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007¨\u0006\u0002"}, d2 = {"DefaultAsserter", "Lkotlin/test/DefaultAsserter;", "kotlin-test"}, k = 2, mv = {1, 1, 15})
public final class DefaultAsserterKt {
    @NotNull
    @Deprecated(message = "DefaultAsserter is an object now, constructor call is not required anymore", replaceWith = @ReplaceWith(expression = "DefaultAsserter", imports = {"kotlin.test.DefaultAsserter"}))
    public static final DefaultAsserter DefaultAsserter() {
        return DefaultAsserter.INSTANCE;
    }
}
