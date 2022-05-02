package id.dana.sendmoney.remarks;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class NoteView_ViewBinding implements Unbinder {
    private View getMin;
    private NoteView setMin;

    @UiThread
    public NoteView_ViewBinding(final NoteView noteView, View view) {
        this.setMin = noteView;
        View max = drawDividersHorizontal.getMax(view, R.id.f35932131362039, "method 'onBtnActionClicked'");
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                noteView.onBtnActionClicked();
            }
        });
    }

    public final void setMax() {
        if (this.setMin != null) {
            this.setMin = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
