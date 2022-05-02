package kotlin.test;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
final class Asserter$assertTrue$1 extends Lambda implements Function0<String> {
    final /* synthetic */ String $message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Asserter$assertTrue$1(String str) {
        super(0);
        this.$message = str;
    }

    @Nullable
    public final String invoke() {
        return this.$message;
    }
}
