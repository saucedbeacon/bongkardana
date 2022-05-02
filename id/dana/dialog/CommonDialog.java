package id.dana.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import kotlin.Unit;
import o.IMultiInstanceInvalidationService;
import o.getClientParams;
import o.getLanguages;
import o.message;
import o.setAcquirerId;
import o.setClientParams;
import o.setLanguages;

public class CommonDialog extends IMultiInstanceInvalidationService<getMax> {
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
    @BindView(2131365610)
    TextView tvTitle;

    public /* synthetic */ CommonDialog(Context context, DialogInterface.OnDismissListener onDismissListener, int i, getMax getmax, byte b) {
        this(context, onDismissListener, i, getmax);
    }

    public final /* synthetic */ void setMin(View view, Object obj) {
        View findViewById;
        getMax getmax = (getMax) obj;
        int i = getmax.FastBitmap$CoordinateSystem;
        this.getMax = i;
        ImageView imageView = this.icImage;
        int i2 = 8;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(i);
            }
        }
        TextView textView = this.tvMessage;
        if (textView != null) {
            textView.setText(getmax.toFloatRange);
        }
        TextView textView2 = this.tvTitle;
        if (textView2 != null) {
            textView2.setText(getmax.equals);
        }
        if (!TextUtils.isEmpty(getmax.isInside)) {
            getMax().positiveButton((Integer) null, getmax.isInside, new setAcquirerId(getmax, view));
        }
        if (!TextUtils.isEmpty(getmax.IsOverlapping)) {
            getMax().negativeButton((Integer) null, getmax.IsOverlapping, new getLanguages(getmax, view));
        }
        message message = getmax.hashCode;
        LinearLayout linearLayout = this.llSimpleDialog;
        if (!(linearLayout == null || message == null)) {
            linearLayout.setOnClickListener(new getClientParams(message));
        }
        if (!(getmax.values == 0 || (findViewById = view.findViewById(getmax.values)) == null)) {
            findViewById.setOnClickListener(new setClientParams(this));
        }
        TextView textView3 = this.tvTitle;
        if (textView3 != null) {
            if (!TextUtils.isEmpty(textView3.getText())) {
                i2 = 0;
            }
            textView3.setVisibility(i2);
        }
    }

    private CommonDialog(Context context, DialogInterface.OnDismissListener onDismissListener, int i, getMax getmax) {
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
        if (this.setMax.length && this.setMax.getMin > 0) {
            new Handler().postDelayed(new setLanguages(this), (long) this.setMax.getMin);
        }
    }

    public static class getMax extends IMultiInstanceInvalidationService.setMin {
        public int FastBitmap$CoordinateSystem;
        public String IsOverlapping;
        public String equals;
        public Context getMax;
        public int getMin = 3000;
        message hashCode;
        public String isInside;
        public boolean length = true;
        @LayoutRes
        public int setMax = R.layout.view_simple_popup;
        public DialogInterface.OnDismissListener setMin;
        public View.OnClickListener toDoubleRange;
        public String toFloatRange;
        public View.OnClickListener toIntRange;
        @IdRes
        int values;

        public getMax(Context context) {
            this.getMax = context;
        }

        public final getMax getMin() {
            length(false);
            return this;
        }

        public final getMax getMax(boolean z) {
            setMin(z);
            return this;
        }
    }

    public static /* synthetic */ Unit getMin(getMax getmax, View view) {
        if (getmax.toIntRange == null) {
            return null;
        }
        getmax.toIntRange.onClick(view);
        return null;
    }

    public static /* synthetic */ Unit getMax(getMax getmax, View view) {
        if (getmax.toDoubleRange == null) {
            return null;
        }
        getmax.toDoubleRange.onClick(view);
        return null;
    }
}
