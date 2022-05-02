package o;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class lookUpConstraintId {
    final setMin getMin = new setMin();
    final Map<String, getMax> setMax = new HashMap();

    lookUpConstraintId() {
    }

    /* access modifiers changed from: package-private */
    public final void getMin(String str) {
        getMax getmax;
        synchronized (this) {
            getMax getmax2 = this.setMax.get(str);
            if (getmax2 != null) {
                getmax = getmax2;
                if (getmax.length > 0) {
                    getmax.length--;
                    if (getmax.length == 0) {
                        getMax remove = this.setMax.remove(str);
                        if (remove.equals(getmax)) {
                            setMin setmin = this.getMin;
                            synchronized (setmin.length) {
                                if (setmin.length.size() < 10) {
                                    setmin.length.offer(remove);
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("Removed the wrong lock, expected to remove: ");
                            sb.append(getmax);
                            sb.append(", but actually removed: ");
                            sb.append(remove);
                            sb.append(", safeKey: ");
                            sb.append(str);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Cannot release a lock that is not held, safeKey: ");
                    sb2.append(str);
                    sb2.append(", interestedThreads: ");
                    sb2.append(getmax.length);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        getmax.getMax.unlock();
    }

    static class getMax {
        final Lock getMax = new ReentrantLock();
        int length;

        getMax() {
        }
    }

    static class setMin {
        final Queue<getMax> length = new ArrayDeque();

        setMin() {
        }

        /* access modifiers changed from: package-private */
        public final getMax length() {
            getMax poll;
            synchronized (this.length) {
                poll = this.length.poll();
            }
            return poll == null ? new getMax() : poll;
        }
    }
}
