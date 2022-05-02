package id.dana.data.network;

import androidx.annotation.Keep;
import o.RenderCallContext;

@Keep
public class ResultResponse<T> extends RenderCallContext.Builder {
    T result;

    public T getResult() {
        return this.result;
    }
}
