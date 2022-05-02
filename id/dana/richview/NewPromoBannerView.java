package id.dana.richview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.feeds.GlobalFeedsModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.NewPromoBannerModule;
import id.dana.di.modules.OauthModule;
import id.dana.model.CdpContentModel;
import id.dana.model.ThirdPartyService;
import id.dana.news.NewsActivity;
import id.dana.promocenter.views.PromoCenterActivity;
import id.dana.promocenter.views.PromoCenterSeePromosView;
import id.dana.richview.BannerView;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.TopupSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BLEBridgeExtension;
import o.GriverManifest;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.IntRange;
import o.LoadingBridgeExtension;
import o.PrepareException;
import o.RewriteQueriesToDropUnusedColumns;
import o.autoGenerate;
import o.convertDipToPx;
import o.convertSpToPx;
import o.genTextSelector;
import o.getDuration;
import o.getInsetDodgeRect;
import o.getPageUrl;
import o.getScrimColor;
import o.isShowMenu;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onParsePackageSuccess;
import o.onProcess;
import o.projection;
import o.resetInternal;
import o.setTrimPathOffset;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011*\u0001&\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010#\u001a\u00020$H\u0016J\r\u0010%\u001a\u00020&H\u0002¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\bH\u0016J\u0006\u0010)\u001a\u00020$J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020\bH\u0002J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0002J\u0006\u0010;\u001a\u00020$J\b\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020$H\u0002J\b\u0010>\u001a\u00020$H\u0002J\b\u0010?\u001a\u00020$H\u0002J\b\u0010@\u001a\u00020$H\u0002J\b\u0010A\u001a\u00020$H\u0016J\b\u0010B\u001a\u00020$H\u0002J\b\u0010C\u001a\u00020$H\u0002J\b\u0010D\u001a\u00020$H\u0016J\u0006\u0010E\u001a\u00020$J\u0010\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020:H\u0002J\u0006\u0010H\u001a\u00020$J\u000e\u0010I\u001a\u00020$2\u0006\u00104\u001a\u000205R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006K"}, d2 = {"Lid/dana/richview/NewPromoBannerView;", "Lid/dana/base/BaseRichView;", "Lid/dana/home/promobanner/NewPromoBannerContract$View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "danaNewsSkeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "globalFeedPresenter", "Lid/dana/contract/feeds/GlobalFeedsContract$Presenter;", "getGlobalFeedPresenter", "()Lid/dana/contract/feeds/GlobalFeedsContract$Presenter;", "setGlobalFeedPresenter", "(Lid/dana/contract/feeds/GlobalFeedsContract$Presenter;)V", "headerSkeleton", "newsWidgetAdapter", "Lid/dana/home/news/adapter/NewsWidgetAdapter;", "promoBannerPresenter", "Lid/dana/home/promobanner/NewPromoBannerContract$Presenter;", "getPromoBannerPresenter", "()Lid/dana/home/promobanner/NewPromoBannerContract$Presenter;", "setPromoBannerPresenter", "(Lid/dana/home/promobanner/NewPromoBannerContract$Presenter;)V", "promoCenterConfig", "Lid/dana/domain/featureconfig/model/PromoCenterConfig;", "readDeepLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadDeepLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadDeepLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "dismissProgress", "", "generateLatestNewsOnClickListener", "id/dana/richview/NewPromoBannerView$generateLatestNewsOnClickListener$1", "()Lid/dana/richview/NewPromoBannerView$generateLatestNewsOnClickListener$1;", "getLayout", "hideBannerSkeleton", "hideHeaderSkeletonLoading", "hideNewsSkeleton", "hidePromoCenterSkeleton", "initNewsRecyclerView", "initOnClickListeners", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onFinishGetPromoCenterConfig", "onGetPromoCenterBannerSuccess", "promotionModel", "Lid/dana/model/PromotionModel;", "onNewsItemClicked", "position", "openH5Container", "url", "", "refreshView", "setBannerViewCallback", "setOnViewAllClicked", "setPromoCenterContent", "setPromoCenterEntryDescription", "setPromoCenterEntryTitle", "setup", "showHeaderSkeletonLoading", "showNewsSkeleton", "showProgress", "showSkeleton", "trackNewsOpen", "activityTitle", "unbindAdapter", "updateBanner", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NewPromoBannerView extends BaseRichView implements GriverManifest.AnonymousClass8.length {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    public static final int MAX_NEWS_SIZE = 3;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams getMax;
    private getPageUrl getMin;
    @Inject
    public setTrimPathOffset.setMax globalFeedPresenter;
    /* access modifiers changed from: private */
    public GriverManifest.AnonymousClass56 length;
    @Inject
    public GriverManifest.AnonymousClass8.setMax promoBannerPresenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    private HashMap setMax;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams setMin;

    @JvmOverloads
    public NewPromoBannerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.new_view_promo_banner;
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    public static final /* synthetic */ onDetachedFromLayoutParams access$getDanaNewsSkeleton$p(NewPromoBannerView newPromoBannerView) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = newPromoBannerView.getMax;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaNewsSkeleton");
        }
        return ondetachedfromlayoutparams;
    }

    public static final /* synthetic */ onDetachedFromLayoutParams access$getHeaderSkeleton$p(NewPromoBannerView newPromoBannerView) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = newPromoBannerView.setMin;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerSkeleton");
        }
        return ondetachedfromlayoutparams;
    }

    public static final /* synthetic */ GriverManifest.AnonymousClass56 access$getNewsWidgetAdapter$p(NewPromoBannerView newPromoBannerView) {
        GriverManifest.AnonymousClass56 r1 = newPromoBannerView.length;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newsWidgetAdapter");
        }
        return r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewPromoBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewPromoBannerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }

    @NotNull
    public final GriverManifest.AnonymousClass8.setMax getPromoBannerPresenter() {
        GriverManifest.AnonymousClass8.setMax setmax = this.promoBannerPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promoBannerPresenter");
        }
        return setmax;
    }

    public final void setPromoBannerPresenter(@NotNull GriverManifest.AnonymousClass8.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.promoBannerPresenter = setmax;
    }

    @NotNull
    public final setTrimPathOffset.setMax getGlobalFeedPresenter() {
        setTrimPathOffset.setMax setmax = this.globalFeedPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalFeedPresenter");
        }
        return setmax;
    }

    public final void setGlobalFeedPresenter(@NotNull setTrimPathOffset.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.globalFeedPresenter = setmax;
    }

    @NotNull
    public final getDuration.length getReadDeepLinkPropertiesPresenter() {
        getDuration.length length2 = this.readDeepLinkPropertiesPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
        }
        return length2;
    }

    public final void setReadDeepLinkPropertiesPresenter(@NotNull getDuration.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.readDeepLinkPropertiesPresenter = length2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"id/dana/richview/NewPromoBannerView$injectComponent$1", "Lid/dana/contract/feeds/GlobalFeedsContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetDefaultFeedFromConfigSuccess", "feedsModel", "Lid/dana/feeds/model/FeedsModel;", "isFromRefresh", "", "(Lid/dana/feeds/model/FeedsModel;Ljava/lang/Boolean;)V", "onGetFeeds", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements setTrimPathOffset.setMin {
        final /* synthetic */ NewPromoBannerView setMax;

        public final void dismissProgress() {
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        public final void showProgress() {
        }

        getMax(NewPromoBannerView newPromoBannerView) {
            this.setMax = newPromoBannerView;
        }

        public final void length(@NotNull BLEBridgeExtension.AnonymousClass10 r3) {
            Intrinsics.checkNotNullParameter(r3, "feedsModel");
            List<onProcess> list = r3.setMax;
            Intrinsics.checkNotNullExpressionValue(list, "feedsModel.activityModelList");
            if (!list.isEmpty()) {
                NewPromoBannerView.access$hideNewsSkeleton(this.setMax);
                GriverManifest.AnonymousClass56 access$getNewsWidgetAdapter$p = NewPromoBannerView.access$getNewsWidgetAdapter$p(this.setMax);
                List<onProcess> list2 = r3.setMax;
                Intrinsics.checkNotNullExpressionValue(list2, "feedsModel.activityModelList");
                access$getNewsWidgetAdapter$p.getMin(CollectionsKt.take(list2, 3));
            }
        }

        public final void setMax(@NotNull BLEBridgeExtension.AnonymousClass10 r3, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(r3, "feedsModel");
            if (r3.setMax == null || r3.setMax.isEmpty()) {
                this.setMax.getGlobalFeedPresenter().getMax(3, (String) null);
                return;
            }
            NewPromoBannerView.access$hideNewsSkeleton(this.setMax);
            GriverManifest.AnonymousClass56 access$getNewsWidgetAdapter$p = NewPromoBannerView.access$getNewsWidgetAdapter$p(this.setMax);
            List<onProcess> list = r3.setMax;
            Intrinsics.checkNotNullExpressionValue(list, "feedsModel.activityModelList");
            access$getNewsWidgetAdapter$p.getMin(CollectionsKt.take(list, 3));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/richview/NewPromoBannerView$injectComponent$2", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements style.getMin {
        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
        }

        @JvmDefault
        public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            Intrinsics.checkNotNullParameter(str, "authCode");
        }

        @JvmDefault
        public final void getMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void getMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void length() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void setMax(boolean z) {
        }

        @JvmDefault
        public final void setMin() {
        }

        @JvmDefault
        public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
        }

        @JvmDefault
        public final void setMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin() {
        }
    }

    public final void setup() {
        showProgress();
        this.length = new IMultiInstanceInvalidationCallback.Stub<Ignore<onProcess>, onProcess>() {
            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                return new Ignore<onProcess>(context, viewGroup) {
                    public final /* synthetic */ void setMax(Object obj) {
                        String str;
                        int i;
                        String str2;
                        onProcess onprocess = (onProcess) obj;
                        super.setMax(onprocess);
                        View view = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                        TextView textView = (TextView) view.findViewById(resetInternal.setMax.setContentInsetEndWithActions);
                        String str3 = "";
                        String str4 = null;
                        if (textView != null) {
                            if (onprocess != null) {
                                str2 = onprocess.getMin;
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = str3;
                            }
                            textView.setText(str2);
                        }
                        View view2 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                        TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.getCurrentContentInsetLeft);
                        if (textView2 != null) {
                            if (onprocess != null) {
                                str4 = onprocess.getMax;
                            }
                            if (str4 != null) {
                                str3 = str4;
                            }
                            textView2.setText(str3);
                        }
                        if (onprocess != null && (str = onprocess.isInside) != null) {
                            if (RewriteQueriesToDropUnusedColumns.setMax(str)) {
                                if (str != null) {
                                    i = str.length();
                                } else {
                                    i = 0;
                                }
                                int max = dispatchOnCancelled.setMax(i);
                                if (i != max) {
                                    onCanceled oncanceled = new onCanceled(i, max, 1);
                                    onCancelLoad.setMax(-25497265, oncanceled);
                                    onCancelLoad.getMin(-25497265, oncanceled);
                                }
                                RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.length, (byte) 0);
                                getmax.getMin = str;
                                getmax.setMax = R.drawable.ic_dana_logo_white;
                                getmax.isInside = new setDpMargin();
                                View view3 = this.itemView;
                                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                                getmax.setMin = (AppCompatImageView) view3.findViewById(resetInternal.setMax.setAutoMirrored);
                                new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
                                return;
                            }
                            updateMessageMenuItem<Drawable> min = ((updateCornerMarking) Glide.getMax(this.length)).setMax(str).setMax((int) R.drawable.ic_dana_logo_white).setMin((updatePostLayout<Bitmap>) new setDpMargin()).setMin((int) R.drawable.ic_dana_logo_white);
                            View view4 = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                            min.length((ImageView) (AppCompatImageView) view4.findViewById(resetInternal.setMax.setAutoMirrored));
                        }
                    }

                    {
                        Intrinsics.checkNotNullParameter(r2, HummerConstants.CONTEXT);
                        Intrinsics.checkNotNullParameter(r3, "parent");
                    }
                };
            }
        };
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatEditText);
        if (recyclerView != null) {
            GriverManifest.AnonymousClass56 r2 = this.length;
            if (r2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newsWidgetAdapter");
            }
            recyclerView.setAdapter(r2);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatEditText);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        GriverManifest.AnonymousClass56 r0 = this.length;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newsWidgetAdapter");
        }
        r0.getMax((Ignore.setMin) new length(this, getBaseActivity()));
        refreshView();
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.MediaMetadataCompat$LongKey);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new setMax(this));
        }
        ((NewBannerView) _$_findCachedViewById(resetInternal.setMax.IMediaControllerCallback)).setGnNotificationCloseContainerCallback(new isInside(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ NewPromoBannerView getMin;

        setMax(NewPromoBannerView newPromoBannerView) {
            this.getMin = newPromoBannerView;
        }

        public final void onClick(View view) {
            NewsActivity.getMax getmax = NewsActivity.Companion;
            Context context = this.getMin.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            NewsActivity.getMax.length(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/richview/NewPromoBannerView$generateLatestNewsOnClickListener$1", "Lid/dana/base/SingleItemClickListener;", "singleItemClick", "", "position", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends projection {
        final /* synthetic */ NewPromoBannerView setMax;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(NewPromoBannerView newPromoBannerView, autoGenerate autogenerate) {
            super(autogenerate);
            this.setMax = newPromoBannerView;
        }

        public final void getMax(int i) {
            NewPromoBannerView.access$onNewsItemClicked(this.setMax, i);
        }
    }

    public final void showProgress() {
        showSkeleton();
    }

    public final void refreshView() {
        GriverManifest.AnonymousClass8.setMax setmax = this.promoBannerPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promoBannerPresenter");
        }
        setmax.getMax();
        GriverManifest.AnonymousClass8.setMax setmax2 = this.promoBannerPresenter;
        if (setmax2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promoBannerPresenter");
        }
        setmax2.length();
        if (this.getMax == null) {
            getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatEditText));
            GriverManifest.AnonymousClass56 r0 = this.length;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newsWidgetAdapter");
            }
            getmax.length = r0;
            getmax.setMin = 3;
            getmax.getMax = R.layout.dana_info_view_news_skeleton;
            getmax.IsOverlapping = 1500;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            Intrinsics.checkNotNullExpressionValue(getscrimcolor, "Skeleton.bind(rv_news_li…)\n                .show()");
            this.getMax = getscrimcolor;
        } else {
            onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
            if (ondetachedfromlayoutparams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("danaNewsSkeleton");
            }
            ondetachedfromlayoutparams.getMin();
        }
        setTrimPathOffset.setMax setmax3 = this.globalFeedPresenter;
        if (setmax3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalFeedPresenter");
        }
        setmax3.length(Boolean.TRUE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onClose"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements BannerView.getMax {
        final /* synthetic */ NewPromoBannerView setMin;

        isInside(NewPromoBannerView newPromoBannerView) {
            this.setMin = newPromoBannerView;
        }

        public final void getMax() {
            this.setMin.refreshView();
        }
    }

    public final void hideBannerSkeleton() {
        NewBannerView newBannerView = (NewBannerView) _$_findCachedViewById(resetInternal.setMax.IMediaControllerCallback);
        if (newBannerView != null) {
            newBannerView.hideSkeleton();
        }
    }

    public final void unbindAdapter() {
        NewBannerView newBannerView = (NewBannerView) _$_findCachedViewById(resetInternal.setMax.IMediaControllerCallback);
        if (newBannerView != null) {
            newBannerView.unbindAdapter();
        }
    }

    public final void updateBanner(@NotNull LoadingBridgeExtension loadingBridgeExtension) {
        Intrinsics.checkNotNullParameter(loadingBridgeExtension, "promotionModel");
        NewBannerView newBannerView = (NewBannerView) _$_findCachedViewById(resetInternal.setMax.IMediaControllerCallback);
        if (newBannerView != null) {
            newBannerView.setPromotionModel(loadingBridgeExtension);
            newBannerView.setContents(loadingBridgeExtension.setMin);
            newBannerView.display();
            newBannerView.setEntryPoint(TopupSource.PROMOTION_BANNER);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ NewPromoBannerView getMax;

        equals(NewPromoBannerView newPromoBannerView) {
            this.getMax = newPromoBannerView;
        }

        public final void onClick(View view) {
            this.getMax.getContext().startActivity(new Intent(this.getMax.getContext(), PromoCenterActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/richview/NewPromoBannerView$Companion;", "", "()V", "MAX_NEWS_SIZE", "", "getMaxNewsSize", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void injectComponent(@NotNull PrepareException.AnonymousClass1 r15) {
        Intrinsics.checkNotNullParameter(r15, "applicationComponent");
        onParsePackageSuccess.getMin getmin = new onParsePackageSuccess.getMin((byte) 0);
        if (r15 != null) {
            getmin.toFloatRange = r15;
            getmin.getMin = new NewPromoBannerModule(this);
            getmin.length = new GlobalFeedsModule(new getMax(this));
            getmin.isInside = new ServicesModule((style.getMin) new setMin());
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            max.getMax = getBaseActivity();
            max.length = TrackerKey.SourceType.DANA_NEWS;
            getmin.setMax = new DeepLinkModule(max, (byte) 0);
            ScanQrModule.setMin max2 = ScanQrModule.getMax();
            max2.setMin = getBaseActivity();
            getmin.getMax = new ScanQrModule(max2, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = getBaseActivity();
            getmin.setMin = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length2 = FeatureModule.length();
            length2.setMax = getBaseActivity();
            getmin.equals = new FeatureModule(length2, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = getBaseActivity();
            getmin.toIntRange = new OauthModule(min2, (byte) 0);
            stopIgnoring.setMin(getmin.getMin, NewPromoBannerModule.class);
            stopIgnoring.setMin(getmin.length, GlobalFeedsModule.class);
            stopIgnoring.setMin(getmin.setMax, DeepLinkModule.class);
            stopIgnoring.setMin(getmin.getMax, ScanQrModule.class);
            stopIgnoring.setMin(getmin.setMin, RestoreUrlModule.class);
            stopIgnoring.setMin(getmin.equals, FeatureModule.class);
            stopIgnoring.setMin(getmin.toIntRange, OauthModule.class);
            if (getmin.isInside == null) {
                getmin.isInside = new ServicesModule();
            }
            stopIgnoring.setMin(getmin.toFloatRange, PrepareException.AnonymousClass1.class);
            new onParsePackageSuccess(getmin.getMin, getmin.length, getmin.setMax, getmin.getMax, getmin.setMin, getmin.equals, getmin.toIntRange, getmin.isInside, getmin.toFloatRange, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            GriverManifest.AnonymousClass8.setMax setmax = this.promoBannerPresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("promoBannerPresenter");
            }
            getminArr[0] = setmax;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public final void showSkeleton() {
        if (this.setMin != null) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMin;
            if (ondetachedfromlayoutparams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerSkeleton");
            }
            ondetachedfromlayoutparams.getMin();
        } else {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getLifecycle));
            setmax.getMax = R.layout.default_home_widget_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            Intrinsics.checkNotNullExpressionValue(getinsetdodgerect, "Skeleton.bind(cl_promo_b…)\n                .show()");
            this.setMin = getinsetdodgerect;
        }
        NewBannerView newBannerView = (NewBannerView) _$_findCachedViewById(resetInternal.setMax.IMediaControllerCallback);
        if (newBannerView != null) {
            newBannerView.showSkeleton();
        }
    }

    public final void dismissProgress() {
        if (this.setMin != null) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMin;
            if (ondetachedfromlayoutparams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerSkeleton");
            }
            ondetachedfromlayoutparams.length();
        }
        hideBannerSkeleton();
    }

    public final void onFinishGetPromoCenterConfig(@NotNull getPageUrl getpageurl) {
        Intrinsics.checkNotNullParameter(getpageurl, "promoCenterConfig");
        if (this.setMin != null) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMin;
            if (ondetachedfromlayoutparams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerSkeleton");
            }
            ondetachedfromlayoutparams.length();
        }
        this.getMin = getpageurl;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        PromoCenterSeePromosView promoCenterSeePromosView = new PromoCenterSeePromosView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        promoCenterSeePromosView.setButtonIcon(getpageurl.getButtonIconUrl());
        promoCenterSeePromosView.setButtonTitle(getpageurl.getButtonTitle());
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getChildHorizontalGravity);
        if (textView != null) {
            textView.setText(getContext().getString(R.string.promo_center_entry_title));
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.shouldLayout);
        if (textView2 != null) {
            textView2.setText(getContext().getString(R.string.promo_center_entry_description));
        }
        PromoCenterSeePromosView promoCenterSeePromosView2 = (PromoCenterSeePromosView) _$_findCachedViewById(resetInternal.setMax.setFirstHorizontalStyle);
        if (promoCenterSeePromosView2 != null) {
            promoCenterSeePromosView2.setOnClickListener(new equals(this));
        }
    }

    public final void onGetPromoCenterBannerSuccess(@NotNull LoadingBridgeExtension loadingBridgeExtension) {
        Intrinsics.checkNotNullParameter(loadingBridgeExtension, "promotionModel");
        List<CdpContentModel> list = loadingBridgeExtension.setMin;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        NewBannerView newBannerView = (NewBannerView) _$_findCachedViewById(resetInternal.setMax.IMediaControllerCallback);
        if (newBannerView != null) {
            newBannerView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
            newBannerView.setPromotionModel(loadingBridgeExtension);
            newBannerView.setContents(list);
            if (newBannerView != null) {
                newBannerView.display();
            }
        }
    }

    public static final /* synthetic */ void access$hideNewsSkeleton(NewPromoBannerView newPromoBannerView) {
        if (newPromoBannerView.getMax != null) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams = newPromoBannerView.getMax;
            if (ondetachedfromlayoutparams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("danaNewsSkeleton");
            }
            ondetachedfromlayoutparams.length();
        }
    }

    public static final /* synthetic */ void access$onNewsItemClicked(NewPromoBannerView newPromoBannerView, int i) {
        GriverManifest.AnonymousClass56 r0 = newPromoBannerView.length;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newsWidgetAdapter");
        }
        onProcess onprocess = (onProcess) r0.setMin(i);
        if (onprocess != null) {
            String str = onprocess.getMin;
            Intrinsics.checkNotNullExpressionValue(str, "activityModel.activityTitle");
            Context context = newPromoBannerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            convertDipToPx.length length2 = new convertDipToPx.length(context.getApplicationContext());
            length2.getMax = TrackerKey.Event.DANA_NEWS_OPEN;
            convertDipToPx.length max = length2.setMax(TrackerKey.NewsProperty.NEWS_TITLE, str);
            max.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
            List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
            String str2 = onprocess.toDoubleRange;
            Intrinsics.checkNotNullExpressionValue(str2, "activityModel.redirectUrl");
            if (isShowMenu.length(str2)) {
                getDuration.length length4 = newPromoBannerView.readDeepLinkPropertiesPresenter;
                if (length4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
                }
                length4.setMax(str2);
                return;
            }
            DanaH5.startContainerFullUrl(str2);
        }
    }
}
