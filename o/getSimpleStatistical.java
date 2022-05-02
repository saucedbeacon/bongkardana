package o;

import javax.annotation.Nullable;

final class getSimpleStatistical {
    @Nullable
    static recordStartConnAllTime getMax;
    static long setMin;

    private getSimpleStatistical() {
    }

    static recordStartConnAllTime getMin() {
        synchronized (getSimpleStatistical.class) {
            if (getMax == null) {
                return new recordStartConnAllTime();
            }
            recordStartConnAllTime recordstartconnalltime = getMax;
            getMax = recordstartconnalltime.toFloatRange;
            recordstartconnalltime.toFloatRange = null;
            setMin -= 8192;
            return recordstartconnalltime;
        }
    }

    static void setMax(recordStartConnAllTime recordstartconnalltime) {
        if (recordstartconnalltime.toFloatRange != null || recordstartconnalltime.toIntRange != null) {
            throw new IllegalArgumentException();
        } else if (!recordstartconnalltime.length) {
            synchronized (getSimpleStatistical.class) {
                if (setMin + 8192 <= 65536) {
                    setMin += 8192;
                    recordstartconnalltime.toFloatRange = getMax;
                    recordstartconnalltime.setMax = 0;
                    recordstartconnalltime.setMin = 0;
                    getMax = recordstartconnalltime;
                }
            }
        }
    }
}
