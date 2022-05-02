package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.tncsummary.TncSummaryActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class})
public interface writeObject {
    void setMax(TncSummaryActivity tncSummaryActivity);
}
