package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.social.workmanager.SaveContactFullSyncWorker;
import id.dana.splitbill.model.SplitBillHistoryModel;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import o.dumpBackgroundScanResultQueue;
import o.onDelete;

public final class AUNoticeDialog implements getBindingAdapter<SaveContactFullSyncWorker> {

    /* renamed from: o.AUNoticeDialog$1  reason: invalid class name */
    public interface AnonymousClass1 {

        /* renamed from: o.AUNoticeDialog$1$getMax */
        public interface getMax extends onDelete.length {
            void hideSplitBillHistories();

            void onSuccessGetAccount(GriverCommonResourceProxy griverCommonResourceProxy);

            void onSuccessGetSplitBillHistory(List<setLastScanStartTimeMillis> list);
        }

        /* renamed from: o.AUNoticeDialog$1$setMax */
        public interface setMax extends onDelete.getMin {
            void length();

            void setMin();
        }
    }

    /* renamed from: o.AUNoticeDialog$2  reason: invalid class name */
    public interface AnonymousClass2 {

        /* renamed from: o.AUNoticeDialog$2$setMax */
        public interface setMax extends onDelete.getMin {
            void length(String str);

            void length(List<String> list, String str);
        }

        /* renamed from: o.AUNoticeDialog$2$setMin */
        public interface setMin extends onDelete.length {
            void getMin();

            void getMin(SplitBillHistoryModel splitBillHistoryModel);

            void setMin(boolean z);
        }
    }

    public interface OnClickNegativeListener {

        public interface setMax extends onDelete.length {
            void setMin(GriverCommonResourceProxy griverCommonResourceProxy);
        }

        public interface setMin extends onDelete.getMin {
            void getMin();
        }
    }

    @InjectedFieldSignature("id.dana.social.workmanager.SaveContactFullSyncWorker.syncRunner")
    @Named("recurringfullsync")
    public static void setMax(SaveContactFullSyncWorker saveContactFullSyncWorker, findCalculatorForModelWithLock findcalculatorformodelwithlock) {
        saveContactFullSyncWorker.syncRunner = findcalculatorformodelwithlock;
    }

    public final class OnClickPositiveListener implements AnonymousClass1.setMax {
        private final AppStatus getMax;
        /* access modifiers changed from: private */
        public final AnonymousClass1.getMax length;
        private final dumpBackgroundScanResultQueue setMin;

        @Inject
        public OnClickPositiveListener(AnonymousClass1.getMax getmax, dumpBackgroundScanResultQueue dumpbackgroundscanresultqueue, AppStatus appStatus) {
            this.length = getmax;
            this.setMin = dumpbackgroundscanresultqueue;
            this.getMax = appStatus;
        }

        public final void length() {
            this.length.showProgress();
            this.setMin.execute(new GriverAppVirtualHostProxy<List<setLastScanStartTimeMillis>>() {
                public final /* synthetic */ void onNext(Object obj) {
                    OnClickPositiveListener.this.length.dismissProgress();
                    OnClickPositiveListener.this.length.onSuccessGetSplitBillHistory((List) obj);
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    OnClickPositiveListener.this.length.hideSplitBillHistories();
                    updateActionSheetContent.logNetworkException(DanaLogConstants.ExceptionType.SPLIT_BILL_EXCEPTION, DanaLogConstants.Prefix.GET_SPLIT_BILL_HISTORIES_PREFIX, th);
                }
            }, dumpBackgroundScanResultQueue.length.forPageNum(1));
        }

        public final void setMin() {
            this.getMax.execute(new GriverAppVirtualHostProxy<GriverCommonResourceProxy>() {
                public final /* synthetic */ void onNext(Object obj) {
                    OnClickPositiveListener.this.length.onSuccessGetAccount((GriverCommonResourceProxy) obj);
                }
            });
        }

        public final void setMax() {
            this.setMin.dispose();
            this.getMax.dispose();
        }
    }
}
