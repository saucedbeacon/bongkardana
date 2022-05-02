package com.alipay.iap.android.common.task.transaction;

import com.alipay.iap.android.common.log.LoggerWrapper;
import java.util.ArrayDeque;
import java.util.Iterator;

public class TransactionExecutor {
    static final String TAG = "TransactionExecutor";
    volatile Transaction mActive;
    final ArrayDeque<Transaction> mTransactions = new ArrayDeque<>();

    public String addTransaction(Transaction transaction) {
        synchronized (this.mTransactions) {
            this.mTransactions.offer(transaction);
        }
        if (this.mActive == null) {
            scheduleNext();
        } else {
            LoggerWrapper.v(TAG, "TransactionExecutor.execute(a transaction is running, so don't call scheduleNext())");
        }
        return transaction.f10667id;
    }

    public void removeTransaction(String str) {
        Iterator<Transaction> it = this.mTransactions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Transaction next = it.next();
            if (next.f10667id.equals(str)) {
                synchronized (this.mTransactions) {
                    this.mTransactions.remove(next);
                    break;
                }
            }
        }
        if (this.mActive != null && this.mActive.f10667id.equals(str)) {
            this.mActive = null;
        }
        if (this.mActive == null) {
            scheduleNext();
        } else {
            LoggerWrapper.v(TAG, "TransactionExecutor.execute(a transaction is running, so don't call scheduleNext())");
        }
    }

    private void scheduleNext() {
        Transaction transaction;
        synchronized (this.mTransactions) {
            this.mActive = this.mTransactions.poll();
            transaction = this.mActive;
        }
        if (this.mActive != null) {
            LoggerWrapper.d(TAG, "TransactionExecutor.scheduleNext()");
            transaction.run();
            return;
        }
        LoggerWrapper.d(TAG, "TransactionExecutor.scheduleNext(mTransactions is empty)");
    }

    public void shutdown() {
        this.mTransactions.clear();
    }
}
