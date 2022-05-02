package com.alipay.iap.android.common.securitydata.encrypt;

import androidx.annotation.NonNull;

public interface IDataEncrypt {
    String decrypt(@NonNull String str);

    String encrypt(@NonNull String str);
}
