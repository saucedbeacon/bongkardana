package com.iap.ac.android.biz.common.callback;

import androidx.annotation.NonNull;

public interface IPay {
    void pay(@NonNull String str, @NonNull String str2, @NonNull IPayCallback iPayCallback);
}
