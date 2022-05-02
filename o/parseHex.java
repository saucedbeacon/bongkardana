package o;

public class parseHex {
    private String cardIndexNo;
    private String formattedHolderName;
    private String formattedMaskedCardNo;
    private longToByteArray holderName;

    public String getCardIndexNo() {
        return this.cardIndexNo;
    }

    public void setCardIndexNo(String str) {
        this.cardIndexNo = str;
    }

    public String getFormattedHolderName() {
        return this.formattedHolderName;
    }

    public void setFormattedHolderName(String str) {
        this.formattedHolderName = str;
    }

    public String getFormattedMaskedCardNo() {
        return this.formattedMaskedCardNo;
    }

    public void setFormattedMaskedCardNo(String str) {
        this.formattedMaskedCardNo = str;
    }

    public longToByteArray getHolderName() {
        return this.holderName;
    }

    public void setHolderName(longToByteArray longtobytearray) {
        this.holderName = longtobytearray;
    }
}
