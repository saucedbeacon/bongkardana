package o;

import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.google.common.base.Strings;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;

public final class titleTextType {
    public static boolean isSplitServiceReachable(URI uri) {
        try {
            return isReachable(new getByteArrayDDpEx(uri, "/api/version").build());
        } catch (URISyntaxException e) {
            createLoadingDialog.e("URI mal formed. Reachability function fails ", (Throwable) e);
            return false;
        }
    }

    public static boolean isReachable(URI uri) {
        int port = uri.getPort();
        String host = uri.getHost();
        if (port == -1) {
            String scheme = uri.getScheme();
            if (scheme.equals("http")) {
                port = 80;
            } else if (!scheme.equals("https")) {
                return false;
            } else {
                port = WebSocket.DEFAULT_WSS_PORT;
            }
        }
        return isReachable(host, port);
    }

    public static boolean isReachable(String str, int i) {
        return isReachable(str, i, 1500);
    }

    public static boolean isReachable(String str, int i, int i2) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(str, i), i2);
            socket.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static String sanitizeForFileName(String str) {
        return str == null ? "" : str.replaceAll("[^a-zA-Z0-9.\\-]", "_");
    }

    private static String sanitizeForFolderName(String str) {
        return str == null ? "" : str.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String convertApiKeyToFolder(String str) {
        String sanitizeForFolderName = sanitizeForFolderName(str);
        StringBuilder sb = new StringBuilder("$2a$10$");
        if (sanitizeForFolderName.length() >= 22) {
            sb.append(sanitizeForFolderName.substring(0, 22));
        } else {
            sb.append(sanitizeForFolderName);
            sb.append(Strings.repeat("A", 22 - sanitizeForFolderName.length()));
        }
        String hashpw = onUMIDInitFinished.hashpw(sanitizeForFolderName, sb.toString().substring(0, 29));
        if (hashpw != null) {
            return sanitizeForFolderName(hashpw);
        }
        return null;
    }
}
