package id.dana.openbankaccount.constant;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lid/dana/openbankaccount/constant/BankAccountProcessState;", "", "(Ljava/lang/String;I)V", "INIT", "SUBMIT", "PROCESSING", "ACKNOWLEDGE", "VERIFY", "APPROVE", "REJECT", "CONFIRM", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public enum BankAccountProcessState {
    INIT,
    SUBMIT,
    PROCESSING,
    ACKNOWLEDGE,
    VERIFY,
    APPROVE,
    REJECT,
    CONFIRM
}
