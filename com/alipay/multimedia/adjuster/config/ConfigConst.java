package com.alipay.multimedia.adjuster.config;

import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import net.sqlcipher.database.SQLiteDatabase;

public class ConfigConst {
    public static final int[] CDN_HEIGHT_OF_10000_WIDTH = {170, WheelView.DIVIDER_ALPHA, 340, 500};
    public static final int[] CDN_IMAGE_SIZE = {16, 20, 24, 30, 32, 36, 40, 48, 50, 60, 64, 70, 72, 80, 88, 90, 100, 110, 120, 125, 128, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 145, BlobStatic.MONITOR_IMAGE_WIDTH, 170, 180, 190, 200, 210, WheelView.DIVIDER_ALPHA, 230, 234, 240, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 270, 290, 300, SecExceptionCode.SEC_ERROR_STA_INVALID_ENCRYPTED_DATA, 315, 320, 336, 350, AUScreenAdaptTool.WIDTH_BASE, 400, 430, 460, 468, 480, 490, 540, 560, 570, 580, 600, 640, 670, 720, 728, 760, 960, 970};
    public static final int[] CDN_WIDTH_OF_10000_HEIGHT = {110, 150, 170, WheelView.DIVIDER_ALPHA, 240, 290, 450, 570, 580, 620, 790};
    public static final int[] CDN_XZ_IMAGE_SIZE = {72, 88, 90, 100, 110, 120, 145, BlobStatic.MONITOR_IMAGE_WIDTH, 170, 180, 200, 230, 240, 270, 290, SecExceptionCode.SEC_ERROR_STA_INVALID_ENCRYPTED_DATA, 320, AUScreenAdaptTool.WIDTH_BASE, 430, 460, 580, 640};
    public static final String CONFIG_KEY_CDN = "APM_ALI_CDN";
    public static final String[] OSS_DOMAIN_WHITE_LIST = {"/zos.alipayobjects.com", "/os.alipayobjects.com", "/gw.alipayobjects.com/os/", "/gw.alipayobjects.com/zos/"};
    public static final String OSS_ZOOM_REGEX = "@(?:(?:_?(\\d+)w[_\\.])|(?:_?(\\d+)w$)|(?:_?(\\d+)h)|(?:_?(\\d+)[Qq])|(?:_?[^_.]+))+";
    public static final String TFS_CDN_PARSE_IMAGE_SIZE_REGEX = "(\\S*)(_(\\d+)[xX](\\d+)?(?:[Qq](\\d{2})|s(\\d{2,3})|xc|xz|g|co0|c[xy]\\d+i\\d){0,}(?:$|\\.jpeg|\\.jpg|_\\.webp|\\?))";
    public static final String[] TFS_DOMAIN_WHITE_LIST = {"/t.alipayobjects.com", "/tfs.alipayobjects.com", "/img.alicdn.com", "/gw.alipayobjects.com/tfs", "/gw.alicdn.com", "/img03.taobaocdn.com"};
    public static final String TFS_ZOOM_REGEX = "_(?:(?:\\.webp)|((?:(?:(\\d+)x(\\d+)(?:xz)?)|(?:q\\d{2})|(?:s\\d{3})){1,3}(?:\\.jpg)?(_\\.webp)?))";
    public static final String TFS_ZOOM_WH_REGEX = "_(\\d+)x(\\d+).*";
}
