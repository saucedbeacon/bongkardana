package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.twilio.verify.TwilioVerifyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001#J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J8\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nH&J2\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nH&J8\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nH&J6\u0010\u0015\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nH&J@\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nH&J2\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nH&J8\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nH&J8\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nH&¨\u0006$"}, d2 = {"Lcom/twilio/verify/TwilioVerify;", "", "clearLocalStorage", "", "then", "Lkotlin/Function0;", "createFactor", "factorPayload", "Lcom/twilio/verify/models/FactorPayload;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Factor;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "deleteFactor", "factorSid", "", "getAllChallenges", "challengeListPayload", "Lcom/twilio/verify/models/ChallengeListPayload;", "Lcom/twilio/verify/models/ChallengeList;", "getAllFactors", "", "getChallenge", "challengeSid", "Lcom/twilio/verify/models/Challenge;", "updateChallenge", "updateChallengePayload", "Lcom/twilio/verify/models/UpdateChallengePayload;", "updateFactor", "updateFactorPayload", "Lcom/twilio/verify/models/UpdateFactorPayload;", "verifyFactor", "verifyFactorPayload", "Lcom/twilio/verify/models/VerifyFactorPayload;", "Builder", "verify_release"}, k = 1, mv = {1, 1, 16})
public interface RecyclerView$Adapter$StateRestorationPolicy {
    void getMax(@NotNull Function0<Unit> function0);

    void length(@NotNull Function1<? super List<? extends getHeight>, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);

    void length(@NotNull getChildAt getchildat, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);

    void setMax(@NotNull String str, @NotNull String str2, @NotNull Function1<? super detachAndScrapViewAt, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);

    void setMax(@NotNull getWidth getwidth, @NotNull Function0<Unit> function0, @NotNull Function1<? super TwilioVerifyException, Unit> function1);

    void setMin(@NotNull getPaddingLeft getpaddingleft, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);

    void setMin(@NotNull getPaddingTop getpaddingtop, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/twilio/verify/TwilioVerify$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "authentication", "Lcom/twilio/verify/networking/AuthenticationProvider;", "baseUrl", "", "jwtGenerator", "Lcom/twilio/verify/data/jwt/JwtGenerator;", "keyStorage", "Lcom/twilio/verify/data/KeyStorage;", "networkProvider", "Lcom/twilio/verify/networking/NetworkProvider;", "baseUrl$verify_release", "build", "Lcom/twilio/verify/TwilioVerify;", "verify_release"}, k = 1, mv = {1, 1, 16})
    public static final class setMin {
        public onDrawOver getMax = new getItemOffsets((byte) 0);
        public String getMin = "https://verify.twilio.com/v2/";
        public setMeasuredDimension length = new setMeasuredDimension(new setMeasuredDimensionFromChildren(this.getMax));
        public getFocusedChild setMax;
        public shouldReMeasureChild setMin = new detachAndScrapAttachedViews();
        public Context toIntRange;

        public setMin(@NotNull Context context) {
            Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
            this.toIntRange = context;
            setMeasuredDimension setmeasureddimension = this.length;
            SharedPreferences max = canRestoreState.getMax(this.toIntRange);
            Intrinsics.checkExpressionValueIsNotNull(max, "storagePreferences(context)");
            this.setMax = new getFocusedChild(setmeasureddimension, new onItemRangeInserted(max));
        }
    }
}
