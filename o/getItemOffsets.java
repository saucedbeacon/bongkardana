package o;

import android.util.Base64;
import com.twilio.verify.TwilioVerifyException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/twilio/verify/data/KeyStoreAdapter;", "Lcom/twilio/verify/data/KeyStorage;", "manager", "Lcom/twilio/security/crypto/KeyManager;", "(Lcom/twilio/security/crypto/KeyManager;)V", "create", "", "alias", "delete", "", "sign", "", "message", "signAndEncode", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getItemOffsets implements onDrawOver {
    private final createViewHolder length;

    public getItemOffsets() {
        this((byte) 0);
    }

    public /* synthetic */ getItemOffsets(byte b) {
        this(getItemCount.length());
    }

    private getItemOffsets(@NotNull createViewHolder createviewholder) {
        Intrinsics.checkParameterIsNotNull(createviewholder, "manager");
        this.length = createviewholder;
    }

    @NotNull
    public final String setMin(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "alias");
        try {
            createViewHolder createviewholder = this.length;
            Intrinsics.checkParameterIsNotNull(str, "alias");
            byte[] max = createviewholder.length(new notifyDataSetChanged(str, false)).getMax();
            Intrinsics.checkParameterIsNotNull(max, "input");
            byte[] encode = Base64.encode(max, 2);
            Intrinsics.checkExpressionValueIsNotNull(encode, "encoded");
            return new String(encode, Charsets.UTF_8);
        } catch (Exception e) {
            throw new TwilioVerifyException(e, TwilioVerifyException.ErrorCode.KeyStorageError);
        }
    }

    @NotNull
    public final byte[] setMin(@NotNull String str, @NotNull String str2) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1310384907, oncanceled);
            onCancelLoad.getMin(1310384907, oncanceled);
        }
        Intrinsics.checkParameterIsNotNull(str, "alias");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        try {
            createViewHolder createviewholder = this.length;
            Intrinsics.checkParameterIsNotNull(str, "alias");
            onViewAttachedToWindow length3 = createviewholder.length(new notifyDataSetChanged(str, true));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            return length3.getMax(bytes);
        } catch (Exception e) {
            throw new TwilioVerifyException(e, TwilioVerifyException.ErrorCode.KeyStorageError);
        }
    }

    @NotNull
    public final String getMax(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "alias");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        try {
            byte[] min = setMin(str, str2);
            Intrinsics.checkParameterIsNotNull(min, "input");
            byte[] encode = Base64.encode(min, 2);
            Intrinsics.checkExpressionValueIsNotNull(encode, "encoded");
            return new String(encode, Charsets.UTF_8);
        } catch (TwilioVerifyException e) {
            throw e;
        } catch (Exception e2) {
            throw new TwilioVerifyException(e2, TwilioVerifyException.ErrorCode.KeyStorageError);
        }
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "alias");
        try {
            this.length.getMin(str);
        } catch (Exception e) {
            throw new TwilioVerifyException(e, TwilioVerifyException.ErrorCode.KeyStorageError);
        }
    }
}
