package o;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class getLayoutParams implements SuccessContinuation {
    public static final getLayoutParams length = new getLayoutParams();

    public final Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
