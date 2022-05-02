package o;

import android.content.Context;
import android.content.res.Resources;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.tracker.TrackerDataKey;
import id.dana.domain.bank.model.UserBank;
import id.dana.sendmoney.model.BankModel;
import id.dana.sendmoney.model.CardHolderModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ForeignKey;
import o.PhotoResolver;
import o.PrepareContextUitls;
import o.convertDipToPx;
import o.getBeaconTypeCode;
import o.getBluetoothAddress;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 D2\u00020\u0001:\u0001DBg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0016\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020(2\u0006\u0010!\u001a\u00020\"H\u0002J\u0016\u0010\f\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0016\u0010\u0010\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020(H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000208H\u0016J\u0018\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002022\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010;\u001a\u00020\u001eH\u0016J\u001e\u0010<\u001a\u00020\u001e2\u0006\u00101\u001a\u0002022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\b\u0010=\u001a\u00020\u001eH\u0002J\u000e\u0010\u000e\u001a\u00020\u001e2\u0006\u00101\u001a\u000202J\u000e\u0010\u0012\u001a\u00020\u001e2\u0006\u00105\u001a\u00020(J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@H\u0002J\f\u0010A\u001a\u000208*\u00020@H\u0002J\f\u0010B\u001a\u00020C*\u00020 H\u0002R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006E"}, d2 = {"Lid/dana/bank/contract/BankSelectorPresenter;", "Lid/dana/bank/contract/BankSelectorContract$Presenter;", "view", "Lid/dana/bank/contract/BankSelectorContract$View;", "context", "Landroid/content/Context;", "sendMoneyBankMapper", "Lid/dana/sendmoney/mapper/SendMoneyBankMapper;", "nameCheck", "Lid/dana/domain/requestmoney/interactor/NameCheck;", "getBankSelectorConfig", "Lid/dana/domain/requestmoney/interactor/GetBankSelectorConfig;", "getNameCheckCount", "Lid/dana/domain/requestmoney/interactor/GetNameCheckCount;", "saveNameCheckCount", "Lid/dana/domain/requestmoney/interactor/SaveNameCheckCount;", "getNameCheckExpiredTime", "Lid/dana/domain/requestmoney/interactor/GetNameCheckExpiredTime;", "saveNameCheckExpiredTime", "Lid/dana/domain/requestmoney/interactor/SaveNameCheckExpiredTime;", "checkUserBankExist", "Lid/dana/domain/bank/interactor/CheckUserBankExist;", "getRecentRecipient", "Lid/dana/domain/recentrecipient/interactor/GetRecentRecipient;", "bankModelMapper", "Lid/dana/sendmoney/mapper/BankModelMapper;", "(Lid/dana/bank/contract/BankSelectorContract$View;Landroid/content/Context;Lid/dana/sendmoney/mapper/SendMoneyBankMapper;Lid/dana/domain/requestmoney/interactor/NameCheck;Lid/dana/domain/requestmoney/interactor/GetBankSelectorConfig;Lid/dana/domain/requestmoney/interactor/GetNameCheckCount;Lid/dana/domain/requestmoney/interactor/SaveNameCheckCount;Lid/dana/domain/requestmoney/interactor/GetNameCheckExpiredTime;Lid/dana/domain/requestmoney/interactor/SaveNameCheckExpiredTime;Lid/dana/domain/bank/interactor/CheckUserBankExist;Lid/dana/domain/recentrecipient/interactor/GetRecentRecipient;Lid/dana/sendmoney/mapper/BankModelMapper;)V", "getView", "()Lid/dana/bank/contract/BankSelectorContract$View;", "doNameCheck", "", "bankModel", "Lid/dana/sendmoney/model/BankModel;", "nameCheckConfigModel", "Lid/dana/requestmoney/model/BankSelectorConfigModel;", "doSavedBankCheck", "withdrawNameCheckModel", "Lid/dana/sendmoney/model/WithdrawNameCheckModel;", "executeNameCheck", "getCurrentTimeStamp", "", "getDefaultBankFromRecent", "nameCheckConfig", "Lid/dana/domain/requestmoney/model/BankSelectorConfig;", "getExpiredTimeStamp", "getRemainingMinutes", "expiredTime", "getSaveNameCheckCountParam", "Lid/dana/domain/requestmoney/interactor/SaveNameCheckCount$Param;", "count", "", "getSaveNameCheckExpiredTimeParam", "Lid/dana/domain/requestmoney/interactor/SaveNameCheckExpiredTime$Param;", "timestamp", "init", "defaultBankFromRecent", "", "isNameCheckCountExceedLimit", "currentNameCheckCount", "onDestroy", "onNameCheckCountExceedLimit", "resetNameCheckCount", "trackNetworkError", "throwable", "", "isNonKycError", "toNameCheckParam", "Lid/dana/domain/sendmoney/model/NameCheckParam;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ExperimentalRoomApi implements ForeignKey.getMin {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);
    private final PrepareContextUitls FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public final Context IsOverlapping;
    private final getBeaconTypeCode equals;
    final H5ErrorCode getMax;
    private final getBluetoothAddress hashCode;
    private final getServiceUuid isInside;
    final getDataFields length;
    @NotNull
    final ForeignKey.getMax setMax;
    final setExtraDataFields setMin;
    /* access modifiers changed from: private */
    public final SaveImageToAlbumBridgeExtension toDoubleRange;
    private final getManufacturer toFloatRange;
    /* access modifiers changed from: private */
    public final PhotoResolver.AnonymousClass1 toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(ExperimentalRoomApi experimentalRoomApi) {
            super(1);
            this.this$0 = experimentalRoomApi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.onError(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(ExperimentalRoomApi experimentalRoomApi) {
            super(1);
            this.this$0 = experimentalRoomApi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.onError(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(ExperimentalRoomApi experimentalRoomApi) {
            super(1);
            this.this$0 = experimentalRoomApi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            String str = "";
            if (ExperimentalRoomApi.getMax(th)) {
                this.this$0.setMax.setMax(str);
            } else {
                ForeignKey.getMax getmax = this.this$0.setMax;
                access$1102 access_1102 = access$1102.setMin;
                Context max = this.this$0.IsOverlapping;
                Intrinsics.checkNotNullParameter(max, HummerConstants.CONTEXT);
                Intrinsics.checkNotNullParameter(th, "throwable");
                if (th instanceof NetworkException) {
                    String errorCode = ((NetworkException) th).getErrorCode();
                    Intrinsics.checkNotNullExpressionValue(errorCode, "throwable.errorCode");
                    Context applicationContext = max != null ? max.getApplicationContext() : null;
                    if (applicationContext != null) {
                        int length = errorCode != null ? errorCode.length() : 0;
                        int min = dispatchOnCancelled.setMin(applicationContext, length);
                        if (length != min) {
                            onCanceled oncanceled = new onCanceled(length, min, 8);
                            onCancelLoad.setMax(-1770718970, oncanceled);
                            onCancelLoad.getMin(-1770718970, oncanceled);
                        }
                    }
                    Resources resources = max.getResources();
                    StringBuilder sb = new StringBuilder();
                    sb.append("request_money_");
                    sb.append(errorCode);
                    int identifier = resources.getIdentifier(sb.toString(), "string", max.getPackageName());
                    if (identifier > 0) {
                        str = max.getString(identifier);
                        Intrinsics.checkNotNullExpressionValue(str, "context.getString(it)");
                    } else {
                        String message = th.getMessage();
                        if (message != null) {
                            str = message;
                        }
                    }
                }
                getmax.onError(str);
            }
            ExperimentalRoomApi.length(this.this$0, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(ExperimentalRoomApi experimentalRoomApi) {
            super(1);
            this.this$0 = experimentalRoomApi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.onError(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/requestmoney/model/BankSelectorConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class hashCode extends Lambda implements Function1<getParserIdentifier, Unit> {
        final /* synthetic */ boolean $defaultBankFromRecent;
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        hashCode(ExperimentalRoomApi experimentalRoomApi, boolean z) {
            super(1);
            this.this$0 = experimentalRoomApi;
            this.$defaultBankFromRecent = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getParserIdentifier) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getParserIdentifier getparseridentifier) {
            Intrinsics.checkNotNullParameter(getparseridentifier, "it");
            if (this.$defaultBankFromRecent) {
                this.this$0.FastBitmap$CoordinateSystem.execute(new toFloatRange(this.this$0, getparseridentifier), PrepareContextUitls.setMax.forGetRecentRecipient(1, 1, 0));
                return;
            }
            this.this$0.setMax.dismissProgress();
            this.this$0.setMax.length(resetState.setMin(getparseridentifier, this.this$0.toDoubleRange, (getMonitorToken) null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invokeSuspend(ExperimentalRoomApi experimentalRoomApi) {
            super(1);
            this.this$0 = experimentalRoomApi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.onError(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Long, Unit> {
        final /* synthetic */ BankModel $bankModel;
        final /* synthetic */ x $nameCheckConfigModel;
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(ExperimentalRoomApi experimentalRoomApi, BankModel bankModel, x xVar) {
            super(1);
            this.this$0 = experimentalRoomApi;
            this.$bankModel = bankModel;
            this.$nameCheckConfigModel = xVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            if (TimeUnit.MINUTES.convert(j - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), TimeUnit.SECONDS) > 0) {
                this.this$0.setMax.setMax();
                return;
            }
            ExperimentalRoomApi.getMax(this.this$0);
            this.this$0.getMin(this.$bankModel, this.$nameCheckConfigModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "withdrawNameCheck", "Lid/dana/domain/sendmoney/model/WithdrawNameCheck;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<parseHex, Unit> {
        final /* synthetic */ BankModel $bankModel;
        final /* synthetic */ x $nameCheckConfigModel;
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(ExperimentalRoomApi experimentalRoomApi, x xVar, BankModel bankModel) {
            super(1);
            this.this$0 = experimentalRoomApi;
            this.$nameCheckConfigModel = xVar;
            this.$bankModel = bankModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((parseHex) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull parseHex parsehex) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Intrinsics.checkNotNullParameter(parsehex, "withdrawNameCheck");
            PhotoResolver.AnonymousClass1 unused = this.this$0.toIntRange;
            getProxy min = PhotoResolver.AnonymousClass1.setMin(parsehex);
            if (this.$nameCheckConfigModel.setMax()) {
                ExperimentalRoomApi experimentalRoomApi = this.this$0;
                BankModel bankModel = this.$bankModel;
                Intrinsics.checkNotNullExpressionValue(min, "this");
                Intrinsics.checkNotNullParameter(bankModel, "bankModel");
                Intrinsics.checkNotNullParameter(min, "withdrawNameCheckModel");
                H5ErrorCode h5ErrorCode = experimentalRoomApi.getMax;
                Intrinsics.checkNotNullParameter(bankModel, "$this$toUserBank");
                Intrinsics.checkNotNullParameter(min, "nameCheckConfig");
                String str7 = min.getMin;
                String str8 = str7 == null ? "" : str7;
                CardHolderModel cardHolderModel = min.length;
                if (cardHolderModel != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cardHolderModel.setMin);
                    sb.append(" ");
                    sb.append(cardHolderModel.length);
                    str = sb.toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                String str9 = min.setMin;
                if (str9 == null) {
                    str3 = "";
                } else {
                    str3 = str9;
                }
                String str10 = bankModel.getMin;
                if (str10 == null) {
                    str4 = "";
                } else {
                    str4 = str10;
                }
                String str11 = bankModel.toFloatRange;
                if (str11 == null) {
                    str5 = "";
                } else {
                    str5 = str11;
                }
                String str12 = bankModel.IsOverlapping;
                if (str12 == null) {
                    str6 = "";
                } else {
                    str6 = str12;
                }
                String str13 = bankModel.setMin;
                if (str13 == null) {
                    str13 = "";
                }
                h5ErrorCode.execute(new UserBank(str8, str2, str3, str4, str5, str6, str13), new setMax(experimentalRoomApi, min), new getMin(experimentalRoomApi));
                return;
            }
            ForeignKey.getMax getmax = this.this$0.setMax;
            Intrinsics.checkNotNullExpressionValue(min, "this");
            getmax.setMax(min);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bankExist", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ getProxy $withdrawNameCheckModel;
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(ExperimentalRoomApi experimentalRoomApi, getProxy getproxy) {
            super(1);
            this.this$0 = experimentalRoomApi;
            this.$withdrawNameCheckModel = getproxy;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                this.this$0.setMax.getMin(this.$withdrawNameCheckModel);
            } else {
                this.this$0.setMax.setMax(this.$withdrawNameCheckModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(ExperimentalRoomApi experimentalRoomApi) {
            super(1);
            this.this$0 = experimentalRoomApi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.onError(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ BankModel $bankModel;
        final /* synthetic */ x $nameCheckConfigModel;
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(ExperimentalRoomApi experimentalRoomApi, x xVar, BankModel bankModel) {
            super(1);
            this.this$0 = experimentalRoomApi;
            this.$nameCheckConfigModel = xVar;
            this.$bankModel = bankModel;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            int i2 = i + 1;
            this.this$0.length(i2);
            this.this$0.setMax.setMax(i2);
            if (ExperimentalRoomApi.setMax(i2, this.$nameCheckConfigModel)) {
                ExperimentalRoomApi experimentalRoomApi = this.this$0;
                BankModel bankModel = this.$bankModel;
                x xVar = this.$nameCheckConfigModel;
                Intrinsics.checkNotNullParameter(bankModel, "bankModel");
                Intrinsics.checkNotNullParameter(xVar, "nameCheckConfigModel");
                if (i2 == xVar.length + 1) {
                    experimentalRoomApi.getMax(ExperimentalRoomApi.getMin() + ((long) xVar.setMin));
                }
                Intrinsics.checkNotNullParameter(bankModel, "bankModel");
                Intrinsics.checkNotNullParameter(xVar, "nameCheckConfigModel");
                experimentalRoomApi.length.execute(onReceivedIcon.INSTANCE, new isInside(experimentalRoomApi, bankModel, xVar), new IsOverlapping(experimentalRoomApi));
                return;
            }
            ExperimentalRoomApi experimentalRoomApi2 = this.this$0;
            BankModel bankModel2 = this.$bankModel;
            x xVar2 = this.$nameCheckConfigModel;
            Intrinsics.checkNotNullParameter(bankModel2, "bankModel");
            Intrinsics.checkNotNullParameter(xVar2, "nameCheckConfigModel");
            setExtraDataFields setextradatafields = experimentalRoomApi2.setMin;
            setAllowPduOverflow setallowpduoverflow = new setAllowPduOverflow();
            setallowpduoverflow.setInstId(bankModel2.getMin);
            setallowpduoverflow.setCardNo(bankModel2.getMax);
            setallowpduoverflow.setWithdrawInstLocalName(bankModel2.setMin);
            setallowpduoverflow.setWithdrawPayMethod(bankModel2.toFloatRange);
            setallowpduoverflow.setWithdrawPayOption(bankModel2.IsOverlapping);
            setallowpduoverflow.setSenderName(bankModel2.isInside);
            setallowpduoverflow.setFundAmount(new stopBleScan("10000", "Rp"));
            setextradatafields.execute(setallowpduoverflow, new length(experimentalRoomApi2, xVar2, bankModel2), new getMax(experimentalRoomApi2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<Boolean, Unit> {
        public static final toString INSTANCE = new toString();

        toString() {
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
    static final class values extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ExperimentalRoomApi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(ExperimentalRoomApi experimentalRoomApi) {
            super(1);
            this.this$0 = experimentalRoomApi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.dismissProgress();
            ForeignKey.getMax getmax = this.this$0.setMax;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            getmax.setMax(message);
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Inject
    public ExperimentalRoomApi(@NotNull ForeignKey.getMax getmax, @NotNull Context context, @NotNull PhotoResolver.AnonymousClass1 r4, @NotNull setExtraDataFields setextradatafields, @NotNull getServiceUuid getserviceuuid, @NotNull getManufacturer getmanufacturer, @NotNull getBeaconTypeCode getbeacontypecode, @NotNull getDataFields getdatafields, @NotNull getBluetoothAddress getbluetoothaddress, @NotNull H5ErrorCode h5ErrorCode, @NotNull PrepareContextUitls prepareContextUitls, @NotNull SaveImageToAlbumBridgeExtension saveImageToAlbumBridgeExtension) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(r4, "sendMoneyBankMapper");
        Intrinsics.checkNotNullParameter(setextradatafields, "nameCheck");
        Intrinsics.checkNotNullParameter(getserviceuuid, "getBankSelectorConfig");
        Intrinsics.checkNotNullParameter(getmanufacturer, "getNameCheckCount");
        Intrinsics.checkNotNullParameter(getbeacontypecode, "saveNameCheckCount");
        Intrinsics.checkNotNullParameter(getdatafields, "getNameCheckExpiredTime");
        Intrinsics.checkNotNullParameter(getbluetoothaddress, "saveNameCheckExpiredTime");
        Intrinsics.checkNotNullParameter(h5ErrorCode, "checkUserBankExist");
        Intrinsics.checkNotNullParameter(prepareContextUitls, "getRecentRecipient");
        Intrinsics.checkNotNullParameter(saveImageToAlbumBridgeExtension, "bankModelMapper");
        this.setMax = getmax;
        this.IsOverlapping = context;
        this.toIntRange = r4;
        this.setMin = setextradatafields;
        this.isInside = getserviceuuid;
        this.toFloatRange = getmanufacturer;
        this.equals = getbeacontypecode;
        this.length = getdatafields;
        this.hashCode = getbluetoothaddress;
        this.getMax = h5ErrorCode;
        this.FastBitmap$CoordinateSystem = prepareContextUitls;
        this.toDoubleRange = saveImageToAlbumBridgeExtension;
    }

    public final void setMax(boolean z) {
        this.setMax.showProgress();
        this.isInside.execute(onReceivedIcon.INSTANCE, new hashCode(this, z), new values(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/bank/contract/BankSelectorPresenter$getDefaultBankFromRecent$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "onError", "", "e", "", "onNext", "recentRecipients", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<List<? extends getMonitorToken>> {
        final /* synthetic */ getParserIdentifier length;
        final /* synthetic */ ExperimentalRoomApi setMin;

        toFloatRange(ExperimentalRoomApi experimentalRoomApi, getParserIdentifier getparseridentifier) {
            this.setMin = experimentalRoomApi;
            this.length = getparseridentifier;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: o.getMonitorToken} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r11) {
            /*
                r10 = this;
                java.util.List r11 = (java.util.List) r11
                java.lang.String r0 = "recentRecipients"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                o.ExperimentalRoomApi r0 = r10.setMin
                o.ForeignKey$getMax r0 = r0.setMax
                r0.dismissProgress()
                o.ExperimentalRoomApi r0 = r10.setMin
                o.ForeignKey$getMax r0 = r0.setMax
                o.getParserIdentifier r1 = r10.length
                o.ExperimentalRoomApi r2 = r10.setMin
                o.SaveImageToAlbumBridgeExtension r2 = r2.toDoubleRange
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.Iterator r11 = r11.iterator()
                boolean r3 = r11.hasNext()
                if (r3 != 0) goto L_0x0028
                r11 = 0
                goto L_0x0053
            L_0x0028:
                java.lang.Object r3 = r11.next()
                boolean r4 = r11.hasNext()
                if (r4 != 0) goto L_0x0034
            L_0x0032:
                r11 = r3
                goto L_0x0053
            L_0x0034:
                r4 = r3
                o.getMonitorToken r4 = (o.getMonitorToken) r4
                long r4 = r4.getLastUpdated()
            L_0x003b:
                java.lang.Object r6 = r11.next()
                r7 = r6
                o.getMonitorToken r7 = (o.getMonitorToken) r7
                long r7 = r7.getLastUpdated()
                int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r9 >= 0) goto L_0x004c
                r3 = r6
                r4 = r7
            L_0x004c:
                boolean r6 = r11.hasNext()
                if (r6 != 0) goto L_0x003b
                goto L_0x0032
            L_0x0053:
                o.getMonitorToken r11 = (o.getMonitorToken) r11
                o.x r11 = o.resetState.setMin(r1, r2, r11)
                r0.length(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ExperimentalRoomApi.toFloatRange.onNext(java.lang.Object):void");
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMin.setMax.dismissProgress();
            this.setMin.setMax.length(resetState.setMin(this.length, this.setMin.toDoubleRange, (getMonitorToken) null));
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    public final void setMax(@NotNull BankModel bankModel, @NotNull x xVar) {
        Intrinsics.checkNotNullParameter(bankModel, "bankModel");
        Intrinsics.checkNotNullParameter(xVar, "nameCheckConfigModel");
        getMin(bankModel, xVar);
    }

    public final void length(int i) {
        this.equals.execute(new getBeaconTypeCode.setMax(i), ExperimentalRoomApi$FastBitmap$CoordinateSystem.INSTANCE, new toDoubleRange(this));
    }

    public final void getMin(@NotNull BankModel bankModel, @NotNull x xVar) {
        Intrinsics.checkNotNullParameter(bankModel, "bankModel");
        Intrinsics.checkNotNullParameter(xVar, "nameCheckConfigModel");
        this.toFloatRange.execute(onReceivedIcon.INSTANCE, new toIntRange(this, xVar, bankModel), new equals(this));
    }

    public final void getMax(long j) {
        this.hashCode.execute(new getBluetoothAddress.getMin(j), toString.INSTANCE, new invokeSuspend(this));
    }

    static long getMin() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* access modifiers changed from: private */
    public static boolean getMax(Throwable th) {
        return (th instanceof NetworkException) && Intrinsics.areEqual((Object) ((NetworkException) th).getErrorCode(), (Object) "AE15112158147646");
    }

    public final void setMax() {
        this.setMin.dispose();
        this.getMax.dispose();
        this.isInside.dispose();
        this.toFloatRange.dispose();
        this.equals.dispose();
        this.length.dispose();
        this.hashCode.dispose();
        this.FastBitmap$CoordinateSystem.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/bank/contract/BankSelectorPresenter$Companion;", "", "()V", "CURRENCY_RP", "", "ERROR_CODE_NON_KYC", "MINIMUM_FUND_AMOUNT", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public static boolean setMax(int i, x xVar) {
        return i > xVar.length;
    }

    public static final /* synthetic */ void length(ExperimentalRoomApi experimentalRoomApi, Throwable th) {
        if (th instanceof NetworkException) {
            convertDipToPx.length length2 = new convertDipToPx.length(experimentalRoomApi.IsOverlapping);
            length2.getMax = "Network Error";
            convertDipToPx.length max = length2.setMax(TrackerDataKey.Property.OPERATION_TYPE, TrackerDataKey.NetworkErrorOperationTypeProperty.NAME_CHECK).setMax(TrackerDataKey.Property.ERROR_CODE, ((NetworkException) th).getErrorCode()).setMax(TrackerDataKey.Property.ERROR_MESSAGE, th.getMessage());
            max.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
            List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        }
    }

    public static final /* synthetic */ void getMax(ExperimentalRoomApi experimentalRoomApi) {
        experimentalRoomApi.length(0);
        experimentalRoomApi.getMax(0);
    }
}
