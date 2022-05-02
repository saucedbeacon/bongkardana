package o;

import java.util.Objects;

public class isMain {
    private stopBleScan maxAmount;
    private stopBleScan minAmount;

    public int hashCode() {
        stopBleScan stopblescan = this.maxAmount;
        int i = 0;
        int hashCode = (stopblescan != null ? stopblescan.hashCode() : 0) * 31;
        stopBleScan stopblescan2 = this.minAmount;
        if (stopblescan2 != null) {
            i = stopblescan2.hashCode();
        }
        return hashCode + i;
    }

    public stopBleScan getMaxAmount() {
        return this.maxAmount;
    }

    public void setMaxAmount(stopBleScan stopblescan) {
        this.maxAmount = stopblescan;
    }

    public stopBleScan getMinAmount() {
        return this.minAmount;
    }

    public void setMinAmount(stopBleScan stopblescan) {
        this.minAmount = stopblescan;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        isMain ismain = (isMain) obj;
        if (!Objects.equals(this.maxAmount, ismain.maxAmount)) {
            return false;
        }
        return Objects.equals(this.minAmount, ismain.minAmount);
    }
}
