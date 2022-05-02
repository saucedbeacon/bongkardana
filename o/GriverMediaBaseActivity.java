package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.richview.SurveyView;
import o.VersionedParcelize;

public final class GriverMediaBaseActivity implements getBindingAdapter<SurveyView> {
    @InjectedFieldSignature("id.dana.richview.SurveyView.presenter")
    public static void setMin(SurveyView surveyView, VersionedParcelize.getMax getmax) {
        surveyView.presenter = getmax;
    }
}
