package o;

public class save extends APWebSettings {
    private String splitBillId;

    public save(String str, String str2) {
        super(str);
        this.splitBillId = str2;
    }

    public String getSplitBillId() {
        return this.splitBillId;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
