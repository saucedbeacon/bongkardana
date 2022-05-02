package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.MediaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0016J.\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016J\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u0018\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/richview/profile/switchautoroute/SwitchAutoRoutePresenter;", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteContract$Presenter;", "view", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteContract$View;", "switchAutoRouting", "Lid/dana/domain/autoroute/interactor/SwitchAutoRouting;", "isHavingAutoRouteAsset", "Lid/dana/domain/autoroute/interactor/IsHavingAutoRouteAsset;", "(Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteContract$View;Lid/dana/domain/autoroute/interactor/SwitchAutoRouting;Lid/dana/domain/autoroute/interactor/IsHavingAutoRouteAsset;)V", "isHavingAutorouteAsset", "", "logError", "e", "", "onDestroy", "switchAutoRouteState", "autoroute", "", "authenticationType", "", "securityId", "validateData", "processResult", "Lid/dana/domain/autoroute/model/UserAutoRouteConfigSwitch;", "processRiskResult", "RiskResultValue", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class CaptureParam implements MediaInfo.setMax {
    public final enableCloseButton length;
    /* access modifiers changed from: private */
    public final MediaInfo.getMin setMax;
    private final getIconDrawable setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "switchResult", "Lid/dana/domain/autoroute/model/UserAutoRouteConfigSwitch;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<GriverGeoLocationExtension, Unit> {
        final /* synthetic */ boolean $autoroute;
        final /* synthetic */ CaptureParam this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(CaptureParam captureParam, boolean z) {
            super(1);
            this.this$0 = captureParam;
            this.$autoroute = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverGeoLocationExtension) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverGeoLocationExtension griverGeoLocationExtension) {
            Intrinsics.checkNotNullParameter(griverGeoLocationExtension, "switchResult");
            this.this$0.setMax.dismissProgress();
            CaptureParam.setMin(this.this$0, griverGeoLocationExtension, this.$autoroute);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ CaptureParam this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(CaptureParam captureParam) {
            super(1);
            this.this$0 = captureParam;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Throwable th) {
            this.this$0.setMax.dismissProgress();
            this.this$0.setMax.onError(th != null ? th.getMessage() : null);
            CaptureParam.getMax(this.this$0, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ CaptureParam this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(CaptureParam captureParam) {
            super(1);
            this.this$0 = captureParam;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMax.onCheckHavingAutorouteAsset(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ CaptureParam this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(CaptureParam captureParam) {
            super(1);
            this.this$0 = captureParam;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Throwable th) {
            this.this$0.setMax.onCheckHavingAutorouteAsset(false);
            this.this$0.setMax.onError(th != null ? th.getMessage() : null);
            CaptureParam.getMax(this.this$0, th);
        }
    }

    @Inject
    public CaptureParam(@NotNull MediaInfo.getMin getmin, @NotNull getIconDrawable geticondrawable, @NotNull enableCloseButton enableclosebutton) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(geticondrawable, "switchAutoRouting");
        Intrinsics.checkNotNullParameter(enableclosebutton, "isHavingAutoRouteAsset");
        this.setMax = getmin;
        this.setMin = geticondrawable;
        this.length = enableclosebutton;
    }

    public final void length(boolean z, @Nullable String str) {
        this.setMax.showProgress();
        GriverTitleBarCreatedEvent griverTitleBarCreatedEvent = new GriverTitleBarCreatedEvent((Boolean) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        griverTitleBarCreatedEvent.setAutoroute(Boolean.valueOf(z));
        griverTitleBarCreatedEvent.setAuthenticationType(str);
        griverTitleBarCreatedEvent.setSecurityId((String) null);
        griverTitleBarCreatedEvent.setValidateData((String) null);
        this.setMin.execute(griverTitleBarCreatedEvent, new getMax(this, z), new getMin(this));
    }

    public final void setMax() {
        this.setMin.dispose();
        this.length.dispose();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r0.equals(id.dana.richview.profile.RiskResultType.ACCEPT) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void setMin(o.CaptureParam r3, o.GriverGeoLocationExtension r4, boolean r5) {
        /*
            o.GriverBackHomeButtonStyleExtension r0 = r4.getRiskResult()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.getResult()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x000f
            goto L_0x0026
        L_0x000f:
            int r1 = r0.hashCode()
            r2 = 832880155(0x31a4be1b, float:4.7946407E-9)
            if (r1 == r2) goto L_0x002c
            r4 = 1924835592(0x72baa908, float:7.3943754E30)
            if (r1 == r4) goto L_0x001e
            goto L_0x0057
        L_0x001e:
            java.lang.String r4 = "ACCEPT"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0057
        L_0x0026:
            o.MediaInfo$getMin r3 = r3.setMax
            r3.onSwitchResultAccept(r5)
            return
        L_0x002c:
            java.lang.String r1 = "VERIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0057
            o.GriverBackHomeButtonStyleExtension r0 = r4.getRiskResult()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r0.getSecurityId()
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            o.onGeolocationPermissionsShowPrompt r4 = r4.getSecurityContextResult()
            if (r4 == 0) goto L_0x0051
            java.lang.String r4 = r4.getPubKey()
            if (r4 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r1 = r4
        L_0x0051:
            o.MediaInfo$getMin r3 = r3.setMax
            r3.onSwitchResultRisk(r5, r0, r1)
            return
        L_0x0057:
            o.MediaInfo$getMin r3 = r3.setMax
            r3.onSwitchResultReject(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CaptureParam.setMin(o.CaptureParam, o.GriverGeoLocationExtension, boolean):void");
    }

    public static final /* synthetic */ void getMax(CaptureParam captureParam, Throwable th) {
        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.AUTO_ROUTE_SWITCH);
        sb.append(captureParam.getClass().getName());
        sb.append(":onError ");
        updateActionSheetContent.e(DanaLogConstants.TAG.AUTO_ROUTE_SWITCH, sb.toString(), th);
    }
}
