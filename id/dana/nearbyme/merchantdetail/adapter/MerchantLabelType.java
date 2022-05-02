package id.dana.nearbyme.merchantdetail.adapter;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lid/dana/nearbyme/merchantdetail/adapter/MerchantLabelType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "PROMO", "BISNIS", "TOP_UP", "ORDER_ONLINE", "QRIS", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public enum MerchantLabelType {
    PROMO(1),
    BISNIS(2),
    TOP_UP(3),
    ORDER_ONLINE(4),
    QRIS(5);
    
    private final int value;

    private MerchantLabelType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
