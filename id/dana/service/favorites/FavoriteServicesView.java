package id.dana.service.favorites;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.model.ThirdPartyService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.IntRange;
import o.PhotoView;
import o.PrepareException;
import o.SupportSQLiteDatabase;
import o.dispatchOnCancelled;
import o.getPhotoView;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setCancelText;
import o.setForceFullScreen;
import o.setForceUse;
import o.setPublishStatus;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001JB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001aJ\u0014\u0010.\u001a\u00020/2\n\u00100\u001a\u0006\u0012\u0002\b\u000301H\u0002J\u000e\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020\u001fH\u0002J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020\u001cH\u0014J\u0010\u0010<\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001aH\u0002J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001aH\u0002J\u000e\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001aJ\b\u0010@\u001a\u000207H\u0002J\u0014\u0010A\u001a\u0002072\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a0CJ\u000e\u0010D\u001a\u0002072\u0006\u0010E\u001a\u00020\u001cJ\b\u0010F\u001a\u000207H\u0016J\b\u0010G\u001a\u000207H\u0002J\b\u0010H\u001a\u000207H\u0002J\u0016\u0010I\u001a\u0002072\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a0CH\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lid/dana/service/favorites/FavoriteServicesView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dashedGridItemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getDashedGridItemDecoration", "()Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "editItemLookup", "Lid/dana/service/adapter/ServiceAdapter$EditItemBadgeLookup;", "getEditItemLookup", "()Lid/dana/service/adapter/ServiceAdapter$EditItemBadgeLookup;", "favoriteServiceActionListener", "Lid/dana/service/favorites/FavoriteServicesView$FavoriteServiceActionListener;", "getFavoriteServiceActionListener", "()Lid/dana/service/favorites/FavoriteServicesView$FavoriteServiceActionListener;", "setFavoriteServiceActionListener", "(Lid/dana/service/favorites/FavoriteServicesView$FavoriteServiceActionListener;)V", "featuredService", "Lid/dana/model/ThirdPartyService;", "isItemFull", "", "()Z", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "getOnItemClickListener", "()Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "setOnItemClickListener", "(Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;)V", "presenter", "Lid/dana/service/favorites/FavoriteServicesContract$Presenter;", "getPresenter", "()Lid/dana/service/favorites/FavoriteServicesContract$Presenter;", "setPresenter", "(Lid/dana/service/favorites/FavoriteServicesContract$Presenter;)V", "serviceAdapter", "Lid/dana/service/adapter/EditServiceAdapter;", "containService", "thirdPartyService", "getGridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getItemViewType", "position", "getLayout", "getOnItemClickListenerImpl", "injectComponent", "", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "injected", "isInjected", "isFeaturedService", "isItemOrFeatureService", "replaceEmptyItem", "service", "saveFavoriteServices", "setItems", "featuredServices", "", "setOnEdit", "isEditMode", "setup", "setupRecyclerView", "showFailSaveServices", "takeoutPromotedService", "FavoriteServiceActionListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FavoriteServicesView extends BaseRichView {
    @Nullable
    private setMin getMax;
    /* access modifiers changed from: private */
    public getPhotoView getMin;
    private ThirdPartyService length;
    @Inject
    public setForceFullScreen.setMin presenter;
    @Nullable
    private Ignore.setMin setMax;
    private HashMap setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/service/favorites/FavoriteServicesView$FavoriteServiceActionListener;", "", "onItemChanged", "", "position", "", "onSave", "success", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void getMax();

        void setMax();
    }

    @JvmOverloads
    public FavoriteServicesView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FavoriteServicesView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_service_edit;
    }

    public static final /* synthetic */ getPhotoView access$getServiceAdapter$p(FavoriteServicesView favoriteServicesView) {
        getPhotoView getphotoview = favoriteServicesView.getMin;
        if (getphotoview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        return getphotoview;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FavoriteServicesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FavoriteServicesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FavoriteServicesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final setForceFullScreen.setMin getPresenter() {
        setForceFullScreen.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setmin;
    }

    public final void setPresenter(@NotNull setForceFullScreen.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.presenter = setmin;
    }

    @Nullable
    public final Ignore.setMin getOnItemClickListener() {
        return this.setMax;
    }

    public final void setOnItemClickListener(@Nullable Ignore.setMin setmin) {
        this.setMax = setmin;
    }

    @Nullable
    public final setMin getFavoriteServiceActionListener() {
        return this.getMax;
    }

    public final void setFavoriteServiceActionListener(@Nullable setMin setmin) {
        this.getMax = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"id/dana/service/favorites/FavoriteServicesView$injectComponent$1", "Lid/dana/service/favorites/FavoriteServicesContract$View;", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "setDanaLoadingDialog", "(Lid/dana/dialog/DanaLoadingDialog;)V", "dismissProgress", "", "onLoadFavoriteServices", "favoriteServices", "", "Lid/dana/model/ThirdPartyService;", "onSaveFavoriteService", "success", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements setForceFullScreen.getMin {
        @Nullable
        private setPublishStatus getMin;
        final /* synthetic */ FavoriteServicesView setMax;

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        setMax(FavoriteServicesView favoriteServicesView) {
            this.setMax = favoriteServicesView;
        }

        public final void setMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "favoriteServices");
            this.setMax.setItems(CollectionsKt.toMutableList(list));
        }

        public final void getMax(boolean z) {
            setMin favoriteServiceActionListener = this.setMax.getFavoriteServiceActionListener();
            if (favoriteServiceActionListener != null) {
                favoriteServiceActionListener.getMax();
            }
            if (!z) {
                FavoriteServicesView.access$showFailSaveServices(this.setMax);
            }
        }

        public final void showProgress() {
            BaseActivity baseActivity = this.setMax.getBaseActivity();
            if (baseActivity != null) {
                setPublishStatus setpublishstatus = new setPublishStatus(baseActivity);
                if (!setpublishstatus.length.isShowing()) {
                    setpublishstatus.length.show();
                    setpublishstatus.getMax.startRefresh();
                }
                Unit unit = Unit.INSTANCE;
                this.getMin = setpublishstatus;
            }
        }

        public final void dismissProgress() {
            setPublishStatus setpublishstatus = this.getMin;
            if (setpublishstatus != null) {
                setpublishstatus.getMax();
            }
            this.getMin = null;
        }
    }

    public final void injected(boolean z) {
        if (z) {
            setForceFullScreen.setMin setmin = this.presenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            setmin.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements Ignore.setMin {
        final /* synthetic */ FavoriteServicesView setMax;

        length(FavoriteServicesView favoriteServicesView) {
            this.setMax = favoriteServicesView;
        }

        public final void length(int i) {
            int itemViewType = this.setMax.getItemViewType(i);
            if (itemViewType == 2) {
                FavoriteServicesView.access$getServiceAdapter$p(this.setMax).getMax(i);
                setMin favoriteServiceActionListener = this.setMax.getFavoriteServiceActionListener();
                if (favoriteServiceActionListener != null) {
                    favoriteServiceActionListener.setMax();
                }
            } else if (itemViewType == 4) {
                FavoriteServicesView.access$saveFavoriteServices(this.setMax);
                return;
            }
            Ignore.setMin onItemClickListener = this.setMax.getOnItemClickListener();
            if (onItemClickListener != null) {
                onItemClickListener.length(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"id/dana/service/favorites/FavoriteServicesView$getGridLayoutManager$1$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GridLayoutManager.length {
        final /* synthetic */ RecyclerView.Adapter getMax;
        final /* synthetic */ GridLayoutManager getMin;

        getMax(GridLayoutManager gridLayoutManager, RecyclerView.Adapter adapter) {
            this.getMin = gridLayoutManager;
            this.getMax = adapter;
        }

        public final int getMin(int i) {
            if (this.getMax.getItemViewType(i) != 1) {
                return 1;
            }
            return this.getMin.setMin;
        }
    }

    public final boolean isItemFull() {
        getPhotoView getphotoview = this.getMin;
        if (getphotoview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        return getphotoview.setMax();
    }

    public final boolean replaceEmptyItem(@NotNull ThirdPartyService thirdPartyService) {
        Intrinsics.checkNotNullParameter(thirdPartyService, FeatureParams.OPEN_SERVICE);
        if (!containService(thirdPartyService)) {
            getPhotoView getphotoview = this.getMin;
            if (getphotoview == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
            }
            Intrinsics.checkNotNullParameter(thirdPartyService, FeatureParams.OPEN_SERVICE);
            List max = getphotoview.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            Iterator it = max.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((ThirdPartyService) next).values == 6) {
                    getphotoview.getMax().set(i, thirdPartyService);
                    getphotoview.notifyItemChanged(i);
                    break;
                }
                i = i2;
            }
            setMin setmin = this.getMax;
            if (setmin != null) {
                setmin.setMax();
            }
            if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    public final int getItemViewType(int i) {
        getPhotoView getphotoview = this.getMin;
        if (getphotoview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        return getphotoview.getItemViewType(i);
    }

    public final boolean containService(@NotNull ThirdPartyService thirdPartyService) {
        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
        if (setMax(thirdPartyService)) {
            return true;
        }
        getPhotoView getphotoview = this.getMin;
        if (getphotoview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        return getphotoview.setMax(thirdPartyService);
    }

    private final boolean setMax(ThirdPartyService thirdPartyService) {
        return Intrinsics.areEqual((Object) this.length, (Object) thirdPartyService);
    }

    public final void setOnEdit(boolean z) {
        setVisibility(z ? 0 : 8);
        getPhotoView getphotoview = this.getMin;
        if (getphotoview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        getphotoview.setMin(z);
        if (z) {
            setForceFullScreen.setMin setmin = this.presenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            setmin.length();
        }
    }

    public final void injectComponent(@NotNull PrepareException.AnonymousClass1 r4) {
        Intrinsics.checkNotNullParameter(r4, "applicationComponent");
        setForceUse.setMax setmax = new setForceUse.setMax((byte) 0);
        if (r4 != null) {
            setmax.setMin = r4;
            setmax.setMax = new FavoriteServicesModule(new setMax(this));
            stopIgnoring.setMin(setmax.setMax, FavoriteServicesModule.class);
            stopIgnoring.setMin(setmax.setMin, PrepareException.AnonymousClass1.class);
            new setForceUse(setmax.setMax, setmax.setMin, (byte) 0).getMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            setForceFullScreen.setMin setmin = this.presenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = setmin;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/model/ThirdPartyService;", "kotlin.jvm.PlatformType", "getEditState"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements PhotoView.setMin {
        public static final getMin getMax = new getMin();

        getMin() {
        }

        public final int setMin(ThirdPartyService thirdPartyService) {
            return thirdPartyService.values == 0 ? 2 : 0;
        }
    }

    public final void setup() {
        getPhotoView getphotoview = new getPhotoView();
        getphotoview.getMin = getMin.getMax;
        getphotoview.getMax((Ignore.setMin) new length(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "it");
        RecyclerView.Adapter adapter = getphotoview;
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        gridLayoutManager.toIntRange = new getMax(gridLayoutManager, adapter);
        recyclerView.setLayoutManager(gridLayoutManager);
        SupportSQLiteDatabase.getMin getmin = new SupportSQLiteDatabase.getMin();
        getmin.isInside = new boolean[]{true, true, true, true};
        getmin.length = new boolean[]{false, false, true, true};
        int max = IntRange.setMax(getContext(), R.color.f24632131100413);
        int max2 = dispatchOnCancelled.setMax(max);
        if (max != max2) {
            onCanceled oncanceled = new onCanceled(max, max2, 1);
            onCancelLoad.setMax(-1756150169, oncanceled);
            onCancelLoad.getMin(-1756150169, oncanceled);
        }
        getmin.getMax = max;
        int i = (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f);
        if (i > 0) {
            getmin.setMax = i;
            int i2 = (int) (Resources.getSystem().getDisplayMetrics().density * 4.0f);
            if (i2 > 0) {
                getmin.setMin = i2;
                int i3 = (int) (Resources.getSystem().getDisplayMetrics().density * 1.0f);
                if (i3 > 0) {
                    getmin.getMin = i3;
                    if (getmin.setMax <= 0) {
                        throw new IllegalArgumentException("Dash gap must be greater than 0.");
                    } else if (getmin.setMin <= 0) {
                        throw new IllegalArgumentException("Dash length must be greater than 0.");
                    } else if (getmin.getMin > 0) {
                        SupportSQLiteDatabase supportSQLiteDatabase = new SupportSQLiteDatabase(getmin.setMax, getmin.setMin, getmin.getMin, getmin.getMax, getmin.length, getmin.isInside, getmin.equals, (byte) 0);
                        Intrinsics.checkNotNullExpressionValue(supportSQLiteDatabase, "DashedGridDivider.Builde…(1))\n            .build()");
                        recyclerView.addItemDecoration(supportSQLiteDatabase);
                        Unit unit = Unit.INSTANCE;
                        this.getMin = getphotoview;
                    } else {
                        throw new IllegalArgumentException("Dash thickness must be greater than 0.");
                    }
                } else {
                    throw new IllegalArgumentException("Dash thickness must be greater than 0.");
                }
            } else {
                throw new IllegalArgumentException("Dash length must be greater than 0.");
            }
        } else {
            throw new IllegalArgumentException("Dash gap must be greater than 0.");
        }
    }

    private static boolean getMax(ThirdPartyService thirdPartyService) {
        return thirdPartyService.values == 2 || thirdPartyService.values == 0;
    }

    public final void setItems(@NotNull List<ThirdPartyService> list) {
        Intrinsics.checkNotNullParameter(list, "featuredServices");
        if (list.size() > 1) {
            this.length = list.remove(1);
        }
        getPhotoView getphotoview = this.getMin;
        if (getphotoview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        getphotoview.getMin(list);
        setMin setmin = this.getMax;
        if (setmin != null) {
            setmin.setMax();
        }
    }

    public static final /* synthetic */ void access$showFailSaveServices(FavoriteServicesView favoriteServicesView) {
        BaseActivity baseActivity = favoriteServicesView.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        setCancelText.length(baseActivity, R.drawable.ic_close_red, R.drawable.bg_rounded_toast_payment_auth, favoriteServicesView.getContext().getString(R.string.msg_save_services_fail), 48, 60, false, (String) null, 384);
    }

    public static final /* synthetic */ void access$saveFavoriteServices(FavoriteServicesView favoriteServicesView) {
        List arrayList = new ArrayList();
        getPhotoView getphotoview = favoriteServicesView.getMin;
        if (getphotoview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        Collection max = getphotoview.getMax();
        if (!(max == null || max.isEmpty())) {
            getPhotoView getphotoview2 = favoriteServicesView.getMin;
            if (getphotoview2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
            }
            int size = getphotoview2.getMax().size();
            getPhotoView getphotoview3 = favoriteServicesView.getMin;
            if (getphotoview3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
            }
            for (ThirdPartyService thirdPartyService : getphotoview3.getMax().subList(1, size - 1)) {
                if (thirdPartyService.values == 6) {
                    arrayList.add("");
                } else {
                    Intrinsics.checkNotNullExpressionValue(thirdPartyService, "thirdPartyService");
                    if (getMax(thirdPartyService)) {
                        arrayList.add(thirdPartyService.setMax);
                    }
                }
            }
        }
        setForceFullScreen.setMin setmin = favoriteServicesView.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmin.setMax(arrayList);
    }
}
