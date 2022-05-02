package o;

import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002\u001a\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"algorithmKey", "", "algorithmParametersKey", "encodedKey", "encryptedKey", "providerKey", "fromByteArray", "Lcom/twilio/security/crypto/key/cipher/EncryptedData;", "data", "", "Lcom/twilio/security/crypto/key/cipher/AlgorithmParametersSpec;", "jsonObject", "Lorg/json/JSONObject;", "toByteArray", "algorithmParametersSpec", "encryptedData", "security_release"}, k = 2, mv = {1, 1, 16})
public final class registerAdapterDataObserver {
    @NotNull
    public static final byte[] setMin(@NotNull getItemId getitemid) {
        Intrinsics.checkParameterIsNotNull(getitemid, "encryptedData");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("encrypted", Base64.encodeToString(getitemid.length(), 0));
        setHasStableIds sethasstableids = getitemid.setMin;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("encoded", Base64.encodeToString(sethasstableids.getMin(), 0));
        jSONObject2.put("provider", sethasstableids.getMax);
        jSONObject2.put("algorithm", sethasstableids.setMin);
        jSONObject.put("algorithmParameters", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject3, "JSONObject()\n  .apply {\n…eters))\n  }\n  .toString()");
        Charset charset = Charsets.UTF_8;
        if (jSONObject3 != null) {
            byte[] bytes = jSONObject3.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
