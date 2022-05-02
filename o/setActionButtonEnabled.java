package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lid/dana/danah5/ocrreceipt/repository/model/OcrImagePreprocessingConfigResult;", "", "enable", "", "timeout", "", "(ZJ)V", "getEnable", "()Z", "getTimeout", "()J", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setActionButtonEnabled {
    private final boolean enable;
    private final long timeout;

    public setActionButtonEnabled() {
        this(false, 0, 3, (DefaultConstructorMarker) null);
    }

    public setActionButtonEnabled(boolean z, long j) {
        this.enable = z;
        this.timeout = j;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setActionButtonEnabled(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0 : j);
    }

    public final long getTimeout() {
        return this.timeout;
    }
}
