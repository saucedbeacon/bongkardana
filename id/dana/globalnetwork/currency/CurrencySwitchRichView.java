package id.dana.globalnetwork.currency;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.Currency;
import java.util.Locale;
import o.RVBluetoothProxy;
import o.evaluate;
import o.layoutChildWithAnchor;
import o.parseBehavior;
import o.updateCornerMarking;

public class CurrencySwitchRichView extends BaseRichView {
    private String getMax;
    private length getMin;
    private boolean setMax = false;
    private String setMin;
    @BindView(2131364817)
    ConstraintLayout thumbLayout;
    @BindView(2131364880)
    ConstraintLayout trackLayout;
    @BindView(2131365163)
    TextView tvCurrency;

    public interface length {
        void setMax(boolean z);
    }

    public int getLayout() {
        return R.layout.view_rich_currency_switch;
    }

    public CurrencySwitchRichView(@NonNull Context context) {
        super(context);
    }

    public CurrencySwitchRichView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CurrencySwitchRichView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setup() {
        setOnClickListener(new RVBluetoothProxy(this));
    }

    public boolean isGlobalNetworkState() {
        return this.setMax;
    }

    public void setSwitchState(boolean z) {
        this.setMax = z;
        this.tvCurrency.setText(getCurrentCurrencySymbol());
        float f = 2.0f;
        float width = ((float) (getWidth() - this.thumbLayout.getWidth())) - 2.0f;
        if (this.setMax) {
            f = width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.thumbLayout, "translationX", new float[]{f});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(100);
        ofFloat.start();
    }

    public void setSwitchStateListener(length length2) {
        this.getMin = length2;
    }

    public void setLocalCurrencySymbol(String str) {
        String symbol = Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), str)).getSymbol();
        if (symbol.equals("IDR")) {
            symbol = "Rp";
        }
        this.setMin = symbol;
    }

    public void setForeignCurrencySymbol(String str) {
        String symbol = Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), str)).getSymbol();
        if (symbol.equals("IDR")) {
            symbol = "Rp";
        }
        this.getMax = symbol;
    }

    public String getCurrentCurrencySymbol() {
        return this.setMax ? this.getMax : this.setMin;
    }

    public void updateCountryFlag(String str) {
        ConstraintLayout constraintLayout = this.trackLayout;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundResource(0);
            if (!TextUtils.isEmpty(str)) {
                ((updateCornerMarking) Glide.getMax(getContext())).setMax(str).setMax(evaluate.setMin).getMax(new parseBehavior<Drawable>() {
                    public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                        return false;
                    }

                    public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                        return setMax((Drawable) obj);
                    }

                    private boolean setMax(Drawable drawable) {
                        CurrencySwitchRichView.this.trackLayout.setBackground(drawable);
                        return true;
                    }
                }).setMax();
            }
        }
    }

    public static /* synthetic */ void setMin(CurrencySwitchRichView currencySwitchRichView) {
        currencySwitchRichView.setSwitchState(!currencySwitchRichView.setMax);
        length length2 = currencySwitchRichView.getMin;
        if (length2 != null) {
            length2.setMax(currencySwitchRichView.setMax);
        }
    }
}
