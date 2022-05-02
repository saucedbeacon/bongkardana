package o;

import com.twilio.verify.TwilioVerifyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J8\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH&J2\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\tH&J8\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\bH&J@\u0010\u0018\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\u001a"}, d2 = {"Lcom/twilio/verify/domain/factor/FactorProvider;", "", "clearLocalStorage", "", "create", "createFactorPayload", "Lcom/twilio/verify/domain/factor/models/CreateFactorPayload;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Factor;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "delete", "factor", "Lkotlin/Function0;", "get", "sid", "", "getAll", "", "save", "update", "updateFactorPayload", "Lcom/twilio/verify/domain/factor/models/UpdateFactorPayload;", "verify", "payload", "verify_release"}, k = 1, mv = {1, 1, 16})
public interface removeAllViews {
    @Nullable
    getHeight getMax(@NotNull String str);

    void getMax(@NotNull attachView attachview, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);

    void getMax(@NotNull getHeight getheight, @NotNull String str, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);

    void getMin();

    void getMin(@NotNull getHeight getheight);

    void setMax(@NotNull detachViewInternal detachviewinternal, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);

    @NotNull
    List<getHeight> setMin();

    @Nullable
    getHeight setMin(@NotNull getHeight getheight);
}
