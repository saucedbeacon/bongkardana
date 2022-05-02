package o;

import android.content.Context;
import androidx.annotation.NonNull;
import io.split.android.client.SplitClient;

public class getCurrentLocation {
    public boolean getMax;
    private final String getMin;
    private String isInside;
    private final Context length;
    public boolean setMax;
    public SplitClient setMin;
    private final getPackageValidityCheckComp toIntRange;

    public getCurrentLocation(@NonNull Context context, @NonNull sendLocation sendlocation, @NonNull String str) {
        this.getMin = str;
        this.length = context.getApplicationContext();
        this.toIntRange = sendlocation.getMin;
    }

    public final void length(@NonNull String str) {
        this.isInside = str;
        try {
            this.setMin = SecurityGuardParamContext.build(this.getMin, new IDataCollectionComponent(this.isInside, (String) null), this.toIntRange, this.length).client();
        } catch (Exception unused) {
        }
    }

    public final boolean setMax() {
        return this.getMax;
    }

    public final boolean getMin() {
        return this.setMax;
    }
}
