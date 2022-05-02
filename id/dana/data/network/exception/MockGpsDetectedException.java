package id.dana.data.network.exception;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/data/network/exception/MockGpsDetectedException;", "Ljava/io/IOException;", "()V", "getLocalizedMessage", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MockGpsDetectedException extends IOException {
    @NotNull
    public final String getLocalizedMessage() {
        return "Location Mock Detected !";
    }
}
