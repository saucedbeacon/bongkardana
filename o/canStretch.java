package o;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class canStretch implements SuccessContinuation {
    public static final canStretch length = new canStretch();

    public final Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
