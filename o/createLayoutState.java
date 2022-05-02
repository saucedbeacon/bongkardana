package o;

import com.google.common.net.HttpHeaders;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class createLayoutState extends Draft {
    protected List<Framedata> IsOverlapping = new LinkedList();
    protected ByteBuffer isInside;
    private final Random toFloatRange = new Random();
    protected boolean toIntRange = false;

    public Draft.HandshakeState getMin(computeScrollRange computescrollrange, collectInitialPrefetchPositions collectinitialprefetchpositions) {
        return (!computescrollrange.getMin("WebSocket-Origin").equals(collectinitialprefetchpositions.getMin(HttpHeaders.ORIGIN)) || !getMin((resolveIsInfinite) collectinitialprefetchpositions)) ? Draft.HandshakeState.NOT_MATCHED : Draft.HandshakeState.MATCHED;
    }

    public Draft.HandshakeState getMax(computeScrollRange computescrollrange) {
        if (!computescrollrange.setMax(HttpHeaders.ORIGIN) || !getMin((resolveIsInfinite) computescrollrange)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.MATCHED;
    }

    public ByteBuffer setMin(Framedata framedata) {
        if (framedata.toFloatRange() == Framedata.Opcode.TEXT) {
            ByteBuffer min = framedata.getMin();
            ByteBuffer allocate = ByteBuffer.allocate(min.remaining() + 2);
            allocate.put((byte) 0);
            min.mark();
            allocate.put(min);
            min.reset();
            allocate.put((byte) -1);
            allocate.flip();
            return allocate;
        }
        throw new RuntimeException("only text frames supported");
    }

    public scrollVerticallyBy length(scrollVerticallyBy scrollverticallyby) throws InvalidHandshakeException {
        scrollverticallyby.length(HttpHeaders.UPGRADE, "WebSocket");
        scrollverticallyby.length(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE);
        if (!scrollverticallyby.setMax(HttpHeaders.ORIGIN)) {
            StringBuilder sb = new StringBuilder("random");
            sb.append(this.toFloatRange.nextInt());
            scrollverticallyby.length(HttpHeaders.ORIGIN, sb.toString());
        }
        return scrollverticallyby;
    }

    public updateLayoutState length(computeScrollRange computescrollrange, scrollBy scrollby) throws InvalidHandshakeException {
        scrollby.length("Web Socket Protocol Handshake");
        scrollby.length(HttpHeaders.UPGRADE, "WebSocket");
        scrollby.length(HttpHeaders.CONNECTION, computescrollrange.getMin(HttpHeaders.CONNECTION));
        scrollby.length("WebSocket-Origin", computescrollrange.getMin(HttpHeaders.ORIGIN));
        StringBuilder sb = new StringBuilder("ws://");
        sb.append(computescrollrange.getMin(HttpHeaders.HOST));
        sb.append(computescrollrange.setMin());
        scrollby.length("WebSocket-Location", sb.toString());
        return scrollby;
    }

    /* access modifiers changed from: protected */
    public final List<Framedata> getMax(ByteBuffer byteBuffer) throws InvalidDataException {
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            if (b == 0) {
                if (!this.toIntRange) {
                    this.toIntRange = true;
                } else {
                    throw new InvalidFrameException("unexpected START_OF_FRAME");
                }
            } else if (b == -1) {
                if (this.toIntRange) {
                    ByteBuffer byteBuffer2 = this.isInside;
                    if (byteBuffer2 != null) {
                        byteBuffer2.flip();
                        computeScrollOffset computescrolloffset = new computeScrollOffset();
                        computescrolloffset.setMax(this.isInside);
                        computescrolloffset.setMin(true);
                        computescrolloffset.setMax(Framedata.Opcode.TEXT);
                        this.IsOverlapping.add(computescrolloffset);
                        this.isInside = null;
                        byteBuffer.mark();
                    }
                    this.toIntRange = false;
                } else {
                    throw new InvalidFrameException("unexpected END_OF_FRAME");
                }
            } else if (!this.toIntRange) {
                return null;
            } else {
                ByteBuffer byteBuffer3 = this.isInside;
                if (byteBuffer3 == null) {
                    this.isInside = ByteBuffer.allocate(setMin);
                } else if (!byteBuffer3.hasRemaining()) {
                    ByteBuffer byteBuffer4 = this.isInside;
                    byteBuffer4.flip();
                    int capacity = byteBuffer4.capacity() * 2;
                    if (capacity >= 0) {
                        ByteBuffer allocate = ByteBuffer.allocate(capacity);
                        allocate.put(byteBuffer4);
                        this.isInside = allocate;
                    } else {
                        throw new InvalidDataException(1002, "Negative count");
                    }
                }
                this.isInside.put(b);
            }
        }
        List<Framedata> list = this.IsOverlapping;
        this.IsOverlapping = new LinkedList();
        return list;
    }

    public List<Framedata> setMax(ByteBuffer byteBuffer) throws InvalidDataException {
        List<Framedata> max = getMax(byteBuffer);
        if (max != null) {
            return max;
        }
        throw new InvalidDataException(1002);
    }

    public final void length() {
        this.toIntRange = false;
        this.isInside = null;
    }

    public Draft.CloseHandshakeType setMax() {
        return Draft.CloseHandshakeType.NONE;
    }

    public Draft getMax() {
        return new createLayoutState();
    }
}
