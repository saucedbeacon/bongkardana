package id.dana.data.bank;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid/dana/data/bank/UserBankExistException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UserBankExistException extends Exception {
    public UserBankExistException() {
        super("User bank is exist");
    }
}
