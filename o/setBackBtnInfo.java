package o;

import androidx.work.WorkInfo;
import id.dana.domain.social.InitStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class setBackBtnInfo {
    public static final /* synthetic */ int[] getMin;
    public static final /* synthetic */ int[] length;

    static {
        int[] iArr = new int[WorkInfo.State.values().length];
        getMin = iArr;
        iArr[WorkInfo.State.BLOCKED.ordinal()] = 1;
        getMin[WorkInfo.State.ENQUEUED.ordinal()] = 2;
        getMin[WorkInfo.State.RUNNING.ordinal()] = 3;
        getMin[WorkInfo.State.FAILED.ordinal()] = 4;
        getMin[WorkInfo.State.CANCELLED.ordinal()] = 5;
        int[] iArr2 = new int[InitStatus.values().length];
        length = iArr2;
        iArr2[InitStatus.FINISH.ordinal()] = 1;
        length[InitStatus.INIT.ordinal()] = 2;
        length[InitStatus.NOT_ACTIVATED.ordinal()] = 3;
    }
}
