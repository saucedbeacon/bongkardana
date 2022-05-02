package o;

import dagger.Subcomponent;
import id.dana.di.PerModule;
import id.dana.social.di.module.BlockedFragmentModule;
import id.dana.social.di.module.MutedFragmentModule;
import id.dana.social.di.module.SocialCommonModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lid/dana/social/di/component/RestrictedContactComponent;", "", "blockedFragmentComponent", "Lid/dana/social/di/component/BlockedFragmentComponent;", "blockedFragmentModule", "Lid/dana/social/di/module/BlockedFragmentModule;", "inject", "", "restrictedContactActivity", "Lid/dana/social/RestrictedContactActivity;", "mutedFragmentComponent", "Lid/dana/social/di/component/MutedFragmentComponent;", "mutedFragmentModule", "Lid/dana/social/di/module/MutedFragmentModule;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Subcomponent(modules = {SocialCommonModule.class})
@PerModule
public interface AUAttrsConstant {
    @NotNull
    setWrapper getMax(@NotNull MutedFragmentModule mutedFragmentModule);

    @NotNull
    addButtonViewToLeft setMin(@NotNull BlockedFragmentModule blockedFragmentModule);
}
