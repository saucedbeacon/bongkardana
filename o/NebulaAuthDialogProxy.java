package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.WorkerManagerExtension;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/kycrenewal/KycRenewalContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface NebulaAuthDialogProxy {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/kycrenewal/KycRenewalContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onCheckKycRenewalRequired", "", "timeStamp", "", "queryKYCRenewalStatusResponseModel", "Lid/dana/kycrenewal/model/QueryKYCRenewalStatusResponseModel;", "onClickUpdate", "count", "", "onShowForceKycRenewalDialog", "onShowKycRenewalDialog", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax extends parentColumns.getMax {
        void getMin(int i);

        void length();

        void setMax();

        void setMax(@NotNull WorkerManagerExtension.AnonymousClass1 r1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/kycrenewal/KycRenewalContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "checkKycRenewalRequired", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.setMin {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/kycamledd/model/EddSubmitInfoModel;", "", "amlOrderId", "", "eddSubmitInfoDtoModels", "", "Lid/dana/kycamledd/model/EddSubmitInfoDTOModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getAmlOrderId", "()Ljava/lang/String;", "getEddSubmitInfoDtoModels", "()Ljava/util/List;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.NebulaAuthDialogProxy$1  reason: invalid class name */
    public final class AnonymousClass1 {
        @NotNull
        public final String getMin;
        @NotNull
        public final List<AnonymousClass2> setMin;

        public AnonymousClass1() {
            this((byte) 0);
        }

        public AnonymousClass1(@NotNull String str, @NotNull List<AnonymousClass2> list) {
            Intrinsics.checkNotNullParameter(str, "amlOrderId");
            Intrinsics.checkNotNullParameter(list, "eddSubmitInfoDtoModels");
            this.getMin = str;
            this.setMin = list;
        }

        private /* synthetic */ AnonymousClass1(byte b) {
            this("", CollectionsKt.emptyList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/kycamledd/model/EddSubmitInfoDTOModel;", "", "questionId", "", "answerId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnswerId", "()Ljava/lang/String;", "getQuestionId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.NebulaAuthDialogProxy$2  reason: invalid class name */
    public final class AnonymousClass2 {
        @NotNull
        public final String length;
        @NotNull
        public final String setMax;

        public AnonymousClass2() {
            this((byte) 0);
        }

        public AnonymousClass2(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "questionId");
            Intrinsics.checkNotNullParameter(str2, "answerId");
            this.setMax = str;
            this.length = str2;
        }

        private /* synthetic */ AnonymousClass2(byte b) {
            this("", "");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"toEddSubmitInfo", "Lid/dana/domain/kycamledd/model/EddSubmitInfo;", "Lid/dana/kycamledd/model/EddSubmitInfoModel;", "toEddSubmitInfoDTO", "Lid/dana/domain/kycamledd/model/EddSubmitInfoDTO;", "Lid/dana/kycamledd/model/EddSubmitInfoDTOModel;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.NebulaAuthDialogProxy$3  reason: invalid class name */
    public final class AnonymousClass3 {
        @NotNull
        public static final runTask setMax(@NotNull AnonymousClass1 r5) {
            Intrinsics.checkNotNullParameter(r5, "$this$toEddSubmitInfo");
            String str = r5.getMin;
            Iterable<AnonymousClass2> iterable = r5.setMin;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (AnonymousClass2 r2 : iterable) {
                Intrinsics.checkNotNullParameter(r2, "$this$toEddSubmitInfoDTO");
                arrayList.add(new GriverExecutors(r2.setMax, r2.length));
            }
            return new runTask(str, (List) arrayList);
        }
    }
}
