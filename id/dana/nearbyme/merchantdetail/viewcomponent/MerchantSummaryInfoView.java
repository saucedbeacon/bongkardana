package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.home.RoundedCornersTransformation;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.OptIn;
import o.RewriteQueriesToDropUnusedColumns;
import o.allowsGoneWidget;
import o.containsFavoriteMenuItem;
import o.dispatchApplyWindowInsetsToBehaviors;
import o.evaluate;
import o.getTopSortedChildren;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.setFirstVerticalBias;
import o.updateCornerMarking;
import o.updateMessageMenuItem;
import o.updatePostLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001fH\u0014J\u001c\u0010!\u001a\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010#\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010#\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0002J\u0006\u0010&\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantSummaryInfoView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "merchantCategory", "getMerchantCategory", "()Ljava/lang/String;", "setMerchantCategory", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "merchantLogoDrawable", "getMerchantLogoDrawable", "()Landroid/graphics/drawable/Drawable;", "setMerchantLogoDrawable", "(Landroid/graphics/drawable/Drawable;)V", "merchantLogoUrl", "getMerchantLogoUrl", "setMerchantLogoUrl", "merchantName", "getMerchantName", "setMerchantName", "skeletonMerchantLogo", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getLayout", "", "hideShimmer", "", "onAttachedToWindow", "parseAttrs", "attrs", "setLogoImageUrl", "setup", "setupSkeleton", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantSummaryInfoView extends BaseRichView {
    private HashMap equals;
    private onDetachedFromLayoutParams getMax;
    @Nullable
    private Drawable getMin;
    @NotNull
    private String length = "";
    @NotNull
    private String setMax = "";
    @Nullable
    private String setMin;
    private final AttributeSet toIntRange;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_summary_info;
    }

    public final void setup() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantSummaryInfoView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.toIntRange = attributeSet;
    }

    @NotNull
    public final String getMerchantName() {
        return this.length;
    }

    public final void setMerchantName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getContentInsetEnd);
        if (textView != null) {
            textView.setText(str);
        }
        this.length = str;
    }

    @NotNull
    public final String getMerchantCategory() {
        return this.setMax;
    }

    public final void setMerchantCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.ensureMenuView);
        if (textView != null) {
            textView.setText(str);
        }
        this.setMax = str;
    }

    @Nullable
    public final String getMerchantLogoUrl() {
        return this.setMin;
    }

    @Nullable
    public final Drawable getMerchantLogoDrawable() {
        return this.getMin;
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
        this.getMax = containsFavoriteMenuItem.getMin((ImageView) _$_findCachedViewById(resetInternal.setMax.invalidateDrawable), R.layout.view_skeleton_merchant_logo);
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (context != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.IMediaSession$Stub);
            String string = obtainStyledAttributes.getString(2);
            String str = "";
            if (string == null) {
                string = str;
            }
            setMerchantName(string);
            String string2 = obtainStyledAttributes.getString(0);
            if (string2 != null) {
                str = string2;
            }
            setMerchantCategory(str);
            setMerchantLogoDrawable(OptIn.getMax(obtainStyledAttributes.getResources(), obtainStyledAttributes.getResourceId(1, R.drawable.ic_merchant_logo_null), (Resources.Theme) null));
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void setMerchantLogoUrl(@Nullable String str) {
        if (RewriteQueriesToDropUnusedColumns.setMax(str)) {
            RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(getContext(), (byte) 0);
            getmax.getMin = str;
            getmax.setMin = (ImageView) _$_findCachedViewById(resetInternal.setMax.scheduleDrawable);
            new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
        } else {
            updateMessageMenuItem<Drawable> max = ((updateCornerMarking) Glide.getMax(getContext())).setMax(str).setMin((int) R.drawable.ic_merchant_logo_null).setMax(evaluate.setMin);
            dispatchApplyWindowInsetsToBehaviors dispatchapplywindowinsetstobehaviors = new dispatchApplyWindowInsetsToBehaviors();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            dispatchapplywindowinsetstobehaviors.length((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new allowsGoneWidget(), new RoundedCornersTransformation(context.getResources().getDimensionPixelSize(R.dimen.f26712131165342), 1, RoundedCornersTransformation.CornerType.ALL)});
            Unit unit = Unit.INSTANCE;
            max.setMax((getTopSortedChildren<?>) dispatchapplywindowinsetstobehaviors).length((ImageView) _$_findCachedViewById(resetInternal.setMax.invalidateDrawable));
        }
        this.setMin = str;
    }

    public final void setMerchantLogoDrawable(@Nullable Drawable drawable) {
        setFirstVerticalBias<Drawable> length2 = Glide.getMax(getContext()).length(drawable);
        dispatchApplyWindowInsetsToBehaviors dispatchapplywindowinsetstobehaviors = new dispatchApplyWindowInsetsToBehaviors();
        dispatchapplywindowinsetstobehaviors.getMin((int) R.drawable.ic_merchant_logo_null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        dispatchapplywindowinsetstobehaviors.length((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new allowsGoneWidget(), new RoundedCornersTransformation(context.getResources().getDimensionPixelSize(R.dimen.f26712131165342), 1, RoundedCornersTransformation.CornerType.ALL)});
        Unit unit = Unit.INSTANCE;
        length2.getMin((getTopSortedChildren<?>) dispatchapplywindowinsetstobehaviors).length((ImageView) _$_findCachedViewById(resetInternal.setMax.invalidateDrawable));
        this.getMin = drawable;
    }
}
