package o;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class finishConnect {
    public static final /* synthetic */ int[] length;

    static {
        int[] iArr = new int[BufferOverflow.values().length];
        length = iArr;
        iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
        length[BufferOverflow.DROP_LATEST.ordinal()] = 2;
        length[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
    }
}
