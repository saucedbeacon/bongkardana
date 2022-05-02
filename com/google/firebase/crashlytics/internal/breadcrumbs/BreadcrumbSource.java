package com.google.firebase.crashlytics.internal.breadcrumbs;

import androidx.annotation.Nullable;

public interface BreadcrumbSource {
    void registerBreadcrumbHandler(@Nullable BreadcrumbHandler breadcrumbHandler);
}
