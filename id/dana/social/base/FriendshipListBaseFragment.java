package id.dana.social.base;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.richview.LogoProgressView;
import id.dana.richview.SearchView;
import id.dana.social.di.module.FriendshipModule;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.view.activity.SocialProfileActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.AUHorizontalListView;
import o.AUPopSupportPreemption;
import o.FtsOptions$Order;
import o.GriverSignatureUtils;
import o.IComponent;
import o.getAuthCodeForSecurityGuard;
import o.getLeftButton;
import o.onDelete;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b&\u0018\u0000 B2\u00020\u0001:\u0002BCB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u0018H&J\b\u0010\u001e\u001a\u00020\u001aH&J\b\u0010\u001f\u001a\u00020\u001aH&J\b\u0010 \u001a\u00020\u001aH&J\b\u0010!\u001a\u00020\u001aH&J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020\u001aH&J\b\u0010'\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u0018H\u0014J\u0006\u0010)\u001a\u00020\u0018J\b\u0010*\u001a\u00020\u0018H&J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\b\u0010-\u001a\u00020\u0018H\u0002J\u0016\u0010.\u001a\u00020\u00182\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0002J\u0010\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u000201H\u0002J\u0017\u00104\u001a\u0004\u0018\u00010\u00182\u0006\u00103\u001a\u000201H\u0002¢\u0006\u0002\u00105J\u000e\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u000208J\b\u00109\u001a\u00020\u0018H\u0002J\b\u0010:\u001a\u00020\u0018H\u0002J\u0018\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u001aH\u0002J\b\u0010>\u001a\u00020\u0018H\u0002J\u0010\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u001aH&J\u0010\u0010A\u001a\u00020\u00182\u0006\u00103\u001a\u000201H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lid/dana/social/base/FriendshipListBaseFragment;", "Lid/dana/base/BaseFragment;", "showSnackbarInterfaceInstance", "Lid/dana/social/base/FriendshipListBaseFragment$ShowSnackbarInterface;", "(Lid/dana/social/base/FriendshipListBaseFragment$ShowSnackbarInterface;)V", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "friendshipListAdapter", "Lid/dana/social/adapter/FriendshipListAdapter;", "getFriendshipListAdapter", "()Lid/dana/social/adapter/FriendshipListAdapter;", "setFriendshipListAdapter", "(Lid/dana/social/adapter/FriendshipListAdapter;)V", "friendshipPresenter", "Lid/dana/social/contract/FriendshipContract$Presenter;", "getFriendshipPresenter", "()Lid/dana/social/contract/FriendshipContract$Presenter;", "setFriendshipPresenter", "(Lid/dana/social/contract/FriendshipContract$Presenter;)V", "callModifyRelationship", "", "userId", "", "operationType", "Lid/dana/domain/social/ModifyRelationOperationType;", "checkRelationshipType", "getActiveButton", "getActiveButtonSnackbarText", "getInactiveButton", "getInactiveButtonSnackbarText", "getLayout", "", "getOnRestrictedContactButtonClicked", "Landroid/view/View$OnClickListener;", "getRelationshipStatusLabelText", "hideKeyboard", "init", "initComponent", "initFetchingProcess", "initRestrictedContactButton", "initSearchListener", "initSearchView", "initiateFriendshipItems", "relationshipItemModelList", "", "Lid/dana/social/model/RelationshipItemModel;", "modifyRelationship", "data", "openProfileActivity", "(Lid/dana/social/model/RelationshipItemModel;)Lkotlin/Unit;", "setRecyclerScrollEnabled", "recyclerScrollEnabled", "", "setupAdapter", "setupReyclerView", "showSnackbar", "description", "nickname", "startLoading", "trackMixpanelModifyRelationship", "status", "updateRelationshipStatus", "Companion", "ShowSnackbarInterface", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class FriendshipListBaseFragment extends FtsOptions$Order {
    @NotNull
    public static final setMax getMin = new setMax((byte) 0);
    private HashMap IsOverlapping;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    @Inject
    public getLeftButton.getMin friendshipPresenter;
    public GriverSignatureUtils setMax;
    private final getMax setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/social/base/FriendshipListBaseFragment$ShowSnackbarInterface;", "", "showSnackbar", "", "description", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax {
        void getMax(@NotNull String str);
    }

    @NotNull
    public abstract String FastBitmap$CoordinateSystem();

    @NotNull
    public abstract String Grayscale$Algorithm();

    @NotNull
    public abstract String Mean$Arithmetic();

    public abstract void equals();

    public View getMax(int i) {
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

    public abstract void getMax();

    public abstract void getMin(@NotNull String str);

    @NotNull
    public abstract View.OnClickListener invoke();

    public void invokeSuspend() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract void length(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        invokeSuspend();
    }

    public final int setMin() {
        return R.layout.view_friendship;
    }

    @NotNull
    public abstract String toDoubleRange();

    @NotNull
    public abstract String values();

    public FriendshipListBaseFragment(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "showSnackbarInterfaceInstance");
        this.setMin = getmax;
    }

    private final void setMin(String str, String str2) {
        getMax getmax = this.setMin;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(str, Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        getmax.getMax(format);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005¨\u0006\r"}, d2 = {"id/dana/social/base/FriendshipListBaseFragment$setupAdapter$1", "Lid/dana/social/adapter/FriendshipListInteraction;", "activeButtonText", "", "getActiveButtonText", "()Ljava/lang/String;", "inactiveButtonText", "getInactiveButtonText", "onFriendInfoClick", "", "position", "", "onRelationshipButtonClick", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements getAuthCodeForSecurityGuard {
        @NotNull
        private final String getMax;
        @NotNull
        private final String getMin;
        final /* synthetic */ FriendshipListBaseFragment setMax;

        public final void getMin(int i, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
            Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
        }

        setMin(FriendshipListBaseFragment friendshipListBaseFragment) {
            this.setMax = friendshipListBaseFragment;
            this.getMin = friendshipListBaseFragment.toDoubleRange();
            this.getMax = friendshipListBaseFragment.values();
        }

        @NotNull
        public final String length() {
            return this.getMin;
        }

        @NotNull
        public final String getMax() {
            return this.getMax;
        }

        public final void getMax(int i) {
            GriverSignatureUtils griverSignatureUtils = this.setMax.setMax;
            if (griverSignatureUtils == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipListAdapter");
            }
            RelationshipItemModel relationshipItemModel = (RelationshipItemModel) griverSignatureUtils.setMin(i);
            if (relationshipItemModel != null) {
                FriendshipListBaseFragment.setMax(this.setMax, relationshipItemModel);
            }
        }

        public final void getMin(int i) {
            if (i != -1) {
                GriverSignatureUtils griverSignatureUtils = this.setMax.setMax;
                if (griverSignatureUtils == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("friendshipListAdapter");
                }
                RelationshipItemModel relationshipItemModel = (RelationshipItemModel) griverSignatureUtils.setMin(i);
                if (relationshipItemModel != null) {
                    FriendshipListBaseFragment.setMin(this.setMax, relationshipItemModel);
                }
                griverSignatureUtils.getMax(i);
                griverSignatureUtils.notifyItemChanged(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\r"}, d2 = {"id/dana/social/base/FriendshipListBaseFragment$initComponent$1", "Lid/dana/social/contract/FriendshipContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetRelationshipItem", "relationshipItemModelList", "", "Lid/dana/social/model/RelationshipItemModel;", "showProgress", "updateRelationshipList", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements getLeftButton.setMax {
        final /* synthetic */ FriendshipListBaseFragment getMax;

        public final void dismissProgress() {
        }

        public final void onError(@Nullable String str) {
        }

        public final void showProgress() {
        }

        length(FriendshipListBaseFragment friendshipListBaseFragment) {
            this.getMax = friendshipListBaseFragment;
        }

        public final void setMin(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "relationshipItemModelList");
            GriverSignatureUtils griverSignatureUtils = this.getMax.setMax;
            if (griverSignatureUtils == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipListAdapter");
            }
            griverSignatureUtils.getMin(list);
        }

        public final void setMax(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "relationshipItemModelList");
            FriendshipListBaseFragment.getMin(this.getMax, list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnFocusChangeListener {
        final /* synthetic */ FriendshipListBaseFragment getMin;

        getMin(FriendshipListBaseFragment friendshipListBaseFragment) {
            this.getMin = friendshipListBaseFragment;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.getMin.getMax(resetInternal.setMax.close);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    return;
                }
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) this.getMin.getMax(resetInternal.setMax.close);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            FriendshipListBaseFragment.getMin(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/base/FriendshipListBaseFragment$Companion;", "", "()V", "ACTIVE", "", "INACTIVE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void setMax() {
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            socialCommonComponent.getMin(new FriendshipModule(new length(this))).setMax(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        getLeftButton.getMin getmin = this.friendshipPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipPresenter");
        }
        getminArr[0] = getmin;
        getMin(getminArr);
        this.setMax = new GriverSignatureUtils(new setMin(this));
        RecyclerView recyclerView = (RecyclerView) getMax(resetInternal.setMax.getAutoSizeMinTextSize);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(true);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView2 = (RecyclerView) getMax(resetInternal.setMax.getAutoSizeMinTextSize);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView3 = (RecyclerView) getMax(resetInternal.setMax.getAutoSizeMinTextSize);
        if (recyclerView3 != null) {
            GriverSignatureUtils griverSignatureUtils = this.setMax;
            if (griverSignatureUtils == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipListAdapter");
            }
            recyclerView3.setAdapter(griverSignatureUtils);
        }
        getMax();
        LogoProgressView logoProgressView = (LogoProgressView) getMax(resetInternal.setMax.setHeaderIcon);
        if (logoProgressView != null) {
            logoProgressView.startRefresh();
        }
        equals();
        ((SearchView) getMax(resetInternal.setMax.setLineHeight)).setSearchHint(getString(R.string.search));
        getLeftButton.getMin getmin2 = this.friendshipPresenter;
        if (getmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipPresenter");
        }
        SearchView searchView = (SearchView) getMax(resetInternal.setMax.setLineHeight);
        Intrinsics.checkNotNullExpressionValue(searchView, "sv_friendship_search");
        IComponent<String> keyword = searchView.getKeyword();
        Intrinsics.checkNotNullExpressionValue(keyword, "sv_friendship_search.keyword");
        getmin2.setMin(keyword);
        SearchView searchView2 = (SearchView) getMax(resetInternal.setMax.setLineHeight);
        Intrinsics.checkNotNullExpressionValue(searchView2, "sv_friendship_search");
        EditText editText = searchView2.getEditText();
        Intrinsics.checkNotNullExpressionValue(editText, "sv_friendship_search.editText");
        editText.setOnFocusChangeListener(new getMin(this));
        TextView textView = (TextView) getMax(resetInternal.setMax.ensureContentInsets);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_restricted_contacts_label");
        textView.setText(Mean$Arithmetic());
        ((LinearLayout) getMax(resetInternal.setMax.setHeaderIconInt)).setOnClickListener(invoke());
    }

    public static final /* synthetic */ Unit setMax(FriendshipListBaseFragment friendshipListBaseFragment, RelationshipItemModel relationshipItemModel) {
        Context context = friendshipListBaseFragment.getContext();
        if (context == null) {
            return null;
        }
        if (!StringsKt.contains$default((CharSequence) relationshipItemModel.getMin, (CharSequence) "•", false, 2, (Object) null)) {
            SocialProfileActivity.getMin getmin = SocialProfileActivity.Companion;
            Intrinsics.checkNotNullExpressionValue(context, "it");
            SocialProfileActivity.getMin.setMin(context, relationshipItemModel);
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void setMin(FriendshipListBaseFragment friendshipListBaseFragment, RelationshipItemModel relationshipItemModel) {
        String str = "ACTIVE";
        if (Intrinsics.areEqual((Object) relationshipItemModel.getMax, (Object) str)) {
            friendshipListBaseFragment.length(relationshipItemModel.length, ModifyRelationOperationType.valueOf(friendshipListBaseFragment.toDoubleRange()));
            friendshipListBaseFragment.setMin(friendshipListBaseFragment.FastBitmap$CoordinateSystem(), relationshipItemModel.getMin);
            str = "INACTIVE";
        } else {
            friendshipListBaseFragment.length(relationshipItemModel.length, ModifyRelationOperationType.valueOf(friendshipListBaseFragment.values()));
            friendshipListBaseFragment.setMin(friendshipListBaseFragment.Grayscale$Algorithm(), relationshipItemModel.getMin);
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        relationshipItemModel.getMax = str;
        friendshipListBaseFragment.getMin(relationshipItemModel.getMax);
    }

    public static final /* synthetic */ void getMin(FriendshipListBaseFragment friendshipListBaseFragment, List list) {
        LogoProgressView logoProgressView = (LogoProgressView) friendshipListBaseFragment.getMax(resetInternal.setMax.setHeaderIcon);
        if (logoProgressView != null) {
            logoProgressView.stopRefresh();
        }
        LogoProgressView logoProgressView2 = (LogoProgressView) friendshipListBaseFragment.getMax(resetInternal.setMax.setHeaderIcon);
        if (logoProgressView2 != null) {
            logoProgressView2.setVisibility(8);
        }
        RecyclerView recyclerView = (RecyclerView) friendshipListBaseFragment.getMax(resetInternal.setMax.getAutoSizeMinTextSize);
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        GriverSignatureUtils griverSignatureUtils = friendshipListBaseFragment.setMax;
        if (griverSignatureUtils == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipListAdapter");
        }
        griverSignatureUtils.getMin(list);
    }

    public static final /* synthetic */ void getMin(FriendshipListBaseFragment friendshipListBaseFragment) {
        Context context = friendshipListBaseFragment.getContext();
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View view = friendshipListBaseFragment.getView();
            if (view != null) {
                Intrinsics.checkNotNullExpressionValue(view, "it");
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
