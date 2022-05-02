package o;

import io.split.android.client.network.HttpResponse;

public final class putStringDDp extends removeByteArray implements HttpResponse {
    private String mData;

    putStringDDp(int i) {
        this(i, (String) null);
    }

    public putStringDDp(int i, String str) {
        super(i);
        this.mData = str;
    }

    public final String getData() {
        return this.mData;
    }
}
