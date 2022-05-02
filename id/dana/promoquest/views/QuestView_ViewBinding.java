package id.dana.promoquest.views;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.LogoProgressView;
import o.drawDividersHorizontal;

public class QuestView_ViewBinding implements Unbinder {
    private QuestView length;

    @UiThread
    public QuestView_ViewBinding(QuestView questView, View view) {
        this.length = questView;
        questView.btnQuestAction = (Button) drawDividersHorizontal.setMin(view, R.id.f36652131362117, "field 'btnQuestAction'", Button.class);
        questView.viewTrackLine = drawDividersHorizontal.getMax(view, R.id.f73482131365983, "field 'viewTrackLine'");
        questView.viewQuestSeparator = drawDividersHorizontal.getMax(view, R.id.f72952131365930, "field 'viewQuestSeparator'");
        questView.ivQuestIconState = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50432131363598, "field 'ivQuestIconState'", ImageView.class);
        questView.lpvLoading = (LogoProgressView) drawDividersHorizontal.setMin(view, R.id.f54132131363970, "field 'lpvLoading'", LogoProgressView.class);
        questView.questDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f68492131365476, "field 'questDescription'", TextView.class);
        questView.questTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f68502131365477, "field 'questTitle'", TextView.class);
        questView.vgQuestViewRoot = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f71522131365785, "field 'vgQuestViewRoot'", ConstraintLayout.class);
        questView.viewAction = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f71512131365784, "field 'viewAction'", LinearLayout.class);
    }

    @CallSuper
    public final void setMax() {
        QuestView questView = this.length;
        if (questView != null) {
            this.length = null;
            questView.btnQuestAction = null;
            questView.viewTrackLine = null;
            questView.viewQuestSeparator = null;
            questView.ivQuestIconState = null;
            questView.lpvLoading = null;
            questView.questDescription = null;
            questView.questTitle = null;
            questView.vgQuestViewRoot = null;
            questView.viewAction = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
