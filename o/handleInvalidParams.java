package o;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class handleInvalidParams implements SuccessContinuation {
    public static final handleInvalidParams getMin = new handleInvalidParams();

    public final Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
