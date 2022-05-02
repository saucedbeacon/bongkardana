package o;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

public final class spec implements Continuation {
    private final FirebaseRemoteConfig getMin;

    public spec(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.getMin = firebaseRemoteConfig;
    }

    public final Object then(Task task) {
        return Boolean.valueOf(this.getMin.processActivatePutTask(task));
    }
}
