package o;

import com.twilio.verify.TwilioVerifyException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\tH&JT\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\tH&J@\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\tH&¨\u0006\u0017"}, d2 = {"Lcom/twilio/verify/domain/challenge/ChallengeProvider;", "", "get", "", "sid", "", "factor", "Lcom/twilio/verify/models/Factor;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Challenge;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "getAll", "status", "Lcom/twilio/verify/models/ChallengeStatus;", "pageSize", "", "pageToken", "Lcom/twilio/verify/models/ChallengeList;", "update", "challenge", "authPayload", "verify_release"}, k = 1, mv = {1, 1, 16})
public interface isItemPrefetchEnabled {
    void getMax(@NotNull detachAndScrapViewAt detachandscrapviewat, @NotNull String str, @NotNull Function1<? super detachAndScrapViewAt, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);

    void getMin(@NotNull String str, @NotNull getHeight getheight, @NotNull Function1<? super detachAndScrapViewAt, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);
}
