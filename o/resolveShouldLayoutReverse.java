package o;

public final class resolveShouldLayoutReverse implements Runnable {
    private final getExtraLayoutSpace getMax;
    private final getReverseLayout length;

    public resolveShouldLayoutReverse(getReverseLayout getreverselayout, getExtraLayoutSpace getextralayoutspace) {
        this.length = getreverselayout;
        this.getMax = getextralayoutspace;
    }

    public final void run() {
        getReverseLayout.setMax(this.length, this.getMax);
    }
}
