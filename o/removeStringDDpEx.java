package o;

import androidx.annotation.Nullable;
import io.split.android.client.network.HttpStreamResponse;
import java.io.BufferedReader;

public final class removeStringDDpEx extends removeByteArray implements HttpStreamResponse {
    private BufferedReader mData;

    removeStringDDpEx(int i) {
        this(i, (BufferedReader) null);
    }

    public removeStringDDpEx(int i, BufferedReader bufferedReader) {
        super(i);
        this.mData = bufferedReader;
    }

    @Nullable
    public final BufferedReader getBufferedReader() {
        return this.mData;
    }
}
