package id.dana.nearbyrevamp.merchantfilter;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.chip.Chip;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.nearbyme.MerchantViewType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CornerMarkingDataProvider;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.IntRange;
import o.g;
import o.getAppIdList;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u0003456B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u0003J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u0005H\u0002J\u0016\u0010%\u001a\u00020\u00162\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0003H\u0002J\u001c\u0010(\u001a\u00020\u00162\n\u0010)\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001fH\u0016J\b\u0010.\u001a\u00020\u0016H\u0002J\u0016\u0010/\u001a\u00020\u00162\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J\u000e\u00101\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u0003R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter$MerchantCategoryViewHolder;", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "withDefaultCategory", "", "(Z)V", "checkedItems", "", "getCheckedItems", "()Ljava/util/Set;", "defaultItem", "kotlin.jvm.PlatformType", "getDefaultItem", "()Lid/dana/nearbyme/model/MerchantCategoryModel;", "onCategoryCheckedListener", "Lid/dana/nearbyme/OnCategoryCheckedListener;", "originalItems", "", "getOriginalItems", "()Ljava/util/List;", "checkIfCheckedCategoriesValid", "", "categories", "", "clearSelectedItems", "getCategoriesById", "categoryId", "", "getItem", "position", "", "getItemCount", "getItemPosition", "category", "getItemViewType", "hasDefaultCheckedItem", "invokeListener", "merchantCategoryModels", "moveSelectedItemsToFront", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "restoreCategoryPosition", "setItems", "items", "setOnCategoryCheckedListener", "setSelectedItem", "merchantCategory", "DefaultSelectedMerchantCategoryViewHolder", "MerchantCategoryViewHolder", "MerchantCategoryViewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NewMerchantCategoryAdapter extends IMultiInstanceInvalidationCallback.Stub<getMax, g.AnonymousClass1> {
    /* access modifiers changed from: private */
    public final boolean getMax;
    @NotNull
    final List<g.AnonymousClass1> getMin = new ArrayList();
    @NotNull
    final Set<g.AnonymousClass1> length = new LinkedHashSet();
    /* access modifiers changed from: package-private */
    public getAppIdList setMax;
    final g.AnonymousClass1 setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<g.AnonymousClass1, Boolean> {
        final /* synthetic */ List $categories;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(List list) {
            super(1);
            this.$categories = list;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((g.AnonymousClass1) obj));
        }

        public final boolean invoke(@NotNull g.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "it");
            return !this.$categories.contains(r2);
        }
    }

    public final /* synthetic */ void getMax(Ignore ignore, int i) {
        getMax getmax = (getMax) ignore;
        Intrinsics.checkNotNullParameter(getmax, "holder");
        super.onBindViewHolder(getmax, i);
        getmax.setMax(setMin(i));
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        getMax getmax = (getMax) valueof;
        Intrinsics.checkNotNullParameter(getmax, "holder");
        super.onBindViewHolder(getmax, i);
        getmax.setMax(setMin(i));
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        getMax getmax;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == MerchantCategoryViewType.DEFAULT_SELECTED_CATEGORY.invoke()) {
            getmax = new getMin(this, viewGroup);
        } else if (i == MerchantCategoryViewType.NORMAL_TYPE_CATEGORY.invoke()) {
            getmax = new getMax(this, viewGroup);
        } else {
            getmax = new getMax(this, viewGroup);
        }
        return getmax;
    }

    public NewMerchantCategoryAdapter(boolean z) {
        this.getMax = z;
        g.AnonymousClass1 r3 = g.AnonymousClass1.setMin;
        this.setMin = r3;
        if (this.getMax) {
            Set<g.AnonymousClass1> set = this.length;
            Intrinsics.checkNotNullExpressionValue(r3, "defaultItem");
            set.add(r3);
        }
    }

    public final void getMin(@NotNull List<g.AnonymousClass1> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.getMin.clear();
        this.getMin.addAll(list);
        if (!this.length.contains(this.setMin) && this.length.size() > 0) {
            list.removeAll(this.length);
            list.addAll(0, this.length);
        }
        super.getMin(list);
    }

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: setMax */
    public g.AnonymousClass1 setMin(int i) {
        if (this.getMax) {
            return i == 0 ? this.setMin : (g.AnonymousClass1) super.setMin(i - 1);
        }
        return (g.AnonymousClass1) super.setMin(i);
    }

    public final int getItemViewType(int i) {
        if (setMin(i) == this.setMin) {
            return MerchantCategoryViewType.DEFAULT_SELECTED_CATEGORY.invoke();
        }
        return MerchantCategoryViewType.NORMAL_TYPE_CATEGORY.invoke();
    }

    public final int getItemCount() {
        return super.getItemCount() + (setMin() ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin() {
        return this.setMin != null && this.getMax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001e\u0010\u0016\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\f\u0010\u001a\u001a\u00020\u0011*\u00020\u0002H\u0003J\f\u0010\u001b\u001a\u00020\u0011*\u00020\u0002H\u0003R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter$MerchantCategoryViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "parent", "Landroid/view/ViewGroup;", "(Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter;Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "", "data", "getOnClickListener", "Landroid/view/View$OnClickListener;", "category", "getSelectorDrawable", "Landroid/graphics/drawable/StateListDrawable;", "defaultIconRes", "", "checkedIconRes", "handleCheckedItem", "checked", "", "invokeListener", "merchantCategoryModels", "", "invokeOnClickListener", "getCheckedIcon", "getUncheckedIcon", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public class getMax extends Ignore<g.AnonymousClass1> {
        final /* synthetic */ NewMerchantCategoryAdapter getMin;
        @NotNull
        private final ViewGroup setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(@NotNull NewMerchantCategoryAdapter newMerchantCategoryAdapter, ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_merchant_category, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            this.getMin = newMerchantCategoryAdapter;
            this.setMin = viewGroup;
        }

        /* renamed from: getMin */
        public final void setMax(@Nullable g.AnonymousClass1 r8) {
            if (r8 != null) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                Chip chip = (Chip) view.findViewById(resetInternal.setMax.getVolumeAttributes);
                if (chip != null) {
                    chip.setChecked(this.getMin.length.contains(r8));
                    chip.setText(r8.getMin);
                    int min = setMin(r8);
                    int length2 = length(r8);
                    if (Intrinsics.areEqual((Object) r8.getMax, (Object) MerchantViewType.MERCHANT_CAT_DANA_BISNIS) || length2 == 0) {
                        Chip chip2 = (Chip) chip.findViewById(resetInternal.setMax.getVolumeAttributes);
                        Intrinsics.checkNotNullExpressionValue(chip2, "chip");
                        chip2.setChipIconVisible(false);
                    } else if (!(length2 == 0 || min == 0)) {
                        View view2 = chip;
                        Chip chip3 = (Chip) view2.findViewById(resetInternal.setMax.getVolumeAttributes);
                        Intrinsics.checkNotNullExpressionValue(chip3, "chip");
                        chip3.setChipIconVisible(true);
                        Chip chip4 = (Chip) view2.findViewById(resetInternal.setMax.getVolumeAttributes);
                        Intrinsics.checkNotNullExpressionValue(chip4, "chip");
                        chip4.setChipIcon(setMin(length2, min));
                    }
                    chip.setOnClickListener(new length(this, r8));
                }
            }
        }

        @DrawableRes
        private final int length(g.AnonymousClass1 r3) {
            StringBuilder sb = new StringBuilder("ic_");
            sb.append(r3.getMax);
            sb.append("_unchecked");
            String obj = sb.toString();
            Context context = this.length;
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            return CornerMarkingDataProvider.AnonymousClass3.length(context, obj);
        }

        @DrawableRes
        private final int setMin(g.AnonymousClass1 r3) {
            StringBuilder sb = new StringBuilder("ic_");
            sb.append(r3.getMax);
            sb.append("_checked");
            String obj = sb.toString();
            Context context = this.length;
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            return CornerMarkingDataProvider.AnonymousClass3.length(context, obj);
        }

        private final StateListDrawable setMin(int i, int i2) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842912}, IntRange.length(this.length, i2));
            stateListDrawable.addState(new int[0], IntRange.length(this.length, i));
            return stateListDrawable;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, k = 3, mv = {1, 4, 2})
        static final class length implements View.OnClickListener {
            final /* synthetic */ getMax getMax;
            final /* synthetic */ g.AnonymousClass1 getMin;

            length(getMax getmax, g.AnonymousClass1 r2) {
                this.getMax = getmax;
                this.getMin = r2;
            }

            public final void onClick(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, SecurityConstants.KEY_VALUE);
                boolean isChecked = ((Chip) view).isChecked();
                this.getMax.getMax(this.getMin, isChecked);
                getMax.getMax(this.getMax, this.getMin);
                getMax.setMax(this.getMax, new ArrayList(this.getMax.getMin.length), isChecked);
            }
        }

        public void getMax(@NotNull g.AnonymousClass1 r2, boolean z) {
            Intrinsics.checkNotNullParameter(r2, "category");
            if (z) {
                this.getMin.getMax(r2);
            } else {
                this.getMin.length.remove(r2);
                if (this.getMin.length.isEmpty() && this.getMin.getMax) {
                    Set<g.AnonymousClass1> set = this.getMin.length;
                    g.AnonymousClass1 r3 = this.getMin.setMin;
                    Intrinsics.checkNotNullExpressionValue(r3, "defaultItem");
                    set.add(r3);
                }
                NewMerchantCategoryAdapter.getMax(this.getMin);
            }
            this.getMin.notifyDataSetChanged();
        }

        public static final /* synthetic */ void getMax(getMax getmax, g.AnonymousClass1 r1) {
            getAppIdList length2 = getmax.getMin.setMax;
            if (length2 != null) {
                length2.onCategoryClick(r1);
            }
        }

        public static final /* synthetic */ void setMax(getMax getmax, List list, boolean z) {
            getAppIdList length2 = getmax.getMin.setMax;
            if (length2 != null) {
                length2.length(list, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax(g.AnonymousClass1 r3) {
        this.length.add(r3);
        if (this.length.contains(this.setMin)) {
            this.length.remove(this.setMin);
        }
        getMax().remove(r3);
        getMax().add(this.length.size() - 1, r3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter$DefaultSelectedMerchantCategoryViewHolder;", "Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter$MerchantCategoryViewHolder;", "Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter;", "parent", "Landroid/view/ViewGroup;", "(Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter;Landroid/view/ViewGroup;)V", "handleCheckedItem", "", "category", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "checked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class getMin extends getMax {
        final /* synthetic */ NewMerchantCategoryAdapter setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(@NotNull NewMerchantCategoryAdapter newMerchantCategoryAdapter, ViewGroup viewGroup) {
            super(newMerchantCategoryAdapter, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            this.setMin = newMerchantCategoryAdapter;
        }

        public final void getMax(@NotNull g.AnonymousClass1 r2, boolean z) {
            Intrinsics.checkNotNullParameter(r2, "category");
            if (z) {
                this.setMin.length.clear();
                this.setMin.length.add(r2);
                this.setMin.getMax().clear();
                this.setMin.getMax().addAll(this.setMin.getMin);
            } else if (this.setMin.length.isEmpty() && this.setMin.getMax) {
                this.setMin.length.add(r2);
            }
            this.setMin.notifyDataSetChanged();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter$MerchantCategoryViewType;", "", "type", "", "(Ljava/lang/String;II)V", "invoke", "DEFAULT_SELECTED_CATEGORY", "NORMAL_TYPE_CATEGORY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum MerchantCategoryViewType {
        DEFAULT_SELECTED_CATEGORY(0),
        NORMAL_TYPE_CATEGORY(1);
        
        private final int type;

        private MerchantCategoryViewType(int i) {
            this.type = i;
        }

        public final int invoke() {
            return this.type;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6.getMax)) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void getMax(id.dana.nearbyrevamp.merchantfilter.NewMerchantCategoryAdapter r8) {
        /*
            java.util.List<o.g$1> r0 = r8.getMin
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "defaultItem"
            r4 = 1
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r0.next()
            r5 = r2
            o.g$1 r5 = (o.g.AnonymousClass1) r5
            java.util.Set<o.g$1> r6 = r8.length
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L_0x0038
            java.lang.String r5 = r5.getMax
            o.g$1 r6 = r8.setMin
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            java.lang.String r3 = r6.getMax
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r3)
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            if (r4 == 0) goto L_0x000f
            r1.add(r2)
            goto L_0x000f
        L_0x003f:
            java.util.List r1 = (java.util.List) r1
            java.util.Set<o.g$1> r0 = r8.length
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r0 = r0.iterator()
        L_0x0050:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0071
            java.lang.Object r5 = r0.next()
            r6 = r5
            o.g$1 r6 = (o.g.AnonymousClass1) r6
            java.lang.String r6 = r6.getMax
            o.g$1 r7 = r8.setMin
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
            java.lang.String r7 = r7.getMax
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x0050
            r2.add(r5)
            goto L_0x0050
        L_0x0071:
            java.util.List r2 = (java.util.List) r2
            java.util.List r0 = r8.getMax()
            r0.clear()
            java.util.List r0 = r8.getMax()
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
            java.util.List r0 = r8.getMax()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r8.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.merchantfilter.NewMerchantCategoryAdapter.getMax(id.dana.nearbyrevamp.merchantfilter.NewMerchantCategoryAdapter):void");
    }
}
