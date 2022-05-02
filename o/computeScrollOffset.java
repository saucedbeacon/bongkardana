package o;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class computeScrollOffset implements computeScrollExtent {
    protected static byte[] setMin = new byte[0];
    protected boolean getMax;
    protected Framedata.Opcode getMin;
    protected boolean length;
    private ByteBuffer setMax;

    public computeScrollOffset() {
    }

    public computeScrollOffset(Framedata.Opcode opcode) {
        this.getMin = opcode;
        this.setMax = ByteBuffer.wrap(setMin);
    }

    public computeScrollOffset(Framedata framedata) {
        this.getMax = framedata.setMax();
        this.getMin = framedata.toFloatRange();
        this.setMax = framedata.getMin();
        this.length = framedata.length();
    }

    public final boolean setMax() {
        return this.getMax;
    }

    public final Framedata.Opcode toFloatRange() {
        return this.getMin;
    }

    public final boolean length() {
        return this.length;
    }

    public ByteBuffer getMin() {
        return this.setMax;
    }

    public final void setMin(boolean z) {
        this.getMax = z;
    }

    public final void setMax(Framedata.Opcode opcode) {
        this.getMin = opcode;
    }

    public void setMax(ByteBuffer byteBuffer) throws InvalidDataException {
        this.setMax = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Framedata{ optcode:");
        sb.append(this.getMin);
        sb.append(", fin:");
        sb.append(setMax());
        sb.append(", payloadlength:[pos:");
        sb.append(this.setMax.position());
        sb.append(", len:");
        sb.append(this.setMax.remaining());
        sb.append("], payload:");
        sb.append(Arrays.toString(collectAdjacentPrefetchPositions.setMin(new String(this.setMax.array()))));
        sb.append("}");
        return sb.toString();
    }
}
