package o;

import com.bca.xco.widget.connection.httpclient.p;
import java.net.Proxy;

public final class onExtraCommand {
    public static boolean setMin(getRadius getradius, Proxy.Type type) {
        return !getradius.setMax() && type == Proxy.Type.HTTP;
    }

    public static String getMin(p pVar) {
        String max = pVar.getMax();
        String equals = pVar.equals();
        if (equals == null) {
            return max;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max);
        sb.append('?');
        sb.append(equals);
        return sb.toString();
    }
}
