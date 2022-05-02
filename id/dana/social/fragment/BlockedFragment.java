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
import id.dana.social.di.module.BlockedFragmentModule;
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
import o.dispatchOnCancelled;
import o.getAuthCodeForSecurityGuard;
import o.getProgressViewStartOffset;
import o.initAttrStyle;
import o.isBaselineAligned;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setRightButtonUnicode;
import o.setUserInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lid/dana/social/fragment/BlockedFragment;", "Lid/dana/base/BaseFragment;", "()V", "adapter", "Lid/dana/social/adapter/RestrictedContactAdapter;", "confirmDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "presenter", "Lid/dana/social/contract/BlockedFragmentContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/BlockedFragmentContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/BlockedFragmentContract$Presenter;)V", "getLayout", "", "hideEmptyState", "", "init", "initAdapter", "initComponent", "initFollowerList", "initRecyclerView", "showConfirmationDialog", "data", "Lid/dana/social/model/RelationshipItemModel;", "(Lid/dana/social/model/RelationshipItemModel;)Lkotlin/Unit;", "showEmptyState", "showUnblockError", "showUnblockSuccess", "nickname", "", "unblockUser", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BlockedFragment extends FtsOptions$Order {
    private isBaselineAligned getMin;
    @Inject
    public setRightButtonUnicode.getMin presenter;
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
        return R.layout.fragment_blocked_list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/social/fragment/BlockedFragment$showConfirmationDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ RelationshipItemModel $data$inlined;
        final /* synthetic */ BlockedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(BlockedFragment blockedFragment, RelationshipItemModel relationshipItemModel) {
            super(1);
            this.this$0 = blockedFragment;
            this.$data$inlined = relationshipItemModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            BlockedFragment.getMin(this.this$0).dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/social/fragment/BlockedFragment$showConfirmationDialog$1$2"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ RelationshipItemModel $data$inlined;
        final /* synthetic */ BlockedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(BlockedFragment blockedFragment, RelationshipItemModel relationshipItemModel) {
            super(1);
            this.this$0 = blockedFragment;
            this.$data$inlined = relationshipItemModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            BlockedFragment.getMax(this.this$0, this.$data$inlined);
        }
    }

    public static final /* synthetic */ initAttrStyle getMax(BlockedFragment blockedFragment) {
        initAttrStyle initattrstyle = blockedFragment.setMin;
        if (initattrstyle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return initattrstyle;
    }

    public static final /* synthetic */ isBaselineAligned getMin(BlockedFragment blockedFragment) {
        isBaselineAligned isbaselinealigned = blockedFragment.getMin;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmDialog");
        }
        return isbaselinealigned;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005¨\u0006\f"}, d2 = {"id/dana/social/fragment/BlockedFragment$initAdapter$1", "Lid/dana/social/adapter/FriendshipListInteraction;", "activeButtonText", "", "getActiveButtonText", "()Ljava/lang/String;", "inactiveButtonText", "getInactiveButtonText", "onRelationshipButtonClick", "", "position", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements getAuthCodeForSecurityGuard {
        @NotNull
        private final String getMax = "";
        @NotNull
        private final String getMin;
        final /* synthetic */ BlockedFragment setMax;

        public final void getMax(int i) {
        }

        public final void getMin(int i, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
            Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
        }

        length(BlockedFragment blockedFragment) {
            this.setMax = blockedFragment;
            String string = blockedFragment.getResources().getString(R.string.unblock_button_label);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.unblock_button_label)");
            this.getMin = string;
        }

        @NotNull
        public final String length() {
            return this.getMin;
        }

        @NotNull
        public final String getMax() {
            return this.getMax;
        }

        public final void getMin(int i) {
            RelationshipItemModel relationshipItemModel = (RelationshipItemModel) BlockedFragment.getMax(this.setMax).setMin(i);
            if (relationshipItemModel != null) {
                BlockedFragment.getMin(this.setMax, relationshipItemModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/social/fragment/BlockedFragment$initAdapter$2", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends RecyclerView.setMin {
        final /* synthetic */ BlockedFragment setMax;

        getMin(BlockedFragment blockedFragment) {
            this.setMax = blockedFragment;
        }

        public final void onChanged() {
            if (BlockedFragment.getMax(this.setMax).getItemCount() > 0) {
                BlockedFragment.setMin(this.setMax);
            } else {
                BlockedFragment.setMax(this.setMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/fragment/BlockedFragment$initComponent$1", "Lid/dana/social/contract/BlockedFragmentContract$View;", "getBlockedFollowerListFailed", "", "getBlockedFollowerListSuccess", "blockedFollowerList", "", "Lid/dana/social/model/RelationshipItemModel;", "onUnblockFollowerFailed", "onUnblockFollowerSuccess", "relationshipItemModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements setRightButtonUnicode.length {
        final /* synthetic */ BlockedFragment getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(962258707, oncanceled);
                onCancelLoad.getMin(962258707, oncanceled);
            }
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(BlockedFragment blockedFragment) {
            this.getMin = blockedFragment;
        }

        public final void setMin(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "blockedFollowerList");
            BlockedFragment.getMax(this.getMin).getMin(list);
        }

        public final void length() {
            BlockedFragment.setMax(this.getMin);
        }

        public final void setMax(@NotNull RelationshipItemModel relationshipItemModel) {
            Intrinsics.checkNotNullParameter(relationshipItemModel, "relationshipItemModel");
            initAttrStyle max = BlockedFragment.getMax(this.getMin);
            List max2 = BlockedFragment.getMax(this.getMin).getMax();
            Intrinsics.checkNotNullExpressionValue(max2, "adapter.items");
            Collection arrayList = new ArrayList();
            for (Object next : max2) {
                if (!Intrinsics.areEqual((Object) ((RelationshipItemModel) next).length, (Object) relationshipItemModel.length)) {
                    arrayList.add(next);
                }
            }
            max.getMin((List) arrayList);
            BlockedFragment.setMax(this.getMin, relationshipItemModel.getMin);
        }

        public final void setMin() {
            BlockedFragment.length(this.getMin);
        }
    }

    public final void setMax() {
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        danaApplication.getRestrictedContactComponent().setMin(new BlockedFragmentModule(new setMax(this))).length(this);
        initAttrStyle initattrstyle = new initAttrStyle(new length(this));
        this.setMin = initattrstyle;
        if (initattrstyle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        initattrstyle.registerAdapterDataObserver(new getMin(this));
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
        setRightButtonUnicode.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.length();
        setRightButtonUnicode.getMin getmin2 = this.presenter;
        if (getmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin2.getMin();
    }

    public static final /* synthetic */ Unit getMin(BlockedFragment blockedFragment, RelationshipItemModel relationshipItemModel) {
        Context context = blockedFragment.getContext();
        if (context == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(context, "this");
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context);
        getmax.toFloatRange = context.getString(R.string.blocked_contacts_confirm_dialog_title);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = context.getString(R.string.blocked_contacts_confirm_dialog_body);
        getProgressViewStartOffset.getMax min = getmax2.getMax(context.getString(R.string.confirm_dialog_negative), new getMax(blockedFragment, relationshipItemModel)).setMin(context.getString(R.string.confirm_dialog_positive), new setMin(blockedFragment, relationshipItemModel));
        min.toIntRange = 0;
        blockedFragment.getMin = min.equals();
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void setMin(BlockedFragment blockedFragment) {
        EmptyState emptyState = (EmptyState) blockedFragment.getMax(resetInternal.setMax.enumMapping);
        if (emptyState != null) {
            emptyState.setVisibility(8);
        }
    }

    public static final /* synthetic */ void setMax(BlockedFragment blockedFragment) {
        EmptyState emptyState = (EmptyState) blockedFragment.getMax(resetInternal.setMax.enumMapping);
        if (emptyState != null) {
            emptyState.setVisibility(0);
        }
    }

    public static final /* synthetic */ void getMax(BlockedFragment blockedFragment, RelationshipItemModel relationshipItemModel) {
        setRightButtonUnicode.getMin getmin = blockedFragment.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.length(relationshipItemModel);
    }

    public static final /* synthetic */ void setMax(BlockedFragment blockedFragment, String str) {
        FragmentActivity activity = blockedFragment.getActivity();
        if (activity instanceof setUserInfo) {
            String string = blockedFragment.getResources().getString(R.string.friendship_unblock, new Object[]{str});
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…ndship_unblock, nickname)");
            ((setUserInfo) activity).showDialogToast(string);
        }
    }

    public static final /* synthetic */ void length(BlockedFragment blockedFragment) {
        FragmentActivity activity = blockedFragment.getActivity();
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
