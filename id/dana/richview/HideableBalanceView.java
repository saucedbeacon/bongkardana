package id.dana.richview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleRes;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.model.CurrencyAmountModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getBluetoothAdapterState;
import o.resetInternal;
import o.setLineVisible;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0007J\u0010\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\u0007J\u0016\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\rH\u0016¨\u0006\u001c"}, d2 = {"Lid/dana/richview/HideableBalanceView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getLayout", "setAmount", "", "amount", "", "setBalanceVisibility", "visible", "", "setTextAppearance", "resId", "setTextColor", "color", "setTextSize", "unit", "size", "", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HideableBalanceView extends BaseRichView {
    private HashMap setMax;

    @JvmOverloads
    public HideableBalanceView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public HideableBalanceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_hideable_balance;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HideableBalanceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HideableBalanceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public HideableBalanceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setTextAppearance(@StyleRes int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchTextAppearance);
            if (textView != null) {
                textView.setTextAppearance(i);
            }
        } else {
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchTextAppearance);
            if (textView2 != null) {
                textView2.setTextAppearance(getContext(), i);
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.SwitchCompat);
            if (textView3 != null) {
                textView3.setTextAppearance(i);
            }
        } else {
            TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.SwitchCompat);
            if (textView4 != null) {
                textView4.setTextAppearance(getContext(), i);
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            TextView textView5 = (TextView) _$_findCachedViewById(resetInternal.setMax.getThumbDrawable);
            if (textView5 != null) {
                textView5.setTextAppearance(i);
                return;
            }
            return;
        }
        TextView textView6 = (TextView) _$_findCachedViewById(resetInternal.setMax.getThumbDrawable);
        if (textView6 != null) {
            textView6.setTextAppearance(getContext(), i);
        }
    }

    public final void setTextColor(@ColorInt int i) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchTextAppearance);
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.SwitchCompat);
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.getThumbDrawable);
        if (textView3 != null) {
            textView3.setTextColor(i);
        }
    }

    public final void setTextSize(int i, float f) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchTextAppearance);
        if (textView != null) {
            textView.setTextSize(i, f);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.SwitchCompat);
        if (textView2 != null) {
            textView2.setTextSize(i, f);
        }
        TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.getThumbDrawable);
        if (textView3 != null) {
            textView3.setTextSize(i, f);
        }
    }

    public final void setBalanceVisibility(boolean z) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchTextAppearance);
        if (textView != null) {
            getBluetoothAdapterState.length(textView, z, 8);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.SwitchCompat);
        if (textView2 != null) {
            getBluetoothAdapterState.length(textView2, !z, 8);
        }
    }

    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "amount");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchTextAppearance);
        if (textView != null) {
            textView.setText(setLineVisible.length(new CurrencyAmountModel(str)));
        }
    }
}
