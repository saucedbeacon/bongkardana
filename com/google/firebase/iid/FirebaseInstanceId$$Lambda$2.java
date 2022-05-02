package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

final /* synthetic */ class FirebaseInstanceId$$Lambda$2 implements OnCompleteListener {
    private final CountDownLatch arg$1;

    FirebaseInstanceId$$Lambda$2(CountDownLatch countDownLatch) {
        this.arg$1 = countDownLatch;
    }

    public final void onComplete(Task task) {
        this.arg$1.countDown();
    }
}
