package id.dana.danah5.httprequest;

import com.alibaba.griver.api.appinfo.GriverAppTypeEnum;
import com.alibaba.griver.api.common.network.HttpRequest;
import com.alibaba.griver.api.common.network.HttpResponse;
import com.alibaba.griver.base.common.bridge.GriverHttpRequestAPIExtension;
import com.alibaba.griver.base.common.network.GriverTransport;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.toggle.exception.SplitException;
import id.dana.data.toggle.exception.SplitNull;
import id.dana.data.toggle.exception.UnexpectedTreatment;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.KeyboardBridgeExtension;
import o.RedDotDrawable;
import o.SecuritySignature;
import o.TitleBarRightButtonView;
import o.UpdateAppCallback;
import o.getMinimumFontSize;
import o.getRequestMainPackage;
import o.getSecondFloorView;
import o.isUesCacheLocation;
import o.onScroll;
import o.sendStartMsg;
import o.setFantasyFontFamily;
import o.setTitleLoading;
import o.updateProgress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/danah5/httprequest/HttpRequestExtension;", "Lcom/alibaba/griver/base/common/bridge/GriverHttpRequestAPIExtension;", "rpcProxy", "Lid/dana/data/network/RpcProxy;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/data/network/RpcProxy;Lid/dana/data/toggle/SplitFacade;)V", "getWhitelistedAppIds", "", "", "performRequest", "Lcom/alibaba/griver/api/common/network/HttpResponse;", "request", "Lcom/alibaba/griver/api/common/network/HttpRequest;", "requestContext", "Lcom/alibaba/griver/base/common/bridge/GriverHttpRequestAPIExtension$RequestContext;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HttpRequestExtension implements GriverHttpRequestAPIExtension {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    private static final String USER_AGENT = "User-Agent";
    private final onScroll rpcProxy;
    private final UpdateAppCallback splitFacade;

    @Inject
    public HttpRequestExtension(@NotNull onScroll onscroll, @NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(onscroll, "rpcProxy");
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.rpcProxy = onscroll;
        this.splitFacade = updateAppCallback;
    }

    @NotNull
    public final HttpResponse performRequest(@NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, RequestPermissionsEvent.REQUEST);
        Map<String, String> headers = httpRequest.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "request.headers");
        headers.put("User-Agent", sendStartMsg.setMax());
        return this.rpcProxy.performRequest(httpRequest);
    }

    @NotNull
    public final HttpResponse performRequest(@NotNull GriverHttpRequestAPIExtension.RequestContext requestContext, @NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        Intrinsics.checkNotNullParameter(httpRequest, RequestPermissionsEvent.REQUEST);
        Map<String, String> headers = httpRequest.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "request.headers");
        headers.put("User-Agent", sendStartMsg.setMax());
        if (requestContext.appType != GriverAppTypeEnum.MINI_PROGRAM || getWhitelistedAppIds().contains(requestContext.appId)) {
            return this.rpcProxy.performRequest(httpRequest);
        }
        HttpResponse request = GriverTransport.request(httpRequest);
        Intrinsics.checkNotNullExpressionValue(request, "GriverTransport.request(request)");
        return request;
    }

    private final List<String> getWhitelistedAppIds() {
        R blockingFirst = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).flatMap(setMin.INSTANCE).onErrorResumeNext(TitleBarRightButtonView.AnonymousClass1.fromCallable(setMax.INSTANCE)).map(getMin.INSTANCE).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "splitFacade.trafficTypeU…        }.blockingFirst()");
        return (List) blockingFirst;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMax<V> implements Callable<String> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
        }

        @Nullable
        public final String call() {
            JSONArray jSONArray;
            JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig(DanaLogConstants.TAG.MINI_PROGRAM);
            if (sectionConfig == null || (jSONArray = sectionConfig.getJSONArray("internal_miniprogram")) == null) {
                return null;
            }
            return jSONArray.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<String, List<? extends String>> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
        }

        public final List<String> apply(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return setFantasyFontFamily.toStringList(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/danah5/httprequest/HttpRequestExtension$Companion;", "", "()V", "USER_AGENT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends String>> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
        }

        public final TitleBarRightButtonView.AnonymousClass4<? extends String> apply(@NotNull getRequestMainPackage getrequestmainpackage) {
            TitleBarRightButtonView.AnonymousClass1 r5;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "internal_miniprogram", (Object) null, true));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
            if (min instanceof getSecondFloorView) {
                r5 = ((getSecondFloorView) min).setMax();
            } else {
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }
            return r5;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/toggle/traffictype/BaseTrafficType$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$2"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements updateProgress<T> {
            final /* synthetic */ Object $defaultValue;
            final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
            final /* synthetic */ String $splitName;
            final /* synthetic */ getRequestMainPackage this$0;

            public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
                this.this$0 = getrequestmainpackage;
                this.$splitName = str;
                this.$defaultValue = obj;
                this.$isNeedToThrowWhenGotControl = z;
            }

            public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
                Intrinsics.checkNotNullParameter(r8, "emitter");
                isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), String.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onComplete(@NotNull String str, @Nullable T t) {
                        Intrinsics.checkNotNullParameter(str, "treatment");
                        this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                        if (t == null) {
                            r8.onError(new SplitNull(this.this$0.$splitName));
                        } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                            r8.onSuccess(t);
                        } else {
                            r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                        }
                    }

                    public final void onError() {
                        r8.onError(new SplitException("Error when get toggle config"));
                    }
                });
            }
        }
    }
}
