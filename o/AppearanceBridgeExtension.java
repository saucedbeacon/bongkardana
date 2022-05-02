package o;

import id.dana.domain.investment.AccountInvestmentStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class AppearanceBridgeExtension {
    public static final /* synthetic */ int[] getMax;

    static {
        int[] iArr = new int[AccountInvestmentStatus.values().length];
        getMax = iArr;
        iArr[AccountInvestmentStatus.NOT_EXIST.ordinal()] = 1;
    }
}
