package o;

public final class setHttpStatus {
    public static final printConnMonitorLog getMax = printConnMonitorLog.encodeUtf8(":status");
    public static final printConnMonitorLog getMin = printConnMonitorLog.encodeUtf8(":method");
    public static final printConnMonitorLog length = printConnMonitorLog.encodeUtf8(":");
    public static final printConnMonitorLog setMax = printConnMonitorLog.encodeUtf8(":scheme");
    public static final printConnMonitorLog setMin = printConnMonitorLog.encodeUtf8(":path");
    public static final printConnMonitorLog toFloatRange = printConnMonitorLog.encodeUtf8(":authority");
    public final printConnMonitorLog IsOverlapping;
    final int isInside;
    public final printConnMonitorLog toIntRange;

    interface setMin {
    }

    public setHttpStatus(String str, String str2) {
        this(printConnMonitorLog.encodeUtf8(str), printConnMonitorLog.encodeUtf8(str2));
    }

    public setHttpStatus(printConnMonitorLog printconnmonitorlog, String str) {
        this(printconnmonitorlog, printConnMonitorLog.encodeUtf8(str));
    }

    public setHttpStatus(printConnMonitorLog printconnmonitorlog, printConnMonitorLog printconnmonitorlog2) {
        this.toIntRange = printconnmonitorlog;
        this.IsOverlapping = printconnmonitorlog2;
        this.isInside = printconnmonitorlog.size() + 32 + printconnmonitorlog2.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setHttpStatus) {
            setHttpStatus sethttpstatus = (setHttpStatus) obj;
            if (!this.toIntRange.equals(sethttpstatus.toIntRange) || !this.IsOverlapping.equals(sethttpstatus.IsOverlapping)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.toIntRange.hashCode() + 527) * 31) + this.IsOverlapping.hashCode();
    }

    public final String toString() {
        return initCloseCode.length("%s: %s", this.toIntRange.utf8(), this.IsOverlapping.utf8());
    }
}
