package o;

import android.view.View;
import id.dana.richview.SearchView;

public final class getAbsPath implements View.OnFocusChangeListener {
    private final SearchView getMin;

    public getAbsPath(SearchView searchView) {
        this.getMin = searchView;
    }

    public final void onFocusChange(View view, boolean z) {
        this.getMin.getMax.onNext(Boolean.valueOf(z));
    }
}
