package o;

import java.nio.ByteBuffer;
import o.ensureRightGlow;

final class dispatchLayoutStep2 extends ensureRightGlow<ByteBuffer> {
    dispatchLayoutStep2(final int i) {
        super(500, new ensureRightGlow.getMin<ByteBuffer>() {
            public final /* synthetic */ Object setMax() {
                return ByteBuffer.allocateDirect(i);
            }
        });
    }
}
