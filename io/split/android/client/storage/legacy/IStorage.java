package io.split.android.client.storage.legacy;

import java.io.IOException;
import java.util.List;

public interface IStorage {
    void delete(String str);

    void delete(List<String> list);

    boolean exists(String str);

    long fileSize(String str);

    List<String> getAllIds(String str);

    String[] getAllIds();

    long lastModified(String str);

    String read(String str) throws IOException;

    boolean rename(String str, String str2);

    boolean write(String str, String str2) throws IOException;
}
