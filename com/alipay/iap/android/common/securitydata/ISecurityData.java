package com.alipay.iap.android.common.securitydata;

import androidx.annotation.NonNull;

public interface ISecurityData {
    boolean clear();

    boolean delete(String str);

    String fetch(String str);

    boolean save(String str, String str2);

    String securityDecrypt(@NonNull String str);

    String securityEncrypt(@NonNull String str);
}
