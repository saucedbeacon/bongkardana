package o;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

public final class getAlignment implements Continuation {
    private final FirebaseRemoteConfig getMax;
    private final Task getMin;
    private final Task setMin;

    public getAlignment(FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2) {
        this.getMax = firebaseRemoteConfig;
        this.getMin = task;
        this.setMin = task2;
    }

    public final Object then(Task task) {
        return this.getMax.lambda$activate$2(this.getMin, this.setMin, task);
    }
}
