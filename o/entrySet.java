package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.SendMoneySummaryModule;
import id.dana.sendmoney.summary.SummaryRichView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SendMoneySummaryModule.class})
public interface entrySet {
    void length(SummaryRichView summaryRichView);
}
