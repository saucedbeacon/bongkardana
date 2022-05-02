package o;

import com.twilio.verify.models.FactorStatus;
import com.twilio.verify.models.FactorType;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0018\u0010\u0012\u001a\u00020\u0013X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/twilio/verify/models/Factor;", "", "accountSid", "", "getAccountSid", "()Ljava/lang/String;", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "friendlyName", "getFriendlyName", "identity", "getIdentity", "serviceSid", "getServiceSid", "sid", "getSid", "status", "Lcom/twilio/verify/models/FactorStatus;", "getStatus", "()Lcom/twilio/verify/models/FactorStatus;", "setStatus", "(Lcom/twilio/verify/models/FactorStatus;)V", "type", "Lcom/twilio/verify/models/FactorType;", "getType", "()Lcom/twilio/verify/models/FactorType;", "verify_release"}, k = 1, mv = {1, 1, 16})
public interface getHeight {
    @NotNull
    String IsOverlapping();

    @NotNull
    Date equals();

    @NotNull
    FactorType getMax();

    @NotNull
    String getMin();

    @NotNull
    String length();

    @NotNull
    String setMax();

    void setMax(@NotNull FactorStatus factorStatus);

    @NotNull
    String setMin();

    @NotNull
    FactorStatus toIntRange();
}
