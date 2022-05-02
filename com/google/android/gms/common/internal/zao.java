package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;

final class zao implements PendingResultUtil.zaa {
    zao() {
    }

    public final ApiException zaa(Status status) {
        return ApiExceptionUtil.fromStatus(status);
    }
}
