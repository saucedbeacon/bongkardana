package id.dana.danah5.showagreement;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.di.modules.GContainerModule;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import id.dana.miniprogram.tnc.MissingRequiredUserInfoDialogActivity;
import id.dana.miniprogram.tnc.TncServiceDialogActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BLEManager;
import o.BLEOperation;
import o.IRedDotManager;
import o.PrepareException;
import o.RangeNotifier;
import o.RedDotManager;
import o.WindowBridgeExtension;
import o.access$1002;
import o.getStackButtons$core;
import o.saveSnapshot;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 72\u00020\u0001:\u000267B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0007J \u00100\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\u0012\u00105\u001a\u00020+2\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020!X\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lid/dana/danah5/showagreement/ShowAgreementBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "getBridgeCallback", "()Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "setBridgeCallback", "(Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "consultAgreement", "Lid/dana/domain/useragreement/interactor/ConsultAgreement;", "getConsultAgreement", "()Lid/dana/domain/useragreement/interactor/ConsultAgreement;", "setConsultAgreement", "(Lid/dana/domain/useragreement/interactor/ConsultAgreement;)V", "context", "Landroid/content/Context;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getEmptyUserInfo", "Lid/dana/domain/user/interactor/GetEmptyUserInfo;", "getGetEmptyUserInfo", "()Lid/dana/domain/user/interactor/GetEmptyUserInfo;", "setGetEmptyUserInfo", "(Lid/dana/domain/user/interactor/GetEmptyUserInfo;)V", "getService", "Lid/dana/domain/services/interactor/GetService;", "getGetService", "()Lid/dana/domain/services/interactor/GetService;", "setGetService", "(Lid/dana/domain/services/interactor/GetService;)V", "mapAgreementKey", "", "", "mapContentValue", "recordAgreement", "Lid/dana/domain/useragreement/interactor/RecordAgreement;", "getRecordAgreement", "()Lid/dana/domain/useragreement/interactor/RecordAgreement;", "setRecordAgreement", "(Lid/dana/domain/useragreement/interactor/RecordAgreement;)V", "serviceKey", "onFinalized", "", "onInitialized", "onReceiveAgreementMessageEvent", "event", "Lid/dana/danah5/showagreement/ShowAgreementBridge$AgreementMessageEvent;", "onSuccessConsultAgreement", "consultAgreementResponse", "Lid/dana/domain/useragreement/model/ConsultAgreementResponse;", "entity", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "showAgreement", "AgreementMessageEvent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ShowAgreementBridge extends BaseBridge {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String GENERAL_ERROR = "001";
    private static final String USER_CANCEL = "003";
    private static final String USER_DENY = "002";
    public BridgeCallback bridgeCallback;
    @Inject
    public BLEManager.AnonymousClass2.C00022 consultAgreement;
    /* access modifiers changed from: private */
    public Context context = WindowBridgeExtension.AnonymousClass1.getMax();
    private IRedDotManager disposables;
    @Inject
    public access$1002 getEmptyUserInfo;
    @Inject
    public RangeNotifier getService;
    /* access modifiers changed from: private */
    public List<String> mapAgreementKey = new ArrayList();
    /* access modifiers changed from: private */
    public List<String> mapContentValue = new ArrayList();
    @Inject
    public BLEManager.AnonymousClass2.AnonymousClass3 recordAgreement;
    /* access modifiers changed from: private */
    public String serviceKey = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "entity", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<ThirdPartyServiceResponse, Unit> {
        final /* synthetic */ BridgeCallback $bridgeCallback;
        final /* synthetic */ ShowAgreementBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(ShowAgreementBridge showAgreementBridge, BridgeCallback bridgeCallback) {
            super(1);
            this.this$0 = showAgreementBridge;
            this.$bridgeCallback = bridgeCallback;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/useragreement/model/ConsultAgreementResponse;", "invoke", "id/dana/danah5/showagreement/ShowAgreementBridge$showAgreement$1$1$1"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<BLEOperation, Unit> {
            final /* synthetic */ ThirdPartyServiceResponse $entity$inlined;
            final /* synthetic */ IsOverlapping this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(IsOverlapping isOverlapping, ThirdPartyServiceResponse thirdPartyServiceResponse) {
                super(1);
                this.this$0 = isOverlapping;
                this.$entity$inlined = thirdPartyServiceResponse;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BLEOperation) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull BLEOperation bLEOperation) {
                Intrinsics.checkNotNullParameter(bLEOperation, "it");
                this.this$0.this$0.onSuccessConsultAgreement(this.this$0.$bridgeCallback, bLEOperation, this.$entity$inlined);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "id/dana/danah5/showagreement/ShowAgreementBridge$showAgreement$1$1$2"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ ThirdPartyServiceResponse $entity$inlined;
            final /* synthetic */ IsOverlapping this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(IsOverlapping isOverlapping, ThirdPartyServiceResponse thirdPartyServiceResponse) {
                super(1);
                this.this$0 = isOverlapping;
                this.$entity$inlined = thirdPartyServiceResponse;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                Toast.makeText(this.this$0.this$0.context, this.this$0.this$0.context.getText(R.string.home_error), 0).show();
                BridgeCallback bridgeCallback = this.this$0.$bridgeCallback;
                JSONObject jSONObject = new JSONObject();
                Map map = jSONObject;
                map.put("success", Boolean.FALSE);
                map.put("error", "001");
                Unit unit = Unit.INSTANCE;
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ThirdPartyServiceResponse) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ThirdPartyServiceResponse thirdPartyServiceResponse) {
            List<String> spaceCodes;
            Intrinsics.checkNotNullParameter(thirdPartyServiceResponse, "entity");
            if (thirdPartyServiceResponse.getNeedConsult() && (spaceCodes = thirdPartyServiceResponse.getSpaceCodes()) != null) {
                this.this$0.getConsultAgreement().execute(new BLEManager.AnonymousClass2.C00022.getMin(spaceCodes), new getMax(this, thirdPartyServiceResponse), new length(this, thirdPartyServiceResponse));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ BridgeCallback $bridgeCallback;
        final /* synthetic */ ShowAgreementBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(ShowAgreementBridge showAgreementBridge, BridgeCallback bridgeCallback) {
            super(1);
            this.this$0 = showAgreementBridge;
            this.$bridgeCallback = bridgeCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            Toast.makeText(this.this$0.context, this.this$0.context.getText(R.string.home_error), 0).show();
            BridgeCallback bridgeCallback = this.$bridgeCallback;
            JSONObject jSONObject = new JSONObject();
            Map map = jSONObject;
            map.put("success", Boolean.FALSE);
            map.put("error", "001");
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "id/dana/danah5/showagreement/ShowAgreementBridge$onReceiveAgreementMessageEvent$1$2"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ length $event$inlined;
        final /* synthetic */ ShowAgreementBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(ShowAgreementBridge showAgreementBridge, length length) {
            super(1);
            this.this$0 = showAgreementBridge;
            this.$event$inlined = length;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            Toast.makeText(this.this$0.context, this.this$0.context.getText(R.string.home_error), 0).show();
            BridgeCallback bridgeCallback = this.this$0.getBridgeCallback();
            JSONObject jSONObject = new JSONObject();
            Map map = jSONObject;
            map.put("success", Boolean.FALSE);
            map.put("error", "001");
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<List<? extends String>, Unit> {
        final /* synthetic */ BLEOperation $consultAgreementResponse;
        final /* synthetic */ ThirdPartyServiceResponse $entity;
        final /* synthetic */ ShowAgreementBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(ShowAgreementBridge showAgreementBridge, BLEOperation bLEOperation, ThirdPartyServiceResponse thirdPartyServiceResponse) {
            super(1);
            this.this$0 = showAgreementBridge;
            this.$consultAgreementResponse = bLEOperation;
            this.$entity = thirdPartyServiceResponse;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<String>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<String> list) {
            List<String> list2 = list;
            Intrinsics.checkNotNullParameter(list2, "response");
            String str = "";
            if (list.isEmpty()) {
                Application applicationContext = GriverEnv.getApplicationContext();
                List<BLEManager.ScanHandler> agreementInfos = this.$consultAgreementResponse.getAgreementInfos();
                if (agreementInfos != null) {
                    Iterable<BLEManager.ScanHandler> iterable = agreementInfos;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (BLEManager.ScanHandler scanHandler : iterable) {
                        List access$getMapAgreementKey$p = this.this$0.mapAgreementKey;
                        String agreementKey = scanHandler.getAgreementKey();
                        if (agreementKey == null) {
                            agreementKey = str;
                        }
                        access$getMapAgreementKey$p.add(agreementKey);
                        List access$getMapContentValue$p = this.this$0.mapContentValue;
                        String contentValue = scanHandler.getContentValue();
                        if (contentValue == null) {
                            contentValue = str;
                        }
                        arrayList.add(Boolean.valueOf(access$getMapContentValue$p.add(contentValue)));
                    }
                }
                String scopes = this.$entity.getScopes();
                String icon = this.$entity.getIcon();
                String str2 = icon == null ? str : icon;
                String name = this.$entity.getName();
                Intent putExtra = new Intent(applicationContext, TncServiceDialogActivity.class).addFlags(268435456).putExtra("startParams", new TncServiceDialogActivity.StartParams(scopes, str2, name == null ? str : name, CollectionsKt.joinToString$default(this.this$0.mapAgreementKey, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null), CollectionsKt.joinToString$default(this.this$0.mapContentValue, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null), false, false, 96));
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, TncServi…TRA_START_PARAMS, params)");
                applicationContext.startActivity(putExtra);
                return;
            }
            Application applicationContext2 = GriverEnv.getApplicationContext();
            String name2 = this.$entity.getName();
            if (name2 != null) {
                str = name2;
            }
            Intent putExtra2 = new Intent(applicationContext2, MissingRequiredUserInfoDialogActivity.class).addFlags(268435456).putExtra("startParams", new MissingRequiredUserInfoDialogActivity.StartParams(str, this.$entity.getIcon(), list2));
            Intrinsics.checkNotNullExpressionValue(putExtra2, "Intent(context, MissingR…TRA_START_PARAMS, params)");
            applicationContext2.startActivity(putExtra2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Boolean, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
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
    static final class toFloatRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ BridgeCallback $bridgeCallback;
        final /* synthetic */ ShowAgreementBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(ShowAgreementBridge showAgreementBridge, BridgeCallback bridgeCallback) {
            super(1);
            this.this$0 = showAgreementBridge;
            this.$bridgeCallback = bridgeCallback;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            Toast.makeText(this.this$0.context, this.this$0.context.getText(R.string.home_error), 0).show();
            BridgeCallback bridgeCallback = this.$bridgeCallback;
            JSONObject jSONObject = new JSONObject();
            Map map = jSONObject;
            map.put("success", Boolean.FALSE);
            map.put("error", "001");
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @NotNull
    public final RangeNotifier getGetService() {
        RangeNotifier rangeNotifier = this.getService;
        if (rangeNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getService");
        }
        return rangeNotifier;
    }

    public final void setGetService(@NotNull RangeNotifier rangeNotifier) {
        Intrinsics.checkNotNullParameter(rangeNotifier, "<set-?>");
        this.getService = rangeNotifier;
    }

    @NotNull
    public final BLEManager.AnonymousClass2.C00022 getConsultAgreement() {
        BLEManager.AnonymousClass2.C00022 r0 = this.consultAgreement;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consultAgreement");
        }
        return r0;
    }

    public final void setConsultAgreement(@NotNull BLEManager.AnonymousClass2.C00022 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.consultAgreement = r2;
    }

    @NotNull
    public final BLEManager.AnonymousClass2.AnonymousClass3 getRecordAgreement() {
        BLEManager.AnonymousClass2.AnonymousClass3 r0 = this.recordAgreement;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordAgreement");
        }
        return r0;
    }

    public final void setRecordAgreement(@NotNull BLEManager.AnonymousClass2.AnonymousClass3 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.recordAgreement = r2;
    }

    @NotNull
    public final access$1002 getGetEmptyUserInfo() {
        access$1002 access_1002 = this.getEmptyUserInfo;
        if (access_1002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getEmptyUserInfo");
        }
        return access_1002;
    }

    public final void setGetEmptyUserInfo(@NotNull access$1002 access_1002) {
        Intrinsics.checkNotNullParameter(access_1002, "<set-?>");
        this.getEmptyUserInfo = access_1002;
    }

    @NotNull
    public final BridgeCallback getBridgeCallback() {
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        return bridgeCallback2;
    }

    public final void setBridgeCallback(@NotNull BridgeCallback bridgeCallback2) {
        Intrinsics.checkNotNullParameter(bridgeCallback2, "<set-?>");
        this.bridgeCallback = bridgeCallback2;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void showAgreement(@NotNull @BindingCallback BridgeCallback bridgeCallback2) {
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        this.bridgeCallback = bridgeCallback2;
        RangeNotifier rangeNotifier = this.getService;
        if (rangeNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getService");
        }
        rangeNotifier.execute(this.serviceKey, new IsOverlapping(this, bridgeCallback2), new toFloatRange(this, bridgeCallback2));
    }

    /* access modifiers changed from: private */
    public final void onSuccessConsultAgreement(BridgeCallback bridgeCallback2, BLEOperation bLEOperation, ThirdPartyServiceResponse thirdPartyServiceResponse) {
        if (bLEOperation.getNeedUserAgreement()) {
            access$1002 access_1002 = this.getEmptyUserInfo;
            if (access_1002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("getEmptyUserInfo");
            }
            access_1002.execute(new access$1002.setMax(thirdPartyServiceResponse.getScopes(), thirdPartyServiceResponse.getClientId()), new isInside(this, bLEOperation, thirdPartyServiceResponse), new equals(this, bridgeCallback2));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        bridgeCallback2.sendJSONResponse(jSONObject);
    }

    @Subscribe
    public final void onReceiveAgreementMessageEvent(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "event");
        if (length2.getAgree()) {
            Iterable<String> iterable = this.mapAgreementKey;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (String str : iterable) {
                BLEManager.AnonymousClass2.AnonymousClass3 r5 = this.recordAgreement;
                if (r5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recordAgreement");
                }
                r5.execute(new BLEManager.AnonymousClass2.AnonymousClass3.setMin(str, length2.getAgree()), setMin.INSTANCE, new getMin(this, length2));
                arrayList.add(Unit.INSTANCE);
            }
            BridgeCallback bridgeCallback2 = this.bridgeCallback;
            if (bridgeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            bridgeCallback2.sendJSONResponse(jSONObject);
            return;
        }
        BridgeCallback bridgeCallback3 = this.bridgeCallback;
        if (bridgeCallback3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        JSONObject jSONObject2 = new JSONObject();
        Map map = jSONObject2;
        map.put("success", Boolean.FALSE);
        map.put("error", length2.getErrorCode());
        Unit unit2 = Unit.INSTANCE;
        bridgeCallback3.sendJSONResponse(jSONObject2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lid/dana/danah5/showagreement/ShowAgreementBridge$AgreementMessageEvent;", "", "agree", "", "errorCode", "", "(ZLjava/lang/String;)V", "getAgree", "()Z", "getErrorCode", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private final boolean agree;
        @Nullable
        private final String errorCode;

        public length(boolean z, @Nullable String str) {
            this.agree = z;
            this.errorCode = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ length(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? "002" : str);
        }

        public final boolean getAgree() {
            return this.agree;
        }

        @Nullable
        public final String getErrorCode() {
            return this.errorCode;
        }
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
                getmax.getMin().length(this);
                if (this.disposables == null) {
                    this.disposables = new IRedDotManager();
                }
                IRedDotManager iRedDotManager = this.disposables;
                if (iRedDotManager != null) {
                    iRedDotManager.getMin(getStackButtons$core.serviceKey().subscribe(new getMax(this)));
                    return;
                }
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements RedDotManager<String> {
        final /* synthetic */ ShowAgreementBridge this$0;

        getMax(ShowAgreementBridge showAgreementBridge) {
            this.this$0 = showAgreementBridge;
        }

        public final void accept(String str) {
            ShowAgreementBridge showAgreementBridge = this.this$0;
            Intrinsics.checkNotNullExpressionValue(str, "it");
            showAgreementBridge.serviceKey = str;
        }
    }

    public final void onFinalized() {
        super.onFinalized();
        IRedDotManager iRedDotManager = this.disposables;
        if (iRedDotManager != null && iRedDotManager != null && !iRedDotManager.isDisposed()) {
            IRedDotManager iRedDotManager2 = this.disposables;
            if (iRedDotManager2 != null) {
                iRedDotManager2.dispose();
            }
            this.disposables = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/showagreement/ShowAgreementBridge$Companion;", "", "()V", "GENERAL_ERROR", "", "USER_CANCEL", "USER_DENY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
