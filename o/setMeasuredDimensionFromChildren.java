package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/twilio/verify/data/jwt/JwtSigner;", "", "keyStorage", "Lcom/twilio/verify/data/KeyStorage;", "(Lcom/twilio/verify/data/KeyStorage;)V", "sign", "", "signerTemplate", "Lcom/twilio/security/crypto/key/template/SignerTemplate;", "content", "", "transcodeECSignatureToConcat", "derSignature", "outputLength", "", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class setMeasuredDimensionFromChildren {
    private final onDrawOver length;

    public setMeasuredDimensionFromChildren(@NotNull onDrawOver ondrawover) {
        Intrinsics.checkParameterIsNotNull(ondrawover, "keyStorage");
        this.length = ondrawover;
    }

    @NotNull
    public final byte[] getMin(@NotNull onDetachedFromRecyclerView ondetachedfromrecyclerview, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(ondetachedfromrecyclerview, "signerTemplate");
        Intrinsics.checkParameterIsNotNull(str, "content");
        byte[] min = this.length.setMin(ondetachedfromrecyclerview.getMax(), str);
        return ondetachedfromrecyclerview instanceof notifyDataSetChanged ? setMin(min) : min;
    }

    private static byte[] setMin(byte[] bArr) {
        int i;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new IllegalArgumentException("Invalid ECDSA signature format");
        }
        if (bArr[1] > 0) {
            i = 2;
        } else if (bArr[1] == -127) {
            i = 3;
        } else {
            throw new IllegalArgumentException("Invalid ECDSA signature format");
        }
        byte b = bArr[i + 1];
        int i2 = b;
        while (i2 > 0 && bArr[((i + 2) + b) - i2] == 0) {
            i2--;
        }
        int i3 = i + 2 + b;
        byte b2 = bArr[i3 + 1];
        int i4 = b2;
        while (i4 > 0 && bArr[((i3 + 2) + b2) - i4] == 0) {
            i4--;
        }
        int max = Math.max(Math.max(i2, i4), 32);
        int i5 = i - 1;
        if ((bArr[i5] & 255) == bArr.length - i && (bArr[i5] & 255) == b + 2 + 2 + b2 && bArr[i] == 2 && bArr[i3] == 2) {
            int i6 = max * 2;
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i3 - i2, bArr2, max - i2, i2);
            System.arraycopy(bArr, ((i3 + 2) + b2) - i4, bArr2, i6 - i4, i4);
            return bArr2;
        }
        throw new IllegalArgumentException("Invalid ECDSA signature format");
    }
}
