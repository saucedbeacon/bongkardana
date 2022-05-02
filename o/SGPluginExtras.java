package o;

public final class SGPluginExtras {
    public static void getMax() {
        if (!SecuritySignature.getMin()) {
            return;
        }
        if ((Thread.currentThread() instanceof ISGPluginInfo) || SecuritySignature.getMax()) {
            StringBuilder sb = new StringBuilder("Attempt to block on a Scheduler ");
            sb.append(Thread.currentThread().getName());
            sb.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(sb.toString());
        }
    }
}
