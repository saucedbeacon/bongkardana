package id.dana.component.cellcomponent;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.ariver.kernel.RVParams;
import com.ap.zoloz.hummer.biz.HummerConstants;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.cancelAll;
import o.setBackgroundColorRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001bJ\u000e\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\"J\u000e\u0010'\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001bJ\b\u0010(\u001a\u00020\u000eH\u0016¨\u0006)"}, d2 = {"Lid/dana/component/cellcomponent/DanaCellSimpleView;", "Lid/dana/component/cellcomponent/BaseDanaCell;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getDrawable", "Landroid/graphics/drawable/Drawable;", "icon", "getLayout", "setArrowIcon", "", "setArrowIconSize", "width", "height", "setDrawableBorder", "setFontSubtitle", "typeface", "Landroid/graphics/Typeface;", "setFontTitle", "setIcon", "setIconSize", "setParentElevation", "elevation", "", "setParentHeight", "setParentWidth", "setRadius", "radius", "setSubitle", "subTitle", "", "setSubtitleSize", "size", "setTitle", "title", "setTitleSize", "setup", "design_release"}, k = 1, mv = {1, 4, 2})
public final class DanaCellSimpleView extends BaseDanaCell {
    private HashMap setMin;

    @JvmOverloads
    public DanaCellSimpleView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public DanaCellSimpleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
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

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DanaCellSimpleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DanaCellSimpleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final int getLayout() {
        return setBackgroundColorRes.toIntRange.view_dana_cell_simple_layout;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(setBackgroundColorRes.length.warmup);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    public final void setTitleSize(float f) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(setBackgroundColorRes.length.warmup);
        if (appCompatTextView != null) {
            appCompatTextView.setTextSize(f);
        }
    }

    public final void setFontTitle(@Nullable Typeface typeface) {
        AppCompatTextView appCompatTextView;
        if (typeface != null && (appCompatTextView = (AppCompatTextView) _$_findCachedViewById(setBackgroundColorRes.length.warmup)) != null) {
            appCompatTextView.setTypeface(typeface);
        }
    }

    public final void setSubitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RVParams.LONG_SUB_TITLE);
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(setBackgroundColorRes.length.getInterfaceDescriptor);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    public final void setSubtitleSize(float f) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(setBackgroundColorRes.length.getInterfaceDescriptor);
        if (appCompatTextView != null) {
            appCompatTextView.setTextSize(f);
        }
    }

    public final void setFontSubtitle(@Nullable Typeface typeface) {
        AppCompatTextView appCompatTextView;
        if (typeface != null && (appCompatTextView = (AppCompatTextView) _$_findCachedViewById(setBackgroundColorRes.length.getInterfaceDescriptor)) != null) {
            appCompatTextView.setTypeface(typeface);
        }
    }

    public final void setIcon(@DrawableRes int i) {
        Drawable drawable;
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(setBackgroundColorRes.length.Mean$Arithmetic);
        if (circleImageView != null) {
            if (i == 0) {
                drawable = null;
            } else {
                drawable = cancelAll.getMin(getContext(), i);
            }
            circleImageView.setImageDrawable(drawable);
        }
    }

    public final void setIconSize(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(setBackgroundColorRes.length.Mean$Arithmetic);
        if (!(circleImageView == null || (layoutParams2 = circleImageView.getLayoutParams()) == null)) {
            layoutParams2.width = i;
        }
        CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(setBackgroundColorRes.length.Mean$Arithmetic);
        if (circleImageView2 != null && (layoutParams = circleImageView2.getLayoutParams()) != null) {
            layoutParams.height = i2;
        }
    }

    public final void setArrowIcon(@DrawableRes int i) {
        Drawable drawable;
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(setBackgroundColorRes.length.invoke);
        if (appCompatImageView != null) {
            if (i == 0) {
                drawable = null;
            } else {
                drawable = cancelAll.getMin(getContext(), i);
            }
            appCompatImageView.setImageDrawable(drawable);
        }
    }

    public final void setArrowIconSize(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(setBackgroundColorRes.length.invoke);
        if (!(appCompatImageView == null || (layoutParams2 = appCompatImageView.getLayoutParams()) == null)) {
            layoutParams2.width = i;
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(setBackgroundColorRes.length.invoke);
        if (appCompatImageView2 != null && (layoutParams = appCompatImageView2.getLayoutParams()) != null) {
            layoutParams.height = i2;
        }
    }

    public final void setRadius(float f) {
        CardView cardView = (CardView) _$_findCachedViewById(setBackgroundColorRes.length.Grayscale$Algorithm);
        if (cardView != null) {
            cardView.setRadius(f);
        }
    }

    public final void setParentWidth(int i) {
        ViewGroup.LayoutParams layoutParams;
        CardView cardView = (CardView) _$_findCachedViewById(setBackgroundColorRes.length.Grayscale$Algorithm);
        if (cardView != null && (layoutParams = cardView.getLayoutParams()) != null) {
            layoutParams.width = i;
        }
    }

    public final void setParentHeight(int i) {
        ViewGroup.LayoutParams layoutParams;
        CardView cardView = (CardView) _$_findCachedViewById(setBackgroundColorRes.length.Grayscale$Algorithm);
        if (cardView != null && (layoutParams = cardView.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
    }

    public final void setParentElevation(float f) {
        CardView cardView = (CardView) _$_findCachedViewById(setBackgroundColorRes.length.Grayscale$Algorithm);
        if (cardView != null) {
            cardView.setCardElevation(f);
        }
    }

    public final void setDrawableBorder(@DrawableRes int i) {
        Drawable drawable;
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(setBackgroundColorRes.length.toIntRange);
        if (constraintLayout != null) {
            if (i == 0) {
                drawable = null;
            } else {
                drawable = cancelAll.getMin(getContext(), i);
            }
            constraintLayout.setBackground(drawable);
        }
    }
}
