package o;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;

public final class removeDetachedView implements ValueEncoder {
    public static final removeDetachedView getMin = new removeDetachedView();

    public final void encode(Object obj, Object obj2) {
        ((ValueEncoderContext) obj2).add((String) obj);
    }
}
