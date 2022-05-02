package com.iap.ac.android.common.container.event;

import android.os.Bundle;
import androidx.annotation.NonNull;

public interface IContainerListener {
    void onContainerCreated(@NonNull Bundle bundle);

    void onContainerDestroyed(@NonNull Bundle bundle);
}
