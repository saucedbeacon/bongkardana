package id.dana.domain.investment;

import com.iap.ac.android.biz.common.model.ResultCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lid/dana/domain/investment/AccountInvestmentStatus;", "", "status", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "NOT_EXIST", "PROCESSING", "PRE_ACTIVE", "ACTIVE", "INACTIVE", "domain_release"}, k = 1, mv = {1, 4, 2})
public enum AccountInvestmentStatus {
    NOT_EXIST("NOT_EXIST"),
    PROCESSING(ResultCode.PROCESSING),
    PRE_ACTIVE("PRE_ACTIVE"),
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");
    
    @NotNull
    private final String status;

    private AccountInvestmentStatus(String str) {
        this.status = str;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
