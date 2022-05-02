package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import o.b;

public class EventLog extends BaseRpcResult {
    public String action;
    public boolean campaignEnabled;
    public int expirySeconds = 0;
    public String localPhoneNumber;
    public List<BaseAppLog> loginAuthenticationOptions;
    public String otpChannel;
    public int otpCodeLength = 0;
    public registerWorker prizeAmount;
    public String prizeName;
    public int retrySendSeconds = 0;
    public String securityId;
    public String userName;

    public final class Builder implements getAdapterPosition<setHeaderString> {
        private final b.C0007b<Context> contextProvider;
        private final b.C0007b<onRelease> rdsTrackerProvider;
        private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
        private final b.C0007b<onAppResume> securityFacadeProvider;
        private final b.C0007b<appxLoadFailed> threadExecutorProvider;

        public Builder(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<onRelease> bVar5) {
            this.rpcConnectorProvider = bVar;
            this.threadExecutorProvider = bVar2;
            this.securityFacadeProvider = bVar3;
            this.contextProvider = bVar4;
            this.rdsTrackerProvider = bVar5;
        }

        public final setHeaderString get() {
            return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get(), this.rdsTrackerProvider.get());
        }

        public static Builder create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<onRelease> bVar5) {
            return new Builder(bVar, bVar2, bVar3, bVar4, bVar5);
        }

        public static setHeaderString newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, onRelease onrelease) {
            return new setHeaderString(setisurgentresource, appxloadfailed, onappresume, context, onrelease);
        }
    }
}
