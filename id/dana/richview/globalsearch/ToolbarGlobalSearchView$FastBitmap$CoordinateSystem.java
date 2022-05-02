package id.dana.richview.globalsearch;

import android.view.View;
import android.widget.EditText;
import id.dana.richview.globalsearch.ToolbarGlobalSearchView;
import kotlin.Metadata;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
final class ToolbarGlobalSearchView$FastBitmap$CoordinateSystem implements View.OnClickListener {
    final /* synthetic */ ToolbarGlobalSearchView setMin;

    ToolbarGlobalSearchView$FastBitmap$CoordinateSystem(ToolbarGlobalSearchView toolbarGlobalSearchView) {
        this.setMin = toolbarGlobalSearchView;
    }

    public final void onClick(View view) {
        EditText editText = (EditText) this.setMin._$_findCachedViewById(resetInternal.setMax.open);
        String valueOf = String.valueOf(editText != null ? editText.getText() : null);
        ToolbarGlobalSearchView.setMin access$getListener$p = this.setMin.setMin;
        if (access$getListener$p != null) {
            access$getListener$p.getMin(valueOf);
        }
    }
}
