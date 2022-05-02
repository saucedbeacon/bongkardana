package o;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

final class DefaultMonitorPrinter implements setOkButtonText {
    private int getMin = 0;
    private LinkedList<setOkButtonText> length = new LinkedList<>();
    private final char setMin;

    DefaultMonitorPrinter(char c) {
        this.setMin = c;
    }

    public final char length() {
        return this.setMin;
    }

    public final char getMax() {
        return this.setMin;
    }

    public final int getMin() {
        return this.getMin;
    }

    /* access modifiers changed from: package-private */
    public final void length(setOkButtonText setokbuttontext) {
        boolean z;
        int min;
        int min2 = setokbuttontext.getMin();
        ListIterator<setOkButtonText> listIterator = this.length.listIterator();
        do {
            if (listIterator.hasNext()) {
                min = listIterator.next().getMin();
                if (min2 > min) {
                    listIterator.previous();
                    listIterator.add(setokbuttontext);
                    z = true;
                }
            } else {
                z = false;
            }
            if (!z) {
                this.length.add(setokbuttontext);
                this.getMin = min2;
                return;
            }
            return;
        } while (min2 != min);
        StringBuilder sb = new StringBuilder("Cannot add two delimiter processors for char '");
        sb.append(this.setMin);
        sb.append("' and minimum length ");
        sb.append(min2);
        throw new IllegalArgumentException(sb.toString());
    }

    private setOkButtonText getMax(int i) {
        Iterator<setOkButtonText> it = this.length.iterator();
        while (it.hasNext()) {
            setOkButtonText next = it.next();
            if (next.getMin() <= i) {
                return next;
            }
        }
        return this.length.getFirst();
    }

    public final int getMax(getEditText getedittext, getEditText getedittext2) {
        return getMax(getedittext.getMax()).getMax(getedittext, getedittext2);
    }

    public final void getMax(WSContextUtil wSContextUtil, WSContextUtil wSContextUtil2, int i) {
        getMax(i).getMax(wSContextUtil, wSContextUtil2, i);
    }
}
