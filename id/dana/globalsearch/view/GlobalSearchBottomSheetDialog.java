package id.dana.globalsearch.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.contract.globalsearch.GlobalSearchBottomSheetModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.OauthModule;
import id.dana.domain.globalsearch.model.LatLng;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.tracker.TrackerKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import o.MyBeaconServiceImpl;
import o.OptionMenuRecyclerAdapter;
import o.PrepareException;
import o.R;
import o.RVSnapshotUtils;
import o.WindowBridgeExtension;
import o.getDuration;
import o.getTranslateY;
import o.isShowMenu;
import o.order;
import o.resetInternal;
import o.setH5MenuList;
import o.setPublishStatus;
import o.startBeaconDiscovery;
import o.stopIgnoring;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0005\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020+H\u0014J\b\u0010,\u001a\u00020-H\u0014J\u0017\u0010.\u001a\u00020&2\b\u0010/\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0002\u00100J\u0018\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H\u0002J\u0018\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020-H\u0014J\b\u00107\u001a\u00020$H\u0002J\b\u00108\u001a\u00020$H\u0002J\u0018\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002J\b\u0010=\u001a\u00020$H\u0002J\u0012\u0010>\u001a\u00020$2\b\u0010?\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020$H\u0016J\b\u0010D\u001a\u00020$H\u0014J\u0012\u0010E\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u000e\u0010F\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010G\u001a\u00020$H\u0002J$\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020J2\b\u00102\u001a\u0004\u0018\u00010&2\b\u00103\u001a\u0004\u0018\u00010&H\u0002J\u0018\u0010K\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H\u0002J\b\u0010L\u001a\u00020$H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006N"}, d2 = {"Lid/dana/globalsearch/view/GlobalSearchBottomSheetDialog;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$View;", "()V", "bottomSheetCallback", "id/dana/globalsearch/view/GlobalSearchBottomSheetDialog$bottomSheetCallback$2$1", "getBottomSheetCallback", "()Lid/dana/globalsearch/view/GlobalSearchBottomSheetDialog$bottomSheetCallback$2$1;", "bottomSheetCallback$delegate", "Lkotlin/Lazy;", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "danaLoadingDialog$delegate", "paySearchInfo", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "presenter", "Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$Presenter;", "getPresenter", "()Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$Presenter;", "setPresenter", "(Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$Presenter;)V", "qrPresenter", "Lid/dana/contract/staticqr/ScanQrContract$Presenter;", "getQrPresenter", "()Lid/dana/contract/staticqr/ScanQrContract$Presenter;", "setQrPresenter", "(Lid/dana/contract/staticqr/ScanQrContract$Presenter;)V", "readDeepLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadDeepLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadDeepLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "checkIsUrlDeepLink", "", "url", "", "dismissProgress", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "getReviewCount", "reviewCount", "(Ljava/lang/Integer;)Ljava/lang/String;", "handleOpenHourIfNotFullDay", "openHour", "closeHour", "initBottomSheet", "peekHeight", "bottomSheetState", "initComponent", "initDecodeData", "initDirectionButton", "lat", "", "lon", "initView", "onError", "errorMessage", "onGetMerchantDetailSuccess", "merchantInfoModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantInfoModel;", "onResume", "onShow", "setLogoUrl", "setSearchResult", "setupBottomSheet", "setupMerchantDistanceAndOpenHours", "isFullday", "", "show24HourOrOpenTimeText", "showProgress", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GlobalSearchBottomSheetDialog extends order implements getTranslateY.getMax {
    @NotNull
    public static final setMax getMax = new setMax((byte) 0);
    private final Lazy IsOverlapping = LazyKt.lazy(new length(this));
    public PaySearchInfoModel getMin;
    private final Lazy isInside = LazyKt.lazy(new getMax(this));
    @Inject
    public getTranslateY.setMax presenter;
    @Inject
    public R.id.getMax qrPresenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    private HashMap toIntRange;

    private View setMin(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return id.dana.R.layout.bottomsheet_globalsearch_container;
    }

    public final float length() {
        return 0.5f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/DanaLoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<setPublishStatus> {
        final /* synthetic */ GlobalSearchBottomSheetDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog) {
            super(0);
            this.this$0 = globalSearchBottomSheetDialog;
        }

        @NotNull
        public final setPublishStatus invoke() {
            return new setPublishStatus(this.this$0.requireActivity());
        }
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) setMin(resetInternal.setMax.RequiresPermission);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "fl_bottom_sheet");
        return frameLayout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/globalsearch/view/GlobalSearchBottomSheetDialog$bottomSheetCallback$2$1", "invoke", "()Lid/dana/globalsearch/view/GlobalSearchBottomSheetDialog$bottomSheetCallback$2$1;"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<AnonymousClass2> {
        final /* synthetic */ GlobalSearchBottomSheetDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog) {
            super(0);
            this.this$0 = globalSearchBottomSheetDialog;
        }

        @NotNull
        public final AnonymousClass2 invoke() {
            return new BottomSheetBehavior.BottomSheetCallback(this) {
                final /* synthetic */ length length;

                public final void onSlide(@NotNull View view, float f) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                }

                {
                    this.length = r1;
                }

                public final void onStateChanged(@NotNull View view, int i) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                    if (5 == i) {
                        this.length.this$0.dismissAllowingStateLoss();
                    }
                }
            };
        }
    }

    public final void setMin(int i, int i2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        WindowManager windowManager = requireActivity.getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager, "requireActivity().windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        super.setMin(i, i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ GlobalSearchBottomSheetDialog getMax;

        toIntRange(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog) {
            this.getMax = globalSearchBottomSheetDialog;
        }

        public final void onClick(View view) {
            this.getMax.dismissAllowingStateLoss();
        }
    }

    public final void setMin() {
        LatLng location;
        Map<String, Object> info;
        super.setMin();
        setMin(setMin(getDialog()), 3);
        BottomSheetBehavior bottomSheetBehavior = this.length;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setBottomSheetCallback((length.AnonymousClass2) this.IsOverlapping.getValue());
        }
        FrameLayout frameLayout = (FrameLayout) setMin(resetInternal.setMax.RequiresPermission);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new toIntRange(this));
        }
        RVSnapshotUtils.setMax setmax = new RVSnapshotUtils.setMax((byte) 0);
        BaseActivity baseActivity = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        PrepareException.AnonymousClass1 applicationComponent = baseActivity.getApplicationComponent();
        String str = null;
        if (applicationComponent != null) {
            setmax.toFloatRange = applicationComponent;
            setmax.length = new DeepLinkModule(DeepLinkModule.getMax(), (byte) 0);
            ScanQrModule.setMin max = ScanQrModule.getMax();
            max.setMin = getActivity();
            setmax.getMax = new ScanQrModule(max, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = getActivity();
            setmax.setMin = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length2 = FeatureModule.length();
            length2.setMax = getActivity();
            setmax.setMax = new FeatureModule(length2, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = getActivity();
            setmax.toIntRange = new OauthModule(min2, (byte) 0);
            setmax.getMin = new GlobalSearchBottomSheetModule(this);
            stopIgnoring.setMin(setmax.getMin, GlobalSearchBottomSheetModule.class);
            stopIgnoring.setMin(setmax.length, DeepLinkModule.class);
            stopIgnoring.setMin(setmax.getMax, ScanQrModule.class);
            stopIgnoring.setMin(setmax.setMin, RestoreUrlModule.class);
            stopIgnoring.setMin(setmax.setMax, FeatureModule.class);
            stopIgnoring.setMin(setmax.toIntRange, OauthModule.class);
            if (setmax.isInside == null) {
                setmax.isInside = new ServicesModule();
            }
            stopIgnoring.setMin(setmax.toFloatRange, PrepareException.AnonymousClass1.class);
            new RVSnapshotUtils(setmax.getMin, setmax.length, setmax.getMax, setmax.setMin, setmax.setMax, setmax.toIntRange, setmax.isInside, setmax.toFloatRange, (byte) 0).setMax(this);
            PaySearchInfoModel paySearchInfoModel = this.getMin;
            if (!(paySearchInfoModel == null || (info = paySearchInfoModel.getInfo()) == null)) {
                getTranslateY.setMax setmax2 = this.presenter;
                if (setmax2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                setmax2.getMin(String.valueOf(info.get(FeatureParams.SHOP_ID)), String.valueOf(info.get("merchantId")));
            }
            PaySearchInfoModel paySearchInfoModel2 = this.getMin;
            String displayedShopLogo = paySearchInfoModel2 != null ? paySearchInfoModel2.getDisplayedShopLogo() : null;
            Context context = getContext();
            if (context != null) {
                ((updateCornerMarking) Glide.getMax(context)).setMax(displayedShopLogo).setMax((int) id.dana.R.drawable.ic_merchant_logo_placeholder).setMin((int) id.dana.R.drawable.ic_merchant_logo_placeholder).length((ImageView) (AppCompatImageView) setMin(resetInternal.setMax.onWindowStartingSupportActionMode));
            }
            TextView textView = (TextView) setMin(resetInternal.setMax.removeAllTabs);
            if (textView != null) {
                PaySearchInfoModel paySearchInfoModel3 = this.getMin;
                textView.setText(paySearchInfoModel3 != null ? paySearchInfoModel3.getName() : null);
            }
            TextView textView2 = (TextView) setMin(resetInternal.setMax.setSelected);
            if (textView2 != null) {
                PaySearchInfoModel paySearchInfoModel4 = this.getMin;
                textView2.setText(paySearchInfoModel4 != null ? paySearchInfoModel4.getMccName() : null);
            }
            TextView textView3 = (TextView) setMin(resetInternal.setMax.clearFocus);
            if (textView3 != null) {
                textView3.setText("");
            }
            TextView textView4 = (TextView) setMin(resetInternal.setMax.setDividerPadding);
            if (textView4 != null) {
                PaySearchInfoModel paySearchInfoModel5 = this.getMin;
                textView4.setText(paySearchInfoModel5 != null ? paySearchInfoModel5.getAddress() : null);
            }
            TextView textView5 = (TextView) setMin(resetInternal.setMax.measureChildBeforeLayout);
            if (textView5 != null) {
                PaySearchInfoModel paySearchInfoModel6 = this.getMin;
                if (paySearchInfoModel6 != null) {
                    str = paySearchInfoModel6.getDistance();
                }
                textView5.setText(str);
            }
            PaySearchInfoModel paySearchInfoModel7 = this.getMin;
            if (!(paySearchInfoModel7 == null || (location = paySearchInfoModel7.getLocation()) == null)) {
                ((DanaButtonSecondaryView) setMin(resetInternal.setMax.onNavigationEvent)).setOnClickListener(new setMin(this, location.getLatitude(), location.getLongitude()));
            }
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMin(resetInternal.setMax.getCause);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setOnClickListener(new IsOverlapping(this));
            }
            PaySearchInfoModel paySearchInfoModel8 = this.getMin;
            if (paySearchInfoModel8 != null) {
                DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) setMin(resetInternal.setMax.getInterfaceDescriptor);
                if (danaButtonSecondaryView != null) {
                    danaButtonSecondaryView.setOnClickListener(new getMin(paySearchInfoModel8, this));
                }
                DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) setMin(resetInternal.setMax.ICustomTabsCallback$Stub);
                if (danaButtonPrimaryView2 != null) {
                    danaButtonPrimaryView2.setOnClickListener(new equals(paySearchInfoModel8, this));
                }
            }
            if (this.qrPresenter != null) {
                R.id.getMax getmax = this.qrPresenter;
                if (getmax == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("qrPresenter");
                }
                getmax.getMin();
                R.id.getMax getmax2 = this.qrPresenter;
                if (getmax2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("qrPresenter");
                }
                getmax2.length();
                return;
            }
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ GlobalSearchBottomSheetDialog getMin;

        IsOverlapping(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog) {
            this.getMin = globalSearchBottomSheetDialog;
        }

        public final void onClick(View view) {
            this.getMin.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/globalsearch/view/GlobalSearchBottomSheetDialog$initView$4$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ PaySearchInfoModel getMin;
        final /* synthetic */ GlobalSearchBottomSheetDialog length;

        getMin(PaySearchInfoModel paySearchInfoModel, GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog) {
            this.getMin = paySearchInfoModel;
            this.length = globalSearchBottomSheetDialog;
        }

        public final void onClick(View view) {
            GlobalSearchBottomSheetDialog.length(this.length, String.valueOf(this.getMin.getUrlMap().get("DETAIL")));
            Intrinsics.checkNotNullExpressionValue(view, "it");
            view.setEnabled(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/globalsearch/view/GlobalSearchBottomSheetDialog$initView$4$2"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ PaySearchInfoModel getMin;
        final /* synthetic */ GlobalSearchBottomSheetDialog setMax;

        equals(PaySearchInfoModel paySearchInfoModel, GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog) {
            this.getMin = paySearchInfoModel;
            this.setMax = globalSearchBottomSheetDialog;
        }

        public final void onClick(View view) {
            GlobalSearchBottomSheetDialog.length(this.setMax, this.getMin.getPayType());
            Intrinsics.checkNotNullExpressionValue(view, "it");
            view.setEnabled(false);
        }
    }

    public final void onResume() {
        super.onResume();
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) setMin(resetInternal.setMax.getInterfaceDescriptor);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setEnabled(true);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMin(resetInternal.setMax.ICustomTabsCallback$Stub);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setEnabled(true);
        }
    }

    public final void length(@NotNull OptionMenuRecyclerAdapter optionMenuRecyclerAdapter) {
        Context context;
        Resources resources;
        String str;
        Intrinsics.checkNotNullParameter(optionMenuRecyclerAdapter, "merchantInfoModel");
        boolean max = optionMenuRecyclerAdapter.getMax();
        String str2 = optionMenuRecyclerAdapter.setMin;
        String str3 = optionMenuRecyclerAdapter.length;
        String str4 = "";
        if (max) {
            TextView textView = (TextView) setMin(resetInternal.setMax.clearFocus);
            if (textView != null) {
                textView.setText(getResources().getString(id.dana.R.string.merchant_info_twenty_four_hour_value));
            }
        } else {
            if (str2 == null) {
                str2 = str4;
            }
            if (str3 == null) {
                str3 = str4;
            }
            if (str2.length() == 0) {
                if (str3.length() == 0) {
                    TextView textView2 = (TextView) setMin(resetInternal.setMax.clearFocus);
                    if (textView2 != null) {
                        textView2.setText(getResources().getString(id.dana.R.string.merchant_default_empty_value));
                    }
                }
            }
            TextView textView3 = (TextView) setMin(resetInternal.setMax.clearFocus);
            if (textView3 != null) {
                if (Intrinsics.areEqual((Object) str2, (Object) str3)) {
                    str = getResources().getString(id.dana.R.string.merchant_info_twenty_four_hour_value);
                    Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.st…o_twenty_four_hour_value)");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(" - ");
                    sb.append(str3);
                    str = sb.toString();
                }
                textView3.setText(str);
            }
        }
        TextView textView4 = (TextView) setMin(resetInternal.setMax.setQueryHint);
        String str5 = null;
        if (textView4 != null) {
            Double d = optionMenuRecyclerAdapter.IsOverlapping;
            textView4.setText(d != null ? String.valueOf(MathKt.roundToInt(d.doubleValue())) : null);
        }
        TextView textView5 = (TextView) setMin(resetInternal.setMax.getSuggestionsAdapter);
        if (textView5 != null) {
            Double d2 = optionMenuRecyclerAdapter.equals;
            Integer valueOf = d2 != null ? Integer.valueOf((int) d2.doubleValue()) : null;
            if (!(valueOf == null || (context = getContext()) == null || (resources = context.getResources()) == null)) {
                str5 = resources.getQuantityString(id.dana.R.plurals.f75252131755014, valueOf.intValue());
            }
            if (str5 != null) {
                str4 = str5;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(str4, Arrays.copyOf(new Object[]{valueOf}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            textView5.setText(format);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ double getMax;
        final /* synthetic */ GlobalSearchBottomSheetDialog getMin;
        final /* synthetic */ double setMin;

        setMin(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog, double d, double d2) {
            this.getMin = globalSearchBottomSheetDialog;
            this.getMax = d;
            this.setMin = d2;
        }

        public final void onClick(View view) {
            Context context = this.getMin.getContext();
            if (context != null) {
                startBeaconDiscovery.setMin(context, this.getMax, this.setMin);
            }
        }
    }

    public final void onError(@Nullable String str) {
        ConstraintLayout constraintLayout = (ConstraintLayout) setMin(resetInternal.setMax.addQueueItemAt);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "clBottomSheet");
        constraintLayout.setVisibility(8);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) setMin(resetInternal.setMax.removeQueueItem);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "clError");
        constraintLayout2.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/globalsearch/view/GlobalSearchBottomSheetDialog$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void showProgress() {
        setPublishStatus setpublishstatus = (setPublishStatus) this.isInside.getValue();
        if (!setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
    }

    public final void dismissProgress() {
        ((setPublishStatus) this.isInside.getValue()).getMax();
    }

    public static final /* synthetic */ void length(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog, String str) {
        if (str != null && StringsKt.contains$default((CharSequence) MyBeaconServiceImpl.length(str), (CharSequence) "https://link.dana.id/", false, 2, (Object) null)) {
            getDuration.length length2 = globalSearchBottomSheetDialog.readDeepLinkPropertiesPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
            }
            String max = setH5MenuList.setMax(str, "");
            Intrinsics.checkNotNullExpressionValue(max, "composeSceneDeeplinkUrl(url, \"\")");
            length2.setMax(max);
        } else if (!Patterns.WEB_URL.matcher(str).matches()) {
            R.id.getMax getmax = globalSearchBottomSheetDialog.qrPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("qrPresenter");
            }
            getmax.setMin(str, TrackerKey.SourceType.GLOBAL_SEARCH, "");
        } else if (!WindowBridgeExtension.AnonymousClass1.getMin()) {
            String min = isShowMenu.setMin(String.valueOf(str));
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(url.toString())");
            DanaH5.startContainerFullUrl(min);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
