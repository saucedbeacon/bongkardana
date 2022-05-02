package kotlin.test.junit;

import kotlin.Metadata;
import kotlin.test.Asserter;
import kotlin.test.AsserterContributor;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/test/junit/JUnitContributor;", "Lkotlin/test/AsserterContributor;", "()V", "hasJUnitInClassPath", "", "contribute", "Lkotlin/test/Asserter;", "kotlin-test-junit"}, k = 1, mv = {1, 1, 15})
public final class JUnitContributor implements AsserterContributor {
    private final boolean hasJUnitInClassPath;

    public JUnitContributor() {
        boolean z;
        try {
            Class.forName("o.MoneyKeyListener");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        this.hasJUnitInClassPath = z;
    }

    @Nullable
    public final Asserter contribute() {
        if (this.hasJUnitInClassPath) {
            return JUnitAsserter.INSTANCE;
        }
        return null;
    }
}
