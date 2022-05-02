package id.dana.sendmoney_v2.landing.view;

import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import com.airbnb.lottie.LottieAnimationView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.BillerX2BModule;
import id.dana.sendmoney.bank.AddReceiverDialogFragment;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.recipient.RecipientIdType;
import id.dana.sendmoney.recipient.recent.RecentRecipientModule;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import id.dana.sendmoney_v2.recipient.activity.SearchRecipientActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CircleProgressBar;
import o.ConstraintTrackingWorker;
import o.IWorkManagerImplCallback;
import o.Ignore;
import o.PhotoSelectListener;
import o.PhotoView;
import o.PrepareException;
import o.RedDotManager;
import o.Relation;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getCurrX;
import o.getDeployVersion;
import o.getEnv;
import o.getExtraDataParsers;
import o.getMaxTextureSize;
import o.getTitleIcon;
import o.getUseAmcsLite;
import o.increaseCount;
import o.initRect;
import o.isHideOnContentScrollEnabled;
import o.loadWidthThumbnailPath;
import o.notifyScanner;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setMediaId;
import o.setUseAmcsLite;
import o.setUseSecurityGuard;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ã\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001I\u0018\u0000 e2\u00020\u0001:\u0002efB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ(\u00108\u001a\n 9*\u0004\u0018\u00010\u001e0\u001e2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020;H\u0002J\u0012\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020AH\u0002J\u0014\u0010B\u001a\u00020C2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030EH\u0002J\b\u0010F\u001a\u00020\u0007H\u0016J\n\u0010G\u001a\u0004\u0018\u00010AH\u0002J\r\u0010H\u001a\u00020IH\u0002¢\u0006\u0002\u0010JJ\n\u0010K\u001a\u0004\u0018\u00010LH\u0002J \u0010M\u001a\u00020\"2\u0006\u0010<\u001a\u0002052\u0006\u0010:\u001a\u00020;2\u0006\u0010=\u001a\u00020;H\u0002J\u0012\u0010N\u001a\u00020\"2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020\"H\u0002J\u0010\u0010R\u001a\u00020\"2\u0006\u0010<\u001a\u000205H\u0002J\u0010\u0010S\u001a\u00020\"2\u0006\u0010T\u001a\u00020\u0018H\u0002J\b\u0010U\u001a\u00020\"H\u0002J\u001a\u0010V\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u000e\u0010W\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010X\u001a\u00020\"H\u0016J\b\u0010Y\u001a\u00020\"H\u0002J\u0010\u0010Z\u001a\u00020\"2\u0006\u0010[\u001a\u00020\\H\u0002J\b\u0010]\u001a\u00020\"H\u0002J\u0006\u0010^\u001a\u00020\"J\u0010\u0010_\u001a\u00020\"2\u0006\u0010`\u001a\u00020;H\u0002J\u0006\u0010a\u001a\u00020\"J\b\u0010b\u001a\u00020\"H\u0002J\f\u0010c\u001a\u00020\"*\u00020dH\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR5\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.8BX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X.¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000¨\u0006g"}, d2 = {"Lid/dana/sendmoney_v2/landing/view/RecentTransactionView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "billerX2BModule", "Lid/dana/di/modules/BillerX2BModule;", "getBillerX2BModule", "()Lid/dana/di/modules/BillerX2BModule;", "billerX2BPresenter", "Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "getBillerX2BPresenter", "()Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "setBillerX2BPresenter", "(Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;)V", "gestureHoldClickListener", "Lid/dana/sendmoney_v2/landing/view/RecentTransactionView$GestureHoldClickListener;", "isRecentTransactionEmpty", "", "()Z", "setRecentTransactionEmpty", "(Z)V", "onRecipientSelected", "Lkotlin/Function1;", "Lid/dana/sendmoney/model/RecipientModel;", "Lkotlin/ParameterName;", "name", "recipientModel", "", "getOnRecipientSelected", "()Lkotlin/jvm/functions/Function1;", "setOnRecipientSelected", "(Lkotlin/jvm/functions/Function1;)V", "presenter", "Lid/dana/sendmoney/recipient/recent/RecentRecipientContract$Presenter;", "getPresenter", "()Lid/dana/sendmoney/recipient/recent/RecentRecipientContract$Presenter;", "setPresenter", "(Lid/dana/sendmoney/recipient/recent/RecentRecipientContract$Presenter;)V", "recentRecipientModule", "Lid/dana/sendmoney/recipient/recent/RecentRecipientModule;", "getRecentRecipientModule", "()Lid/dana/sendmoney/recipient/recent/RecentRecipientModule;", "recentTransactionAdapter", "Lid/dana/sendmoney_v2/landing/adapter/RecentTransactionAdapter;", "recipientContactType", "selectedRecentRecipientModel", "Lid/dana/sendmoney/model/RecentRecipientModel;", "showcase", "Lid/dana/showcase/Showcase;", "buildRecipientModel", "kotlin.jvm.PlatformType", "recipientType", "", "recentRecipientModel", "recipientIdType", "createTarget", "Lid/dana/showcase/target/Target;", "targetView", "Landroid/view/View;", "getGridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getLayout", "getRecentTransactionView", "getRecipientHoldClickActionListener", "id/dana/sendmoney_v2/landing/view/RecentTransactionView$getRecipientHoldClickActionListener$1", "()Lid/dana/sendmoney_v2/landing/view/RecentTransactionView$getRecipientHoldClickActionListener$1;", "getTransactionViewHolder", "Lid/dana/sendmoney_v2/landing/viewholder/recent/TransactionViewHolder;", "handleClickedRecipientType", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "loadData", "onItemClicked", "onRecyclerViewExpanded", "expanded", "openSearchRecipient", "parseAttrs", "setOnGestureHoldLongClickListener", "setup", "setupRecyclerView", "showBillerX2BDialog", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "showBottomSheetTransferAgentReceiver", "showTooltip", "trackSendMoneySelect", "destinationType", "updateRecentTransaction", "updateShowMoreView", "setOnClickSearchListener", "Landroidx/appcompat/widget/AppCompatTextView;", "Companion", "GestureHoldClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RecentTransactionView extends BaseRichView {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private boolean IsOverlapping;
    @Inject
    public IWorkManagerImplCallback.Stub.Proxy.getMin billerX2BPresenter;
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter getMax;
    private int getMin;
    private HashMap isInside;
    /* access modifiers changed from: private */
    public setMin length;
    @Inject
    public setMediaId.setMax presenter;
    /* access modifiers changed from: private */
    public increaseCount setMax;
    /* access modifiers changed from: private */
    public getTitleIcon setMin;
    @NotNull
    private Function1<? super RecipientModel, Unit> toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/landing/view/RecentTransactionView$GestureHoldClickListener;", "", "onLongClick", "", "recentRecipientModel", "Lid/dana/sendmoney/model/RecentRecipientModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void length(@NotNull increaseCount increasecount);
    }

    @JvmOverloads
    public RecentTransactionView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public RecentTransactionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_transaction_recent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "position", "", "invoke", "id/dana/sendmoney_v2/landing/view/RecentTransactionView$setupRecyclerView$1$1$1", "id/dana/sendmoney_v2/landing/view/RecentTransactionView$$special$$inlined$run$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ getTitleIcon $this_run;
        final /* synthetic */ RecyclerView $this_run$inlined;
        final /* synthetic */ RecentTransactionView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(getTitleIcon gettitleicon, RecyclerView recyclerView, RecentTransactionView recentTransactionView) {
            super(1);
            this.$this_run = gettitleicon;
            this.$this_run$inlined = recyclerView;
            this.this$0 = recentTransactionView;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            increaseCount increasecount = (increaseCount) this.$this_run.setMin(i);
            if (increasecount != null) {
                RecentTransactionView.access$onItemClicked(this.this$0, increasecount);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "expanded", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class toString extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        toString(RecentTransactionView recentTransactionView) {
            super(1, recentTransactionView, RecentTransactionView.class, "onRecyclerViewExpanded", "onRecyclerViewExpanded(Z)V", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            RecentTransactionView.access$onRecyclerViewExpanded((RecentTransactionView) this.receiver, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/sendmoney/model/RecipientModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<RecipientModel, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final void invoke(@NotNull RecipientModel recipientModel) {
            Intrinsics.checkNotNullParameter(recipientModel, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecipientModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ setMin access$getGestureHoldClickListener$p(RecentTransactionView recentTransactionView) {
        setMin setmin = recentTransactionView.length;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureHoldClickListener");
        }
        return setmin;
    }

    public static final /* synthetic */ increaseCount access$getSelectedRecentRecipientModel$p(RecentTransactionView recentTransactionView) {
        increaseCount increasecount = recentTransactionView.setMax;
        if (increasecount == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedRecentRecipientModel");
        }
        return increasecount;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecentTransactionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RecentTransactionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = 3;
        this.IsOverlapping = true;
        this.toIntRange = IsOverlapping.INSTANCE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public RecentTransactionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = 3;
        this.IsOverlapping = true;
        this.toIntRange = IsOverlapping.INSTANCE;
    }

    @NotNull
    public final setMediaId.setMax getPresenter() {
        setMediaId.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setmax;
    }

    public final void setPresenter(@NotNull setMediaId.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.presenter = setmax;
    }

    @NotNull
    public final IWorkManagerImplCallback.Stub.Proxy.getMin getBillerX2BPresenter() {
        IWorkManagerImplCallback.Stub.Proxy.getMin getmin = this.billerX2BPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
        }
        return getmin;
    }

    public final void setBillerX2BPresenter(@NotNull IWorkManagerImplCallback.Stub.Proxy.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.billerX2BPresenter = getmin;
    }

    public final boolean isRecentTransactionEmpty() {
        return this.IsOverlapping;
    }

    public final void setRecentTransactionEmpty(boolean z) {
        this.IsOverlapping = z;
    }

    @NotNull
    public final Function1<RecipientModel, Unit> getOnRecipientSelected() {
        return this.toIntRange;
    }

    public final void setOnRecipientSelected(@NotNull Function1<? super RecipientModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.toIntRange = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"id/dana/sendmoney_v2/landing/view/RecentTransactionView$recentRecipientModule$1", "Lid/dana/sendmoney/recipient/recent/RecentRecipientContract$View;", "onCheckCashOutAgentFeatureSuccess", "", "enable", "", "onCheckTransferLinkFeatureSuccess", "onGetRecentRecipientError", "onGetRecentRecipientSuccess", "recentRecipientModels", "", "Lid/dana/sendmoney/model/RecentRecipientModel;", "onGetRecentTransaction", "onGetRecentTransactionError", "onMaxRecentRecipient", "maxRecentRecipient", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements setMediaId.getMin {
        final /* synthetic */ RecentTransactionView getMax;

        public final void getMax() {
        }

        public final void getMin(@Nullable List<increaseCount> list) {
        }

        public final void setMin() {
        }

        public final void setMin(boolean z) {
        }

        toFloatRange(RecentTransactionView recentTransactionView) {
            this.getMax = recentTransactionView;
        }

        public final void getMax(@Nullable List<increaseCount> list) {
            getTitleIcon access$getRecentTransactionAdapter$p = this.getMax.setMin;
            if (access$getRecentTransactionAdapter$p != null) {
                access$getRecentTransactionAdapter$p.getMin(list == null ? CollectionsKt.emptyList() : list);
            }
            RecentTransactionView.access$updateShowMoreView(this.getMax);
            if (list != null && list.size() > 0) {
                this.getMax.setRecentTransactionEmpty(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¨\u0006\u0013"}, d2 = {"id/dana/sendmoney_v2/landing/view/RecentTransactionView$billerX2BModule$1", "Lid/dana/contract/sendmoney/v2/BillerX2BContract$View;", "onBillerUrlConstructed", "", "url", "", "onErrorCheckPrefix", "recipientModel", "Lid/dana/sendmoney/model/BaseRecipientModel;", "onErrorOpenBillerPage", "message", "onErrorQueryPrefix", "onPrefixExist", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "onSuccessGetAllBillerX2B", "allBillerX2B", "", "Lid/dana/domain/sendmoney/model/BillerX2B;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements IWorkManagerImplCallback.Stub.Proxy.getMax {
        final /* synthetic */ RecentTransactionView length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(1006993813, oncanceled);
                onCancelLoad.getMin(1006993813, oncanceled);
            }
        }

        public final void setMax(@NotNull List<getExtraDataParsers> list) {
            Intrinsics.checkNotNullParameter(list, "allBillerX2B");
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(RecentTransactionView recentTransactionView) {
            this.length = recentTransactionView;
        }

        public final void getMin(@NotNull getCurrX getcurrx) {
            Intrinsics.checkNotNullParameter(getcurrx, "billerX2BModel");
            RecentTransactionView.access$showBillerX2BDialog(this.length, getcurrx);
        }

        public final void setMax(@NotNull PhotoSelectListener photoSelectListener) {
            Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
            if (photoSelectListener instanceof increaseCount) {
                RecentTransactionView.access$handleClickedRecipientType(this.length, (increaseCount) photoSelectListener, "bank", RecipientIdType.INSTITUTION);
            }
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            DanaH5.startContainerFullUrl(str);
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            RecentTransactionView recentTransactionView = this.length;
            RecentTransactionView.access$handleClickedRecipientType(recentTransactionView, RecentTransactionView.access$getSelectedRecentRecipientModel$p(recentTransactionView), "bank", RecipientIdType.INSTITUTION);
        }

        public final void getMin(@NotNull PhotoSelectListener photoSelectListener) {
            Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
            RecentTransactionView recentTransactionView = this.length;
            BaseActivity baseActivity = recentTransactionView.getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            recentTransactionView.addDisposable(ConstraintTrackingWorker.getMax(baseActivity).subscribe(new setMax(this, photoSelectListener)));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 4, 2})
        static final class setMax<T> implements RedDotManager<Long> {
            final /* synthetic */ getMax length;
            final /* synthetic */ PhotoSelectListener setMin;

            setMax(getMax getmax, PhotoSelectListener photoSelectListener) {
                this.length = getmax;
                this.setMin = photoSelectListener;
            }

            public final /* synthetic */ void accept(Object obj) {
                getMax getmax = this.length;
                PhotoSelectListener photoSelectListener = this.setMin;
                Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
                if (photoSelectListener instanceof increaseCount) {
                    RecentTransactionView.access$handleClickedRecipientType(getmax.length, (increaseCount) photoSelectListener, "bank", RecipientIdType.INSTITUTION);
                }
            }
        }
    }

    public final void parseAttrs(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.onRetainCustomNonConfigurationInstance);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.RecentTransactionView)");
            try {
                TypedValue typedValue = new TypedValue();
                obtainStyledAttributes.getValue(0, typedValue);
                this.getMin = typedValue.data;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ RecentTransactionView getMax;

        isInside(RecentTransactionView recentTransactionView) {
            this.getMax = recentTransactionView;
        }

        public final void onClick(View view) {
            this.getMax.getContext().startActivity(new Intent(this.getMax.getContext(), SearchRecipientActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnClickListener {
        final /* synthetic */ RecentTransactionView getMax;

        hashCode(RecentTransactionView recentTransactionView) {
            this.getMax = recentTransactionView;
        }

        public final void onClick(View view) {
            getTitleIcon access$getRecentTransactionAdapter$p = this.getMax.setMin;
            if (access$getRecentTransactionAdapter$p != null) {
                access$getRecentTransactionAdapter$p.toFloatRange();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney_v2/landing/view/RecentTransactionView$getRecipientHoldClickActionListener$1", "Lid/dana/sendmoney_v2/landing/view/RecipientHoldClickActionListener;", "onHoldClickRecipientSelected", "", "recentRecipientModel", "Lid/dana/sendmoney/model/RecentRecipientModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements notifyScanner {
        final /* synthetic */ RecentTransactionView getMin;

        toIntRange(RecentTransactionView recentTransactionView) {
            this.getMin = recentTransactionView;
        }

        public final void length(@NotNull increaseCount increasecount) {
            Intrinsics.checkNotNullParameter(increasecount, "recentRecipientModel");
            BaseActivity baseActivity = this.getMin.getBaseActivity();
            if (baseActivity != null) {
                ((SendMoneyActivity) baseActivity).openManageRecentBottomSheet(increasecount);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.landing.SendMoneyActivity");
        }
    }

    private static RecipientModel setMax(String str, increaseCount increasecount, String str2) {
        RecipientModel.length length2 = new RecipientModel.length(str);
        length2.getMin = increasecount.setMin;
        length2.FastBitmap$CoordinateSystem = str2;
        length2.toFloatRange = increasecount.getMin();
        length2.isInside = increasecount.length();
        length2.toIntRange = increasecount.isInside;
        String max = increasecount.getMax();
        String str3 = "";
        if (max == null) {
            max = str3;
        }
        length2.IsOverlapping = max;
        length2.Mean$Arithmetic = increasecount.equals;
        length2.equals = increasecount.length;
        length2.values = increasecount.toIntRange;
        length2.toDoubleRange = increasecount.toFloatRange;
        length2.invoke = increasecount.setMin();
        length2.b = increasecount.FastBitmap$CoordinateSystem;
        length2.onNavigationEvent = increasecount.toFloatRange();
        length2.ICustomTabsCallback = increasecount.setMax();
        if (Intrinsics.areEqual((Object) str, (Object) "contact")) {
            str3 = RecipientSource.ALL_CONTACTS;
        }
        length2.setMax = str3;
        return length2.length();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "kotlin.jvm.PlatformType", "onAddedReceiverInfo", "id/dana/sendmoney_v2/landing/view/RecentTransactionView$showBottomSheetTransferAgentReceiver$1$1$1", "id/dana/sendmoney_v2/landing/view/RecentTransactionView$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class values implements AddReceiverDialogFragment.setMax {
        final /* synthetic */ RecentTransactionView setMin;

        values(RecentTransactionView recentTransactionView) {
            this.setMin = recentTransactionView;
        }

        public final void getMin(RecipientModel recipientModel) {
            Function1<RecipientModel, Unit> onRecipientSelected = this.setMin.getOnRecipientSelected();
            Intrinsics.checkNotNullExpressionValue(recipientModel, "recipientModel");
            onRecipientSelected.invoke(recipientModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"id/dana/sendmoney_v2/landing/view/RecentTransactionView$getGridLayoutManager$1$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GridLayoutManager.length {
        final /* synthetic */ GridLayoutManager getMax;
        final /* synthetic */ RecyclerView.Adapter setMin;

        setMax(GridLayoutManager gridLayoutManager, RecyclerView.Adapter adapter) {
            this.getMax = gridLayoutManager;
            this.setMin = adapter;
        }

        public final int getMin(int i) {
            int itemViewType = this.setMin.getItemViewType(i);
            if (itemViewType == -2 || itemViewType == -1 || itemViewType == 1) {
                return this.getMax.setMin;
            }
            return 1;
        }
    }

    private final void getMax(String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(getContext());
        length2.getMax = TrackerKey.Event.SEND_MONEY_SELECT;
        convertDipToPx.length min = length2.setMax(TrackerKey.SendMoneyProperties.RECIPIENT_DESTINATION_TYPE, str).setMin(TrackerKey.SendMoneyProperties.LAST_TRANSACTION, true);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public final void showTooltip() {
        View view;
        if (!this.IsOverlapping) {
            RecyclerView.valueOf findViewHolderForLayoutPosition = ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared)).findViewHolderForLayoutPosition(0);
            if (findViewHolderForLayoutPosition != null) {
                CircleProgressBar.AnonymousClass1 r0 = (CircleProgressBar.AnonymousClass1) findViewHolderForLayoutPosition;
                if (r0 == null || (view = r0.itemView.findViewById(R.id.f38712131362349)) == null) {
                    view = null;
                }
                if (view != null && this.getMax == null) {
                    PhotoView.SimpleDragListener simpleDragListener = new PhotoView.SimpleDragListener(getBaseActivity());
                    setUseAmcsLite min = ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(getBaseActivity()).setMin(new getUseAmcsLite(view, (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f)), (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f)), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f)))).setMax()).getMax(view)).getMin();
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    Intrinsics.checkNotNullExpressionValue(min, "target");
                    double d = (double) min.setMin.x;
                    getEnv getenv = min.getMin;
                    Intrinsics.checkNotNullExpressionValue(getenv, "target.shape");
                    double length2 = (double) getenv.length();
                    Double.isNaN(length2);
                    Double.isNaN(d);
                    double d2 = (double) min.setMin.y;
                    getEnv getenv2 = min.getMin;
                    Intrinsics.checkNotNullExpressionValue(getenv2, "target.shape");
                    double max = (double) getenv2.setMax();
                    Double.isNaN(max);
                    Double.isNaN(d2);
                    marginLayoutParams.setMargins((int) (d - (length2 * 0.5d)), (int) (d2 - (max * 0.3d)), 0, 0);
                    View view2 = min.equals;
                    Intrinsics.checkNotNullExpressionValue(view2, "target.overlay");
                    view2.setLayoutParams(marginLayoutParams);
                    View view3 = min.equals;
                    Intrinsics.checkNotNullExpressionValue(view3, "target.overlay");
                    ((LottieAnimationView) view3.findViewById(resetInternal.setMax.addMenuPresenter)).setOnLongClickListener(new getMin(this));
                    simpleDragListener.toString = min;
                    this.getMax = ((initRect) ((initRect) ((initRect) simpleDragListener.length(false)).setMax((TimeInterpolator) null)).setMin((PhotoView.FlingRunnable) new toDoubleRange(this))).length();
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.landing.viewholder.recent.TransactionViewHolder");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney_v2/landing/view/RecentTransactionView$showTooltip$1", "Lid/dana/showcase/AbstractOnShowcaseStateListener;", "onFinished", "", "actionType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange extends getMaxTextureSize {
        final /* synthetic */ RecentTransactionView length;

        toDoubleRange(RecentTransactionView recentTransactionView) {
            this.length = recentTransactionView;
        }

        public final void onFinished(int i) {
            this.length.getMax = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnLongClickListener {
        final /* synthetic */ RecentTransactionView getMax;

        getMin(RecentTransactionView recentTransactionView) {
            this.getMax = recentTransactionView;
        }

        public final boolean onLongClick(View view) {
            PhotoView.PhotoInter access$getShowcase$p = this.getMax.getMax;
            if (access$getShowcase$p != null) {
                access$getShowcase$p.setMax();
            }
            if (this.getMax.length == null || this.getMax.setMin == null) {
                return true;
            }
            setMin access$getGestureHoldClickListener$p = RecentTransactionView.access$getGestureHoldClickListener$p(this.getMax);
            getTitleIcon access$getRecentTransactionAdapter$p = this.getMax.setMin;
            Intrinsics.checkNotNull(access$getRecentTransactionAdapter$p);
            Object min = access$getRecentTransactionAdapter$p.setMin(0);
            Intrinsics.checkNotNullExpressionValue(min, "recentTransactionAdapter!!.getItem(0)");
            access$getGestureHoldClickListener$p.length((increaseCount) min);
            return true;
        }
    }

    public final void setOnGestureHoldLongClickListener(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "gestureHoldClickListener");
        this.length = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney_v2/landing/view/RecentTransactionView$Companion;", "", "()V", "SPAN_SIZE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r5) {
        loadWidthThumbnailPath.getMin getmin = new loadWidthThumbnailPath.getMin((byte) 0);
        if (r5 != null) {
            getmin.setMax = r5;
            getmin.getMax = new RecentRecipientModule(new toFloatRange(this));
            getmin.getMin = new BillerX2BModule(new getMax(this));
            stopIgnoring.setMin(getmin.getMax, RecentRecipientModule.class);
            stopIgnoring.setMin(getmin.getMin, BillerX2BModule.class);
            stopIgnoring.setMin(getmin.setMax, PrepareException.AnonymousClass1.class);
            new loadWidthThumbnailPath(getmin.getMax, getmin.getMin, getmin.setMax, (byte) 0).setMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            setMediaId.setMax setmax = this.presenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = setmax;
            IWorkManagerImplCallback.Stub.Proxy.getMin getmin2 = this.billerX2BPresenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
            }
            getminArr[1] = getmin2;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public final void setup() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared);
        if (recyclerView != null) {
            getTitleIcon gettitleicon = new getTitleIcon();
            RecyclerView.Adapter adapter = gettitleicon;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
            gridLayoutManager.toIntRange = new setMax(gridLayoutManager, adapter);
            recyclerView.setLayoutManager(gridLayoutManager);
            this.setMin = gettitleicon;
            recyclerView.setAdapter(adapter);
            gettitleicon.getMax((Ignore.setMin) new Relation(new equals(gettitleicon, recyclerView, this)));
            Function1<? super Boolean, Unit> tostring = new toString(this);
            Intrinsics.checkNotNullParameter(tostring, "<set-?>");
            gettitleicon.getMax = tostring;
            gettitleicon.setMax = new toIntRange(this);
        }
        ShowMoreView showMoreView = (ShowMoreView) _$_findCachedViewById(resetInternal.setMax.getPrompt);
        if (showMoreView != null) {
            showMoreView.setOnClickListener(new hashCode(this));
        }
        setMediaId.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax.setMin("");
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setMaxWidth);
        if (appCompatTextView != null) {
            appCompatTextView.setOnClickListener(new isInside(this));
        }
    }

    public final void updateRecentTransaction() {
        setMediaId.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax.setMin("");
        getTitleIcon gettitleicon = this.setMin;
        if (gettitleicon != null) {
            gettitleicon.notifyDataSetChanged();
        }
    }

    public static final /* synthetic */ void access$updateShowMoreView(RecentTransactionView recentTransactionView) {
        ShowMoreView showMoreView = (ShowMoreView) recentTransactionView._$_findCachedViewById(resetInternal.setMax.getPrompt);
        if (showMoreView != null) {
            View view = showMoreView;
            getTitleIcon gettitleicon = recentTransactionView.setMin;
            boolean z = false;
            view.setVisibility(gettitleicon != null && gettitleicon.setMax() ? 0 : 8);
            getTitleIcon gettitleicon2 = recentTransactionView.setMin;
            if (gettitleicon2 != null && gettitleicon2.setMin()) {
                z = true;
            }
            showMoreView.setExpanded(z);
        }
    }

    public static final /* synthetic */ void access$showBillerX2BDialog(RecentTransactionView recentTransactionView, getCurrX getcurrx) {
        BaseActivity baseActivity = recentTransactionView.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        new getDeployVersion(baseActivity, new RecentTransactionView$FastBitmap$CoordinateSystem(recentTransactionView, getcurrx)).setMax();
    }

    public static final /* synthetic */ void access$handleClickedRecipientType(RecentTransactionView recentTransactionView, increaseCount increasecount, String str, String str2) {
        RecipientModel max = setMax(str, increasecount, str2);
        Function1<? super RecipientModel, Unit> function1 = recentTransactionView.toIntRange;
        Intrinsics.checkNotNullExpressionValue(max, "this");
        function1.invoke(max);
    }

    public static final /* synthetic */ void access$onItemClicked(RecentTransactionView recentTransactionView, increaseCount increasecount) {
        recentTransactionView.setMax = increasecount;
        int i = increasecount.values;
        if (i == 2) {
            RecipientModel max = setMax("contact", increasecount, "userid");
            Function1<? super RecipientModel, Unit> function1 = recentTransactionView.toIntRange;
            Intrinsics.checkNotNullExpressionValue(max, "this");
            function1.invoke(max);
            recentTransactionView.getMax(TrackerKey.RecipientDestinationTypeProperty.DANA_BALANCE);
        } else if (i == 4) {
            IWorkManagerImplCallback.Stub.Proxy.getMin getmin = recentTransactionView.billerX2BPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
            }
            getmin.length((PhotoSelectListener) increasecount);
            recentTransactionView.getMax(TrackerKey.RecipientDestinationTypeProperty.BANK);
        } else if (i == 5) {
            BaseActivity baseActivity = recentTransactionView.getBaseActivity();
            AddReceiverDialogFragment addReceiverDialogFragment = new AddReceiverDialogFragment();
            addReceiverDialogFragment.getMin = new values(recentTransactionView);
            addReceiverDialogFragment.show(baseActivity.getSupportFragmentManager(), "Custom Bottom Sheet");
        }
    }

    public static final /* synthetic */ void access$onRecyclerViewExpanded(RecentTransactionView recentTransactionView, boolean z) {
        ViewParent parent = recentTransactionView.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setInterpolator((TimeInterpolator) new DecelerateInterpolator());
            Unit unit = Unit.INSTANCE;
            isHideOnContentScrollEnabled.getMin(viewGroup, autoTransition);
        }
        ShowMoreView showMoreView = (ShowMoreView) recentTransactionView._$_findCachedViewById(resetInternal.setMax.getPrompt);
        if (showMoreView != null) {
            showMoreView.setExpanded(z);
        }
    }
}
