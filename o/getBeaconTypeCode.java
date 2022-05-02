package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/requestmoney/interactor/SaveNameCheckCount;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/requestmoney/interactor/SaveNameCheckCount$Param;", "requestMoneyRepository", "Lid/dana/domain/requestmoney/RequestMoneyRepository;", "(Lid/dana/domain/requestmoney/RequestMoneyRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getBeaconTypeCode extends APWebChromeClient<Boolean, setMax> {
    private final getId3 requestMoneyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getBeaconTypeCode(@NotNull getId3 getid3) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getid3, "requestMoneyRepository");
        this.requestMoneyRepository = getid3;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.requestMoneyRepository.setNameCheckCount(setmax.getCount());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/domain/requestmoney/interactor/SaveNameCheckCount$Param;", "", "count", "", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private final int count;

        public static /* synthetic */ setMax copy$default(setMax setmax, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = setmax.count;
            }
            return setmax.copy(i);
        }

        public final int component1() {
            return this.count;
        }

        @NotNull
        public final setMax copy(int i) {
            return new setMax(i);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMax) && this.count == ((setMax) obj).count;
            }
            return true;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(count=");
            sb.append(this.count);
            sb.append(")");
            return sb.toString();
        }

        public setMax(int i) {
            this.count = i;
        }

        public final int getCount() {
            return this.count;
        }

        public final int hashCode() {
            return Integer.valueOf(this.count).hashCode();
        }
    }
}
