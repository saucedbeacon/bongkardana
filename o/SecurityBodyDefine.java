package o;

import androidx.annotation.Nullable;
import io.split.android.client.service.sseclient.SseJwtToken;

public class SecurityBodyDefine {
    private boolean isErrorRecoverable;
    private SseJwtToken jwtToken;
    private boolean pushEnabled;
    private boolean success;

    public SecurityBodyDefine(boolean z, boolean z2, boolean z3, SseJwtToken sseJwtToken) {
        this.success = z;
        this.isErrorRecoverable = z2;
        this.pushEnabled = z3;
        this.jwtToken = sseJwtToken;
    }

    public SecurityBodyDefine(boolean z, boolean z2) {
        this(z, z2, false, (SseJwtToken) null);
    }

    public boolean isSuccess() {
        return this.success;
    }

    public boolean isErrorRecoverable() {
        return this.isErrorRecoverable;
    }

    public boolean isPushEnabled() {
        return this.pushEnabled;
    }

    @Nullable
    public SseJwtToken getJwtToken() {
        return this.jwtToken;
    }
}
