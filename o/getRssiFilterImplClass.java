package o;

import com.iap.ac.android.common.log.ACMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lid/dana/domain/saving/model/SavingGoalWithdrawMethod;", "", "withdrawMethod", "", "enableWithdrawSaveAccount", "", "success", "errorCode", "errorMsg", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getEnableWithdrawSaveAccount", "()Z", "getErrorCode", "()Ljava/lang/String;", "getErrorMsg", "getSuccess", "getWithdrawMethod", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getRssiFilterImplClass {
    private final boolean enableWithdrawSaveAccount;
    @NotNull
    private final String errorCode;
    @NotNull
    private final String errorMsg;
    private final boolean success;
    @NotNull
    private final String withdrawMethod;

    public getRssiFilterImplClass(@NotNull String str, boolean z, boolean z2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "withdrawMethod");
        Intrinsics.checkNotNullParameter(str2, "errorCode");
        Intrinsics.checkNotNullParameter(str3, ACMonitor.EVENT_PARAM_KEY_ERROR_MSG);
        this.withdrawMethod = str;
        this.enableWithdrawSaveAccount = z;
        this.success = z2;
        this.errorCode = str2;
        this.errorMsg = str3;
    }

    @NotNull
    public final String getWithdrawMethod() {
        return this.withdrawMethod;
    }

    public final boolean getEnableWithdrawSaveAccount() {
        return this.enableWithdrawSaveAccount;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getRssiFilterImplClass(String str, boolean z, boolean z2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }
}
