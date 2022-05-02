package id.dana.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class BaseRichView extends FrameLayout {
    private View length;

    public abstract int getLayout();

    /* access modifiers changed from: protected */
    public void onInjectedView(View view) {
    }

    /* access modifiers changed from: protected */
    public void parseAttrs(Context context, AttributeSet attributeSet) {
    }

    public abstract void setup();

    public BaseRichView(@NonNull Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public BaseRichView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public BaseRichView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    @TargetApi(21)
    public BaseRichView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void init(Context context, AttributeSet attributeSet) {
        parseAttrs(context, attributeSet);
        View inflate = View.inflate(context, getLayout(), this);
        this.length = inflate;
        onInjectedView(inflate);
        setup();
    }
}
