package o;

import org.jetbrains.annotations.Nullable;

public class onTransact {
    @Nullable
    public final String getMin;
    public final boolean setMax;

    public onTransact(boolean z, @Nullable String str) {
        this.setMax = z;
        this.getMin = str;
    }

    public boolean setMin() {
        throw null;
    }
}
