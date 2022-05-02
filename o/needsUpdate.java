package o;

import androidx.annotation.NonNull;
import id.co.bri.sdk.exception.BrizziException;

public interface needsUpdate {
    void getMin(BrizziException brizziException);

    void getMin(@NonNull String str);
}
