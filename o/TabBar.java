package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TabBar implements getAdapterPosition<onSwitchTab> {

    static final class getMin {
        /* access modifiers changed from: private */
        public static final TabBar setMin = new TabBar();
    }

    public final onSwitchTab get() {
        return newInstance();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lid/dana/data/here/model/Highlights;", "", "title", "", "Lid/dana/data/here/model/Title;", "address", "Lid/dana/data/here/model/AddressHighlights;", "(Ljava/util/List;Lid/dana/data/here/model/AddressHighlights;)V", "getAddress", "()Lid/dana/data/here/model/AddressHighlights;", "getTitle", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class SwitchTabSource {
        @SerializedName("address")
        @Nullable
        private final getBadgeText address;
        @SerializedName("title")
        @Nullable
        private final List<Object> title;

        public static /* synthetic */ SwitchTabSource copy$default(SwitchTabSource switchTabSource, List<Object> list, getBadgeText getbadgetext, int i, Object obj) {
            if ((i & 1) != 0) {
                list = switchTabSource.title;
            }
            if ((i & 2) != 0) {
                getbadgetext = switchTabSource.address;
            }
            return switchTabSource.copy(list, getbadgetext);
        }

        @Nullable
        public final List<Object> component1() {
            return this.title;
        }

        @Nullable
        public final getBadgeText component2() {
            return this.address;
        }

        @NotNull
        public final SwitchTabSource copy(@Nullable List<Object> list, @Nullable getBadgeText getbadgetext) {
            return new SwitchTabSource(list, getbadgetext);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SwitchTabSource)) {
                return false;
            }
            SwitchTabSource switchTabSource = (SwitchTabSource) obj;
            return Intrinsics.areEqual((Object) this.title, (Object) switchTabSource.title) && Intrinsics.areEqual((Object) this.address, (Object) switchTabSource.address);
        }

        public final int hashCode() {
            List<Object> list = this.title;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            getBadgeText getbadgetext = this.address;
            if (getbadgetext != null) {
                i = getbadgetext.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Highlights(title=");
            sb.append(this.title);
            sb.append(", address=");
            sb.append(this.address);
            sb.append(")");
            return sb.toString();
        }

        public SwitchTabSource(@Nullable List<Object> list, @Nullable getBadgeText getbadgetext) {
            this.title = list;
            this.address = getbadgetext;
        }

        @Nullable
        public final List<Object> getTitle() {
            return this.title;
        }

        @Nullable
        public final getBadgeText getAddress() {
            return this.address;
        }
    }

    public static TabBar create() {
        return getMin.setMin;
    }

    public static onSwitchTab newInstance() {
        return new onSwitchTab();
    }
}
