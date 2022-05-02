package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URL;
import java.security.MessageDigest;

public class access$1400 implements setPivotY {
    @Nullable
    public final URL getMax;
    @Nullable
    public final String getMin;
    private int isInside;
    public final access$1800 length;
    @Nullable
    public String setMax;
    @Nullable
    private volatile byte[] toFloatRange;
    @Nullable
    public URL toIntRange;

    public access$1400(URL url) {
        this(url, access$1800.setMax);
    }

    public access$1400(String str) {
        this(str, access$1800.setMax);
    }

    private access$1400(URL url, access$1800 access_1800) {
        if (url != null) {
            this.getMax = url;
            this.getMin = null;
            if (access_1800 != null) {
                this.length = access_1800;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    private access$1400(String str, access$1800 access_1800) {
        this.getMax = null;
        if (!TextUtils.isEmpty(str)) {
            this.getMin = str;
            if (access_1800 != null) {
                this.length = access_1800;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    private String length() {
        String str = this.getMin;
        if (str != null) {
            return str;
        }
        URL url = this.getMax;
        if (url != null) {
            return url.toString();
        }
        throw new NullPointerException("Argument must not be null");
    }

    public String toString() {
        return length();
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        messageDigest.update(setMax());
    }

    private byte[] setMax() {
        if (this.toFloatRange == null) {
            this.toFloatRange = length().getBytes(setMin);
        }
        return this.toFloatRange;
    }

    public boolean equals(Object obj) {
        if (obj instanceof access$1400) {
            access$1400 access_1400 = (access$1400) obj;
            if (!length().equals(access_1400.length()) || !this.length.equals(access_1400.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.isInside == 0) {
            int hashCode = length().hashCode();
            this.isInside = hashCode;
            this.isInside = (hashCode * 31) + this.length.hashCode();
        }
        return this.isInside;
    }
}
