package o;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;

public interface computeScrollExtent extends Framedata {
    void setMax(Framedata.Opcode opcode);

    void setMax(ByteBuffer byteBuffer) throws InvalidDataException;

    void setMin(boolean z);
}
