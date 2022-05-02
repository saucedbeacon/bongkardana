package id.dana.statement;

import id.dana.R;
import id.dana.domain.promoquest.model.PrizeType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lid/dana/statement/StatementTransactionType;", "", "bizType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "getDrawableIcon", "", "getLocalizedTitle", "TOPUP", "CASHBACK", "RECEIVEMONEY", "DANAKAGET", "SERVICES", "MERCHANT", "SENDMONEY", "CASHOUT", "DEFAULT", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public enum StatementTransactionType {
    ;
    
    @NotNull
    public static final getMin Companion = null;
    @NotNull
    private final String bizType;

    static {
        Companion = new getMin((byte) 0);
    }

    @JvmStatic
    @NotNull
    public static final StatementTransactionType getStatementTransactionType(@NotNull String str) {
        return getMin.setMin(str);
    }

    public abstract int getDrawableIcon();

    public abstract int getLocalizedTitle();

    private StatementTransactionType(String str) {
        this.bizType = str;
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/statement/StatementTransactionType$TOPUP;", "Lid/dana/statement/StatementTransactionType;", "getDrawableIcon", "", "getLocalizedTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class toIntRange extends StatementTransactionType {
        public final int getDrawableIcon() {
            return R.drawable.ic_topup;
        }

        public final int getLocalizedTitle() {
            return R.string.topup;
        }

        toIntRange(String str, int i) {
            super(str, i, "TOPUP", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/statement/StatementTransactionType$CASHBACK;", "Lid/dana/statement/StatementTransactionType;", "getDrawableIcon", "", "getLocalizedTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class setMin extends StatementTransactionType {
        public final int getDrawableIcon() {
            return R.drawable.ic_gift_orange;
        }

        public final int getLocalizedTitle() {
            return R.string.cashback;
        }

        setMin(String str, int i) {
            super(str, i, PrizeType.CASHBACK, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/statement/StatementTransactionType$RECEIVEMONEY;", "Lid/dana/statement/StatementTransactionType;", "getDrawableIcon", "", "getLocalizedTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class IsOverlapping extends StatementTransactionType {
        public final int getDrawableIcon() {
            return R.drawable.ic_receiver_orange;
        }

        public final int getLocalizedTitle() {
            return R.string.receive_money;
        }

        IsOverlapping(String str, int i) {
            super(str, i, "RECEIVEMONEY", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/statement/StatementTransactionType$DANAKAGET;", "Lid/dana/statement/StatementTransactionType;", "getDrawableIcon", "", "getLocalizedTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class setMax extends StatementTransactionType {
        public final int getDrawableIcon() {
            return R.drawable.icon_danakaget;
        }

        public final int getLocalizedTitle() {
            return R.string.dana_kaget;
        }

        setMax(String str, int i) {
            super(str, i, "DANAKAGET", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/statement/StatementTransactionType$SERVICES;", "Lid/dana/statement/StatementTransactionType;", "getDrawableIcon", "", "getLocalizedTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class equals extends StatementTransactionType {
        public final int getDrawableIcon() {
            return R.drawable.ic_mobile_services;
        }

        public final int getLocalizedTitle() {
            return R.string.services;
        }

        equals(String str, int i) {
            super(str, i, "BILLER", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/statement/StatementTransactionType$MERCHANT;", "Lid/dana/statement/StatementTransactionType;", "getDrawableIcon", "", "getLocalizedTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class toFloatRange extends StatementTransactionType {
        public final int getDrawableIcon() {
            return R.drawable.ic_merchant_orange;
        }

        public final int getLocalizedTitle() {
            return R.string.merchant;
        }

        toFloatRange(String str, int i) {
            super(str, i, "MERCHANTS", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/statement/StatementTransactionType$SENDMONEY;", "Lid/dana/statement/StatementTransactionType;", "getDrawableIcon", "", "getLocalizedTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class isInside extends StatementTransactionType {
        public final int getDrawableIcon() {
            return R.drawable.ic_sender_blue;
        }

        public final int getLocalizedTitle() {
            return R.string.send_money_statement;
        }

        isInside(String str, int i) {
            super(str, i, "SENDMONEY", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/statement/StatementTransactionType$CASHOUT;", "Lid/dana/statement/StatementTransactionType;", "getDrawableIcon", "", "getLocalizedTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class getMax extends StatementTransactionType {
        public final int getDrawableIcon() {
            return R.drawable.ic_cashout_green;
        }

        public final int getLocalizedTitle() {
            return R.string.cashout;
        }

        getMax(String str, int i) {
            super(str, i, "CASHOUT", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/statement/StatementTransactionType$DEFAULT;", "Lid/dana/statement/StatementTransactionType;", "getDrawableIcon", "", "getLocalizedTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    static final class length extends StatementTransactionType {
        public final int getDrawableIcon() {
            return R.drawable.greyish_square_rounded_skeleton;
        }

        public final int getLocalizedTitle() {
            return R.string.default_type;
        }

        length(String str, int i) {
            super(str, i, "DEFAULT", (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/statement/StatementTransactionType$Companion;", "", "()V", "getStatementTransactionType", "Lid/dana/statement/StatementTransactionType;", "bizType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static StatementTransactionType setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "bizType");
            if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.TOPUP.getBizType())) {
                return StatementTransactionType.TOPUP;
            }
            if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.CASHBACK.getBizType())) {
                return StatementTransactionType.CASHBACK;
            }
            if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.RECEIVEMONEY.getBizType())) {
                return StatementTransactionType.RECEIVEMONEY;
            }
            if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.DANAKAGET.getBizType())) {
                return StatementTransactionType.DANAKAGET;
            }
            if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.SERVICES.getBizType())) {
                return StatementTransactionType.SERVICES;
            }
            if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.MERCHANT.getBizType())) {
                return StatementTransactionType.MERCHANT;
            }
            if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.SENDMONEY.getBizType())) {
                return StatementTransactionType.SENDMONEY;
            }
            if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.CASHOUT.getBizType())) {
                return StatementTransactionType.CASHOUT;
            }
            return StatementTransactionType.DEFAULT;
        }
    }
}
