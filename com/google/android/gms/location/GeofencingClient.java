package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import java.util.List;

public class GeofencingClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public GeofencingClient(@NonNull Activity activity) {
        super(activity, LocationServices.API, null, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public GeofencingClient(@NonNull Context context) {
        super(context, LocationServices.API, null, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public Task<Void> addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return PendingResultUtil.toVoidTask(LocationServices.GeofencingApi.addGeofences(asGoogleApiClient(), geofencingRequest, pendingIntent));
    }

    public Task<Void> removeGeofences(PendingIntent pendingIntent) {
        return PendingResultUtil.toVoidTask(LocationServices.GeofencingApi.removeGeofences(asGoogleApiClient(), pendingIntent));
    }

    public Task<Void> removeGeofences(List<String> list) {
        return PendingResultUtil.toVoidTask(LocationServices.GeofencingApi.removeGeofences(asGoogleApiClient(), list));
    }
}
