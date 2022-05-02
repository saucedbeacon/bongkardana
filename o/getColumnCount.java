package o;

import com.google.android.datatransport.Transformer;
import com.google.protobuf.AbstractMessageLite;

public final class getColumnCount implements Transformer {
    public static final getColumnCount setMax = new getColumnCount();

    public final Object apply(Object obj) {
        return ((AbstractMessageLite) obj).toByteArray();
    }
}
