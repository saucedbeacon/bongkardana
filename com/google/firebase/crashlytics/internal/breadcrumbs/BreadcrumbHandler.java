package com.google.firebase.crashlytics.internal.breadcrumbs;

import androidx.annotation.NonNull;

public interface BreadcrumbHandler {
    void handleBreadcrumb(@NonNull String str);
}
