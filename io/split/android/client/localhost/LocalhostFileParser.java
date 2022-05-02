package io.split.android.client.localhost;

import io.split.android.client.dtos.Split;
import java.util.Map;

public interface LocalhostFileParser {
    Map<String, Split> parse(String str);
}
