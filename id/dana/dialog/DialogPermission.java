package id.dana.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import id.dana.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.GriverAboutUrlExtension;
import o.IMultiInstanceInvalidationService;
import o.getAboutUrl;
import o.getAcParams;
import o.getPublishStatus;

public class DialogPermission extends IMultiInstanceInvalidationService<setMin> {
    @BindView(2131362058)
    Button btnCheckPermission;
    @BindView(2131362059)
    Button btnCheckPermissionHorizontal;
    @BindView(2131362086)
    Group btnHorizontalGroup;
    @BindView(2131362104)
    Button btnNotNow;
    @BindView(2131362105)
    Button btnNotNowHorizontal;
    @BindView(2131362157)
    Group btnVerticalGroup;
    @BindView(2131363565)
    ImageView ivPermission;
    @BindView(2131365091)
    TextView tvAdditionalText;
    @BindView(2131365440)
    TextView tvPermissionDesc;
    @BindView(2131365441)
    TextView tvPermissionTitle;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionDialogType {
        public static final int HORIZONTAL = 1;
        public static final int VERTICAL = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionType {
        public static final String CONTACT = "contact";
        public static final String LOCATION = "location";
    }

    public interface length {
        void onDialogDismissed();

        void onNegativeButtonClicked();

        void onPositiveButtonClicked();
    }

    public /* synthetic */ DialogPermission(Context context, DialogInterface.OnDismissListener onDismissListener, setMin setmin, byte b) {
        this(context, onDismissListener, setmin);
    }

    public final /* synthetic */ void setMin(View view, Object obj) {
        setMin setmin = (setMin) obj;
        String str = setmin.equals;
        View.OnClickListener onClickListener = setmin.toIntRange;
        if (str != null) {
            this.tvAdditionalText.setText(str);
        }
        if (onClickListener != null) {
            this.tvAdditionalText.setOnClickListener(onClickListener);
        }
        int i = 0;
        this.tvAdditionalText.setVisibility(0);
        String str2 = setmin.length;
        if (str2 != null) {
            this.tvPermissionTitle.setText(str2);
            this.tvPermissionTitle.setVisibility(0);
        }
        String str3 = setmin.getMax;
        final View.OnClickListener onClickListener2 = setmin.Grayscale$Algorithm;
        if (str3 != null) {
            if (onClickListener2 != null) {
                TextView textView = this.tvPermissionDesc;
                SpannableString spannableString = new SpannableString(str3);
                AnonymousClass1 r4 = new ClickableSpan() {
                    public final void onClick(@NonNull View view) {
                        view.invalidate();
                        onClickListener2.onClick(view);
                    }

                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                        textPaint.setColor(-15692055);
                    }
                };
                String string = this.length.getResources().getString(R.string.tnc);
                int indexOf = str3.indexOf(string);
                spannableString.setSpan(r4, indexOf, string.length() + indexOf, 33);
                textView.setText(spannableString);
                this.tvPermissionDesc.setHighlightColor(0);
                this.tvPermissionDesc.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                this.tvPermissionDesc.setText(str3);
            }
            this.tvPermissionDesc.setVisibility(0);
        }
        int i2 = setmin.toFloatRange;
        if (i2 != 0) {
            this.tvPermissionDesc.setTextColor(i2);
        }
        Typeface typeface = setmin.values;
        if (typeface != null) {
            this.tvPermissionDesc.setTypeface(typeface);
        }
        int i3 = setmin.toString;
        if (i3 != 0) {
            this.tvPermissionTitle.setTextColor(i3);
        }
        Typeface typeface2 = setmin.toDoubleRange;
        if (typeface2 != null) {
            this.tvPermissionTitle.setTypeface(typeface2);
        }
        this.btnHorizontalGroup.setVisibility(1 == setmin.hashCode ? 0 : 8);
        Group group = this.btnVerticalGroup;
        if (setmin.hashCode != 0) {
            i = 8;
        }
        group.setVisibility(i);
        String str4 = setmin.IsOverlapping;
        length length2 = setmin.FastBitmap$CoordinateSystem;
        if (str4 != null) {
            this.btnCheckPermission.setText(str4);
            this.btnCheckPermissionHorizontal.setText(str4);
        }
        if (length2 != null) {
            this.btnCheckPermission.setOnClickListener(new getAcParams(length2));
            this.btnCheckPermissionHorizontal.setOnClickListener(new getPublishStatus(length2));
        }
        length length3 = setmin.FastBitmap$CoordinateSystem;
        if (length3 != null) {
            this.btnNotNow.setOnClickListener(new getAboutUrl(length3));
            this.btnNotNowHorizontal.setOnClickListener(new GriverAboutUrlExtension(length3));
        }
        String str5 = setmin.isInside;
        if (!TextUtils.isEmpty(str5)) {
            this.btnNotNow.setText(str5);
            this.btnNotNowHorizontal.setText(str5);
        }
        Boolean valueOf = Boolean.valueOf(setmin.invoke);
        String str6 = setmin.equals;
        if (valueOf.booleanValue()) {
            Button button = this.btnCheckPermission;
            Integer valueOf2 = Integer.valueOf(R.id.btn_not_now);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) button.getLayoutParams();
            layoutParams.IsOverlapping = valueOf2.intValue();
            layoutParams.toDoubleRange = -1;
            button.requestLayout();
            Button button2 = this.btnNotNow;
            Integer valueOf3 = Integer.valueOf(R.id.f64662131365091);
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) button2.getLayoutParams();
            layoutParams2.IsOverlapping = valueOf3.intValue();
            layoutParams2.toDoubleRange = -1;
            button2.requestLayout();
            if (TextUtils.isEmpty(str6)) {
                this.tvAdditionalText.setVisibility(8);
            }
        }
        this.ivPermission.setImageResource(setmin.setMin);
    }

    private DialogPermission(Context context, DialogInterface.OnDismissListener onDismissListener, setMin setmin) {
        super(context, onDismissListener, Integer.valueOf(R.layout.dialog_permission), setmin);
    }

    public static class setMin extends IMultiInstanceInvalidationService.setMin {
        public length FastBitmap$CoordinateSystem;
        public View.OnClickListener Grayscale$Algorithm;
        public String IsOverlapping;
        public String equals;
        public String getMax;
        public Context getMin;
        public int hashCode;
        public boolean invoke;
        public String isInside;
        public String length;
        public DialogInterface.OnDismissListener setMax;
        public int setMin;
        public Typeface toDoubleRange;
        public int toFloatRange;
        public View.OnClickListener toIntRange;
        public int toString;
        public Typeface values;

        public setMin(Context context, DialogInterface.OnDismissListener onDismissListener) {
            this.getMin = context;
            this.setMax = onDismissListener;
        }

        public final setMin getMin() {
            length(false);
            return this;
        }

        public final setMin getMin(boolean z) {
            setMin(z);
            return this;
        }
    }
}
