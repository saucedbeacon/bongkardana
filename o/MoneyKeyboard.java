package o;

public final class MoneyKeyboard<T> implements KeyboardManager {
    private T getMax;

    public MoneyKeyboard(T t) {
        this.getMax = t;
    }

    public final void describeTo(CountValue countValue) {
        countValue.getMax(this.getMax);
    }
}
