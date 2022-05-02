package id.dana.component.cellcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.cancelAll;
import o.setBackgroundColorRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J$\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J$\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u0007J\u001a\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u001a\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u0007J\u001a\u0010 \u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010 \u001a\u00020\u001c2\b\b\u0001\u0010\u0019\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bJ$\u0010!\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ$\u0010!\u001a\u00020\u001c2\b\b\u0001\u0010\u0019\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\"\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\"\u001a\u00020\u001c2\b\b\u0001\u0010\u0019\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010#\u001a\u00020\u001c2\b\b\u0001\u0010$\u001a\u00020\u0007J\u0010\u0010#\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010%\u001a\u00020\u001c2\b\b\u0001\u0010$\u001a\u00020\u00072\b\b\u0001\u0010&\u001a\u00020\u0007J\u001a\u0010%\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u000bJ\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u001cH\u0016R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lid/dana/component/cellcomponent/DanaCellLeftView;", "Lid/dana/component/cellcomponent/BaseDanaCell;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cellType", "description", "", "iconCell", "Landroid/widget/ImageView;", "getIconCell", "()Landroid/widget/ImageView;", "iconCellRight", "getIconCellRight", "iconRes", "iconResRight", "isSmallCell", "", "label", "getDrawable", "Landroid/graphics/drawable/Drawable;", "icon", "getLayout", "parseAttrs", "", "setCellLabelDescIcon", "labelText", "setCellLabelIcon", "setCellLeftIconLabel", "setCellLeftIconLabelDesc", "setCellLeftIconLabelIndent", "setCellLeftLabel", "labelRes", "setCellLeftLabelDesc", "descRes", "descText", "setDanaCellLeftView", "setup", "design_release"}, k = 1, mv = {1, 4, 2})
public final class DanaCellLeftView extends BaseDanaCell {
    private int IsOverlapping;
    private int getMax;
    private String getMin;
    private HashMap isInside;
    private boolean length;
    private int setMax;
    private String setMin;

    @JvmOverloads
    public DanaCellLeftView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public DanaCellLeftView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DanaCellLeftView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DanaCellLeftView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @Nullable
    public final ImageView getIconCell() {
        if (this.getMax == 0) {
            return null;
        }
        return (ImageView) findViewById(setBackgroundColorRes.length.extraCallback);
    }

    @Nullable
    public final ImageView getIconCellRight() {
        int i = this.getMax;
        if (i == 7 || i == 8) {
            return (ImageView) findViewById(setBackgroundColorRes.length.extraCallbackWithResult);
        }
        return null;
    }

    public final int getLayout() {
        int i = this.getMax;
        if (i == 5 || i == 6) {
            return setBackgroundColorRes.toIntRange.view_dana_cell_left_circle_logo;
        }
        return setBackgroundColorRes.toIntRange.view_dana_cell_left;
    }

    public final void parseAttrs(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Resources.Theme theme = context.getTheme();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.ITrustedWebActivityCallback$Stub, 0, 0);
            try {
                this.getMax = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.getSmallIconBitmap, 0);
                this.setMax = obtainStyledAttributes.getResourceId(setBackgroundColorRes.IsOverlapping.areNotificationsEnabled, 0);
                this.setMin = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.cancelNotification);
                this.getMin = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.ITrustedWebActivityCallback$Stub$Proxy);
                this.length = obtainStyledAttributes.getBoolean(setBackgroundColorRes.IsOverlapping.ITrustedWebActivityCallback$Default, false);
                this.IsOverlapping = obtainStyledAttributes.getResourceId(setBackgroundColorRes.IsOverlapping.ITrustedWebActivityService, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void setCellLeftLabel(@StringRes int i) {
        setCellLeftLabel(getContext().getString(i));
    }

    public final void setCellLeftLabel(@Nullable String str) {
        setPaddingCell((ConstraintLayout) _$_findCachedViewById(setBackgroundColorRes.length.toString), 0);
        TextView textView = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.requestPostMessageChannel);
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public final void setCellLeftLabelDesc(@StringRes int i, @StringRes int i2) {
        setCellLeftLabelDesc(getContext().getString(i), getContext().getString(i2));
    }

    public final void setCellLeftLabelDesc(@Nullable String str, @Nullable String str2) {
        setPaddingCell((ConstraintLayout) _$_findCachedViewById(setBackgroundColorRes.length.toString), 0);
        TextView textView = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.requestPostMessageChannel);
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.updateVisuals);
        if (textView2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        }
    }

    public final void setCellLeftIconLabel(@Nullable Drawable drawable, @Nullable String str) {
        ImageView iconCell = getIconCell();
        if (iconCell != null) {
            iconCell.setImageDrawable(drawable);
            iconCell.setVisibility(0);
        }
        TextView textView = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.requestPostMessageChannel);
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public final void setCellLeftIconLabelIndent(@Nullable Drawable drawable, @Nullable String str) {
        ImageView iconCell = getIconCell();
        if (iconCell != null) {
            iconCell.setImageDrawable(drawable);
            iconCell.setVisibility(0);
        }
        TextView textView = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.requestPostMessageChannel);
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        setPaddingCell((ConstraintLayout) _$_findCachedViewById(setBackgroundColorRes.length.toString), (int) (Resources.getSystem().getDisplayMetrics().density * 32.0f));
    }

    public final void setCellLeftIconLabelDesc(@Nullable Drawable drawable, @Nullable String str, @Nullable String str2) {
        ImageView iconCell = getIconCell();
        if (iconCell != null) {
            iconCell.setImageDrawable(drawable);
            iconCell.setVisibility(0);
        }
        TextView textView = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.requestPostMessageChannel);
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.updateVisuals);
        if (textView2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        }
    }

    public final void setCellLabelIcon(@Nullable String str, @Nullable Drawable drawable) {
        setPaddingCell((ConstraintLayout) _$_findCachedViewById(setBackgroundColorRes.length.toString), 0);
        TextView textView = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.requestPostMessageChannel);
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        ImageView iconCellRight = getIconCellRight();
        if (iconCellRight != null) {
            iconCellRight.setImageDrawable(drawable);
            iconCellRight.setVisibility(0);
        }
    }

    public final void setCellLabelDescIcon(@Nullable String str, @Nullable String str2, @Nullable Drawable drawable) {
        setPaddingCell((ConstraintLayout) _$_findCachedViewById(setBackgroundColorRes.length.toString), 0);
        TextView textView = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.requestPostMessageChannel);
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(setBackgroundColorRes.length.updateVisuals);
        if (textView2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        }
        ImageView iconCellRight = getIconCellRight();
        if (iconCellRight != null) {
            iconCellRight.setImageDrawable(drawable);
            iconCellRight.setVisibility(0);
        }
    }

    public final void setup() {
        switch (this.getMax) {
            case 0:
                setCellLeftLabel(this.setMin);
                break;
            case 1:
                setCellLeftLabelDesc(this.setMin, this.getMin);
                break;
            case 2:
            case 5:
                setCellLeftIconLabel(this.setMax, this.setMin);
                break;
            case 3:
                setCellLeftIconLabelIndent(this.setMax, this.setMin);
                break;
            case 4:
            case 6:
                setCellLeftIconLabelDesc(this.setMax, this.setMin, this.getMin);
                break;
            case 7:
                setCellLabelIcon(this.setMin, this.IsOverlapping);
                break;
            case 8:
                setCellLabelDescIcon(this.setMin, this.getMin, this.IsOverlapping);
                break;
        }
        vallidateSmallCell((ConstraintLayout) _$_findCachedViewById(setBackgroundColorRes.length.toString), this.length);
    }

    public final void setCellLeftIconLabel(@DrawableRes int i, @Nullable String str) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = cancelAll.getMin(getContext(), i);
        }
        setCellLeftIconLabel(drawable, str);
    }

    public final void setCellLeftIconLabelIndent(@DrawableRes int i, @Nullable String str) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = cancelAll.getMin(getContext(), i);
        }
        setCellLeftIconLabelIndent(drawable, str);
    }

    public final void setCellLeftIconLabelDesc(@DrawableRes int i, @Nullable String str, @Nullable String str2) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = cancelAll.getMin(getContext(), i);
        }
        setCellLeftIconLabelDesc(drawable, str, str2);
    }

    public final void setCellLabelIcon(@Nullable String str, @DrawableRes int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = cancelAll.getMin(getContext(), i);
        }
        setCellLabelIcon(str, drawable);
    }

    public final void setCellLabelDescIcon(@Nullable String str, @Nullable String str2, @DrawableRes int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = cancelAll.getMin(getContext(), i);
        }
        setCellLabelDescIcon(str, str2, drawable);
    }
}
