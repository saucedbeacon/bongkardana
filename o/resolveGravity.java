package o;

import android.content.Context;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class resolveGravity implements setPivotY {
    private final int getMin;
    private final setPivotY length;

    @NonNull
    public static setPivotY setMax(@NonNull Context context) {
        return new resolveGravity(context.getResources().getConfiguration().uiMode & 48, drawChild.getMin(context));
    }

    private resolveGravity(int i, setPivotY setpivoty) {
        this.getMin = i;
        this.length = setpivoty;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof resolveGravity) {
            resolveGravity resolvegravity = (resolveGravity) obj;
            if (this.getMin != resolvegravity.getMin || !this.length.equals(resolvegravity.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getDependents.length((Object) this.length, this.getMin);
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        this.length.setMax(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.getMin).array());
    }
}
