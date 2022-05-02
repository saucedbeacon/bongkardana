package id.dana.nearbyme.merchantreview;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import o.IntRange;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.stopBeaconDiscovery;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0014\u001a\u00020\rH\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewMainView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textListener", "Lid/dana/nearbyme/merchantreview/MerchantReviewMainView$TextListener;", "getLayout", "renderExceedState", "", "renderFocusedState", "renderNormalState", "setOnEditTextClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setTextListener", "setup", "setupListeners", "Landroidx/appcompat/widget/AppCompatEditText;", "setupReviewEditText", "updateFocusedState", "length", "updateState", "updateTextLimit", "Companion", "TextListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantReviewMainView extends BaseRichView {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    public static final int MAX_LENGTH = 150;
    private HashMap getMax;
    /* access modifiers changed from: private */
    public length setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewMainView$TextListener;", "", "onTextChanged", "", "text", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
        void setMin(@NotNull String str);
    }

    @JvmOverloads
    public MerchantReviewMainView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1246023195, oncanceled);
            onCancelLoad.getMin(-1246023195, oncanceled);
        }
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_review_main;
    }

    public static final /* synthetic */ length access$getTextListener$p(MerchantReviewMainView merchantReviewMainView) {
        length length2 = merchantReviewMainView.setMin;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textListener");
        }
        return length2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantReviewMainView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u000f"}, d2 = {"id/dana/extension/view/InputExtKt$onTextAfterChanged$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_productionRelease", "id/dana/nearbyme/merchantreview/MerchantReviewMainView$$special$$inlined$onTextAfterChanged$1"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements TextWatcher {
        final /* synthetic */ MerchantReviewMainView getMax;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public getMax(MerchantReviewMainView merchantReviewMainView) {
            this.getMax = merchantReviewMainView;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            MerchantReviewMainView.access$getTextListener$p(this.getMax).setMin(str);
            this.getMax.setMax(str.length());
            MerchantReviewMainView.access$updateFocusedState(this.getMax, str.length());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantReviewMainView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }

    public final void setOnEditTextClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        AppCompatEditText appCompatEditText = (AppCompatEditText) _$_findCachedViewById(resetInternal.setMax.Keep);
        if (appCompatEditText != null) {
            appCompatEditText.setOnClickListener(onClickListener);
        }
    }

    public final void setTextListener(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "textListener");
        this.setMin = length2;
        AppCompatEditText appCompatEditText = (AppCompatEditText) _$_findCachedViewById(resetInternal.setMax.Keep);
        if (appCompatEditText != null) {
            appCompatEditText.addTextChangedListener(new getMax(this));
            appCompatEditText.setOnFocusChangeListener(new setMin(appCompatEditText, this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "id/dana/nearbyme/merchantreview/MerchantReviewMainView$setupListeners$1$2"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnFocusChangeListener {
        final /* synthetic */ AppCompatEditText length;
        final /* synthetic */ MerchantReviewMainView setMin;

        setMin(AppCompatEditText appCompatEditText, MerchantReviewMainView merchantReviewMainView) {
            this.length = appCompatEditText;
            this.setMin = merchantReviewMainView;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                MerchantReviewMainView.access$updateFocusedState(this.setMin, this.length.length());
            } else {
                MerchantReviewMainView.access$updateState(this.setMin, this.length.length());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setMax(int i) {
        String str;
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setLogoDescription);
        if (appCompatTextView != null) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.merchant_review_text_limit, new Object[]{Integer.valueOf(i), 150});
            } else {
                str = null;
            }
            appCompatTextView.setText(str);
        }
    }

    private final void getMax() {
        AppCompatEditText appCompatEditText = (AppCompatEditText) _$_findCachedViewById(resetInternal.setMax.Keep);
        if (appCompatEditText != null) {
            appCompatEditText.setBackgroundResource(R.drawable.bg_review_full);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getTitleMarginBottom);
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(IntRange.setMax(getContext(), R.color.f23802131100313));
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setLogoDescription);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextColor(IntRange.setMax(getContext(), R.color.f23802131100313));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewMainView$Companion;", "", "()V", "MAX_LENGTH", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void setup() {
        String str;
        AppCompatEditText appCompatEditText = (AppCompatEditText) _$_findCachedViewById(resetInternal.setMax.Keep);
        if (appCompatEditText != null) {
            EditText editText = appCompatEditText;
            Intrinsics.checkNotNullParameter(editText, "$this$addEmojiFilter");
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            InputFilter[] filters = editText.getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "filters");
            spreadBuilder.addSpread(filters);
            spreadBuilder.add(stopBeaconDiscovery.setMax.getMin);
            editText.setFilters((InputFilter[]) spreadBuilder.toArray(new InputFilter[spreadBuilder.size()]));
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getTitleMarginBottom);
        if (appCompatTextView != null) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.merchant_review_instruction, new Object[]{150});
            } else {
                str = null;
            }
            appCompatTextView.setText(str);
        }
        setMax(0);
    }

    public static final /* synthetic */ void access$updateFocusedState(MerchantReviewMainView merchantReviewMainView, int i) {
        if (i <= 150) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) merchantReviewMainView._$_findCachedViewById(resetInternal.setMax.Keep);
            if (appCompatEditText != null) {
                appCompatEditText.setBackgroundResource(R.drawable.bg_review_focused);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) merchantReviewMainView._$_findCachedViewById(resetInternal.setMax.getTitleMarginBottom);
            if (appCompatTextView != null) {
                appCompatTextView.setTextColor(IntRange.setMax(merchantReviewMainView.getContext(), R.color.f20382131099951));
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) merchantReviewMainView._$_findCachedViewById(resetInternal.setMax.setLogoDescription);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextColor(IntRange.setMax(merchantReviewMainView.getContext(), R.color.f20382131099951));
                return;
            }
            return;
        }
        merchantReviewMainView.getMax();
    }

    public static final /* synthetic */ void access$updateState(MerchantReviewMainView merchantReviewMainView, int i) {
        if (i <= 150) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) merchantReviewMainView._$_findCachedViewById(resetInternal.setMax.Keep);
            if (appCompatEditText != null) {
                appCompatEditText.setBackgroundResource(R.drawable.bg_review_normal);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) merchantReviewMainView._$_findCachedViewById(resetInternal.setMax.getTitleMarginBottom);
            if (appCompatTextView != null) {
                appCompatTextView.setTextColor(IntRange.setMax(merchantReviewMainView.getContext(), R.color.f20382131099951));
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) merchantReviewMainView._$_findCachedViewById(resetInternal.setMax.setLogoDescription);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextColor(IntRange.setMax(merchantReviewMainView.getContext(), R.color.f20382131099951));
                return;
            }
            return;
        }
        merchantReviewMainView.getMax();
    }
}
