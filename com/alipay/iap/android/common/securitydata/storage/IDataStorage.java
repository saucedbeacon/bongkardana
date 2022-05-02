package com.alipay.iap.android.common.securitydata.storage;

public interface IDataStorage {
    boolean clear();

    boolean delete(String str);

    String fetch(String str);

    boolean save(String str, String str2);
}
