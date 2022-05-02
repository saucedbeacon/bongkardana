package id.dana.home.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;

public class NavigationTabView extends BaseRichView {
    @Nullable
    @BindView(2131362530)
    ConstraintLayout clViewNav;
    @BindView(2131364131)
    ImageView iconIv;
    private Drawable length;
    private String setMax;
    @Nullable
    @BindView(2131364132)
    TextView tabNotif;
    @BindView(2131364134)
    TextView titleTv;

    public int getLayout() {
        return R.layout.view_nav_tab;
    }

    public NavigationTabView(@NonNull Context context, @DrawableRes int i, String str) {
        super(context);
        setIcon(i);
        setTitle(str);
    }

    public NavigationTabView(@NonNull Context context, @DrawableRes int i, String str, @ColorInt int i2, boolean z) {
        super(context);
        setIcon(i);
        setTitle(str);
        this.titleTv.setTextColor(i2);
        ConstraintLayout constraintLayout = this.clViewNav;
        if (constraintLayout != null) {
            constraintLayout.setClickable(!z);
            this.clViewNav.setActivated(!z);
        }
    }

    public NavigationTabView(@NonNull Context context) {
        super(context);
    }

    public NavigationTabView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NavigationTabView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NavigationTabView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setUnreadNotif(int i, boolean z) {
        Object obj;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1432403683, oncanceled);
            onCancelLoad.getMin(-1432403683, oncanceled);
        }
        TextView textView = this.tabNotif;
        if (textView != null) {
            textView.setVisibility(8);
            if (i > 0) {
                TextView textView2 = this.tabNotif;
                if (!z) {
                    obj = Integer.valueOf(i);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append("+");
                    obj = sb.toString();
                }
                textView2.setText(String.valueOf(obj));
                this.tabNotif.setVisibility(0);
            }
        }
    }

    public boolean hasUnreadNotif() {
        TextView textView = this.tabNotif;
        if (textView == null || textView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.MediaSessionCompat$MediaSessionImplBase$MediaSessionStub);
            try {
                this.length = obtainStyledAttributes.getDrawable(0);
                this.setMax = obtainStyledAttributes.getString(1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        Drawable drawable = this.length;
        if (drawable != null) {
            setIcon(drawable);
        }
        if (!TextUtils.isEmpty(this.setMax)) {
            setTitle(this.setMax);
        }
        setSelected(false);
    }

    public void setTitle(String str) {
        this.titleTv.setText(str);
    }

    public void setIcon(@DrawableRes int i) {
        this.iconIv.setImageResource(i);
    }

    public void setIcon(Drawable drawable) {
        this.iconIv.setImageDrawable(drawable);
    }

    public TextView getTabTextView() {
        return this.titleTv;
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        this.iconIv.setSelected(z);
        if (getTabTextView() != null) {
            getTabTextView().setSelected(z);
            if (Build.VERSION.SDK_INT >= 23) {
                getTabTextView().setTextAppearance(z ? R.style.f82302131952326 : R.style.f82312131952327);
            } else {
                getTabTextView().setTypeface(getTabTextView().getTypeface(), z ? 1 : 0);
            }
        }
    }
}
