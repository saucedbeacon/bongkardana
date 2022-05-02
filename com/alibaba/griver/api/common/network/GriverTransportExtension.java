package com.alibaba.griver.api.common.network;

import androidx.annotation.NonNull;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverTransportExtension extends GriverExtension {
    HttpResponse request(@NonNull HttpRequest httpRequest);
}
