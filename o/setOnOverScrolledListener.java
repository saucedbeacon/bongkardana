package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.sendmoney_v2.x2l.di.SendToLinkSelectorModule;
import id.dana.sendmoney_v2.x2l.view.SendToLinkSelectorView;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/x2l/di/SendToLinkSelectorComponent;", "", "inject", "", "sendMoneyToLinkSelectorView", "Lid/dana/sendmoney_v2/x2l/view/SendToLinkSelectorView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SendToLinkSelectorModule.class})
public interface setOnOverScrolledListener {
    void setMin(@NotNull SendToLinkSelectorView sendToLinkSelectorView);
}
