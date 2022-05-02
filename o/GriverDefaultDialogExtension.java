package o;

import id.dana.miniprogram.MiniProgramStoreActivity;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class GriverDefaultDialogExtension {
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[MiniProgramStoreActivity.PageState.values().length];
        setMin = iArr;
        iArr[MiniProgramStoreActivity.PageState.MINI_PROGRAM_ERROR.ordinal()] = 1;
        setMin[MiniProgramStoreActivity.PageState.DISPLAYING_EMPTY_SEARCH_RESULT.ordinal()] = 2;
        setMin[MiniProgramStoreActivity.PageState.SUCCESS.ordinal()] = 3;
    }
}
