package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.containsFavoriteMenuItem;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u001c\u0010\u0019\u001a\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0006\u0010\u001d\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@FX\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@FX\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantRatingView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "numberOfReviews", "getNumberOfReviews", "()Ljava/lang/Double;", "setNumberOfReviews", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "rating", "getRating", "setRating", "skeletonRatingScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getLayout", "", "hideShimmer", "", "onAttachedToWindow", "parseAttrs", "attrs", "setup", "setupSkeleton", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantRatingView extends BaseRichView {
    private onDetachedFromLayoutParams getMax;
    @Nullable
    private Double getMin;
    @Nullable
    private Double length;
    private final AttributeSet setMax;
    private HashMap setMin;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(246808015, oncanceled);
            onCancelLoad.getMin(246808015, oncanceled);
        }
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_rating;
    }

    public final void setup() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantRatingView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.setMax = attributeSet;
        Double valueOf = Double.valueOf(0.0d);
        this.length = valueOf;
        this.getMin = valueOf;
    }

    @Nullable
    public final Double getRating() {
        return this.length;
    }

    public final void setRating(@Nullable Double d) {
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue != 0.0d) {
                ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.setItemInvoker);
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.isChildOrHidden);
                if (textView != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    textView.setText(format);
                }
            } else {
                ImageView imageView2 = (ImageView) _$_findCachedViewById(resetInternal.setMax.setItemInvoker);
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            }
        }
        this.length = d;
    }

    @Nullable
    public final Double getNumberOfReviews() {
        return this.getMin;
    }

    public final void setNumberOfReviews(@Nullable Double d) {
        TextView textView;
        if ((!Intrinsics.areEqual(d, 0.0d)) && (textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getCurrentContentInsetEnd)) != null) {
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            objArr[0] = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
            textView.setText(resources.getString(R.string.number_of_review_label, objArr));
        }
        this.getMin = d;
    }

    public final void showShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
    }

    public final void hideShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getMax = containsFavoriteMenuItem.getMin((LinearLayout) _$_findCachedViewById(resetInternal.setMax.isShortcutsVisible), R.layout.view_skeleton_merchant_rating);
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, resetInternal.getMin.sendCustomAction) : null;
        if (obtainStyledAttributes != null) {
            try {
                setRating(Double.valueOf((double) obtainStyledAttributes.getFloat(1, 0.0f)));
                setNumberOfReviews(Double.valueOf((double) obtainStyledAttributes.getFloat(0, 0.0f)));
            } catch (Throwable th) {
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                throw th;
            }
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }
}
