package o;

import id.dana.model.CurrencyAmountModel;
import o.onDelete;

public interface parameters {

    public interface getMin extends onDelete.getMax {
        void length(Boolean bool);

        void setMax(CurrencyAmountModel currencyAmountModel);
    }

    public interface setMax extends onDelete.getMin {
        void getMax();

        void getMin();

        void length();

        void setMin();
    }
}
