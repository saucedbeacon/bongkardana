package o;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.Draft;
import o.increaseBuffer;

public final class Framedata {
    private final Set<getCloseCode> getMin = new LinkedHashSet();

    public final synchronized void getMin(getCloseCode getclosecode) {
        this.getMin.add(getclosecode);
    }

    public final synchronized void setMin(getCloseCode getclosecode) {
        this.getMin.remove(getclosecode);
    }

    public final synchronized boolean setMax(getCloseCode getclosecode) {
        return this.getMin.contains(getclosecode);
    }

    public final class Opcode implements increaseBuffer.setMax {
        private final List<increaseBuffer> IsOverlapping;
        private final int equals;
        public final isFin getMax;
        final checkAlloc getMin;
        private final int hashCode;
        final translateSingleFrame isInside;
        final getOpcode length;
        public final InvalidDataException setMax;
        final setFin setMin;
        private final int toFloatRange;
        private final int toIntRange;
        private int toString;

        public Opcode(List<increaseBuffer> list, isFin isfin, getOpcode getopcode, setFin setfin, int i, InvalidDataException invalidDataException, checkAlloc checkalloc, translateSingleFrame translatesingleframe, int i2, int i3, int i4) {
            this.IsOverlapping = list;
            this.setMin = setfin;
            this.getMax = isfin;
            this.length = getopcode;
            this.toFloatRange = i;
            this.setMax = invalidDataException;
            this.getMin = checkalloc;
            this.isInside = translatesingleframe;
            this.equals = i2;
            this.toIntRange = i3;
            this.hashCode = i4;
        }

        public final Draft.HandshakeState setMin() {
            return this.setMin;
        }

        public final int setMax() {
            return this.equals;
        }

        public final int length() {
            return this.toIntRange;
        }

        public final int getMax() {
            return this.hashCode;
        }

        public final InvalidDataException getMin() {
            return this.setMax;
        }

        public final InvalidHandshakeException getMax(InvalidDataException invalidDataException) throws IOException {
            return length(invalidDataException, this.getMax, this.length, this.setMin);
        }

        public final InvalidHandshakeException length(InvalidDataException invalidDataException, isFin isfin, getOpcode getopcode, setFin setfin) throws IOException {
            if (this.toFloatRange < this.IsOverlapping.size()) {
                this.toString++;
                if (this.length == null) {
                    InvalidDataException invalidDataException2 = invalidDataException;
                } else if (!this.setMin.length(invalidDataException.setMin)) {
                    StringBuilder sb = new StringBuilder("network interceptor ");
                    sb.append(this.IsOverlapping.get(this.toFloatRange - 1));
                    sb.append(" must retain the same host and port");
                    throw new IllegalStateException(sb.toString());
                }
                if (this.length == null || this.toString <= 1) {
                    String str = " must call proceed() exactly once";
                    Opcode opcode = new Opcode(this.IsOverlapping, isfin, getopcode, setfin, this.toFloatRange + 1, invalidDataException, this.getMin, this.isInside, this.equals, this.toIntRange, this.hashCode);
                    increaseBuffer increasebuffer = this.IsOverlapping.get(this.toFloatRange);
                    InvalidHandshakeException max = increasebuffer.getMax(opcode);
                    if (getopcode != null && this.toFloatRange + 1 < this.IsOverlapping.size() && opcode.toString != 1) {
                        StringBuilder sb2 = new StringBuilder("network interceptor ");
                        sb2.append(increasebuffer);
                        sb2.append(str);
                        throw new IllegalStateException(sb2.toString());
                    } else if (max == null) {
                        StringBuilder sb3 = new StringBuilder("interceptor ");
                        sb3.append(increasebuffer);
                        sb3.append(" returned null");
                        throw new NullPointerException(sb3.toString());
                    } else if (max.toFloatRange != null) {
                        return max;
                    } else {
                        StringBuilder sb4 = new StringBuilder("interceptor ");
                        sb4.append(increasebuffer);
                        sb4.append(" returned a response with no body");
                        throw new IllegalStateException(sb4.toString());
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder("network interceptor ");
                    sb5.append(this.IsOverlapping.get(this.toFloatRange - 1));
                    sb5.append(" must call proceed() exactly once");
                    throw new IllegalStateException(sb5.toString());
                }
            } else {
                throw new AssertionError();
            }
        }
    }
}
