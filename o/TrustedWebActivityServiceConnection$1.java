package o;

import com.bca.xco.widget.connection.httpclient.s;
import java.net.ProtocolException;

public final class TrustedWebActivityServiceConnection$1 {
    public final int getMax;
    public final String getMin;
    public final s setMax;

    private TrustedWebActivityServiceConnection$1(s sVar, int i, String str) {
        this.setMax = sVar;
        this.getMax = i;
        this.getMin = str;
    }

    public static TrustedWebActivityServiceConnection$1 length(String str) {
        s sVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                sVar = s.HTTP_1_0;
            } else if (charAt == 1) {
                sVar = s.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            sVar = s.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                }
                return new TrustedWebActivityServiceConnection$1(sVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setMax == s.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.getMax);
        if (this.getMin != null) {
            sb.append(' ');
            sb.append(this.getMin);
        }
        return sb.toString();
    }
}
