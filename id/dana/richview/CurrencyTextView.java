package id.dana.richview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import id.dana.R;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.APImageDownloadRsp;
import o.RedDotDrawable;
import o.TitleBarRightButtonView;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.onLoadChildren;

public class CurrencyTextView extends AppCompatTextView {
    public static final String DEFAULT_COUNTRY_CODE = "ID";
    public static final String DEFAULT_LANGUAGE_CODE = "in";
    private Locale getMin;
    private String length = "";
    private Context setMax;
    private boolean setMin;

    public CurrencyTextView(Context context) {
        super(context);
        this.setMax = context;
        initLocale();
        setSymbol(context.getString(R.string.rupiah_short));
        setText(getMin(getText().toString()));
    }

    public void initLocale() {
        setLocale(DEFAULT_LANGUAGE_CODE, "ID");
    }

    public void setSymbol(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.length = str;
            setText(getText().toString(), TextView.BufferType.NORMAL);
            postInvalidate();
        }
    }

    private String getMin(String str) {
        APImageDownloadRsp aPImageDownloadRsp;
        if (TextUtils.isEmpty(str)) {
            return "0";
        }
        try {
            aPImageDownloadRsp = new APImageDownloadRsp(str);
        } catch (NumberFormatException unused) {
            aPImageDownloadRsp = new APImageDownloadRsp(0);
        }
        Locale locale = this.getMin;
        return NumberFormat.getNumberInstance(locale).format(aPImageDownloadRsp.setMin);
    }

    public void setLocale(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = DEFAULT_LANGUAGE_CODE;
            str2 = "ID";
        }
        this.getMin = new Locale(str, str2);
        postInvalidate();
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.length);
        sb.append(getMin(charSequence.toString()));
        String obj = sb.toString();
        if (this.setMin) {
            obj = "-".concat(String.valueOf(obj));
        }
        if (TextUtils.isEmpty(obj)) {
            obj = "";
        }
        super.setText(obj, bufferType);
    }

    public void setMinus(boolean z) {
        this.setMin = z;
    }

    public CurrencyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setMax = context;
        initLocale();
        setSymbol(context.getString(R.string.rupiah_short));
        setText(getMin(getText().toString()));
    }

    public CurrencyTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setMax = context;
        setSymbol(context.getString(R.string.rupiah_short));
        setText(getMin(getText().toString()));
    }

    public String getCurrencySymbol() {
        return this.length;
    }

    public CurrencyAmountModel getAmountModel() {
        return new CurrencyAmountModel(getAmount(), this.length);
    }

    public String getAmount() {
        return getText().toString().replaceAll("[^0-9]", "");
    }

    public void setSymbol(Drawable drawable) {
        if (drawable != null) {
            setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            setCompoundDrawablePadding(this.setMax.getResources().getDimensionPixelSize(R.dimen.f26672131165338));
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<String> listenOriginalValue() {
        return onLoadChildren.textChanges(this).skipInitialValue().subscribeOn(getSecureSignatureComp.setMin()).map(new RedDotDrawable(this) {
            private final CurrencyTextView setMin;

            {
                this.setMin = r1;
            }

            public final Object apply(Object obj) {
                return ((CharSequence) obj).toString().replace(this.setMin.length, "").replace(".", "");
            }
        }).debounce(100, TimeUnit.MILLISECONDS).observeOn(hideProgress.length());
    }
}
