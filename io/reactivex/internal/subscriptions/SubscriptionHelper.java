package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.SecuritySignature;
import o.getFmt;
import o.getPluginInfo;
import o.setRefreshAnimation;

public enum SubscriptionHelper implements getFmt {
    CANCELLED;

    public final void cancel() {
    }

    public final void request(long j) {
    }

    public static boolean validate(getFmt getfmt, getFmt getfmt2) {
        if (getfmt2 == null) {
            SecuritySignature.getMax((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (getfmt == null) {
            return true;
        } else {
            getfmt2.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public static void reportSubscriptionSet() {
        SecuritySignature.getMax((Throwable) new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        SecuritySignature.getMax((Throwable) new IllegalArgumentException("n > 0 required but it was ".concat(String.valueOf(j))));
        return false;
    }

    public static void reportMoreProduced(long j) {
        SecuritySignature.getMax((Throwable) new ProtocolViolationException("More produced than requested: ".concat(String.valueOf(j))));
    }

    public static boolean set(AtomicReference<getFmt> atomicReference, getFmt getfmt) {
        getFmt getfmt2;
        do {
            getfmt2 = atomicReference.get();
            if (getfmt2 == CANCELLED) {
                if (getfmt == null) {
                    return false;
                }
                getfmt.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(getfmt2, getfmt));
        if (getfmt2 == null) {
            return true;
        }
        getfmt2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<getFmt> atomicReference, getFmt getfmt) {
        setRefreshAnimation.getMax(getfmt, "s is null");
        if (atomicReference.compareAndSet((Object) null, getfmt)) {
            return true;
        }
        getfmt.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean replace(AtomicReference<getFmt> atomicReference, getFmt getfmt) {
        getFmt getfmt2;
        do {
            getfmt2 = atomicReference.get();
            if (getfmt2 == CANCELLED) {
                if (getfmt == null) {
                    return false;
                }
                getfmt.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(getfmt2, getfmt));
        return true;
    }

    public static boolean cancel(AtomicReference<getFmt> atomicReference) {
        getFmt andSet;
        getFmt getfmt = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (getfmt == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == CANCELLED) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean deferredSetOnce(AtomicReference<getFmt> atomicReference, AtomicLong atomicLong, getFmt getfmt) {
        if (!setOnce(atomicReference, getfmt)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        getfmt.request(andSet);
        return true;
    }

    public static void deferredRequest(AtomicReference<getFmt> atomicReference, AtomicLong atomicLong, long j) {
        getFmt getfmt = atomicReference.get();
        if (getfmt != null) {
            getfmt.request(j);
        } else if (validate(j)) {
            getPluginInfo.getMax(atomicLong, j);
            getFmt getfmt2 = atomicReference.get();
            if (getfmt2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    getfmt2.request(andSet);
                }
            }
        }
    }

    public static boolean setOnce(AtomicReference<getFmt> atomicReference, getFmt getfmt, long j) {
        if (!setOnce(atomicReference, getfmt)) {
            return false;
        }
        getfmt.request(j);
        return true;
    }
}
