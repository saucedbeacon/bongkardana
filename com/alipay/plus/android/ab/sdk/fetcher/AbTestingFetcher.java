package com.alipay.plus.android.ab.sdk.fetcher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.plus.android.config.sdk.fetcher.FetchException;
import java.util.Map;

public interface AbTestingFetcher {
    @Nullable
    Map<String, String> getVariation(@NonNull String str, @NonNull String str2) throws FetchException;
}
