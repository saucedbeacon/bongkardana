package id.dana.showcase.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.access$1402;

public class SimpleContentView extends BaseRichView {
    @BindView(2131362168)
    Button button;
    @BindView(2131362709)
    TextView description;
    private length getMin;
    private access$1402 setMax;
    @BindView(2131364837)
    TextView title;

    public interface length {
        void setMin();
    }

    public int getLayout() {
        return R.layout.view_tooltip_simple;
    }

    public SimpleContentView(@NonNull Context context, access$1402 access_1402) {
        super(context);
        setContent(access_1402);
    }

    public SimpleContentView(@NonNull Context context) {
        super(context);
    }

    public SimpleContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SimpleContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setContent(access$1402 access_1402) {
        this.setMax = access_1402;
        if (access_1402 != null) {
            this.title.setText(access_1402.setMax);
            this.description.setText(this.setMax.length);
        }
    }

    public void setOnSimpleContentActionListener(length length2) {
        this.getMin = length2;
    }

    public void setButtonText(String str) {
        this.button.setText(str);
    }

    public void setButtonContentDescription(String str) {
        this.button.setContentDescription(str);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362168})
    public void onButtonClick() {
        length length2 = this.getMin;
        if (length2 != null) {
            length2.setMin();
        }
    }
}
