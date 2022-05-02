package com.iap.ac.android.common.instance;

import android.content.Context;
import androidx.annotation.NonNull;

public interface IInstanceInfo {
    String getInstanceId(@NonNull Context context);

    String getTid(@NonNull Context context);
}
