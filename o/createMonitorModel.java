package o;

import java.io.IOException;

final class createMonitorModel implements recordWsHsTime {
    private recordStartConnAllTime getMax;
    private final schedule getMin;
    private int length;
    private boolean setMax;
    private final submitLazy setMin;
    private long toIntRange;

    createMonitorModel(schedule schedule) {
        this.getMin = schedule;
        submitLazy max = schedule.getMax();
        this.setMin = max;
        recordStartConnAllTime recordstartconnalltime = max.setMin;
        this.getMax = recordstartconnalltime;
        this.length = recordstartconnalltime != null ? recordstartconnalltime.setMin : -1;
    }

    public final long a_(submitLazy submitlazy, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.setMax) {
            recordStartConnAllTime recordstartconnalltime = this.getMax;
            if (recordstartconnalltime != null && (recordstartconnalltime != this.setMin.setMin || this.length != this.setMin.setMin.setMin)) {
                throw new IllegalStateException("Peek source is invalid because upstream source was used");
            } else if (j == 0) {
                return 0;
            } else {
                if (!this.getMin.getMin(this.toIntRange + 1)) {
                    return -1;
                }
                if (this.getMax == null && this.setMin.setMin != null) {
                    this.getMax = this.setMin.setMin;
                    this.length = this.setMin.setMin.setMin;
                }
                long min = Math.min(j, this.setMin.setMax - this.toIntRange);
                this.setMin.getMax(submitlazy, this.toIntRange, min);
                this.toIntRange += min;
                return min;
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final recordSSLTime getMin() {
        return this.getMin.getMin();
    }

    public final void close() throws IOException {
        this.setMax = true;
    }
}
