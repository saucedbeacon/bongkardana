package o;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.GsonBuilder;
import com.iap.ac.android.biz.common.constants.ACConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.globalnetwork.CountryCode;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001NB7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J$\u0010\u001e\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00192\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190 H\u0002J&\u0010!\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\"2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019H\u0016J$\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190 2\u0006\u0010(\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020*H\u0002J\u0016\u0010+\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010,0,0\"H\u0016J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\"2\u0006\u0010.\u001a\u00020\u0019H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\"2\u0006\u0010.\u001a\u00020\u0019H\u0016J.\u00100\u001a\u00020,2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u0010.\u001a\u00020\u00192\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001905H\u0002J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00190\"H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u000208H\u0014J\u0016\u00109\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010,0,0\"H\u0016J\u0016\u0010:\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010,0,0\"H\u0016J\u0016\u0010;\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\"H\u0016J\u0016\u0010<\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\"H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020,0\"H\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020,0\"H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020,0\"H\u0016J\u0017\u0010@\u001a\u00020,2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\bJ\u001e\u0010D\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010,0,0\"2\u0006\u0010E\u001a\u00020,H\u0016J\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020,0\"2\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0016J\u001e\u0010H\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010,0,0\"2\u0006\u0010I\u001a\u00020,H\u0016J\u001e\u0010J\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010,0,0\"2\u0006\u0010K\u001a\u00020,H\u0016J \u0010L\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010,0,0\"2\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0016J \u0010M\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010,0,0\"2\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0016R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R)\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u00188BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lid/dana/data/globalnetwork/source/network/NetworkGlobalNetworkEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/globalnetwork/source/network/facade/GlobalNetworkFacade;", "Lid/dana/data/globalnetwork/GlobalNetworkEntityData;", "context", "Landroid/content/Context;", "geocoderApi", "Lid/dana/data/geocode/repository/source/network/GeocoderApi;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "(Landroid/content/Context;Lid/dana/data/geocode/repository/source/network/GeocoderApi;Lid/dana/domain/featureconfig/FeatureConfigRepository;Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "countryCodeSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getCountryCodeSubject", "()Lio/reactivex/subjects/PublishSubject;", "countryCodeSubject$delegate", "convertMapToJson", "mapData", "", "decodeGnQr", "Lio/reactivex/Observable;", "acDecodeValue", "acDecodeConfig", "doGnConsult", "Lid/dana/data/globalnetwork/model/GnConsultResult;", "sdkRequestHeaderMap", "sdkRequestData", "generateUserLocation", "Lid/dana/data/globalnetwork/model/UserLocation;", "getAlipayConnectServiceFirstTime", "", "getCountryCodeByCloudLocation", "apiKey", "getCountryCodeByLocation", "getCountryCodeFromGeocoderApi", "latitude", "", "longitude", "emitter", "Lio/reactivex/Emitter;", "getCurrentCountryCode", "getFacadeClass", "Ljava/lang/Class;", "getGnPayQrTooltip", "getGnWelcomingFirstTime", "getOriginCountryCode", "getSelectedCountryCode", "isCScanBEnabled", "isGlobalNetworkEnabled", "isGlobalNetworkMode", "launch", "action", "Lkotlin/Function0;", "Lio/reactivex/disposables/Disposable;", "saveAlipayConnectServiceFirstTime", "acFirstTime", "saveCurrentCountryCode", "countryCode", "saveGnPayQrTooltip", "firstGnPayQrTooltip", "saveGnWelcomingFirstTime", "gnFirstTime", "saveOriginCountryCode", "saveSelectedCountryCode", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setDark extends setRepeatCount<isSupportDarkTheme> implements PageShowPoint {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    public static final int LOCATION_RESULT = 1;
    private static final String STATUS_OK = "OK";
    private final Lazy compositeDisposable$delegate = LazyKt.lazy(setMax.INSTANCE);
    private final Lazy countryCodeSubject$delegate = LazyKt.lazy(getMax.INSTANCE);
    private final setDefaultFontSize featureConfigRepository;
    private final BackPressedPoint geocoderApi;

    /* access modifiers changed from: private */
    public final IRedDotManager getCompositeDisposable() {
        return (IRedDotManager) this.compositeDisposable$delegate.getValue();
    }

    private final IComponent<String> getCountryCodeSubject() {
        return (IComponent) this.countryCodeSubject$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/globalnetwork/model/GnConsultResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/globalnetwork/source/network/facade/GlobalNetworkFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class length<F, S> implements addAnimatorUpdateListener.getMax<isSupportDarkTheme, PageContainer> {
        final /* synthetic */ enableShowErrorPage setMax;

        length(enableShowErrorPage enableshowerrorpage) {
            this.setMax = enableshowerrorpage;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((isSupportDarkTheme) obj).gnConsult(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "countryCode", "", "apply", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<String, Boolean> {
        public static final toFloatRange setMax = new toFloatRange();

        toFloatRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            return Boolean.valueOf(Intrinsics.areEqual((Object) CountryCode.JAPAN, (Object) str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "result", "Lid/dana/data/geocode/model/GeocoderResult;", "kotlin.jvm.PlatformType", "accept", "id/dana/data/globalnetwork/source/network/NetworkGlobalNetworkEntityData$getCountryCodeFromGeocoderApi$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T> implements RedDotManager<createDialog> {
        final /* synthetic */ setDark getMax;
        final /* synthetic */ double getMin;
        final /* synthetic */ String length;
        final /* synthetic */ getOptionMenuBlinkAnimator setMax;
        final /* synthetic */ double setMin;

        toIntRange(setDark setdark, double d, double d2, String str, getOptionMenuBlinkAnimator getoptionmenublinkanimator) {
            this.getMax = setdark;
            this.getMin = d;
            this.setMin = d2;
            this.length = str;
            this.setMax = getoptionmenublinkanimator;
        }

        public final /* synthetic */ void accept(Object obj) {
            createDialog createdialog = (createDialog) obj;
            getCurrentColorScheme getcurrentcolorscheme = getCurrentColorScheme.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(createdialog, "result");
            this.setMax.onNext(getcurrentcolorscheme.getCountryCode(createdialog));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setDark(@NotNull Context context, @NotNull BackPressedPoint backPressedPoint, @NotNull setDefaultFontSize setdefaultfontsize, @NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(backPressedPoint, "geocoderApi");
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        this.geocoderApi = backPressedPoint;
        this.featureConfigRepository = setdefaultfontsize;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/disposables/CompositeDisposable;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<IRedDotManager> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(0);
        }

        @NotNull
        public final IRedDotManager invoke() {
            return new IRedDotManager();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<IComponent<String>> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(0);
        }

        @NotNull
        public final IComponent<String> invoke() {
            return IComponent.setMax();
        }
    }

    private final boolean launch(Function0<? extends GriverProgressBar.UpdateRunnable> function0) {
        return getCompositeDisposable().getMin((GriverProgressBar.UpdateRunnable) function0.invoke());
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getCountryCodeByLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "apiKey");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new RVViewFactory(0.0d, 0.0d);
        TitleBarRightButtonView.AnonymousClass1<String> create = TitleBarRightButtonView.AnonymousClass1.create(new isInside(this, objectRef, str));
        Intrinsics.checkNotNullExpressionValue(create, "Observable.create {\n    …)\n            }\n        }");
        return create;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/ObservableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<String> {
        final /* synthetic */ Ref.ObjectRef getMax;
        final /* synthetic */ String setMax;
        final /* synthetic */ setDark setMin;

        isInside(setDark setdark, Ref.ObjectRef objectRef, String str) {
            this.setMin = setdark;
            this.getMax = objectRef;
            this.setMax = str;
        }

        public final void subscribe(@NotNull TitleBarRightButtonView.AnonymousClass2<String> r10) {
            Intrinsics.checkNotNullParameter(r10, "it");
            try {
                this.getMax.element = this.setMin.generateUserLocation();
                Address address = new Geocoder(this.setMin.getContext(), Locale.getDefault()).getFromLocation(((RVViewFactory) this.getMax.element).getLatitude(), ((RVViewFactory) this.getMax.element).getLongitude(), 1).get(0);
                String countryCode = address != null ? address.getCountryCode() : null;
                if (countryCode == null) {
                    countryCode = "";
                }
                if (!TextUtils.isEmpty(countryCode)) {
                    r10.onNext(countryCode);
                } else {
                    boolean unused = this.setMin.getCountryCodeFromGeocoderApi(((RVViewFactory) this.getMax.element).getLatitude(), ((RVViewFactory) this.getMax.element).getLongitude(), this.setMax, r10);
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.setMin.getClass().getName());
                sb.append(' ');
                sb.append(e.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, sb.toString());
                boolean unused2 = this.setMin.getCountryCodeFromGeocoderApi(((RVViewFactory) this.getMax.element).getLatitude(), ((RVViewFactory) this.getMax.element).getLongitude(), this.setMax, r10);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/ObservableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<String> {
        final /* synthetic */ setDark length;
        final /* synthetic */ String setMin;

        getMin(setDark setdark, String str) {
            this.length = setdark;
            this.setMin = str;
        }

        public final void subscribe(@NotNull TitleBarRightButtonView.AnonymousClass2<String> r9) {
            Intrinsics.checkNotNullParameter(r9, "it");
            RVViewFactory access$generateUserLocation = this.length.generateUserLocation();
            boolean unused = this.length.getCountryCodeFromGeocoderApi(access$generateUserLocation.getLatitude(), access$generateUserLocation.getLongitude(), this.setMin, r9);
        }
    }

    @Nullable
    public final TitleBarRightButtonView.AnonymousClass1<String> getCountryCodeByCloudLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "apiKey");
        return TitleBarRightButtonView.AnonymousClass1.create(new getMin(this, str));
    }

    @NotNull
    public final PageContainer doGnConsult(@NotNull Map<String, String> map, @NotNull String str) {
        Intrinsics.checkNotNullParameter(map, "sdkRequestHeaderMap");
        Intrinsics.checkNotNullParameter(str, "sdkRequestData");
        enableShowErrorPage enableshowerrorpage = new enableShowErrorPage((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        enableshowerrorpage.setSdkRequestHeader(convertMapToJson(map));
        enableshowerrorpage.setSdkRequestData(str);
        BaseRpcResult wrapperMainThread = wrapperMainThread(new length(enableshowerrorpage));
        Intrinsics.checkNotNullExpressionValue(wrapperMainThread, "wrapperMainThread { it.gnConsult(request) }");
        return (PageContainer) wrapperMainThread;
    }

    /* access modifiers changed from: private */
    public final RVViewFactory generateUserLocation() {
        try {
            LBSLocation latestLocation = handlePushWindow.getLatestLocation(getContext());
            Intrinsics.checkNotNullExpressionValue(latestLocation, "lbsLocation");
            return new RVViewFactory(latestLocation.getLatitude(), latestLocation.getLongitude());
        } catch (Exception unused) {
            return new RVViewFactory(0.0d, 0.0d);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnWelcomingFirstTime(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(z));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(gnFirstTime)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkMode() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getCountryCodeSubject().map(toFloatRange.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "countryCodeSubject.map {…CODE == countryCode\n    }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getGnPayQrTooltip() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(false)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getSelectedCountryCode() {
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just("");
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\"\")");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveSelectedCountryCode(@Nullable String str) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(false)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getOriginCountryCode() {
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just("");
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\"\")");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveOriginCountryCode(@Nullable String str) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(false)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getGnWelcomingFirstTime() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(false)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveAlipayConnectServiceFirstTime(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(z));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n        acFirstTime)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled = this.featureConfigRepository.isCScanBEnabled();
        Intrinsics.checkNotNullExpressionValue(isCScanBEnabled, "featureConfigRepository.isCScanBEnabled");
        return isCScanBEnabled;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> decodeGnQr(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "acDecodeValue");
        Intrinsics.checkNotNullParameter(str2, ACConstants.PARAMETER_KEY_AC_DECODE_CONFIG);
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just("");
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n        \"\")");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getAlipayConnectServiceFirstTime() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(false)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnPayQrTooltip(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(z));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n        firstGnPayQrTooltip)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getCurrentCountryCode() {
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just("");
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\"\")");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentCountryCode(@Nullable String str) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(false)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled = this.featureConfigRepository.isGlobalNetworkEnabled();
        Intrinsics.checkNotNullExpressionValue(isGlobalNetworkEnabled, "featureConfigRepository\n…  .isGlobalNetworkEnabled");
        return isGlobalNetworkEnabled;
    }

    @NotNull
    public final Class<isSupportDarkTheme> getFacadeClass() {
        return isSupportDarkTheme.class;
    }

    private final String convertMapToJson(Map<String, String> map) {
        return new GsonBuilder().create().toJson((Object) map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/globalnetwork/source/network/NetworkGlobalNetworkEntityData$Companion;", "", "()V", "LOCATION_RESULT", "", "STATUS_OK", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final boolean getCountryCodeFromGeocoderApi(double d, double d2, String str, getOptionMenuBlinkAnimator<String> getoptionmenublinkanimator) {
        IRedDotManager access$getCompositeDisposable$p = getCompositeDisposable();
        String valueOf = String.valueOf(d);
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf);
        sb.append(",");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        double d3 = d2;
        sb2.append(d3);
        String str2 = str;
        GriverProgressBar.UpdateRunnable subscribe = this.geocoderApi.reverseGeocode(sb2.toString(), str2).subscribeOn(getSecureSignatureComp.setMin()).subscribe(new toIntRange(this, d, d3, str2, getoptionmenublinkanimator));
        Intrinsics.checkNotNullExpressionValue(subscribe, "geocoderApi.reverseGeoco…ountryCode)\n            }");
        return access$getCompositeDisposable$p.getMin(subscribe);
    }
}
