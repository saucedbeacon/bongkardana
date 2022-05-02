package o;

class AbstractKeyboard implements Runnable, initializeKeyboard {
    private final onInput eventBus;
    private final isShowKeyboard queue = new isShowKeyboard();

    AbstractKeyboard(onInput oninput) {
        this.eventBus = oninput;
    }

    public void enqueue(initializeNoneKeyboard initializenonekeyboard, Object obj) {
        this.queue.enqueue(switchKeyboard.obtainPendingPost(initializenonekeyboard, obj));
        this.eventBus.getExecutorService().execute(this);
    }

    public void run() {
        switchKeyboard poll = this.queue.poll();
        if (poll != null) {
            this.eventBus.invokeSubscriber(poll);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
