package o;

import androidx.annotation.NonNull;
import io.split.android.client.service.http.HttpRequestBodySerializer;

public final class callLiteVMByteMethod implements HttpRequestBodySerializer<callLiteVMStringMethod> {
    public final String serialize(@NonNull callLiteVMStringMethod calllitevmstringmethod) {
        return IUMIDInitListenerEx.toJson(calllitevmstringmethod);
    }
}
