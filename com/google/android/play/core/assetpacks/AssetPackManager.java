package com.google.android.play.core.assetpacks;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.tasks.Task;
import java.util.List;
import java.util.Map;

public interface AssetPackManager {
    AssetPackStates cancel(@NonNull List<String> list);

    void clearListeners();

    Task<AssetPackStates> fetch(List<String> list);

    @Nullable
    AssetLocation getAssetLocation(@NonNull String str, @NonNull String str2);

    @Nullable
    AssetPackLocation getPackLocation(@NonNull String str);

    Map<String, AssetPackLocation> getPackLocations();

    Task<AssetPackStates> getPackStates(List<String> list);

    void registerListener(@NonNull AssetPackStateUpdateListener assetPackStateUpdateListener);

    Task<Void> removePack(@NonNull String str);

    Task<Integer> showCellularDataConfirmation(@NonNull Activity activity);

    void unregisterListener(@NonNull AssetPackStateUpdateListener assetPackStateUpdateListener);
}
