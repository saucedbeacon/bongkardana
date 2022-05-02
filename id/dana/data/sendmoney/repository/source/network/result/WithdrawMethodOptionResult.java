package id.dana.data.sendmoney.repository.source.network.result;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public final class WithdrawMethodOptionResult {
    private List<Object> withdrawCardOptions;
    private List<Object> withdrawChannelOptions;
    private String withdrawMethod;

    @Retention(RetentionPolicy.SOURCE)
    public @interface WithdrawMethod {
        public static final String WITHDRAW_BANKCARD = "WITHDRAW_BANKCARD";
    }

    public final List<Object> getWithdrawCardOptions() {
        return this.withdrawCardOptions;
    }

    public final void setWithdrawCardOptions(List<Object> list) {
        this.withdrawCardOptions = list;
    }

    public final List<Object> getWithdrawChannelOptions() {
        return this.withdrawChannelOptions;
    }

    public final void setWithdrawChannelOptions(List<Object> list) {
        this.withdrawChannelOptions = list;
    }

    public final String getWithdrawMethod() {
        return this.withdrawMethod;
    }

    public final void setWithdrawMethod(String str) {
        this.withdrawMethod = str;
    }
}
