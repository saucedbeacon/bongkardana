package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class getStringDDp {
    private final String host;
    private final String password;
    private final int port;
    private final String username;

    public getStringDDp(@NonNull String str, int i) {
        this(str, i, (String) null, (String) null);
    }

    public getStringDDp(@NonNull String str, int i, @Nullable String str2, @Nullable String str3) {
        if (str != null) {
            this.host = str;
            this.port = i;
            this.username = str2;
            this.password = str3;
            return;
        }
        throw null;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean usesCredentials() {
        return this.username == null;
    }
}
