package id.dana.social.bottomsheet;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.social.di.module.FeedsCommentReportModule;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUPopSupportPreemption;
import o.AUSegment;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.IntRange;
import o.order;
import o.resetInternal;
import o.setBtnImage;
import o.setSimulatedScanData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\u0018\u0000 22\u00020\u0001:\u000212B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\b\u0010 \u001a\u00020\u0018H\u0002J\u0012\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0018H\u0014J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u0018H\u0014J\b\u0010(\u001a\u00020\u0018H\u0016J\b\u0010)\u001a\u00020\u0018H\u0002J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\u0016\u0010-\u001a\u00020\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "bottomSheetCallback", "id/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$bottomSheetCallback$2$1", "getBottomSheetCallback", "()Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$bottomSheetCallback$2$1;", "bottomSheetCallback$delegate", "Lkotlin/Lazy;", "bottomSheetListener", "Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$BottomSheetListener;", "getBottomSheetListener", "()Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$BottomSheetListener;", "setBottomSheetListener", "(Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$BottomSheetListener;)V", "feedsCommentReportPresenter", "Lid/dana/social/contract/FeedsCommentReportContract$Presenter;", "getFeedsCommentReportPresenter", "()Lid/dana/social/contract/FeedsCommentReportContract$Presenter;", "setFeedsCommentReportPresenter", "(Lid/dana/social/contract/FeedsCommentReportContract$Presenter;)V", "reportFeedCommentsBottomSheetAdapter", "Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetAdapter;", "fetchReportReason", "", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "init", "initInjector", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "onItemClicked", "position", "onShow", "onStart", "setupAdapter", "setupBottomSheet", "setupCloseButton", "setupRecyclerView", "updateAdapterItems", "reportReason", "", "Lid/dana/domain/social/model/ReportReasons;", "BottomSheetListener", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ReportFeedCommentsBottomSheetDialog extends order {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);
    private HashMap IsOverlapping;
    @Inject
    public setBtnImage.getMin feedsCommentReportPresenter;
    @Nullable
    public setMax getMax;
    private AUSegment.AnonymousClass2 isInside;
    private final Lazy toFloatRange = LazyKt.lazy(new length(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$BottomSheetListener;", "", "onNegativeButtonClicked", "", "submitReportComment", "reason", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void getMin();

        void setMax(@NotNull String str);
    }

    private View setMin(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return R.layout.view_bottomsheet_report_feed_comment_list;
    }

    public final float length() {
        return 0.5f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$bottomSheetCallback$2$1", "invoke", "()Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$bottomSheetCallback$2$1;"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<AnonymousClass4> {
        final /* synthetic */ ReportFeedCommentsBottomSheetDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(ReportFeedCommentsBottomSheetDialog reportFeedCommentsBottomSheetDialog) {
            super(0);
            this.this$0 = reportFeedCommentsBottomSheetDialog;
        }

        @NotNull
        public final AnonymousClass4 invoke() {
            return new BottomSheetBehavior.BottomSheetCallback(this) {
                final /* synthetic */ length getMin;

                public final void onSlide(@NotNull View view, float f) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                }

                {
                    this.getMin = r1;
                }

                public final void onStateChanged(@NotNull View view, int i) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                    if (5 == i) {
                        this.getMin.this$0.dismissAllowingStateLoss();
                    }
                }
            };
        }
    }

    public final void setMax() {
        super.setMax();
        BaseActivity baseActivity = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            socialCommonComponent.getMin(new FeedsCommentReportModule(new getMax(this))).getMax(this);
        }
        AUSegment.AnonymousClass2 r0 = new IMultiInstanceInvalidationCallback.Stub<Ignore<setSimulatedScanData>, setSimulatedScanData>() {
            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                return new getAddIcon(viewGroup);
            }
        };
        r0.getMax((Ignore.setMin) new getMin(this));
        Unit unit = Unit.INSTANCE;
        this.isInside = r0;
        ImageButton imageButton = (ImageButton) setMin(resetInternal.setMax.createEditText);
        if (imageButton != null) {
            imageButton.setImageDrawable(IntRange.length(requireContext(), (int) R.drawable.ic_close_grey));
            imageButton.setOnClickListener(new IsOverlapping(this));
        }
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.setCustomSelectionActionModeCallback);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            AUSegment.AnonymousClass2 r1 = this.isInside;
            if (r1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reportFeedCommentsBottomSheetAdapter");
            }
            recyclerView.setAdapter(r1);
        }
        setBtnImage.getMin getmin = this.feedsCommentReportPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedsCommentReportPresenter");
        }
        getmin.setMin();
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) setMin(resetInternal.setMax.RequiresPermission);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "fl_bottom_sheet");
        return frameLayout;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.f78532131951924);
    }

    public final void onStart() {
        super.onStart();
        getMax(getDialog());
        length(getDialog());
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
        BottomSheetBehavior bottomSheetBehavior = this.length;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setBottomSheetCallback((length.AnonymousClass4) this.toFloatRange.getValue());
        }
    }

    public final void IsOverlapping() {
        setBtnImage.getMin getmin = this.feedsCommentReportPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedsCommentReportPresenter");
        }
        getmin.setMax();
        super.IsOverlapping();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"id/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$initInjector$1", "Lid/dana/social/contract/FeedsCommentReportContract$View;", "onFailedGetReportReason", "", "onSuccessGetReportReason", "reportReason", "", "Lid/dana/domain/social/model/ReportReasons;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements setBtnImage.setMin {
        final /* synthetic */ ReportFeedCommentsBottomSheetDialog getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(ReportFeedCommentsBottomSheetDialog reportFeedCommentsBottomSheetDialog) {
            this.getMax = reportFeedCommentsBottomSheetDialog;
        }

        public final void getMax(@NotNull List<setSimulatedScanData> list) {
            Intrinsics.checkNotNullParameter(list, "reportReason");
            ReportFeedCommentsBottomSheetDialog.getMin(this.getMax, list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$setupCloseButton$1$1"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ ReportFeedCommentsBottomSheetDialog setMin;

        IsOverlapping(ReportFeedCommentsBottomSheetDialog reportFeedCommentsBottomSheetDialog) {
            this.setMin = reportFeedCommentsBottomSheetDialog;
        }

        public final void onClick(View view) {
            setMax setmax = this.setMin.getMax;
            if (setmax != null) {
                setmax.getMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onItemClick", "id/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$setupAdapter$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements Ignore.setMin {
        final /* synthetic */ ReportFeedCommentsBottomSheetDialog getMin;

        getMin(ReportFeedCommentsBottomSheetDialog reportFeedCommentsBottomSheetDialog) {
            this.getMin = reportFeedCommentsBottomSheetDialog;
        }

        public final void length(int i) {
            ReportFeedCommentsBottomSheetDialog.getMax(this.getMin, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$Companion;", "", "()V", "DIM_AMOUNT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void getMin(ReportFeedCommentsBottomSheetDialog reportFeedCommentsBottomSheetDialog, List list) {
        AUSegment.AnonymousClass2 r1 = reportFeedCommentsBottomSheetDialog.isInside;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reportFeedCommentsBottomSheetAdapter");
        }
        r1.length(list);
    }

    public static final /* synthetic */ void getMax(ReportFeedCommentsBottomSheetDialog reportFeedCommentsBottomSheetDialog, int i) {
        setMax setmax;
        AUSegment.AnonymousClass2 r0 = reportFeedCommentsBottomSheetDialog.isInside;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reportFeedCommentsBottomSheetAdapter");
        }
        setSimulatedScanData setsimulatedscandata = (setSimulatedScanData) r0.setMin(i);
        if (setsimulatedscandata != null && (setmax = reportFeedCommentsBottomSheetDialog.getMax) != null) {
            setmax.setMax(setsimulatedscandata.getReasonId());
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
