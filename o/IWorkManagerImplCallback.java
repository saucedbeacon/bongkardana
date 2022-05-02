package o;

import android.text.TextUtils;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.AppPreDownloadPackageManager;
import o.DialogBridgeExtension;
import o.IWorkManagerImpl;
import o.ResourceDownloadType;
import o.b;
import o.onSuccess;
import o.parentColumns;
import o.savePresetConfiguration;
import o.setManifestCheckingDisabled;
import org.jetbrains.annotations.NotNull;

public final class IWorkManagerImplCallback implements onSuccess.length {
    /* access modifiers changed from: private */
    public final onSuccess.getMax getMax;
    private final savePresetConfiguration getMin;
    /* access modifiers changed from: private */
    public final setSelectedPhotoPaths length;
    private final packagePathForURLString setMax;
    private final AppPreDownloadPackageManager.AnonymousClass1.AnonymousClass1 setMin;

    static /* synthetic */ Unit setMin() {
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0004\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lid/dana/contract/sendmoney/v2/BillerX2BPresenter;", "Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "view", "Lid/dana/contract/sendmoney/v2/BillerX2BContract$View;", "getAllBillerX2B", "Lid/dana/domain/sendmoney/interactor/GetAllBillerX2B;", "checkCardNoPrefixFeature", "Lid/dana/domain/senddigitalmoney/interactor/CheckCardNoPrefixFeature;", "queryCardWithoutPrefix", "Lid/dana/domain/senddigitalmoney/interactor/QueryCardWithoutPrefix;", "getAuthCode", "Lid/dana/domain/authcode/interactor/GetAuthCode;", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "saveRecentBank", "Lid/dana/domain/recentbank/interactor/SaveRecentBank;", "(Lid/dana/contract/sendmoney/v2/BillerX2BContract$View;Lid/dana/domain/sendmoney/interactor/GetAllBillerX2B;Lid/dana/domain/senddigitalmoney/interactor/CheckCardNoPrefixFeature;Lid/dana/domain/senddigitalmoney/interactor/QueryCardWithoutPrefix;Lid/dana/domain/authcode/interactor/GetAuthCode;Lid/dana/data/config/DeviceInformationProvider;Lid/dana/domain/recentbank/interactor/SaveRecentBank;)V", "checkIsSendToBillerPage", "", "recipientModel", "Lid/dana/sendmoney/model/BaseRecipientModel;", "checkPrefixExist", "allBillerX2B", "", "Lid/dana/domain/sendmoney/model/BillerX2B;", "getPrefixBiller", "getPrefixNumber", "isNotNewBankInput", "", "onDestroy", "openBillerPage", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "updateRecentBank", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    public final class Default implements Stub.Proxy.getMin {
        @NotNull
        public static final length setMax = new length((byte) 0);
        private final GetAuthCode IsOverlapping;
        /* access modifiers changed from: private */
        public final getPerformanceTracker equals;
        private final addRangeNotifier getMax;
        private final setManifestCheckingDisabled getMin;
        private final setBeaconSimulator length;
        /* access modifiers changed from: private */
        public final Stub.Proxy.getMax setMin;
        private final ResourceDownloadType toFloatRange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lid/dana/domain/senddigitalmoney/model/CardPrefixQueryInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class IsOverlapping extends Lambda implements Function1<isScannerInDifferentProcess, Unit> {
            final /* synthetic */ PhotoSelectListener $recipientModel;
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            IsOverlapping(Default defaultR, PhotoSelectListener photoSelectListener) {
                super(1);
                this.this$0 = defaultR;
                this.$recipientModel = photoSelectListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((isScannerInDifferentProcess) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull isScannerInDifferentProcess isscannerindifferentprocess) {
                Intrinsics.checkNotNullParameter(isscannerindifferentprocess, "<name for destructuring parameter 0>");
                String component1 = isscannerindifferentprocess.component1();
                if (!TextUtils.isEmpty(component1)) {
                    this.$recipientModel.setMax(component1);
                }
                this.this$0.getMax.execute(onReceivedIcon.INSTANCE, new getMin(this.this$0, this.$recipientModel), new getMax(this.this$0, this.$recipientModel));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enable", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class equals extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ PhotoSelectListener $recipientModel;
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            equals(Default defaultR, PhotoSelectListener photoSelectListener) {
                super(1);
                this.this$0 = defaultR;
                this.$recipientModel = photoSelectListener;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    CharSequence min = this.$recipientModel.setMin();
                    if (!(min == null || StringsKt.isBlank(min))) {
                        Default.setMin(this.this$0, this.$recipientModel);
                        return;
                    }
                }
                this.this$0.getMax.execute(onReceivedIcon.INSTANCE, new getMin(this.this$0, this.$recipientModel), new getMax(this.this$0, this.$recipientModel));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ PhotoSelectListener $recipientModel;
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(Default defaultR, PhotoSelectListener photoSelectListener) {
                super(1);
                this.this$0 = defaultR;
                this.$recipientModel = photoSelectListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                StringBuilder sb = new StringBuilder();
                sb.append(this.this$0.getClass().getName());
                sb.append(", on Error: ");
                sb.append(th);
                updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TO_BILLER_TAG, sb.toString());
                this.this$0.setMin.setMax(this.$recipientModel);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/sendmoney/model/BillerX2B;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<List<? extends getExtraDataParsers>, Unit> {
            final /* synthetic */ PhotoSelectListener $recipientModel;
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(Default defaultR, PhotoSelectListener photoSelectListener) {
                super(1);
                this.this$0 = defaultR;
                this.$recipientModel = photoSelectListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<getExtraDataParsers>) (List) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull List<getExtraDataParsers> list) {
                Intrinsics.checkNotNullParameter(list, "it");
                Default.length(this.this$0, list, this.$recipientModel);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class isInside extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ PhotoSelectListener $recipientModel;
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            isInside(Default defaultR, PhotoSelectListener photoSelectListener) {
                super(1);
                this.this$0 = defaultR;
                this.$recipientModel = photoSelectListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                StringBuilder sb = new StringBuilder();
                sb.append(this.this$0.getClass().getName());
                sb.append(", on Error: ");
                sb.append(th);
                updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TO_BILLER_TAG, sb.toString());
                this.this$0.setMin.getMin(this.$recipientModel);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/sendmoney/model/BillerX2B;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function1<List<? extends getExtraDataParsers>, Unit> {
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(Default defaultR) {
                super(1);
                this.this$0 = defaultR;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<getExtraDataParsers>) (List) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull List<getExtraDataParsers> list) {
                Intrinsics.checkNotNullParameter(list, "it");
                this.this$0.setMin.setMax(list);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(Default defaultR) {
                super(1);
                this.this$0 = defaultR;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                StringBuilder sb = new StringBuilder();
                sb.append(this.this$0.getClass().getName());
                sb.append(", on Error: ");
                sb.append(th);
                updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TO_BILLER_TAG, sb.toString());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class toFloatRange extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ PhotoSelectListener $recipientModel;
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            toFloatRange(Default defaultR, PhotoSelectListener photoSelectListener) {
                super(1);
                this.this$0 = defaultR;
                this.$recipientModel = photoSelectListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "e");
                StringBuilder sb = new StringBuilder();
                sb.append(this.this$0.getClass().getName());
                sb.append(", on Error: ");
                sb.append(th);
                updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TO_BILLER_TAG, sb.toString());
                this.this$0.getMax.execute(onReceivedIcon.INSTANCE, new getMin(this.this$0, this.$recipientModel), new getMax(this.this$0, this.$recipientModel));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "authCodeResult", "Lid/dana/domain/authcode/AuthCodeResult;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class toIntRange extends Lambda implements Function1<SplashEntryInfo, Unit> {
            final /* synthetic */ getCurrX $billerX2BModel;
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            toIntRange(Default defaultR, getCurrX getcurrx) {
                super(1);
                this.this$0 = defaultR;
                this.$billerX2BModel = getcurrx;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SplashEntryInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SplashEntryInfo splashEntryInfo) {
                String str;
                Intrinsics.checkNotNullParameter(splashEntryInfo, "authCodeResult");
                if (this.$billerX2BModel.setMax()) {
                    getCurrX getcurrx = this.$billerX2BModel;
                    String authCode = splashEntryInfo.getAuthCode();
                    Intrinsics.checkNotNullExpressionValue(authCode, "authCodeResult.authCode");
                    String deviceUUID = this.this$0.equals.getDeviceUUID();
                    Intrinsics.checkNotNullExpressionValue(deviceUUID, "deviceInformationProvider.deviceUUID");
                    Intrinsics.checkNotNullParameter(getcurrx, "$this$toConstrucUrlRecents");
                    Intrinsics.checkNotNullParameter(authCode, "authCode");
                    Intrinsics.checkNotNullParameter(deviceUUID, HeaderConstant.HEADER_KEY_UUID);
                    str = setH5OptionMenuTextFlag.setMin("{redirectUrl}?authCode={authCode}&requestId={requestId}").getMin(BranchLinkConstant.OauthParams.REDIRECT_URL, getcurrx.getMax).getMin("authCode", authCode).getMin("requestId", deviceUUID).getMax();
                    Intrinsics.checkNotNullExpressionValue(str, "TagFormat.from(DanaUrl.B…, uuid)\n        .format()");
                } else {
                    getCurrX getcurrx2 = this.$billerX2BModel;
                    String authCode2 = splashEntryInfo.getAuthCode();
                    Intrinsics.checkNotNullExpressionValue(authCode2, "authCodeResult.authCode");
                    String deviceUUID2 = this.this$0.equals.getDeviceUUID();
                    Intrinsics.checkNotNullExpressionValue(deviceUUID2, "deviceInformationProvider.deviceUUID");
                    Intrinsics.checkNotNullParameter(getcurrx2, "$this$toConstrucUrlNewBank");
                    Intrinsics.checkNotNullParameter(authCode2, "authCode");
                    Intrinsics.checkNotNullParameter(deviceUUID2, HeaderConstant.HEADER_KEY_UUID);
                    str = setH5OptionMenuTextFlag.setMin("{redirectUrl}?authCode={authCode}&requestId={requestId}&prefix={prefix}&customerNumber={customerNumber}").getMin(BranchLinkConstant.OauthParams.REDIRECT_URL, getcurrx2.getMax).getMin("authCode", authCode2).getMin("requestId", deviceUUID2).getMin("prefix", getcurrx2.setMax).getMin("customerNumber", StringsKt.removePrefix(getcurrx2.isInside, (CharSequence) getcurrx2.setMax)).getMax();
                    Intrinsics.checkNotNullExpressionValue(str, "TagFormat.from(DanaUrl.B…refix))\n        .format()");
                }
                this.this$0.setMin.getMin(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class values extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ Default this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            values(Default defaultR) {
                super(1);
                this.this$0 = defaultR;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                StringBuilder sb = new StringBuilder();
                sb.append(this.this$0.getClass().getName());
                sb.append(", on Error: ");
                sb.append(th);
                updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TO_BILLER_TAG, sb.toString());
                if (th instanceof GetAuthCode.MissingRequiredUserInfoException) {
                    DialogBridgeExtension.AnonymousClass6.getMax((GetAuthCode.MissingRequiredUserInfoException) th, "Biller", (String) null);
                    return;
                }
                Stub.Proxy.getMax min = this.this$0.setMin;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                min.setMin(message);
            }
        }

        @Inject
        public Default(@NotNull Stub.Proxy.getMax getmax, @NotNull addRangeNotifier addrangenotifier, @NotNull setBeaconSimulator setbeaconsimulator, @NotNull setManifestCheckingDisabled setmanifestcheckingdisabled, @NotNull GetAuthCode getAuthCode, @NotNull getPerformanceTracker getperformancetracker, @NotNull ResourceDownloadType resourceDownloadType) {
            Intrinsics.checkNotNullParameter(getmax, "view");
            Intrinsics.checkNotNullParameter(addrangenotifier, "getAllBillerX2B");
            Intrinsics.checkNotNullParameter(setbeaconsimulator, "checkCardNoPrefixFeature");
            Intrinsics.checkNotNullParameter(setmanifestcheckingdisabled, "queryCardWithoutPrefix");
            Intrinsics.checkNotNullParameter(getAuthCode, Constants.JS_API_GET_AUTH_CODE);
            Intrinsics.checkNotNullParameter(getperformancetracker, "deviceInformationProvider");
            Intrinsics.checkNotNullParameter(resourceDownloadType, DanaLogConstants.BizType.SAVE_RECENT_BANK);
            this.setMin = getmax;
            this.getMax = addrangenotifier;
            this.length = setbeaconsimulator;
            this.getMin = setmanifestcheckingdisabled;
            this.IsOverlapping = getAuthCode;
            this.equals = getperformancetracker;
            this.toFloatRange = resourceDownloadType;
        }

        public final void length(@NotNull getCurrX getcurrx) {
            Intrinsics.checkNotNullParameter(getcurrx, "billerX2BModel");
            this.IsOverlapping.execute(GetAuthCode.length.Companion.forGetAuthCode(getcurrx.getMax, getcurrx.getMin, getcurrx.length, getcurrx.getMin()), new toIntRange(this, getcurrx), new values(this));
        }

        public final void setMin() {
            this.getMax.execute(onReceivedIcon.INSTANCE, new setMax(this), new setMin(this));
        }

        public final void length(@NotNull PhotoSelectListener photoSelectListener) {
            Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
            this.length.execute(onReceivedIcon.INSTANCE, new equals(this, photoSelectListener), new toFloatRange(this, photoSelectListener));
        }

        public final void setMax() {
            this.getMax.dispose();
            this.length.dispose();
            this.getMin.dispose();
            this.IsOverlapping.dispose();
            this.toFloatRange.dispose();
        }

        private static boolean setMax(PhotoSelectListener photoSelectListener) {
            if (photoSelectListener instanceof RecipientModel) {
                RecipientModel recipientModel = (RecipientModel) photoSelectListener;
                if (!Intrinsics.areEqual((Object) "bank", (Object) recipientModel.onNavigationEvent) || StringsKt.equals(RecipientSource.MANUAL_INPUT, recipientModel.invokeSuspend, true)) {
                    return false;
                }
            }
            return true;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/contract/sendmoney/v2/BillerX2BPresenter$Companion;", "", "()V", "ON_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(byte b) {
                this();
            }
        }

        public static final /* synthetic */ void setMin(Default defaultR, PhotoSelectListener photoSelectListener) {
            setManifestCheckingDisabled setmanifestcheckingdisabled = defaultR.getMin;
            setManifestCheckingDisabled.getMin.C0067getMin getmin = setManifestCheckingDisabled.getMin.Companion;
            String min = photoSelectListener.setMin();
            Intrinsics.checkNotNullExpressionValue(min, "recipientModel.cardIndexNo");
            setmanifestcheckingdisabled.execute(getmin.create(min), new IsOverlapping(defaultR, photoSelectListener), new isInside(defaultR, photoSelectListener));
        }

        public static final /* synthetic */ void length(Default defaultR, List list, PhotoSelectListener photoSelectListener) {
            boolean z;
            Default defaultR2 = defaultR;
            PhotoSelectListener photoSelectListener2 = photoSelectListener;
            List arrayList = new ArrayList();
            getCurrX getcurrx = new getCurrX((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 511);
            Collection arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String min = photoSelectListener.getMin();
                Intrinsics.checkNotNullExpressionValue(min, "recipientModel.id");
                if (StringsKt.contains$default((CharSequence) ((getExtraDataParsers) next).getInstId(), (CharSequence) min, false, 2, (Object) null)) {
                    arrayList2.add(next);
                }
            }
            Iterable<getExtraDataParsers> iterable = (List) arrayList2;
            Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (getExtraDataParsers add : iterable) {
                arrayList3.add(Boolean.valueOf(arrayList.add(add)));
            }
            Collection arrayList4 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                boolean z2 = true;
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                getExtraDataParsers getextradataparsers = (getExtraDataParsers) next2;
                String str = photoSelectListener2.isInside;
                Intrinsics.checkNotNullExpressionValue(str, "recipientModel.number");
                if (!StringsKt.startsWith$default(str, getextradataparsers.getPrefix(), false, 2, (Object) null)) {
                    String intRange = photoSelectListener.toIntRange();
                    Intrinsics.checkNotNullExpressionValue(intRange, "recipientModel.prefix");
                    if (!StringsKt.startsWith$default(intRange, getextradataparsers.getPrefix(), false, 2, (Object) null)) {
                        z2 = false;
                    }
                }
                if (z2) {
                    arrayList4.add(next2);
                }
            }
            Iterable<getExtraDataParsers> iterable2 = (List) arrayList4;
            Collection arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            for (getExtraDataParsers max : iterable2) {
                String str2 = photoSelectListener2.isInside;
                Intrinsics.checkNotNullExpressionValue(str2, "recipientModel.number");
                getcurrx = isVivoY11.setMax(max, str2);
                arrayList5.add(Unit.INSTANCE);
            }
            if (getcurrx.setMin.length() > 0) {
                z = true;
            }
            if (z) {
                if (setMax(photoSelectListener)) {
                    getcurrx.IsOverlapping = true;
                    Intrinsics.checkNotNullParameter("", "<set-?>");
                    getcurrx.isInside = "";
                }
                defaultR2.setMin.getMin(getcurrx);
                photoSelectListener2.setMax(getcurrx.setMax);
                ResourceDownloadType resourceDownloadType = defaultR2.toFloatRange;
                ResourceDownloadType resourceDownloadType2 = resourceDownloadType;
                ResourceDownloadType resourceDownloadType3 = resourceDownloadType2;
                resourceDownloadType3.execute(new IWorkManagerImplCallback$Default$FastBitmap$CoordinateSystem(), ResourceDownloadType.setMax.forSaveRecentBank(photoSelectListener.length(), photoSelectListener2.length, photoSelectListener2.isInside, photoSelectListener.getMax(), photoSelectListener2.setMin, photoSelectListener.getMin(), photoSelectListener2.length, photoSelectListener2.toIntRange, photoSelectListener2.toFloatRange, photoSelectListener2.equals, photoSelectListener.setMin(), photoSelectListener2.isInside, photoSelectListener.toIntRange(), photoSelectListener2.FastBitmap$CoordinateSystem, photoSelectListener.toFloatRange()));
                return;
            }
            defaultR2.setMin.setMax(photoSelectListener2);
        }
    }

    public final class Stub implements getAdapterPosition<Default> {
        private final b.C0007b<ResourceDownloadType> IsOverlapping;
        private final b.C0007b<getPerformanceTracker> equals;
        private final b.C0007b<GetAuthCode> getMax;
        private final b.C0007b<setManifestCheckingDisabled> getMin;
        private final b.C0007b<Proxy.getMax> length;
        private final b.C0007b<addRangeNotifier> setMax;
        private final b.C0007b<setBeaconSimulator> setMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/contract/sendmoney/v2/BillerX2BContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface Proxy {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0017J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lid/dana/contract/sendmoney/v2/BillerX2BContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onBillerUrlConstructed", "", "url", "", "onErrorCheckPrefix", "recipientModel", "Lid/dana/sendmoney/model/BaseRecipientModel;", "onErrorOpenBillerPage", "message", "onErrorQueryPrefix", "onPrefixExist", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "onSuccessGetAllBillerX2B", "allBillerX2B", "", "Lid/dana/domain/sendmoney/model/BillerX2B;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            public interface getMax extends parentColumns.getMax {
                void getMin(@NotNull String str);

                void getMin(@NotNull PhotoSelectListener photoSelectListener);

                void getMin(@NotNull getCurrX getcurrx);

                void setMax(@NotNull List<getExtraDataParsers> list);

                void setMax(@NotNull PhotoSelectListener photoSelectListener);

                @JvmDefault
                void setMin(@NotNull String str);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getAllBillerX2B", "", "getPrefixBiller", "recipientModel", "Lid/dana/sendmoney/model/BaseRecipientModel;", "openBillerPage", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            public interface getMin extends parentColumns.setMin {
                void length(@NotNull PhotoSelectListener photoSelectListener);

                void length(@NotNull getCurrX getcurrx);

                void setMin();
            }
        }

        private Stub(b.C0007b<Proxy.getMax> bVar, b.C0007b<addRangeNotifier> bVar2, b.C0007b<setBeaconSimulator> bVar3, b.C0007b<setManifestCheckingDisabled> bVar4, b.C0007b<GetAuthCode> bVar5, b.C0007b<getPerformanceTracker> bVar6, b.C0007b<ResourceDownloadType> bVar7) {
            this.length = bVar;
            this.setMax = bVar2;
            this.setMin = bVar3;
            this.getMin = bVar4;
            this.getMax = bVar5;
            this.equals = bVar6;
            this.IsOverlapping = bVar7;
        }

        public static Stub setMin(b.C0007b<Proxy.getMax> bVar, b.C0007b<addRangeNotifier> bVar2, b.C0007b<setBeaconSimulator> bVar3, b.C0007b<setManifestCheckingDisabled> bVar4, b.C0007b<GetAuthCode> bVar5, b.C0007b<getPerformanceTracker> bVar6, b.C0007b<ResourceDownloadType> bVar7) {
            return new Stub(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
        }

        public final /* synthetic */ Object get() {
            return new Default(this.length.get(), this.setMax.get(), this.setMin.get(), this.getMin.get(), this.getMax.get(), this.equals.get(), this.IsOverlapping.get());
        }
    }

    @Inject
    public IWorkManagerImplCallback(onSuccess.getMax getmax, AppPreDownloadPackageManager.AnonymousClass1.AnonymousClass1 r2, packagePathForURLString packagepathforurlstring, savePresetConfiguration savepresetconfiguration, setSelectedPhotoPaths setselectedphotopaths) {
        this.getMax = getmax;
        this.setMin = r2;
        this.setMax = packagepathforurlstring;
        this.getMin = savepresetconfiguration;
        this.length = setselectedphotopaths;
    }

    public final void length() {
        this.setMin.execute(new GriverAppVirtualHostProxy<List<ErrorPageUtils>>() {
            public final /* synthetic */ void onNext(Object obj) {
                onSuccess.getMax max = IWorkManagerImplCallback.this.getMax;
                setSelectedPhotoPaths unused = IWorkManagerImplCallback.this.length;
                max.getMax(setSelectedPhotoPaths.setMin((List) obj));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                IWorkManagerImplCallback.this.getMax.getMax();
            }
        });
    }

    public final void getMax(String str) {
        this.getMin.dispose();
        this.getMin.execute(new GriverAppVirtualHostProxy<List<ErrorPageUtils>>() {
            public final /* synthetic */ void onNext(Object obj) {
                onSuccess.getMax max = IWorkManagerImplCallback.this.getMax;
                setSelectedPhotoPaths unused = IWorkManagerImplCallback.this.length;
                max.length(setSelectedPhotoPaths.setMin((List) obj));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                IWorkManagerImplCallback.this.getMax.setMax();
            }
        }, savePresetConfiguration.setMin.forSaveRecentBank(str));
    }

    public final void getMax() {
        this.setMin.execute(new GriverAppVirtualHostProxy<List<ErrorPageUtils>>() {
            public final /* synthetic */ void onNext(Object obj) {
                onSuccess.getMax max = IWorkManagerImplCallback.this.getMax;
                setSelectedPhotoPaths unused = IWorkManagerImplCallback.this.length;
                max.setMax(setSelectedPhotoPaths.setMin((List) obj));
            }

            public final void onError(Throwable th) {
                IWorkManagerImplCallback.this.getMax.getMin();
            }
        });
    }

    public final void getMin() {
        this.setMax.execute(onReceivedIcon.INSTANCE, new IWorkManagerImpl.Stub.Proxy(this), IWorkManagerImpl.Default.length);
    }

    public final void setMax() {
        this.setMin.dispose();
        this.getMin.dispose();
        this.setMax.dispose();
    }
}
