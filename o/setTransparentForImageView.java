package o;

import net.sqlcipher.database.SQLiteDatabase;

public class setTransparentForImageView {
    private static final setTransparentForImageView mInstance = new setTransparentForImageView();
    private static final int maximumEventPropertyBytes = 32768;
    private int mMaximumKeyLength = SQLiteDatabase.MAX_SQL_CACHE_SIZE;
    private String mTrackEventNamePattern = "^[a-zA-Z0-9][-_.:a-zA-Z0-9]{0,79}$";

    public int getMaximumEventPropertyBytes() {
        return maximumEventPropertyBytes;
    }

    public static setTransparentForImageView getInstance() {
        return mInstance;
    }

    private setTransparentForImageView() {
    }

    public int getMaximumKeyLength() {
        return this.mMaximumKeyLength;
    }

    public void setMaximumKeyLength(int i) {
        this.mMaximumKeyLength = i;
    }

    public String getTrackEventNamePattern() {
        return this.mTrackEventNamePattern;
    }

    public void setTrackEventNamePattern(String str) {
        this.mTrackEventNamePattern = str;
    }
}
