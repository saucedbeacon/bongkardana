package o;

import id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class onActionButtonClicked$core {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[MiniProgramLocationPickerActivity.BottomSheetSelectedLocationState.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[MiniProgramLocationPickerActivity.BottomSheetSelectedLocationState.LOADING.ordinal()] = 1;
        $EnumSwitchMapping$0[MiniProgramLocationPickerActivity.BottomSheetSelectedLocationState.ERROR.ordinal()] = 2;
        $EnumSwitchMapping$0[MiniProgramLocationPickerActivity.BottomSheetSelectedLocationState.SUCCESS.ordinal()] = 3;
        int[] iArr2 = new int[MiniProgramLocationPickerActivity.SearchLocationState.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[MiniProgramLocationPickerActivity.SearchLocationState.SEARCHING.ordinal()] = 1;
        $EnumSwitchMapping$1[MiniProgramLocationPickerActivity.SearchLocationState.EMPTY_KEYWORD.ordinal()] = 2;
        $EnumSwitchMapping$1[MiniProgramLocationPickerActivity.SearchLocationState.SEARCH_EMPTY_RESULT.ordinal()] = 3;
        $EnumSwitchMapping$1[MiniProgramLocationPickerActivity.SearchLocationState.SEARCH_ERROR.ordinal()] = 4;
        $EnumSwitchMapping$1[MiniProgramLocationPickerActivity.SearchLocationState.SEARCH_RESULT_FOUND.ordinal()] = 5;
    }
}
