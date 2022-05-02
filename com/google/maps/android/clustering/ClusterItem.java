package com.google.maps.android.clustering;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.LatLng;

public interface ClusterItem {
    @NonNull
    LatLng getPosition();

    @Nullable
    String getSnippet();

    @Nullable
    String getTitle();
}
