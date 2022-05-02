package o;

import com.twilio.verify.models.FactorType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
public final /* synthetic */ class startSmoothScroll {
    public static final /* synthetic */ int[] setMax;
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[FactorType.values().length];
        setMin = iArr;
        iArr[FactorType.PUSH.ordinal()] = 1;
        int[] iArr2 = new int[FactorType.values().length];
        setMax = iArr2;
        iArr2[FactorType.PUSH.ordinal()] = 1;
    }
}
