package o;

public final class enqueueContinuation implements getBindingAdapter<SystemForegroundService> {
    public static void setMin(SystemForegroundService systemForegroundService, checkIfMainProcess checkifmainprocess) {
        systemForegroundService.setMin = checkifmainprocess;
    }
}
