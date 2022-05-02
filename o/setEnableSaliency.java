package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.setPriority;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/sendmoney/bank/other/OtherBankAccountPresenter;", "Lid/dana/sendmoney/bank/other/OtherBankAccountContract$Presenter;", "view", "Lid/dana/sendmoney/bank/other/OtherBankAccountContract$View;", "getAllBiller", "Lid/dana/domain/sendmoney/interactor/GetAllBillerX2B;", "(Lid/dana/sendmoney/bank/other/OtherBankAccountContract$View;Lid/dana/domain/sendmoney/interactor/GetAllBillerX2B;)V", "checkBankAccount", "", "filteredPrefixs", "allBillers", "", "Lid/dana/domain/sendmoney/model/BillerX2B;", "instId", "", "getAllBillerX2B", "onDestroy", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class setEnableSaliency implements setPriority.getMin {
    @NotNull
    public static final setMin getMax = new setMin((byte) 0);
    public final addRangeNotifier length;
    private final setPriority.length setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setEnableSaliency this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(setEnableSaliency setenablesaliency) {
            super(1);
            this.this$0 = setenablesaliency;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            StringBuilder sb = new StringBuilder();
            sb.append(this.this$0.getClass().getName());
            sb.append(", on Error: ");
            sb.append(th);
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TO_BILLER_TAG, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/sendmoney/model/BillerX2B;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function1<List<? extends getExtraDataParsers>, Unit> {
        final /* synthetic */ String $instId;
        final /* synthetic */ setEnableSaliency this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(setEnableSaliency setenablesaliency, String str) {
            super(1);
            this.this$0 = setenablesaliency;
            this.$instId = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<getExtraDataParsers>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<getExtraDataParsers> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            setEnableSaliency.setMax(this.this$0, list, this.$instId);
        }
    }

    @Inject
    public setEnableSaliency(@NotNull setPriority.length length2, @NotNull addRangeNotifier addrangenotifier) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(addrangenotifier, "getAllBiller");
        this.setMax = length2;
        this.length = addrangenotifier;
    }

    public final void setMax() {
        this.length.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney/bank/other/OtherBankAccountPresenter$Companion;", "", "()V", "ON_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void setMax(setEnableSaliency setenablesaliency, List list, String str) {
        List arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        for (Object next : list) {
            if (StringsKt.contains$default((CharSequence) ((getExtraDataParsers) next).getInstId(), (CharSequence) str, false, 2, (Object) null)) {
                arrayList2.add(next);
            }
        }
        Iterable<getExtraDataParsers> iterable = (List) arrayList2;
        Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (getExtraDataParsers add : iterable) {
            arrayList3.add(Boolean.valueOf(arrayList.add(add)));
        }
        setenablesaliency.setMax.setMax(arrayList);
    }
}
