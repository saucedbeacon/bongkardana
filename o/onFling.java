package o;

import id.dana.data.bank.UserBankExistException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.bank.model.UserBank;
import id.dana.requestmoney.model.UserBankModel;
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
import o.publishImageAction;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0004\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0016\u0010\b\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/requestmoney/bank/UserBankPresenter;", "Lid/dana/requestmoney/bank/UserBankContract$Presenter;", "view", "Lid/dana/requestmoney/bank/UserBankContract$View;", "getMaxBankAccount", "Lid/dana/domain/featureconfig/interactor/GetMaxBankAccount;", "getUserBanks", "Lid/dana/domain/bank/interactor/GetUserBanks;", "saveUserBanks", "Lid/dana/domain/bank/interactor/SaveUserBanks;", "addUserBank", "Lid/dana/domain/bank/interactor/AddUserBank;", "deleteUserBank", "Lid/dana/domain/bank/interactor/DeleteUserBank;", "(Lid/dana/requestmoney/bank/UserBankContract$View;Lid/dana/domain/featureconfig/interactor/GetMaxBankAccount;Lid/dana/domain/bank/interactor/GetUserBanks;Lid/dana/domain/bank/interactor/SaveUserBanks;Lid/dana/domain/bank/interactor/AddUserBank;Lid/dana/domain/bank/interactor/DeleteUserBank;)V", "", "userBankModel", "Lid/dana/requestmoney/model/UserBankModel;", "getSavedUserBanks", "init", "onDestroy", "userBankModels", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onFling implements publishImageAction.setMin {
    private final GriverWebViewReceivedErrorExtension getMax;
    private final titleBarCreated getMin;
    private final pageAbnoraml isInside;
    private final getCertificate length;
    private final PageErrorPoint setMax;
    /* access modifiers changed from: private */
    public final publishImageAction.length setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ UserBankModel $userBankModel;
        final /* synthetic */ onFling this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(onFling onfling, UserBankModel userBankModel) {
            super(1);
            this.this$0 = onfling;
            this.$userBankModel = userBankModel;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.setMax(z, this.$userBankModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ onFling this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(onFling onfling) {
            super(1);
            this.this$0 = onfling;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.setMin(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Throwable, Unit> {
        public static final isInside INSTANCE = new isInside();

        isInside() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ onFling this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(onFling onfling) {
            super(1);
            this.this$0 = onfling;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.this$0.setMin.setMin(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ onFling this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(onFling onfling) {
            super(1);
            this.this$0 = onfling;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
            if (th instanceof UserBankExistException) {
                this.this$0.setMin.setMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<Throwable, Unit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/bank/model/UserBank;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<List<? extends UserBank>, Unit> {
        final /* synthetic */ onFling this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(onFling onfling) {
            super(1);
            this.this$0 = onfling;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<UserBank>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<UserBank> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            publishImageAction.length max = this.this$0.setMin;
            Intrinsics.checkNotNullParameter(list, "$this$toUserBankModels");
            Iterable<UserBank> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (UserBank userBank : iterable) {
                Intrinsics.checkNotNullParameter(userBank, "$this$toUserBankModel");
                arrayList.add(new UserBankModel(userBank.getBankAccountIndexNo(), userBank.getBankAccountHolderName(), userBank.getBankAccountFormattedMaskedNo(), userBank.getWithdrawInstId(), userBank.getWithdrawPayMethod(), userBank.getWithdrawPayOption(), userBank.getWithdrawInstLocalName()));
            }
            max.setMin((List<UserBankModel>) (List) arrayList);
        }
    }

    @Inject
    public onFling(@NotNull publishImageAction.length length2, @NotNull getCertificate getcertificate, @NotNull PageErrorPoint pageErrorPoint, @NotNull GriverWebViewReceivedErrorExtension griverWebViewReceivedErrorExtension, @NotNull titleBarCreated titlebarcreated, @NotNull pageAbnoraml pageabnoraml) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(getcertificate, "getMaxBankAccount");
        Intrinsics.checkNotNullParameter(pageErrorPoint, "getUserBanks");
        Intrinsics.checkNotNullParameter(griverWebViewReceivedErrorExtension, "saveUserBanks");
        Intrinsics.checkNotNullParameter(titlebarcreated, "addUserBank");
        Intrinsics.checkNotNullParameter(pageabnoraml, "deleteUserBank");
        this.setMin = length2;
        this.length = getcertificate;
        this.setMax = pageErrorPoint;
        this.getMax = griverWebViewReceivedErrorExtension;
        this.getMin = titlebarcreated;
        this.isInside = pageabnoraml;
    }

    public final void getMax() {
        this.setMax.execute(onReceivedIcon.INSTANCE, new toIntRange(this), isInside.INSTANCE);
    }

    public final void length(@NotNull UserBankModel userBankModel) {
        Intrinsics.checkNotNullParameter(userBankModel, "userBankModel");
        this.getMin.execute(access$2700.getMax(userBankModel), new getMin(this), new setMax(this));
    }

    public final void setMin(@NotNull UserBankModel userBankModel) {
        Intrinsics.checkNotNullParameter(userBankModel, "userBankModel");
        this.isInside.execute(access$2700.getMax(userBankModel), new getMax(this, userBankModel), setMin.INSTANCE);
    }

    public final void setMax() {
        this.length.dispose();
        this.setMax.dispose();
        this.getMax.dispose();
        this.getMin.dispose();
        this.isInside.dispose();
    }

    public final void getMin() {
        this.length.execute(onReceivedIcon.INSTANCE, new length(this), toFloatRange.INSTANCE);
        this.setMax.execute(onReceivedIcon.INSTANCE, new toIntRange(this), isInside.INSTANCE);
    }
}
