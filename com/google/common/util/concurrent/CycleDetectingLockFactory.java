package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
@CanIgnoreReturnValue
@Beta
public class CycleDetectingLockFactory {
    private static final ThreadLocal<ArrayList<LockGraphNode>> acquiredLocks = new ThreadLocal<ArrayList<LockGraphNode>>() {
        /* access modifiers changed from: protected */
        public final ArrayList<LockGraphNode> initialValue() {
            return Lists.newArrayListWithCapacity(3);
        }
    };
    private static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, LockGraphNode>> lockGraphNodesPerType = new MapMaker().weakKeys().makeMap();
    /* access modifiers changed from: private */
    public static final Logger logger = Logger.getLogger(CycleDetectingLockFactory.class.getName());
    final Policy policy;

    interface CycleDetectingLock {
        LockGraphNode getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    @Beta
    public enum Policies implements Policy {
        THROW {
            public final void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN {
            public final void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.logger.log(Level.SEVERE, "Detected potential deadlock", potentialDeadlockException);
            }
        },
        DISABLED {
            public final void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }
    }

    @Beta
    public interface Policy {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    public static CycleDetectingLockFactory newInstance(Policy policy2) {
        return new CycleDetectingLockFactory(policy2);
    }

    public ReentrantLock newReentrantLock(String str) {
        return newReentrantLock(str, false);
    }

    public ReentrantLock newReentrantLock(String str, boolean z) {
        return this.policy == Policies.DISABLED ? new ReentrantLock(z) : new CycleDetectingReentrantLock(new LockGraphNode(str), z);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str) {
        return newReentrantReadWriteLock(str, false);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String str, boolean z) {
        return this.policy == Policies.DISABLED ? new ReentrantReadWriteLock(z) : new CycleDetectingReentrantReadWriteLock(new LockGraphNode(str), z);
    }

    public static <E extends Enum<E>> WithExplicitOrdering<E> newInstanceWithExplicitOrdering(Class<E> cls, Policy policy2) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(policy2);
        return new WithExplicitOrdering<>(policy2, getOrCreateNodes(cls));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<? extends java.lang.Enum>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<? extends java.lang.Enum, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> getOrCreateNodes(java.lang.Class<? extends java.lang.Enum> r2) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum>, java.util.Map<? extends java.lang.Enum, com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode>> r0 = lockGraphNodesPerType
            java.lang.Object r0 = r0.get(r2)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            java.util.Map r0 = createNodes(r2)
            java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum>, java.util.Map<? extends java.lang.Enum, com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode>> r1 = lockGraphNodesPerType
            java.lang.Object r2 = r1.putIfAbsent(r2, r0)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r0)
            java.util.Map r2 = (java.util.Map) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.CycleDetectingLockFactory.getOrCreateNodes(java.lang.Class):java.util.Map");
    }

    @VisibleForTesting
    static <E extends Enum<E>> Map<E, LockGraphNode> createNodes(Class<E> cls) {
        EnumMap<K, V> newEnumMap = Maps.newEnumMap(cls);
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(length);
        int i = 0;
        for (Enum enumR : enumArr) {
            LockGraphNode lockGraphNode = new LockGraphNode(getLockName(enumR));
            newArrayListWithCapacity.add(lockGraphNode);
            newEnumMap.put(enumR, lockGraphNode);
        }
        for (int i2 = 1; i2 < length; i2++) {
            ((LockGraphNode) newArrayListWithCapacity.get(i2)).checkAcquiredLocks(Policies.THROW, newArrayListWithCapacity.subList(0, i2));
        }
        while (i < length - 1) {
            i++;
            ((LockGraphNode) newArrayListWithCapacity.get(i)).checkAcquiredLocks(Policies.DISABLED, newArrayListWithCapacity.subList(i, length));
        }
        return Collections.unmodifiableMap(newEnumMap);
    }

    private static String getLockName(Enum<?> enumR) {
        StringBuilder sb = new StringBuilder();
        sb.append(enumR.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(enumR.name());
        return sb.toString();
    }

    @Beta
    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {
        private final Map<E, LockGraphNode> lockGraphNodes;

        @VisibleForTesting
        WithExplicitOrdering(Policy policy, Map<E, LockGraphNode> map) {
            super(policy);
            this.lockGraphNodes = map;
        }

        public final ReentrantLock newReentrantLock(E e) {
            return newReentrantLock(e, false);
        }

        public final ReentrantLock newReentrantLock(E e, boolean z) {
            if (this.policy == Policies.DISABLED) {
                return new ReentrantLock(z);
            }
            return new CycleDetectingReentrantLock(this.lockGraphNodes.get(e), z);
        }

        public final ReentrantReadWriteLock newReentrantReadWriteLock(E e) {
            return newReentrantReadWriteLock(e, false);
        }

        public final ReentrantReadWriteLock newReentrantReadWriteLock(E e, boolean z) {
            if (this.policy == Policies.DISABLED) {
                return new ReentrantReadWriteLock(z);
            }
            return new CycleDetectingReentrantReadWriteLock(this.lockGraphNodes.get(e), z);
        }
    }

    private CycleDetectingLockFactory(Policy policy2) {
        this.policy = (Policy) Preconditions.checkNotNull(policy2);
    }

    static class ExampleStackTrace extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.of(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), LockGraphNode.class.getName());

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        ExampleStackTrace(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r4, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode r5) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = r4.getLockName()
                r0.append(r4)
                java.lang.String r4 = " -> "
                r0.append(r4)
                java.lang.String r4 = r5.getLockName()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                java.lang.StackTraceElement[] r4 = r3.getStackTrace()
                int r5 = r4.length
                r0 = 0
            L_0x0025:
                if (r0 >= r5) goto L_0x005a
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory$WithExplicitOrdering> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering.class
                java.lang.String r1 = r1.getName()
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x003f
                java.lang.StackTraceElement[] r4 = EMPTY_STACK_TRACE
                r3.setStackTrace(r4)
                return
            L_0x003f:
                com.google.common.collect.ImmutableSet<java.lang.String> r1 = EXCLUDED_CLASS_NAMES
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L_0x0057
                java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r0, r5)
                java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4
                r3.setStackTrace(r4)
                return
            L_0x0057:
                int r0 = r0 + 1
                goto L_0x0025
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.<init>(com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode):void");
        }
    }

    @Beta
    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        private PotentialDeadlockException(LockGraphNode lockGraphNode, LockGraphNode lockGraphNode2, ExampleStackTrace exampleStackTrace) {
            super(lockGraphNode, lockGraphNode2);
            this.conflictingStackTrace = exampleStackTrace;
            initCause(exampleStackTrace);
        }

        public final ExampleStackTrace getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        public final String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    static class LockGraphNode {
        final Map<LockGraphNode, ExampleStackTrace> allowedPriorLocks = new MapMaker().weakKeys().makeMap();
        final Map<LockGraphNode, PotentialDeadlockException> disallowedPriorLocks = new MapMaker().weakKeys().makeMap();
        final String lockName;

        LockGraphNode(String str) {
            this.lockName = (String) Preconditions.checkNotNull(str);
        }

        /* access modifiers changed from: package-private */
        public String getLockName() {
            return this.lockName;
        }

        /* access modifiers changed from: package-private */
        public void checkAcquiredLocks(Policy policy, List<LockGraphNode> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                checkAcquiredLock(policy, list.get(i));
            }
        }

        /* access modifiers changed from: package-private */
        public void checkAcquiredLock(Policy policy, LockGraphNode lockGraphNode) {
            Preconditions.checkState(this != lockGraphNode, "Attempted to acquire multiple locks with the same rank %s", (Object) lockGraphNode.getLockName());
            if (!this.allowedPriorLocks.containsKey(lockGraphNode)) {
                PotentialDeadlockException potentialDeadlockException = this.disallowedPriorLocks.get(lockGraphNode);
                if (potentialDeadlockException != null) {
                    policy.handlePotentialDeadlock(new PotentialDeadlockException(lockGraphNode, this, potentialDeadlockException.getConflictingStackTrace()));
                    return;
                }
                ExampleStackTrace findPathTo = lockGraphNode.findPathTo(this, Sets.newIdentityHashSet());
                if (findPathTo == null) {
                    this.allowedPriorLocks.put(lockGraphNode, new ExampleStackTrace(lockGraphNode, this));
                    return;
                }
                PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(lockGraphNode, this, findPathTo);
                this.disallowedPriorLocks.put(lockGraphNode, potentialDeadlockException2);
                policy.handlePotentialDeadlock(potentialDeadlockException2);
            }
        }

        @NullableDecl
        private ExampleStackTrace findPathTo(LockGraphNode lockGraphNode, Set<LockGraphNode> set) {
            if (!set.add(this)) {
                return null;
            }
            ExampleStackTrace exampleStackTrace = this.allowedPriorLocks.get(lockGraphNode);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry next : this.allowedPriorLocks.entrySet()) {
                LockGraphNode lockGraphNode2 = (LockGraphNode) next.getKey();
                ExampleStackTrace findPathTo = lockGraphNode2.findPathTo(lockGraphNode, set);
                if (findPathTo != null) {
                    ExampleStackTrace exampleStackTrace2 = new ExampleStackTrace(lockGraphNode2, this);
                    exampleStackTrace2.setStackTrace(((ExampleStackTrace) next.getValue()).getStackTrace());
                    exampleStackTrace2.initCause(findPathTo);
                    return exampleStackTrace2;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void aboutToAcquire(CycleDetectingLock cycleDetectingLock) {
        if (!cycleDetectingLock.isAcquiredByCurrentThread()) {
            ArrayList arrayList = acquiredLocks.get();
            LockGraphNode lockGraphNode = cycleDetectingLock.getLockGraphNode();
            lockGraphNode.checkAcquiredLocks(this.policy, arrayList);
            arrayList.add(lockGraphNode);
        }
    }

    /* access modifiers changed from: private */
    public static void lockStateChanged(CycleDetectingLock cycleDetectingLock) {
        if (!cycleDetectingLock.isAcquiredByCurrentThread()) {
            ArrayList arrayList = acquiredLocks.get();
            LockGraphNode lockGraphNode = cycleDetectingLock.getLockGraphNode();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == lockGraphNode) {
                    arrayList.remove(size);
                    return;
                }
            }
        }
    }

    final class CycleDetectingReentrantLock extends ReentrantLock implements CycleDetectingLock {
        private final LockGraphNode lockGraphNode;

        private CycleDetectingReentrantLock(LockGraphNode lockGraphNode2, boolean z) {
            super(z);
            this.lockGraphNode = (LockGraphNode) Preconditions.checkNotNull(lockGraphNode2);
        }

        public final LockGraphNode getLockGraphNode() {
            return this.lockGraphNode;
        }

        public final boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        public final void lock() {
            CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        public final void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        public final boolean tryLock() {
            CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        public final boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        public final void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this);
            }
        }
    }

    final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements CycleDetectingLock {
        private final LockGraphNode lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        private final CycleDetectingReentrantWriteLock writeLock;

        private CycleDetectingReentrantReadWriteLock(LockGraphNode lockGraphNode2, boolean z) {
            super(z);
            this.readLock = new CycleDetectingReentrantReadLock(this);
            this.writeLock = new CycleDetectingReentrantWriteLock(this);
            this.lockGraphNode = (LockGraphNode) Preconditions.checkNotNull(lockGraphNode2);
        }

        public final ReentrantReadWriteLock.ReadLock readLock() {
            return this.readLock;
        }

        public final ReentrantReadWriteLock.WriteLock writeLock() {
            return this.writeLock;
        }

        public final LockGraphNode getLockGraphNode() {
            return this.lockGraphNode;
        }

        public final boolean isAcquiredByCurrentThread() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }
    }

    class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {
        @Weak
        final CycleDetectingReentrantReadWriteLock readWriteLock;

        CycleDetectingReentrantReadLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        public void lock() {
            CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        public boolean tryLock() {
            CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }
    }

    class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {
        @Weak
        final CycleDetectingReentrantReadWriteLock readWriteLock;

        CycleDetectingReentrantWriteLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        public void lock() {
            CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        public boolean tryLock() {
            CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }
    }
}
