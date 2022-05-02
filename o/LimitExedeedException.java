package o;

import java.io.IOException;
import java.net.Socket;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import o.Draft_75;
import o.InvalidHandshakeException;

public abstract class LimitExedeedException {
    public static LimitExedeedException length;

    public abstract Socket getMax(Draft_10 draft_10, postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, isFin isfin);

    public abstract Framedata getMax(Draft_10 draft_10);

    public abstract boolean getMin(Draft_10 draft_10, setFin setfin);

    @Nullable
    public abstract IOException length(checkAlloc checkalloc, @Nullable IOException iOException);

    public abstract void length(Draft_75.length length2, String str, String str2);

    public abstract boolean length(postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver2);

    public abstract int setMax(InvalidHandshakeException.getMin getmin);

    public abstract setFin setMax(Draft_10 draft_10, postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, isFin isfin, getCloseCode getclosecode);

    public abstract void setMax(Draft_10 draft_10, setFin setfin);

    public abstract void setMax(Draft_75.length length2, String str);

    public abstract void setMax(generateFinalKey generatefinalkey, SSLSocket sSLSocket, boolean z);
}
