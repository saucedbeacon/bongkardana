package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/data/login/source/network/result/LoginRpcResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "()V", "clientKey", "", "evUrlStatusResult", "Lid/dana/data/login/source/network/model/EvUrlStatusResult;", "getEvUrlStatusResult", "()Lid/dana/data/login/source/network/model/EvUrlStatusResult;", "setEvUrlStatusResult", "(Lid/dana/data/login/source/network/model/EvUrlStatusResult;)V", "failedCount", "", "key", "leftTimes", "lockedExpireSeconds", "maxFailedCount", "pin", "securityId", "sessionId", "userId", "userInfo", "Lid/dana/data/login/source/network/model/RpcUserInfo;", "userInfoCompleted", "", "verificationMethods", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$69$1 extends BaseRpcResult {
    @Nullable
    @JvmField
    public String clientKey;
    @Nullable
    private com_alibaba_ariver_app_api_ExtOpt$63$1 evUrlStatusResult;
    @JvmField
    public int failedCount;
    @Nullable
    @JvmField
    public String key;
    @JvmField
    public int leftTimes;
    @JvmField
    public int lockedExpireSeconds;
    @JvmField
    public int maxFailedCount;
    @Nullable
    @JvmField
    public String pin;
    @Nullable
    @JvmField
    public String securityId;
    @Nullable
    @JvmField
    public String sessionId;
    @Nullable
    @JvmField
    public String userId;
    @Nullable
    @JvmField
    public com_alibaba_ariver_app_api_ExtOpt$61$1 userInfo;
    @JvmField
    public boolean userInfoCompleted;
    @Nullable
    @JvmField
    public List<String> verificationMethods;

    @Nullable
    public final com_alibaba_ariver_app_api_ExtOpt$63$1 getEvUrlStatusResult() {
        return this.evUrlStatusResult;
    }

    public final void setEvUrlStatusResult(@Nullable com_alibaba_ariver_app_api_ExtOpt$63$1 com_alibaba_ariver_app_api_extopt_63_1) {
        this.evUrlStatusResult = com_alibaba_ariver_app_api_extopt_63_1;
    }
}
