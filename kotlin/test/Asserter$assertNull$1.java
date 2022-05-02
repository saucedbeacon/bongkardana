package kotlin.test;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
final class Asserter$assertNull$1 extends Lambda implements Function0<String> {
    final /* synthetic */ Object $actual;
    final /* synthetic */ String $message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Asserter$assertNull$1(String str, Object obj) {
        super(0);
        this.$message = str;
        this.$actual = obj;
    }

    @NotNull
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(UtilsKt.messagePrefix(this.$message));
        sb.append("Expected value to be null, but was: <");
        sb.append(this.$actual);
        sb.append(">.");
        return sb.toString();
    }
}
