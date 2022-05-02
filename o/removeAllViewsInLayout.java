package o;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;

public final class removeAllViewsInLayout implements ValueEncoder {
    public static final removeAllViewsInLayout setMin = new removeAllViewsInLayout();

    public final void encode(Object obj, Object obj2) {
        ((ValueEncoderContext) obj2).add(((Boolean) obj).booleanValue());
    }
}
