package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.di.modules.SendMoneyModule;
import id.dana.sendmoney_v2.recipient.activity.SearchRecipientActivity;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/SearchActivityComponent;", "", "inject", "", "view", "Lid/dana/sendmoney_v2/recipient/activity/SearchRecipientActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecipientActivityModule.class, BillerX2BModule.class, SendMoneyModule.class})
public interface JSONException {
    void length(@NotNull SearchRecipientActivity searchRecipientActivity);
}