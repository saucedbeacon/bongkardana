package id.dana.social.fragment;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.richview.EmptyState;
import id.dana.social.di.module.MutedFragmentModule;
import id.dana.social.model.RelationshipItemModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.FtsOptions$Order;
import o.getAuthCodeForSecurityGuard;
import o.getProgressViewStartOffset;
import o.initAttrStyle;
import o.isBaselineAligned;
import o.resetInternal;
import o.setOnBackListener;
import o.setUserInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lid/dana/social/fragment/MutedFragment;", "Lid/dana/base/BaseFragment;", "()V", "adapter", "Lid/dana/social/adapter/RestrictedContactAdapter;", "confirmDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "presenter", "Lid/dana/social/contract/MutedFragmentContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/MutedFragmentContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/MutedFragmentContract$Presenter;)V", "getLayout", "", "hideEmptyState", "", "init", "initAdapter", "initComponent", "initFollowingList", "initRecycleView", "showConfirmationDialog", "data", "Lid/dana/social/model/RelationshipItemModel;", "(Lid/dana/social/model/RelationshipItemModel;)Lkotlin/Unit;", "showEmptyState", "showUnmuteError", "showUnmuteSuccess", "nickname", "", "unmuteUser", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MutedFragment extends FtsOptions$Order {
    private isBaselineAligned getMin;
    @Inject
    public setOnBackListener.setMax presenter;
    private HashMap setMax;
    private initAttrStyle setMin;

    private View getMax(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int setMin() {
        return R.layout.fragment_muted_list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/social/fragment/MutedFragment$showConfirmationDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ RelationshipItemModel $data$inlined;
        final /* synthetic */ MutedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(MutedFragment mutedFragment, RelationshipItemModel relationshipItemModel) {
            super(1);
            this.this$0 = mutedFragment;
            this.$data$inlined = relationshipItemModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            MutedFragment.getMin(this.this$0).dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/social/fragment/MutedFragment$showConfirmationDialog$1$2"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ RelationshipItemModel $data$inlined;
        final /* synthetic */ MutedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(MutedFragment mutedFragment, RelationshipItemModel relationshipItemModel) {
            super(1);
            this.this$0 = mutedFragment;
            this.$data$inlined = relationshipItemModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            MutedFragment.setMin(this.this$0, this.$data$inlined);
        }
    }

    public static final /* synthetic */ isBaselineAligned getMin(MutedFragment mutedFragment) {
        isBaselineAligned isbaselinealigned = mutedFragment.getMin;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmDialog");
        }
        return isbaselinealigned;
    }

    public static final /* synthetic */ initAttrStyle length(MutedFragment mutedFragment) {
        initAttrStyle initattrstyle = mutedFragment.setMin;
        if (initattrstyle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return initattrstyle;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005¨\u0006\f"}, d2 = {"id/dana/social/fragment/MutedFragment$initAdapter$1", "Lid/dana/social/adapter/FriendshipListInteraction;", "activeButtonText", "", "getActiveButtonText", "()Ljava/lang/String;", "inactiveButtonText", "getInactiveButtonText", "onRelationshipButtonClick", "", "position", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements getAuthCodeForSecurityGuard {
        @NotNull
        private final String getMax;
        final /* synthetic */ MutedFragment setMax;
        @NotNull
        private final String setMin = "";

        public final void getMax(int i) {
        }

        public final void getMin(int i, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
            Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
        }

        getMin(MutedFragment mutedFragment) {
            this.setMax = mutedFragment;
            String string = mutedFragment.getResources().getString(R.string.unmute_button_label);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.unmute_button_label)");
            this.getMax = string;
        }

        @NotNull
        public final String length() {
            return this.getMax;
        }

        @NotNull
        public final String getMax() {
            return this.setMin;
        }

        public final void getMin(int i) {
            RelationshipItemModel relationshipItemModel = (RelationshipItemModel) MutedFragment.length(this.setMax).setMin(i);
            if (relationshipItemModel != null) {
                MutedFragment.setMax(this.setMax, relationshipItemModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/social/fragment/MutedFragment$initAdapter$2", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends RecyclerView.setMin {
        final /* synthetic */ MutedFragment length;

        setMin(MutedFragment mutedFragment) {
            this.length = mutedFragment;
        }

        public final void onChanged() {
            if (MutedFragment.length(this.length).getItemCount() > 0) {
                MutedFragment.setMax(this.length);
            } else {
                MutedFragment.getMax(this.length);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/fragment/MutedFragment$initComponent$1", "Lid/dana/social/contract/MutedFragmentContract$View;", "onGetMutedFollowingFailed", "", "onGetMutedFollowingListSuccess", "mutedFollowingList", "", "Lid/dana/social/model/RelationshipItemModel;", "onUnmuteFollowingFailed", "onUnmuteFollowingSuccess", "relationshipItemModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements setOnBackListener.length {
        final /* synthetic */ MutedFragment setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(MutedFragment mutedFragment) {
            this.setMax = mutedFragment;
        }

        public final void setMin(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "mutedFollowingList");
            MutedFragment.length(this.setMax).getMin(list);
        }

        public final void length() {
            MutedFragment.getMax(this.setMax);
        }

        public final void setMax(@NotNull RelationshipItemModel relationshipItemModel) {
            Intrinsics.checkNotNullParameter(relationshipItemModel, "relationshipItemModel");
            MutedFragment.setMin(this.setMax, relationshipItemModel.getMin);
            initAttrStyle length = MutedFragment.length(this.setMax);
            List max = MutedFragment.length(this.setMax).getMax();
            Intrinsics.checkNotNullExpressionValue(max, "adapter.items");
            Collection arrayList = new ArrayList();
            for (Object next : max) {
                if (!Intrinsics.areEqual((Object) ((RelationshipItemModel) next).length, (Object) relationshipItemModel.length)) {
                    arrayList.add(next);
                }
            }
            length.getMin((List) arrayList);
        }

        public final void getMin() {
            MutedFragment.setMin(this.setMax);
        }
    }

    public final void setMax() {
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        danaApplication.getRestrictedContactComponent().getMax(new MutedFragmentModule(new setMax(this))).getMin(this);
        initAttrStyle initattrstyle = new initAttrStyle(new getMin(this));
        this.setMin = initattrstyle;
        if (initattrstyle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        initattrstyle.registerAdapterDataObserver(new setMin(this));
        RecyclerView recyclerView = (RecyclerView) getMax(resetInternal.setMax.setAutoSizeTextTypeUniformWithConfiguration);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView2 = (RecyclerView) getMax(resetInternal.setMax.setAutoSizeTextTypeUniformWithConfiguration);
        if (recyclerView2 != null) {
            initAttrStyle initattrstyle2 = this.setMin;
            if (initattrstyle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            recyclerView2.setAdapter(initattrstyle2);
        }
        setOnBackListener.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax.getMax();
        setOnBackListener.setMax setmax2 = this.presenter;
        if (setmax2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax2.length();
    }

    public static final /* synthetic */ Unit setMax(MutedFragment mutedFragment, RelationshipItemModel relationshipItemModel) {
        Context context = mutedFragment.getContext();
        if (context == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(context, "this");
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context);
        getmax.toFloatRange = context.getString(R.string.muted_contacts_confirm_dialog_title);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = context.getString(R.string.muted_contacts_confirm_dialog_body);
        getProgressViewStartOffset.getMax min = getmax2.getMax(context.getString(R.string.confirm_dialog_negative), new getMax(mutedFragment, relationshipItemModel)).setMin(context.getString(R.string.confirm_dialog_positive), new length(mutedFragment, relationshipItemModel));
        min.toIntRange = 0;
        mutedFragment.getMin = min.equals();
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void setMax(MutedFragment mutedFragment) {
        EmptyState emptyState = (EmptyState) mutedFragment.getMax(resetInternal.setMax.enumMapping);
        if (emptyState != null) {
            emptyState.setVisibility(8);
        }
    }

    public static final /* synthetic */ void getMax(MutedFragment mutedFragment) {
        EmptyState emptyState = (EmptyState) mutedFragment.getMax(resetInternal.setMax.enumMapping);
        if (emptyState != null) {
            emptyState.setVisibility(0);
        }
    }

    public static final /* synthetic */ void setMin(MutedFragment mutedFragment, RelationshipItemModel relationshipItemModel) {
        setOnBackListener.setMax setmax = mutedFragment.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax.length(relationshipItemModel);
    }

    public static final /* synthetic */ void setMin(MutedFragment mutedFragment, String str) {
        FragmentActivity activity = mutedFragment.getActivity();
        if (activity instanceof setUserInfo) {
            String string = mutedFragment.getResources().getString(R.string.friendship_unmute, new Object[]{str});
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…endship_unmute, nickname)");
            ((setUserInfo) activity).showDialogToast(string);
        }
    }

    public static final /* synthetic */ void setMin(MutedFragment mutedFragment) {
        FragmentActivity activity = mutedFragment.getActivity();
        if (activity instanceof setUserInfo) {
            ((setUserInfo) activity).showErrorToast();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
