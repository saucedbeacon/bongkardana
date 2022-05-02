package o;

import id.dana.savings.model.SavingModel;
import id.dana.sendmoney.model.RecipientModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import o.SightCameraTextureView;
import o.onDelete;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

public interface CameraView {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/savings/contract/SavingUpdateContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.CameraView$1  reason: invalid class name */
    public interface AnonymousClass1 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J(\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/savings/contract/SavingUpdateContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getKycStatus", "", "initUpdateSaving", "savingId", "", "updateSaving", "categoryCode", "title", "targetAmount", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.CameraView$1$getMax */
        public interface getMax extends parentColumns.setMin {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/savings/contract/SavingUpdateContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetKycStatus", "", "isKyc", "", "onInitUpdateSaving", "savingUpdateInitModel", "Lid/dana/savings/model/SavingUpdateInitModel;", "onUpdateSaving", "savingModel", "Lid/dana/savings/model/SavingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.CameraView$1$getMin */
        public interface getMin extends parentColumns.getMax {
            void length(boolean z);

            void setMax(@NotNull SavingModel savingModel);

            void setMax(@NotNull SightCameraTextureView.AnonymousClass1 r1);
        }
    }

    public interface length {
        void getMax(List<RecipientModel> list);
    }

    public interface setMin extends onDelete.getMin {
        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002¨\u0006\u000b"}, d2 = {"getAmountPercentage", "", "Lid/dana/savings/model/SavingModel;", "getDisplayDetailAmountPercentage", "getIconBasedOnCompletion", "", "getSavingLevel", "", "getSavingLevelByAmount", "isAchieved", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    public final class WrapperListener {
        public static final int getMax(@NotNull SavingModel savingModel) {
            Intrinsics.checkNotNullParameter(savingModel, "$this$getSavingLevel");
            Intrinsics.checkNotNullParameter(savingModel, "$this$getAmountPercentage");
            String cleanAll = isOriginHasAppInfo.getCleanAll(savingModel.length.setMin);
            String str = "0";
            if (cleanAll == null) {
                cleanAll = str;
            }
            Long longOrNull = StringsKt.toLongOrNull(cleanAll);
            long j = 0;
            long longValue = (longOrNull != null ? longOrNull.longValue() : 0) * 100;
            String cleanAll2 = isOriginHasAppInfo.getCleanAll(savingModel.setMax.setMin);
            if (cleanAll2 != null) {
                str = cleanAll2;
            }
            Long longOrNull2 = StringsKt.toLongOrNull(str);
            if (longOrNull2 != null) {
                j = longOrNull2.longValue();
            }
            int roundToInt = MathKt.roundToInt((double) (longValue / j));
            if (roundToInt == 100) {
                return 5;
            }
            if (76 <= roundToInt && 99 >= roundToInt) {
                return 4;
            }
            if (51 <= roundToInt && 75 >= roundToInt) {
                return 3;
            }
            return (26 <= roundToInt && 50 >= roundToInt) ? 2 : 1;
        }

        public static final boolean getMin(@NotNull SavingModel savingModel) {
            Intrinsics.checkNotNullParameter(savingModel, "$this$isAchieved");
            return Intrinsics.areEqual((Object) savingModel.setMax.setMin, (Object) savingModel.length.setMin);
        }

        @NotNull
        public static final String length(@NotNull SavingModel savingModel) {
            Intrinsics.checkNotNullParameter(savingModel, "$this$getSavingLevelByAmount");
            String cleanAll = isOriginHasAppInfo.getCleanAll(savingModel.setMax.setMin);
            if (cleanAll == null) {
                cleanAll = "0";
            }
            Long longOrNull = StringsKt.toLongOrNull(cleanAll);
            long longValue = longOrNull != null ? longOrNull.longValue() : 0;
            if (longValue == 10000000) {
                return "5";
            }
            if (7600000 <= longValue && 9999999 >= longValue) {
                return "4";
            }
            if (5100000 <= longValue && 7599999 >= longValue) {
                return "3";
            }
            return (2600000 <= longValue && 5099999 >= longValue) ? "2" : "1";
        }
    }
}
