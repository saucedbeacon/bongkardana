package com.iap.ac.android.common.data;

import androidx.annotation.NonNull;

public interface IDataEncrypt {
    String decrypt(@NonNull String str);

    String encrypt(@NonNull String str);
}
