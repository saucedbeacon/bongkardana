package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.resetInternal;
import o.setDpMargin;
import o.updateCornerMarking;
import o.updatePostLayout;

public class SelectedAccountView extends BaseRichView {
    private Drawable getMin;
    @BindView(2131363342)
    ImageView ivAccount;
    private String setMax;
    private String setMin;
    @BindView(2131365129)
    TextView tvBody;
    @BindView(2131365287)
    TextView tvHeader;

    public int getDefaultBankIcon() {
        return R.drawable.ic_logo_other_bank_default;
    }

    public int getLayout() {
        return R.layout.view_selected_account;
    }

    public SelectedAccountView(@NonNull Context context) {
        super(context);
    }

    public SelectedAccountView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SelectedAccountView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SelectedAccountView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, resetInternal.getMin.getViewModelStore, 0, 0);
            try {
                this.setMax = obtainStyledAttributes.getString(0);
                this.setMin = obtainStyledAttributes.getString(1);
                this.getMin = obtainStyledAttributes.getDrawable(4);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        setHeader(this.setMax);
        setBody(this.setMin);
        setImage(this.getMin);
    }

    public void setHeader(String str) {
        this.tvHeader.setText(str);
        this.tvHeader.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setBody(String str) {
        this.tvBody.setText(str);
        this.tvBody.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setImage(Drawable drawable) {
        if (drawable == null) {
            this.ivAccount.setImageResource(getDefaultBankIcon());
        } else {
            this.ivAccount.setImageDrawable(drawable);
        }
    }

    public void setBody(String str, String str2) {
        int i = 0;
        this.tvBody.setText(String.format("%s | %s", new Object[]{str2, str}));
        TextView textView = this.tvBody;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setBody(String str, int i) {
        int i2 = 0;
        this.tvBody.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.tvBody.setText(String.format(" | %s", new Object[]{str}));
        TextView textView = this.tvBody;
        if (TextUtils.isEmpty(str)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public void setImage(int i) {
        if (i == 0) {
            this.ivAccount.setImageResource(getDefaultBankIcon());
        } else {
            this.ivAccount.setImageResource(i);
        }
    }

    public void setImage(String str) {
        ((updateCornerMarking) Glide.getMax(getContext())).setMax(str).setMax(getDefaultBankIcon()).setMin((updatePostLayout<Bitmap>) new setDpMargin()).setMin(getDefaultBankIcon()).length(this.ivAccount);
    }
}
