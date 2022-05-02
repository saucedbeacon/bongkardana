package o;

abstract class tracePerf {
    static boolean getMin(int i) {
        return 2 <= i && i <= 81;
    }

    static boolean length(int i) {
        return -64 <= i && i <= 0;
    }

    tracePerf() {
    }

    static boolean setMin(int i) {
        return length(i) || getMin(i);
    }
}
