package o;

import android.text.TextUtils;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import java.util.Locale;
import o.NebulaLoadingView;
import o.WheelView;

public final class setLineVisible {
    public static String length(CurrencyAmountModel currencyAmountModel) {
        String str;
        if (currencyAmountModel == null || TextUtils.isEmpty(currencyAmountModel.getMax)) {
            return null;
        }
        String str2 = currencyAmountModel.getMax;
        if (currencyAmountModel.length != null) {
            str = currencyAmountModel.length;
        } else {
            str = "";
        }
        if ("IDR".equals(str)) {
            str = "Rp";
        }
        if (str2.contains(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return sb.toString();
        }
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        return NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, Integer.parseInt(str2), str);
    }
}
