package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.isBaselineAligned;
import o.isMeasureWithLargestChildEnabled;
import o.layoutVertical;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0004J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/BaseSubLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "setDialog", "(Lcom/afollestad/materialdialogs/MaterialDialog;)V", "dividerHeight", "", "getDividerHeight", "()I", "dividerPaint", "Landroid/graphics/Paint;", "value", "", "drawDivider", "getDrawDivider", "()Z", "setDrawDivider", "(Z)V", "getDividerColor", "core"}, k = 1, mv = {1, 1, 16})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class BaseSubLayout extends ViewGroup {
    @NotNull
    public isBaselineAligned dialog;
    private final int dividerHeight;
    private final Paint dividerPaint;
    private boolean drawDivider;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseSubLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseSubLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        this.dividerPaint = new Paint();
        this.dividerHeight = layoutVertical.INSTANCE.dimenPx(this, isMeasureWithLargestChildEnabled.setMax.md_divider_height);
        setWillNotDraw(false);
        this.dividerPaint.setStyle(Paint.Style.STROKE);
        this.dividerPaint.setStrokeWidth(context.getResources().getDimension(isMeasureWithLargestChildEnabled.setMax.md_divider_height));
        this.dividerPaint.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public final int getDividerHeight() {
        return this.dividerHeight;
    }

    @NotNull
    public final isBaselineAligned getDialog() {
        isBaselineAligned isbaselinealigned = this.dialog;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ImagePickerEvent.DIALOG);
        }
        return isbaselinealigned;
    }

    public final void setDialog(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "<set-?>");
        this.dialog = isbaselinealigned;
    }

    public final boolean getDrawDivider() {
        return this.drawDivider;
    }

    public final void setDrawDivider(boolean z) {
        this.drawDivider = z;
        invalidate();
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final Paint dividerPaint() {
        this.dividerPaint.setColor(getDividerColor());
        return this.dividerPaint;
    }

    private final int getDividerColor() {
        layoutVertical layoutvertical = layoutVertical.INSTANCE;
        isBaselineAligned isbaselinealigned = this.dialog;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ImagePickerEvent.DIALOG);
        }
        Context context = isbaselinealigned.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        return layoutVertical.resolveColor$default(layoutvertical, context, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_divider_color), (Function0) null, 10, (Object) null);
    }
}
