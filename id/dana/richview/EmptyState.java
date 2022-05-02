package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.IntRange;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;

public class EmptyState extends BaseRichView {
    @BindView(2131362040)
    Button btnAction;
    private Drawable getMax;
    private String getMin;
    @BindView(2131363492)
    ImageView ivEmptyState;
    private String length;
    private String setMax;
    private boolean setMin;
    @BindView(2131365357)
    TextView tvMessage;
    @BindView(2131365614)
    TextView tvTitle;

    public int getLayout() {
        return R.layout.view_empty_state;
    }

    public EmptyState(@NonNull Context context) {
        super(context);
    }

    public EmptyState(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyState(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EmptyState(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(1893081348, oncanceled);
            onCancelLoad.getMin(1893081348, oncanceled);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.MediaBrowserCompat$SearchResultReceiver);
            try {
                this.getMax = IntRange.length(getContext(), obtainStyledAttributes.getResourceId(1, -1));
                this.setMax = obtainStyledAttributes.getString(3);
                this.length = obtainStyledAttributes.getString(2);
                this.getMin = obtainStyledAttributes.getString(0);
                this.setMin = obtainStyledAttributes.getBoolean(4, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        setIcon(this.getMax);
        setTitle(this.setMax, this.setMin);
        setMessage(this.length);
        if (setMax(this.getMin)) {
            setAction(this.getMin);
        }
    }

    public void setIcon(Drawable drawable) {
        this.ivEmptyState.setImageDrawable(drawable);
    }

    public void setTitle(String str, boolean z) {
        if (z) {
            this.tvTitle.setTypeface(Typeface.defaultFromStyle(1));
        }
        this.tvTitle.setText(str);
    }

    public void setMessage(String str) {
        this.tvMessage.setText(str);
    }

    private static boolean setMax(String str) {
        return !TextUtils.isEmpty(str);
    }

    public void setAction(String str) {
        this.btnAction.setText(str);
        this.btnAction.setVisibility(0);
    }

    public void setIcon(@DrawableRes int i) {
        this.ivEmptyState.setImageResource(i);
    }

    public void onActionClick(View.OnClickListener onClickListener) {
        Button button = this.btnAction;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }
}
