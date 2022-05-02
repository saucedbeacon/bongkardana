package com.alibaba.ariver.kernel.common.io;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import o.PlaybackStateCompat;

public class ByteArrayPool {

    /* renamed from: a  reason: collision with root package name */
    private final BytePool f9138a = new BytePool(12);
    private final int b;
    /* access modifiers changed from: private */
    public final Object c = new Object();
    private final AtomicBoolean d = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public int e = 0;

    public ByteArrayPool(int i) {
        this.b = i;
    }

    public byte[] getBuf(int i) {
        byte[] bArr;
        LinkedList linkedList = (LinkedList) this.f9138a.get(Integer.valueOf(i));
        if (linkedList == null || (bArr = (byte[]) linkedList.poll()) == null) {
            return new byte[i];
        }
        synchronized (this.c) {
            this.e -= bArr.length;
        }
        return bArr;
    }

    public void returnBuf(byte[] bArr) {
        if (bArr != null && bArr.length <= this.b) {
            synchronized (this.c) {
                this.e += bArr.length;
            }
            LinkedList linkedList = (LinkedList) this.f9138a.get(Integer.valueOf(bArr.length));
            if (linkedList == null) {
                ConcurrentLinkedList concurrentLinkedList = new ConcurrentLinkedList();
                concurrentLinkedList.offer(bArr);
                this.f9138a.put(Integer.valueOf(bArr.length), concurrentLinkedList);
            } else {
                linkedList.offer(bArr);
            }
            a();
        }
    }

    private void a() {
        if (!this.d.get() && this.e > this.b) {
            this.d.set(true);
            BytePool bytePool = this.f9138a;
            bytePool.trimToSize(bytePool.size() / 2);
            this.d.set(false);
        }
    }

    class BytePool extends PlaybackStateCompat.ErrorCode<Integer, LinkedList<byte[]>> {
        private BytePool(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        public void entryRemoved(boolean z, Integer num, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            synchronized (ByteArrayPool.this.c) {
                if (z || linkedList2 != null) {
                    int unused = ByteArrayPool.this.e = ByteArrayPool.this.e - (num.intValue() * linkedList.size());
                }
            }
        }
    }

    class ConcurrentLinkedList<T> extends LinkedList<T> {
        private ConcurrentLinkedList() {
        }

        public T poll() {
            T poll;
            synchronized (this) {
                poll = super.poll();
            }
            return poll;
        }

        public boolean offer(T t) {
            boolean offer;
            synchronized (this) {
                offer = super.offer(t);
            }
            return offer;
        }
    }
}
