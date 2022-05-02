package o;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.engine.orchestrator.CameraState;
import java.util.Iterator;
import java.util.concurrent.Callable;
import o.addItemDecoration;

public final class removeItemDecorationAt extends addItemDecoration {
    /* access modifiers changed from: private */
    public int equals = 0;
    public CameraState toFloatRange = CameraState.OFF;
    public CameraState toIntRange = CameraState.OFF;

    public removeItemDecorationAt(@NonNull addItemDecoration.getMax getmax) {
        super(getmax);
    }

    public final boolean getMax() {
        synchronized (this.getMin) {
            Iterator it = this.length.iterator();
            while (it.hasNext()) {
                addItemDecoration.getMin getmin = (addItemDecoration.getMin) it.next();
                if ((getmin.getMax.contains(" >> ") || getmin.getMax.contains(" << ")) && !getmin.length.isComplete()) {
                    return true;
                }
            }
            return false;
        }
    }

    @NonNull
    public final <T> Task<T> getMin(@NonNull CameraState cameraState, @NonNull CameraState cameraState2, boolean z, @NonNull Callable<Task<T>> callable) {
        StringBuilder sb;
        String str;
        final int i = this.equals + 1;
        this.equals = i;
        this.toIntRange = cameraState2;
        final boolean z2 = !cameraState2.isAtLeast(cameraState);
        if (z2) {
            sb.append(cameraState.name());
            sb.append(" << ");
            sb.append(cameraState2.name());
            str = sb.toString();
        } else {
            sb = new StringBuilder();
            sb.append(cameraState.name());
            sb.append(" >> ");
            sb.append(cameraState2.name());
            str = sb.toString();
        }
        final CameraState cameraState3 = cameraState;
        final String str2 = str;
        final CameraState cameraState4 = cameraState2;
        final Callable<Task<T>> callable2 = callable;
        return setMin(str, z, new Callable<Task<T>>() {
            public final /* synthetic */ Object call() throws Exception {
                if (removeItemDecorationAt.this.toFloatRange != cameraState3) {
                    addItemDecoration.setMax.getMax(2, str2.toUpperCase(), "- State mismatch, aborting. current:", removeItemDecorationAt.this.toFloatRange, "from:", cameraState3, "to:", cameraState4);
                    return Tasks.forCanceled();
                }
                return ((Task) callable2.call()).continueWithTask(removeItemDecorationAt.this.setMin.setMax().setMax, new Continuation<T, Task<T>>() {
                    public final /* synthetic */ Object then(@NonNull Task task) throws Exception {
                        if (task.isSuccessful() || z2) {
                            CameraState unused = removeItemDecorationAt.this.toFloatRange = cameraState4;
                        }
                        return task;
                    }
                });
            }
        }).addOnCompleteListener(new OnCompleteListener<T>() {
            public final void onComplete(@NonNull Task<T> task) {
                if (i == removeItemDecorationAt.this.equals) {
                    removeItemDecorationAt removeitemdecorationat = removeItemDecorationAt.this;
                    CameraState unused = removeitemdecorationat.toIntRange = removeitemdecorationat.toFloatRange;
                }
            }
        });
    }
}
