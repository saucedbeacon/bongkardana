package id.dana.sendmoney_v2.landing.view;

import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.RecipientHomeModule;
import id.dana.model.SendMoneyHomeMenuModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IconUtils;
import o.Ignore;
import o.ImageObserver;
import o.LoadingBridgeExtension;
import o.PrepareException;
import o.Relation;
import o.getModifiedTime;
import o.isHideOnContentScrollEnabled;
import o.onDelete;
import o.onProviderEnabled;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0002J\u0012\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u0010H\u0002J\u0010\u0010\u000e\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u0010H\u0016J\b\u0010.\u001a\u00020\u0010H\u0002J\u000e\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0007J\b\u00101\u001a\u00020\u0010H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX.¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lid/dana/sendmoney_v2/landing/view/RecipientSelectorView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "menus", "", "Lid/dana/model/SendMoneyHomeMenuModel;", "onMenuSelected", "Lkotlin/Function1;", "", "getOnMenuSelected", "()Lkotlin/jvm/functions/Function1;", "setOnMenuSelected", "(Lkotlin/jvm/functions/Function1;)V", "recipientHomeModule", "Lid/dana/di/modules/RecipientHomeModule;", "getRecipientHomeModule", "()Lid/dana/di/modules/RecipientHomeModule;", "recipientHomePresenter", "Lid/dana/sendmoney/recipienthome/RecipientHomeContract$Presenter;", "getRecipientHomePresenter", "()Lid/dana/sendmoney/recipienthome/RecipientHomeContract$Presenter;", "setRecipientHomePresenter", "(Lid/dana/sendmoney/recipienthome/RecipientHomeContract$Presenter;)V", "recipientSelectorAdapter", "Lid/dana/sendmoney_v2/landing/adapter/RecipientSelectorAdapter;", "getLayout", "getLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "adapter", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "loadData", "homeMenuModel", "onRecyclerViewExpanded", "expanded", "", "setup", "setupRecyclerView", "updateHomeMenus", "freeBankTransferCount", "updateShowMoreView", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RecipientSelectorView extends BaseRichView {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public IconUtils getMin;
    @NotNull
    private Function1<? super SendMoneyHomeMenuModel, Unit> length;
    @Inject
    public getModifiedTime.getMin recipientHomePresenter;
    /* access modifiers changed from: private */
    public List<SendMoneyHomeMenuModel> setMax;
    private HashMap setMin;

    @JvmOverloads
    public RecipientSelectorView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public RecipientSelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_recipient_selector;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "position", "", "invoke", "id/dana/sendmoney_v2/landing/view/RecipientSelectorView$setupRecyclerView$1$1$1", "id/dana/sendmoney_v2/landing/view/RecipientSelectorView$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ IconUtils $this_apply;
        final /* synthetic */ RecyclerView $this_apply$inlined;
        final /* synthetic */ RecipientSelectorView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(IconUtils iconUtils, RecyclerView recyclerView, RecipientSelectorView recipientSelectorView) {
            super(1);
            this.$this_apply = iconUtils;
            this.$this_apply$inlined = recyclerView;
            this.this$0 = recipientSelectorView;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            SendMoneyHomeMenuModel sendMoneyHomeMenuModel = (SendMoneyHomeMenuModel) this.$this_apply.setMin(i);
            if (sendMoneyHomeMenuModel != null) {
                this.this$0.length.invoke(sendMoneyHomeMenuModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "expanded", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class toFloatRange extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        toFloatRange(RecipientSelectorView recipientSelectorView) {
            super(1, recipientSelectorView, RecipientSelectorView.class, "onRecyclerViewExpanded", "onRecyclerViewExpanded(Z)V", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            RecipientSelectorView.access$onRecyclerViewExpanded((RecipientSelectorView) this.receiver, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/model/SendMoneyHomeMenuModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<SendMoneyHomeMenuModel, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final void invoke(@NotNull SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
            Intrinsics.checkNotNullParameter(sendMoneyHomeMenuModel, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SendMoneyHomeMenuModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ List access$getMenus$p(RecipientSelectorView recipientSelectorView) {
        List<SendMoneyHomeMenuModel> list = recipientSelectorView.setMax;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menus");
        }
        return list;
    }

    public static final /* synthetic */ IconUtils access$getRecipientSelectorAdapter$p(RecipientSelectorView recipientSelectorView) {
        IconUtils iconUtils = recipientSelectorView.getMin;
        if (iconUtils == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientSelectorAdapter");
        }
        return iconUtils;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecipientSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RecipientSelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = setMin.INSTANCE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public RecipientSelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = setMin.INSTANCE;
    }

    @NotNull
    public final getModifiedTime.getMin getRecipientHomePresenter() {
        getModifiedTime.getMin getmin = this.recipientHomePresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientHomePresenter");
        }
        return getmin;
    }

    public final void setRecipientHomePresenter(@NotNull getModifiedTime.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.recipientHomePresenter = getmin;
    }

    @NotNull
    public final Function1<SendMoneyHomeMenuModel, Unit> getOnMenuSelected() {
        return this.length;
    }

    public final void setOnMenuSelected(@NotNull Function1<? super SendMoneyHomeMenuModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.length = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\u0017\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"id/dana/sendmoney_v2/landing/view/RecipientSelectorView$recipientHomeModule$1", "Lid/dana/sendmoney/recipienthome/RecipientHomeContract$View;", "onGetBannerSendMoneyHomeSuccess", "", "promotionModel", "Lid/dana/model/PromotionModel;", "onGetSendMoneyHomeMenu", "menus", "", "Lid/dana/model/SendMoneyHomeMenuModel;", "onSendMoneyBannerSwitchSuccess", "enable", "", "(Ljava/lang/Boolean;)V", "onUpdateFreeTransferSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements getModifiedTime.getMax {
        final /* synthetic */ RecipientSelectorView setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void length(@Nullable Boolean bool) {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMax(@Nullable LoadingBridgeExtension loadingBridgeExtension) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(RecipientSelectorView recipientSelectorView) {
            this.setMin = recipientSelectorView;
        }

        public final void getMin(@Nullable List<SendMoneyHomeMenuModel> list) {
            if (this.setMin.getMin != null) {
                IconUtils access$getRecipientSelectorAdapter$p = RecipientSelectorView.access$getRecipientSelectorAdapter$p(this.setMin);
                if (list != null) {
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        Intrinsics.checkNotNullParameter(list, "menus");
                        access$getRecipientSelectorAdapter$p.setMax.getMin(list);
                        this.setMin.setMax = list;
                    }
                }
                this.setMin.setMax();
            }
        }

        public final void length(@Nullable SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
            IconUtils access$getRecipientSelectorAdapter$p = RecipientSelectorView.access$getRecipientSelectorAdapter$p(this.setMin);
            if (access$getRecipientSelectorAdapter$p != null) {
                access$getRecipientSelectorAdapter$p.setMax.setMin(sendMoneyHomeMenuModel);
            }
            this.setMin.setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ RecipientSelectorView setMin;

        toIntRange(RecipientSelectorView recipientSelectorView) {
            this.setMin = recipientSelectorView;
        }

        public final void onClick(View view) {
            IconUtils access$getRecipientSelectorAdapter$p = RecipientSelectorView.access$getRecipientSelectorAdapter$p(this.setMin);
            if (access$getRecipientSelectorAdapter$p != null) {
                access$getRecipientSelectorAdapter$p.toFloatRange();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setMax() {
        ShowMoreView showMoreView = (ShowMoreView) _$_findCachedViewById(resetInternal.setMax.getInternalPopup);
        if (showMoreView != null) {
            View view = showMoreView;
            IconUtils iconUtils = this.getMin;
            if (iconUtils == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recipientSelectorAdapter");
            }
            int i = 0;
            boolean z = true;
            if (!iconUtils.setMax()) {
                z = false;
            }
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
            IconUtils iconUtils2 = this.getMin;
            if (iconUtils2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recipientSelectorAdapter");
            }
            showMoreView.setExpanded(iconUtils2.setMin());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"id/dana/sendmoney_v2/landing/view/RecipientSelectorView$getLayoutManager$1$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GridLayoutManager.length {
        final /* synthetic */ IconUtils getMax;
        final /* synthetic */ GridLayoutManager setMin;

        setMax(GridLayoutManager gridLayoutManager, IconUtils iconUtils) {
            this.setMin = gridLayoutManager;
            this.getMax = iconUtils;
        }

        public final int getMin(int i) {
            int itemViewType = this.getMax.getItemViewType(i);
            if (itemViewType == -2 || itemViewType == -1 || itemViewType == 1) {
                return this.setMin.setMin;
            }
            return 1;
        }
    }

    public final void updateHomeMenus(int i) {
        if (this.getMin != null) {
            IconUtils iconUtils = this.getMin;
            if (iconUtils == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recipientSelectorAdapter");
            }
            if (iconUtils.isInside()) {
                IconUtils iconUtils2 = this.getMin;
                if (iconUtils2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recipientSelectorAdapter");
                }
                List<SendMoneyHomeMenuModel> list = this.setMax;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("menus");
                }
                iconUtils2.setMax.setMin(onProviderEnabled.getMax(list, i));
                setMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney_v2/landing/view/RecipientSelectorView$Companion;", "", "()V", "SPAN_SIZE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        ImageObserver.getMax getmax = new ImageObserver.getMax((byte) 0);
        if (r4 != null) {
            getmax.setMin = r4;
            getmax.getMin = new RecipientHomeModule(new length(this));
            stopIgnoring.setMin(getmax.getMin, RecipientHomeModule.class);
            stopIgnoring.setMin(getmax.setMin, PrepareException.AnonymousClass1.class);
            new ImageObserver(getmax.getMin, getmax.setMin, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            getModifiedTime.getMin getmin = this.recipientHomePresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recipientHomePresenter");
            }
            getminArr[0] = getmin;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public final void setup() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared);
        if (recyclerView != null) {
            IconUtils iconUtils = new IconUtils();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
            gridLayoutManager.toIntRange = new setMax(gridLayoutManager, iconUtils);
            recyclerView.setLayoutManager(gridLayoutManager);
            iconUtils.getMax((Ignore.setMin) new Relation(new getMax(iconUtils, recyclerView, this)));
            Function1<? super Boolean, Unit> tofloatrange = new toFloatRange(this);
            Intrinsics.checkNotNullParameter(tofloatrange, "<set-?>");
            iconUtils.getMax = tofloatrange;
            Unit unit = Unit.INSTANCE;
            this.getMin = iconUtils;
            if (iconUtils == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recipientSelectorAdapter");
            }
            recyclerView.setAdapter(iconUtils);
        }
        ShowMoreView showMoreView = (ShowMoreView) _$_findCachedViewById(resetInternal.setMax.getInternalPopup);
        if (showMoreView != null) {
            showMoreView.setOnClickListener(new toIntRange(this));
        }
        getModifiedTime.getMin getmin = this.recipientHomePresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientHomePresenter");
        }
        getmin.setMin();
    }

    public static final /* synthetic */ void access$onRecyclerViewExpanded(RecipientSelectorView recipientSelectorView, boolean z) {
        ViewParent parent = recipientSelectorView.getParent();
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
        ShowMoreView showMoreView = (ShowMoreView) recipientSelectorView._$_findCachedViewById(resetInternal.setMax.getInternalPopup);
        if (showMoreView != null) {
            showMoreView.setExpanded(z);
        }
    }
}
