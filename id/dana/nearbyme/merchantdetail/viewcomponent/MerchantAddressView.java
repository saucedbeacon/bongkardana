package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u001c\u0010\u001c\u001a\u00020\u001a2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0006\u0010\u001f\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAddressView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "merchantAddress", "getMerchantAddress", "()Ljava/lang/String;", "setMerchantAddress", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "onButtonClick", "getOnButtonClick", "()Landroid/view/View$OnClickListener;", "setOnButtonClick", "(Landroid/view/View$OnClickListener;)V", "skeletonAddress", "Lcom/ethanhua/skeleton/SkeletonScreen;", "skeletonButton", "getLayout", "", "hideShimmer", "", "onAttachedToWindow", "parseAttrs", "setup", "setupSkeleton", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantAddressView extends BaseRichView {
    private AttributeSet getMax;
    @NotNull
    private String getMin = "";
    private HashMap isInside;
    private onDetachedFromLayoutParams length;
    private onDetachedFromLayoutParams setMax;
    @Nullable
    private View.OnClickListener setMin;

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
        return R.layout.view_merchant_address;
    }

    public final void setup() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantAddressView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        this.getMax = attributeSet;
    }

    @NotNull
    public final String getMerchantAddress() {
        return this.getMin;
    }

    public final void setMerchantAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchPadding);
        if (textView != null) {
            textView.setText(str);
        }
        this.getMin = str;
    }

    @Nullable
    public final View.OnClickListener getOnButtonClick() {
        return this.setMin;
    }

    public final void setOnButtonClick(@Nullable View.OnClickListener onClickListener) {
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityCallback$Default);
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
        this.setMin = onClickListener;
    }

    public final void showShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams2 = this.setMax;
        if (ondetachedfromlayoutparams2 != null) {
            ondetachedfromlayoutparams2.getMin();
        }
    }

    public final void hideShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams2 = this.setMax;
        if (ondetachedfromlayoutparams2 != null) {
            ondetachedfromlayoutparams2.length();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.length = containsFavoriteMenuItem.getMin((TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchPadding), R.layout.view_skeleton_merchant_address);
        this.setMax = containsFavoriteMenuItem.getMin((Button) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityCallback$Default), R.layout.view_skeleton_direction_button);
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super.parseAttrs(context, attributeSet);
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, resetInternal.getMin.rateWithExtras) : null;
        if (obtainStyledAttributes != null) {
            try {
                String string = obtainStyledAttributes.getString(0);
                if (string == null) {
                    string = "";
                }
                setMerchantAddress(string);
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
