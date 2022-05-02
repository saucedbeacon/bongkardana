package id.dana.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.component.formcomponent.DanaCheckboxButtonView;
import id.dana.richview.LogoProgressView;
import o.AppInfoConstants;
import o.IMultiInstanceInvalidationService;
import o.IntRange;
import o.Popup;
import o.evaluate;
import o.selectAllAppInfos;
import o.selectAppInfo;
import o.selectAppInfoWithHighestVersion;
import o.setCode;
import o.updateCornerMarking;

public class TwoButtonWithImageDialog extends IMultiInstanceInvalidationService<setMax> {
    @Nullable
    @BindView(2131362099)
    Button btnNegative;
    @Nullable
    @BindView(2131362100)
    Button btnNegativeGhost;
    @Nullable
    @BindView(2131362112)
    Button btnPositive;
    @BindView(2131362227)
    DanaCheckboxButtonView cbNoDialogAnymore;
    private int getMax;
    @Nullable
    @BindView(2131363490)
    ImageView ivImage;
    @BindView(2131363968)
    LogoProgressView lpvLoading;
    private int setMax;
    @BindView(2131365205)
    TextView tvDialogFooterText;
    @Nullable
    @BindView(2131365193)
    TextView tvMessage;
    @Nullable
    @BindView(2131365600)
    TextView tvTitle;

    public @interface PositiveButtonType {
        public static final int DEFAULT = 0;
        public static final int SEMI_ROUNDED_WHITE = 1;
    }

    /* synthetic */ TwoButtonWithImageDialog(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener, int i, setMax setmax, int i2, int i3, byte b) {
        this(context, onDismissListener, onCancelListener, i, setmax, i2, i3);
    }

    public final /* synthetic */ void setMin(View view, Object obj) {
        setMax setmax = (setMax) obj;
        if (this.ivImage != null) {
            if (setmax.equals != 0) {
                ((updateCornerMarking) Glide.getMax(this.length)).setMax("").setMax(evaluate.setMin).setMax(setmax.equals).length(this.ivImage);
            } else if (!TextUtils.isEmpty(setmax.getMin)) {
                Popup.setMin(setmax.getMin, this.ivImage, new selectAllAppInfos(this));
            } else {
                this.ivImage.setVisibility(8);
            }
        }
        if (this.tvMessage != null) {
            if (setmax.length != null) {
                this.tvMessage.setText(setmax.length);
            } else {
                this.tvMessage.setText(setmax.toIntRange);
                this.tvMessage.setMovementMethod(LinkMovementMethod.getInstance());
            }
            TextView textView = this.tvMessage;
            textView.setVisibility(TextUtils.isEmpty(textView.getText()) ? 8 : 0);
        }
        TextView textView2 = this.tvTitle;
        if (textView2 != null) {
            textView2.setText(setmax.setMin);
            TextView textView3 = this.tvTitle;
            textView3.setVisibility(TextUtils.isEmpty(textView3.getText()) ? 8 : 0);
        }
        String length = setmax.values;
        boolean min = setmax.Grayscale$Algorithm;
        View.OnClickListener isInside = setmax.toString;
        int equals = setmax.toDoubleRange;
        this.btnPositive.setVisibility(TextUtils.isEmpty(length) ? 8 : 0);
        this.btnPositive.setText(length);
        if (min) {
            this.btnPositive.setOnClickListener(new selectAppInfo(this, isInside));
        } else {
            this.btnPositive.setOnClickListener(new selectAppInfoWithHighestVersion(this, isInside));
        }
        if (equals == 1) {
            this.btnPositive.setBackground(IntRange.length(this.length, (int) R.drawable.btn_semi_rounded_white));
            this.btnPositive.setTextColor(IntRange.setMax(this.length, R.color.f18402131099714));
        }
        String floatRange = setmax.FastBitmap$CoordinateSystem;
        boolean intRange = setmax.IsOverlapping;
        View.OnClickListener IsOverlapping = setmax.hashCode;
        if (intRange) {
            this.btnNegative.setVisibility(8);
            this.btnNegativeGhost.setVisibility(TextUtils.isEmpty(floatRange) ? 8 : 0);
            this.btnNegativeGhost.setText(floatRange);
            this.btnNegativeGhost.setOnClickListener(new AppInfoConstants(this, IsOverlapping));
        } else {
            this.btnNegative.setVisibility(TextUtils.isEmpty(floatRange) ? 8 : 0);
            this.btnNegative.setText(floatRange);
            this.btnNegative.setOnClickListener(new setCode(this, IsOverlapping));
        }
        String setmax2 = setmax.Mean$Arithmetic;
        CompoundButton.OnCheckedChangeListener values = setmax.invoke;
        if (setmax2.isEmpty()) {
            this.cbNoDialogAnymore.setVisibility(8);
        } else {
            this.cbNoDialogAnymore.setVisibility(0);
            this.cbNoDialogAnymore.setGravity(16);
            this.cbNoDialogAnymore.setTextSize(12.0f);
            this.cbNoDialogAnymore.setText(setmax2);
            this.cbNoDialogAnymore.setOnCheckedChangeListener(values);
        }
        Spannable hashCode = setmax.valueOf;
        if (TextUtils.isEmpty(hashCode)) {
            this.tvDialogFooterText.setVisibility(8);
            return;
        }
        this.tvDialogFooterText.setVisibility(0);
        this.tvDialogFooterText.setText(hashCode);
        this.tvDialogFooterText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private TwoButtonWithImageDialog(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener, int i, setMax setmax, int i2, int i3) {
        super(context, onDismissListener, onCancelListener, Integer.valueOf(i), setmax);
        this.setMax = i2;
        this.getMax = i3;
    }

    public final Button getMax(int i) {
        if (i == -2) {
            return this.btnNegative;
        }
        if (i != -1) {
            return null;
        }
        return this.btnPositive;
    }

    public static class setMax extends IMultiInstanceInvalidationService.setMin {
        public String FastBitmap$CoordinateSystem;
        public boolean Grayscale$Algorithm;
        private DialogInterface.OnDismissListener ICustomTabsCallback;
        public boolean IsOverlapping = false;
        public String Mean$Arithmetic = "";
        @DrawableRes
        public int equals;
        public DialogInterface.OnCancelListener getMax;
        public String getMin;
        public View.OnClickListener hashCode;
        public CompoundButton.OnCheckedChangeListener invoke;
        private Context invokeSuspend;
        public int isInside;
        public String length;
        @LayoutRes
        int setMax = R.layout.view_two_button_with_image_popup;
        public String setMin;
        @PositiveButtonType
        public int toDoubleRange = 0;
        public int toFloatRange;
        public Spannable toIntRange;
        public View.OnClickListener toString;
        @Nullable
        public Spannable valueOf = null;
        public String values;

        public setMax(Context context) {
            this.invokeSuspend = context;
        }

        public final setMax setMax(boolean z) {
            length(z);
            return this;
        }

        public final setMax getMax(boolean z) {
            setMin(z);
            return this;
        }

        public final TwoButtonWithImageDialog getMin() {
            return new TwoButtonWithImageDialog(this.invokeSuspend, this.ICustomTabsCallback, this.getMax, this.setMax, this, this.isInside, this.toFloatRange, (byte) 0);
        }
    }

    public static /* synthetic */ void length(TwoButtonWithImageDialog twoButtonWithImageDialog, View.OnClickListener onClickListener, View view) {
        twoButtonWithImageDialog.setMax();
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static /* synthetic */ void setMax(TwoButtonWithImageDialog twoButtonWithImageDialog, View.OnClickListener onClickListener, View view) {
        twoButtonWithImageDialog.setMax();
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static /* synthetic */ void setMin(TwoButtonWithImageDialog twoButtonWithImageDialog, View.OnClickListener onClickListener, View view) {
        twoButtonWithImageDialog.lpvLoading.setVisibility(0);
        twoButtonWithImageDialog.lpvLoading.startRefresh();
        twoButtonWithImageDialog.btnNegative.setVisibility(8);
        twoButtonWithImageDialog.btnNegativeGhost.setVisibility(8);
        twoButtonWithImageDialog.btnPositive.setVisibility(8);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static /* synthetic */ void getMax(TwoButtonWithImageDialog twoButtonWithImageDialog, View.OnClickListener onClickListener, View view) {
        twoButtonWithImageDialog.setMax();
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
