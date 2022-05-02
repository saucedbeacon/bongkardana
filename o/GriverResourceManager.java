package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverRVResourceManagerImpl;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface GriverResourceManager {
    TitleBarRightButtonView.AnonymousClass1<installPackage> getCategories(int i, int i2, boolean z);

    TitleBarRightButtonView.AnonymousClass1<GriverRVResourceManagerImpl.AnonymousClass1> getPromoAds(int i, double d, double d2);

    TitleBarRightButtonView.AnonymousClass1<resourceTypeMonitor> getPromoCategorizedList(saveConfiguration saveconfiguration);

    TitleBarRightButtonView.AnonymousClass1<GriverRVResourceManagerImpl.AnonymousClass3> getPromoList(int i, int i2, String str);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/promocode/model/PromoCode;", "", "needRetry", "", "prizeAwards", "", "Lid/dana/domain/promocode/model/PrizeAwardVO;", "(ZLjava/util/List;)V", "getNeedRetry", "()Z", "getPrizeAwards", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.GriverResourceManager$1  reason: invalid class name */
    public final class AnonymousClass1 {
        private final boolean needRetry;
        @NotNull
        private final List<AnonymousClass2.AnonymousClass1> prizeAwards;

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r0, boolean z, List<AnonymousClass2.AnonymousClass1> list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = r0.needRetry;
            }
            if ((i & 2) != 0) {
                list = r0.prizeAwards;
            }
            return r0.copy(z, list);
        }

        public final boolean component1() {
            return this.needRetry;
        }

        @NotNull
        public final List<AnonymousClass2.AnonymousClass1> component2() {
            return this.prizeAwards;
        }

        @NotNull
        public final AnonymousClass1 copy(boolean z, @NotNull List<AnonymousClass2.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "prizeAwards");
            return new AnonymousClass1(z, list);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass1)) {
                return false;
            }
            AnonymousClass1 r3 = (AnonymousClass1) obj;
            return this.needRetry == r3.needRetry && Intrinsics.areEqual((Object) this.prizeAwards, (Object) r3.prizeAwards);
        }

        public final int hashCode() {
            boolean z = this.needRetry;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            List<AnonymousClass2.AnonymousClass1> list = this.prizeAwards;
            return i + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PromoCode(needRetry=");
            sb.append(this.needRetry);
            sb.append(", prizeAwards=");
            sb.append(this.prizeAwards);
            sb.append(")");
            return sb.toString();
        }

        public AnonymousClass1(boolean z, @NotNull List<AnonymousClass2.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "prizeAwards");
            this.needRetry = z;
            this.prizeAwards = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final boolean getNeedRetry() {
            return this.needRetry;
        }

        @NotNull
        public final List<AnonymousClass2.AnonymousClass1> getPrizeAwards() {
            return this.prizeAwards;
        }
    }
}
