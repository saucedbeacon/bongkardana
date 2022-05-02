package com.google.android.play.core.tasks;

import androidx.annotation.NonNull;
import com.google.android.play.core.internal.av;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {
    private Tasks() {
    }

    public static <ResultT> Task<ResultT> a(Exception exc) {
        m mVar = new m();
        mVar.a(exc);
        return mVar;
    }

    public static <ResultT> Task<ResultT> a(ResultT resultt) {
        m mVar = new m();
        mVar.a(resultt);
        return mVar;
    }

    private static <ResultT> ResultT a(Task<ResultT> task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    private static void a(Task<?> task, n nVar) {
        task.addOnSuccessListener(TaskExecutors.f9626a, nVar);
        task.addOnFailureListener(TaskExecutors.f9626a, nVar);
    }

    public static <ResultT> ResultT await(@NonNull Task<ResultT> task) throws ExecutionException, InterruptedException {
        av.a(task, (Object) "Task must not be null");
        if (task.isComplete()) {
            return a(task);
        }
        n nVar = new n((byte[]) null);
        a(task, nVar);
        nVar.a();
        return a(task);
    }

    public static <ResultT> ResultT await(@NonNull Task<ResultT> task, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        av.a(task, (Object) "Task must not be null");
        av.a(timeUnit, (Object) "TimeUnit must not be null");
        if (task.isComplete()) {
            return a(task);
        }
        n nVar = new n((byte[]) null);
        a(task, nVar);
        if (nVar.a(j, timeUnit)) {
            return a(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
