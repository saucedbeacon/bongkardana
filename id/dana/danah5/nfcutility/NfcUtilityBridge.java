package id.dana.danah5.nfcutility;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.di.modules.GContainerModule;
import id.dana.lib.electronicmoney.DanaEmoney;
import id.dana.lib.electronicmoney.activity.BottomSheetActivity;
import id.dana.lib.electronicmoney.bri.model.ReversalResult;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CornerMarkingDataProvider;
import o.GriverAppVirtualHostProxy;
import o.PrepareException;
import o.TabBarBridgeExtension;
import o.WindowBridgeExtension;
import o.access$getDEFAULT_BEHAVIOR$cp;
import o.getDEFAULT_BEHAVIOR;
import o.getDefaultZoom;
import o.getLoadWithOverviewMode;
import o.getProgressViewStartOffset;
import o.getSaveFormData;
import o.getSavePassword;
import o.getTextZoom;
import o.getUseWideViewPort;
import o.hideBackButton;
import o.hideOptionMenu;
import o.hideTitleLoading;
import o.onReceivedIcon;
import o.saveSnapshot;
import o.setAllowContentAccess;
import o.setBarBottomLineColor;
import o.setGlobalUserData;
import o.setLayoutAlgorithm;
import o.setLoadWithOverviewMode;
import o.setSaveFormData;
import o.setSavePassword;
import o.setSupportMultipleWindows;
import o.setUseWideViewPort;
import o.supportMultipleWindows;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000­\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001T\u0018\u0000 c2\u00020\u0001:\u0001cB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040=2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0018\u0010D\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u0004H\u0002J\u0018\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0004H\u0002J\u0010\u0010M\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0018\u0010N\u001a\u00020A2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0002J\r\u0010S\u001a\u00020TH\u0002¢\u0006\u0002\u0010UJ2\u0010V\u001a\u00020A2\b\b\u0001\u0010W\u001a\u00020\u00042\n\b\u0001\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010X\u001a\u00020YH\u0007J\b\u0010Z\u001a\u00020AH\u0016J\b\u0010[\u001a\u00020AH\u0016J\u0010\u0010\\\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010]\u001a\u00020A2\u0006\u0010^\u001a\u00020\u0004H\u0002J\b\u0010_\u001a\u00020AH\u0002J\u0010\u0010`\u001a\u00020A2\u0006\u0010a\u001a\u00020bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X.¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0002078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006d"}, d2 = {"Lid/dana/danah5/nfcutility/NfcUtilityBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "amount", "", "approvalCode", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "confirmUpdateBalanceEmoney", "Lid/dana/domain/electronicmoney/interactor/ConfirmUpdateBalanceEmoney;", "getConfirmUpdateBalanceEmoney", "()Lid/dana/domain/electronicmoney/interactor/ConfirmUpdateBalanceEmoney;", "setConfirmUpdateBalanceEmoney", "(Lid/dana/domain/electronicmoney/interactor/ConfirmUpdateBalanceEmoney;)V", "doBrizziManualReversal", "Lid/dana/domain/electronicmoney/interactor/DoBrizziManualReversal;", "getDoBrizziManualReversal", "()Lid/dana/domain/electronicmoney/interactor/DoBrizziManualReversal;", "setDoBrizziManualReversal", "(Lid/dana/domain/electronicmoney/interactor/DoBrizziManualReversal;)V", "emoneyCardType", "emoneyTransId", "getBrizziAccessToken", "Lid/dana/domain/electronicmoney/interactor/GetBrizziAccessToken;", "getGetBrizziAccessToken", "()Lid/dana/domain/electronicmoney/interactor/GetBrizziAccessToken;", "setGetBrizziAccessToken", "(Lid/dana/domain/electronicmoney/interactor/GetBrizziAccessToken;)V", "getElectronicMoneyConfig", "Lid/dana/domain/electronicmoney/interactor/GetElectronicMoneyConfig;", "getGetElectronicMoneyConfig", "()Lid/dana/domain/electronicmoney/interactor/GetElectronicMoneyConfig;", "setGetElectronicMoneyConfig", "(Lid/dana/domain/electronicmoney/interactor/GetElectronicMoneyConfig;)V", "getEmoneyReversal", "Lid/dana/domain/electronicmoney/interactor/GetEmoneyReversal;", "getGetEmoneyReversal", "()Lid/dana/domain/electronicmoney/interactor/GetEmoneyReversal;", "setGetEmoneyReversal", "(Lid/dana/domain/electronicmoney/interactor/GetEmoneyReversal;)V", "getTransIdEmoney", "Lid/dana/domain/electronicmoney/interactor/GenerateEmoneyTransId;", "getGetTransIdEmoney", "()Lid/dana/domain/electronicmoney/interactor/GenerateEmoneyTransId;", "setGetTransIdEmoney", "(Lid/dana/domain/electronicmoney/interactor/GenerateEmoneyTransId;)V", "inquireBalanceEmoney", "Lid/dana/domain/electronicmoney/interactor/InquireBalanceEmoney;", "getInquireBalanceEmoney", "()Lid/dana/domain/electronicmoney/interactor/InquireBalanceEmoney;", "setInquireBalanceEmoney", "(Lid/dana/domain/electronicmoney/interactor/InquireBalanceEmoney;)V", "nfcAdapter", "Landroid/nfc/NfcAdapter;", "topUpCommandEmoney", "Lid/dana/domain/electronicmoney/interactor/GetTopUpCommandEmoney;", "getTopUpCommandEmoney", "()Lid/dana/domain/electronicmoney/interactor/GetTopUpCommandEmoney;", "setTopUpCommandEmoney", "(Lid/dana/domain/electronicmoney/interactor/GetTopUpCommandEmoney;)V", "assembleEmoneyCardAttribute", "", "emoneyCardAttribute", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "checkCardEligibility", "", "activity", "Landroid/app/Activity;", "checkEvent", "info", "Lcom/alibaba/fastjson/JSONObject;", "decryptConsumerSecret", "consumerSecret", "getExtendInfoByError", "t", "", "key", "getNfcEligibility", "handleBrizziCall", "builder", "Lid/dana/lib/electronicmoney/DanaEmoney$Builder;", "brizziAccessToken", "Lid/dana/domain/electronicmoney/model/response/BrizziAccessTokenInfo;", "handleEmoneyCallback", "id/dana/danah5/nfcutility/NfcUtilityBridge$handleEmoneyCallback$1", "()Lid/dana/danah5/nfcutility/NfcUtilityBridge$handleEmoneyCallback$1;", "nfcUtility", "eventName", "page", "Lcom/alibaba/ariver/app/api/Page;", "onFinalized", "onInitialized", "openBottomsheet", "sendErrorResult", "errorCode", "sendSuccessResult", "tryBrizziManualReversal", "reversalResult", "Lid/dana/lib/electronicmoney/bri/model/ReversalResult;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NfcUtilityBridge extends SimpleBridgeExtension {
    private static final String CHECK = "check";
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    private static final String DEVICE = "device";
    private static final String WRITE = "write";
    /* access modifiers changed from: private */
    public String amount = "";
    /* access modifiers changed from: private */
    public String approvalCode = "";
    private BridgeCallback bridgeCallback;
    @Inject
    public setSaveFormData confirmUpdateBalanceEmoney;
    @Inject
    public getLoadWithOverviewMode doBrizziManualReversal;
    /* access modifiers changed from: private */
    public String emoneyCardType;
    /* access modifiers changed from: private */
    public String emoneyTransId;
    @Inject
    public setAllowContentAccess getBrizziAccessToken;
    @Inject
    public setLoadWithOverviewMode getElectronicMoneyConfig;
    @Inject
    public getTextZoom getEmoneyReversal;
    @Inject
    public getSaveFormData getTransIdEmoney;
    @Inject
    public getSavePassword inquireBalanceEmoney;
    private NfcAdapter nfcAdapter;
    @Inject
    public setSavePassword topUpCommandEmoney;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ NfcUtilityBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(NfcUtilityBridge nfcUtilityBridge) {
            super(1);
            this.this$0 = nfcUtilityBridge;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.sendSuccessResult();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ NfcUtilityBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(NfcUtilityBridge nfcUtilityBridge) {
            super(1);
            this.this$0 = nfcUtilityBridge;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.sendErrorResult("001");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Activity $this_apply;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(Activity activity) {
            super(1);
            this.$this_apply = activity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.$this_apply.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<View, Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyBaseResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<setUseWideViewPort, Unit> {
        final /* synthetic */ NfcUtilityBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(NfcUtilityBridge nfcUtilityBridge) {
            super(1);
            this.this$0 = nfcUtilityBridge;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((setUseWideViewPort) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull setUseWideViewPort setusewideviewport) {
            Intrinsics.checkNotNullParameter(setusewideviewport, "it");
            this.this$0.sendSuccessResult();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Map<String, ? extends setSupportMultipleWindows>, Unit> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ DanaEmoney.Builder $builder;
        final /* synthetic */ NfcUtilityBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(NfcUtilityBridge nfcUtilityBridge, DanaEmoney.Builder builder, Activity activity) {
            super(1);
            this.this$0 = nfcUtilityBridge;
            this.$builder = builder;
            this.$activity = activity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, setSupportMultipleWindows>) (Map) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Map<String, setSupportMultipleWindows> map) {
            Intrinsics.checkNotNullParameter(map, "it");
            setSupportMultipleWindows setsupportmultiplewindows = map.get("emoney");
            if (setsupportmultiplewindows != null && setsupportmultiplewindows.getEnable()) {
                this.$builder.setupEmoney(new hideOptionMenu(true), this.this$0.handleEmoneyCallback());
            }
            setSupportMultipleWindows setsupportmultiplewindows2 = map.get("brizzi");
            if (setsupportmultiplewindows2 == null || !setsupportmultiplewindows2.getEnable()) {
                this.$builder.build();
                this.this$0.openBottomsheet(this.$activity);
                return;
            }
            this.this$0.getGetBrizziAccessToken().execute(onReceivedIcon.INSTANCE, new Function1<getDefaultZoom, Unit>(this) {
                final /* synthetic */ toIntRange this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((getDefaultZoom) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull getDefaultZoom getdefaultzoom) {
                    Intrinsics.checkNotNullParameter(getdefaultzoom, "tokenInfo");
                    this.this$0.this$0.handleBrizziCall(this.this$0.$builder, getdefaultzoom);
                }
            }, new Function1<Throwable, Unit>(this) {
                final /* synthetic */ toIntRange this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "it");
                    this.this$0.this$0.sendErrorResult("001");
                }
            }, new Function0<Unit>(this) {
                final /* synthetic */ toIntRange this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.$builder.build();
                    this.this$0.this$0.openBottomsheet(this.this$0.$activity);
                }
            });
        }
    }

    public static final /* synthetic */ String access$getEmoneyCardType$p(NfcUtilityBridge nfcUtilityBridge) {
        String str = nfcUtilityBridge.emoneyCardType;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emoneyCardType");
        }
        return str;
    }

    public static final /* synthetic */ String access$getEmoneyTransId$p(NfcUtilityBridge nfcUtilityBridge) {
        String str = nfcUtilityBridge.emoneyTransId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emoneyTransId");
        }
        return str;
    }

    @NotNull
    public final setAllowContentAccess getGetBrizziAccessToken() {
        setAllowContentAccess setallowcontentaccess = this.getBrizziAccessToken;
        if (setallowcontentaccess == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getBrizziAccessToken");
        }
        return setallowcontentaccess;
    }

    public final void setGetBrizziAccessToken(@NotNull setAllowContentAccess setallowcontentaccess) {
        Intrinsics.checkNotNullParameter(setallowcontentaccess, "<set-?>");
        this.getBrizziAccessToken = setallowcontentaccess;
    }

    @NotNull
    public final setLoadWithOverviewMode getGetElectronicMoneyConfig() {
        setLoadWithOverviewMode setloadwithoverviewmode = this.getElectronicMoneyConfig;
        if (setloadwithoverviewmode == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getElectronicMoneyConfig");
        }
        return setloadwithoverviewmode;
    }

    public final void setGetElectronicMoneyConfig(@NotNull setLoadWithOverviewMode setloadwithoverviewmode) {
        Intrinsics.checkNotNullParameter(setloadwithoverviewmode, "<set-?>");
        this.getElectronicMoneyConfig = setloadwithoverviewmode;
    }

    @NotNull
    public final getLoadWithOverviewMode getDoBrizziManualReversal() {
        getLoadWithOverviewMode getloadwithoverviewmode = this.doBrizziManualReversal;
        if (getloadwithoverviewmode == null) {
            Intrinsics.throwUninitializedPropertyAccessException("doBrizziManualReversal");
        }
        return getloadwithoverviewmode;
    }

    public final void setDoBrizziManualReversal(@NotNull getLoadWithOverviewMode getloadwithoverviewmode) {
        Intrinsics.checkNotNullParameter(getloadwithoverviewmode, "<set-?>");
        this.doBrizziManualReversal = getloadwithoverviewmode;
    }

    @NotNull
    public final setSaveFormData getConfirmUpdateBalanceEmoney() {
        setSaveFormData setsaveformdata = this.confirmUpdateBalanceEmoney;
        if (setsaveformdata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmUpdateBalanceEmoney");
        }
        return setsaveformdata;
    }

    public final void setConfirmUpdateBalanceEmoney(@NotNull setSaveFormData setsaveformdata) {
        Intrinsics.checkNotNullParameter(setsaveformdata, "<set-?>");
        this.confirmUpdateBalanceEmoney = setsaveformdata;
    }

    @NotNull
    public final setSavePassword getTopUpCommandEmoney() {
        setSavePassword setsavepassword = this.topUpCommandEmoney;
        if (setsavepassword == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topUpCommandEmoney");
        }
        return setsavepassword;
    }

    public final void setTopUpCommandEmoney(@NotNull setSavePassword setsavepassword) {
        Intrinsics.checkNotNullParameter(setsavepassword, "<set-?>");
        this.topUpCommandEmoney = setsavepassword;
    }

    @NotNull
    public final getSavePassword getInquireBalanceEmoney() {
        getSavePassword getsavepassword = this.inquireBalanceEmoney;
        if (getsavepassword == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inquireBalanceEmoney");
        }
        return getsavepassword;
    }

    public final void setInquireBalanceEmoney(@NotNull getSavePassword getsavepassword) {
        Intrinsics.checkNotNullParameter(getsavepassword, "<set-?>");
        this.inquireBalanceEmoney = getsavepassword;
    }

    @NotNull
    public final getTextZoom getGetEmoneyReversal() {
        getTextZoom gettextzoom = this.getEmoneyReversal;
        if (gettextzoom == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getEmoneyReversal");
        }
        return gettextzoom;
    }

    public final void setGetEmoneyReversal(@NotNull getTextZoom gettextzoom) {
        Intrinsics.checkNotNullParameter(gettextzoom, "<set-?>");
        this.getEmoneyReversal = gettextzoom;
    }

    @NotNull
    public final getSaveFormData getGetTransIdEmoney() {
        getSaveFormData getsaveformdata = this.getTransIdEmoney;
        if (getsaveformdata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getTransIdEmoney");
        }
        return getsaveformdata;
    }

    public final void setGetTransIdEmoney(@NotNull getSaveFormData getsaveformdata) {
        Intrinsics.checkNotNullParameter(getsaveformdata, "<set-?>");
        this.getTransIdEmoney = getsaveformdata;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void nfcUtility(@NotNull @BindingParam(name = {"event"}) String str, @Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity = pageContext != null ? pageContext.getActivity() : null;
        if (activity != null) {
            DanaEmoney.Builder builder = new DanaEmoney.Builder(WindowBridgeExtension.AnonymousClass1.getMax(), (hideOptionMenu) null, (setBarBottomLineColor) null, (WindowBridgeExtension) null, (TabBarBridgeExtension.AnonymousClass2) null, (Long) null, 62, (DefaultConstructorMarker) null);
            builder.setTimeoutMillis(10000L);
            this.bridgeCallback = bridgeCallback2;
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
            if (defaultAdapter == null) {
                sendErrorResult("002");
                return;
            }
            this.nfcAdapter = defaultAdapter;
            if (Intrinsics.areEqual((Object) "check", (Object) str) && jSONObject != null) {
                checkEvent(activity, jSONObject);
            } else if (Intrinsics.areEqual((Object) WRITE, (Object) str)) {
                try {
                    setLoadWithOverviewMode setloadwithoverviewmode = this.getElectronicMoneyConfig;
                    if (setloadwithoverviewmode == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("getElectronicMoneyConfig");
                    }
                    setloadwithoverviewmode.execute(onReceivedIcon.INSTANCE, new toIntRange(this, builder, activity), new equals(this));
                } catch (Exception unused) {
                    sendErrorResult("001");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\bH\u0016J3\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\bH\u0016J3\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\bH\u0016¨\u0006\u000f"}, d2 = {"id/dana/danah5/nfcutility/NfcUtilityBridge$handleEmoneyCallback$1", "Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "callConfirm", "", "emoneyCardAttribute", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "callGetTopupCommand", "onResult", "Lkotlin/Function1;", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;", "Lkotlin/ParameterName;", "name", "result", "callInquiryBalance", "callReversal", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements setBarBottomLineColor {
        final /* synthetic */ NfcUtilityBridge this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/electronicmoney/model/response/EmoneyGenerateTransId;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class IsOverlapping extends Lambda implements Function1<supportMultipleWindows, Unit> {
            final /* synthetic */ hideBackButton $emoneyCardAttribute;
            final /* synthetic */ Function1 $onResult;
            final /* synthetic */ setMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            IsOverlapping(setMax setmax, hideBackButton hidebackbutton, Function1 function1) {
                super(1);
                this.this$0 = setmax;
                this.$emoneyCardAttribute = hidebackbutton;
                this.$onResult = function1;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((supportMultipleWindows) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull supportMultipleWindows supportmultiplewindows) {
                Intrinsics.checkNotNullParameter(supportmultiplewindows, "result");
                this.this$0.this$0.emoneyTransId = supportmultiplewindows.getBizId();
                Map access$assembleEmoneyCardAttribute = this.this$0.this$0.assembleEmoneyCardAttribute(this.$emoneyCardAttribute);
                getTextZoom getEmoneyReversal = this.this$0.this$0.getGetEmoneyReversal();
                setGlobalUserData r1 = new GriverAppVirtualHostProxy<setLayoutAlgorithm>(this) {
                    final /* synthetic */ IsOverlapping this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onNext(@NotNull setLayoutAlgorithm setlayoutalgorithm) {
                        Intrinsics.checkNotNullParameter(setlayoutalgorithm, "it");
                        Function1 function1 = this.this$0.$onResult;
                        boolean success = setlayoutalgorithm.getSuccess();
                        String access$getEmoneyTransId$p = NfcUtilityBridge.access$getEmoneyTransId$p(this.this$0.this$0.this$0);
                        String errorCode = setlayoutalgorithm.getErrorCode();
                        String access$getEmoneyCardType$p = NfcUtilityBridge.access$getEmoneyCardType$p(this.this$0.this$0.this$0);
                        String access$getApprovalCode$p = this.this$0.this$0.this$0.approvalCode;
                        Map<String, String> data = setlayoutalgorithm.getData();
                        String str = setlayoutalgorithm.getData().get("message");
                        if (str == null) {
                            str = "";
                        }
                        data.put("message", str);
                        Unit unit = Unit.INSTANCE;
                        function1.invoke(new hideTitleLoading(success, errorCode, access$getEmoneyTransId$p, access$getApprovalCode$p, access$getEmoneyCardType$p, (String) null, (String) null, data, 96));
                    }

                    public final void onError(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "it");
                        NetworkException networkException = (NetworkException) th;
                        Function1 function1 = this.this$0.$onResult;
                        String errorCode = networkException.getErrorCode();
                        if (errorCode == null) {
                            errorCode = "";
                        }
                        String str = errorCode;
                        String access$getEmoneyCardType$p = NfcUtilityBridge.access$getEmoneyCardType$p(this.this$0.this$0.this$0);
                        String access$getEmoneyTransId$p = NfcUtilityBridge.access$getEmoneyTransId$p(this.this$0.this$0.this$0);
                        String access$getApprovalCode$p = this.this$0.this$0.this$0.approvalCode;
                        Map<String, String> extendInfo = networkException.getExtendInfo();
                        if (extendInfo == null) {
                            extendInfo = new LinkedHashMap<>();
                        }
                        function1.invoke(new hideTitleLoading(false, str, access$getEmoneyTransId$p, access$getApprovalCode$p, access$getEmoneyCardType$p, (String) null, (String) null, extendInfo, 96));
                    }
                };
                getTextZoom.length.C0060length length = getTextZoom.length.Companion;
                String str = this.$emoneyCardAttribute.setMax;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                String str3 = this.$emoneyCardAttribute.length;
                if (str3 != null) {
                    str2 = str3;
                }
                getEmoneyReversal.execute(r1, length.create(str, str2, access$assembleEmoneyCardAttribute));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ setMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(setMax setmax) {
                super(1);
                this.this$0 = setmax;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.this$0.sendSuccessResult();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/electronicmoney/model/response/EmoneyGenerateTransId;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<supportMultipleWindows, Unit> {
            final /* synthetic */ hideBackButton $emoneyCardAttribute;
            final /* synthetic */ setMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(setMax setmax, hideBackButton hidebackbutton) {
                super(1);
                this.this$0 = setmax;
                this.$emoneyCardAttribute = hidebackbutton;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((supportMultipleWindows) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull supportMultipleWindows supportmultiplewindows) {
                Intrinsics.checkNotNullParameter(supportmultiplewindows, "result");
                this.this$0.this$0.emoneyTransId = supportmultiplewindows.getBizId();
                this.this$0.this$0.getConfirmUpdateBalanceEmoney().execute(new GriverAppVirtualHostProxy<setUseWideViewPort>() {
                }, setSaveFormData.setMax.Companion.create(String.valueOf(this.$emoneyCardAttribute.setMax), String.valueOf(this.$emoneyCardAttribute.length), this.this$0.this$0.assembleEmoneyCardAttribute(this.$emoneyCardAttribute)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/electronicmoney/model/response/EmoneyGenerateTransId;", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.danah5.nfcutility.NfcUtilityBridge$setMax$setMax  reason: collision with other inner class name */
        static final class C0102setMax extends Lambda implements Function1<supportMultipleWindows, Unit> {
            final /* synthetic */ hideBackButton $emoneyCardAttribute;
            final /* synthetic */ Function1 $onResult;
            final /* synthetic */ setMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0102setMax(setMax setmax, hideBackButton hidebackbutton, Function1 function1) {
                super(1);
                this.this$0 = setmax;
                this.$emoneyCardAttribute = hidebackbutton;
                this.$onResult = function1;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((supportMultipleWindows) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final supportMultipleWindows supportmultiplewindows) {
                Intrinsics.checkNotNullParameter(supportmultiplewindows, "result");
                this.this$0.this$0.emoneyTransId = supportmultiplewindows.getBizId();
                this.this$0.this$0.emoneyCardType = "";
                this.this$0.this$0.approvalCode = "";
                this.this$0.this$0.getInquireBalanceEmoney().execute(new GriverAppVirtualHostProxy<getUseWideViewPort>(this) {
                    final /* synthetic */ C0102setMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onNext(@NotNull getUseWideViewPort getusewideviewport) {
                        String str;
                        String str2;
                        Intrinsics.checkNotNullParameter(getusewideviewport, "cardInfo");
                        NfcUtilityBridge nfcUtilityBridge = this.this$0.this$0.this$0;
                        String apiVersion = getusewideviewport.getApiVersion();
                        if (apiVersion == null) {
                            apiVersion = "";
                        }
                        nfcUtilityBridge.emoneyCardType = apiVersion;
                        NfcUtilityBridge nfcUtilityBridge2 = this.this$0.this$0.this$0;
                        String approvalCode = getusewideviewport.getApprovalCode();
                        if (approvalCode == null) {
                            approvalCode = "";
                        }
                        nfcUtilityBridge2.approvalCode = approvalCode;
                        NfcUtilityBridge nfcUtilityBridge3 = this.this$0.this$0.this$0;
                        String pendingTopup = getusewideviewport.getPendingTopup();
                        if (pendingTopup == null) {
                            pendingTopup = "";
                        }
                        nfcUtilityBridge3.amount = pendingTopup;
                        Function1 function1 = this.this$0.$onResult;
                        boolean success = getusewideviewport.getSuccess();
                        String errorCode = getusewideviewport.getErrorCode();
                        if (errorCode == null) {
                            str = "";
                        } else {
                            str = errorCode;
                        }
                        String apiVersion2 = getusewideviewport.getApiVersion();
                        if (apiVersion2 == null) {
                            str2 = "";
                        } else {
                            str2 = apiVersion2;
                        }
                        function1.invoke(new hideTitleLoading(success, str, supportmultiplewindows.getBizId(), this.this$0.this$0.this$0.approvalCode, str2, this.this$0.this$0.this$0.amount, getusewideviewport.getSession(), getusewideviewport.getData()));
                    }

                    public final void onError(@NotNull Throwable th) {
                        String str;
                        Map<String, String> map;
                        Intrinsics.checkNotNullParameter(th, "it");
                        this.this$0.this$0.this$0.approvalCode = this.this$0.this$0.this$0.getExtendInfoByError(th, "approvalCode");
                        this.this$0.this$0.this$0.emoneyCardType = this.this$0.this$0.this$0.getExtendInfoByError(th, "cardType");
                        this.this$0.this$0.this$0.amount = this.this$0.this$0.this$0.getExtendInfoByError(th, "amount");
                        Function1 function1 = this.this$0.$onResult;
                        boolean z = th instanceof NetworkException;
                        if (!z || (str = ((NetworkException) th).getErrorCode()) == null) {
                            str = "";
                        }
                        String str2 = str;
                        String access$getEmoneyCardType$p = NfcUtilityBridge.access$getEmoneyCardType$p(this.this$0.this$0.this$0);
                        String access$getEmoneyTransId$p = NfcUtilityBridge.access$getEmoneyTransId$p(this.this$0.this$0.this$0);
                        String access$getApprovalCode$p = this.this$0.this$0.this$0.approvalCode;
                        if (z) {
                            map = ((NetworkException) th).getExtendInfo();
                            Intrinsics.checkNotNullExpressionValue(map, "it.extendInfo");
                        } else {
                            map = new LinkedHashMap<>();
                        }
                        function1.invoke(new hideTitleLoading(false, str2, access$getEmoneyTransId$p, access$getApprovalCode$p, access$getEmoneyCardType$p, (String) null, (String) null, map, 96));
                    }
                }, getSavePassword.setMax.Companion.create(this.this$0.this$0.assembleEmoneyCardAttribute(this.$emoneyCardAttribute)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ setMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(setMax setmax) {
                super(1);
                this.this$0 = setmax;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.this$0.sendSuccessResult();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ setMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            toIntRange(setMax setmax) {
                super(1);
                this.this$0 = setmax;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.this$0.sendSuccessResult();
            }
        }

        setMax(NfcUtilityBridge nfcUtilityBridge) {
            this.this$0 = nfcUtilityBridge;
        }

        public final void callConfirm(@NotNull hideBackButton hidebackbutton) {
            Intrinsics.checkNotNullParameter(hidebackbutton, "emoneyCardAttribute");
            this.this$0.getGetTransIdEmoney().execute(onReceivedIcon.INSTANCE, new length(this, hidebackbutton), new getMax(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"id/dana/danah5/nfcutility/NfcUtilityBridge$handleEmoneyCallback$1$callGetTopupCommand$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/electronicmoney/model/response/EmoneyCardInfo;", "onError", "", "it", "", "onNext", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends GriverAppVirtualHostProxy<getUseWideViewPort> {
            final /* synthetic */ hideBackButton $emoneyCardAttribute;
            final /* synthetic */ Function1 $onResult;
            final /* synthetic */ setMax this$0;

            getMin(setMax setmax, Function1 function1, hideBackButton hidebackbutton) {
                this.this$0 = setmax;
                this.$onResult = function1;
                this.$emoneyCardAttribute = hidebackbutton;
            }

            public final void onNext(@NotNull getUseWideViewPort getusewideviewport) {
                Intrinsics.checkNotNullParameter(getusewideviewport, "it");
                Function1 function1 = this.$onResult;
                boolean success = getusewideviewport.getSuccess();
                String errorCode = getusewideviewport.getErrorCode();
                String access$getEmoneyCardType$p = NfcUtilityBridge.access$getEmoneyCardType$p(this.this$0.this$0);
                String str = getusewideviewport.getData().get("approvalCode");
                if (str == null) {
                    str = getusewideviewport.getApprovalCode();
                }
                String str2 = str;
                String access$getEmoneyTransId$p = NfcUtilityBridge.access$getEmoneyTransId$p(this.this$0.this$0);
                Map<String, String> data = getusewideviewport.getData();
                String str3 = getusewideviewport.getData().get("message");
                if (str3 == null) {
                    str3 = "";
                }
                data.put("message", str3);
                data.put("amount", this.this$0.this$0.amount);
                data.put("lastBalance", this.$emoneyCardAttribute.IsOverlapping);
                Unit unit = Unit.INSTANCE;
                function1.invoke(new hideTitleLoading(success, errorCode, access$getEmoneyTransId$p, str2, access$getEmoneyCardType$p, (String) null, (String) null, data, 96));
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                NetworkException networkException = (NetworkException) th;
                Function1 function1 = this.$onResult;
                String errorCode = networkException.getErrorCode();
                if (errorCode == null) {
                    errorCode = "";
                }
                String str = errorCode;
                String access$getEmoneyCardType$p = NfcUtilityBridge.access$getEmoneyCardType$p(this.this$0.this$0);
                String access$getEmoneyTransId$p = NfcUtilityBridge.access$getEmoneyTransId$p(this.this$0.this$0);
                String access$getApprovalCode$p = this.this$0.this$0.approvalCode;
                Map<String, String> extendInfo = networkException.getExtendInfo();
                if (extendInfo == null) {
                    extendInfo = new LinkedHashMap<>();
                }
                function1.invoke(new hideTitleLoading(true, str, access$getEmoneyTransId$p, access$getApprovalCode$p, access$getEmoneyCardType$p, (String) null, (String) null, extendInfo, 96));
            }
        }

        public final void callGetTopupCommand(@NotNull hideBackButton hidebackbutton, @NotNull Function1<? super hideTitleLoading, Unit> function1) {
            Intrinsics.checkNotNullParameter(hidebackbutton, "emoneyCardAttribute");
            Intrinsics.checkNotNullParameter(function1, "onResult");
            setSavePassword topUpCommandEmoney = this.this$0.getTopUpCommandEmoney();
            setGlobalUserData getmin = new getMin(this, function1, hidebackbutton);
            setSavePassword.getMax.getMin getmin2 = setSavePassword.getMax.Companion;
            String str = hidebackbutton.setMax;
            if (str == null) {
                str = "";
            }
            String str2 = hidebackbutton.getMax;
            Map<String, String> map = hidebackbutton.values;
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            topUpCommandEmoney.execute(getmin, getmin2.create(str, "MANDIRI", str2, map));
        }

        public final void callInquiryBalance(@NotNull hideBackButton hidebackbutton, @NotNull Function1<? super hideTitleLoading, Unit> function1) {
            Intrinsics.checkNotNullParameter(hidebackbutton, "emoneyCardAttribute");
            Intrinsics.checkNotNullParameter(function1, "onResult");
            this.this$0.getGetTransIdEmoney().execute(onReceivedIcon.INSTANCE, new C0102setMax(this, hidebackbutton, function1), new setMin(this));
        }

        public final void callReversal(@NotNull hideBackButton hidebackbutton, @NotNull Function1<? super hideTitleLoading, Unit> function1) {
            Intrinsics.checkNotNullParameter(hidebackbutton, "emoneyCardAttribute");
            Intrinsics.checkNotNullParameter(function1, "onResult");
            this.this$0.getGetTransIdEmoney().execute(onReceivedIcon.INSTANCE, new IsOverlapping(this, hidebackbutton, function1), new toIntRange(this));
        }
    }

    /* access modifiers changed from: private */
    public final setMax handleEmoneyCallback() {
        return new setMax(this);
    }

    /* access modifiers changed from: private */
    public final String getExtendInfoByError(Throwable th, String str) {
        if (th instanceof NetworkException) {
            Map<String, String> extendInfo = ((NetworkException) th).getExtendInfo();
            String str2 = extendInfo != null ? extendInfo.get(str) : null;
            return str2 == null ? "" : str2;
        }
    }

    /* access modifiers changed from: private */
    public final void handleBrizziCall(DanaEmoney.Builder builder, getDefaultZoom getdefaultzoom) {
        try {
            builder.setupBrizzi(new WindowBridgeExtension(getdefaultzoom.getAccessToken(), decryptConsumerSecret(getdefaultzoom.getConsumerSecret()), getdefaultzoom.getUsername(), getdefaultzoom.getReffNumber()), new setMin(this));
        } catch (IOException e) {
            updateActionSheetContent.e("[ElectronicMoney]", e.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/danah5/nfcutility/NfcUtilityBridge$handleBrizziCall$1", "Lid/dana/lib/electronicmoney/bri/BrizziCallback;", "needReversal", "", "reversalResult", "Lid/dana/lib/electronicmoney/bri/model/ReversalResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements TabBarBridgeExtension.AnonymousClass2 {
        final /* synthetic */ NfcUtilityBridge this$0;

        setMin(NfcUtilityBridge nfcUtilityBridge) {
            this.this$0 = nfcUtilityBridge;
        }

        public final void needReversal(@NotNull ReversalResult reversalResult) {
            Intrinsics.checkNotNullParameter(reversalResult, "reversalResult");
            this.this$0.tryBrizziManualReversal(reversalResult);
        }
    }

    /* access modifiers changed from: private */
    public final Map<String, String> assembleEmoneyCardAttribute(hideBackButton hidebackbutton) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        String str = this.emoneyTransId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emoneyTransId");
        }
        linkedHashMap.put("transactionId", str);
        linkedHashMap.put("cardAttribute", String.valueOf(hidebackbutton.setMin));
        linkedHashMap.put("lastBalance", hidebackbutton.IsOverlapping);
        linkedHashMap.put("cardInfo", String.valueOf(hidebackbutton.isInside));
        linkedHashMap.put("cardNumber", hidebackbutton.equals);
        linkedHashMap.put("cardUUID", String.valueOf(hidebackbutton.toIntRange));
        linkedHashMap.put("approvalCode", this.approvalCode);
        String str2 = hidebackbutton.toFloatRange;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("dataToSam", str2);
        linkedHashMap.put("amount", this.amount);
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    public final void openBottomsheet(Activity activity) {
        Intent intent = new Intent(activity, BottomSheetActivity.class);
        intent.putExtra("android.nfc.extra.TAG", activity.getIntent().getParcelableExtra("android.nfc.extra.TAG"));
        activity.startActivity(intent);
        activity.getIntent().replaceExtras(new Intent());
        sendSuccessResult();
    }

    private final String decryptConsumerSecret(String str) {
        String length2 = CornerMarkingDataProvider.AnonymousClass1.length();
        if (length2 == null) {
            length2 = "";
        }
        String min = CornerMarkingDataProvider.AnonymousClass1.setMin(str, length2);
        int length3 = min.length();
        if (min != null) {
            String substring = min.substring(16, length3);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* access modifiers changed from: private */
    public final void tryBrizziManualReversal(ReversalResult reversalResult) {
        getLoadWithOverviewMode getloadwithoverviewmode = this.doBrizziManualReversal;
        if (getloadwithoverviewmode == null) {
            Intrinsics.throwUninitializedPropertyAccessException("doBrizziManualReversal");
        }
        getloadwithoverviewmode.execute(access$getDEFAULT_BEHAVIOR$cp.toBrizziReversalInfo(reversalResult), new toFloatRange(this), new IsOverlapping(this));
    }

    public final void onInitialized() {
        super.onInitialized();
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().getMin(this);
                new DanaEmoney.Builder(WindowBridgeExtension.AnonymousClass1.getMax(), (hideOptionMenu) null, (setBarBottomLineColor) null, (WindowBridgeExtension) null, (TabBarBridgeExtension.AnonymousClass2) null, (Long) null, 62, (DefaultConstructorMarker) null).build();
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    private final void checkEvent(Activity activity, JSONObject jSONObject) {
        Object obj = jSONObject.get("type");
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "info[\"type\"] ?: return");
            if (Intrinsics.areEqual((Object) "device", obj)) {
                getNfcEligibility(activity);
            } else {
                sendErrorResult("001");
            }
        }
    }

    private final void getNfcEligibility(Activity activity) {
        NfcAdapter nfcAdapter2 = this.nfcAdapter;
        if (nfcAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nfcAdapter");
        }
        if (nfcAdapter2 != null) {
            checkCardEligibility(activity);
        } else {
            sendErrorResult("002");
        }
    }

    private final void checkCardEligibility(Activity activity) {
        NfcAdapter nfcAdapter2 = this.nfcAdapter;
        if (nfcAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nfcAdapter");
        }
        if (nfcAdapter2.isEnabled()) {
            sendSuccessResult();
            return;
        }
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(activity);
        getmax.toFloatRange = activity.getString(R.string.activate_nfc_title);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = activity.getString(R.string.activate_nfc_message);
        getProgressViewStartOffset.getMax getmax3 = getmax2;
        getmax3.toIntRange = 0;
        getProgressViewStartOffset.getMax max = getmax3.setMax(false).setMin(activity.getString(R.string.permission_setting), new getMin(activity)).getMax(activity.getString(R.string.option_cancel), length.INSTANCE);
        new getProgressViewStartOffset(max.invoke, max.length, max, max.equals, (byte) 0).getMin().show();
        sendErrorResult("003");
    }

    /* access modifiers changed from: private */
    public final void sendErrorResult(String str) {
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        bridgeCallback2.sendJSONResponse(getDEFAULT_BEHAVIOR.getNfcError(str));
    }

    /* access modifiers changed from: private */
    public final void sendSuccessResult() {
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        bridgeCallback2.sendJSONResponse(getDEFAULT_BEHAVIOR.getResultSuccess());
    }

    public final void onFinalized() {
        setSaveFormData setsaveformdata = this.confirmUpdateBalanceEmoney;
        if (setsaveformdata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmUpdateBalanceEmoney");
        }
        setsaveformdata.dispose();
        getTextZoom gettextzoom = this.getEmoneyReversal;
        if (gettextzoom == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getEmoneyReversal");
        }
        gettextzoom.dispose();
        setSavePassword setsavepassword = this.topUpCommandEmoney;
        if (setsavepassword == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topUpCommandEmoney");
        }
        setsavepassword.dispose();
        getSavePassword getsavepassword = this.inquireBalanceEmoney;
        if (getsavepassword == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inquireBalanceEmoney");
        }
        getsavepassword.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/nfcutility/NfcUtilityBridge$Companion;", "", "()V", "CHECK", "", "DEVICE", "WRITE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
