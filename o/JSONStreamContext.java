package o;

import dagger.Component;
import id.dana.contract.homeinfo.HomeInfoModule;
import id.dana.di.PerActivity;
import id.dana.richview.SurveyView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {HomeInfoModule.class})
public interface JSONStreamContext {
    void getMax(SurveyView surveyView);
}
