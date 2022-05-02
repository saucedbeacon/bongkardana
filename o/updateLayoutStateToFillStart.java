package o;

import android.annotation.SuppressLint;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@SuppressLint({"Assert"})
public class updateLayoutStateToFillStart implements WebSocket {
    public static int getMax = 16384;
    public static boolean getMin = false;
    public static final List<Draft> setMax;
    public static final /* synthetic */ boolean toDoubleRange = (!updateLayoutStateToFillStart.class.desiredAssertionStatus());
    public String FastBitmap$CoordinateSystem = null;
    private Integer Grayscale$Algorithm = null;
    public WebSocket.READYSTATE IsOverlapping = WebSocket.READYSTATE.NOT_YET_CONNECTED;
    private Framedata.Opcode Mean$Arithmetic = null;
    public final updateLayoutStateToFillEnd equals;
    public computeScrollRange hashCode = null;
    private List<Draft> invoke;
    private volatile boolean invokeSuspend = false;
    public Draft isInside = null;
    public ByteChannel length;
    private Boolean onNavigationEvent = null;
    public SelectionKey setMin;
    public final BlockingQueue<ByteBuffer> toFloatRange;
    public final BlockingQueue<ByteBuffer> toIntRange;
    public ByteBuffer toString = ByteBuffer.allocate(0);
    private String valueOf = null;
    public WebSocket.Role values;

    static {
        ArrayList arrayList = new ArrayList(4);
        setMax = arrayList;
        arrayList.add(new scrollToPosition());
        setMax.add(new isLayoutRTL());
        setMax.add(new scrollToPositionWithOffset());
        setMax.add(new createLayoutState());
    }

    public updateLayoutStateToFillStart(updateLayoutStateToFillEnd updatelayoutstatetofillend, Draft draft) {
        if (draft == null && this.values == WebSocket.Role.SERVER) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.toIntRange = new LinkedBlockingQueue();
        this.toFloatRange = new LinkedBlockingQueue();
        this.equals = updatelayoutstatetofillend;
        this.values = WebSocket.Role.CLIENT;
        if (draft != null) {
            this.isInside = draft.getMax();
        }
    }

    public final boolean setMax(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        Draft.HandshakeState handshakeState;
        if (this.toString.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.toString.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.toString.capacity() + byteBuffer.remaining());
                this.toString.flip();
                allocate.put(this.toString);
                this.toString = allocate;
            }
            this.toString.put(byteBuffer);
            this.toString.flip();
            byteBuffer2 = this.toString;
        }
        byteBuffer2.mark();
        try {
            if (this.isInside == null) {
                byteBuffer2.mark();
                if (byteBuffer2.limit() > Draft.length.length) {
                    handshakeState = Draft.HandshakeState.NOT_MATCHED;
                } else if (byteBuffer2.limit() >= Draft.length.length) {
                    int i = 0;
                    while (true) {
                        if (!byteBuffer2.hasRemaining()) {
                            handshakeState = Draft.HandshakeState.MATCHED;
                            break;
                        } else if (Draft.length[i] != byteBuffer2.get()) {
                            byteBuffer2.reset();
                            handshakeState = Draft.HandshakeState.NOT_MATCHED;
                            break;
                        } else {
                            i++;
                        }
                    }
                } else {
                    throw new IncompleteHandshakeException(Draft.length.length);
                }
                if (handshakeState == Draft.HandshakeState.MATCHED) {
                    try {
                        getMax(ByteBuffer.wrap(collectAdjacentPrefetchPositions.setMin(this.equals.getMin(this))));
                        getMax(-3, "", false);
                    } catch (InvalidDataException unused) {
                        getMax(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
                    }
                    return false;
                }
            }
            try {
                if (this.values != WebSocket.Role.SERVER) {
                    if (this.values == WebSocket.Role.CLIENT) {
                        this.isInside.getMin(this.values);
                        resolveIsInfinite length2 = this.isInside.length(byteBuffer2);
                        if (!(length2 instanceof collectInitialPrefetchPositions)) {
                            setMin(1002, "wrong http function", false);
                            return false;
                        }
                        if (this.isInside.getMin(this.hashCode, (collectInitialPrefetchPositions) length2) == Draft.HandshakeState.MATCHED) {
                            toIntRange();
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("draft ");
                        sb.append(this.isInside);
                        sb.append(" refuses handshake");
                        getMax(1002, sb.toString(), false);
                    }
                    return false;
                } else if (this.isInside == null) {
                    for (Draft max : this.invoke) {
                        Draft max2 = max.getMax();
                        try {
                            max2.getMin(this.values);
                            byteBuffer2.reset();
                            resolveIsInfinite length3 = max2.length(byteBuffer2);
                            if (!(length3 instanceof computeScrollRange)) {
                                setMin(1002, "wrong http function", false);
                                return false;
                            }
                            computeScrollRange computescrollrange = (computeScrollRange) length3;
                            if (max2.getMax(computescrollrange) == Draft.HandshakeState.MATCHED) {
                                this.FastBitmap$CoordinateSystem = computescrollrange.setMin();
                                try {
                                    getMin(Draft.getMax((resolveIsInfinite) max2.length(computescrollrange, this.equals.setMax())));
                                    this.isInside = max2;
                                    toIntRange();
                                    return true;
                                } catch (InvalidDataException e) {
                                    setMin(e.getCloseCode(), e.getMessage(), false);
                                    return false;
                                } catch (RuntimeException e2) {
                                    this.equals.setMin(e2);
                                    setMin(-1, e2.getMessage(), false);
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        } catch (InvalidHandshakeException unused2) {
                        }
                    }
                    if (this.isInside == null) {
                        getMax(1002, "no draft matches", false);
                    }
                    return false;
                } else {
                    resolveIsInfinite length4 = this.isInside.length(byteBuffer2);
                    if (!(length4 instanceof computeScrollRange)) {
                        setMin(1002, "wrong http function", false);
                        return false;
                    }
                    if (this.isInside.getMax((computeScrollRange) length4) == Draft.HandshakeState.MATCHED) {
                        toIntRange();
                        return true;
                    }
                    getMax(1002, "the handshake did finaly not match", false);
                    return false;
                }
            } catch (InvalidHandshakeException e3) {
                getMax(e3.getCloseCode(), e3.getMessage(), false);
            }
        } catch (IncompleteHandshakeException e4) {
            if (this.toString.capacity() == 0) {
                byteBuffer2.reset();
                int preferedSize = e4.getPreferedSize();
                if (preferedSize == 0) {
                    preferedSize = byteBuffer2.capacity() + 16;
                } else if (!toDoubleRange && e4.getPreferedSize() < byteBuffer2.remaining()) {
                    throw new AssertionError();
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(preferedSize);
                this.toString = allocate2;
                allocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.toString;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.toString;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
    }

    public final void length(ByteBuffer byteBuffer) {
        try {
            for (Framedata next : this.isInside.setMax(byteBuffer)) {
                if (getMin) {
                    System.out.println("matched frame: ".concat(String.valueOf(next)));
                }
                Framedata.Opcode floatRange = next.toFloatRange();
                boolean max = next.setMax();
                if (floatRange == Framedata.Opcode.CLOSING) {
                    int i = 1005;
                    String str = "";
                    if (next instanceof ensureLayoutState) {
                        ensureLayoutState ensurelayoutstate = (ensureLayoutState) next;
                        i = ensurelayoutstate.setMin();
                        str = ensurelayoutstate.getMax();
                    }
                    if (this.IsOverlapping == WebSocket.READYSTATE.CLOSING) {
                        getMax();
                    } else if (this.isInside.setMax() == Draft.CloseHandshakeType.TWOWAY) {
                        getMax(i, str, true);
                    } else {
                        setMin(i, str, false);
                    }
                } else if (floatRange == Framedata.Opcode.PING) {
                    this.equals.length(this, next);
                } else if (floatRange == Framedata.Opcode.PONG) {
                    continue;
                } else {
                    if (max) {
                        if (floatRange != Framedata.Opcode.CONTINUOUS) {
                            if (this.Mean$Arithmetic != null) {
                                throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
                            } else if (floatRange == Framedata.Opcode.TEXT) {
                                try {
                                    this.equals.length(collectAdjacentPrefetchPositions.setMin(next.getMin()));
                                } catch (RuntimeException e) {
                                    this.equals.setMin(e);
                                }
                            } else if (floatRange == Framedata.Opcode.BINARY) {
                                try {
                                    next.getMin();
                                } catch (RuntimeException e2) {
                                    this.equals.setMin(e2);
                                }
                            } else {
                                throw new InvalidDataException(1002, "non control or continious frame expected");
                            }
                        }
                    }
                    if (floatRange != Framedata.Opcode.CONTINUOUS) {
                        if (this.Mean$Arithmetic == null) {
                            this.Mean$Arithmetic = floatRange;
                        } else {
                            throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                        }
                    } else if (max) {
                        if (this.Mean$Arithmetic != null) {
                            this.Mean$Arithmetic = null;
                        } else {
                            throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                        }
                    } else if (this.Mean$Arithmetic == null) {
                        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                    }
                }
            }
        } catch (InvalidDataException e3) {
            this.equals.setMin(e3);
            getMax(e3.getCloseCode(), e3.getMessage(), false);
        }
    }

    private void getMax(int i, String str, boolean z) {
        if (this.IsOverlapping != WebSocket.READYSTATE.CLOSING && this.IsOverlapping != WebSocket.READYSTATE.CLOSED) {
            if (this.IsOverlapping == WebSocket.READYSTATE.OPEN) {
                if (i != 1006) {
                    if (this.isInside.setMax() != Draft.CloseHandshakeType.NONE) {
                        try {
                            getMax((Framedata) new scrollHorizontallyBy(i, str));
                        } catch (InvalidDataException e) {
                            this.equals.setMin(e);
                            setMin(1006, "generated frame is invalid", false);
                        }
                    }
                    setMin(i, str, z);
                } else if (toDoubleRange || !z) {
                    this.IsOverlapping = WebSocket.READYSTATE.CLOSING;
                    setMin(i, str, false);
                    return;
                } else {
                    throw new AssertionError();
                }
            } else if (i != -3) {
                setMin(-1, str, false);
            } else if (toDoubleRange || z) {
                setMin(-3, str, true);
            } else {
                throw new AssertionError();
            }
            if (i == 1002) {
                setMin(i, str, z);
            }
            this.IsOverlapping = WebSocket.READYSTATE.CLOSING;
            this.toString = null;
        }
    }

    public final synchronized void getMax() {
        if (this.IsOverlapping != WebSocket.READYSTATE.CLOSED) {
            if (this.setMin != null) {
                this.setMin.cancel();
            }
            if (this.length != null) {
                try {
                    this.length.close();
                } catch (IOException e) {
                    this.equals.setMin(e);
                }
            }
            try {
                this.equals.getMax();
            } catch (RuntimeException e2) {
                this.equals.setMin(e2);
            }
            if (this.isInside != null) {
                this.isInside.length();
            }
            this.hashCode = null;
            this.IsOverlapping = WebSocket.READYSTATE.CLOSED;
            this.toIntRange.clear();
            return;
        }
        return;
    }

    private synchronized void setMin(int i, String str, boolean z) {
        if (!this.invokeSuspend) {
            this.Grayscale$Algorithm = Integer.valueOf(i);
            this.valueOf = str;
            this.onNavigationEvent = Boolean.valueOf(z);
            this.invokeSuspend = true;
            if (this.isInside != null) {
                this.isInside.length();
            }
            this.hashCode = null;
        }
    }

    public final void getMax(Framedata framedata) {
        if (getMin) {
            System.out.println("send frame: ".concat(String.valueOf(framedata)));
        }
        getMax(this.isInside.setMin(framedata));
    }

    private void getMax(ByteBuffer byteBuffer) {
        if (getMin) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
            sb.append("}");
            printStream.println(sb.toString());
        }
        this.toIntRange.add(byteBuffer);
    }

    public final void getMin(List<ByteBuffer> list) {
        for (ByteBuffer max : list) {
            getMax(max);
        }
    }

    private void toIntRange() {
        if (getMin) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("open using draft: ");
            sb.append(this.isInside.getClass().getSimpleName());
            printStream.println(sb.toString());
        }
        this.IsOverlapping = WebSocket.READYSTATE.OPEN;
        try {
            this.equals.getMin();
        } catch (RuntimeException e) {
            this.equals.setMin(e);
        }
    }

    public final boolean setMax() {
        if (toDoubleRange || this.IsOverlapping != WebSocket.READYSTATE.OPEN || !this.invokeSuspend) {
            return this.IsOverlapping == WebSocket.READYSTATE.OPEN;
        }
        throw new AssertionError();
    }

    public final boolean setMin() {
        return this.IsOverlapping == WebSocket.READYSTATE.CLOSING;
    }

    public final boolean equals() {
        return this.invokeSuspend;
    }

    public final boolean isInside() {
        return this.IsOverlapping == WebSocket.READYSTATE.CLOSED;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public final InetSocketAddress length() {
        return this.equals.setMin();
    }

    public final void getMin() {
        if (this.IsOverlapping == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            getMax();
        } else if (this.invokeSuspend) {
            getMax();
        } else if (this.isInside.setMax() == Draft.CloseHandshakeType.NONE) {
            getMax();
        } else if (this.isInside.setMax() != Draft.CloseHandshakeType.ONEWAY || this.values == WebSocket.Role.SERVER) {
            getMax();
        } else {
            getMax();
        }
    }
}
