package o;

import java.io.IOException;

public interface printError {
    public static final printError setMin = new printError() {
        public final boolean setMin(schedule schedule, int i) throws IOException {
            schedule.isInside((long) i);
            return true;
        }
    };

    boolean setMin(schedule schedule, int i) throws IOException;
}
