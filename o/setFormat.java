package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.sendmoney.model.RecipientModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverRVResourcePresetImpl;
import o.ResourceDownloadType;
import o.setUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountPresenter;", "Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$Presenter;", "view", "Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$View;", "updateAndSaveRecentBank", "Lid/dana/domain/recentbank/interactor/SaveRecentBank;", "removeRecentSavedBank", "Lid/dana/domain/recentbank/interactor/RemoveRecentSavedBank;", "(Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$View;Lid/dana/domain/recentbank/interactor/SaveRecentBank;Lid/dana/domain/recentbank/interactor/RemoveRecentSavedBank;)V", "onDestroy", "", "removeRecentBankName", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "toRecentBankRecipient", "Lid/dana/domain/recentrecipient/model/RecentBankRecipient;", "updateRecentBankName", "aliasBankNameUpdated", "", "isUndo", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setFormat implements setUnit.getMin {
    @NotNull
    public static final setMin length = new setMin((byte) 0);
    private final ResourceDownloadType getMax;
    /* access modifiers changed from: private */
    public final setUnit.setMin getMin;
    private final GriverRVResourcePresetImpl setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setFormat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(setFormat setformat) {
            super(1);
            this.this$0 = setformat;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.getMin.equals();
            StringBuilder sb = new StringBuilder();
            sb.append(this.this$0.getClass().getName());
            sb.append(", on Error: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ setFormat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(setFormat setformat) {
            super(1);
            this.this$0 = setformat;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.getMin.toIntRange();
        }
    }

    @Inject
    public setFormat(@NotNull setUnit.setMin setmin, @NotNull ResourceDownloadType resourceDownloadType, @NotNull GriverRVResourcePresetImpl griverRVResourcePresetImpl) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(resourceDownloadType, "updateAndSaveRecentBank");
        Intrinsics.checkNotNullParameter(griverRVResourcePresetImpl, "removeRecentSavedBank");
        this.getMin = setmin;
        this.getMax = resourceDownloadType;
        this.setMin = griverRVResourcePresetImpl;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountPresenter$updateRecentBankName$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ boolean getMin;
        final /* synthetic */ setFormat length;

        getMin(setFormat setformat, boolean z) {
            this.length = setformat;
            this.getMin = z;
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.length.getMin.equals();
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(", on Error: ");
            sb.append(th);
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, sb.toString());
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (this.getMin) {
                this.length.getMin.isInside();
            } else {
                this.length.getMin.toFloatRange();
            }
        }
    }

    public final void getMin(@NotNull RecipientModel recipientModel, @Nullable String str, boolean z) {
        RecipientModel recipientModel2 = recipientModel;
        Intrinsics.checkNotNullParameter(recipientModel2, "recipientModel");
        ResourceDownloadType resourceDownloadType = this.getMax;
        String length2 = recipientModel.length();
        String str2 = recipientModel2.length;
        String str3 = recipientModel2.isInside;
        String max = recipientModel.getMax();
        String min = recipientModel.getMin();
        String str4 = recipientModel2.length;
        String str5 = recipientModel2.toIntRange;
        String str6 = recipientModel2.toFloatRange;
        String str7 = recipientModel2.equals;
        String str8 = recipientModel2.onMessageChannelReady;
        String str9 = recipientModel2.isInside;
        String str10 = recipientModel2.onRelationshipValidationResult;
        int i = recipientModel2.FastBitmap$CoordinateSystem;
        String str11 = str10;
        setGlobalUserData getmin = new getMin(this, z);
        ResourceDownloadType resourceDownloadType2 = resourceDownloadType;
        resourceDownloadType2.execute(getmin, ResourceDownloadType.setMax.forUpdateRecentBankName(length2, str2, str3, max, str, min, str4, str5, str6, str7, str8, str9, str11, i, Long.valueOf(recipientModel2.setMax), recipientModel.toFloatRange()));
    }

    public final void getMax(@NotNull RecipientModel recipientModel) {
        RecipientModel recipientModel2 = recipientModel;
        Intrinsics.checkNotNullParameter(recipientModel2, "recipientModel");
        GriverRVResourcePresetImpl griverRVResourcePresetImpl = this.setMin;
        GriverRVResourcePresetImpl.getMin.setMin setmin = GriverRVResourcePresetImpl.getMin.Companion;
        GriverRVResourcePresetImpl griverRVResourcePresetImpl2 = griverRVResourcePresetImpl;
        GriverFullLinkStageMonitor griverFullLinkStageMonitor = r4;
        GriverFullLinkStageMonitor griverFullLinkStageMonitor2 = new GriverFullLinkStageMonitor(recipientModel2.onTransact, recipientModel2.isInside, recipientModel.length(), recipientModel.getMax(), recipientModel2.setMin, recipientModel.getMin(), recipientModel2.length, recipientModel2.toIntRange, recipientModel2.toFloatRange, recipientModel2.equals, recipientModel2.onMessageChannelReady, recipientModel2.isInside, recipientModel2.onRelationshipValidationResult, recipientModel2.FastBitmap$CoordinateSystem, Long.valueOf(recipientModel2.setMax), recipientModel.toFloatRange());
        griverRVResourcePresetImpl2.execute(setmin.create(griverFullLinkStageMonitor), new setMax(this), new length(this));
    }

    public final void setMax() {
        this.getMax.dispose();
        this.setMin.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountPresenter$Companion;", "", "()V", "ON_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
