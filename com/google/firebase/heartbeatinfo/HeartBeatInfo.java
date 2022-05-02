package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.List;

public interface HeartBeatInfo {
    @NonNull
    Task<List<HeartBeatResult>> getAndClearStoredHeartBeatInfo();

    @NonNull
    HeartBeat getHeartBeatCode(@NonNull String str);

    @NonNull
    Task<Void> storeHeartBeatInfo(@NonNull String str);

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        private HeartBeat(int i) {
            this.code = i;
        }

        public final int getCode() {
            return this.code;
        }
    }
}
