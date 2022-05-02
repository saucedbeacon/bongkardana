package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lid/dana/statement/StatementConstant;", "", "()V", "EXPENSE", "", "getEXPENSE", "()Ljava/lang/String;", "INCOME", "getINCOME", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUAbsTheme {
    @NotNull
    private static final String getMax = "income";
    @NotNull
    public static final AUAbsTheme getMin = new AUAbsTheme();
    @NotNull
    private static final String setMax = "expense";

    private AUAbsTheme() {
    }

    @NotNull
    public static String setMax() {
        return getMax;
    }

    @NotNull
    public static String getMin() {
        return setMax;
    }
}
