package o;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Random;

final class fillRemainingScrollValues {
    static final Random length = new Random();
    final ByteBuffer setMin;

    fillRemainingScrollValues(@NonNull recoverFocusFromState recoverfocusfromstate) {
        this.setMin = ByteBuffer.allocateDirect(recoverfocusfromstate.setMin * 1024 * 1).order(ByteOrder.nativeOrder());
        double d = (double) (recoverfocusfromstate.setMin * 1024);
        Double.isNaN(d);
        double d2 = 3.141592653589793d / (d / 2.0d);
        double d3 = 0.0d;
        while (this.setMin.hasRemaining()) {
            d3 += 1.0d;
            short sin = (short) ((int) (Math.sin(d3 * d2) * 10.0d));
            this.setMin.put((byte) sin);
            this.setMin.put((byte) (sin >> 8));
        }
        this.setMin.rewind();
    }
}
