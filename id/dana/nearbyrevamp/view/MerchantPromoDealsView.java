package id.dana.nearbyrevamp.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.danah5.DanaH5;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverCommonAbilityProxyImpl;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.OptionMenuRecyclerAdapter;
import o.bindData;
import o.onCreateContact;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\u001a\u001a\u00020\u00132\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001cJ\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/nearbyrevamp/view/MerchantPromoDealsView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dealsAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDealsAdapter;", "promoAdapter", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantPromoAdapter;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "getLayout", "initAdapter", "", "onDealsClicked", "merchantProductInfoModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "onPromoClicked", "promoInfoModel", "Lid/dana/nearbyme/model/PromoInfoModel;", "populatePromoAndDeals", "promoInfoModels", "", "dealsInfoModels", "setShopModel", "setup", "showPromoInfoDialog", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantPromoDealsView extends BaseRichView {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    private ShopModel getMax;
    private bindData getMin;
    private HashMap length;
    private GriverCommonAbilityProxyImpl.AnonymousClass1.AnonymousClass1 setMin;

    @JvmOverloads
    public MerchantPromoDealsView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantPromoDealsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_promo_deals;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/PromoInfoModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<PromoInfoModel, Unit> {
        final /* synthetic */ MerchantPromoDealsView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(MerchantPromoDealsView merchantPromoDealsView) {
            super(1);
            this.this$0 = merchantPromoDealsView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PromoInfoModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull PromoInfoModel promoInfoModel) {
            Intrinsics.checkNotNullParameter(promoInfoModel, "it");
            MerchantPromoDealsView.access$onPromoClicked(this.this$0, promoInfoModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> {
        final /* synthetic */ MerchantPromoDealsView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(MerchantPromoDealsView merchantPromoDealsView) {
            super(1);
            this.this$0 = merchantPromoDealsView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OptionMenuRecyclerAdapter.OptionMenuViewHolder) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder) {
            Intrinsics.checkNotNullParameter(optionMenuViewHolder, "it");
            MerchantPromoDealsView.access$onDealsClicked(this.this$0, optionMenuViewHolder);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantPromoDealsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantPromoDealsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantPromoDealsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void populatePromoAndDeals(@Nullable List<? extends PromoInfoModel> list, @Nullable List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> list2) {
        bindData binddata = this.getMin;
        if (binddata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promoAdapter");
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        binddata.getMin(list);
        GriverCommonAbilityProxyImpl.AnonymousClass1.AnonymousClass1 r3 = this.setMin;
        if (r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dealsAdapter");
        }
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        r3.getMin(list2);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.ActivityChooserView$InnerLayout);
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void setShopModel(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        this.getMax = shopModel;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyrevamp/view/MerchantPromoDealsView$Companion;", "", "()V", "DANA_DEALS_DETAIL_URL", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void setup() {
        this.getMin = new bindData(new getMax(this));
        this.setMin = new IMultiInstanceInvalidationCallback.Stub<Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder>, OptionMenuRecyclerAdapter.OptionMenuViewHolder>(new length(this)) {
            private final Function1<OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> setMax;

            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                return new length(viewGroup, this.setMax);
            }

            {
                this.setMax = r1;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B4\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0017R+\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDealsAdapter$MerchantDealsViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "parent", "Landroid/view/ViewGroup;", "onDealsClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "merchantProductInfoModel", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.GriverCommonAbilityProxyImpl$1$1$length */
            public static final class length extends Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder> {
                /* access modifiers changed from: private */
                public final Function1<OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> getMin;

                public final /* synthetic */ void setMax(Object obj) {
                    OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder = (OptionMenuRecyclerAdapter.OptionMenuViewHolder) obj;
                    if (optionMenuViewHolder != null) {
                        View view = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setSupportProgressBarVisibility);
                        if (appCompatImageView != null) {
                            appCompatImageView.setImageResource(R.drawable.ic_deals_tag);
                        }
                        View view2 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                        TextView textView = (TextView) view2.findViewById(resetInternal.setMax.launchQuerySearch);
                        if (textView != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(optionMenuViewHolder.isInside.getMax);
                            sb.append(' ');
                            sb.append((int) (Double.parseDouble(optionMenuViewHolder.isInside.isInside) * 100.0d));
                            sb.append('%');
                            textView.setText(sb.toString());
                        }
                        View view3 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                        TextView textView2 = (TextView) view3.findViewById(resetInternal.setMax.forceUniformHeight);
                        if (textView2 != null) {
                            textView2.setText(optionMenuViewHolder.isInside.setMin);
                        }
                        this.itemView.setOnClickListener(new getMax(this, optionMenuViewHolder));
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public length(@NotNull ViewGroup viewGroup, @Nullable Function1<? super OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> function1) {
                    super(viewGroup.getContext(), R.layout.item_promo_deals, viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                    this.getMin = function1;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
                /* renamed from: o.GriverCommonAbilityProxyImpl$1$1$length$getMax */
                static final class getMax implements View.OnClickListener {
                    final /* synthetic */ OptionMenuRecyclerAdapter.OptionMenuViewHolder setMax;
                    final /* synthetic */ length setMin;

                    getMax(length length, OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder) {
                        this.setMin = length;
                        this.setMax = optionMenuViewHolder;
                    }

                    public final void onClick(View view) {
                        Function1 min = this.setMin.getMin;
                        if (min != null) {
                            min.invoke(this.setMax);
                        }
                    }
                }
            }
        };
        RecyclerView.Adapter[] adapterArr = new RecyclerView.Adapter[2];
        bindData binddata = this.getMin;
        if (binddata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promoAdapter");
        }
        adapterArr[0] = binddata;
        GriverCommonAbilityProxyImpl.AnonymousClass1.AnonymousClass1 r4 = this.setMin;
        if (r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dealsAdapter");
        }
        adapterArr[1] = r4;
        ConcatAdapter concatAdapter = new ConcatAdapter(adapterArr);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.ActivityChooserView$InnerLayout);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new RecyclerView.getMax() {
                private final int getMin = 8;

                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                    rect.left = this.getMin;
                    rect.right = this.getMin;
                    rect.bottom = this.getMin;
                }
            });
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setAdapter(concatAdapter);
        }
    }

    public static final /* synthetic */ void access$onPromoClicked(MerchantPromoDealsView merchantPromoDealsView, PromoInfoModel promoInfoModel) {
        BaseActivity baseActivity = merchantPromoDealsView.getBaseActivity();
        if (baseActivity != null) {
            onCreateContact.getMax getmax = onCreateContact.getMin;
            Intrinsics.checkNotNullParameter(promoInfoModel, "promoInfoModel");
            onCreateContact oncreatecontact = new onCreateContact();
            Bundle bundle = new Bundle();
            bundle.putParcelable("promo_info_model", promoInfoModel);
            Unit unit = Unit.INSTANCE;
            oncreatecontact.setArguments(bundle);
            oncreatecontact.show(baseActivity.getSupportFragmentManager(), "PromoDetailDialogFragment");
        }
    }

    public static final /* synthetic */ void access$onDealsClicked(MerchantPromoDealsView merchantPromoDealsView, OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder) {
        StringBuilder sb = new StringBuilder("https://m.dana.id/i/dana-promotion/dana-deals/voucher-detail?goodsId=");
        sb.append(optionMenuViewHolder.setMin);
        DanaH5.startContainerFullUrl(sb.toString());
    }
}
