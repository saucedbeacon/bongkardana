package o;

import android.text.TextUtils;
import id.dana.model.CurrencyAmountModel;
import id.dana.sendmoney.model.PayOptionDTO;
import java.util.List;

public final class CloudConfig {
    public String IsOverlapping;
    public String equals;
    public String getMax;
    public String getMin;
    public CurrencyAmountModel isInside;
    public String length;
    public List<PayOptionDTO> setMax;
    public String setMin;
    public CurrencyAmountModel toFloatRange;
    public String toIntRange;

    public final boolean setMax() {
        return !TextUtils.isEmpty(this.IsOverlapping);
    }
}
