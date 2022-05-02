package o;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

public final class markFragmentsCreated implements Continuation {
    private final CountDownLatch length;

    public markFragmentsCreated(CountDownLatch countDownLatch) {
        this.length = countDownLatch;
    }

    public final Object then(Task task) {
        return this.length.countDown();
    }
}
