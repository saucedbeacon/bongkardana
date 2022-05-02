package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/sendmoney/interactor/SaveSortingSendMoney;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/sendmoney/interactor/SaveSortingSendMoney$Param;", "sendMoneyRepository", "Lid/dana/domain/sendmoney/repository/SendMoneyRepository;", "(Lid/dana/domain/sendmoney/repository/SendMoneyRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class BeaconParser extends APWebChromeClient<Boolean, getMax> {
    private final fromInt sendMoneyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public BeaconParser(@NotNull fromInt fromint) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(fromint, "sendMoneyRepository");
        this.sendMoneyRepository = fromint;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        TitleBarRightButtonView.AnonymousClass1<Boolean> saveSortingSendMoney = this.sendMoneyRepository.saveSortingSendMoney(getmax.getSortedBy());
        Intrinsics.checkNotNullExpressionValue(saveSortingSendMoney, "sendMoneyRepository.save…endMoney(params.sortedBy)");
        return saveSortingSendMoney;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/domain/sendmoney/interactor/SaveSortingSendMoney$Param;", "", "sortedBy", "", "(Ljava/lang/String;)V", "getSortedBy", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final String sortedBy;

        public static /* synthetic */ getMax copy$default(getMax getmax, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmax.sortedBy;
            }
            return getmax.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.sortedBy;
        }

        @NotNull
        public final getMax copy(@NotNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1711490262, oncanceled);
                onCancelLoad.getMin(-1711490262, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "sortedBy");
            return new getMax(str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof getMax) && Intrinsics.areEqual((Object) this.sortedBy, (Object) ((getMax) obj).sortedBy);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.sortedBy;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(sortedBy=");
            sb.append(this.sortedBy);
            sb.append(")");
            return sb.toString();
        }

        public getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "sortedBy");
            this.sortedBy = str;
        }

        @NotNull
        public final String getSortedBy() {
            return this.sortedBy;
        }
    }

    public class BeaconLayoutException {
        private String bankAccountIndexNo;
        private String contactName;
        private String dateOfBirth;
        private String loginId;
        private String nickname;
        private String regId;
        private String userId;

        public String getBankAccountIndexNo() {
            return this.bankAccountIndexNo;
        }

        public void setBankAccountIndexNo(String str) {
            this.bankAccountIndexNo = str;
        }

        public String getContactName() {
            return this.contactName;
        }

        public void setContactName(String str) {
            this.contactName = str;
        }

        public String getLoginId() {
            return this.loginId;
        }

        public void setLoginId(String str) {
            this.loginId = str;
        }

        public String getRegId() {
            return this.regId;
        }

        public void setRegId(String str) {
            this.regId = str;
        }

        public String getUserId() {
            return this.userId;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        public String getNickname() {
            return this.nickname;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public String getDateOfBirth() {
            return this.dateOfBirth;
        }

        public void setDateOfBirth(String str) {
            this.dateOfBirth = str;
        }
    }
}
