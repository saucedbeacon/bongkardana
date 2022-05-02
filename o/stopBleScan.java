package o;

public class stopBleScan {
    private String amount;
    private String currency;
    private boolean placeholder;

    public stopBleScan() {
    }

    public stopBleScan(String str, String str2) {
        this.amount = str;
        this.currency = str2;
        this.placeholder = false;
    }

    public stopBleScan(String str, String str2, boolean z) {
        this.amount = str;
        this.currency = str2;
        this.placeholder = z;
    }

    public int hashCode() {
        String str = this.amount;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.currency;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            stopBleScan stopblescan = (stopBleScan) obj;
            String str = this.amount;
            if (str == null ? stopblescan.amount != null : !str.equals(stopblescan.amount)) {
                return false;
            }
            String str2 = this.currency;
            String str3 = stopblescan.currency;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CurrencyAmount{amount='");
        sb.append(this.amount);
        sb.append('\'');
        sb.append(", currency='");
        sb.append(this.currency);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public boolean isLessThan(stopBleScan stopblescan) {
        if (!this.currency.equals(stopblescan.getCurrency()) || Long.parseLong(stopblescan.getAmount()) >= Long.parseLong(this.currency)) {
            return false;
        }
        return true;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public boolean isMoreThan(stopBleScan stopblescan) {
        if (!this.currency.equals(stopblescan.getCurrency()) || Long.parseLong(stopblescan.getAmount()) <= Long.parseLong(this.currency)) {
            return false;
        }
        return true;
    }

    public boolean isPlaceholder() {
        return this.placeholder;
    }

    public void setPlaceholder(boolean z) {
        this.placeholder = z;
    }
}
