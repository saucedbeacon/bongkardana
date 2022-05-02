package o;

import id.dana.domain.social.ModifyRelationOperationType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class addScrapView {
    public static final /* synthetic */ int[] setMax;

    static {
        int[] iArr = new int[ModifyRelationOperationType.values().length];
        setMax = iArr;
        iArr[ModifyRelationOperationType.MUTE.ordinal()] = 1;
        setMax[ModifyRelationOperationType.UNMUTE.ordinal()] = 2;
    }
}
