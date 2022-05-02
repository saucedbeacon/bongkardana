package o;

import java.util.Iterator;
import java.util.concurrent.locks.StampedLock;
import org.mozilla.javascript.ScriptableObject;

public class UniResultPageRpcFacade extends getExceptionMessage {
    static final /* synthetic */ boolean getMax = (!UniResultPageRpcFacade.class.desiredAssertionStatus());
    private final StampedLock length = new StampedLock();

    public UniResultPageRpcFacade(int i) {
        super(i);
    }

    public final int setMin() {
        long tryOptimisticRead = this.length.tryOptimisticRead();
        int min = this.setMax.setMin();
        if (this.length.validate(tryOptimisticRead)) {
            return min;
        }
        long readLock = this.length.readLock();
        try {
            return this.setMax.setMin();
        } finally {
            this.length.unlockRead(readLock);
        }
    }

    public final int getMax() {
        if (getMax || this.length.isReadLocked()) {
            return this.setMax.setMin();
        }
        throw new AssertionError();
    }

    public final boolean getMin() {
        long tryOptimisticRead = this.length.tryOptimisticRead();
        boolean min = this.setMax.getMin();
        if (this.length.validate(tryOptimisticRead)) {
            return min;
        }
        long readLock = this.length.readLock();
        try {
            return this.setMax.getMin();
        } finally {
            this.length.unlockRead(readLock);
        }
    }

    public final ScriptableObject.getMax setMin(Object obj, int i, ScriptableObject.SlotAccess slotAccess) {
        long writeLock = this.length.writeLock();
        try {
            if (slotAccess != ScriptableObject.SlotAccess.QUERY) {
                if (!getMax) {
                    if (!this.length.isWriteLocked()) {
                        throw new AssertionError();
                    }
                }
                super.length();
            }
            return this.setMax.setMin(obj, i, slotAccess);
        } finally {
            this.length.unlockWrite(writeLock);
        }
    }

    public final ScriptableObject.getMax getMax(Object obj, int i) {
        long tryOptimisticRead = this.length.tryOptimisticRead();
        ScriptableObject.getMax max = this.setMax.getMax(obj, i);
        if (this.length.validate(tryOptimisticRead)) {
            return max;
        }
        long readLock = this.length.readLock();
        try {
            return this.setMax.getMax(obj, i);
        } finally {
            this.length.unlockRead(readLock);
        }
    }

    public final void getMin(ScriptableObject.getMax getmax) {
        long writeLock = this.length.writeLock();
        try {
            if (!getMax) {
                if (!this.length.isWriteLocked()) {
                    throw new AssertionError();
                }
            }
            super.length();
            this.setMax.getMin(getmax);
        } finally {
            this.length.unlockWrite(writeLock);
        }
    }

    public final void setMin(Object obj, int i) {
        long writeLock = this.length.writeLock();
        try {
            this.setMax.setMin(obj, i);
        } finally {
            this.length.unlockWrite(writeLock);
        }
    }

    public final long setMax() {
        return this.length.readLock();
    }

    public final void length(long j) {
        this.length.unlockRead(j);
    }

    public Iterator<ScriptableObject.getMax> iterator() {
        if (getMax || this.length.isReadLocked()) {
            return this.setMax.iterator();
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    public final void length() {
        if (getMax || this.length.isWriteLocked()) {
            super.length();
            return;
        }
        throw new AssertionError();
    }
}
