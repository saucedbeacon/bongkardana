package o;

import android.util.Base64;
import id.dana.lib.drawbitmap.invoice.InvoiceConstant;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/twilio/verify/data/jwt/JwtGenerator;", "", "jwtSigner", "Lcom/twilio/verify/data/jwt/JwtSigner;", "(Lcom/twilio/verify/data/jwt/JwtSigner;)V", "generateJWT", "", "signerTemplate", "Lcom/twilio/security/crypto/key/template/SignerTemplate;", "header", "Lorg/json/JSONObject;", "payload", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class setMeasuredDimension {
    private final setMeasuredDimensionFromChildren setMax;

    public setMeasuredDimension(@NotNull setMeasuredDimensionFromChildren setmeasureddimensionfromchildren) {
        Intrinsics.checkParameterIsNotNull(setmeasureddimensionfromchildren, "jwtSigner");
        this.setMax = setmeasureddimensionfromchildren;
    }

    @NotNull
    public final String getMax(@NotNull onDetachedFromRecyclerView ondetachedfromrecyclerview, @NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        Intrinsics.checkParameterIsNotNull(ondetachedfromrecyclerview, "signerTemplate");
        Intrinsics.checkParameterIsNotNull(jSONObject, InvoiceConstant.HEADER);
        Intrinsics.checkParameterIsNotNull(jSONObject2, "payload");
        jSONObject.put("typ", "JWT");
        if (ondetachedfromrecyclerview instanceof notifyDataSetChanged) {
            jSONObject.put("alg", "ES256");
        }
        StringBuilder sb = new StringBuilder();
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject3, "header.toString()");
        Charset charset = Charsets.UTF_8;
        if (jSONObject3 != null) {
            byte[] bytes = jSONObject3.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            Intrinsics.checkParameterIsNotNull(bytes, "input");
            byte[] encode = Base64.encode(bytes, 11);
            Intrinsics.checkExpressionValueIsNotNull(encode, "encoded");
            sb.append(new String(encode, Charsets.UTF_8));
            sb.append('.');
            String jSONObject4 = jSONObject2.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject4, "payload.toString()");
            Charset charset2 = Charsets.UTF_8;
            if (jSONObject4 != null) {
                byte[] bytes2 = jSONObject4.getBytes(charset2);
                Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                Intrinsics.checkParameterIsNotNull(bytes2, "input");
                byte[] encode2 = Base64.encode(bytes2, 11);
                Intrinsics.checkExpressionValueIsNotNull(encode2, "encoded");
                sb.append(new String(encode2, Charsets.UTF_8));
                String obj = sb.toString();
                byte[] min = this.setMax.getMin(ondetachedfromrecyclerview, obj);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append('.');
                Intrinsics.checkParameterIsNotNull(min, "input");
                byte[] encode3 = Base64.encode(min, 11);
                Intrinsics.checkExpressionValueIsNotNull(encode3, "encoded");
                sb2.append(new String(encode3, Charsets.UTF_8));
                return sb2.toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
