package io.reactivex.internal.util;

import java.io.Serializable;
import o.GriverProgressBar;
import o.getFmt;
import o.getbEva;
import o.setRefreshAnimation;

public enum NotificationLite {
    COMPLETE;

    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }

    static final class setMax implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;
        final Throwable e;

        setMax(Throwable th) {
            this.e = th;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Error[");
            sb.append(this.e);
            sb.append("]");
            return sb.toString();
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof setMax) {
                return setRefreshAnimation.getMin(this.e, ((setMax) obj).e);
            }
            return false;
        }
    }

    static final class length implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final getFmt upstream;

        length(getFmt getfmt) {
            this.upstream = getfmt;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Subscription[");
            sb.append(this.upstream);
            sb.append("]");
            return sb.toString();
        }
    }

    static final class getMin implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final GriverProgressBar.UpdateRunnable upstream;

        getMin(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.upstream = updateRunnable;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Disposable[");
            sb.append(this.upstream);
            sb.append("]");
            return sb.toString();
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object error(Throwable th) {
        return new setMax(th);
    }

    public static Object subscription(getFmt getfmt) {
        return new length(getfmt);
    }

    public static Object disposable(GriverProgressBar.UpdateRunnable updateRunnable) {
        return new getMin(updateRunnable);
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isError(Object obj) {
        return obj instanceof setMax;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof length;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof getMin;
    }

    public static Throwable getError(Object obj) {
        return ((setMax) obj).e;
    }

    public static getFmt getSubscription(Object obj) {
        return ((length) obj).upstream;
    }

    public static GriverProgressBar.UpdateRunnable getDisposable(Object obj) {
        return ((getMin) obj).upstream;
    }

    public static <T> boolean accept(Object obj, getbEva<? super T> getbeva) {
        if (obj == COMPLETE) {
            getbeva.onComplete();
            return true;
        } else if (obj instanceof setMax) {
            getbeva.onError(((setMax) obj).e);
            return true;
        } else {
            getbeva.onNext(obj);
            return false;
        }
    }

    public static <T> boolean accept(Object obj, GriverProgressBar<? super T> griverProgressBar) {
        if (obj == COMPLETE) {
            griverProgressBar.onComplete();
            return true;
        } else if (obj instanceof setMax) {
            griverProgressBar.onError(((setMax) obj).e);
            return true;
        } else {
            griverProgressBar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, getbEva<? super T> getbeva) {
        if (obj == COMPLETE) {
            getbeva.onComplete();
            return true;
        } else if (obj instanceof setMax) {
            getbeva.onError(((setMax) obj).e);
            return true;
        } else if (obj instanceof length) {
            getbeva.onSubscribe(((length) obj).upstream);
            return false;
        } else {
            getbeva.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, GriverProgressBar<? super T> griverProgressBar) {
        if (obj == COMPLETE) {
            griverProgressBar.onComplete();
            return true;
        } else if (obj instanceof setMax) {
            griverProgressBar.onError(((setMax) obj).e);
            return true;
        } else if (obj instanceof getMin) {
            griverProgressBar.onSubscribe(((getMin) obj).upstream);
            return false;
        } else {
            griverProgressBar.onNext(obj);
            return false;
        }
    }
}
