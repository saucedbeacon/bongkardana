package o;

import dagger.Subcomponent;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.PerModule;
import id.dana.di.modules.OauthModule;
import id.dana.social.FriendshipBottomSheetOnBoardingActivity;
import id.dana.social.di.module.ActivityReactionsModule;
import id.dana.social.di.module.ContentGroupingDetailModule;
import id.dana.social.di.module.FeedCommentModule;
import id.dana.social.di.module.FeedNotificationModule;
import id.dana.social.di.module.FeedsCommentReportModule;
import id.dana.social.di.module.FriendsFeedsModule;
import id.dana.social.di.module.FriendshipModule;
import id.dana.social.di.module.MyFeedsModule;
import id.dana.social.di.module.ReactionsModule;
import id.dana.social.di.module.RelationshipBottomSheetModule;
import id.dana.social.di.module.SocialCommonModule;
import id.dana.social.di.module.SocialProfileModule;
import kotlin.Metadata;
import o.APViewEventHelper;
import o.AUTitleBar;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J@\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H&J@\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010.\u001a\u00020/H&J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H&J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H&J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H&J@\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH&J \u0010D\u001a\u00020E2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H&J@\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006JÀ\u0006\u0001"}, d2 = {"Lid/dana/social/di/component/SocialCommonComponent;", "", "activityReactionsComponent", "Lid/dana/social/di/component/ActivityReactionsComponent;", "activityReactionsModule", "Lid/dana/social/di/module/ActivityReactionsModule;", "blockedFragmentComponent", "Lid/dana/social/di/component/BlockedFragmentComponent;", "blockedFragmentModule", "Lid/dana/social/di/module/BlockedFragmentModule;", "contentGroupingDetailComponent", "Lid/dana/social/di/component/ContentGroupingDetailComponent;", "contentGroupingDetailModule", "Lid/dana/social/di/module/ContentGroupingDetailModule;", "deepLinkModule", "Lid/dana/contract/deeplink/DeepLinkModule;", "scanQrModule", "Lid/dana/contract/staticqr/ScanQrModule;", "restoreUrlModule", "Lid/dana/contract/shortener/RestoreUrlModule;", "featureModule", "Lid/dana/contract/deeplink/FeatureModule;", "oauthModule", "Lid/dana/di/modules/OauthModule;", "servicesModule", "Lid/dana/contract/services/ServicesModule;", "feedCommentComponent", "Lid/dana/social/di/component/FeedCommentComponent;", "feedCommentModule", "Lid/dana/social/di/module/FeedCommentModule;", "feedNotificationComponent", "Lid/dana/social/di/component/FeedNotificationComponent;", "feedNotificationModule", "Lid/dana/social/di/module/FeedNotificationModule;", "feedsCommentReportComponent", "Lid/dana/social/di/component/FeedsCommentReportComponent;", "feedsCommentReportModule", "Lid/dana/social/di/module/FeedsCommentReportModule;", "feedsFragmentComponent", "Lid/dana/social/di/component/FeedsFragmentComponent;", "relationshipBottomSheetModule", "Lid/dana/social/di/module/RelationshipBottomSheetModule;", "friendFeedsComponent", "Lid/dana/social/di/component/FriendFeedsComponent;", "friendsFeedsModule", "Lid/dana/social/di/module/FriendsFeedsModule;", "friendshipBottomSheetHelpComponent", "Lid/dana/social/di/component/FriendshipBottomSheetHelpComponent;", "friendshipListBaseFragmentComponent", "Lid/dana/social/di/component/FriendshipListBaseFragmentComponent;", "friendshipModule", "Lid/dana/social/di/module/FriendshipModule;", "inject", "", "friendshipBottomSheetOnBoardingActivity", "Lid/dana/social/FriendshipBottomSheetOnBoardingActivity;", "mutedFragmentComponent", "Lid/dana/social/di/component/MutedFragmentComponent;", "mutedFragmentModule", "Lid/dana/social/di/module/MutedFragmentModule;", "myFeedsComponent", "Lid/dana/social/di/component/MyFeedsComponent;", "myFeedsModule", "Lid/dana/social/di/module/MyFeedsModule;", "reactionsComponent", "Lid/dana/social/di/component/ReactionsComponent;", "reactionsModule", "Lid/dana/social/di/module/ReactionsModule;", "relationshipBottomSheetComponent", "Lid/dana/social/di/component/RelationshipBottomSheetComponent;", "socialProfileComponent", "Lid/dana/social/di/component/SocialProfileComponent;", "socialProfileModule", "Lid/dana/social/di/module/SocialProfileModule;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Subcomponent(modules = {SocialCommonModule.class})
@PerModule
public interface AUPopSupportPreemption {
    @NotNull
    dismissPop getMax(@NotNull RelationshipBottomSheetModule relationshipBottomSheetModule);

    @NotNull
    toIOSStyle getMax(@NotNull ActivityReactionsModule activityReactionsModule);

    @NotNull
    wrapClickListener getMax();

    void getMax(@NotNull FriendshipBottomSheetOnBoardingActivity friendshipBottomSheetOnBoardingActivity);

    @NotNull
    APViewEventHelper.ClickListenerWrapper getMin(@NotNull FriendshipModule friendshipModule);

    @NotNull
    AUTitleBar.OnBackListener getMin(@NotNull FeedCommentModule feedCommentModule, @NotNull DeepLinkModule deepLinkModule, @NotNull ScanQrModule scanQrModule, @NotNull RestoreUrlModule restoreUrlModule, @NotNull FeatureModule featureModule, @NotNull OauthModule oauthModule, @NotNull ServicesModule servicesModule);

    @NotNull
    getTitleView_SetBefore getMin(@NotNull FeedNotificationModule feedNotificationModule);

    @NotNull
    onBack getMin(@NotNull FeedsCommentReportModule feedsCommentReportModule);

    @NotNull
    wrapItemClickListener getMin(@NotNull FriendsFeedsModule friendsFeedsModule, @NotNull DeepLinkModule deepLinkModule, @NotNull ScanQrModule scanQrModule, @NotNull RestoreUrlModule restoreUrlModule, @NotNull FeatureModule featureModule, @NotNull OauthModule oauthModule, @NotNull ServicesModule servicesModule);

    @NotNull
    AUPop length(@NotNull MyFeedsModule myFeedsModule, @NotNull DeepLinkModule deepLinkModule, @NotNull ScanQrModule scanQrModule, @NotNull RestoreUrlModule restoreUrlModule, @NotNull FeatureModule featureModule, @NotNull OauthModule oauthModule, @NotNull ServicesModule servicesModule);

    @NotNull
    addButtonView setMax(@NotNull ContentGroupingDetailModule contentGroupingDetailModule, @NotNull DeepLinkModule deepLinkModule, @NotNull ScanQrModule scanQrModule, @NotNull RestoreUrlModule restoreUrlModule, @NotNull FeatureModule featureModule, @NotNull OauthModule oauthModule, @NotNull ServicesModule servicesModule);

    @NotNull
    getCurrentGear setMax(@NotNull SocialProfileModule socialProfileModule, @NotNull DeepLinkModule deepLinkModule, @NotNull ScanQrModule scanQrModule, @NotNull RestoreUrlModule restoreUrlModule, @NotNull FeatureModule featureModule, @NotNull OauthModule oauthModule, @NotNull ServicesModule servicesModule);

    @NotNull
    showPop setMax(@NotNull ReactionsModule reactionsModule);

    @NotNull
    APViewEventHelper setMin(@NotNull RelationshipBottomSheetModule relationshipBottomSheetModule);
}
