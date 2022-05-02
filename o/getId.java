package o;

import android.graphics.Color;
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.alibaba.wireless.security.SecExceptionCode;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.savings.activity.SavingsActivity;

public final class getId {
    public static final int[] getMax = {Color.rgb(PsExtractor.AUDIO_STREAM, 255, SavingsActivity.RV_BENEFIT_WIDTH), Color.rgb(255, 247, SavingsActivity.RV_BENEFIT_WIDTH), Color.rgb(255, 208, SavingsActivity.RV_BENEFIT_WIDTH), Color.rgb(SavingsActivity.RV_BENEFIT_WIDTH, 234, 255), Color.rgb(255, SavingsActivity.RV_BENEFIT_WIDTH, 157)};
    public static final int[] getMin = {Color.rgb(FileUtils.JPEG_MARKER_EOI, 80, TsExtractor.TS_STREAM_TYPE_DTS), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO), Color.rgb(53, 194, 209)};
    public static final int[] length = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(FileUtils.JPEG_MARKER_EOI, 184, 162), Color.rgb(191, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO), Color.rgb(179, 48, 80)};
    public static final int[] setMax = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};
    public static final int[] setMin = {Color.rgb(207, 248, 246), Color.rgb(148, SecExceptionCode.SEC_ERROR_STA_STORE_LOW_VERSION_DATA_FILE, SecExceptionCode.SEC_ERROR_STA_STORE_LOW_VERSION_DATA_FILE), Color.rgb(136, 180, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, TsExtractor.TS_STREAM_TYPE_HDMV_DTS)};
    public static final int[] toFloatRange = {setMin("#2ecc71"), setMin("#f1c40f"), setMin("#e74c3c"), setMin("#3498db")};

    public static int setMin(int i, int i2) {
        return (i & FlexItem.MAX_SIZE) | ((i2 & 255) << 24);
    }

    private static int setMin(String str) {
        int parseLong = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((parseLong >> 16) & 255, (parseLong >> 8) & 255, (parseLong >> 0) & 255);
    }
}
