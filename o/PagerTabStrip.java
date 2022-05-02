package o;

import dagger.Component;
import id.dana.contract.maintenance.MaintenanceBroadcastModule;
import id.dana.di.PerActivity;
import id.dana.richview.MaintenanceBroadcastView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MaintenanceBroadcastModule.class})
public interface PagerTabStrip {
    void length(MaintenanceBroadcastView maintenanceBroadcastView);
}
