package o;

import java.net.Proxy;

public final class HandshakeImpl1Client {
    public static boolean getMax(InvalidDataException invalidDataException, Proxy.Type type) {
        return !invalidDataException.getMax() && type == Proxy.Type.HTTP;
    }

    public static String setMin(Draft_76 draft_76) {
        String intRange = draft_76.toIntRange();
        String isInside = draft_76.isInside();
        if (isInside == null) {
            return intRange;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(intRange);
        sb.append('?');
        sb.append(isInside);
        return sb.toString();
    }
}
