package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.ExtensionPoint;
import o.SimpleSortable;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ3\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0014J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010$\u001a\u00020%H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\u0006\u0010'\u001a\u00020(H\u0016J*\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000e2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u00112\u0006\u0010-\u001a\u00020.H\u0016¨\u0006/"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/NetworkQrBarcodeEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/qrbarcode/repository/source/network/QrFacade;", "Lid/dana/data/qrbarcode/repository/source/QrBarcodeEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "decode", "Lio/reactivex/Observable;", "Lid/dana/data/qrbarcode/repository/source/network/result/DecodedQrResult;", "scanResult", "", "scene", "timeout", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lio/reactivex/Observable;", "getFacadeClass", "Ljava/lang/Class;", "requestSplitBillCode", "Lid/dana/data/qrbarcode/repository/source/network/result/SplitBillQrResult;", "payers", "", "Lid/dana/data/qrbarcode/repository/source/network/request/SplitBillPayerEntity;", "comment", "requestTransferBankCode", "Lid/dana/data/qrbarcode/repository/source/network/result/UserBankQrResult;", "transferBankGenerateQrEntity", "Lid/dana/data/qrbarcode/repository/source/network/request/TransferBankGenerateQrEntity;", "requestTransferCode", "Lid/dana/data/qrbarcode/repository/source/network/result/GenerateQrResult;", "transferGenerateQrRequest", "Lid/dana/data/qrbarcode/repository/source/network/request/TransferGenerateQrRequest;", "userBankCode", "userBankGenerateQrEntity", "Lid/dana/data/qrbarcode/repository/source/network/request/UserBankGenerateQrEntity;", "userCode", "qris", "", "qrisBizType", "qrCount", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class when extends setRepeatCount<getExtensionCache> implements setupMethodInvokeOptimizerForBridge {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/qrbarcode/repository/source/network/result/SplitBillQrResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/qrbarcode/repository/source/network/QrFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<getExtensionCache, BridgeDSL> {
        final /* synthetic */ when length;
        final /* synthetic */ String setMax;
        final /* synthetic */ List setMin;

        getMax(when when, List list, String str) {
            this.length = when;
            this.setMin = list;
            this.setMax = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            ExtensionPoint.AnonymousClass1 r0 = new Serializable() {
                public String comment;
                public List<AnonymousClass2> splitBillPayers;
            };
            r0.envInfo = this.length.generateMobileEnvInfo();
            r0.splitBillPayers = this.setMin;
            r0.comment = this.setMax;
            Unit unit = Unit.INSTANCE;
            return ((getExtensionCache) obj).getSplitBillQr(r0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/qrbarcode/repository/source/network/result/UserBankQrResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/qrbarcode/repository/source/network/QrFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<getExtensionCache, description> {
        final /* synthetic */ SimpleSortable getMin;
        final /* synthetic */ when setMax;

        getMin(when when, SimpleSortable simpleSortable) {
            this.setMax = when;
            this.getMin = simpleSortable;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            priority priority = new priority(this.getMin);
            priority.envInfo = this.setMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((getExtensionCache) obj).getUserBankQr(priority);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/qrbarcode/repository/source/network/result/GenerateQrResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/qrbarcode/repository/source/network/QrFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class length<F, S> implements addAnimatorUpdateListener.getMax<getExtensionCache, ActionMeta> {
        final /* synthetic */ ExtensionPoint.ProxyGenerator getMax;
        final /* synthetic */ when setMin;

        length(when when, ExtensionPoint.ProxyGenerator proxyGenerator) {
            this.setMin = when;
            this.getMax = proxyGenerator;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            ExtensionPoint.ProxyGenerator proxyGenerator = this.getMax;
            proxyGenerator.envInfo = this.setMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((getExtensionCache) obj).getTransferQr(proxyGenerator);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/qrbarcode/repository/source/network/result/UserBankQrResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/qrbarcode/repository/source/network/QrFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMax<F, S> implements addAnimatorUpdateListener.getMax<getExtensionCache, description> {
        final /* synthetic */ when getMin;
        final /* synthetic */ ExtensionType length;

        setMax(when when, ExtensionType extensionType) {
            this.getMin = when;
            this.length = extensionType;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            SimpleSortable.Priority priority = new SimpleSortable.Priority(this.length);
            priority.envInfo = this.getMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((getExtensionCache) obj).getTransferBankQr(priority);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/qrbarcode/repository/source/network/result/DecodedQrResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/qrbarcode/repository/source/network/QrFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMin<F, S> implements addAnimatorUpdateListener.getMax<getExtensionCache, toJSONString> {
        final /* synthetic */ String length;
        final /* synthetic */ when setMax;
        final /* synthetic */ String setMin;

        setMin(when when, String str, String str2) {
            this.setMax = when;
            this.setMin = str;
            this.length = str2;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            getExtensionCache getextensioncache = (getExtensionCache) obj;
            Intrinsics.checkNotNullParameter(getextensioncache, "facade");
            clearProxyGenerator clearproxygenerator = new clearProxyGenerator();
            clearproxygenerator.envInfo = this.setMax.generateMobileEnvInfo();
            clearproxygenerator.qrCode = this.setMin;
            String str = this.length;
            if (str == null) {
                str = "";
            }
            clearproxygenerator.scene = str;
            Unit unit = Unit.INSTANCE;
            return getextensioncache.decode(clearproxygenerator);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/qrbarcode/repository/source/network/result/GenerateQrResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/qrbarcode/repository/source/network/QrFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<F, S> implements addAnimatorUpdateListener.getMax<getExtensionCache, ActionMeta> {
        final /* synthetic */ when getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ boolean setMax;
        final /* synthetic */ int setMin;

        toFloatRange(when when, boolean z, String str, int i) {
            this.getMax = when;
            this.setMax = z;
            this.getMin = str;
            this.setMin = i;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            BridgeExtension bridgeExtension = new BridgeExtension(this.setMax, this.getMin, Integer.valueOf(this.setMin));
            bridgeExtension.envInfo = this.getMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((getExtensionCache) obj).getUserQr(bridgeExtension);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public when(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<getExtensionCache> getFacadeClass() {
        return getExtensionCache.class;
    }

    @Nullable
    public final TitleBarRightButtonView.AnonymousClass1<toJSONString> decode(@Nullable String str, @Nullable String str2, @Nullable Long l) {
        TitleBarRightButtonView.AnonymousClass1 wrapper = wrapper(new setMin(this, str, str2), new invalidateExtensionCache());
        if (l != null) {
            return wrapper.timeout(l.longValue(), TimeUnit.SECONDS);
        }
        return null;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<description> userBankCode(@NotNull SimpleSortable simpleSortable) {
        Intrinsics.checkNotNullParameter(simpleSortable, "userBankGenerateQrEntity");
        TitleBarRightButtonView.AnonymousClass1<description> wrapper = wrapper(new getMin(this, simpleSortable));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.get…nvInfo()\n        })\n    }");
        return wrapper;
    }

    @Nullable
    public final TitleBarRightButtonView.AnonymousClass1<ActionMeta> userCode(boolean z, @Nullable String str, int i) {
        return wrapper(new toFloatRange(this, z, str, i));
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<ActionMeta> requestTransferCode(@NotNull ExtensionPoint.ProxyGenerator proxyGenerator) {
        Intrinsics.checkNotNullParameter(proxyGenerator, "transferGenerateQrRequest");
        TitleBarRightButtonView.AnonymousClass1<ActionMeta> wrapper = wrapper(new length(this, proxyGenerator));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            it…\n            })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<description> requestTransferBankCode(@NotNull ExtensionType extensionType) {
        Intrinsics.checkNotNullParameter(extensionType, "transferBankGenerateQrEntity");
        TitleBarRightButtonView.AnonymousClass1<description> wrapper = wrapper(new setMax(this, extensionType));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.get…nvInfo()\n        })\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BridgeDSL> requestSplitBillCode(@NotNull List<? extends ExtensionPoint.AnonymousClass2> list, @NotNull String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1758051249, oncanceled);
            onCancelLoad.getMin(1758051249, oncanceled);
        }
        Intrinsics.checkNotNullParameter(list, "payers");
        Intrinsics.checkNotNullParameter(str, "comment");
        TitleBarRightButtonView.AnonymousClass1<BridgeDSL> wrapper = wrapper(new getMax(this, list, str));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.get… comment\n        })\n    }");
        return wrapper;
    }
}
