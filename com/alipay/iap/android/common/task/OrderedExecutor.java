package com.alipay.iap.android.common.task;

import com.alipay.iap.android.common.log.LoggerWrapper;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OrderedExecutor<K> {
    /* access modifiers changed from: private */
    public final Executor executor;
    private final Map<K, OrderedExecutor<K>.Task> tasks = new HashMap();

    public OrderedExecutor(Executor executor2) {
        this.executor = executor2;
    }

    public synchronized void submit(K k, Runnable runnable) {
        Task task = this.tasks.get(k);
        if (task == null) {
            task = new Task();
            this.tasks.put(k, task);
        }
        task.add(runnable);
    }

    class Task implements Runnable {
        private final Lock lock = new ReentrantLock();
        private final Queue<Runnable> queue = new LinkedList();

        Task() {
        }

        public void add(Runnable runnable) {
            this.lock.lock();
            try {
                boolean isEmpty = this.queue.isEmpty();
                this.queue.offer(runnable);
                if (isEmpty) {
                    OrderedExecutor.this.executor.execute(this);
                }
            } finally {
                this.lock.unlock();
            }
        }

        public void run() {
            this.lock.lock();
            try {
                Runnable peek = this.queue.peek();
                if (peek != null) {
                    try {
                        peek.run();
                        this.lock.lock();
                        try {
                            this.queue.poll();
                            if (!this.queue.isEmpty()) {
                                OrderedExecutor.this.executor.execute(this);
                            }
                        } catch (Throwable th) {
                            this.lock.unlock();
                            throw th;
                        }
                        this.lock.unlock();
                        return;
                    } catch (Throwable th2) {
                        try {
                            LoggerWrapper.e("OrderedExecutor", "task run finally", th2);
                        } catch (Throwable th3) {
                            this.lock.unlock();
                            throw th3;
                        }
                    }
                } else {
                    return;
                }
                this.lock.unlock();
                throw th;
            } finally {
                this.lock.unlock();
            }
        }
    }

    public Executor getExecutor() {
        return this.executor;
    }
}
