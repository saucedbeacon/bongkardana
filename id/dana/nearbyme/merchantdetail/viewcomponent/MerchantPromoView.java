package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.model.PromoInfoModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.k;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.setChecked;
import o.showsIcon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bJ\u001c\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\b\u0010\u001f\u001a\u00020\u0014H\u0016R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantPromoView;", "Lid/dana/base/BaseRichView;", "Landroidx/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "listener", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantPromoView$PromoViewInteraction;", "promoSkeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getPromoSkeleton", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "promoSkeleton$delegate", "Lkotlin/Lazy;", "getLayout", "onCreate", "", "renderPromo", "text", "", "setListener", "sentListener", "setPromo", "promoText", "data", "", "Lid/dana/nearbyme/model/PromoInfoModel;", "setup", "PromoViewInteraction", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantPromoView extends BaseRichView implements showsIcon {
    /* access modifiers changed from: private */
    public getMin length;
    private HashMap setMax;
    private final Lazy setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantPromoView$PromoViewInteraction;", "", "onSeeAllPromoClick", "", "promoInfos", "", "Lid/dana/nearbyme/model/PromoInfoModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void onSeeAllPromoClick(@NotNull List<? extends PromoInfoModel> list);
    }

    @JvmOverloads
    public MerchantPromoView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantPromoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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

    public final int getLayout() {
        return R.layout.view_merchant_promo;
    }

    public static final /* synthetic */ getMin access$getListener$p(MerchantPromoView merchantPromoView) {
        getMin getmin = merchantPromoView.length;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return getmin;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantPromoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantPromoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.peekAvailableContext);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "cl_promo");
        View view = constraintLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        this.setMin = LazyKt.lazy(new k.AnonymousClass3.getMin(view, R.layout.view_merchant_promo_skeleton));
    }

    public final void setup() {
        Context context = getContext();
        if (context != null) {
            ((setChecked) context).getLifecycle().setMax(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
    }

    public final void setListener(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "sentListener");
        this.length = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ MerchantPromoView getMin;
        final /* synthetic */ List setMax;

        setMax(MerchantPromoView merchantPromoView, List list) {
            this.getMin = merchantPromoView;
            this.setMax = list;
        }

        public final void onClick(View view) {
            if (!this.setMax.isEmpty()) {
                MerchantPromoView.access$getListener$p(this.getMin).onSeeAllPromoClick(this.setMax);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        ((onDetachedFromLayoutParams) this.setMin.getValue()).getMin();
    }

    public final void setPromo(@NotNull String str, @NotNull List<? extends PromoInfoModel> list) {
        Intrinsics.checkNotNullParameter(str, "promoText");
        Intrinsics.checkNotNullParameter(list, "data");
        ((onDetachedFromLayoutParams) this.setMin.getValue()).length();
        CharSequence charSequence = str;
        if (charSequence.length() > 0) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.addCustomViewsWithGravity);
            if (appCompatTextView != null) {
                appCompatTextView.setText(charSequence);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.peekAvailableContext);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        } else {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.peekAvailableContext);
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getLayoutResource);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setOnClickListener(new setMax(this, list));
        }
    }
}
