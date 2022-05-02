package o;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/twilio/security/storage/key/SecretKeyCipher;", "Lcom/twilio/security/storage/key/SecretKeyProvider;", "template", "Lcom/twilio/security/crypto/key/template/CipherTemplate;", "keyManager", "Lcom/twilio/security/crypto/KeyManager;", "(Lcom/twilio/security/crypto/key/template/CipherTemplate;Lcom/twilio/security/crypto/KeyManager;)V", "create", "", "decrypt", "", "data", "delete", "encrypt", "security_release"}, k = 1, mv = {1, 1, 16})
public final class setStateRestorationPolicy implements getStateRestorationPolicy {
    public final hasObservers getMax;
    public final createViewHolder setMin;

    public setStateRestorationPolicy(@NotNull hasObservers hasobservers, @NotNull createViewHolder createviewholder) {
        Intrinsics.checkParameterIsNotNull(hasobservers, "template");
        Intrinsics.checkParameterIsNotNull(createviewholder, "keyManager");
        this.getMax = hasobservers;
        this.setMin = createviewholder;
    }

    @NotNull
    public final byte[] setMax(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "data");
        return registerAdapterDataObserver.setMin(this.setMin.getMin(this.getMax).getMin(bArr));
    }

    @NotNull
    public final byte[] setMin(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "data");
        Intrinsics.checkParameterIsNotNull(bArr, "data");
        JSONObject jSONObject = new JSONObject(new String(bArr, Charsets.UTF_8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("algorithmParameters");
        Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "jsonObject.getJSONObject(algorithmParametersKey)");
        byte[] decode = Base64.decode(jSONObject2.getString("encoded"), 0);
        Intrinsics.checkExpressionValueIsNotNull(decode, "Base64.decode(jsonObject…ing(encodedKey), DEFAULT)");
        String string = jSONObject2.getString("provider");
        Intrinsics.checkExpressionValueIsNotNull(string, "jsonObject.getString(\n      providerKey\n    )");
        String string2 = jSONObject2.getString("algorithm");
        Intrinsics.checkExpressionValueIsNotNull(string2, "jsonObject.getString(algorithmKey)");
        setHasStableIds sethasstableids = new setHasStableIds(decode, string, string2);
        byte[] decode2 = Base64.decode(jSONObject.getString("encrypted"), 0);
        Intrinsics.checkExpressionValueIsNotNull(decode2, "Base64.decode(\n      jso…   ),\n      DEFAULT\n    )");
        return this.setMin.getMin(this.getMax).length(new getItemId(sethasstableids, decode2));
    }
}
