package io.split.android.client.factory;

public interface FactoryMonitor {
    void add(String str);

    int count();

    int count(String str);

    void remove(String str);
}
