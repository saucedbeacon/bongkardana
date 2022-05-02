package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.data.constant.UrlTag;
import id.dana.di.modules.MerchantDetailConfigModule;
import id.dana.di.modules.MerchantDetailMenuModule;
import id.dana.nearbyme.merchantdetail.enums.MerchantMenu;
import id.dana.nearbyme.model.ShopModel;
import id.dana.tracker.mixpanel.TopupSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AuthenticationProxy;
import o.GriverBaseFragmentActivity;
import o.GriverMenuExtensionImpl;
import o.GriverOptionMenuPanelExtensionImpl;
import o.GriverTransActivity;
import o.OptionMenuRecyclerAdapter;
import o.PrepareException;
import o.RuntimeVersionChecker;
import o.UniformLocalAuthDialogExtensionImpl;
import o.UniformOptionMenuPanelExtensionImpl;
import o.createPayloadsIfNeeded;
import o.getBluetoothAdapterState;
import o.getDynamicPluginModelMap;
import o.getSerialNumberEncrypt;
import o.onDelete;
import o.resetInternal;
import o.startBeaconDiscovery;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002?@B%\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\u0012\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u000f\u0010'\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010(J\u000f\u0010)\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010(J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\"H\u0002J\b\u00101\u001a\u00020\"H\u0002J\b\u00102\u001a\u00020\"H\u0002J\u000e\u00103\u001a\u00020\"2\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000eJ\b\u00107\u001a\u00020\"H\u0016J\u0016\u00108\u001a\u00020\"2\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0002J\b\u0010<\u001a\u00020\"H\u0002J\u0012\u0010=\u001a\b\u0012\u0004\u0012\u00020;0>*\u00020,H\u0002R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailMenuView;", "Lid/dana/base/BaseRichView;", "Lid/dana/nearbyme/merchantdetail/MerchantDetailContract;", "Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "actionListener", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailMenuView$ActionListener;", "adapter", "Lid/dana/nearbyme/merchantdetail/adapter/MerchantMenuAdapter;", "component", "Lid/dana/di/component/MerchantDetailMenuComponent;", "configPresenter", "Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$Presenter;", "getConfigPresenter", "()Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$Presenter;", "setConfigPresenter", "(Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$Presenter;)V", "h5Launcher", "Lid/dana/H5Launcher;", "getH5Launcher", "()Lid/dana/H5Launcher;", "setH5Launcher", "(Lid/dana/H5Launcher;)V", "merchantDetailViewState", "Lid/dana/nearbyme/merchantdetail/model/MerchantDetailViewState;", "bindViewState", "", "getLayout", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onContactUsAction", "()Lkotlin/Unit;", "onDirectionAction", "onGetActionConfig", "merchantDetailConfig", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "onMenuClick", "menu", "Lid/dana/nearbyme/merchantdetail/enums/MerchantMenu;", "onPickupAction", "onReserveAction", "onTopUpAction", "renderMenu", "merchantInfo", "Lid/dana/nearbyme/merchantdetail/model/MerchantInfoModel;", "setActionListener", "setup", "setupAdapter", "menus", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantMenuModel;", "setupPresenter", "toMerchantMenus", "", "ActionListener", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDetailMenuView extends BaseRichView implements GriverTransActivity.Lite1, GriverBaseFragmentActivity.getMin {
    @NotNull
    public static final length Companion = new length((byte) 0);
    public static final float MENU_VIEW_ELEVATION = 2.0f;
    @Inject
    public GriverBaseFragmentActivity.getMax configPresenter;
    private HashMap getMax;
    /* access modifiers changed from: private */
    public RuntimeVersionChecker getMin;
    @Inject
    public createPayloadsIfNeeded h5Launcher;
    /* access modifiers changed from: private */
    public UniformLocalAuthDialogExtensionImpl length;
    private GriverMenuExtensionImpl setMax;
    private setMax setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailMenuView$ActionListener;", "", "onContactUsAction", "", "phone", "", "onGetActionConfig", "onHomeShoppingAction", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void getMin();

        void length();

        void setMin(@NotNull String str);
    }

    @JvmOverloads
    public MerchantDetailMenuView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantDetailMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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

    @JvmDefault
    public final void dismissProgress() {
    }

    public final int getLayout() {
        return R.layout.view_merchant_detail_menu;
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    @JvmDefault
    public final void showProgress() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/nearbyme/merchantdetail/enums/MerchantMenu;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMin extends FunctionReferenceImpl implements Function1<MerchantMenu, Unit> {
        setMin(MerchantDetailMenuView merchantDetailMenuView) {
            super(1, merchantDetailMenuView, MerchantDetailMenuView.class, "onMenuClick", "onMenuClick(Lid/dana/nearbyme/merchantdetail/enums/MerchantMenu;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MerchantMenu) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull MerchantMenu merchantMenu) {
            Intrinsics.checkNotNullParameter(merchantMenu, "p1");
            MerchantDetailMenuView.access$onMenuClick((MerchantDetailMenuView) this.receiver, merchantMenu);
        }
    }

    public static final /* synthetic */ UniformLocalAuthDialogExtensionImpl access$getAdapter$p(MerchantDetailMenuView merchantDetailMenuView) {
        UniformLocalAuthDialogExtensionImpl uniformLocalAuthDialogExtensionImpl = merchantDetailMenuView.length;
        if (uniformLocalAuthDialogExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return uniformLocalAuthDialogExtensionImpl;
    }

    public static final /* synthetic */ RuntimeVersionChecker access$getComponent$p(MerchantDetailMenuView merchantDetailMenuView) {
        RuntimeVersionChecker runtimeVersionChecker = merchantDetailMenuView.getMin;
        if (runtimeVersionChecker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
        }
        return runtimeVersionChecker;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantDetailMenuView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantDetailMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantDetailMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final createPayloadsIfNeeded getH5Launcher() {
        createPayloadsIfNeeded createpayloadsifneeded = this.h5Launcher;
        if (createpayloadsifneeded == null) {
            Intrinsics.throwUninitializedPropertyAccessException("h5Launcher");
        }
        return createpayloadsifneeded;
    }

    public final void setH5Launcher(@NotNull createPayloadsIfNeeded createpayloadsifneeded) {
        Intrinsics.checkNotNullParameter(createpayloadsifneeded, "<set-?>");
        this.h5Launcher = createpayloadsifneeded;
    }

    @NotNull
    public final GriverBaseFragmentActivity.getMax getConfigPresenter() {
        GriverBaseFragmentActivity.getMax getmax = this.configPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configPresenter");
        }
        return getmax;
    }

    public final void setConfigPresenter(@NotNull GriverBaseFragmentActivity.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.configPresenter = getmax;
    }

    public final void setActionListener(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "actionListener");
        this.setMin = setmax;
    }

    public final void setup() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportButtonTintList);
        if (recyclerView != null) {
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
            flexboxLayoutManager.setFlexDirection(0);
            flexboxLayoutManager.setFlexWrap(1);
            flexboxLayoutManager.setJustifyContent(4);
            Unit unit = Unit.INSTANCE;
            recyclerView.setLayoutManager(flexboxLayoutManager);
        }
        Intrinsics.checkNotNullParameter(this, "$this$elevate");
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        getBluetoothAdapterState.getMin(this, (int) TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r5) {
        if (this.getMin == null && r5 != null) {
            getDynamicPluginModelMap.length min = getDynamicPluginModelMap.setMin();
            if (r5 != null) {
                min.length = r5;
                min.setMax = new MerchantDetailConfigModule(this);
                min.setMin = new MerchantDetailMenuModule();
                stopIgnoring.setMin(min.setMax, MerchantDetailConfigModule.class);
                if (min.setMin == null) {
                    min.setMin = new MerchantDetailMenuModule();
                }
                stopIgnoring.setMin(min.length, PrepareException.AnonymousClass1.class);
                getDynamicPluginModelMap getdynamicpluginmodelmap = new getDynamicPluginModelMap(min.setMax, min.setMin, min.length, (byte) 0);
                Intrinsics.checkNotNullExpressionValue(getdynamicpluginmodelmap, "DaggerMerchantDetailMenu…                 .build()");
                this.getMin = getdynamicpluginmodelmap;
            } else {
                throw null;
            }
        }
        RuntimeVersionChecker runtimeVersionChecker = this.getMin;
        if (runtimeVersionChecker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
        }
        runtimeVersionChecker.getMax(this);
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        GriverBaseFragmentActivity.getMax getmax = this.configPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configPresenter");
        }
        getminArr[0] = getmax;
        registerPresenter(getminArr);
    }

    public final void bindViewState(@NotNull GriverMenuExtensionImpl griverMenuExtensionImpl) {
        Intrinsics.checkNotNullParameter(griverMenuExtensionImpl, "merchantDetailViewState");
        this.setMax = griverMenuExtensionImpl;
        GriverBaseFragmentActivity.getMax getmax = this.configPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configPresenter");
        }
        registerPresenter(getmax);
        getmax.getMax(false);
    }

    public final void renderMenu(@NotNull OptionMenuRecyclerAdapter optionMenuRecyclerAdapter) {
        Intrinsics.checkNotNullParameter(optionMenuRecyclerAdapter, "merchantInfo");
        if (optionMenuRecyclerAdapter.getMin().length() > 0) {
            UniformLocalAuthDialogExtensionImpl uniformLocalAuthDialogExtensionImpl = this.length;
            if (uniformLocalAuthDialogExtensionImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            List max = uniformLocalAuthDialogExtensionImpl.getMax();
            if (max != null) {
                Iterator it = max.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((GriverOptionMenuPanelExtensionImpl) it.next()).setMax == MerchantMenu.CONTACT_US) {
                        break;
                    }
                    i++;
                }
                ((GriverOptionMenuPanelExtensionImpl) uniformLocalAuthDialogExtensionImpl.setMin(i)).setMin = true;
                uniformLocalAuthDialogExtensionImpl.notifyItemChanged(i);
                Unit unit = Unit.INSTANCE;
            }
        } else {
            UniformLocalAuthDialogExtensionImpl uniformLocalAuthDialogExtensionImpl2 = this.length;
            if (uniformLocalAuthDialogExtensionImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            Function0 getmax = new getMax(this);
            Intrinsics.checkNotNullParameter(getmax, "onEmptyMenu");
            List max2 = uniformLocalAuthDialogExtensionImpl2.getMax();
            Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
            Collection arrayList = new ArrayList();
            for (Object next : max2) {
                if (((GriverOptionMenuPanelExtensionImpl) next).getMin()) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            if (!(true ^ list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                uniformLocalAuthDialogExtensionImpl2.getMin(list);
            } else {
                getmax.invoke();
            }
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportButtonTintList);
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<Unit> {
        final /* synthetic */ MerchantDetailMenuView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(MerchantDetailMenuView merchantDetailMenuView) {
            super(0);
            this.this$0 = merchantDetailMenuView;
        }

        public final void invoke() {
            this.this$0.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailMenuView$Companion;", "", "()V", "MENU_VIEW_ELEVATION", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void onGetActionConfig(@NotNull getSerialNumberEncrypt getserialnumberencrypt) {
        Intrinsics.checkNotNullParameter(getserialnumberencrypt, "merchantDetailConfig");
        GriverMenuExtensionImpl griverMenuExtensionImpl = this.setMax;
        if (griverMenuExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantDetailViewState");
        }
        ShopModel shopModel = griverMenuExtensionImpl.setMax;
        List arrayList = new ArrayList();
        getserialnumberencrypt.getReserveEnabled();
        getserialnumberencrypt.getPickupEnabled();
        if (getserialnumberencrypt.getCallEnabled()) {
            arrayList.add(new GriverOptionMenuPanelExtensionImpl(MerchantMenu.CONTACT_US, false));
        }
        if (getserialnumberencrypt.getDirectionEnabled()) {
            arrayList.add(new GriverOptionMenuPanelExtensionImpl(MerchantMenu.DIRECTION));
        }
        if (getserialnumberencrypt.getTopupEnabled() && shopModel.getMin()) {
            arrayList.add(new GriverOptionMenuPanelExtensionImpl(MerchantMenu.TOP_UP, true));
        }
        if (shopModel.toIntRange()) {
            arrayList.add(new GriverOptionMenuPanelExtensionImpl(MerchantMenu.HOME_SHOPPING));
        }
        MerchantDetailMenuView merchantDetailMenuView = this;
        if (merchantDetailMenuView.length == null) {
            this.length = new UniformLocalAuthDialogExtensionImpl(new setMin(merchantDetailMenuView));
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportButtonTintList);
        if (recyclerView != null) {
            UniformLocalAuthDialogExtensionImpl uniformLocalAuthDialogExtensionImpl = this.length;
            if (uniformLocalAuthDialogExtensionImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            recyclerView.setAdapter(uniformLocalAuthDialogExtensionImpl);
        }
        UniformLocalAuthDialogExtensionImpl uniformLocalAuthDialogExtensionImpl2 = this.length;
        if (uniformLocalAuthDialogExtensionImpl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        uniformLocalAuthDialogExtensionImpl2.getMin(arrayList);
        setMax setmax = this.setMin;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionListener");
        }
        setmax.length();
        setVisibility(0);
    }

    public static final /* synthetic */ void access$onMenuClick(MerchantDetailMenuView merchantDetailMenuView, MerchantMenu merchantMenu) {
        boolean z = true;
        Unit unit = null;
        switch (UniformOptionMenuPanelExtensionImpl.AnonymousClass6.getMax[merchantMenu.ordinal()]) {
            case 1:
                unit = Unit.INSTANCE;
                break;
            case 2:
                unit = Unit.INSTANCE;
                break;
            case 3:
                GriverMenuExtensionImpl griverMenuExtensionImpl = merchantDetailMenuView.setMax;
                if (griverMenuExtensionImpl == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantDetailViewState");
                }
                Object obj = griverMenuExtensionImpl.getMin.setMin;
                if (obj == LiveData.setMax) {
                    obj = null;
                }
                OptionMenuRecyclerAdapter optionMenuRecyclerAdapter = (OptionMenuRecyclerAdapter) obj;
                if (optionMenuRecyclerAdapter != null) {
                    String replaceIndoRegionDashWithPhonePrefix = AuthenticationProxy.replaceIndoRegionDashWithPhonePrefix(optionMenuRecyclerAdapter.getMin());
                    if (replaceIndoRegionDashWithPhonePrefix.length() <= 0) {
                        z = false;
                    }
                    if (!z) {
                        replaceIndoRegionDashWithPhonePrefix = null;
                    }
                    if (replaceIndoRegionDashWithPhonePrefix != null) {
                        setMax setmax = merchantDetailMenuView.setMin;
                        if (setmax == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("actionListener");
                        }
                        setmax.setMin(replaceIndoRegionDashWithPhonePrefix);
                        unit = Unit.INSTANCE;
                        break;
                    }
                }
                break;
            case 4:
                Context context = merchantDetailMenuView.getContext();
                if (context != null) {
                    GriverMenuExtensionImpl griverMenuExtensionImpl2 = merchantDetailMenuView.setMax;
                    if (griverMenuExtensionImpl2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantDetailViewState");
                    }
                    ShopModel shopModel = griverMenuExtensionImpl2.setMax;
                    startBeaconDiscovery.setMin(context, shopModel.values, shopModel.toString);
                    unit = Unit.INSTANCE;
                    break;
                }
                break;
            case 5:
                if (merchantDetailMenuView.h5Launcher == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("h5Launcher");
                }
                Pair[] pairArr = new Pair[2];
                pairArr[0] = TuplesKt.to(UrlTag.ENTRY_POINT, TopupSource.NEARBY);
                GriverMenuExtensionImpl griverMenuExtensionImpl3 = merchantDetailMenuView.setMax;
                if (griverMenuExtensionImpl3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantDetailViewState");
                }
                String str = griverMenuExtensionImpl3.setMax.toDoubleRange;
                if (str == null) {
                    str = "";
                }
                pairArr[1] = TuplesKt.to(UrlTag.INSTID, str);
                createPayloadsIfNeeded.length("https://m.dana.id/m/portal/topup?entryPoint={entryPoint}&payMethod=OTC&instId={instId}&fromSKW=true", MapsKt.mapOf(pairArr));
                unit = Unit.INSTANCE;
                break;
            case 6:
                setMax setmax2 = merchantDetailMenuView.setMin;
                if (setmax2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionListener");
                }
                setmax2.getMin();
                unit = Unit.INSTANCE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (unit == null) {
            Unit unit2 = Unit.INSTANCE;
        }
    }
}
