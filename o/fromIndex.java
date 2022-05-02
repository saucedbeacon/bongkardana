package o;

public class fromIndex {
    private String dataType;
    private String filename;
    private String imageFormat;
    private int maxHeight;
    private int maxWidth;
    private int quality;
    private boolean saveToGallery;

    public fromIndex(String str, int i, int i2, boolean z, String str2, String str3, int i3) {
        this.filename = "DANA_".concat(String.valueOf(str));
        this.maxWidth = i;
        this.maxHeight = i2;
        this.saveToGallery = z;
        this.dataType = str2;
        this.imageFormat = str3;
        this.quality = i3;
    }

    public String getFilename() {
        return this.filename;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public boolean isSaveToGallery() {
        return this.saveToGallery;
    }

    public String getDataType() {
        return this.dataType;
    }

    public String getImageFormat() {
        return this.imageFormat;
    }

    public int getQuality() {
        return this.quality;
    }
}
