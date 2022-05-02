package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.savings.model.SavingCategoryModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0018\u0010 \u001a\u00020\n2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"H\u0016J\f\u0010#\u001a\u00020\n*\u00020\u0003H\u0002R7\u0010\u0005\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lid/dana/savings/adapter/CategoryAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/savings/viewholder/CategoryViewHolder;", "Lid/dana/savings/model/SavingCategoryModel;", "()V", "onItemSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "getOnItemSelected", "()Lkotlin/jvm/functions/Function1;", "setOnItemSelected", "(Lkotlin/jvm/functions/Function1;)V", "value", "selectedItem", "getSelectedItem", "()Lid/dana/savings/model/SavingCategoryModel;", "setSelectedItem", "(Lid/dana/savings/model/SavingCategoryModel;)V", "getItemByCategoryCode", "categoryCode", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "", "updateSelected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class notifyInfo extends IMultiInstanceInvalidationCallback.Stub<GriverImageLoadCallback, SavingCategoryModel> {
    @Nullable
    public SavingCategoryModel length;
    @NotNull
    public Function1<? super SavingCategoryModel, Unit> setMin = getMin.INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/savings/model/SavingCategoryModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<SavingCategoryModel, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final void invoke(@Nullable SavingCategoryModel savingCategoryModel) {
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SavingCategoryModel) obj);
            return Unit.INSTANCE;
        }
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new GriverImageLoadCallback(context, viewGroup);
    }

    public final void getMin(@Nullable List<SavingCategoryModel> list) {
        super.getMin(list);
        SavingCategoryModel savingCategoryModel = list != null ? (SavingCategoryModel) CollectionsKt.getOrNull(list, 0) : null;
        this.setMin.invoke(savingCategoryModel);
        this.length = savingCategoryModel;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: setMin */
    public void onBindViewHolder(@NotNull GriverImageLoadCallback griverImageLoadCallback, int i) {
        Intrinsics.checkNotNullParameter(griverImageLoadCallback, "holder");
        SavingCategoryModel savingCategoryModel = (SavingCategoryModel) setMin(i);
        if (savingCategoryModel != null) {
            savingCategoryModel.getMax = Intrinsics.areEqual((Object) this.length, (Object) savingCategoryModel);
        }
        griverImageLoadCallback.setMin(new setMin(this));
        super.onBindViewHolder(griverImageLoadCallback, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Ignore.setMin {
        final /* synthetic */ notifyInfo length;

        setMin(notifyInfo notifyinfo) {
            this.length = notifyinfo;
        }

        public final void length(int i) {
            notifyInfo notifyinfo = this.length;
            SavingCategoryModel savingCategoryModel = (SavingCategoryModel) notifyinfo.setMin(i);
            notifyinfo.setMin.invoke(savingCategoryModel);
            notifyinfo.length = savingCategoryModel;
            notifyinfo.notifyDataSetChanged();
        }
    }
}
