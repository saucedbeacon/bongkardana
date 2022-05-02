package o;

final class Flow {
    static fillInStackTrace getMax;
    static long setMax;

    private Flow() {
    }

    static fillInStackTrace length() {
        synchronized (Flow.class) {
            if (getMax == null) {
                return new fillInStackTrace();
            }
            fillInStackTrace fillinstacktrace = getMax;
            getMax = fillinstacktrace.equals;
            fillinstacktrace.equals = null;
            setMax -= 8192;
            return fillinstacktrace;
        }
    }

    static void setMin(fillInStackTrace fillinstacktrace) {
        if (fillinstacktrace.equals != null || fillinstacktrace.IsOverlapping != null) {
            throw new IllegalArgumentException();
        } else if (!fillinstacktrace.length) {
            synchronized (Flow.class) {
                if (setMax + 8192 <= 65536) {
                    setMax += 8192;
                    fillinstacktrace.equals = getMax;
                    fillinstacktrace.setMin = 0;
                    fillinstacktrace.getMin = 0;
                    getMax = fillinstacktrace;
                }
            }
        }
    }
}
