package o;

import android.content.Context;
import id.dana.data.network.exception.NoNetworkException;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.increaseBuffer;

@Singleton
public class CommonBackPerform implements increaseBuffer {
    private Context getMax;

    final class BackHandler implements RedDotDrawable {
        private final AnonymousClass2 getMax;

        public BackHandler(AnonymousClass2 r1) {
            this.getMax = r1;
        }

        public final Object apply(Object obj) {
            return this.getMax.transform((getSnapshot) obj);
        }
    }

    @Inject
    public CommonBackPerform(Context context) {
        this.getMax = context;
    }

    public final InvalidHandshakeException getMax(increaseBuffer.setMax setmax) throws IOException {
        InvalidDataException min = setmax.getMin();
        if (getOriginStartParams.isNetworkAvailable(this.getMax)) {
            return setmax.getMax(min);
        }
        throw new NoNetworkException(this.getMax);
    }
}
