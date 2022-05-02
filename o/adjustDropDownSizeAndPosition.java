package o;

import androidx.annotation.Nullable;

public final class adjustDropDownSizeAndPosition {
    @Nullable
    public final onTextFocusChanged getMax;
    @Nullable
    public final onTextFocusChanged getMin;
    @Nullable
    public final onQueryRefine setMax;
    @Nullable
    public final onQueryRefine setMin;

    public adjustDropDownSizeAndPosition(@Nullable onQueryRefine onqueryrefine, @Nullable onQueryRefine onqueryrefine2, @Nullable onTextFocusChanged ontextfocuschanged, @Nullable onTextFocusChanged ontextfocuschanged2) {
        this.setMin = onqueryrefine;
        this.setMax = onqueryrefine2;
        this.getMin = ontextfocuschanged;
        this.getMax = ontextfocuschanged2;
    }
}
