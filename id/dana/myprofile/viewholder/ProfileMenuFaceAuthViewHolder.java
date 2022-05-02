package id.dana.myprofile.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import id.dana.R;
import id.dana.component.cellcomponent.DanaCellLeftView;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.richview.BlueSwitchView;
import id.dana.richview.profile.switchfaceauth.SwitchFaceAuthenticationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.IntRange;
import o.getInsetDodgeRect;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.setAppDesc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0002R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/profilemenu/model/SettingModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "state", "Lid/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder$EnrolmentState;", "enrolmentState", "getEnrolmentState", "()Lid/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder$EnrolmentState;", "setEnrolmentState", "(Lid/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder$EnrolmentState;)V", "value", "", "isFaceLoginEnabled", "()Z", "setFaceLoginEnabled", "(Z)V", "listener", "Lid/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder$CheckedListener;", "skeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "view", "Lid/dana/richview/profile/switchfaceauth/SwitchFaceAuthenticationView;", "bindData", "", "data", "dismissSkeleton", "dispose", "setCheckedListener", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "skeletonScreen", "CheckedListener", "EnrolmentState", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ProfileMenuFaceAuthViewHolder extends Ignore<SettingModel> {
    @NotNull
    private EnrolmentState IsOverlapping = EnrolmentState.FETCHING;
    public boolean getMax;
    public setMin getMin;
    private onDetachedFromLayoutParams setMax;
    private SwitchFaceAuthenticationView setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder$EnrolmentState;", "", "(Ljava/lang/String;I)V", "FETCHING", "ERROR_FETCH", "ENROLLED", "NOT_ENROLLED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum EnrolmentState {
        FETCHING,
        ERROR_FETCH,
        ENROLLED,
        NOT_ENROLLED
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder$CheckedListener;", "", "checkedValueListener", "", "checked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void setMin();
    }

    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        if (settingModel != null) {
            View view = this.itemView;
            DanaCellLeftView danaCellLeftView = (DanaCellLeftView) view.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (danaCellLeftView != null) {
                danaCellLeftView.setCellLabelIcon(settingModel.getTitle(), (int) R.drawable.ic_info_blue);
            }
            BlueSwitchView blueSwitchView = (BlueSwitchView) view.findViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            if (blueSwitchView != null) {
                blueSwitchView.setChecked(settingModel.isShareFeed());
            }
            if (this.IsOverlapping != EnrolmentState.FETCHING) {
                onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
                if (ondetachedfromlayoutparams != null) {
                    ondetachedfromlayoutparams.length();
                }
                this.setMax = null;
            }
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        SwitchFaceAuthenticationView switchFaceAuthenticationView = (SwitchFaceAuthenticationView) view2.findViewById(resetInternal.setMax.setHorizontalStyle);
        Intrinsics.checkNotNullExpressionValue(switchFaceAuthenticationView, "itemView.view_authentication_switch");
        this.setMin = switchFaceAuthenticationView;
        if (switchFaceAuthenticationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        switchFaceAuthenticationView.setAuthListener(new getMin(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileMenuFaceAuthViewHolder(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_authentication_switchfaceauth, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/myprofile/viewholder/ProfileMenuFaceAuthViewHolder$bindData$2", "Lid/dana/richview/profile/switchfaceauth/SwitchFaceAuthenticationView$AuthFaceListener;", "faceAuthValueListener", "", "checked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements SwitchFaceAuthenticationView.getMin {
        final /* synthetic */ ProfileMenuFaceAuthViewHolder length;

        getMin(ProfileMenuFaceAuthViewHolder profileMenuFaceAuthViewHolder) {
            this.length = profileMenuFaceAuthViewHolder;
        }

        public final void setMax() {
            setMin max = this.length.getMin;
            if (max != null) {
                max.setMin();
            }
        }
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
        super.setMin(setmin);
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ((BlueSwitchView) view.findViewById(resetInternal.setMax.setTextMetricsParamsCompat)).setOnClickListener(new setMax(this, setmin));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ ProfileMenuFaceAuthViewHolder getMin;
        final /* synthetic */ Ignore.setMin setMin;

        setMax(ProfileMenuFaceAuthViewHolder profileMenuFaceAuthViewHolder, Ignore.setMin setmin) {
            this.getMin = profileMenuFaceAuthViewHolder;
            this.setMin = setmin;
        }

        public final void onClick(View view) {
            Ignore.setMin setmin = this.setMin;
            if (setmin != null) {
                setmin.length(this.getMin.getAdapterPosition());
            }
        }
    }

    public final void getMin() {
        super.getMin();
        if (this.setMin != null) {
            SwitchFaceAuthenticationView switchFaceAuthenticationView = this.setMin;
            if (switchFaceAuthenticationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            switchFaceAuthenticationView.disposePresenter();
        }
    }

    public final void length(@NotNull EnrolmentState enrolmentState) {
        Intrinsics.checkNotNullParameter(enrolmentState, "state");
        this.IsOverlapping = enrolmentState;
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        this.setMax = null;
        int i = setAppDesc.setMax[enrolmentState.ordinal()];
        if (i == 1) {
            View view = this.itemView;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(resetInternal.setMax.ICustomTabsService$Stub);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "btn_activate");
            linearLayout.setVisibility(8);
            BlueSwitchView blueSwitchView = (BlueSwitchView) view.findViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            Intrinsics.checkNotNullExpressionValue(blueSwitchView, "sv_enable_face_auth");
            blueSwitchView.setVisibility(8);
        } else if (i != 2) {
            View view2 = this.itemView;
            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(resetInternal.setMax.ICustomTabsService$Stub);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "btn_activate");
            linearLayout2.setVisibility(0);
            BlueSwitchView blueSwitchView2 = (BlueSwitchView) view2.findViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            Intrinsics.checkNotNullExpressionValue(blueSwitchView2, "sv_enable_face_auth");
            blueSwitchView2.setVisibility(8);
            if (enrolmentState == EnrolmentState.FETCHING) {
                setMin();
            }
        } else {
            View view3 = this.itemView;
            LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(resetInternal.setMax.ICustomTabsService$Stub);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "btn_activate");
            linearLayout3.setVisibility(8);
            BlueSwitchView blueSwitchView3 = (BlueSwitchView) view3.findViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            Intrinsics.checkNotNullExpressionValue(blueSwitchView3, "sv_enable_face_auth");
            blueSwitchView3.setVisibility(0);
        }
    }

    private final void setMin() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        this.setMax = null;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((LinearLayout) view.findViewById(resetInternal.setMax.ICustomTabsService$Stub));
        setmax.getMax = R.layout.view_subtitle_me_page_skeleton;
        setmax.isInside = 20;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        this.setMax = getinsetdodgerect;
    }
}
