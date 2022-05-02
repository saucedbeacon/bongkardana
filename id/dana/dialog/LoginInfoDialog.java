package id.dana.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import o.GriverAppStorageProxy;
import o.IMultiInstanceInvalidationService;
import o.IntRange;
import o.deleteAppInfo;
import o.insertOrUpdateInfo;
import o.setLastRefreshTimestamp;

public class LoginInfoDialog extends IMultiInstanceInvalidationService<getMax> {
    private int getMax;
    @Nullable
    @BindView(2131363151)
    ImageView icImage;
    @Nullable
    @BindView(2131363152)
    ImageView icImageFg;
    @Nullable
    @BindView(2131363932)
    LinearLayout llSimpleDialog;
    private getMax setMax;
    @Nullable
    @BindView(2131365356)
    TextView tvMessage;
    @Nullable
    @BindView(2131362099)
    Button tvNegative;
    @Nullable
    @BindView(2131362112)
    Button tvPositive;
    @Nullable
    @BindView(2131365610)
    TextView tvTitle;
    @BindView(2131363822)
    View viewActionLoginDialog;

    public /* synthetic */ LoginInfoDialog(Context context, DialogInterface.OnDismissListener onDismissListener, int i, getMax getmax, byte b) {
        this(context, onDismissListener, i, getmax);
    }

    public final /* synthetic */ void setMin(View view, Object obj) {
        View findViewById;
        getMax getmax = (getMax) obj;
        this.getMax = getmax.values;
        int i = getmax.hashCode;
        if (i > 0) {
            this.llSimpleDialog.setBackground(IntRange.length(this.length, i));
        }
        ImageView imageView = this.icImage;
        int i2 = 8;
        if (imageView != null) {
            int i3 = this.getMax;
            if (i3 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(i3);
            }
        }
        TextView textView = this.tvMessage;
        String str = getmax.IsOverlapping;
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(TextUtils.isEmpty(textView.getText()) ? 8 : 0);
        }
        TextView textView2 = this.tvTitle;
        String str2 = getmax.equals;
        if (textView2 != null) {
            textView2.setText(str2);
            if (!TextUtils.isEmpty(textView2.getText())) {
                i2 = 0;
            }
            textView2.setVisibility(i2);
        }
        if (!(getmax.toString == 0 || (findViewById = view.findViewById(getmax.toString)) == null)) {
            findViewById.setOnClickListener(new insertOrUpdateInfo(this));
        }
        String str3 = getmax.isInside;
        View.OnClickListener onClickListener = getmax.toIntRange;
        getMax(str3, this.tvNegative);
        this.tvNegative.setText(str3);
        this.tvNegative.setOnClickListener(new setLastRefreshTimestamp(this, onClickListener));
        String str4 = getmax.toFloatRange;
        View.OnClickListener onClickListener2 = getmax.toDoubleRange;
        getMax(str4, this.tvPositive);
        this.tvPositive.setText(str4);
        this.tvPositive.setOnClickListener(new deleteAppInfo(this, onClickListener2));
    }

    private LoginInfoDialog(Context context, DialogInterface.OnDismissListener onDismissListener, int i, getMax getmax) {
        super(context, onDismissListener, Integer.valueOf(i), getmax);
        this.setMax = getmax;
    }

    public final void setMin() {
        if (this.getMax == R.drawable.ic_loading_bg) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.length, R.anim.f732130772045);
            loadAnimation.setInterpolator(new LinearInterpolator());
            ImageView imageView = this.icImageFg;
            if (imageView != null) {
                imageView.startAnimation(loadAnimation);
            }
        }
        ImageView imageView2 = this.icImageFg;
        if (imageView2 != null) {
            imageView2.setVisibility(this.getMax == R.drawable.ic_loading_bg ? 0 : 4);
        }
        super.setMin();
        if (this.setMax.getMax) {
            new Handler().postDelayed(new GriverAppStorageProxy(this), (long) this.setMax.getMin);
        }
    }

    private void getMax(String str, Button button) {
        int i = 8;
        this.viewActionLoginDialog.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        if (!TextUtils.isEmpty(str)) {
            i = 0;
        }
        button.setVisibility(i);
    }

    public static class getMax extends IMultiInstanceInvalidationService.setMin {
        public String IsOverlapping;
        public String equals;
        public boolean getMax = true;
        public int getMin = 3000;
        @DrawableRes
        public int hashCode;
        public String isInside;
        @LayoutRes
        public int length = R.layout.view_login_popup;
        public Context setMax;
        public DialogInterface.OnDismissListener setMin;
        public View.OnClickListener toDoubleRange;
        public String toFloatRange;
        public View.OnClickListener toIntRange;
        @IdRes
        int toString;
        public int values;

        public getMax(Context context) {
            this.setMax = context;
        }

        public final getMax setMin() {
            length(false);
            return this;
        }

        public final getMax length() {
            setMin(false);
            return this;
        }
    }

    public static /* synthetic */ void getMax(LoginInfoDialog loginInfoDialog, View.OnClickListener onClickListener, View view) {
        loginInfoDialog.setMax();
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static /* synthetic */ void setMin(LoginInfoDialog loginInfoDialog, View.OnClickListener onClickListener, View view) {
        loginInfoDialog.setMax();
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
