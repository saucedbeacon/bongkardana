package o;

final class unregisterCallback implements Runnable {
    private final IMultiInstanceInvalidationService setMax;

    public unregisterCallback(IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
        this.setMax = iMultiInstanceInvalidationService;
    }

    public final void run() {
        this.setMax.setMin = null;
    }
}
