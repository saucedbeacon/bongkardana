package o;

import id.dana.domain.statement.StatementType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class getDimensionPixelOffset {
    public static final /* synthetic */ int[] length;
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[StatementType.values().length];
        setMin = iArr;
        iArr[StatementType.INCOME.ordinal()] = 1;
        setMin[StatementType.EXPENSE.ordinal()] = 2;
        int[] iArr2 = new int[StatementType.values().length];
        length = iArr2;
        iArr2[StatementType.INCOME.ordinal()] = 1;
        length[StatementType.EXPENSE.ordinal()] = 2;
    }
}
