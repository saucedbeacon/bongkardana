package o;

final class isShowKeyboard {
    private switchKeyboard head;
    private switchKeyboard tail;

    isShowKeyboard() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void enqueue(switchKeyboard switchkeyboard) {
        if (switchkeyboard != null) {
            try {
                if (this.tail != null) {
                    this.tail.next = switchkeyboard;
                    this.tail = switchkeyboard;
                } else if (this.head == null) {
                    this.tail = switchkeyboard;
                    this.head = switchkeyboard;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized switchKeyboard poll() {
        switchKeyboard switchkeyboard;
        switchkeyboard = this.head;
        if (this.head != null) {
            switchKeyboard switchkeyboard2 = this.head.next;
            this.head = switchkeyboard2;
            if (switchkeyboard2 == null) {
                this.tail = null;
            }
        }
        return switchkeyboard;
    }

    /* access modifiers changed from: package-private */
    public final synchronized switchKeyboard poll(int i) throws InterruptedException {
        if (this.head == null) {
            wait((long) i);
        }
        return poll();
    }
}
