package o;

import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.models.FactorStatus;
import com.twilio.verify.models.FactorType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0017"}, d2 = {"Lcom/twilio/verify/domain/factor/FactorMapper;", "", "()V", "fromApi", "Lcom/twilio/verify/models/Factor;", "jsonObject", "Lorg/json/JSONObject;", "factorPayload", "Lcom/twilio/verify/domain/factor/models/FactorDataPayload;", "fromStorage", "json", "", "getSid", "isFactor", "", "status", "Lcom/twilio/verify/models/FactorStatus;", "toJSON", "factor", "toPushFactor", "Lcom/twilio/verify/domain/factor/models/PushFactor;", "serviceSid", "identity", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getLayoutDirection {
    @NotNull
    public static getHeight getMin(@NotNull JSONObject jSONObject, @NotNull detachViewAt detachviewat) throws TwilioVerifyException {
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
        Intrinsics.checkParameterIsNotNull(detachviewat, "factorPayload");
        String max = detachviewat.getMax();
        String max2 = detachviewat.setMax();
        boolean z = false;
        if (!(max.length() == 0)) {
            if (max2.length() == 0) {
                z = true;
            }
            if (!z) {
                if (startSmoothScroll.setMin[detachviewat.getMin().ordinal()] == 1) {
                    return getMax(max, max2, jSONObject);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        throw new TwilioVerifyException(new IllegalArgumentException("ServiceSid or Identity is null or empty"), TwilioVerifyException.ErrorCode.MapperError);
    }

    @NotNull
    public static FactorStatus length(@NotNull JSONObject jSONObject) throws TwilioVerifyException {
        FactorStatus factorStatus;
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
        try {
            FactorStatus[] values = FactorStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    factorStatus = null;
                    break;
                }
                factorStatus = values[i];
                if (Intrinsics.areEqual((Object) factorStatus.getValue(), (Object) jSONObject.getString("status"))) {
                    break;
                }
                i++;
            }
            return factorStatus == null ? FactorStatus.Unverified : factorStatus;
        } catch (JSONException e) {
            throw new TwilioVerifyException(e, TwilioVerifyException.ErrorCode.MapperError);
        }
    }

    @NotNull
    public static getHeight setMax(@NotNull String str) throws TwilioVerifyException {
        Intrinsics.checkParameterIsNotNull(str, "json");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("service_sid");
            String optString2 = jSONObject.optString("entity_identity");
            CharSequence charSequence = optString;
            boolean z = false;
            if (!(charSequence == null || charSequence.length() == 0)) {
                CharSequence charSequence2 = optString2;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    if (Intrinsics.areEqual((Object) jSONObject.getString("type"), (Object) FactorType.PUSH.getFactorTypeName())) {
                        detachView max = getMax(optString, optString2, jSONObject);
                        max.length = jSONObject.optString("key_pair");
                        return max;
                    }
                    throw new TwilioVerifyException(new IllegalArgumentException("Invalid factor type from json"), TwilioVerifyException.ErrorCode.MapperError);
                }
            }
            throw new TwilioVerifyException(new IllegalArgumentException("ServiceSid or Identity is null or empty"), TwilioVerifyException.ErrorCode.MapperError);
        } catch (JSONException e) {
            throw new TwilioVerifyException(e, TwilioVerifyException.ErrorCode.MapperError);
        }
    }

    private static detachView getMax(String str, String str2, JSONObject jSONObject) throws TwilioVerifyException {
        FactorStatus factorStatus;
        try {
            String string = jSONObject.getString("sid");
            Intrinsics.checkExpressionValueIsNotNull(string, "jsonObject.getString(sidKey)");
            String string2 = jSONObject.getString("friendly_name");
            Intrinsics.checkExpressionValueIsNotNull(string2, "jsonObject.getString(friendlyNameKey)");
            String string3 = jSONObject.getString("account_sid");
            Intrinsics.checkExpressionValueIsNotNull(string3, "jsonObject.getString(accountSidKey)");
            FactorStatus[] values = FactorStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    factorStatus = null;
                    break;
                }
                factorStatus = values[i];
                if (Intrinsics.areEqual((Object) factorStatus.getValue(), (Object) jSONObject.getString("status"))) {
                    break;
                }
                i++;
            }
            FactorStatus factorStatus2 = factorStatus == null ? FactorStatus.Unverified : factorStatus;
            String string4 = jSONObject.getString("date_created");
            Intrinsics.checkExpressionValueIsNotNull(string4, "jsonObject.getString(dateCreatedKey)");
            Date max = onItemRangeRemoved.setMax(string4);
            String string5 = jSONObject.getJSONObject("config").getString("credential_sid");
            Intrinsics.checkExpressionValueIsNotNull(string5, "jsonObject.getJSONObject…tString(credentialSidKey)");
            return new detachView(string, string2, string3, str, str2, factorStatus2, max, new addViewInt(string5));
        } catch (JSONException e) {
            throw new TwilioVerifyException(e, TwilioVerifyException.ErrorCode.MapperError);
        }
    }

    public static boolean setMin(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "json");
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (String has : CollectionsKt.listOf("service_sid", "entity_identity", "sid", "account_sid")) {
                if (!jSONObject.has(has)) {
                    return false;
                }
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
