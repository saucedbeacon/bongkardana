package o;

import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyme.model.ShopOpenHourModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/nearbyme/model/MerchantItemWrapper;", "", "itemType", "", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "(ILid/dana/nearbyme/model/ShopModel;)V", "getItemType", "()I", "setItemType", "(I)V", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "setShopModel", "(Lid/dana/nearbyme/model/ShopModel;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class H5Worker {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);
    public int length;
    @NotNull
    public ShopModel setMin;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WorkerReadyListener {
        public static final /* synthetic */ int[] getMin;

        static {
            int[] iArr = new int[ShopOpenHourModel.OpenHourType.values().length];
            getMin = iArr;
            iArr[ShopOpenHourModel.OpenHourType.NONE.ordinal()] = 1;
            getMin[ShopOpenHourModel.OpenHourType.OPEN.ordinal()] = 2;
            getMin[ShopOpenHourModel.OpenHourType.OPENING_SOON.ordinal()] = 3;
            getMin[ShopOpenHourModel.OpenHourType.CLOSING_SOON.ordinal()] = 4;
            getMin[ShopOpenHourModel.OpenHourType.CLOSE.ordinal()] = 5;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5Worker)) {
            return false;
        }
        H5Worker h5Worker = (H5Worker) obj;
        return this.length == h5Worker.length && Intrinsics.areEqual((Object) this.setMin, (Object) h5Worker.setMin);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantItemWrapper(itemType=");
        sb.append(this.length);
        sb.append(", shopModel=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/nearbyme/model/SearchConfigModel;", "", "enabled", "", "interval", "", "threshold", "(ZII)V", "getEnabled", "()Z", "getInterval", "()I", "getThreshold", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class RenderReadyListener {
        @NotNull
        public static final getMax getMax = new getMax((byte) 0);
        private final boolean getMin;
        public final int length;
        public final int setMax;

        public RenderReadyListener() {
            this((byte) 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RenderReadyListener)) {
                return false;
            }
            RenderReadyListener renderReadyListener = (RenderReadyListener) obj;
            return this.getMin == renderReadyListener.getMin && this.length == renderReadyListener.length && this.setMax == renderReadyListener.setMax;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchConfigModel(enabled=");
            sb.append(this.getMin);
            sb.append(", interval=");
            sb.append(this.length);
            sb.append(", threshold=");
            sb.append(this.setMax);
            sb.append(")");
            return sb.toString();
        }

        public RenderReadyListener(boolean z, int i, int i2) {
            this.getMin = z;
            this.length = i;
            this.setMax = i2;
        }

        public final boolean getMin() {
            return this.getMin;
        }

        private /* synthetic */ RenderReadyListener(byte b) {
            this(true, 500, 500);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/nearbyme/model/SearchConfigModel$Companion;", "", "()V", "DEFAULT_INTERVAL", "", "DEFAULT_THRESHOLD", "from", "Lid/dana/nearbyme/model/SearchConfigModel;", "config", "Lid/dana/domain/nearbyme/model/NearbyAutoSearchConfig;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            private getMax() {
            }

            public /* synthetic */ getMax(byte b) {
                this();
            }
        }

        public final int hashCode() {
            boolean z = this.getMin;
            if (z) {
                z = true;
            }
            return ((((z ? 1 : 0) * true) + Integer.valueOf(this.length).hashCode()) * 31) + Integer.valueOf(this.setMax).hashCode();
        }
    }

    public H5Worker(int i, @NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        this.length = i;
        this.setMin = shopModel;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/nearbyme/model/MerchantItemWrapper$Companion;", "", "()V", "ERROR_TRY_AGAIN", "", "LABEL_HEADER", "LOADING_SKELETON", "SEE_MORE_BUTTON", "SHOP_ITEM", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.length).hashCode() * 31;
        ShopModel shopModel = this.setMin;
        return hashCode + (shopModel != null ? shopModel.hashCode() : 0);
    }
}
