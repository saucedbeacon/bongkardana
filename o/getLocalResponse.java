package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverPrepareInterceptor;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/domain/qrbarcode/interactor/GetUserDynamicQr;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/qrbarcode/QrUserResult;", "Ljava/lang/Void;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "qrBarcodeRepository", "Lid/dana/domain/qrbarcode/QrBarcodeRepository;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/qrbarcode/QrBarcodeRepository;Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "getSequenceQr", "qrUserResult", "removeQrisFirsIndex", "", "qrisList", "", "", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getLocalResponse extends parseFailed<GriverPrepareInterceptor.AnonymousClass1, Void> {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final long REFRESH_QR_IN_SECOND = 60;
    private final setDefaultFontSize featureConfigRepository;
    /* access modifiers changed from: private */
    public final GriverPrepareInterceptor qrBarcodeRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/Observable;", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<TitleBarRightButtonView.AnonymousClass1<Object>, TitleBarRightButtonView.AnonymousClass4<?>> {
        public static final getMax setMin = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r4 = (TitleBarRightButtonView.AnonymousClass1) obj;
            Intrinsics.checkNotNullParameter(r4, "it");
            return r4.delay(60, TimeUnit.SECONDS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/domain/qrbarcode/QrUserResult;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<GriverPrepareInterceptor.AnonymousClass1, GriverPrepareInterceptor.AnonymousClass1> {
        final /* synthetic */ getLocalResponse length;

        getMin(getLocalResponse getlocalresponse) {
            this.length = getlocalresponse;
        }

        public final /* synthetic */ Object apply(Object obj) {
            GriverPrepareInterceptor.AnonymousClass1 r4 = (GriverPrepareInterceptor.AnonymousClass1) obj;
            Intrinsics.checkNotNullParameter(r4, "it");
            if (r4.getQrCodeList().isEmpty()) {
                return r4;
            }
            List<String> qrCodeList = r4.getQrCodeList();
            Intrinsics.checkNotNullExpressionValue(qrCodeList, "it.qrCodeList");
            r4.setQrCode((String) CollectionsKt.firstOrNull(qrCodeList));
            getLocalResponse getlocalresponse = this.length;
            List<String> qrCodeList2 = r4.getQrCodeList();
            Intrinsics.checkNotNullExpressionValue(qrCodeList2, "it.qrCodeList");
            getlocalresponse.removeQrisFirsIndex(qrCodeList2);
            return r4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/qrbarcode/QrUserResult;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends GriverPrepareInterceptor.AnonymousClass1>> {
        final /* synthetic */ getLocalResponse setMax;

        length(getLocalResponse getlocalresponse) {
            this.setMax = getlocalresponse;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            Intrinsics.checkNotNullParameter(num, "it");
            return this.setMax.qrBarcodeRepository.getUserQr(true, "", num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/qrbarcode/QrUserResult;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<GriverPrepareInterceptor.AnonymousClass1, TitleBarRightButtonView.AnonymousClass4<? extends GriverPrepareInterceptor.AnonymousClass1>> {
        final /* synthetic */ getLocalResponse length;

        setMin(getLocalResponse getlocalresponse) {
            this.length = getlocalresponse;
        }

        public final /* synthetic */ Object apply(Object obj) {
            GriverPrepareInterceptor.AnonymousClass1 r2 = (GriverPrepareInterceptor.AnonymousClass1) obj;
            Intrinsics.checkNotNullParameter(r2, "it");
            return this.length.getSequenceQr(r2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getLocalResponse(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull GriverPrepareInterceptor griverPrepareInterceptor, @NotNull setDefaultFontSize setdefaultfontsize) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(griverPrepareInterceptor, "qrBarcodeRepository");
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        this.qrBarcodeRepository = griverPrepareInterceptor;
        this.featureConfigRepository = setdefaultfontsize;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverPrepareInterceptor.AnonymousClass1> buildUseCaseObservable(@Nullable Void voidR) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.featureConfigRepository.getQrCount().flatMap(new length(this)).flatMap(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "featureConfigRepository.…Map { getSequenceQr(it) }");
        return flatMap;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<GriverPrepareInterceptor.AnonymousClass1> getSequenceQr(GriverPrepareInterceptor.AnonymousClass1 r2) {
        TitleBarRightButtonView.AnonymousClass1<GriverPrepareInterceptor.AnonymousClass1> repeatWhen = TitleBarRightButtonView.AnonymousClass1.just(r2).map(new getMin(this)).repeatWhen(getMax.setMin);
        Intrinsics.checkNotNullExpressionValue(repeatWhen, "Observable.just(qrUserRe…it.SECONDS)\n            }");
        return repeatWhen;
    }

    /* access modifiers changed from: private */
    public final void removeQrisFirsIndex(List<String> list) {
        if (list != null) {
            ((ArrayList) list).remove(0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/domain/qrbarcode/interactor/GetUserDynamicQr$Companion;", "", "()V", "REFRESH_QR_IN_SECOND", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
