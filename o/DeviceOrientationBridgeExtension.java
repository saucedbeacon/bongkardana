package o;

import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.getScreenBrightness;
import o.onReadData;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u0006\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/oauth/presenter/InputNamePresenter;", "Lid/dana/oauth/InputNameContract$Presenter;", "view", "Lid/dana/oauth/InputNameContract$View;", "updateNicknameProfile", "Lid/dana/domain/userprofileinfo/interactor/UpdateNicknameProfile;", "getUserInfo", "Lid/dana/domain/user/interactor/GetUserInfoWithKyc;", "checkSkipButtonMerchantList", "Lid/dana/domain/userprofileinfo/interactor/CheckSkipButtonMerchantList;", "(Lid/dana/oauth/InputNameContract$View;Lid/dana/domain/userprofileinfo/interactor/UpdateNicknameProfile;Lid/dana/domain/user/interactor/GetUserInfoWithKyc;Lid/dana/domain/userprofileinfo/interactor/CheckSkipButtonMerchantList;)V", "tag", "", "checkSkipButtonFeature", "", "onDestroy", "onUpdateNameFailed", "errorMessage", "onUpdateNameSuccess", "isSuccess", "", "updateName", "nickname", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DeviceOrientationBridgeExtension implements getScreenBrightness.setMax {
    /* access modifiers changed from: private */
    public final getScreenBrightness.getMax getMax;
    private final onSendData getMin;
    /* access modifiers changed from: private */
    public final String length = Reflection.getOrCreateKotlinClass(DeviceOrientationBridgeExtension.class).getSimpleName();
    private final onReadData setMax;
    /* access modifiers changed from: package-private */
    public final notifyCharacteristicValue setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ DeviceOrientationBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(DeviceOrientationBridgeExtension deviceOrientationBridgeExtension) {
            super(1);
            this.this$0 = deviceOrientationBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            DeviceOrientationBridgeExtension.length(this.this$0, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Set<? extends String>, Unit> {
        final /* synthetic */ DeviceOrientationBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(DeviceOrientationBridgeExtension deviceOrientationBridgeExtension) {
            super(1);
            this.this$0 = deviceOrientationBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Set<String>) (Set) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "it");
            this.this$0.getMax.onCheckSkipButtonMerchantList(set);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ DeviceOrientationBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(DeviceOrientationBridgeExtension deviceOrientationBridgeExtension) {
            super(1);
            this.this$0 = deviceOrientationBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(this.this$0.length, th.getMessage());
            this.this$0.getMax.onError(th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/userprofileinfo/response/UserProfileInfoResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<onWriteValue, Unit> {
        final /* synthetic */ DeviceOrientationBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(DeviceOrientationBridgeExtension deviceOrientationBridgeExtension) {
            super(1);
            this.this$0 = deviceOrientationBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((onWriteValue) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull onWriteValue onwritevalue) {
            Intrinsics.checkNotNullParameter(onwritevalue, "it");
            DeviceOrientationBridgeExtension deviceOrientationBridgeExtension = this.this$0;
            deviceOrientationBridgeExtension.setMin.execute(new getMin(deviceOrientationBridgeExtension));
        }
    }

    @Inject
    public DeviceOrientationBridgeExtension(@NotNull getScreenBrightness.getMax getmax, @NotNull onReadData onreaddata, @NotNull notifyCharacteristicValue notifycharacteristicvalue, @NotNull onSendData onsenddata) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(onreaddata, "updateNicknameProfile");
        Intrinsics.checkNotNullParameter(notifycharacteristicvalue, "getUserInfo");
        Intrinsics.checkNotNullParameter(onsenddata, "checkSkipButtonMerchantList");
        this.getMax = getmax;
        this.setMax = onreaddata;
        this.setMin = notifycharacteristicvalue;
        this.getMin = onsenddata;
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "nickname");
        this.getMax.showProgress();
        this.setMax.execute(new onReadData.setMin(str), new setMin(this), new getMax(this));
    }

    public final void getMax() {
        this.getMin.execute(onReceivedIcon.INSTANCE, new length(this), new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/oauth/presenter/InputNamePresenter$getUserInfo$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "onError", "", "exception", "", "onNext", "userInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<disconnect> {
        final /* synthetic */ DeviceOrientationBridgeExtension getMax;

        getMin(DeviceOrientationBridgeExtension deviceOrientationBridgeExtension) {
            this.getMax = deviceOrientationBridgeExtension;
        }

        public final /* synthetic */ void onNext(Object obj) {
            Intrinsics.checkNotNullParameter((disconnect) obj, "userInfoResponse");
            DeviceOrientationBridgeExtension.getMin(this.getMax, true);
            this.getMax.setMin.dispose();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "exception");
            DeviceOrientationBridgeExtension.getMin(this.getMax, false);
        }
    }

    public final void setMax() {
        this.setMax.dispose();
        this.setMin.dispose();
        this.getMin.dispose();
    }

    public static final /* synthetic */ void length(DeviceOrientationBridgeExtension deviceOrientationBridgeExtension, String str) {
        deviceOrientationBridgeExtension.getMax.dismissProgress();
        deviceOrientationBridgeExtension.getMax.onUpdateNameFailed(str);
    }

    public static final /* synthetic */ void getMin(DeviceOrientationBridgeExtension deviceOrientationBridgeExtension, boolean z) {
        deviceOrientationBridgeExtension.getMax.dismissProgress();
        deviceOrientationBridgeExtension.getMax.onUpdateNameSuccess(z);
    }
}
