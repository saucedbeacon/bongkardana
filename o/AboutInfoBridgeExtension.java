package o;

import androidx.annotation.VisibleForTesting;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ConfirmPopup;
import o.GriverExecutors;
import o.NebulaAuthDialogProxy;
import o.newThread;
import o.rejectedExecution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u00020\u0001:\u00019BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u0018J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001bH\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u001bH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020\u0018J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\u001bH\u0007J\u0010\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020\u001bH\u0007J\u0010\u0010/\u001a\u00020&2\u0006\u0010-\u001a\u00020\u001bH\u0007J\b\u00100\u001a\u00020\u0018H\u0016J\u000e\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020&J\u0006\u00103\u001a\u00020\u0018J\u0010\u00104\u001a\u0002052\u0006\u00102\u001a\u00020&H\u0002J\u000e\u00106\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001bJ\u0016\u00107\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u001bJ\u000e\u00108\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lid/dana/kycrenewal/KycRenewalPresenter;", "Lid/dana/kycrenewal/KycRenewalContract$Presenter;", "view", "Lid/dana/kycrenewal/KycRenewalContract$View;", "getKycRenewal", "Lid/dana/domain/kycrenewal/interactor/GetKycRenewal;", "getKycRenewalCheckQuery", "Lid/dana/domain/kycrenewal/interactor/GetKycRenewalCheckQuery;", "saveKycRenewalCheckQuery", "Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckQuery;", "getKycRenewalCheckShow", "Lid/dana/domain/kycrenewal/interactor/GetKycRenewalCheckShow;", "saveKycRenewalCheckShow", "Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckShow;", "getKycRenewalCheckDismiss", "Lid/dana/domain/kycrenewal/interactor/GetKycRenewalCheckDismiss;", "saveKycRenewalCheckDismiss", "Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckDismiss;", "getKycRenewalButtonClicked", "Lid/dana/domain/kycrenewal/interactor/GetKycRenewalButtonClicked;", "saveKycRenewalButtonClick", "Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalButtonClick;", "(Lid/dana/kycrenewal/KycRenewalContract$View;Lid/dana/domain/kycrenewal/interactor/GetKycRenewal;Lid/dana/domain/kycrenewal/interactor/GetKycRenewalCheckQuery;Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckQuery;Lid/dana/domain/kycrenewal/interactor/GetKycRenewalCheckShow;Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckShow;Lid/dana/domain/kycrenewal/interactor/GetKycRenewalCheckDismiss;Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckDismiss;Lid/dana/domain/kycrenewal/interactor/GetKycRenewalButtonClicked;Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalButtonClick;)V", "checkKycRenewalRequired", "", "constructKycRenewalUrl", "currentDate", "", "getKYCRenewalButtonClick", "getKYCRenewalDismissCount", "getKYCRenewalDismissCountMax", "getQueryKYCRenewalDialog", "getSaveQueryKYCRenewalDialogParam", "Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckQuery$Param;", "timestamp", "getSaveShowKYCRenewalDialogParam", "Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckShow$Param;", "show", "", "getSetKYCRenewalDismissCountParam", "Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckDismiss$Param;", "count", "", "getShowKYCRenewalDialog", "isOneDayDifference", "lastSaved", "isSameDay", "isTwoWeeksDifference", "onDestroy", "saveKYCRenewalButtonClick", "click", "saveKYCRenewalDismiss", "saveKycRenewalButtonClickParam", "Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalButtonClick$Param;", "saveQueryKYCRenewalDialog", "saveShowKYCRenewalDialog", "setKYCRenewalDismissCount", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AboutInfoBridgeExtension implements NebulaAuthDialogProxy.getMin {
    @NotNull
    public static final setMin isInside = new setMin((byte) 0);
    final GriverExecutors.AnonymousClass4 IsOverlapping;
    public final rejectedExecution equals;
    public final newThread getMax;
    final GriverExecutors.AnonymousClass5 getMin;
    public final GriverExecutors.AnonymousClass3.AnonymousClass1 length;
    public final GriverExecutors.AnonymousClass3 setMax;
    public final GriverExecutors.AnonymousClass2 setMin;
    final GriverExecutors.AnonymousClass1 toFloatRange;
    /* access modifiers changed from: private */
    public final NebulaAuthDialogProxy.getMax toIntRange;
    private final getSingleOrderThreadExecutorByName toString;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class ICustomTabsCallback extends Lambda implements Function1<Throwable, Unit> {
        public static final ICustomTabsCallback INSTANCE = new ICustomTabsCallback();

        ICustomTabsCallback() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class equals extends Lambda implements Function1<Long, Unit> {
        final /* synthetic */ AboutInfoBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public equals(AboutInfoBridgeExtension aboutInfoBridgeExtension) {
            super(1);
            this.this$0 = aboutInfoBridgeExtension;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            if (j == -1 || j == 0 || AboutInfoBridgeExtension.setMin(j)) {
                this.this$0.length();
            } else {
                this.this$0.toIntRange.onError("");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class hashCode extends Lambda implements Function1<Boolean, Unit> {
        public static final hashCode INSTANCE = new hashCode();

        hashCode() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class invoke extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ AboutInfoBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public invoke(AboutInfoBridgeExtension aboutInfoBridgeExtension) {
            super(1);
            this.this$0 = aboutInfoBridgeExtension;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.this$0.IsOverlapping.execute(new GriverExecutors.AnonymousClass4.setMax(i + 1), b.INSTANCE, getCause.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ AboutInfoBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(AboutInfoBridgeExtension aboutInfoBridgeExtension) {
            super(1);
            this.this$0 = aboutInfoBridgeExtension;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.this$0.toIntRange.getMin(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class toDoubleRange extends Lambda implements Function1<Throwable, Unit> {
        public static final toDoubleRange INSTANCE = new toDoubleRange();

        toDoubleRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class toString extends Lambda implements Function1<Throwable, Unit> {
        public static final toString INSTANCE = new toString();

        toString() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class valueOf extends Lambda implements Function1<Throwable, Unit> {
        public static final valueOf INSTANCE = new valueOf();

        valueOf() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class values extends Lambda implements Function1<Throwable, Unit> {
        public static final values INSTANCE = new values();

        values() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class b extends Lambda implements Function1<Boolean, Unit> {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getCause extends Lambda implements Function1<Throwable, Unit> {
        public static final getCause INSTANCE = new getCause();

        getCause() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/kycrenewal/model/QueryKYCRenewalStatus;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<GriverExecutors.H5SingleThreadFactory, Unit> {
        final /* synthetic */ AboutInfoBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(AboutInfoBridgeExtension aboutInfoBridgeExtension) {
            super(1);
            this.this$0 = aboutInfoBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverExecutors.H5SingleThreadFactory) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverExecutors.H5SingleThreadFactory h5SingleThreadFactory) {
            Intrinsics.checkNotNullParameter(h5SingleThreadFactory, "it");
            NebulaAuthDialogProxy.getMax max = this.this$0.toIntRange;
            long unused = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(h5SingleThreadFactory, "$this$toQueryKYCRenewalStatusResponseModel");
            max.setMax(new Object(h5SingleThreadFactory.getRenewKYC(), h5SingleThreadFactory.getVerificationId()) {
                @NotNull
                private final String getMax;
                private final boolean length;

                public final boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AnonymousClass1)) {
                        return false;
                    }
                    AnonymousClass1 r3 = (AnonymousClass1) obj;
                    return this.length == r3.length && Intrinsics.areEqual((Object) this.getMax, (Object) r3.getMax);
                }

                public final int hashCode() {
                    boolean z = this.length;
                    if (z) {
                        z = true;
                    }
                    int i = (z ? 1 : 0) * true;
                    String str = this.getMax;
                    return i + (str != null ? str.hashCode() : 0);
                }

                @NotNull
                public final String toString() {
                    StringBuilder sb = new StringBuilder("QueryKYCRenewalStatusResponseModel(renewKYC=");
                    sb.append(this.length);
                    sb.append(", verificationId=");
                    sb.append(this.getMax);
                    sb.append(")");
                    return sb.toString();
                }

                {
                    Intrinsics.checkNotNullParameter(r3, "verificationId");
                    this.length = r2;
                    this.getMax = r3;
                }
            });
            this.this$0.getMin.execute(new GriverExecutors.AnonymousClass5.setMin(System.currentTimeMillis()), AboutInfoBridgeExtension$Mean$Arithmetic.INSTANCE, invokeSuspend.INSTANCE);
            if (h5SingleThreadFactory.getRenewKYC()) {
                this.this$0.equals.execute(new rejectedExecution.setMax(false), hashCode.INSTANCE, toString.INSTANCE);
                AboutInfoBridgeExtension aboutInfoBridgeExtension = this.this$0;
                aboutInfoBridgeExtension.setMin.execute(onReceivedIcon.INSTANCE, new isInside(aboutInfoBridgeExtension), IsOverlapping.INSTANCE);
                this.this$0.getMax.execute(new newThread.length(h5SingleThreadFactory.getRenewKYC(), System.currentTimeMillis()), AboutInfoBridgeExtension$Grayscale$Algorithm.INSTANCE, ICustomTabsCallback.INSTANCE);
                return;
            }
            this.this$0.IsOverlapping.execute(new GriverExecutors.AnonymousClass4.setMax(-1), b.INSTANCE, getCause.INSTANCE);
            this.this$0.toIntRange.onError("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend extends Lambda implements Function1<Throwable, Unit> {
        public static final invokeSuspend INSTANCE = new invokeSuspend();

        invokeSuspend() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ AboutInfoBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(AboutInfoBridgeExtension aboutInfoBridgeExtension) {
            super(1);
            this.this$0 = aboutInfoBridgeExtension;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (i <= 0) {
                this.this$0.toIntRange.setMax();
            } else {
                this.this$0.toIntRange.length();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ AboutInfoBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(AboutInfoBridgeExtension aboutInfoBridgeExtension) {
            super(1);
            this.this$0 = aboutInfoBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.toIntRange.onError("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ AboutInfoBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(AboutInfoBridgeExtension aboutInfoBridgeExtension) {
            super(1);
            this.this$0 = aboutInfoBridgeExtension;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!z) {
                AboutInfoBridgeExtension aboutInfoBridgeExtension = this.this$0;
                aboutInfoBridgeExtension.setMin.execute(onReceivedIcon.INSTANCE, new isInside(aboutInfoBridgeExtension), IsOverlapping.INSTANCE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.KYC_RENEWAL_TAG, th.getMessage(), th);
        }
    }

    @Inject
    public AboutInfoBridgeExtension(@NotNull NebulaAuthDialogProxy.getMax getmax, @NotNull getSingleOrderThreadExecutorByName getsingleorderthreadexecutorbyname, @NotNull GriverExecutors.AnonymousClass3.AnonymousClass1 r4, @NotNull GriverExecutors.AnonymousClass5 r5, @NotNull GriverExecutors.AnonymousClass3 r6, @NotNull newThread newthread, @NotNull GriverExecutors.AnonymousClass2 r8, @NotNull GriverExecutors.AnonymousClass4 r9, @NotNull GriverExecutors.AnonymousClass1 r10, @NotNull rejectedExecution rejectedexecution) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(getsingleorderthreadexecutorbyname, "getKycRenewal");
        Intrinsics.checkNotNullParameter(r4, "getKycRenewalCheckQuery");
        Intrinsics.checkNotNullParameter(r5, "saveKycRenewalCheckQuery");
        Intrinsics.checkNotNullParameter(r6, "getKycRenewalCheckShow");
        Intrinsics.checkNotNullParameter(newthread, "saveKycRenewalCheckShow");
        Intrinsics.checkNotNullParameter(r8, "getKycRenewalCheckDismiss");
        Intrinsics.checkNotNullParameter(r9, "saveKycRenewalCheckDismiss");
        Intrinsics.checkNotNullParameter(r10, "getKycRenewalButtonClicked");
        Intrinsics.checkNotNullParameter(rejectedexecution, "saveKycRenewalButtonClick");
        this.toIntRange = getmax;
        this.toString = getsingleorderthreadexecutorbyname;
        this.length = r4;
        this.getMin = r5;
        this.setMax = r6;
        this.getMax = newthread;
        this.setMin = r8;
        this.IsOverlapping = r9;
        this.toFloatRange = r10;
        this.equals = rejectedexecution;
    }

    public final void length() {
        this.toString.execute(onReceivedIcon.INSTANCE, new getMax(this), new length(this));
    }

    public static newThread.length length(long j) {
        return new newThread.length(true, j);
    }

    public static rejectedExecution.setMax getMax() {
        return new rejectedExecution.setMax(true);
    }

    @VisibleForTesting
    public static boolean setMax(long j) {
        return ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(j)) == 0;
    }

    @VisibleForTesting
    public static boolean getMax(long j) {
        return ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(j)) == 1;
    }

    @VisibleForTesting
    public static boolean setMin(long j) {
        return ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(j)) >= 14;
    }

    public final void setMax() {
        this.toString.dispose();
        this.length.dispose();
        this.getMin.dispose();
        this.setMax.dispose();
        this.getMax.dispose();
        this.setMin.dispose();
        this.IsOverlapping.dispose();
        this.toFloatRange.dispose();
        this.equals.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/kycrenewal/KycRenewalPresenter$Companion;", "", "()V", "DEFAULT_GET_LONG", "", "MAX_DISMISS", "", "NEXT_DAY", "NULL_GET_LONG", "SAME_DAY", "TWO_WEEKS", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
