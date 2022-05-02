package com.iap.ac.config.lite.listener.sectionconfig;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

public class ChangedDetails {
    @NonNull
    public final Set<String> addedKeys = new HashSet();
    @NonNull
    public final Set<String> deletedKeys = new HashSet();
    @NonNull
    public final Set<String> modifiedKeys = new HashSet();

    public boolean addedContains(@NonNull String str) {
        return this.addedKeys.contains(str);
    }

    public boolean deletedContains(@NonNull String str) {
        return this.deletedKeys.contains(str);
    }

    public void mergeChangeDetails(@NonNull ChangedDetails changedDetails) {
        this.addedKeys.addAll(changedDetails.addedKeys);
        this.modifiedKeys.addAll(changedDetails.modifiedKeys);
        this.deletedKeys.addAll(changedDetails.deletedKeys);
    }

    public boolean modifiedContains(@NonNull String str) {
        return this.modifiedKeys.contains(str);
    }
}
