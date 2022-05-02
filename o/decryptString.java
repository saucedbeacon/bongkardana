package o;

import o.GriverProgressBar;

public final class decryptString {
    public static <T, U> void getMax(getRefreshViewHeight<T> getrefreshviewheight, GriverProgressBar<? super U> griverProgressBar, GriverProgressBar.UpdateRunnable updateRunnable, getStackTrace<T, U> getstacktrace) {
        int i = 1;
        while (!length(getstacktrace.getMax(), getrefreshviewheight.isEmpty(), griverProgressBar, getrefreshviewheight, updateRunnable, getstacktrace)) {
            while (true) {
                boolean max = getstacktrace.getMax();
                T poll = getrefreshviewheight.poll();
                boolean z = poll == null;
                if (!length(max, z, griverProgressBar, getrefreshviewheight, updateRunnable, getstacktrace)) {
                    if (!z) {
                        getstacktrace.setMin(griverProgressBar, poll);
                    } else {
                        i = getstacktrace.setMax(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    private static <T, U> boolean length(boolean z, boolean z2, GriverProgressBar<?> griverProgressBar, GriverPullRefreshService<?> griverPullRefreshService, GriverProgressBar.UpdateRunnable updateRunnable, getStackTrace<T, U> getstacktrace) {
        if (getstacktrace.setMin()) {
            griverPullRefreshService.clear();
            updateRunnable.dispose();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable min = getstacktrace.getMin();
            if (min != null) {
                griverPullRefreshService.clear();
                if (updateRunnable != null) {
                    updateRunnable.dispose();
                }
                griverProgressBar.onError(min);
                return true;
            } else if (!z2) {
                return false;
            } else {
                if (updateRunnable != null) {
                    updateRunnable.dispose();
                }
                griverProgressBar.onComplete();
                return true;
            }
        }
    }
}
