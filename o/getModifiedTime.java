package o;

import id.dana.model.SendMoneyHomeMenuModel;
import java.util.List;
import o.onDelete;
import o.parentColumns;

public interface getModifiedTime {

    public interface getMax extends parentColumns.getMax {
        void getMin(List<SendMoneyHomeMenuModel> list);

        void length(SendMoneyHomeMenuModel sendMoneyHomeMenuModel);

        void length(Boolean bool);

        void setMax(LoadingBridgeExtension loadingBridgeExtension);
    }

    public interface getMin extends onDelete.getMin {
        void getMin();

        void length();

        void setMin();

        void setMin(List<SendMoneyHomeMenuModel> list);
    }
}
