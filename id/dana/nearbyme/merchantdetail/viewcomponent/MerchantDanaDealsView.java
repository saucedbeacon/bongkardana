package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.MerchantDanaDealsModule;
import id.dana.nearbyme.merchantdetail.adapter.MerchantDanaDealsAdapter;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.nearbyme.model.PromoInfoModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverBaseFragment;
import o.OptionMenuRecyclerAdapter;
import o.PrepareException;
import o.SettingMenu;
import o.UniformOptionMenuPanelExtensionImpl;
import o.onItemsChanged;
import o.putDynamicPluginModel;
import o.resetInternal;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J+\u0010\u001d\u001a\u00020\u001c2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001c0\u001fH\u0002J\b\u0010$\u001a\u00020\u0007H\u0016J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020\u001cJ\u0012\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0016\u0010-\u001a\u00020\u001c2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u00100\u001a\u00020\u001cH\u0016J\b\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020\u001cH\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R4\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00063"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "adapter", "Lid/dana/nearbyme/merchantdetail/adapter/MerchantDanaDealsAdapter;", "presenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$Presenter;", "getPresenter", "()Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$Presenter;", "setPresenter", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$Presenter;)V", "value", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "voucherInfo", "getVoucherInfo", "()Ljava/util/List;", "setVoucherInfo", "(Ljava/util/List;)V", "dismissLoadingDialogOnActivity", "", "doOnMerchantDetailInteractionImplemented", "action", "Lkotlin/Function1;", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantDetailInteraction;", "Lkotlin/ParameterName;", "name", "merchantDetailInteraction", "getLayout", "getMerchantDanaDealsVoucher", "merchantId", "", "shopId", "hideSection", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "loadMerchantDanaDealsData", "listOfVoucherInfo", "makeDefaultShimmerItem", "setup", "setupRecyclerView", "showLoadingDialogOnActivity", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDanaDealsView extends BaseRichView {
    @Nullable
    private List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> getMin;
    private HashMap length;
    @Inject
    public UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin presenter;
    private MerchantDanaDealsAdapter setMax;

    @JvmOverloads
    public MerchantDanaDealsView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantDanaDealsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_merchant_dana_deals;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantDetailInteraction;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<GriverBaseFragment, Unit> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverBaseFragment) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverBaseFragment griverBaseFragment) {
            Intrinsics.checkNotNullParameter(griverBaseFragment, "it");
            griverBaseFragment.showLoadingDialog();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantDetailInteraction;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<GriverBaseFragment, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverBaseFragment) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverBaseFragment griverBaseFragment) {
            Intrinsics.checkNotNullParameter(griverBaseFragment, "it");
            griverBaseFragment.dismissLoadingDialog();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "clickedMerchantProductInfoModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> {
        final /* synthetic */ MerchantDanaDealsView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(MerchantDanaDealsView merchantDanaDealsView) {
            super(1);
            this.this$0 = merchantDanaDealsView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OptionMenuRecyclerAdapter.OptionMenuViewHolder) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder) {
            Intrinsics.checkNotNullParameter(optionMenuViewHolder, "clickedMerchantProductInfoModel");
            this.this$0.setMin(getMax.INSTANCE);
            this.this$0.getPresenter().getMin(optionMenuViewHolder);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantDanaDealsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantDanaDealsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantDanaDealsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getPresenter() {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmin;
    }

    public final void setPresenter(@NotNull UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.presenter = getmin;
    }

    @Nullable
    public final List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> getVoucherInfo() {
        return this.getMin;
    }

    public final void setVoucherInfo(@Nullable List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> list) {
        this.getMin = list;
        MerchantDanaDealsAdapter merchantDanaDealsAdapter = this.setMax;
        if (merchantDanaDealsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        merchantDanaDealsAdapter.getMin(list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\f"}, d2 = {"id/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsView$injectComponent$1", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$View;", "onCreateDanaDealsVoucherFail", "", "onCreateDanaDealsVoucherSuccess", "productOrder", "Lid/dana/nearbyme/merchantdetail/model/ProductOrderModel;", "onLoadingMerchantDanaDealFail", "onLoadingMerchantDanaDealSuccess", "listOfProductInfo", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.length {
        final /* synthetic */ MerchantDanaDealsView setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void getMin(@NotNull List<? extends PromoInfoModel> list, @NotNull List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> list2) {
            Intrinsics.checkNotNullParameter(list, "promoInfoModels");
            Intrinsics.checkNotNullParameter(list2, "productInfoModels");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMin() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(MerchantDanaDealsView merchantDanaDealsView) {
            this.setMax = merchantDanaDealsView;
        }

        public final void setMax(@NotNull List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> list) {
            Intrinsics.checkNotNullParameter(list, "listOfProductInfo");
            if (list.isEmpty()) {
                this.setMax.hideSection();
            } else {
                this.setMax.setVoucherInfo(list);
            }
        }

        public final void getMax() {
            this.setMax.hideSection();
        }

        public final void getMax(@NotNull SettingMenu.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "productOrder");
            this.setMax.setMin(getMin.INSTANCE);
            DanaH5.startContainerFullUrl(r2.getMax);
        }

        public final void setMax() {
            this.setMax.setMin(getMin.INSTANCE);
        }
    }

    public final void getMerchantDanaDealsVoucher(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.getMin(str, str2);
    }

    /* access modifiers changed from: private */
    public final void setMin(Function1<? super GriverBaseFragment, Unit> function1) {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof GriverBaseFragment) {
                function1.invoke(context);
            }
        }
        updateActionSheetContent.e(DanaLogConstants.ExceptionType.NEARBY_EXCEPTION, "Parent must implement MerchantDetailInteraction");
    }

    public final void hideSection() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.performShortcut);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        putDynamicPluginModel.getMax getmax = new putDynamicPluginModel.getMax((byte) 0);
        if (r4 != null) {
            getmax.getMin = r4;
            getmax.setMax = new MerchantDanaDealsModule(new length(this));
            stopIgnoring.setMin(getmax.setMax, MerchantDanaDealsModule.class);
            stopIgnoring.setMin(getmax.getMin, PrepareException.AnonymousClass1.class);
            new putDynamicPluginModel(getmax.setMax, getmax.getMin, (byte) 0).setMin(this);
            return;
        }
        throw null;
    }

    public final void setup() {
        new onItemsChanged().setMax((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setAutoSizeTextTypeUniformWithPresetSizes));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        MerchantDanaDealsAdapter merchantDanaDealsAdapter = new MerchantDanaDealsAdapter(context);
        this.setMax = merchantDanaDealsAdapter;
        if (merchantDanaDealsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        Function1<? super OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> setmax = new setMax(this);
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        merchantDanaDealsAdapter.getMin = setmax;
        MerchantDanaDealsAdapter merchantDanaDealsAdapter2 = this.setMax;
        if (merchantDanaDealsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        merchantDanaDealsAdapter2.getMin(this.getMin);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setAutoSizeTextTypeUniformWithPresetSizes);
        if (recyclerView != null) {
            MerchantDanaDealsAdapter merchantDanaDealsAdapter3 = this.setMax;
            if (merchantDanaDealsAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            recyclerView.setAdapter(merchantDanaDealsAdapter3);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setAutoSizeTextTypeUniformWithPresetSizes);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        ((ScrollingPagerIndicator) _$_findCachedViewById(resetInternal.setMax.getDropDownVerticalOffset)).attachToRecyclerView((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setAutoSizeTextTypeUniformWithPresetSizes));
        setVoucherInfo(CollectionsKt.arrayListOf(new OptionMenuRecyclerAdapter.OptionMenuViewHolder("", "", "", "", "", new MoneyViewModel("", "", (String) null, 4), new MoneyViewModel("", "", (String) null, 4), true, "", MapsKt.mapOf(new Pair("", "")), new SettingMenu("", "", "", "", new MoneyViewModel((String) null, (String) null, (String) null, 7), new MoneyViewModel((String) null, (String) null, (String) null, 7), new MoneyViewModel((String) null, (String) null, (String) null, 7), new MoneyViewModel((String) null, (String) null, (String) null, 7), "", "", "", true), 0.0d)));
    }
}
