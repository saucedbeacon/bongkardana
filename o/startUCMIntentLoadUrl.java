package o;

import id.dana.model.QrisCrossBorderContentModel;
import kotlin.Metadata;
import o.onDelete;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/qriscrossborder/QrisCrossBorderContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface startUCMIntentLoadUrl {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/qriscrossborder/QrisCrossBorderContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "getQrisCrossBorderLocation", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends onDelete.getMin {
        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/qriscrossborder/QrisCrossBorderContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onCountryCodeNotSupportedOrSimilar", "", "onQrisCrossBorderContent", "qcbContentModel", "Lid/dana/model/QrisCrossBorderContentModel;", "countryCode", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin extends parentColumns.getMax {
        void getMin(@NotNull QrisCrossBorderContentModel qrisCrossBorderContentModel, @NotNull String str);

        void setMax();
    }
}
