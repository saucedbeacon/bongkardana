package o;

import java.util.Iterator;

public final class getAcceptedChars<T> implements Iterator<KeyboardManager> {
    private Iterator<T> getMin;

    public getAcceptedChars(Iterator<T> it) {
        this.getMin = it;
    }

    public final boolean hasNext() {
        return this.getMin.hasNext();
    }

    public final void remove() {
        this.getMin.remove();
    }

    public final /* synthetic */ Object next() {
        return new MoneyKeyboard(this.getMin.next());
    }
}
