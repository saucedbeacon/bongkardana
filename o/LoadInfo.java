package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.sendmoney.model.PayOptionDTO;
import java.util.List;

public final class LoadInfo {
    private int getMax;
    private int getMin;
    private List<getMax> length;
    private boolean setMin;

    public LoadInfo(List<getMax> list, boolean z, int i, int i2) {
        this.length = list;
        this.setMin = z;
        this.getMax = i;
        this.getMin = i2;
    }

    public final boolean length() {
        return this.setMin;
    }

    public static class getMax {
        private List<PayOptionDTO> getMax;
        private String getMin;
        private CurrencyAmountModel setMin;

        public getMax(CurrencyAmountModel currencyAmountModel, String str, List<PayOptionDTO> list) {
            this.setMin = currencyAmountModel;
            this.getMin = str;
            this.getMax = list;
        }
    }
}
