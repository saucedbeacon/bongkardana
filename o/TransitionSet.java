package o;

final class TransitionSet implements Runnable {
    private final getMode setMax;

    public TransitionSet(getMode getmode) {
        this.setMax = getmode;
    }

    public final void run() {
        this.setMax.setMin.finishAffinity();
    }
}
