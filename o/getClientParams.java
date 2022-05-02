package o;

import android.view.View;

public final class getClientParams implements View.OnClickListener {
    private final message getMin;

    public getClientParams(message message) {
        this.getMin = message;
    }

    public final void onClick(View view) {
        this.getMin.process();
    }
}
