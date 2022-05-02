package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fH\u0002J\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u0017\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureSplitBill;", "", "getSplitBillConfig", "Lid/dana/domain/featureconfig/interactor/GetSplitBillConfig;", "getRequestMoneyInfoFeature", "Lid/dana/domain/featureconfig/interactor/GetRequestMoneyInfoFeature;", "requestMoneyInfoModelMapper", "Lid/dana/requestmoney/mapper/RequestMoneyInfoModelMapper;", "(Lid/dana/domain/featureconfig/interactor/GetSplitBillConfig;Lid/dana/domain/featureconfig/interactor/GetRequestMoneyInfoFeature;Lid/dana/requestmoney/mapper/RequestMoneyInfoModelMapper;)V", "checkIfTheresAmountOnParam", "", "params", "", "disposeUseCases", "", "getSplitBillAmountConfig", "amount", "", "maximumPayers", "", "callback", "Lid/dana/contract/deeplink/path/FeatureSplitBill$Callback;", "handleSplitBillPage", "openSplitBillPage", "Callback", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getPropagation {
    final u getMin;
    final canGoBackOrForward length;
    final setNetworkAvailable setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureSplitBill$Callback;", "", "openSplitBillIntroductionPage", "", "openSplitBillPage", "requestMoneyInfoModel", "Lid/dana/requestmoney/model/RequestMoneyInfoModel;", "amountValue", "", "maxSplitBillRecipient", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax {
        void length();

        void length(@NotNull access$2900 access_2900, long j, int i);
    }

    @Inject
    public getPropagation(@NotNull canGoBackOrForward cangobackorforward, @NotNull setNetworkAvailable setnetworkavailable, @NotNull u uVar) {
        Intrinsics.checkNotNullParameter(cangobackorforward, "getSplitBillConfig");
        Intrinsics.checkNotNullParameter(setnetworkavailable, "getRequestMoneyInfoFeature");
        Intrinsics.checkNotNullParameter(uVar, "requestMoneyInfoModelMapper");
        this.length = cangobackorforward;
        this.setMin = setnetworkavailable;
        this.getMin = uVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/deeplink/path/FeatureSplitBill$getSplitBillConfig$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/featureconfig/model/SplitBillConfig;", "onError", "", "e", "", "onNext", "splitBillConfig", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<onTooManyRedirects> {
        final /* synthetic */ getMax length;
        final /* synthetic */ getPropagation setMax;
        final /* synthetic */ long setMin;

        setMin(getPropagation getpropagation, long j, getMax getmax) {
            this.setMax = getpropagation;
            this.setMin = j;
            this.length = getmax;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onTooManyRedirects ontoomanyredirects = (onTooManyRedirects) obj;
            Intrinsics.checkNotNullParameter(ontoomanyredirects, "splitBillConfig");
            getPropagation getpropagation = this.setMax;
            long j = this.setMin;
            int maxRecipient = ontoomanyredirects.getMaxRecipient();
            getpropagation.setMin.execute(new setMax(getpropagation, this.length, j, maxRecipient));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.SPLIT_BILL_TAG, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/deeplink/path/FeatureSplitBill$getSplitBillAmountConfig$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/featureconfig/model/RequestMoneyInfo;", "onError", "", "e", "", "onNext", "requestMoneyInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<onReceivedError> {
        final /* synthetic */ getPropagation getMax;
        final /* synthetic */ int getMin;
        final /* synthetic */ getMax length;
        final /* synthetic */ long setMin;

        setMax(getPropagation getpropagation, getMax getmax, long j, int i) {
            this.getMax = getpropagation;
            this.length = getmax;
            this.setMin = j;
            this.getMin = i;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onReceivedError onreceivederror = (onReceivedError) obj;
            Intrinsics.checkNotNullParameter(onreceivederror, "requestMoneyInfo");
            getMax getmax = this.length;
            Object apply = this.getMax.getMin.apply(onreceivederror);
            Intrinsics.checkNotNullExpressionValue(apply, "requestMoneyInfoModelMap…r.apply(requestMoneyInfo)");
            getmax.length((access$2900) apply, this.setMin, this.getMin);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.SPLIT_BILL_TAG, sb.toString());
        }
    }
}
