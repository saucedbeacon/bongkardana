package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;

public final class isMeasurementUpToDate {
    public Intent length = new Intent();
    public Bundle setMin;

    public static class setMin {
        public final Bundle setMin = new Bundle();
    }

    public isMeasurementUpToDate(@NonNull Uri uri, @NonNull Uri uri2) {
        Bundle bundle = new Bundle();
        this.setMin = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.setMin.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }
}
