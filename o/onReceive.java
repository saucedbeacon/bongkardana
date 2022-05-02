package o;

final class onReceive implements Runnable {
    private final applyOptions setMax;

    public onReceive(applyOptions applyoptions) {
        this.setMax = applyoptions;
    }

    public final void run() {
        this.setMax.length.finish();
    }
}
