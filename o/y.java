package o;

import id.dana.sendmoney.model.BankModel;
import java.util.List;
import o.onDelete;

public interface y {

    public interface setMax {
        void onGetAvailableBanksFail(String str);

        void onGetAvailableBanksSuccess(List<BankModel> list);

        void onGetSenderNameSuccess(boolean z);
    }

    public interface setMin extends onDelete.getMin {
        void getMin();
    }
}
