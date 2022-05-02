package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.PhotoBrowseListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/sendmoney/mapper/WithdrawInitMethodOptionModelMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/domain/sendmoney/model/WithdrawInitMethodOption;", "Lid/dana/sendmoney/model/WithdrawInitMethodOptionModel;", "withdrawSavedCardChannelModelMapper", "Lid/dana/sendmoney/mapper/WithdrawSavedCardChannelModelMapper;", "withdrawInitChannelOptionModelMapper", "Lid/dana/sendmoney/mapper/WithdrawInitChannelOptionModelMapper;", "(Lid/dana/sendmoney/mapper/WithdrawSavedCardChannelModelMapper;Lid/dana/sendmoney/mapper/WithdrawInitChannelOptionModelMapper;)V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PhotoPagerListener extends setSpeed<List<? extends fromLong>, List<? extends isConfigToDisableQCompact>> {
    private final PhotoBrowseListener.V2 getMax;
    private final onPageClicked length;

    public final class V3 {
        public String getMax;
        public boolean setMax;
        public isSelected setMin;
    }

    public final class V2 implements getAdapterPosition<onPageLongClicked> {

        static final class length {
            /* access modifiers changed from: private */
            public static final V2 length = new V2();
        }

        public static V2 getMin() {
            return length.length;
        }

        public final /* synthetic */ Object get() {
            return new onPageLongClicked();
        }
    }

    public final /* synthetic */ Object map(Object obj) {
        List list;
        List list2 = (List) obj;
        if (list2 != null) {
            Iterable<fromLong> iterable = list2;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (fromLong fromlong : iterable) {
                arrayList.add(new isConfigToDisableQCompact((List) this.length.apply(fromlong.getWithdrawCardOptions()), (List) this.getMax.apply(fromlong.getWithdrawChannelOptions()), fromlong.getWithdrawMethod()));
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Inject
    public PhotoPagerListener(@NotNull onPageClicked onpageclicked, @NotNull PhotoBrowseListener.V2 v2) {
        Intrinsics.checkNotNullParameter(onpageclicked, "withdrawSavedCardChannelModelMapper");
        Intrinsics.checkNotNullParameter(v2, "withdrawInitChannelOptionModelMapper");
        this.length = onpageclicked;
        this.getMax = v2;
    }

    public final class V4 {
        public String FastBitmap$CoordinateSystem;
        /* access modifiers changed from: private */
        public boolean Grayscale$Algorithm;
        public String IsOverlapping;
        /* access modifiers changed from: private */
        public boolean Mean$Arithmetic;
        public String equals;
        public String getMax;
        public String getMin;
        public String hashCode;
        public String isInside;
        public String length;
        public String setMax;
        public String setMin;
        public String toDoubleRange;
        public String toFloatRange;
        public String toIntRange;
        public String toString;
        public String values;

        public final boolean setMin() {
            return this.Grayscale$Algorithm;
        }

        public final boolean getMax() {
            return this.Mean$Arithmetic;
        }

        public static class getMax {
            public String FastBitmap$CoordinateSystem;
            private String Grayscale$Algorithm;
            public String IsOverlapping;
            public String equals;
            public String getMax;
            public String getMin;
            public boolean hashCode;
            public String isInside;
            public String length;
            public String setMax;
            public String setMin;
            public String toDoubleRange;
            public String toFloatRange;
            public String toIntRange;
            public String toString;
            public boolean valueOf;
            public String values;

            public final getMax setMin(String str) {
                int length2 = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length2);
                if (length2 != max) {
                    onCanceled oncanceled = new onCanceled(length2, max, 1);
                    onCancelLoad.setMax(-1391322966, oncanceled);
                    onCancelLoad.getMin(-1391322966, oncanceled);
                }
                this.Grayscale$Algorithm = str;
                return this;
            }

            public final V4 length() {
                V4 v4 = new V4();
                v4.getMin = this.setMax;
                v4.setMax = this.getMax;
                v4.setMin = this.length;
                v4.getMax = this.setMin;
                v4.IsOverlapping = this.toIntRange;
                v4.isInside = this.toFloatRange;
                v4.toFloatRange = this.IsOverlapping;
                v4.toIntRange = this.equals;
                v4.equals = this.isInside;
                boolean unused = v4.Grayscale$Algorithm = this.hashCode;
                v4.length = this.getMin;
                v4.toString = this.Grayscale$Algorithm;
                v4.toDoubleRange = this.FastBitmap$CoordinateSystem;
                v4.values = this.values;
                v4.FastBitmap$CoordinateSystem = this.toDoubleRange;
                v4.hashCode = this.toString;
                boolean unused2 = v4.Mean$Arithmetic = this.valueOf;
                return v4;
            }
        }
    }
}
