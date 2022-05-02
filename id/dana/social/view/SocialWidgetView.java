package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.social.di.module.SocialWidgetModule;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import o.AUSegment;
import o.CornerMarkingDataProvider;
import o.GriverRpcUtils;
import o.IntRange;
import o.PrepareException;
import o.access$2202;
import o.addSubTitleView;
import o.containsFavoriteMenuItem;
import o.getInsetDodgeRect;
import o.getProgressViewStartOffset;
import o.getScrimColor;
import o.initContent;
import o.isBaselineAligned;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.setButtonStyle;
import o.setShadowResourceRight;
import o.setStateOn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001QB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020\u0007H\u0016J\b\u00100\u001a\u00020-H\u0002J\b\u00101\u001a\u00020-H\u0002J\b\u00102\u001a\u00020-H\u0002J\b\u00103\u001a\u00020-H\u0002J\b\u00104\u001a\u00020-H\u0002J\b\u00105\u001a\u00020-H\u0002J\b\u00106\u001a\u00020-H\u0002J\b\u00107\u001a\u00020-H\u0002J\b\u00108\u001a\u00020-H\u0002J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020=H\u0002J\u000e\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020@J\u0010\u0010>\u001a\u00020-2\u0006\u0010A\u001a\u00020=H\u0002J\u0006\u0010B\u001a\u00020-J\u0006\u0010C\u001a\u00020-J\b\u0010D\u001a\u00020-H\u0002J\u000e\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020\u001dJ\b\u0010G\u001a\u00020-H\u0016J\b\u0010H\u001a\u00020-H\u0002J\b\u0010I\u001a\u00020-H\u0002J\b\u0010J\u001a\u00020-H\u0002J\b\u0010K\u001a\u00020-H\u0002J\b\u0010L\u001a\u00020-H\u0002J\b\u0010M\u001a\u00020-H\u0002J\b\u0010N\u001a\u00020-H\u0002J\b\u0010O\u001a\u00020-H\u0002J\b\u0010P\u001a\u00020-H\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R+\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00188B@BX\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0010\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010(¨\u0006R"}, d2 = {"Lid/dana/social/view/SocialWidgetView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "contactPermissionDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getContactPermissionDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "contactPermissionDialog$delegate", "Lkotlin/Lazy;", "presenter", "Lid/dana/social/contract/SocialWidgetContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/SocialWidgetContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/SocialWidgetContract$Presenter;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getSkeletonScreen", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "skeletonScreen$delegate", "socialWidgetListener", "Lid/dana/social/view/SocialWidgetView$SocialWidgetListener;", "getSocialWidgetListener", "()Lid/dana/social/view/SocialWidgetView$SocialWidgetListener;", "setSocialWidgetListener", "(Lid/dana/social/view/SocialWidgetView$SocialWidgetListener;)V", "socialWidgetViewAdapter", "Lid/dana/social/adapter/SocialWidgetFeedAdapter;", "<set-?>", "timelineSkeleton", "getTimelineSkeleton", "setTimelineSkeleton", "(Lcom/ethanhua/skeleton/SkeletonScreen;)V", "timelineSkeleton$delegate", "createSkeletonScreen", "createTimelineSkeletonScreen", "dismissContactPermissionDialog", "", "getFeedInitStatus", "getLayout", "hideButtonSkeleton", "hideNetworkErrorView", "hideTimelineSkeleton", "hideViewAllButton", "initActivateButton", "initNoNetworkRetryButton", "initRecyclerView", "initSocialFeedView", "initViewAllButton", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "isHasContactPermission", "", "onRequestPermissionResult", "report", "Lid/dana/utils/permission/Permission$PermissionReport;", "granted", "onResume", "refreshTimeline", "retryButtonAction", "setWidgetListener", "listener", "setup", "showButtonSkeleton", "showContactPermissionDialog", "showEmptyFeedView", "showLetsStartButton", "showNetworkErrorView", "showNotActiveState", "showRetryActivationButton", "showTimelineSkeleton", "showViewAllButton", "SocialWidgetListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SocialWidgetView extends BaseRichView {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SocialWidgetView.class, "timelineSkeleton", "getTimelineSkeleton()Lcom/ethanhua/skeleton/SkeletonScreen;", 0))};
    private final Lazy getMax;
    private HashMap getMin;
    /* access modifiers changed from: private */
    public final AUSegment length;
    @Inject
    @Named("oldSocialWidgetPresenter")
    public addSubTitleView.getMin presenter;
    private final Lazy setMax;
    private final Lazy setMin;
    public setMax socialWidgetListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/social/view/SocialWidgetView$SocialWidgetListener;", "", "checkContactPermission", "", "enableFeeds", "onActivateClick", "onSeeAllButtonClick", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void getMax();

        void getMin();

        void length();

        void setMin();
    }

    @JvmOverloads
    public SocialWidgetView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SocialWidgetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_feeds_entry_point;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SocialWidgetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SocialWidgetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = new AUSegment();
        this.getMax = LazyKt.lazy(new setMin(this));
        this.setMin = LazyKt.lazy(new IsOverlapping(this));
        this.setMax = LazyKt.lazy(new toDoubleRange(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SocialWidgetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = new AUSegment();
        this.getMax = LazyKt.lazy(new setMin(this));
        this.setMin = LazyKt.lazy(new IsOverlapping(this));
        this.setMax = LazyKt.lazy(new toDoubleRange(this));
    }

    @NotNull
    public final setMax getSocialWidgetListener() {
        setMax setmax = this.socialWidgetListener;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialWidgetListener");
        }
        return setmax;
    }

    public final void setSocialWidgetListener(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.socialWidgetListener = setmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/view/SocialWidgetView$setWidgetListener$1", "Lid/dana/social/adapter/BaseSocialFeedInteraction;", "onItemClicked", "", "itemPosition", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends GriverRpcUtils.AnonymousClass1 {
        final /* synthetic */ SocialWidgetView getMax;

        toIntRange(SocialWidgetView socialWidgetView) {
            this.getMax = socialWidgetView;
        }

        public final void setMax(int i) {
            Context context = this.getMax.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            setButtonStyle.getMin(context);
            this.getMax.getSocialWidgetListener().length();
        }
    }

    public final void setWidgetListener(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.socialWidgetListener = setmax;
        AUSegment aUSegment = this.length;
        initContent tointrange = new toIntRange(this);
        Intrinsics.checkNotNullParameter(tointrange, "<set-?>");
        aUSegment.getMax = tointrange;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<isBaselineAligned> {
        final /* synthetic */ SocialWidgetView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(SocialWidgetView socialWidgetView) {
            super(0);
            this.this$0 = socialWidgetView;
        }

        @NotNull
        public final isBaselineAligned invoke() {
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context);
            getmax.toFloatRange = this.this$0.getResources().getString(R.string.allow_contact_access);
            getProgressViewStartOffset.getMax getmax2 = getmax;
            getmax2.isInside = this.this$0.getResources().getString(R.string.please_allow_access);
            getProgressViewStartOffset.getMax getmax3 = getmax2;
            getmax3.setMax = R.drawable.ic_feed_no_contact;
            getProgressViewStartOffset.getMax min = getmax3.getMax(this.this$0.getResources().getString(R.string.cancel_allow_contact), new Function1<View, Unit>(this) {
                final /* synthetic */ setMin this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((View) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "it");
                    ((isBaselineAligned) this.this$0.this$0.getMax.getValue()).dismiss();
                }
            }).setMin(this.this$0.getResources().getString(R.string.allow), new Function1<View, Unit>(this) {
                final /* synthetic */ setMin this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((View) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "it");
                    this.this$0.this$0.getSocialWidgetListener().setMin();
                    ((isBaselineAligned) this.this$0.this$0.getMax.getValue()).dismiss();
                }
            });
            min.toIntRange = 0;
            return new getProgressViewStartOffset(min.invoke, min.length, min, min.equals, (byte) 0).getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/SkeletonScreen;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<onDetachedFromLayoutParams> {
        final /* synthetic */ SocialWidgetView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(SocialWidgetView socialWidgetView) {
            super(0);
            this.this$0 = socialWidgetView;
        }

        @NotNull
        public final onDetachedFromLayoutParams invoke() {
            return SocialWidgetView.access$createSkeletonScreen(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/SkeletonScreen;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function0<onDetachedFromLayoutParams> {
        final /* synthetic */ SocialWidgetView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(SocialWidgetView socialWidgetView) {
            super(0);
            this.this$0 = socialWidgetView;
        }

        @NotNull
        public final onDetachedFromLayoutParams invoke() {
            return SocialWidgetView.access$createTimelineSkeletonScreen(this.this$0);
        }
    }

    @NotNull
    public final addSubTitleView.getMin getPresenter() {
        addSubTitleView.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmin;
    }

    public final void setPresenter(@NotNull addSubTitleView.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.presenter = getmin;
    }

    public final void setup() {
        addSubTitleView.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.setMin();
        setShadowResourceRight setshadowresourceright = new setShadowResourceRight(getContext(), R.dimen.f26272131165275);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getAutoSizeTextType);
        if (recyclerView != null) {
            recyclerView.addItemDecoration(setshadowresourceright);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getAutoSizeTextType);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getAutoSizeTextType);
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.length);
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.setPaddingRight);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new length(this));
        }
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.IPostMessageService);
        if (button != null) {
            button.setOnClickListener(new getMax(this));
        }
        Button button2 = (Button) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityService$Stub$Proxy);
        if (button2 != null) {
            button2.setOnClickListener(new getMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ SocialWidgetView getMin;

        getMax(SocialWidgetView socialWidgetView) {
            this.getMin = socialWidgetView;
        }

        public final void onClick(View view) {
            setMax socialWidgetListener = this.getMin.getSocialWidgetListener();
            socialWidgetListener.getMax();
            socialWidgetListener.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ SocialWidgetView getMax;

        getMin(SocialWidgetView socialWidgetView) {
            this.getMax = socialWidgetView;
        }

        public final void onClick(View view) {
            SocialWidgetView.access$hideNetworkErrorView(this.getMax);
            SocialWidgetView.access$showTimelineSkeleton(this.getMax);
            this.getMax.getPresenter().setMin();
            this.getMax.getPresenter().getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ SocialWidgetView length;

        length(SocialWidgetView socialWidgetView) {
            this.length = socialWidgetView;
        }

        public final void onClick(View view) {
            Context context = this.length.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            setButtonStyle.getMin(context);
            this.length.getSocialWidgetListener().length();
        }
    }

    /* access modifiers changed from: private */
    public final void getMin() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$MediaKeyAction);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getAutoSizeTextType);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        ((onDetachedFromLayoutParams) this.setMin.getValue()).length();
        ((onDetachedFromLayoutParams) this.setMax.getValue()).length();
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.setPaddingRight);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setVisibility(8);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.makeLayout);
        if (textView != null) {
            textView.setVisibility(8);
        }
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.IPostMessageService);
        if (button != null) {
            button.setEnabled(true);
            button.setText(button.getContext().getString(R.string.social_feeds_activate_feed));
            button.setTextColor(IntRange.setMax(button.getContext(), R.color.f24762131100430));
            button.setBackground(IntRange.length(button.getContext(), (int) R.drawable.btn_common));
        }
    }

    private final boolean setMax() {
        return CornerMarkingDataProvider.IsOverlapping() && setStateOn.getMin(getBaseActivity(), "android.permission.READ_CONTACTS");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<Unit> {
        final /* synthetic */ SocialWidgetView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(SocialWidgetView socialWidgetView) {
            super(0);
            this.this$0 = socialWidgetView;
        }

        public final void invoke() {
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            setButtonStyle.getMin(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"id/dana/social/view/SocialWidgetView$injectComponent$1", "Lid/dana/social/contract/SocialWidgetContract$View;", "onErrorInitSocialFeed", "", "onFinishGetFriendsTimeline", "socialFeedWrapper", "Lid/dana/social/model/SocialFeedWrapperModel;", "onFinishGetSocialConfig", "enable", "", "onFinishInitSocialFeed", "onFirstTimeGetTimeline", "onLoadingInitFeed", "onNotActicateInitFeed", "onWidgetTimeLineError", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements addSubTitleView.length {
        final /* synthetic */ SocialWidgetView getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void getMin(@NotNull access$2202 access_2202) {
            Intrinsics.checkNotNullParameter(access_2202, "socialFeedWrapper");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        isInside(SocialWidgetView socialWidgetView) {
            this.getMin = socialWidgetView;
        }

        public final void setMin() {
            this.getMin.getMin();
        }

        public final void getMax(boolean z) {
            if (z) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.IResultReceiver$Stub$Proxy);
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "cl_friendship");
                constraintLayout.setVisibility(0);
                SocialWidgetView.access$initSocialFeedView(this.getMin);
                this.getMin.getSocialWidgetListener().getMin();
                return;
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.IResultReceiver$Stub$Proxy);
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "cl_friendship");
            constraintLayout2.setVisibility(8);
        }

        public final void getMax() {
            this.getMin.getPresenter().getMax();
            this.getMin.getSocialWidgetListener().getMin();
            SocialWidgetView.access$showViewAllButton(this.getMin);
            SocialWidgetView.access$showTimelineSkeleton(this.getMin);
            this.getMin.getPresenter().equals();
        }

        public final void getMax(@NotNull access$2202 access_2202) {
            Intrinsics.checkNotNullParameter(access_2202, "socialFeedWrapper");
            SocialWidgetView.access$hideNetworkErrorView(this.getMin);
            if (access_2202.setMin.isEmpty()) {
                ((onDetachedFromLayoutParams) this.getMin.setMax.getValue()).length();
                SocialWidgetView.access$showEmptyFeedView(this.getMin);
                return;
            }
            this.getMin.length.getMin(access_2202.setMin);
            ((onDetachedFromLayoutParams) this.getMin.setMax.getValue()).length();
        }

        public final void length() {
            SocialWidgetView.access$showRetryActivationButton(this.getMin);
        }

        public final void setMax() {
            ((onDetachedFromLayoutParams) this.getMin.setMax.getValue()).length();
            if (this.getMin.length.getItemCount() == 0) {
                SocialWidgetView.access$showNetworkErrorView(this.getMin);
            }
        }

        public final void getMin() {
            SocialWidgetView.access$hideNetworkErrorView(this.getMin);
            ((onDetachedFromLayoutParams) this.getMin.setMax.getValue()).length();
            SocialWidgetView.access$hideViewAllButton(this.getMin);
            this.getMin.getMax();
        }
    }

    public final void injectComponent(@NotNull PrepareException.AnonymousClass1 r3) {
        Intrinsics.checkNotNullParameter(r3, "applicationComponent");
        r3.getMin(new SocialWidgetModule(new isInside(this))).length(this);
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        addSubTitleView.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getminArr[0] = getmin;
        registerPresenter(getminArr);
    }

    public final void onResume() {
        addSubTitleView.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/view/SocialWidgetView$showRetryActivationButton$1$1"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ SocialWidgetView getMin;

        equals(SocialWidgetView socialWidgetView) {
            this.getMin = socialWidgetView;
        }

        public final void onClick(View view) {
            TextView textView = (TextView) this.getMin._$_findCachedViewById(resetInternal.setMax.makeLayout);
            if (textView != null) {
                textView.setVisibility(8);
            }
            SocialWidgetView.access$retryButtonAction(this.getMin);
        }
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.makeLayout);
        if (textView != null) {
            textView.setVisibility(8);
        }
        ((onDetachedFromLayoutParams) this.setMin.getValue()).getMin();
    }

    public final void refreshTimeline() {
        addSubTitleView.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.length();
    }

    public final void onRequestPermissionResult(@NotNull setStateOn.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "report");
        if (Intrinsics.areEqual((Object) "android.permission.READ_CONTACTS", (Object) setmin.getMin) && setmin.setMax()) {
            addSubTitleView.getMin getmin = this.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin.getMax((Function0<Unit>) new toFloatRange(this));
            getMax();
            addSubTitleView.getMin getmin2 = this.presenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin2.getMax(true);
            addSubTitleView.getMin getmin3 = this.presenter;
            if (getmin3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin3.getMin();
        }
    }

    public static final /* synthetic */ void access$hideNetworkErrorView(SocialWidgetView socialWidgetView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) socialWidgetView._$_findCachedViewById(resetInternal.setMax.getVisibleItems);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    public static final /* synthetic */ void access$showTimelineSkeleton(SocialWidgetView socialWidgetView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) socialWidgetView._$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$MediaKeyAction);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        RecyclerView recyclerView = (RecyclerView) socialWidgetView._$_findCachedViewById(resetInternal.setMax.getAutoSizeTextType);
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        ((onDetachedFromLayoutParams) socialWidgetView.setMax.getValue()).getMin();
    }

    public static final /* synthetic */ void access$initSocialFeedView(SocialWidgetView socialWidgetView) {
        if (socialWidgetView.setMax()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) socialWidgetView._$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$MediaKeyAction);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            socialWidgetView.getMax();
            addSubTitleView.getMin getmin = socialWidgetView.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin.getMax(true);
            return;
        }
        socialWidgetView.getMin();
    }

    public static final /* synthetic */ void access$showViewAllButton(SocialWidgetView socialWidgetView) {
        ((onDetachedFromLayoutParams) socialWidgetView.setMin.getValue()).length();
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) socialWidgetView._$_findCachedViewById(resetInternal.setMax.setPaddingRight);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setVisibility(0);
        }
    }

    public static final /* synthetic */ void access$showEmptyFeedView(SocialWidgetView socialWidgetView) {
        RecyclerView recyclerView = (RecyclerView) socialWidgetView._$_findCachedViewById(resetInternal.setMax.getAutoSizeTextType);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) socialWidgetView._$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$MediaKeyAction);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) socialWidgetView._$_findCachedViewById(resetInternal.setMax.findItemsWithShortcutForKey);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        }
    }

    public static final /* synthetic */ void access$showRetryActivationButton(SocialWidgetView socialWidgetView) {
        ((onDetachedFromLayoutParams) socialWidgetView.setMin.getValue()).length();
        ((onDetachedFromLayoutParams) socialWidgetView.setMax.getValue()).length();
        TextView textView = (TextView) socialWidgetView._$_findCachedViewById(resetInternal.setMax.makeLayout);
        if (textView != null) {
            textView.setVisibility(0);
        }
        Button button = (Button) socialWidgetView._$_findCachedViewById(resetInternal.setMax.IPostMessageService);
        if (button != null) {
            button.setEnabled(true);
            button.setText(button.getContext().getString(R.string.social_feeds_error));
            button.setTextColor(IntRange.setMax(button.getContext(), R.color.f24762131100430));
            button.setBackground(IntRange.length(button.getContext(), (int) R.drawable.btn_common));
            button.setOnClickListener(new equals(socialWidgetView));
        }
    }

    public static final /* synthetic */ void access$showNetworkErrorView(SocialWidgetView socialWidgetView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) socialWidgetView._$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$MediaKeyAction);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) socialWidgetView._$_findCachedViewById(resetInternal.setMax.getVisibleItems);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        }
    }

    public static final /* synthetic */ void access$hideViewAllButton(SocialWidgetView socialWidgetView) {
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) socialWidgetView._$_findCachedViewById(resetInternal.setMax.setPaddingRight);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setVisibility(8);
        }
    }

    public static final /* synthetic */ void access$retryButtonAction(SocialWidgetView socialWidgetView) {
        if (setStateOn.getMin(socialWidgetView.getContext(), "android.permission.READ_CONTACTS")) {
            socialWidgetView.getMax();
            addSubTitleView.getMin getmin = socialWidgetView.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin.getMax(true);
            addSubTitleView.getMin getmin2 = socialWidgetView.presenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin2.getMin();
            return;
        }
        setMax setmax = socialWidgetView.socialWidgetListener;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialWidgetListener");
        }
        setmax.setMin();
    }

    public static final /* synthetic */ onDetachedFromLayoutParams access$createSkeletonScreen(SocialWidgetView socialWidgetView) {
        getInsetDodgeRect min = containsFavoriteMenuItem.getMin((FrameLayout) socialWidgetView._$_findCachedViewById(resetInternal.setMax.conditional), R.layout.layout_loading_btn_skeleton);
        Intrinsics.checkNotNullExpressionValue(min, "ShimmeringUtil.bind(fl_b…out_loading_btn_skeleton)");
        return min;
    }

    public static final /* synthetic */ onDetachedFromLayoutParams access$createTimelineSkeletonScreen(SocialWidgetView socialWidgetView) {
        getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) socialWidgetView._$_findCachedViewById(resetInternal.setMax.getAutoSizeTextType));
        getmax.getMax = R.layout.view_feed_widget_skeleton;
        getmax.length = socialWidgetView.length;
        getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
        getmax.getMin = true;
        getmax.toIntRange = 0;
        getmax.IsOverlapping = 1500;
        getmax.setMin = 3;
        getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
        getscrimcolor.getMin();
        Intrinsics.checkNotNullExpressionValue(getscrimcolor, "Skeleton.bind(rv_friends…nt(3)\n            .show()");
        return getscrimcolor;
    }
}
