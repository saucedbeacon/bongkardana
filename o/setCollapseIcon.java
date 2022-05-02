package o;

import com.andrognito.flashbar.Flashbar;
import com.andrognito.flashbar.anim.FlashAnimBarBuilder;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class setCollapseIcon {
    public static final /* synthetic */ int[] equals;
    public static final /* synthetic */ int[] getMax;
    public static final /* synthetic */ int[] getMin;
    public static final /* synthetic */ int[] isInside;
    public static final /* synthetic */ int[] length;
    public static final /* synthetic */ int[] setMax;
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[Flashbar.Gravity.values().length];
        setMax = iArr;
        iArr[Flashbar.Gravity.TOP.ordinal()] = 1;
        setMax[Flashbar.Gravity.BOTTOM.ordinal()] = 2;
        int[] iArr2 = new int[Flashbar.Gravity.values().length];
        setMin = iArr2;
        iArr2[Flashbar.Gravity.TOP.ordinal()] = 1;
        setMin[Flashbar.Gravity.BOTTOM.ordinal()] = 2;
        int[] iArr3 = new int[FlashAnimBarBuilder.Type.values().length];
        getMin = iArr3;
        iArr3[FlashAnimBarBuilder.Type.ENTER.ordinal()] = 1;
        getMin[FlashAnimBarBuilder.Type.EXIT.ordinal()] = 2;
        int[] iArr4 = new int[FlashAnimBarBuilder.Direction.values().length];
        getMax = iArr4;
        iArr4[FlashAnimBarBuilder.Direction.LEFT.ordinal()] = 1;
        getMax[FlashAnimBarBuilder.Direction.RIGHT.ordinal()] = 2;
        int[] iArr5 = new int[FlashAnimBarBuilder.Direction.values().length];
        length = iArr5;
        iArr5[FlashAnimBarBuilder.Direction.LEFT.ordinal()] = 1;
        length[FlashAnimBarBuilder.Direction.RIGHT.ordinal()] = 2;
        int[] iArr6 = new int[FlashAnimBarBuilder.Type.values().length];
        equals = iArr6;
        iArr6[FlashAnimBarBuilder.Type.ENTER.ordinal()] = 1;
        equals[FlashAnimBarBuilder.Type.EXIT.ordinal()] = 2;
        int[] iArr7 = new int[FlashAnimBarBuilder.Type.values().length];
        isInside = iArr7;
        iArr7[FlashAnimBarBuilder.Type.ENTER.ordinal()] = 1;
        isInside[FlashAnimBarBuilder.Type.EXIT.ordinal()] = 2;
    }
}
