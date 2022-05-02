package com.andrognito.flashbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.andrognito.flashbar.Flashbar;
import com.andrognito.flashbar.view.FbButton;
import com.andrognito.flashbar.view.FbProgress;
import com.andrognito.flashbar.view.ShadowView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ensureMenu;
import o.getCollapseContentDescription;
import o.getNavigationIcon;
import o.setCollapseContentDescription;
import o.setNavigationIcon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0015J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u001d\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ%\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0002\b!J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014J\u001b\u0010%\u001a\u00020\u000f2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0002\b,J\u0017\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0002\b0J\u0017\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0002\b4J#\u00105\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010\u00062\b\u00107\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0002\b=J\u0017\u0010>\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0002\bAJ\u0019\u0010B\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bD\u0010(J\u0019\u0010E\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bF\u0010(J\u0019\u0010G\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0004\bM\u0010KJ\u0017\u0010N\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0002\bPJ\u0017\u0010Q\u001a\u00020\u000f2\b\u0010R\u001a\u0004\u0018\u00010SH\u0000¢\u0006\u0002\bTJ\u0017\u0010U\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010VH\u0000¢\u0006\u0002\bWJ\u0017\u0010X\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0002\bZJ\u0019\u0010[\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\\\u0010(J\u0019\u0010]\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b^\u0010(J\u0019\u0010_\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0004\b`\u0010KJ\u0019\u0010a\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0004\bb\u0010KJ\u0017\u0010c\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0002\bdJ\u0017\u0010e\u001a\u00020\u000f2\b\u0010R\u001a\u0004\u0018\u00010SH\u0000¢\u0006\u0002\bfJ\u0017\u0010g\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010VH\u0000¢\u0006\u0002\bhJ\u0017\u0010i\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0002\bjJ\u0019\u0010k\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bl\u0010(J\u0019\u0010m\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bn\u0010(J\u0019\u0010o\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0004\bp\u0010KJ\u0019\u0010q\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0004\br\u0010KJ\u0017\u0010s\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0002\btJ\u0017\u0010u\u001a\u00020\u000f2\b\u0010R\u001a\u0004\u0018\u00010SH\u0000¢\u0006\u0002\bvJ\u0017\u0010w\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010VH\u0000¢\u0006\u0002\bxJ\u0017\u0010y\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0002\bzJ\u0019\u0010{\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b|\u0010(J\u0019\u0010}\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b~\u0010(J\u001a\u0010\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0005\b\u0001\u0010KJ\u001b\u0010\u0001\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0005\b\u0001\u0010KJ\u0019\u0010\u0001\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0003\b\u0001J\u0019\u0010\u0001\u001a\u00020\u000f2\b\u0010R\u001a\u0004\u0018\u00010SH\u0000¢\u0006\u0003\b\u0001J\u001b\u0010\u0001\u001a\u00020\u000f2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0000¢\u0006\u0003\b\u0001J)\u0010\u0001\u001a\u00020\u000f2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00062\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u000f2\t\u0010\u0001\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0003\b\u0001J\u001c\u0010\u0001\u001a\u00020\u000f2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u0001\u0010(J\u001b\u0010\u0001\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u0001\u0010(J\u001b\u0010\u0001\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0005\b\u0001\u0010KJ\u001b\u0010\u0001\u001a\u00020\u000f2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0005\b\u0001\u0010KJ\u001a\u0010\u0001\u001a\u00020\u000f2\t\u0010\u0001\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0003\b\u0001J\u0019\u0010\u0001\u001a\u00020\u000f2\b\u0010R\u001a\u0004\u0018\u00010SH\u0000¢\u0006\u0003\b\u0001J\u0018\u0010\u0001\u001a\u00020\u000f2\u0007\u0010\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0003\b \u0001J$\u0010¡\u0001\u001a\u00020\u000f2\u0007\u0010¢\u0001\u001a\u00020I2\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u0001H\u0000¢\u0006\u0003\b¥\u0001J\u001b\u0010¦\u0001\u001a\u00020\u000f2\n\u0010§\u0001\u001a\u0005\u0018\u00010¨\u0001H\u0000¢\u0006\u0003\b©\u0001J\u000f\u0010ª\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0003\b«\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006¬\u0001"}, d2 = {"Lcom/andrognito/flashbar/FlashbarView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "BOTTOM_COMPENSATION_MARGIN", "", "TOP_COMPENSATION_MARGIN", "gravity", "Lcom/andrognito/flashbar/Flashbar$Gravity;", "isMarginCompensationApplied", "", "parentFlashbarContainer", "Lcom/andrognito/flashbar/FlashbarContainerView;", "addParent", "", "flashbarContainerView", "addParent$flashbar_release", "adjustWitPositionAndOrientation", "activity", "Landroid/app/Activity;", "adjustWitPositionAndOrientation$flashbar_release", "castShadow", "shadowType", "Lcom/andrognito/flashbar/view/ShadowView$ShadowType;", "strength", "enableSwipeToDismiss", "enable", "callbacks", "Lcom/andrognito/flashbar/SwipeDismissTouchListener$DismissCallbacks;", "enableSwipeToDismiss$flashbar_release", "init", "shadowStrength", "init$flashbar_release", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setBarBackgroundColor", "color", "setBarBackgroundColor$flashbar_release", "(Ljava/lang/Integer;)V", "setBarBackgroundDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setBarBackgroundDrawable$flashbar_release", "setBarTapListener", "listener", "Lcom/andrognito/flashbar/Flashbar$OnTapListener;", "setBarTapListener$flashbar_release", "setIconBitmap", "bitmap", "Landroid/graphics/Bitmap;", "setIconBitmap$flashbar_release", "setIconColorFilter", "colorFilter", "filterMode", "Landroid/graphics/PorterDuff$Mode;", "setIconColorFilter$flashbar_release", "(Ljava/lang/Integer;Landroid/graphics/PorterDuff$Mode;)V", "setIconDrawable", "icon", "setIconDrawable$flashbar_release", "setMessage", "message", "", "setMessage$flashbar_release", "setMessageAppearance", "messageAppearance", "setMessageAppearance$flashbar_release", "setMessageColor", "setMessageColor$flashbar_release", "setMessageSizeInPx", "size", "", "setMessageSizeInPx$flashbar_release", "(Ljava/lang/Float;)V", "setMessageSizeInSp", "setMessageSizeInSp$flashbar_release", "setMessageSpanned", "Landroid/text/Spanned;", "setMessageSpanned$flashbar_release", "setMessageTypeface", "typeface", "Landroid/graphics/Typeface;", "setMessageTypeface$flashbar_release", "setNegativeActionTapListener", "Lcom/andrognito/flashbar/Flashbar$OnActionTapListener;", "setNegativeActionTapListener$flashbar_release", "setNegativeActionText", "text", "setNegativeActionText$flashbar_release", "setNegativeActionTextAppearance", "setNegativeActionTextAppearance$flashbar_release", "setNegativeActionTextColor", "setNegativeActionTextColor$flashbar_release", "setNegativeActionTextSizeInPx", "setNegativeActionTextSizeInPx$flashbar_release", "setNegativeActionTextSizeInSp", "setNegativeActionTextSizeInSp$flashbar_release", "setNegativeActionTextSpanned", "setNegativeActionTextSpanned$flashbar_release", "setNegativeActionTextTypeface", "setNegativeActionTextTypeface$flashbar_release", "setPositiveActionTapListener", "setPositiveActionTapListener$flashbar_release", "setPositiveActionText", "setPositiveActionText$flashbar_release", "setPositiveActionTextAppearance", "setPositiveActionTextAppearance$flashbar_release", "setPositiveActionTextColor", "setPositiveActionTextColor$flashbar_release", "setPositiveActionTextSizeInPx", "setPositiveActionTextSizeInPx$flashbar_release", "setPositiveActionTextSizeInSp", "setPositiveActionTextSizeInSp$flashbar_release", "setPositiveActionTextSpanned", "setPositiveActionTextSpanned$flashbar_release", "setPositiveActionTextTypeface", "setPositiveActionTextTypeface$flashbar_release", "setPrimaryActionTapListener", "setPrimaryActionTapListener$flashbar_release", "setPrimaryActionText", "setPrimaryActionText$flashbar_release", "setPrimaryActionTextAppearance", "setPrimaryActionTextAppearance$flashbar_release", "setPrimaryActionTextColor", "setPrimaryActionTextColor$flashbar_release", "setPrimaryActionTextSizeInPx", "setPrimaryActionTextSizeInPx$flashbar_release", "setPrimaryActionTextSizeInSp", "setPrimaryActionTextSizeInSp$flashbar_release", "setPrimaryActionTextSpanned", "setPrimaryActionTextSpanned$flashbar_release", "setPrimaryActionTextTypeface", "setPrimaryActionTextTypeface$flashbar_release", "setProgressPosition", "position", "Lcom/andrognito/flashbar/Flashbar$ProgressPosition;", "setProgressPosition$flashbar_release", "setProgressTint", "progressTint", "setProgressTint$flashbar_release", "(Ljava/lang/Integer;Lcom/andrognito/flashbar/Flashbar$ProgressPosition;)V", "setTitle", "title", "setTitle$flashbar_release", "setTitleAppearance", "titleAppearance", "setTitleAppearance$flashbar_release", "setTitleColor", "setTitleColor$flashbar_release", "setTitleSizeInPx", "setTitleSizeInPx$flashbar_release", "setTitleSizeInSp", "setTitleSizeInSp$flashbar_release", "setTitleSpanned", "setTitleSpanned$flashbar_release", "setTitleTypeface", "setTitleTypeface$flashbar_release", "showIcon", "showIcon$flashbar_release", "showIconScale", "scale", "scaleType", "Landroid/widget/ImageView$ScaleType;", "showIconScale$flashbar_release", "startIconAnimation", "animator", "Lcom/andrognito/flashbar/anim/FlashAnimIconBuilder;", "startIconAnimation$flashbar_release", "stopIconAnimation", "stopIconAnimation$flashbar_release", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class FlashbarView extends LinearLayout {
    private HashMap IsOverlapping;
    private final int getMax = ((int) getResources().getDimension(getCollapseContentDescription.getMax.setMax));
    private final int getMin = ((int) getResources().getDimension(getCollapseContentDescription.getMax.getMin));
    /* access modifiers changed from: private */
    public FlashbarContainerView length;
    private boolean setMax;
    private Flashbar.Gravity setMin;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashbarView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public static final /* synthetic */ FlashbarContainerView access$getParentFlashbarContainer$p(FlashbarView flashbarView) {
        FlashbarContainerView flashbarContainerView = flashbarView.length;
        if (flashbarContainerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentFlashbarContainer");
        }
        return flashbarContainerView;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.setMax) {
            this.setMax = true;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Flashbar.Gravity gravity = this.setMin;
                if (gravity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gravity");
                }
                int i3 = setNavigationIcon.getMax[gravity.ordinal()];
                if (i3 == 1) {
                    marginLayoutParams.topMargin = -this.getMax;
                } else if (i3 == 2) {
                    marginLayoutParams.bottomMargin = -this.getMin;
                }
                requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void init$flashbar_release(@NotNull Flashbar.Gravity gravity, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(gravity, "gravity");
        this.setMin = gravity;
        setOrientation(1);
        if (z && gravity == Flashbar.Gravity.BOTTOM) {
            setMin(ShadowView.ShadowType.TOP, i);
        }
        LinearLayout.inflate(getContext(), getCollapseContentDescription.toIntRange.flash_bar_view, this);
        if (z && gravity == Flashbar.Gravity.TOP) {
            setMin(ShadowView.ShadowType.BOTTOM, i);
        }
    }

    public final void adjustWitPositionAndOrientation$flashbar_release(@NotNull Activity activity, @NotNull Flashbar.Gravity gravity) {
        Intrinsics.checkParameterIsNotNull(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkParameterIsNotNull(gravity, "gravity");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        Rect rect = new Rect();
        Window window = activity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        View findViewById = activity.getWindow().findViewById(16908290);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "window.findViewById<View…indow.ID_ANDROID_CONTENT)");
        int top = findViewById.getTop();
        if (top != 0) {
            i = top - i;
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.setMax);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "fbContent");
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (layoutParams2 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            int i2 = setNavigationIcon.setMin[gravity.ordinal()];
            if (i2 == 1) {
                layoutParams3.topMargin = i + (this.getMax / 2);
                layoutParams.addRule(10);
            } else if (i2 == 2) {
                layoutParams3.bottomMargin = this.getMin;
                layoutParams.addRule(12);
            }
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.setMax);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "fbContent");
            linearLayout2.setLayoutParams(layoutParams3);
            setLayoutParams(layoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void addParent$flashbar_release(@NotNull FlashbarContainerView flashbarContainerView) {
        Intrinsics.checkParameterIsNotNull(flashbarContainerView, "flashbarContainerView");
        this.length = flashbarContainerView;
    }

    public final void setBarBackgroundDrawable$flashbar_release(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.toIntRange);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "this.fbRoot");
                linearLayout.setBackground(drawable);
                return;
            }
            ((LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.toIntRange)).setBackgroundDrawable(drawable);
        }
    }

    public final void setBarBackgroundColor$flashbar_release(@Nullable @ColorInt Integer num) {
        if (num != null) {
            ((LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.toIntRange)).setBackgroundColor(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    static final class length implements View.OnClickListener {
        final /* synthetic */ FlashbarView getMin;
        final /* synthetic */ Flashbar.equals length;

        length(FlashbarView flashbarView, Flashbar.equals equals) {
            this.getMin = flashbarView;
            this.length = equals;
        }

        public final void onClick(View view) {
            FlashbarView.access$getParentFlashbarContainer$p(this.getMin).getParentFlashbar$flashbar_release();
        }
    }

    public final void setBarTapListener$flashbar_release(@Nullable Flashbar.equals equals) {
        if (equals != null) {
            ((LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.toIntRange)).setOnClickListener(new length(this, equals));
        }
    }

    public final void setTitle$flashbar_release(@Nullable String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            TextView textView = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString);
            Intrinsics.checkExpressionValueIsNotNull(textView, "this.fbTitle");
            textView.setText(charSequence);
            TextView textView2 = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "this.fbTitle");
            textView2.setVisibility(0);
        }
    }

    public final void setTitleSpanned$flashbar_release(@Nullable Spanned spanned) {
        if (spanned != null) {
            TextView textView = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString);
            Intrinsics.checkExpressionValueIsNotNull(textView, "this.fbTitle");
            textView.setText(spanned);
            TextView textView2 = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "this.fbTitle");
            textView2.setVisibility(0);
        }
    }

    public final void setTitleTypeface$flashbar_release(@Nullable Typeface typeface) {
        if (typeface != null) {
            TextView textView = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString);
            Intrinsics.checkExpressionValueIsNotNull(textView, "fbTitle");
            textView.setTypeface(typeface);
        }
    }

    public final void setTitleSizeInPx$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString)).setTextSize(0, f.floatValue());
        }
    }

    public final void setTitleSizeInSp$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString)).setTextSize(2, f.floatValue());
        }
    }

    public final void setTitleColor$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString)).setTextColor(num.intValue());
        }
    }

    public final void setTitleAppearance$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString)).setTextAppearance(num.intValue());
                return;
            }
            TextView textView = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString);
            Intrinsics.checkExpressionValueIsNotNull(textView, "fbTitle");
            ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.toString)).setTextAppearance(textView.getContext(), num.intValue());
        }
    }

    public final void setMessage$flashbar_release(@Nullable String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            TextView textView = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.length);
            Intrinsics.checkExpressionValueIsNotNull(textView, "this.fbMessage");
            textView.setText(charSequence);
            TextView textView2 = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.length);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "this.fbMessage");
            textView2.setVisibility(0);
        }
    }

    public final void setMessageSpanned$flashbar_release(@Nullable Spanned spanned) {
        if (spanned != null) {
            TextView textView = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.length);
            Intrinsics.checkExpressionValueIsNotNull(textView, "this.fbMessage");
            textView.setText(spanned);
            TextView textView2 = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.length);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "this.fbMessage");
            textView2.setVisibility(0);
        }
    }

    public final void setMessageTypeface$flashbar_release(@Nullable Typeface typeface) {
        if (typeface != null) {
            TextView textView = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.length);
            Intrinsics.checkExpressionValueIsNotNull(textView, "this.fbMessage");
            textView.setTypeface(typeface);
        }
    }

    public final void setMessageSizeInPx$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.length)).setTextSize(0, f.floatValue());
        }
    }

    public final void setMessageSizeInSp$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.length)).setTextSize(2, f.floatValue());
        }
    }

    public final void setMessageColor$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.length)).setTextColor(num.intValue());
        }
    }

    public final void setMessageAppearance$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.length)).setTextAppearance(num.intValue());
                return;
            }
            TextView textView = (TextView) _$_findCachedViewById(getCollapseContentDescription.length.length);
            Intrinsics.checkExpressionValueIsNotNull(textView, "fbMessage");
            ((TextView) _$_findCachedViewById(getCollapseContentDescription.length.length)).setTextAppearance(textView.getContext(), num.intValue());
        }
    }

    public final void setPrimaryActionText$flashbar_release(@Nullable String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "this.fbPrimaryAction");
            fbButton.setText(charSequence);
            FbButton fbButton2 = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange);
            Intrinsics.checkExpressionValueIsNotNull(fbButton2, "this.fbPrimaryAction");
            fbButton2.setVisibility(0);
        }
    }

    public final void setPrimaryActionTextSpanned$flashbar_release(@Nullable Spanned spanned) {
        if (spanned != null) {
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "this.fbPrimaryAction");
            fbButton.setText(spanned);
            FbButton fbButton2 = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange);
            Intrinsics.checkExpressionValueIsNotNull(fbButton2, "this.fbPrimaryAction");
            fbButton2.setVisibility(0);
        }
    }

    public final void setPrimaryActionTextTypeface$flashbar_release(@Nullable Typeface typeface) {
        if (typeface != null) {
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "this.fbPrimaryAction");
            fbButton.setTypeface(typeface);
        }
    }

    public final void setPrimaryActionTextSizeInPx$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange)).setTextSize(0, f.floatValue());
        }
    }

    public final void setPrimaryActionTextSizeInSp$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange)).setTextSize(2, f.floatValue());
        }
    }

    public final void setPrimaryActionTextColor$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange)).setTextColor(num.intValue());
        }
    }

    public final void setPrimaryActionTextAppearance$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange)).setTextAppearance(num.intValue());
                return;
            }
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "fbPrimaryAction");
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange)).setTextAppearance(fbButton.getContext(), num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ Flashbar.getMin getMin;
        final /* synthetic */ FlashbarView length;

        getMax(FlashbarView flashbarView, Flashbar.getMin getmin) {
            this.length = flashbarView;
            this.getMin = getmin;
        }

        public final void onClick(View view) {
            Flashbar.getMin getmin = this.getMin;
            FlashbarView.access$getParentFlashbarContainer$p(this.length).getParentFlashbar$flashbar_release();
            getmin.setMax();
        }
    }

    public final void setPrimaryActionTapListener$flashbar_release(@Nullable Flashbar.getMin getmin) {
        if (getmin != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange)).setOnClickListener(new getMax(this, getmin));
        }
    }

    public final void setPositiveActionText$flashbar_release(@Nullable String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.IsOverlapping);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "this.fbSecondaryActionContainer");
            linearLayout.setVisibility(0);
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "this.fbPositiveAction");
            fbButton.setText(charSequence);
            FbButton fbButton2 = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals);
            Intrinsics.checkExpressionValueIsNotNull(fbButton2, "this.fbPositiveAction");
            fbButton2.setVisibility(0);
        }
    }

    public final void setPositiveActionTextSpanned$flashbar_release(@Nullable Spanned spanned) {
        if (spanned != null) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.IsOverlapping);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "this.fbSecondaryActionContainer");
            linearLayout.setVisibility(0);
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "this.fbPositiveAction");
            fbButton.setText(spanned);
            FbButton fbButton2 = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals);
            Intrinsics.checkExpressionValueIsNotNull(fbButton2, "this.fbPositiveAction");
            fbButton2.setVisibility(0);
        }
    }

    public final void setPositiveActionTextTypeface$flashbar_release(@Nullable Typeface typeface) {
        if (typeface != null) {
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "this.fbPositiveAction");
            fbButton.setTypeface(typeface);
        }
    }

    public final void setPositiveActionTextSizeInPx$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals)).setTextSize(0, f.floatValue());
        }
    }

    public final void setPositiveActionTextSizeInSp$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals)).setTextSize(2, f.floatValue());
        }
    }

    public final void setPositiveActionTextColor$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals)).setTextColor(num.intValue());
        }
    }

    public final void setPositiveActionTextAppearance$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals)).setTextAppearance(num.intValue());
                return;
            }
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "fbPrimaryAction");
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals)).setTextAppearance(fbButton.getContext(), num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ FlashbarView getMax;
        final /* synthetic */ Flashbar.getMin setMax;

        setMax(FlashbarView flashbarView, Flashbar.getMin getmin) {
            this.getMax = flashbarView;
            this.setMax = getmin;
        }

        public final void onClick(View view) {
            Flashbar.getMin getmin = this.setMax;
            FlashbarView.access$getParentFlashbarContainer$p(this.getMax).getParentFlashbar$flashbar_release();
            getmin.setMax();
        }
    }

    public final void setPositiveActionTapListener$flashbar_release(@Nullable Flashbar.getMin getmin) {
        if (getmin != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.equals)).setOnClickListener(new setMax(this, getmin));
        }
    }

    public final void setNegativeActionText$flashbar_release(@Nullable String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.IsOverlapping);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "this.fbSecondaryActionContainer");
            linearLayout.setVisibility(0);
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "this.fbNegativeAction");
            fbButton.setText(charSequence);
            FbButton fbButton2 = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax);
            Intrinsics.checkExpressionValueIsNotNull(fbButton2, "this.fbNegativeAction");
            fbButton2.setVisibility(0);
        }
    }

    public final void setNegativeActionTextSpanned$flashbar_release(@Nullable Spanned spanned) {
        if (spanned != null) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.IsOverlapping);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "this.fbSecondaryActionContainer");
            linearLayout.setVisibility(0);
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "this.fbNegativeAction");
            fbButton.setText(spanned);
            FbButton fbButton2 = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax);
            Intrinsics.checkExpressionValueIsNotNull(fbButton2, "this.fbNegativeAction");
            fbButton2.setVisibility(0);
        }
    }

    public final void setNegativeActionTextTypeface$flashbar_release(@Nullable Typeface typeface) {
        if (typeface != null) {
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "this.fbNegativeAction");
            fbButton.setTypeface(typeface);
        }
    }

    public final void setNegativeActionTextSizeInPx$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax)).setTextSize(0, f.floatValue());
        }
    }

    public final void setNegativeActionTextSizeInSp$flashbar_release(@Nullable Float f) {
        if (f != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax)).setTextSize(2, f.floatValue());
        }
    }

    public final void setNegativeActionTextColor$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax)).setTextColor(num.intValue());
        }
    }

    public final void setNegativeActionTextAppearance$flashbar_release(@Nullable Integer num) {
        if (num != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax)).setTextAppearance(num.intValue());
                return;
            }
            FbButton fbButton = (FbButton) _$_findCachedViewById(getCollapseContentDescription.length.toFloatRange);
            Intrinsics.checkExpressionValueIsNotNull(fbButton, "fbPrimaryAction");
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax)).setTextAppearance(fbButton.getContext(), num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ Flashbar.getMin getMax;
        final /* synthetic */ FlashbarView setMin;

        getMin(FlashbarView flashbarView, Flashbar.getMin getmin) {
            this.setMin = flashbarView;
            this.getMax = getmin;
        }

        public final void onClick(View view) {
            Flashbar.getMin getmin = this.getMax;
            FlashbarView.access$getParentFlashbarContainer$p(this.setMin).getParentFlashbar$flashbar_release();
            getmin.setMax();
        }
    }

    public final void setNegativeActionTapListener$flashbar_release(@Nullable Flashbar.getMin getmin) {
        if (getmin != null) {
            ((FbButton) _$_findCachedViewById(getCollapseContentDescription.length.getMax)).setOnClickListener(new getMin(this, getmin));
        }
    }

    public final void showIcon$flashbar_release(boolean z) {
        ImageView imageView = (ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "this.fbIcon");
        imageView.setVisibility(z ? 0 : 8);
    }

    public final void showIconScale$flashbar_release(float f, @Nullable ImageView.ScaleType scaleType) {
        ImageView imageView = (ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "this.fbIcon");
        imageView.setScaleX(f);
        ImageView imageView2 = (ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "this.fbIcon");
        imageView2.setScaleY(f);
        ImageView imageView3 = (ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "this.fbIcon");
        imageView3.setScaleType(scaleType);
    }

    public final void setIconDrawable$flashbar_release(@Nullable Drawable drawable) {
        if (drawable != null) {
            ((ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin)).setImageDrawable(drawable);
        }
    }

    public final void setIconBitmap$flashbar_release(@Nullable Bitmap bitmap) {
        if (bitmap != null) {
            ((ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin)).setImageBitmap(bitmap);
        }
    }

    public final void setIconColorFilter$flashbar_release(@Nullable Integer num, @Nullable PorterDuff.Mode mode) {
        if (num != null) {
            if (mode == null) {
                ((ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin)).setColorFilter(num.intValue());
            } else {
                ((ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin)).setColorFilter(num.intValue(), mode);
            }
        }
    }

    public final void startIconAnimation$flashbar_release(@Nullable ensureMenu ensuremenu) {
        if (ensuremenu != null) {
            ImageView imageView = (ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "fbIcon");
            ensuremenu.setMax(imageView).equals().setMax((setCollapseContentDescription.setMin) null);
        }
    }

    public final void stopIconAnimation$flashbar_release() {
        ((ImageView) _$_findCachedViewById(getCollapseContentDescription.length.getMin)).clearAnimation();
    }

    public final void enableSwipeToDismiss$flashbar_release(boolean z, @NotNull getNavigationIcon.getMin getmin) {
        Intrinsics.checkParameterIsNotNull(getmin, "callbacks");
        if (z) {
            ((LinearLayout) _$_findCachedViewById(getCollapseContentDescription.length.toIntRange)).setOnTouchListener(new getNavigationIcon(this, getmin));
        }
    }

    public final void setProgressPosition$flashbar_release(@Nullable Flashbar.ProgressPosition progressPosition) {
        if (progressPosition != null) {
            int i = setNavigationIcon.getMin[progressPosition.ordinal()];
            if (i == 1) {
                FbProgress fbProgress = (FbProgress) _$_findCachedViewById(getCollapseContentDescription.length.setMin);
                Intrinsics.checkExpressionValueIsNotNull(fbProgress, "fbLeftProgress");
                fbProgress.setVisibility(0);
                FbProgress fbProgress2 = (FbProgress) _$_findCachedViewById(getCollapseContentDescription.length.isInside);
                Intrinsics.checkExpressionValueIsNotNull(fbProgress2, "fbRightProgress");
                fbProgress2.setVisibility(8);
            } else if (i == 2) {
                FbProgress fbProgress3 = (FbProgress) _$_findCachedViewById(getCollapseContentDescription.length.setMin);
                Intrinsics.checkExpressionValueIsNotNull(fbProgress3, "fbLeftProgress");
                fbProgress3.setVisibility(8);
                FbProgress fbProgress4 = (FbProgress) _$_findCachedViewById(getCollapseContentDescription.length.isInside);
                Intrinsics.checkExpressionValueIsNotNull(fbProgress4, "fbRightProgress");
                fbProgress4.setVisibility(0);
            }
        }
    }

    public final void setProgressTint$flashbar_release(@Nullable Integer num, @Nullable Flashbar.ProgressPosition progressPosition) {
        FbProgress fbProgress;
        if (progressPosition != null && num != null) {
            int i = setNavigationIcon.setMax[progressPosition.ordinal()];
            if (i == 1) {
                fbProgress = (FbProgress) _$_findCachedViewById(getCollapseContentDescription.length.setMin);
            } else if (i == 2) {
                fbProgress = (FbProgress) _$_findCachedViewById(getCollapseContentDescription.length.isInside);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            fbProgress.setBarColor(num.intValue());
        }
    }

    private final void setMin(ShadowView.ShadowType shadowType, int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(context, "$receiver");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, Math.round(((float) i) * (resources.getDisplayMetrics().xdpi / 160.0f)));
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, HummerConstants.CONTEXT);
        ShadowView shadowView = new ShadowView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        shadowView.applyShadow$flashbar_release(shadowType);
        addView(shadowView, layoutParams);
    }
}
