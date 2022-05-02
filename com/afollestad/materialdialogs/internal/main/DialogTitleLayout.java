package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.isMeasureWithLargestChildEnabled;
import o.layoutHorizontal;
import o.layoutVertical;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0014J0\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0014J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0014J\u0006\u0010(\u001a\u00020 R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "Lcom/afollestad/materialdialogs/internal/main/BaseSubLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "frameMarginHorizontal", "", "frameMarginVertical", "iconMargin", "iconSize", "iconView", "Landroid/widget/ImageView;", "getIconView$core", "()Landroid/widget/ImageView;", "setIconView$core", "(Landroid/widget/ImageView;)V", "titleMarginBottom", "titleView", "Landroid/widget/TextView;", "getTitleView$core", "()Landroid/widget/TextView;", "setTitleView$core", "(Landroid/widget/TextView;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onFinishInflate", "onLayout", "changed", "", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "shouldNotBeVisible", "core"}, k = 1, mv = {1, 1, 16})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogTitleLayout extends BaseSubLayout {
    private final int frameMarginHorizontal;
    private final int frameMarginVertical;
    private final int iconMargin;
    private final int iconSize;
    @NotNull
    public ImageView iconView;
    private final int titleMarginBottom;
    @NotNull
    public TextView titleView;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogTitleLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogTitleLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        this.frameMarginVertical = layoutVertical.INSTANCE.dimenPx(this, isMeasureWithLargestChildEnabled.setMax.md_dialog_frame_margin_vertical);
        this.titleMarginBottom = layoutVertical.INSTANCE.dimenPx(this, isMeasureWithLargestChildEnabled.setMax.md_dialog_title_layout_margin_bottom);
        this.frameMarginHorizontal = layoutVertical.INSTANCE.dimenPx(this, isMeasureWithLargestChildEnabled.setMax.md_dialog_frame_margin_horizontal);
        this.iconMargin = layoutVertical.INSTANCE.dimenPx(this, isMeasureWithLargestChildEnabled.setMax.md_icon_margin);
        this.iconSize = layoutVertical.INSTANCE.dimenPx(this, isMeasureWithLargestChildEnabled.setMax.md_icon_size);
    }

    @NotNull
    public final ImageView getIconView$core() {
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        return imageView;
    }

    public final void setIconView$core(@NotNull ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "<set-?>");
        this.iconView = imageView;
    }

    @NotNull
    public final TextView getTitleView$core() {
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        return textView;
    }

    public final void setTitleView$core(@NotNull TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.titleView = textView;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(isMeasureWithLargestChildEnabled.getMin.md_icon_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.md_icon_title)");
        this.iconView = (ImageView) findViewById;
        View findViewById2 = findViewById(isMeasureWithLargestChildEnabled.getMin.md_text_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.md_text_title)");
        this.titleView = (TextView) findViewById2;
    }

    public final boolean shouldNotBeVisible() {
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (!layoutHorizontal.isNotVisible(imageView)) {
            return false;
        }
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        return layoutHorizontal.isNotVisible(textView);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        if (shouldNotBeVisible()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = size - (this.frameMarginHorizontal * 2);
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (layoutHorizontal.isVisible(imageView)) {
            ImageView imageView2 = this.iconView;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(this.iconSize, 1073741824), View.MeasureSpec.makeMeasureSpec(this.iconSize, 1073741824));
            ImageView imageView3 = this.iconView;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            i4 -= imageView3.getMeasuredWidth() + this.iconMargin;
        }
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        ImageView imageView4 = this.iconView;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (layoutHorizontal.isVisible(imageView4)) {
            ImageView imageView5 = this.iconView;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            i3 = imageView5.getMeasuredHeight();
        }
        TextView textView2 = this.titleView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        setMeasuredDimension(size, RangesKt.coerceAtLeast(i3, textView2.getMeasuredHeight()) + this.frameMarginVertical + this.titleMarginBottom);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int measuredWidth;
        if (!shouldNotBeVisible()) {
            int i10 = this.frameMarginVertical;
            int measuredHeight = getMeasuredHeight() - this.titleMarginBottom;
            int i11 = measuredHeight - ((measuredHeight - i10) / 2);
            TextView textView = this.titleView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            int measuredHeight2 = textView.getMeasuredHeight() / 2;
            int i12 = i11 - measuredHeight2;
            int i13 = measuredHeight2 + i11;
            layoutVertical layoutvertical = layoutVertical.INSTANCE;
            TextView textView2 = this.titleView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            int additionalPaddingForFont = i13 + layoutvertical.additionalPaddingForFont(textView2);
            if (layoutHorizontal.isRtl(this)) {
                i5 = getMeasuredWidth() - this.frameMarginHorizontal;
                TextView textView3 = this.titleView;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                i6 = i5 - textView3.getMeasuredWidth();
            } else {
                i6 = this.frameMarginHorizontal;
                TextView textView4 = this.titleView;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                i5 = textView4.getMeasuredWidth() + i6;
            }
            ImageView imageView = this.iconView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            if (layoutHorizontal.isVisible(imageView)) {
                ImageView imageView2 = this.iconView;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iconView");
                }
                int measuredHeight3 = imageView2.getMeasuredHeight() / 2;
                int i14 = i11 - measuredHeight3;
                int i15 = i11 + measuredHeight3;
                if (layoutHorizontal.isRtl(this)) {
                    ImageView imageView3 = this.iconView;
                    if (imageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("iconView");
                    }
                    int measuredWidth2 = i5 - imageView3.getMeasuredWidth();
                    int i16 = measuredWidth2 - this.iconMargin;
                    TextView textView5 = this.titleView;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titleView");
                    }
                    i7 = measuredWidth2;
                    i9 = i5;
                    measuredWidth = i16;
                    i8 = i16 - textView5.getMeasuredWidth();
                } else {
                    ImageView imageView4 = this.iconView;
                    if (imageView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("iconView");
                    }
                    int measuredWidth3 = imageView4.getMeasuredWidth() + i6;
                    i8 = this.iconMargin + measuredWidth3;
                    TextView textView6 = this.titleView;
                    if (textView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titleView");
                    }
                    i7 = i6;
                    i9 = measuredWidth3;
                    measuredWidth = textView6.getMeasuredWidth() + i8;
                }
                int i17 = i7;
                ImageView imageView5 = this.iconView;
                if (imageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iconView");
                }
                imageView5.layout(i17, i14, i9, i15);
                i6 = i8;
            }
            TextView textView7 = this.titleView;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            textView7.layout(i6, i12, i5, additionalPaddingForFont);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, ((float) getMeasuredHeight()) - ((float) getDividerHeight()), (float) getMeasuredWidth(), (float) getMeasuredHeight(), dividerPaint());
        }
    }
}
