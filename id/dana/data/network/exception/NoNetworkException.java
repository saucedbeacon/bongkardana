package id.dana.data.network.exception;

import android.content.Context;
import java.io.IOException;
import o.DialogRecyclerView;

public class NoNetworkException extends IOException {
    private final Context context;

    public NoNetworkException(Context context2) {
        this.context = context2;
    }

    public String getMessage() {
        return this.context.getString(DialogRecyclerView.setMax.no_network);
    }
}
