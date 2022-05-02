package o;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import o.LogContextImpl;
import o.NotSendableException;

final class appendEvent<T> implements LogContextImpl.AnonymousClass2<NotSendableException, T> {
    private final Gson getMax;
    private final TypeAdapter<T> getMin;

    appendEvent(Gson gson, TypeAdapter<T> typeAdapter) {
        this.getMax = gson;
        this.getMin = typeAdapter;
    }

    /* access modifiers changed from: private */
    public T getMax(NotSendableException notSendableException) throws IOException {
        Gson gson = this.getMax;
        Reader reader = notSendableException.length;
        if (reader == null) {
            schedule max = notSendableException.getMax();
            translateRegularFrame min = notSendableException.getMin();
            reader = new NotSendableException.getMax(max, min != null ? min.setMin(initCloseCode.setMax) : initCloseCode.setMax);
            notSendableException.length = reader;
        }
        JsonReader newJsonReader = gson.newJsonReader(reader);
        try {
            T read = this.getMin.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            notSendableException.close();
        }
    }
}
