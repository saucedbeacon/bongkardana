package o;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.framing.Framedata;

public interface ensureLayoutState extends Framedata {
    String getMax() throws InvalidDataException;

    int setMin() throws InvalidFrameException;
}
