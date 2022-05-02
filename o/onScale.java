package o;

import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import id.dana.promocenter.model.PromoSectionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH$¨\u0006\u000e"}, d2 = {"Lid/dana/promocenter/viewholders/BasePromoCenterSectionViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/promocenter/model/PromoSectionModel;", "parent", "Landroid/view/ViewGroup;", "resource", "", "(Landroid/view/ViewGroup;I)V", "bindData", "", "data", "handleState", "state", "Lid/dana/promocenter/model/PromoSectionModel$State;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class onScale extends Ignore<PromoSectionModel> {
    /* access modifiers changed from: protected */
    public abstract void setMin(@NotNull PromoSectionModel.State state);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lid/dana/promocenter/model/PromoSectionModel$State;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class length<T> implements RedDotManager<PromoSectionModel.State> {
        final /* synthetic */ onScale setMin;

        length(onScale onscale) {
            this.setMin = onscale;
        }

        public final /* synthetic */ void accept(Object obj) {
            PromoSectionModel.State state = (PromoSectionModel.State) obj;
            onScale onscale = this.setMin;
            Intrinsics.checkNotNullExpressionValue(state, "state");
            onscale.setMin(state);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onScale(@NotNull ViewGroup viewGroup, @LayoutRes int i) {
        super(viewGroup.getContext(), i, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    /* renamed from: getMin */
    public void setMax(@NotNull PromoSectionModel promoSectionModel) {
        Intrinsics.checkNotNullParameter(promoSectionModel, "data");
        super.setMax(promoSectionModel);
        getMin(promoSectionModel.getMax.subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new length(this)));
    }
}
