package io.split.android.client.utils;

public interface MemoryUtils {
    boolean isMemoryAvailableForJson(String str);

    boolean isMemoryAvailableToAllocate(long j, int i);
}
