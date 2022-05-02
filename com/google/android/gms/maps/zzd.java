package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzac;
import com.google.android.gms.maps.model.Marker;

final class zzd extends zzac {
    private final /* synthetic */ GoogleMap.OnInfoWindowClickListener zzl;

    zzd(GoogleMap googleMap, GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.zzl = onInfoWindowClickListener;
    }

    public final void zze(zzt zzt) {
        this.zzl.onInfoWindowClick(new Marker(zzt));
    }
}
