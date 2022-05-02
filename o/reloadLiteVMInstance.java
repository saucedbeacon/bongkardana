package o;

import com.google.gson.annotations.SerializedName;
import io.split.android.client.dtos.Identifiable;

public class reloadLiteVMInstance implements Identifiable {
    private static final String FIELD_COUNT = "rc";
    private static final String FIELD_FEATURE = "f";
    private static final String FIELD_TIMEFRAME = "m";
    @SerializedName("rc")
    public final int count;
    @SerializedName("f")
    public final String feature;
    public transient long storageId;
    @SerializedName("m")
    public final long timeframe;

    public reloadLiteVMInstance(String str, long j, int i) {
        this.feature = str;
        this.timeframe = j;
        this.count = i;
    }

    public int hashCode() {
        return String.format("%s%d%d", new Object[]{this.feature, Long.valueOf(this.timeframe), Integer.valueOf(this.count)}).hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            reloadLiteVMInstance reloadlitevminstance = (reloadLiteVMInstance) obj;
            return this.feature.equals(reloadlitevminstance.feature) && this.timeframe == reloadlitevminstance.timeframe && this.count == reloadlitevminstance.count;
        }
    }

    public long getId() {
        return this.storageId;
    }
}
