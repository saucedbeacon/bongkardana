package o;

import com.iap.ac.android.common.rpc.model.HttpResponse;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.GriverDecodeUrl;
import o.execJavaScript;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/globalnetworkproxy/GlobalNetworkProxyPresenter;", "Lid/dana/globalnetworkproxy/GlobalNetworkProxyContract$Presenter;", "view", "Lid/dana/globalnetworkproxy/GlobalNetworkProxyContract$View;", "gnConsult", "Lid/dana/domain/globalnetwork/interactor/GnConsult;", "getGlobalNetworkProxyConfig", "Lid/dana/domain/featureconfig/interactor/GetGlobalNetworkProxyConfig;", "(Lid/dana/globalnetworkproxy/GlobalNetworkProxyContract$View;Lid/dana/domain/globalnetwork/interactor/GnConsult;Lid/dana/domain/featureconfig/interactor/GetGlobalNetworkProxyConfig;)V", "tag", "", "doGnConsult", "Lcom/iap/ac/android/common/rpc/model/HttpResponse;", "sdkRequestHeader", "", "sdkRequestData", "getGnProxyConfig", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setPageConfiguration implements GriverDecodeUrl.length {
    private final execJavaScript getMax;
    private final setVerticalScrollbarOverlay length;
    /* access modifiers changed from: private */
    public final String setMax = Reflection.getOrCreateKotlinClass(setPageConfiguration.class).getSimpleName();
    /* access modifiers changed from: private */
    public final GriverDecodeUrl.getMin setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setPageConfiguration this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(setPageConfiguration setpageconfiguration) {
            super(1);
            this.this$0 = setpageconfiguration;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.getMin();
            updateActionSheetContent.e(this.this$0.setMax, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "configEnable", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ setPageConfiguration this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(setPageConfiguration setpageconfiguration) {
            super(1);
            this.this$0 = setpageconfiguration;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.getMin();
        }
    }

    @Inject
    public setPageConfiguration(@NotNull GriverDecodeUrl.getMin getmin, @NotNull execJavaScript execjavascript, @NotNull setVerticalScrollbarOverlay setverticalscrollbaroverlay) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(execjavascript, "gnConsult");
        Intrinsics.checkNotNullParameter(setverticalscrollbaroverlay, "getGlobalNetworkProxyConfig");
        this.setMin = getmin;
        this.getMax = execjavascript;
        this.length = setverticalscrollbaroverlay;
    }

    public final void getMax() {
        this.length.execute(onReceivedIcon.INSTANCE, new getMin(this), new getMax(this));
    }

    @NotNull
    public final HttpResponse setMin(@NotNull Map<String, String> map, @NotNull String str) {
        Intrinsics.checkNotNullParameter(map, "sdkRequestHeader");
        Intrinsics.checkNotNullParameter(str, "sdkRequestData");
        return setEventManifests.setMin(this.getMax.buildUseCase(new execJavaScript.setMax(map, str)));
    }

    public final void setMax() {
        this.length.dispose();
    }
}
