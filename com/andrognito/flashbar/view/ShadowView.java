package com.andrognito.flashbar.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.getCollapseContentDescription;
import o.getContentInsetStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0012\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lcom/andrognito/flashbar/view/ShadowView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "applyShadow", "", "type", "Lcom/andrognito/flashbar/view/ShadowView$ShadowType;", "applyShadow$flashbar_release", "setShadow", "id", "ShadowType", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class ShadowView extends View {
    private HashMap setMax;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/andrognito/flashbar/view/ShadowView$ShadowType;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public enum ShadowType {
        TOP,
        BOTTOM
    }

    @JvmOverloads
    public ShadowView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ShadowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public /* synthetic */ ShadowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShadowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
    }

    public final void applyShadow$flashbar_release(@NotNull ShadowType shadowType) {
        Intrinsics.checkParameterIsNotNull(shadowType, "type");
        int i = getContentInsetStart.getMin[shadowType.ordinal()];
        if (i == 1) {
            Drawable length = IntRange.length(getContext(), getCollapseContentDescription.setMax.shadow_top);
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(length);
            } else {
                setBackgroundDrawable(length);
            }
        } else if (i == 2) {
            Drawable length2 = IntRange.length(getContext(), getCollapseContentDescription.setMax.shadow_bottom);
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(length2);
            } else {
                setBackgroundDrawable(length2);
            }
        }
    }
}
