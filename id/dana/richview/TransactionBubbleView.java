package id.dana.richview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;

public class TransactionBubbleView extends BaseRichView {
    @BindView(2131362181)
    TextView buttonMore;
    private setMax getMin;
    @BindView(2131363479)
    ImageView ivIcon;
    @BindView(2131365102)
    TextView tvAmount;
    @BindView(2131365356)
    TextView tvMessage;

    public interface setMax {
    }

    public int getLayout() {
        return R.layout.view_transaction_baloon;
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362181})
    public void onMoreButtonClicked() {
    }

    public void setup() {
    }

    public TransactionBubbleView(@NonNull Context context) {
        super(context);
    }

    public TransactionBubbleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TransactionBubbleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TransactionBubbleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setMessage(@StringRes int i) {
        this.tvMessage.setText(getContext().getResources().getString(i));
    }

    public void setIcon(@DrawableRes int i) {
        this.ivIcon.setImageDrawable(getContext().getResources().getDrawable(i));
    }

    public void setAmount(String str) {
        this.tvAmount.setText(str);
    }

    public void setAmountViewVisibility(int i) {
        if (i == 1) {
            this.tvAmount.setVisibility(0);
        } else {
            this.tvAmount.setVisibility(4);
        }
    }

    public void setMoreButtonVisibility(int i) {
        if (i == 1) {
            this.buttonMore.setVisibility(0);
        } else {
            this.buttonMore.setVisibility(4);
        }
    }

    public void setOnMoreButton(setMax setmax) {
        this.getMin = setmax;
    }
}
