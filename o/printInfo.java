package o;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
final class printInfo extends getPidAndTid {
    private printInfo(Class<?> cls) {
        super(cls, (noteTraficConsume<Socket>) null, (noteTraficConsume<Socket>) null, (noteTraficConsume<Socket>) null, (noteTraficConsume<Socket>) null);
    }

    @Nullable
    @IgnoreJRERequirement
    public final String setMin(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }

    @Nullable
    public static MPaaSSCLogCatImpl length() {
        if (!MPaaSSCLogCatImpl.equals()) {
            return null;
        }
        try {
            if (setMax() >= 29) {
                return new printInfo(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public final void getMin(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) MPaaSSCLogCatImpl.setMax(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
