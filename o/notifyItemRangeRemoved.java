package o;

import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.networking.NetworkException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J@\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\rH\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/twilio/verify/api/BaseAPIClient;", "", "dateProvider", "Lcom/twilio/verify/data/DateProvider;", "(Lcom/twilio/verify/data/DateProvider;)V", "syncTime", "", "date", "", "validateException", "exception", "Lcom/twilio/verify/networking/NetworkException;", "retryBlock", "Lkotlin/Function1;", "", "retries", "error", "Lcom/twilio/verify/TwilioVerifyException;", "verify_release"}, k = 1, mv = {1, 1, 16})
public class notifyItemRangeRemoved {
    private final RecyclerView$ItemAnimator$AdapterChanges length;

    public notifyItemRangeRemoved(@NotNull RecyclerView$ItemAnimator$AdapterChanges recyclerView$ItemAnimator$AdapterChanges) {
        Intrinsics.checkParameterIsNotNull(recyclerView$ItemAnimator$AdapterChanges, "dateProvider");
        this.length = recyclerView$ItemAnimator$AdapterChanges;
    }

    /* access modifiers changed from: protected */
    public final void setMax(@NotNull NetworkException networkException, @NotNull Function1<? super Integer, Unit> function1, int i, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        List list;
        String str;
        Intrinsics.checkParameterIsNotNull(networkException, "exception");
        Intrinsics.checkParameterIsNotNull(function1, "retryBlock");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        if (i > 0) {
            stopIgnoringView failureResponse = networkException.getFailureResponse();
            Integer valueOf = failureResponse != null ? Integer.valueOf(failureResponse.getMax) : null;
            if (valueOf != null && valueOf.intValue() == 401) {
                Map<String, List<String>> map = networkException.getFailureResponse().setMax;
                if (map == null || (list = map.get("Date")) == null || (str = (String) CollectionsKt.first(list)) == null) {
                    function12.invoke(new TwilioVerifyException(networkException, TwilioVerifyException.ErrorCode.NetworkError));
                    return;
                }
                this.length.setMax(str);
                function1.invoke(Integer.valueOf(i - 1));
                return;
            }
            function12.invoke(new TwilioVerifyException(networkException, TwilioVerifyException.ErrorCode.NetworkError));
            return;
        }
        function12.invoke(new TwilioVerifyException(networkException, TwilioVerifyException.ErrorCode.NetworkError));
    }
}
