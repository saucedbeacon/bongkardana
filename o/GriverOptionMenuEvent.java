package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/account/interactor/SaveLastTransaction;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/account/interactor/SaveLastTransaction$Params;", "accountRepository", "Lid/dana/domain/account/AccountRepository;", "(Lid/dana/domain/account/AccountRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverOptionMenuEvent extends APWebChromeClient<Boolean, getMin> {
    private final getCommonResources accountRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GriverOptionMenuEvent(@NotNull getCommonResources getcommonresources) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getcommonresources, "accountRepository");
        this.accountRepository = getcommonresources;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastTransaction = this.accountRepository.saveLastTransaction(getmin.getTransaction$domain_release());
        Intrinsics.checkNotNullExpressionValue(saveLastTransaction, "accountRepository.saveLa…ction(params.transaction)");
        return saveLastTransaction;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/account/interactor/SaveLastTransaction$Params;", "", "transaction", "Lid/dana/domain/account/model/Transaction;", "(Lid/dana/domain/account/model/Transaction;)V", "getTransaction$domain_release", "()Lid/dana/domain/account/model/Transaction;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
        @NotNull
        private final GriverOptionMenuPanelExtension transaction;

        @JvmStatic
        @NotNull
        public static final getMin lastTransaction(@NotNull String str, @NotNull String str2) {
            return Companion.lastTransaction(str, str2);
        }

        private getMin(GriverOptionMenuPanelExtension griverOptionMenuPanelExtension) {
            this.transaction = griverOptionMenuPanelExtension;
        }

        public /* synthetic */ getMin(GriverOptionMenuPanelExtension griverOptionMenuPanelExtension, DefaultConstructorMarker defaultConstructorMarker) {
            this(griverOptionMenuPanelExtension);
        }

        @NotNull
        public final GriverOptionMenuPanelExtension getTransaction$domain_release() {
            return this.transaction;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lid/dana/domain/account/interactor/SaveLastTransaction$Params$Companion;", "", "()V", "lastTransaction", "Lid/dana/domain/account/interactor/SaveLastTransaction$Params;", "type", "", "date", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMin {
            private setMin() {
            }

            public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final getMin lastTransaction(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "type");
                Intrinsics.checkNotNullParameter(str2, AppNode.AnonymousClass2.KEY_DATE);
                return new getMin(new GriverOptionMenuPanelExtension(str, str2), (DefaultConstructorMarker) null);
            }
        }
    }
}
