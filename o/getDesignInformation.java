package o;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.setProgress;

public final class getDesignInformation implements setProgress<ByteBuffer> {
    private final ByteBuffer setMax;

    public final void getMax() {
    }

    public getDesignInformation(ByteBuffer byteBuffer) {
        this.setMax = byteBuffer;
    }

    public static class getMax implements setProgress.getMin<ByteBuffer> {
        @NonNull
        public final /* synthetic */ setProgress setMax(Object obj) {
            return new getDesignInformation((ByteBuffer) obj);
        }

        @NonNull
        public final Class<ByteBuffer> setMin() {
            return ByteBuffer.class;
        }
    }

    @NonNull
    public final /* synthetic */ Object getMin() throws IOException {
        this.setMax.position(0);
        return this.setMax;
    }
}
