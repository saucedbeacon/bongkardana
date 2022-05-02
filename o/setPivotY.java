package o;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface setPivotY {
    public static final Charset setMin = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void setMax(@NonNull MessageDigest messageDigest);
}
