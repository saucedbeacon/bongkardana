package com.google.firebase.ml.vision.label;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.LinkedList;
import java.util.List;

final class zzb implements Continuation<List<FirebaseVisionImageLabel>, List<FirebaseVisionImageLabel>> {
    private final /* synthetic */ FirebaseVisionImageLabeler zzbiy;

    zzb(FirebaseVisionImageLabeler firebaseVisionImageLabeler) {
        this.zzbiy = firebaseVisionImageLabeler;
    }

    public final /* synthetic */ Object then(@NonNull Task task) throws Exception {
        LinkedList linkedList = new LinkedList();
        for (FirebaseVisionImageLabel firebaseVisionImageLabel : (List) task.getResult()) {
            if (Float.compare(firebaseVisionImageLabel.getConfidence(), this.zzbiy.zzbjc.getConfidenceThreshold()) >= 0) {
                linkedList.add(firebaseVisionImageLabel);
            }
        }
        return linkedList;
    }
}
