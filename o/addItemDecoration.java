package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.CameraLogger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

public class addItemDecoration {
    protected static final String getMax;
    protected static final CameraLogger setMax;
    protected final Object getMin = new Object();
    /* access modifiers changed from: private */
    public final Map<String, Runnable> isInside = new HashMap();
    protected final ArrayDeque<getMin> length = new ArrayDeque<>();
    protected final getMax setMin;

    public interface getMax {
        void getMax(@NonNull Exception exc);

        @NonNull
        ensureTopGlow setMax();
    }

    static {
        String simpleName = addItemDecoration.class.getSimpleName();
        getMax = simpleName;
        setMax = CameraLogger.setMin(simpleName);
    }

    protected static class getMin {
        public final String getMax;
        public final Task<?> length;

        /* synthetic */ getMin(String str, Task task, byte b) {
            this(str, task);
        }

        private getMin(@NonNull String str, @NonNull Task<?> task) {
            this.getMax = str;
            this.length = task;
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof getMin) && ((getMin) obj).getMax.equals(this.getMax);
        }
    }

    public addItemDecoration(@NonNull getMax getmax) {
        this.setMin = getmax;
        length();
    }

    @NonNull
    public final <T> Task<T> setMin(@NonNull String str, boolean z, @NonNull Callable<Task<T>> callable) {
        setMax.getMax(1, str.toUpperCase(), "- Scheduling.");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ensureTopGlow max = this.setMin.setMax();
        synchronized (this.getMin) {
            final String str2 = str;
            final Callable<Task<T>> callable2 = callable;
            final ensureTopGlow ensuretopglow = max;
            final boolean z2 = z;
            final TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
            setMax(this.length.getLast().length, max, new OnCompleteListener() {
                public final void onComplete(@NonNull Task task) {
                    synchronized (addItemDecoration.this.getMin) {
                        addItemDecoration.this.length.removeFirst();
                        addItemDecoration.this.length();
                    }
                    try {
                        addItemDecoration.setMax.getMax(1, str2.toUpperCase(), "- Executing.");
                        addItemDecoration.setMax((Task) callable2.call(), ensuretopglow, new OnCompleteListener<T>() {
                            public final void onComplete(@NonNull Task<T> task) {
                                Exception exception = task.getException();
                                if (exception != null) {
                                    addItemDecoration.setMax.getMax(2, str2.toUpperCase(), "- Finished with ERROR.", exception);
                                    if (z2) {
                                        addItemDecoration.this.setMin.getMax(exception);
                                    }
                                    taskCompletionSource2.trySetException(exception);
                                } else if (task.isCanceled()) {
                                    addItemDecoration.setMax.getMax(1, str2.toUpperCase(), "- Finished because ABORTED.");
                                    taskCompletionSource2.trySetException(new CancellationException());
                                } else {
                                    addItemDecoration.setMax.setMax(str2.toUpperCase(), "- Finished.");
                                    taskCompletionSource2.trySetResult(task.getResult());
                                }
                            }
                        });
                    } catch (Exception e) {
                        addItemDecoration.setMax.getMax(1, str2.toUpperCase(), "- Finished.", e);
                        if (z2) {
                            addItemDecoration.this.setMin.getMax(e);
                        }
                        taskCompletionSource2.trySetException(e);
                    }
                }
            });
            String str3 = str;
            this.length.addLast(new getMin(str, taskCompletionSource.getTask(), (byte) 0));
        }
        return taskCompletionSource.getTask();
    }

    public final void length(@NonNull final String str, long j, @NonNull final Runnable runnable) {
        AnonymousClass3 r0 = new Runnable() {
            public final void run() {
                addItemDecoration additemdecoration = addItemDecoration.this;
                additemdecoration.setMin(str, true, new Callable<Task<Void>>(runnable) {
                    final /* synthetic */ Runnable getMin;

                    {
                        this.getMin = r2;
                    }

                    public final /* synthetic */ Object call() throws Exception {
                        this.getMin.run();
                        return Tasks.forResult(null);
                    }
                });
                synchronized (addItemDecoration.this.getMin) {
                    if (addItemDecoration.this.isInside.containsValue(this)) {
                        addItemDecoration.this.isInside.remove(str);
                    }
                }
            }
        };
        synchronized (this.getMin) {
            this.isInside.put(str, r0);
            this.setMin.setMax().length.postDelayed(r0, j);
        }
    }

    public final void getMax(@NonNull String str) {
        synchronized (this.getMin) {
            if (this.isInside.get(str) != null) {
                this.setMin.setMax().length.removeCallbacks(this.isInside.get(str));
                this.isInside.remove(str);
            }
            do {
            } while (this.length.remove(new getMin(str, Tasks.forResult(null), (byte) 0)));
            length();
        }
    }

    public final void setMax() {
        synchronized (this.getMin) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(this.isInside.keySet());
            Iterator<getMin> it = this.length.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getMax);
            }
            for (String max : arrayList) {
                getMax(max);
            }
        }
    }

    /* access modifiers changed from: private */
    public void length() {
        synchronized (this.getMin) {
            if (this.length.isEmpty()) {
                this.length.add(new getMin("BASE", Tasks.forResult(null), (byte) 0));
            }
        }
    }

    /* access modifiers changed from: private */
    public static <T> void setMax(@NonNull final Task<T> task, @NonNull ensureTopGlow ensuretopglow, @NonNull final OnCompleteListener<T> onCompleteListener) {
        if (task.isComplete()) {
            AnonymousClass5 r0 = new Runnable() {
                public final void run() {
                    onCompleteListener.onComplete(task);
                }
            };
            if (Thread.currentThread() == ensuretopglow.getMax) {
                r0.run();
            } else {
                ensuretopglow.length.post(r0);
            }
        } else {
            task.addOnCompleteListener(ensuretopglow.setMax, onCompleteListener);
        }
    }
}
