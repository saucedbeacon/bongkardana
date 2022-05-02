package id.dana.nearbyrevamp.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.di.modules.MerchantDetailActionInfoModule;
import id.dana.nearbyme.model.ShopModel;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AuthenticationProxy;
import o.GriverMenuExtensionImpl;
import o.PrepareException;
import o.ShareMenu;
import o.batchPutStaticPluginModel;
import o.f;
import o.getSerialNumberEncrypt;
import o.k;
import o.resetInternal;
import o.setClientId;
import o.startBeaconDiscovery;
import o.stopIgnoring;
import o.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0002J\u0018\u0010'\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010)R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lid/dana/nearbyrevamp/view/MerchantActionListView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "merchantDetailAnalyticTracker", "Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "getMerchantDetailAnalyticTracker", "()Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "setMerchantDetailAnalyticTracker", "(Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;)V", "nearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "getNearbyAnalyticTracker", "()Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "setNearbyAnalyticTracker", "(Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;)V", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "getFormattedPhoneNumber", "", "getLayout", "injectComponent", "", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "launchMessage", "phone", "onPhoneClick", "openGoogleMaps", "openHomeshopping", "setup", "shareDeeplink", "showActionMenu", "merchantDetailConfig", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantActionListView extends BaseRichView {
    private HashMap getMax;
    /* access modifiers changed from: private */
    public ShopModel length;
    @Inject
    public ShareMenu.AnonymousClass1 merchantDetailAnalyticTracker;
    @Inject
    public t nearbyAnalyticTracker;

    @JvmOverloads
    public MerchantActionListView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantActionListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_action_list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "invoke", "id/dana/nearbyrevamp/view/MerchantActionListView$onPhoneClick$3$1$1", "id/dana/nearbyrevamp/view/MerchantActionListView$$special$$inlined$run$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ String $it$inlined;
        final /* synthetic */ MerchantActionListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(String str, MerchantActionListView merchantActionListView) {
            super(1);
            this.$it$inlined = str;
            this.this$0 = merchantActionListView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            startBeaconDiscovery.getMin(context, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMin extends FunctionReferenceImpl implements Function1<String, Unit> {
        setMin(MerchantActionListView merchantActionListView) {
            super(1, merchantActionListView, MerchantActionListView.class, "launchMessage", "launchMessage(Ljava/lang/String;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "p1");
            MerchantActionListView.access$launchMessage((MerchantActionListView) this.receiver, str);
        }
    }

    public static final /* synthetic */ ShopModel access$getShopModel$p(MerchantActionListView merchantActionListView) {
        ShopModel shopModel = merchantActionListView.length;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shopModel");
        }
        return shopModel;
    }

    @NotNull
    public final ShareMenu.AnonymousClass1 getMerchantDetailAnalyticTracker() {
        ShareMenu.AnonymousClass1 r0 = this.merchantDetailAnalyticTracker;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailAnalyticTracker");
        }
        return r0;
    }

    public final void setMerchantDetailAnalyticTracker(@NotNull ShareMenu.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.merchantDetailAnalyticTracker = r2;
    }

    @NotNull
    public final t getNearbyAnalyticTracker() {
        t tVar = this.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        return tVar;
    }

    public final void setNearbyAnalyticTracker(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.nearbyAnalyticTracker = tVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantActionListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantActionListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantActionListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class length extends FunctionReferenceImpl implements Function0<Unit> {
        length(MerchantActionListView merchantActionListView) {
            super(0, merchantActionListView, MerchantActionListView.class, "onPhoneClick", "onPhoneClick()V", 0);
        }

        public final void invoke() {
            MerchantActionListView.access$onPhoneClick((MerchantActionListView) this.receiver);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMin extends FunctionReferenceImpl implements Function0<Unit> {
        getMin(MerchantActionListView merchantActionListView) {
            super(0, merchantActionListView, MerchantActionListView.class, "shareDeeplink", "shareDeeplink()V", 0);
        }

        public final void invoke() {
            MerchantActionListView.access$shareDeeplink((MerchantActionListView) this.receiver);
        }
    }

    public final void setup() {
        MerchantActionView merchantActionView = (MerchantActionView) _$_findCachedViewById(resetInternal.setMax.setupAnimatorToVisibility);
        if (merchantActionView != null) {
            MerchantActionView.setOnActionClickListener$default(merchantActionView, new length(this), (Function1) null, 2, (Object) null);
        }
        MerchantActionView merchantActionView2 = (MerchantActionView) _$_findCachedViewById(resetInternal.setMax.showOverflowMenu);
        if (merchantActionView2 != null) {
            MerchantActionView.setOnActionClickListener$default(merchantActionView2, new getMin(this), (Function1) null, 2, (Object) null);
        }
        MerchantActionView merchantActionView3 = (MerchantActionView) _$_findCachedViewById(resetInternal.setMax.getContentHeight);
        if (merchantActionView3 != null) {
            MerchantActionView.setOnActionClickListener$default(merchantActionView3, new getMax(this), (Function1) null, 2, (Object) null);
        }
        MerchantActionView merchantActionView4 = (MerchantActionView) _$_findCachedViewById(resetInternal.setMax.animateToVisibility);
        if (merchantActionView4 != null) {
            MerchantActionView.setOnActionClickListener$default(merchantActionView4, new isInside(this), (Function1) null, 2, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function0<Unit> {
        getMax(MerchantActionListView merchantActionListView) {
            super(0, merchantActionListView, MerchantActionListView.class, "openGoogleMaps", "openGoogleMaps()V", 0);
        }

        public final void invoke() {
            MerchantActionListView.access$openGoogleMaps((MerchantActionListView) this.receiver);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class isInside extends FunctionReferenceImpl implements Function0<Unit> {
        isInside(MerchantActionListView merchantActionListView) {
            super(0, merchantActionListView, MerchantActionListView.class, "openHomeshopping", "openHomeshopping()V", 0);
        }

        public final void invoke() {
            MerchantActionListView.access$openHomeshopping((MerchantActionListView) this.receiver);
        }
    }

    public final void showActionMenu(@NotNull ShopModel shopModel, @Nullable getSerialNumberEncrypt getserialnumberencrypt) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        this.length = shopModel;
        if (getserialnumberencrypt != null) {
            MerchantActionView merchantActionView = (MerchantActionView) _$_findCachedViewById(resetInternal.setMax.setupAnimatorToVisibility);
            boolean z3 = true;
            if (merchantActionView != null) {
                if (getserialnumberencrypt.getCallEnabled()) {
                    ShopModel shopModel2 = this.length;
                    if (shopModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shopModel");
                    }
                    String invoke = shopModel2.invoke();
                    Intrinsics.checkNotNullExpressionValue(invoke, "shopModel.phoneNumbers");
                    if (AuthenticationProxy.replaceIndoRegionDashWithPhonePrefix(invoke).length() > 0) {
                        z2 = true;
                        merchantActionView.setState(z2);
                    }
                }
                z2 = false;
                merchantActionView.setState(z2);
            }
            MerchantActionView merchantActionView2 = (MerchantActionView) _$_findCachedViewById(resetInternal.setMax.getContentHeight);
            if (merchantActionView2 != null) {
                if (getserialnumberencrypt.getDirectionEnabled()) {
                    shopModel.invokeSuspend();
                    z = true;
                } else {
                    z = false;
                }
                merchantActionView2.setState(z);
            }
            MerchantActionView merchantActionView3 = (MerchantActionView) _$_findCachedViewById(resetInternal.setMax.animateToVisibility);
            if (merchantActionView3 != null) {
                if (!getserialnumberencrypt.getHomeShoppingEnabled() || !shopModel.toIntRange()) {
                    z3 = false;
                }
                merchantActionView3.setState(z3);
            }
            MerchantActionView merchantActionView4 = (MerchantActionView) _$_findCachedViewById(resetInternal.setMax.showOverflowMenu);
            if (merchantActionView4 != null) {
                merchantActionView4.setState(getserialnumberencrypt.getShareEnabled());
            }
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        batchPutStaticPluginModel.setMax setmax = new batchPutStaticPluginModel.setMax((byte) 0);
        if (r4 != null) {
            setmax.setMax = r4;
            setmax.getMax = new MerchantDetailActionInfoModule();
            if (setmax.getMax == null) {
                setmax.getMax = new MerchantDetailActionInfoModule();
            }
            stopIgnoring.setMin(setmax.setMax, PrepareException.AnonymousClass1.class);
            new batchPutStaticPluginModel(setmax.getMax, setmax.setMax, (byte) 0).length(this);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$onPhoneClick(MerchantActionListView merchantActionListView) {
        BaseActivity baseActivity;
        FragmentManager supportFragmentManager;
        MerchantActionListView merchantActionListView2 = merchantActionListView;
        if (merchantActionListView2.length != null) {
            ShopModel shopModel = merchantActionListView.length;
            if (shopModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopModel");
            }
            String invoke = shopModel.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "shopModel.phoneNumbers");
            String replaceIndoRegionDashWithPhonePrefix = AuthenticationProxy.replaceIndoRegionDashWithPhonePrefix(invoke);
            if (!(replaceIndoRegionDashWithPhonePrefix.length() > 0)) {
                replaceIndoRegionDashWithPhonePrefix = null;
            }
            if (replaceIndoRegionDashWithPhonePrefix != null && (baseActivity = merchantActionListView.getBaseActivity()) != null && (supportFragmentManager = baseActivity.getSupportFragmentManager()) != null) {
                setClientId.setMin setmin = new setClientId.setMin((byte) 0);
                Intrinsics.checkNotNullParameter(replaceIndoRegionDashWithPhonePrefix, "callNumber");
                setClientId.setMin setmin2 = setmin;
                setmin2.getMin = replaceIndoRegionDashWithPhonePrefix;
                Intrinsics.checkNotNullParameter(replaceIndoRegionDashWithPhonePrefix, "messageNumber");
                setClientId.setMin setmin3 = setmin2;
                setmin3.length = replaceIndoRegionDashWithPhonePrefix;
                Function1<? super String, Unit> setmax = new setMax(replaceIndoRegionDashWithPhonePrefix, merchantActionListView);
                Intrinsics.checkNotNullParameter(setmax, "onCallClick");
                setClientId.setMin setmin4 = setmin3;
                setmin4.getMax = setmax;
                Function1<? super String, Unit> setmin5 = new setMin(merchantActionListView2);
                Intrinsics.checkNotNullParameter(setmin5, "onMessageClick");
                setClientId.setMin setmin6 = setmin4;
                setmin6.setMax = setmin5;
                new setClientId(new setClientId.setMin(setmin6.getMin, setmin6.length, setmin6.getMax, setmin6.setMax)).show(supportFragmentManager, "DialogContactUs");
            }
        }
    }

    public static final /* synthetic */ void access$shareDeeplink(MerchantActionListView merchantActionListView) {
        if (merchantActionListView.length != null) {
            Context context = merchantActionListView.getContext();
            String str = "";
            if (context != null) {
                Context context2 = merchantActionListView.getContext();
                Object[] objArr = new Object[2];
                ShopModel shopModel = merchantActionListView.length;
                if (shopModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shopModel");
                }
                String str2 = shopModel.invoke;
                if (str2 == null) {
                    str2 = str;
                }
                objArr[0] = str2;
                ShopModel shopModel2 = merchantActionListView.length;
                if (shopModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shopModel");
                }
                Intrinsics.checkNotNullParameter(shopModel2, "$this$getDeeplinkV2Url");
                StringBuilder sb = new StringBuilder("params=[s=");
                sb.append(shopModel2.b);
                sb.append(']');
                objArr[1] = "https://link.dana.id/shop?e=".concat(String.valueOf(f.AnonymousClass5.length(sb.toString())));
                String string = context2.getString(R.string.merchant_detail_deeplink_share, objArr);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …V2Url()\n                )");
                startBeaconDiscovery.length(context, string);
            }
            ShareMenu.AnonymousClass1 r0 = merchantActionListView.merchantDetailAnalyticTracker;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantDetailAnalyticTracker");
            }
            ShopModel shopModel3 = merchantActionListView.length;
            if (shopModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopModel");
            }
            String str3 = shopModel3.asInterface;
            if (str3 == null) {
                str3 = str;
            }
            ShopModel shopModel4 = merchantActionListView.length;
            if (shopModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopModel");
            }
            String str4 = shopModel4.invoke;
            if (str4 != null) {
                str = str4;
            }
            r0.setMax(str3, str);
        }
    }

    public static final /* synthetic */ void access$openGoogleMaps(MerchantActionListView merchantActionListView) {
        Context context;
        if (merchantActionListView.length != null && (context = merchantActionListView.getContext()) != null) {
            ShopModel shopModel = merchantActionListView.length;
            if (shopModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopModel");
            }
            double d = shopModel.values;
            ShopModel shopModel2 = merchantActionListView.length;
            if (shopModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopModel");
            }
            startBeaconDiscovery.setMin(context, d, shopModel2.toString);
        }
    }

    public static final /* synthetic */ void access$openHomeshopping(MerchantActionListView merchantActionListView) {
        BaseActivity baseActivity;
        if (merchantActionListView.length != null && (baseActivity = merchantActionListView.getBaseActivity()) != null) {
            k.AnonymousClass10.getMin getmin = k.AnonymousClass10.length;
            FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            ShopModel shopModel = merchantActionListView.length;
            if (shopModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopModel");
            }
            k.AnonymousClass10.getMin.length(supportFragmentManager, new GriverMenuExtensionImpl(shopModel));
            t tVar = merchantActionListView.nearbyAnalyticTracker;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
            }
            ShopModel shopModel2 = merchantActionListView.length;
            if (shopModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopModel");
            }
            tVar.setMin(shopModel2, TrackerKey.SourceType.NEARBY_ME_DETAIL);
        }
    }

    public static final /* synthetic */ void access$launchMessage(MerchantActionListView merchantActionListView, String str) {
        Context context = merchantActionListView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        Context context2 = merchantActionListView.getContext();
        Object[] objArr = new Object[1];
        ShopModel shopModel = merchantActionListView.length;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shopModel");
        }
        objArr[0] = shopModel.invoke;
        String string = context2.getString(R.string.customer_service_wa_template, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…late, shopModel.mainName)");
        startBeaconDiscovery.getMin(context, str, string);
    }
}
