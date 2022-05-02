package o;

import id.dana.data.toggle.exception.SplitException;
import id.dana.data.toggle.exception.SplitNull;
import id.dana.data.toggle.exception.UnexpectedTreatment;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/data/senddigitalmoney/repository/source/split/SplitSendDigitalMoneyEntityData;", "Lid/dana/data/senddigitalmoney/SendDigitalMoneyEntityData;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/data/toggle/SplitFacade;)V", "isCardNoPrefixEnabled", "Lio/reactivex/Observable;", "", "queryCardNoPrefix", "Lid/dana/data/senddigitalmoney/repository/model/result/CardPrefixQueryResult;", "request", "Lid/dana/data/senddigitalmoney/repository/model/request/CardPrefixQueryRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVConfigService implements OneShotRunnablePool {
    private final UpdateAppCallback setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/data/sendmoney/DigitalMoneyEntityData;", "", "getEWalletInnovConfig", "Lio/reactivex/Observable;", "Lid/dana/data/sendmoney/model/EWalletInnovConfigResult;", "getEWalletPrefix", "", "Lid/dana/data/sendmoney/model/DigitalMoneyEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface OnConfigChangeListener {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<currentThreadInArray> getEWalletInnovConfig();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<List<isInDomain>> getEWalletPrefix();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        public static final getMin getMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r4;
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new C0054getMin(getrequestmainpackage, "feature_card_no_prefix", Boolean.FALSE));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r4 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r4 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r4;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/senddigitalmoney/repository/source/split/SplitSendDigitalMoneyEntityData$isCardNoPrefixEnabled$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.RVConfigService$getMin$getMin  reason: collision with other inner class name */
        public static final class C0054getMin<T> implements updateProgress<T> {
            final /* synthetic */ getRequestMainPackage getMax;
            final /* synthetic */ String getMin;
            final /* synthetic */ boolean length = false;
            final /* synthetic */ Object setMax;

            public C0054getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj) {
                this.getMax = getrequestmainpackage;
                this.getMin = str;
                this.setMax = obj;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.getMin, this.getMax.setMin(), Boolean.class, this.setMax, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ C0054getMin length;

                    {
                        this.length = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.length.getMax.getMax(this.length.getMin, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.length.getMin));
                        } else if (!this.length.length || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.length.getMin));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }

    @Inject
    public RVConfigService(@NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.setMax = updateAppCallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getUserId> getMax(@NotNull SecurityUtils securityUtils) {
        Intrinsics.checkNotNullParameter(securityUtils, RequestPermissionsEvent.REQUEST);
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getMax() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMinimumFontSize.timeoutForFirstEmit(this.setMax.setMin.length(), 10000).flatMap(getMin.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "splitFacade.trafficTypeU…bservable()\n            }");
        return flatMap;
    }
}
