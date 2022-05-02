package id.dana.richview.splitbill;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.CurrencyTextView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AmountDisplayView extends BaseRichView {
    @BindView(2131362055)
    Button btnChange;
    @BindView(2131362612)
    CurrencyTextView ctvAmount;
    private getMin length;
    @BindView(2131365511)
    TextView tvRemainingAmount;

    public interface getMin {
        void length();
    }

    public int getLayout() {
        return R.layout.view_amount_display;
    }

    public void setup() {
    }

    public AmountDisplayView(@NonNull Context context) {
        super(context);
    }

    public AmountDisplayView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AmountDisplayView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSingleClick() {
        setOnClickListener(getSingleItemClickListener());
        this.btnChange.setOnClickListener(getSingleItemClickListener());
    }

    public void onSingleClick(View view) {
        this.length.length();
    }

    public String getAmount() {
        return this.ctvAmount.getAmount();
    }

    public void setAmountText(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1992701957, oncanceled);
            onCancelLoad.getMin(1992701957, oncanceled);
        }
        this.ctvAmount.setText(str);
    }

    public void setAmountRemain(boolean z) {
        setAmountRemain(z, (String) null);
    }

    public void setAmountRemain(boolean z, String str) {
        this.tvRemainingAmount.setVisibility(z ? 0 : 8);
        if (!TextUtils.isEmpty(str)) {
            this.tvRemainingAmount.setText(str);
        }
    }

    public boolean isAnyAmountRemain() {
        return this.tvRemainingAmount.getVisibility() == 0 && this.tvRemainingAmount.getText().toString().contains(getContext().getString(R.string.split_bill_zero_amount_message));
    }

    public void setOnAmountClickListener(getMin getmin) {
        this.length = getmin;
    }
}
