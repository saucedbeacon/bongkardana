package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverPageContainer;
import o.setBeacons;
import o.setUpdateNotifier;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/twilio/identityverification/TwilioIdentityVerificationPresenter;", "Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract$View;", "getTwilioChallengeDetails", "Lid/dana/domain/twilio/interactor/GetTwilioChallengeDetails;", "updateTwilioChallenge", "Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge;", "(Landroid/content/Context;Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract$View;Lid/dana/domain/twilio/interactor/GetTwilioChallengeDetails;Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge;)V", "createGetChallengeDetailsParam", "Lid/dana/domain/twilio/interactor/GetTwilioChallengeDetails$Param;", "challengeSid", "", "factorSid", "createUpdateChallengeParam", "Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge$Param;", "newStatus", "getChallengeDetails", "", "getCurrentTimeMillis", "", "getExpiredTimeMillis", "loginTime", "Ljava/util/Date;", "timeout", "isChallengeExpired", "", "", "updateChallenge", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TinyAppBackHomeExtension implements GriverPageContainer.H5CloseHandler.getMin {
    /* access modifiers changed from: private */
    public final Context getMax;
    public final setUpdateNotifier getMin;
    public final GriverPageContainer.H5CloseHandler.setMin setMax;
    public final setBeacons setMin;

    @JvmDefault
    public final void setMax() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ TinyAppBackHomeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(TinyAppBackHomeExtension tinyAppBackHomeExtension) {
            super(1);
            this.this$0 = tinyAppBackHomeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.onError(this.this$0.getMax.getString(R.string.general_error_msg));
            this.this$0.setMax.dismissProgress();
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_UPDATE_CHALLENGE, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TinyAppBackHomeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(TinyAppBackHomeExtension tinyAppBackHomeExtension) {
            super(1);
            this.this$0 = tinyAppBackHomeExtension;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMax.getMax(z);
            this.this$0.setMax.dismissProgress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ TinyAppBackHomeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(TinyAppBackHomeExtension tinyAppBackHomeExtension) {
            super(1);
            this.this$0 = tinyAppBackHomeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.onError(this.this$0.getMax.getString(R.string.general_error_msg));
            this.this$0.setMax.dismissProgress();
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_GET_CHALLENGE, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMin extends Lambda implements Function1<Map<String, ? extends String>, Unit> {
        final /* synthetic */ TinyAppBackHomeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(TinyAppBackHomeExtension tinyAppBackHomeExtension) {
            super(1);
            this.this$0 = tinyAppBackHomeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, String>) (Map) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "it");
            this.this$0.setMax.length(map);
            this.this$0.setMax.dismissProgress();
        }
    }

    @Inject
    public TinyAppBackHomeExtension(@NotNull Context context, @NotNull GriverPageContainer.H5CloseHandler.setMin setmin, @NotNull setBeacons setbeacons, @NotNull setUpdateNotifier setupdatenotifier) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(setbeacons, "getTwilioChallengeDetails");
        Intrinsics.checkNotNullParameter(setupdatenotifier, "updateTwilioChallenge");
        this.getMax = context;
        this.setMax = setmin;
        this.setMin = setbeacons;
        this.getMin = setupdatenotifier;
    }

    public static setBeacons.getMin setMin(String str, String str2) {
        return new setBeacons.getMin(str, str2);
    }

    public static setUpdateNotifier.getMin setMin(String str, String str2, String str3) {
        return new setUpdateNotifier.getMin(str, str2, str3);
    }

    public static boolean getMax(@NotNull Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "loginTime");
        return (date.getTime() + TimeUnit.MILLISECONDS.convert((long) i, TimeUnit.SECONDS)) - System.currentTimeMillis() <= 0;
    }
}
