package o;

import id.dana.domain.statement.StatementType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class index {
    public static final /* synthetic */ int[] getMax;

    static {
        int[] iArr = new int[StatementType.values().length];
        getMax = iArr;
        iArr[StatementType.INCOME.ordinal()] = 1;
        getMax[StatementType.EXPENSE.ordinal()] = 2;
    }
}
