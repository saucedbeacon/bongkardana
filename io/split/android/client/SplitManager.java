package io.split.android.client;

import java.util.List;
import o.IAtlasEncryptComponent;

public interface SplitManager {
    void destroy();

    IAtlasEncryptComponent split(String str);

    List<String> splitNames();

    List<IAtlasEncryptComponent> splits();
}
