package o;

import id.dana.domain.social.InitStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class getTransientStateView {
    public static final /* synthetic */ int[] getMin;

    static {
        int[] iArr = new int[InitStatus.values().length];
        getMin = iArr;
        iArr[InitStatus.FINISH.ordinal()] = 1;
        getMin[InitStatus.ERROR.ordinal()] = 2;
        getMin[InitStatus.INIT.ordinal()] = 3;
        getMin[InitStatus.NOT_ACTIVATED.ordinal()] = 4;
    }
}
