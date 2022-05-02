package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J@\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/twilio/verify/domain/service/ServiceRepository;", "Lcom/twilio/verify/domain/service/ServiceProvider;", "apiClient", "Lcom/twilio/verify/api/ServiceAPIClient;", "serviceMapper", "Lcom/twilio/verify/domain/service/ServiceMapper;", "(Lcom/twilio/verify/api/ServiceAPIClient;Lcom/twilio/verify/domain/service/ServiceMapper;)V", "get", "", "serviceSid", "", "factor", "Lcom/twilio/verify/models/Factor;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Service;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getChildCount implements removeAndRecycleViewAt {
    private final detachAndScrapView getMax;
    private final onItemRangeChanged length;

    private getChildCount(@NotNull onItemRangeChanged onitemrangechanged, @NotNull detachAndScrapView detachandscrapview) {
        Intrinsics.checkParameterIsNotNull(onitemrangechanged, "apiClient");
        Intrinsics.checkParameterIsNotNull(detachandscrapview, "serviceMapper");
        this.length = onitemrangechanged;
        this.getMax = detachandscrapview;
    }

    public /* synthetic */ getChildCount(onItemRangeChanged onitemrangechanged) {
        this(onitemrangechanged, new detachAndScrapView());
    }
}
