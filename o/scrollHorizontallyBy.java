package o;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;

public final class scrollHorizontallyBy extends computeScrollOffset implements ensureLayoutState {
    static final ByteBuffer setMax = ByteBuffer.allocate(0);
    private String isInside;
    private int toIntRange;

    public scrollHorizontallyBy() {
        super(Framedata.Opcode.CLOSING);
        setMin(true);
    }

    public scrollHorizontallyBy(byte b) throws InvalidDataException {
        super(Framedata.Opcode.CLOSING);
        setMin(true);
        length(1000, "");
    }

    public scrollHorizontallyBy(int i, String str) throws InvalidDataException {
        super(Framedata.Opcode.CLOSING);
        setMin(true);
        length(i, str);
    }

    private void length(int i, String str) throws InvalidDataException {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (i == 1015) {
            i = 1005;
        } else {
            str2 = str;
        }
        if (i != 1005) {
            byte[] min = collectAdjacentPrefetchPositions.setMin(str2);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(i);
            allocate.position(2);
            ByteBuffer allocate2 = ByteBuffer.allocate(min.length + 2);
            allocate2.put(allocate);
            allocate2.put(min);
            allocate2.rewind();
            super.setMax(allocate2);
            isInside();
            IsOverlapping();
        } else if (str2.length() > 0) {
            throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
        }
    }

    private void isInside() throws InvalidFrameException {
        this.toIntRange = 1005;
        ByteBuffer min = super.getMin();
        min.mark();
        if (min.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(min.getShort());
            allocate.position(0);
            int i = allocate.getInt();
            this.toIntRange = i;
            if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
                StringBuilder sb = new StringBuilder("closecode must not be sent over the wire: ");
                sb.append(this.toIntRange);
                throw new InvalidFrameException(sb.toString());
            }
        }
        min.reset();
    }

    public final int setMin() {
        return this.toIntRange;
    }

    private void IsOverlapping() throws InvalidDataException {
        if (this.toIntRange == 1005) {
            this.isInside = collectAdjacentPrefetchPositions.setMin(super.getMin());
            return;
        }
        ByteBuffer min = super.getMin();
        int position = min.position();
        try {
            min.position(min.position() + 2);
            this.isInside = collectAdjacentPrefetchPositions.setMin(min);
            min.position(position);
        } catch (IllegalArgumentException e) {
            throw new InvalidFrameException((Throwable) e);
        } catch (Throwable th) {
            min.position(position);
            throw th;
        }
    }

    public final String getMax() {
        return this.isInside;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("code: ");
        sb.append(this.toIntRange);
        return sb.toString();
    }

    public final void setMax(ByteBuffer byteBuffer) throws InvalidDataException {
        super.setMax(byteBuffer);
        isInside();
        IsOverlapping();
    }

    public final ByteBuffer getMin() {
        if (this.toIntRange == 1005) {
            return setMax;
        }
        return super.getMin();
    }
}
