package com.iap.ac.android.common.data;

public interface IDataStorage {
    boolean clear();

    boolean delete(String str);

    String get(String str);

    boolean save(String str, String str2);
}
