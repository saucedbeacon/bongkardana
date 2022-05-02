package o;

import android.content.Context;
import id.dana.data.network.ResultResponse;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RemoteCallResult;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0014R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/data/recentrecipient/source/network/NetworkBankCardConversionEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/recentrecipient/source/network/ConvertCardIndexNoSecureApi;", "Lid/dana/data/recentrecipient/source/BankCardConversionEntityData;", "appContext", "Landroid/content/Context;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "bankCardConversionMapper", "Lid/dana/data/recentrecipient/mapper/BankCardConversionMapper;", "convertCardIndexNoSecureApi", "(Landroid/content/Context;Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Lid/dana/data/recentrecipient/mapper/BankCardConversionMapper;Lid/dana/data/recentrecipient/source/network/ConvertCardIndexNoSecureApi;)V", "convertCardIndexNo", "Lio/reactivex/Observable;", "Lid/dana/data/recentrecipient/model/BankCardConversionResult;", "recentRecipient", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "publicKey", "", "encryptCardEnabled", "", "getFacadeClass", "Ljava/lang/Class;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class toMap extends setRepeatCount<setAttrData> implements getAttrData {
    private final ValueStore bankCardConversionMapper;
    private final setAttrData convertCardIndexNoSecureApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/recentrecipient/model/BankCardConversionResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/network/ResultResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<ResultResponse<RemoteCallResult.AnonymousClass1>, RemoteCallResult.AnonymousClass1> {
        public static final setMin getMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ResultResponse resultResponse = (ResultResponse) obj;
            Intrinsics.checkNotNullParameter(resultResponse, "it");
            return (RemoteCallResult.AnonymousClass1) resultResponse.getResult();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public toMap(@NotNull Context context, @NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull ValueStore valueStore, @NotNull setAttrData setattrdata) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(valueStore, "bankCardConversionMapper");
        Intrinsics.checkNotNullParameter(setattrdata, "convertCardIndexNoSecureApi");
        this.bankCardConversionMapper = valueStore;
        this.convertCardIndexNoSecureApi = setattrdata;
    }

    @NotNull
    public final Class<setAttrData> getFacadeClass() {
        return setAttrData.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RemoteCallResult.AnonymousClass1> convertCardIndexNo(@NotNull getMonitorToken getmonitortoken, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(getmonitortoken, "recentRecipient");
        Intrinsics.checkNotNullParameter(str, "publicKey");
        isError transform = this.bankCardConversionMapper.transform(getmonitortoken, str, z);
        transform.envInfo = generateMobileEnvInfo();
        useMultiplexLink ctokenWithoutKey = getAlign.getCtokenWithoutKey();
        Intrinsics.checkNotNullExpressionValue(ctokenWithoutKey, "CookieUtil.getCtokenWithoutKey()");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.convertCardIndexNoSecureApi.convertCardIndexNo(ctokenWithoutKey.toString(), transform).map(setMin.getMin).flatMap(new removeAllUpdateListeners());
        ctokenWithoutKey.clear();
        Intrinsics.checkNotNullExpressionValue(flatMap, "result");
        return flatMap;
    }
}
