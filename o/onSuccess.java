package o;

import id.dana.sendmoney.model.RecentBankModel;
import java.util.List;
import o.onDelete;

public interface onSuccess {

    public interface getMax {
        void getMax();

        void getMax(List<RecentBankModel> list);

        void getMin();

        void length(int i);

        void length(List<RecentBankModel> list);

        void setMax();

        void setMax(List<RecentBankModel> list);
    }

    public interface length extends onDelete.getMin {
        void getMax();

        void getMax(String str);

        void getMin();

        void length();
    }
}
