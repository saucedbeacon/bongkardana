package o;

import javax.annotation.Nullable;

final class recordStartConnAllTime {
    final byte[] getMax;
    boolean getMin;
    boolean length;
    int setMax;
    int setMin;
    recordStartConnAllTime toFloatRange;
    recordStartConnAllTime toIntRange;

    recordStartConnAllTime() {
        this.getMax = new byte[8192];
        this.getMin = true;
        this.length = false;
    }

    recordStartConnAllTime(byte[] bArr, int i, int i2) {
        this.getMax = bArr;
        this.setMin = i;
        this.setMax = i2;
        this.length = true;
        this.getMin = false;
    }

    @Nullable
    public final recordStartConnAllTime setMax() {
        recordStartConnAllTime recordstartconnalltime = this.toFloatRange;
        if (recordstartconnalltime == this) {
            recordstartconnalltime = null;
        }
        recordStartConnAllTime recordstartconnalltime2 = this.toIntRange;
        recordstartconnalltime2.toFloatRange = this.toFloatRange;
        this.toFloatRange.toIntRange = recordstartconnalltime2;
        this.toFloatRange = null;
        this.toIntRange = null;
        return recordstartconnalltime;
    }

    public final void setMin(recordStartConnAllTime recordstartconnalltime, int i) {
        if (recordstartconnalltime.getMin) {
            int i2 = recordstartconnalltime.setMax;
            if (i2 + i > 8192) {
                if (!recordstartconnalltime.length) {
                    int i3 = recordstartconnalltime.setMin;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = recordstartconnalltime.getMax;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        recordstartconnalltime.setMax -= recordstartconnalltime.setMin;
                        recordstartconnalltime.setMin = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.getMax, this.setMin, recordstartconnalltime.getMax, recordstartconnalltime.setMax, i);
            recordstartconnalltime.setMax += i;
            this.setMin += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
