package io.split.android.client.events;

public enum SplitInternalEvent {
    MY_SEGMENTS_LOADED_FROM_STORAGE,
    SPLITS_LOADED_FROM_STORAGE,
    MY_SEGMENTS_FETCHED,
    MY_SEGMENTS_UPDATED,
    SPLITS_FETCHED,
    SPLITS_UPDATED,
    SDK_READY_TIMEOUT_REACHED,
    SPLIT_KILLED_NOTIFICATION
}