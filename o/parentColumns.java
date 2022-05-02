package o;

import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import o.onDelete;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/base/AbstractContractKt;", "Lid/dana/base/AbstractContract;", "AbstractPresenter", "AbstractView", "AuthenticatedAbstractView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface parentColumns extends onDelete {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0017J\b\u0010\u0007\u001a\u00020\u0003H\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/base/AbstractContractKt$AbstractView;", "Lid/dana/base/AbstractContract$AbstractView;", "dismissProgress", "", "onError", "errorMessage", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax extends onDelete.length {
        @JvmDefault
        void dismissProgress();

        @JvmDefault
        void onError(@Nullable String str);

        @JvmDefault
        void showProgress();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/base/AbstractContractKt$AbstractPresenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "onDestroy", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin extends onDelete.getMin {
        @JvmDefault
        void setMax();
    }
}
