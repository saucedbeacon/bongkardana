package o;

import com.twilio.verify.TwilioVerifyException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/twilio/verify/networking/AuthenticationProvider;", "Lcom/twilio/verify/networking/Authentication;", "jwtGenerator", "Lcom/twilio/verify/data/jwt/JwtGenerator;", "dateProvider", "Lcom/twilio/verify/data/DateProvider;", "(Lcom/twilio/verify/data/jwt/JwtGenerator;Lcom/twilio/verify/data/DateProvider;)V", "generateHeader", "Lorg/json/JSONObject;", "factor", "Lcom/twilio/verify/domain/factor/models/PushFactor;", "generateJWT", "", "Lcom/twilio/verify/models/Factor;", "generateJwt", "generatePayload", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getFocusedChild implements ignoreView {
    private final RecyclerView$ItemAnimator$AdapterChanges length;
    private final setMeasuredDimension setMax;

    public getFocusedChild(@NotNull setMeasuredDimension setmeasureddimension, @NotNull RecyclerView$ItemAnimator$AdapterChanges recyclerView$ItemAnimator$AdapterChanges) {
        Intrinsics.checkParameterIsNotNull(setmeasureddimension, "jwtGenerator");
        Intrinsics.checkParameterIsNotNull(recyclerView$ItemAnimator$AdapterChanges, "dateProvider");
        this.setMax = setmeasureddimension;
        this.length = recyclerView$ItemAnimator$AdapterChanges;
    }

    @NotNull
    public final String setMax(@NotNull getHeight getheight) {
        Intrinsics.checkParameterIsNotNull(getheight, "factor");
        try {
            if (getheight instanceof detachView) {
                detachView detachview = (detachView) getheight;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cty", "twilio-pba;v=1");
                jSONObject.put("kid", detachview.equals.setMax);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sub", detachview.getMax);
                jSONObject2.put("exp", this.length.getMin() + TimeUnit.MINUTES.toSeconds(10));
                jSONObject2.put("nbf", this.length.getMin());
                String str = detachview.length;
                if (str != null) {
                    setMeasuredDimension setmeasureddimension = this.setMax;
                    Intrinsics.checkParameterIsNotNull(str, "alias");
                    return setmeasureddimension.getMax(new notifyDataSetChanged(str, true), jSONObject, jSONObject2);
                }
                throw new IllegalStateException("Key pair not set");
            }
            throw new IllegalArgumentException("Not supported factor for JWT generation");
        } catch (Exception e) {
            throw new TwilioVerifyException(e, TwilioVerifyException.ErrorCode.AuthenticationTokenError);
        }
    }
}
