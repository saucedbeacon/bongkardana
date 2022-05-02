package o;

import dagger.Component;
import id.dana.contract.permission.PermissionStateModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.VerifyNumberModule;
import id.dana.onboarding.verify.VerifyNumberFragment;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/VerifyNumberComponent;", "", "inject", "", "verifyNumberFragment", "Lid/dana/onboarding/verify/VerifyNumberFragment;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {VerifyNumberModule.class, PermissionStateModule.class, AuthenticationModule.class})
public interface translate {
    void getMin(@Nullable VerifyNumberFragment verifyNumberFragment);
}
