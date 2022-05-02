package id.dana.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import id.dana.R;
import o.IMultiInstanceInvalidationService;
import o.IntRange;
import o.Popup;
import o.getAppInfo;
import o.setAppInfo;

public class DialogWithImage extends IMultiInstanceInvalidationService<getMin> {
    @BindView(2131362099)
    Button btnNegative;
    @BindView(2131362112)
    Button btnPositive;
    @BindView(2131362575)
    ConstraintLayout constraintLayout;
    @BindView(2131363176)
    ImageView imageView;
    @BindView(2131365193)
    TextView tvDescription;
    @BindView(2131365600)
    TextView tvTitle;

    public /* synthetic */ DialogWithImage(Context context, DialogInterface.OnDismissListener onDismissListener, getMin getmin, byte b) {
        this(context, onDismissListener, getmin);
    }

    public final /* synthetic */ void setMin(View view, Object obj) {
        getMin getmin = (getMin) obj;
        if (getmin.toFloatRange > 0) {
            this.imageView.setImageDrawable(IntRange.length(this.length, getmin.toFloatRange));
        } else if (!TextUtils.isEmpty(getmin.isInside)) {
            Popup.setMin(getmin.isInside, this.imageView, new setAppInfo(this));
        } else {
            this.imageView.setVisibility(8);
        }
        this.tvTitle.setText(getmin.getMax);
        this.tvDescription.setText(getmin.setMin);
        String str = getmin.getMin;
        Button button = this.btnPositive;
        if (!TextUtils.isEmpty(str)) {
            button.setVisibility(0);
            button.setText(str);
        } else {
            button.setVisibility(8);
        }
        this.btnPositive.setOnClickListener(new getAppInfo(this, getmin.length, -1));
        String str2 = getmin.equals;
        Button button2 = this.btnNegative;
        if (!TextUtils.isEmpty(str2)) {
            button2.setVisibility(0);
            button2.setText(str2);
        } else {
            button2.setVisibility(8);
        }
        this.btnNegative.setOnClickListener(new getAppInfo(this, getmin.length, -2));
    }

    private DialogWithImage(Context context, DialogInterface.OnDismissListener onDismissListener, getMin getmin) {
        super(context, onDismissListener, Integer.valueOf(R.layout.dialog_with_image), getmin);
    }

    public static class getMin extends IMultiInstanceInvalidationService.setMin {
        public String equals = "";
        public String getMax = "";
        public String getMin = "";
        public String isInside;
        public DialogInterface.OnClickListener length;
        public DialogInterface.OnDismissListener setMax;
        public String setMin = "";
        @DrawableRes
        public int toFloatRange;

        public final getMin setMax(boolean z) {
            setMin(z);
            return this;
        }

        public final getMin getMax(boolean z) {
            length(z);
            return this;
        }
    }

    public static DialogWithImage length(Context context, DialogInterface.OnClickListener onClickListener) {
        getMin max = new getMin().getMax(false).setMax(false);
        max.toFloatRange = R.drawable.ic_customer_service_png;
        max.getMax = context.getString(R.string.f7566challengepindialogtitle);
        max.setMin = context.getString(R.string.f7565challengepindialogmessage);
        max.getMin = context.getString(R.string.f7564challengepindialogbuttonpositive);
        max.equals = context.getString(R.string.f7563challengepindialogbuttonnegative);
        max.length = onClickListener;
        return new DialogWithImage(context, max.setMax, max, (byte) 0);
    }

    public static /* synthetic */ void setMax(DialogWithImage dialogWithImage, DialogInterface.OnClickListener onClickListener, int i) {
        dialogWithImage.setMax();
        if (onClickListener != null) {
            onClickListener.onClick(dialogWithImage.getMax(), i);
        }
    }
}
