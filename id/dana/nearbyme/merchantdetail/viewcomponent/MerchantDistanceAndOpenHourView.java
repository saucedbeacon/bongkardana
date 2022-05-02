package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.containsFavoriteMenuItem;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u001c\u0010\u0019\u001a\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\u0006\u0010\u001e\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDistanceAndOpenHourView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "distanceSkeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "value", "", "distanceText", "getDistanceText", "()Ljava/lang/String;", "setDistanceText", "(Ljava/lang/String;)V", "openHourSkeleton", "openHoursText", "getOpenHoursText", "setOpenHoursText", "getLayout", "", "hideShimmer", "", "onAttachedToWindow", "parseAttrs", "attrs", "setup", "setupDistanceSkeleton", "setupOpenHourSkeleton", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDistanceAndOpenHourView extends BaseRichView {
    private onDetachedFromLayoutParams getMax;
    private final AttributeSet getMin;
    private HashMap isInside;
    @Nullable
    private String length = "-";
    private onDetachedFromLayoutParams setMax;
    @Nullable
    private String setMin = "";

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_distance_and_open_hour;
    }

    public final void setup() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantDistanceAndOpenHourView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.getMin = attributeSet;
    }

    @Nullable
    public final String getDistanceText() {
        return this.setMin;
    }

    public final void setDistanceText(@Nullable String str) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setTextOff);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
        this.setMin = str;
    }

    @Nullable
    public final String getOpenHoursText() {
        return this.length;
    }

    public final void setOpenHoursText(@Nullable String str) {
        AppCompatTextView appCompatTextView;
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0) && (appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.addSystemView)) != null) {
            appCompatTextView.setText(charSequence);
        }
        this.length = str;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getMax = containsFavoriteMenuItem.getMin((AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setTextOff), R.layout.view_skeleton_distance_value);
        this.setMax = containsFavoriteMenuItem.getMin((AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.addSystemView), R.layout.view_skeleton_open_hour_value);
    }

    public final void showShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams2 = this.getMax;
        if (ondetachedfromlayoutparams2 != null) {
            ondetachedfromlayoutparams2.getMin();
        }
    }

    public final void hideShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams2 = this.getMax;
        if (ondetachedfromlayoutparams2 != null) {
            ondetachedfromlayoutparams2.length();
        }
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        String str;
        String str2 = null;
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, resetInternal.getMin.rate) : null;
        if (obtainStyledAttributes != null) {
            try {
                str = obtainStyledAttributes.getString(0);
            } catch (Throwable th) {
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                throw th;
            }
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        setDistanceText(str);
        if (obtainStyledAttributes != null) {
            str2 = obtainStyledAttributes.getString(1);
        }
        if (str2 != null) {
            str3 = str2;
        }
        setOpenHoursText(str3);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }
}
