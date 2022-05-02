package com.iap.ac.android.container.activity;

import android.os.Bundle;

public interface ContainerLifecycleListener {
    void onAppCreated(Bundle bundle);

    void onAppDestroyed(Bundle bundle);
}
