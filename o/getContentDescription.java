package o;

import android.view.View;

public final class getContentDescription implements Runnable {
    private final getSeletedItem getMin;
    private final View length;

    public getContentDescription(getSeletedItem getseleteditem, View view) {
        this.getMin = getseleteditem;
        this.length = view;
    }

    public final void run() {
        this.getMin.showAtLocation(this.length, 0, 0, 0);
    }
}
