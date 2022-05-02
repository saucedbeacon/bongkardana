package o;

import java.util.HashMap;
import java.util.Map;

public class putByteArrayDDpEx {
    private static final String ABLY_CLIENT_KEY = "SplitSDKClientKey";
    private static final int ABLY_CLIENT_KEY_LENGTH = 4;
    private static final String ACCEPT_TYPE_HEADER = "Accept";
    private static final String AUTHORIZATION = "Authorization";
    public static final String CACHE_CONTROL_HEADER = "Cache-Control";
    public static final String CACHE_CONTROL_NO_CACHE = "no-cache";
    private static final String CLIENT_MACHINE_IP_HEADER = "SplitSDKMachineIP";
    private static final String CLIENT_MACHINE_NAME_HEADER = "SplitSDKMachineName";
    private static final String CLIENT_VERSION = "SplitSDKVersion";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String CONTENT_TYPE_STREAM = "text/event-stream";
    private static final Map<String, String> noCacheHeaders;
    Map<String, String> mHeaders = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        noCacheHeaders = hashMap;
        hashMap.put("Cache-Control", CACHE_CONTROL_NO_CACHE);
    }

    public putByteArrayDDpEx addJsonTypeHeaders() {
        this.mHeaders.put("Content-Type", "application/json");
        this.mHeaders.put("Accept", "application/json");
        return this;
    }

    public putByteArrayDDpEx addStreamingTypeHeaders() {
        this.mHeaders.put("Content-Type", CONTENT_TYPE_STREAM);
        return this;
    }

    public putByteArrayDDpEx setApiToken(String str) {
        this.mHeaders.put("Authorization", "Bearer ".concat(String.valueOf(str)));
        return this;
    }

    public putByteArrayDDpEx setAblyApiToken(String str) {
        this.mHeaders.put(ABLY_CLIENT_KEY, str.substring(str.length() - 4));
        return this;
    }

    public putByteArrayDDpEx setHostname(String str) {
        if (str != null) {
            this.mHeaders.put(CLIENT_MACHINE_NAME_HEADER, str);
        }
        return this;
    }

    public putByteArrayDDpEx setHostIp(String str) {
        if (str != null) {
            this.mHeaders.put(CLIENT_MACHINE_IP_HEADER, str);
        }
        return this;
    }

    public putByteArrayDDpEx setClientVersion(String str) {
        if (str != null) {
            this.mHeaders.put(CLIENT_VERSION, str);
            return this;
        }
        throw new IllegalArgumentException("Client Version Http Header cannot be null!");
    }

    public Map<String, String> build() {
        if (this.mHeaders.get("Content-Type") != null) {
            if (this.mHeaders.get("Content-Type").equals("application/json")) {
                if (this.mHeaders.get("Authorization") == null) {
                    throw new IllegalArgumentException("Missing authorization header!");
                } else if (this.mHeaders.get(CLIENT_VERSION) == null) {
                    throw new IllegalArgumentException("Missing client version header!");
                }
            } else if (!this.mHeaders.get("Content-Type").equals(CONTENT_TYPE_STREAM)) {
                throw new IllegalArgumentException("Invalid CONTENT TYPE header!");
            } else if (this.mHeaders.get(ABLY_CLIENT_KEY) == null) {
                throw new IllegalArgumentException("Missing ably key header!");
            }
            return this.mHeaders;
        }
        throw new IllegalArgumentException("Missing CONTENT TYPE header!");
    }

    public static Map<String, String> noCacheHeaders() {
        return noCacheHeaders;
    }
}
