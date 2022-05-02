package o;

import dagger.Subcomponent;
import id.dana.di.PerActivity;
import id.dana.social.AddReactionBottomSheetDialog;
import id.dana.social.di.module.ReactionsModule;
import id.dana.social.view.ActivityReactionsBottomSheetDialog;
import id.dana.social.view.ReactionSectionView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/social/di/component/ReactionsComponent;", "", "inject", "", "reactionsListDialogFragment", "Lid/dana/social/AddReactionBottomSheetDialog;", "activityReactionsBottomSheetDialog", "Lid/dana/social/view/ActivityReactionsBottomSheetDialog;", "reactionSectionView", "Lid/dana/social/view/ReactionSectionView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Subcomponent(modules = {ReactionsModule.class})
@PerActivity
public interface showPop {
    void getMax(@NotNull AddReactionBottomSheetDialog addReactionBottomSheetDialog);

    void getMin(@NotNull ReactionSectionView reactionSectionView);

    void setMin(@NotNull ActivityReactionsBottomSheetDialog activityReactionsBottomSheetDialog);
}
