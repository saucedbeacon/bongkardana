package com.alipay.multimedia.adjuster.adapter;

import android.net.Uri;
import android.text.TextUtils;
import com.alipay.multimedia.adjuster.config.ConfigConst;
import com.alipay.multimedia.adjuster.config.ConfigMgr;
import com.alipay.multimedia.adjuster.data.APMImageInfo;
import com.alipay.multimedia.adjuster.data.UrlInfo;
import com.alipay.multimedia.adjuster.utils.AliCdnUtils;
import com.alipay.multimedia.adjuster.utils.Log;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class APMTfsAdapter implements ICdnAdapter {
    private static final String TAG = "APMTfsAdapter";
    private static final Log logger = Log.getLogger(TAG);
    private static Pattern mCdnRuleRegex;
    private static Pattern mCdnWHRuleRegex;
    private static Pattern mNewCdnWHRuleRegex;

    public boolean canExecAdapterForUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.isEmpty(parse.getHost()) && !AliCdnUtils.checkUrlHostWithExact(parse.getHost(), ConfigMgr.getInc().getCdnConfigItem().tfsCdnDomainExactBlackList) && !AliCdnUtils.checkUrlWithFuzzy(str, ConfigMgr.getInc().getCdnConfigItem().tfsCdnDomainFuzzyBlackList) && AliCdnUtils.checkUrlWithFuzzy(str, ConfigMgr.getInc().getCdnConfigItem().tfsCdnDomainList)) {
            return true;
        }
        return false;
    }

    public UrlInfo getBaseUrlAndImageSize(String str) {
        int i;
        int i2;
        int indexOf;
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1295217950, oncanceled);
            onCancelLoad.getMin(-1295217950, oncanceled);
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        UrlInfo urlInfo = new UrlInfo();
        urlInfo.baseUrl = str;
        int lastIndexOf = str.lastIndexOf("/");
        String substring = (lastIndexOf <= 0 || lastIndexOf >= str.length()) ? str : str.substring(lastIndexOf + 1, str.length());
        int indexOf2 = substring.indexOf("_");
        if (indexOf2 > 0 && indexOf2 < substring.length()) {
            str2 = substring.substring(indexOf2, substring.length());
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.contains("q90") || str2.contains("Q90")) {
                urlInfo.quality = 90;
            } else if (str2.contains("q75") || str2.contains("Q75")) {
                urlInfo.quality = 75;
            } else if (str2.contains("q60") || str2.contains("Q60")) {
                urlInfo.quality = 60;
            } else if (str2.contains("q50") || str2.contains("Q50")) {
                urlInfo.quality = 50;
            } else if (str2.contains("q30") || str2.contains("Q30")) {
                urlInfo.quality = 30;
            }
            if (ConfigMgr.getInc().getCdnConfigItem().useOldCdnParseImageSizeRegex()) {
                Matcher parseTfsRule = parseTfsRule(str2);
                if (parseTfsRule != null && parseTfsRule.matches() && parseTfsRule.groupCount() == 5) {
                    int parseInt = Integer.parseInt(parseTfsRule.group(2));
                    int parseInt2 = Integer.parseInt(parseTfsRule.group(3));
                    if (parseInt > 0 && parseInt2 > 0) {
                        urlInfo.originSize = new UrlInfo.Size(parseInt, parseInt2);
                        if (!TextUtils.isEmpty(parseTfsRule.group(0)) && str.length() > (indexOf = str.indexOf(parseTfsRule.group(0)))) {
                            urlInfo.baseUrl = str.substring(0, indexOf);
                        }
                        return urlInfo;
                    }
                }
                Matcher parseTfsWHRule = parseTfsWHRule(str2);
                if (parseTfsWHRule != null && parseTfsWHRule.matches() && parseTfsWHRule.groupCount() == 3) {
                    int parseInt3 = Integer.parseInt(parseTfsWHRule.group(1));
                    int parseInt4 = Integer.parseInt(parseTfsWHRule.group(2));
                    if (parseInt3 > 0 && parseInt4 > 0) {
                        urlInfo.originSize = new UrlInfo.Size(parseInt3, parseInt4);
                    }
                    urlInfo.baseUrl = str.substring(0, str.length() - parseTfsWHRule.group(0).length());
                    return urlInfo;
                }
            } else {
                Matcher parseNewTfsRule = parseNewTfsRule(str);
                if (parseNewTfsRule != null && parseNewTfsRule.matches() && parseNewTfsRule.groupCount() > 4) {
                    int parseInt5 = !TextUtils.isEmpty(parseNewTfsRule.group(3)) ? Integer.parseInt(parseNewTfsRule.group(3)) : 0;
                    int parseInt6 = !TextUtils.isEmpty(parseNewTfsRule.group(4)) ? Integer.parseInt(parseNewTfsRule.group(4)) : 0;
                    if (parseInt5 > 0 || parseInt6 > 0) {
                        urlInfo.originSize = new UrlInfo.Size(parseInt5, parseInt6);
                        if (!TextUtils.isEmpty(parseNewTfsRule.group(1))) {
                            urlInfo.baseUrl = parseNewTfsRule.group(1);
                        }
                        return urlInfo;
                    }
                }
            }
        }
        int indexOf3 = str.indexOf(".png");
        if (indexOf3 <= 0 || str.length() <= (i2 = indexOf3 + 4)) {
            int indexOf4 = str.indexOf(".jpg");
            if (indexOf4 > 0 && str.length() > (i = indexOf4 + 4)) {
                urlInfo.baseUrl = str.substring(0, i);
            }
            return urlInfo;
        }
        urlInfo.baseUrl = str.substring(0, i2);
        return urlInfo;
    }

    public String adapterCdnZoomResult(String str, APMImageInfo.Format format, APMImageInfo.CutType cutType, int i, int i2, int i3, int i4, Map map) {
        String str2;
        if (i2 == 0 && i3 == 0) {
            str2 = "_";
        } else {
            str2 = String.format("_%dx%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        if (!(APMImageInfo.CutType.CUT_TYPE_CROP != cutType || i2 == 0 || i3 == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("xz");
            str2 = sb.toString();
        }
        if (i > 0 && i <= 100) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(String.format("q%d", new Object[]{Integer.valueOf(i)}));
            str2 = sb2.toString();
        }
        if (i4 > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(String.format("s%d", new Object[]{Integer.valueOf(i4)}));
            str2 = sb3.toString();
        }
        if (APMImageInfo.Format.FORMAT_HEIC == format) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append("_.heic");
            return sb4.toString();
        } else if (APMImageInfo.Format.FORMAT_WEBP == format) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(".jpg_.webp");
            return sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str2);
            sb6.append(".jpg");
            return sb6.toString();
        }
    }

    public boolean hasNotSupportCdnRule(String str, UrlInfo.Size size, APMImageInfo.CutType cutType) {
        if (!(TextUtils.isEmpty(str) || size == null || cutType == null)) {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getPath())) {
                return false;
            }
            if (APMImageInfo.CutType.CUT_TYPE_CROP == cutType && ((double) Math.abs((size.mWidth / size.mHeight) - 1)) > 0.1d) {
                return true;
            }
            String path = parse.getPath();
            int indexOf = path.indexOf("_");
            if (indexOf > 0 && indexOf < path.length()) {
                String substring = path.substring(indexOf, path.length());
                if (substring.indexOf("xz") > 0 || substring.indexOf("co0") > 0 || substring.matches("cy(\\d+)i|cx(\\d+)i")) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public UrlInfo.Size adjustImageSize(String str, UrlInfo.Size size, UrlInfo.Size size2, APMImageInfo.CutType cutType) {
        if (size == null) {
            return size;
        }
        int i = size.mWidth;
        int i2 = size.mHeight;
        if (size.mHeight >= 10000) {
            int i3 = size.mWidth;
            if (size2 != null && size2.mWidth > 0) {
                i3 = (int) scaleSideLengthForOriginalLength((float) size2.mWidth);
            }
            return new UrlInfo.Size(adaptWidthOf10000HeightWithImageWidth(i3), i2);
        } else if (size.mWidth < 10000) {
            return adaptImageSizeWithImageSize(size, cutType);
        } else {
            int i4 = size.mHeight;
            if (size2 != null && size2.mHeight > 0) {
                i4 = (int) scaleSideLengthForOriginalLength((float) size2.mHeight);
            }
            return new UrlInfo.Size(i, adaptHeightOf10000WidthWithImageHeight(i4));
        }
    }

    private float scaleSideLengthForOriginalLength(float f) {
        float screenScale = (float) AliCdnUtils.getScreenScale();
        if (screenScale > 2.0f) {
            return f * 3.0f;
        }
        return screenScale > 1.0f ? f * 2.0f : f;
    }

    public int adaptWidthOf10000HeightWithImageWidth(int i) {
        int[] iArr = ConfigMgr.getInc().getCdnConfigItem().cdnWidthListOf10000Height;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i4 = iArr[i2];
            if (i4 >= i) {
                i = i4 - i > i - i3 ? i3 : i4;
            } else {
                i2++;
                i3 = i4;
            }
        }
        if (i < iArr[0]) {
            i = iArr[0];
        }
        return i > iArr[iArr.length + -1] ? iArr[iArr.length - 1] : i;
    }

    public int adaptHeightOf10000WidthWithImageHeight(int i) {
        int[] iArr = ConfigMgr.getInc().getCdnConfigItem().cdnHeightListOf10000Width;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i4 = iArr[i2];
            if (i4 >= i) {
                i = i4 - i > i - i3 ? i3 : i4;
            } else {
                i2++;
                i3 = i4;
            }
        }
        if (i < iArr[0]) {
            i = iArr[0];
        }
        return i > iArr[iArr.length + -1] ? iArr[iArr.length - 1] : i;
    }

    public UrlInfo.Size adaptImageSizeWithImageSize(UrlInfo.Size size, APMImageInfo.CutType cutType) {
        int[] iArr;
        int max = Math.max(size.mWidth, size.mHeight);
        if (APMImageInfo.CutType.CUT_TYPE_SCALE == cutType || APMImageInfo.CutType.CUT_TYPE_CROP != cutType) {
            iArr = ConfigMgr.getInc().getCdnConfigItem().cdnImageSizeList;
        } else {
            iArr = ConfigMgr.getInc().getCdnConfigItem().cdnXZImageSizeList;
        }
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i3 = iArr[i];
            if (i3 >= max) {
                max = ((float) max) >= ((float) i2) * 1.0f ? i3 : i2;
            } else {
                i++;
                i2 = i3;
            }
        }
        if (max < iArr[0]) {
            max = iArr[0];
        }
        if (max > iArr[iArr.length - 1]) {
            max = iArr[iArr.length - 1];
        }
        return new UrlInfo.Size(max, max);
    }

    private static Matcher parseTfsRule(String str) {
        try {
            if (mCdnRuleRegex == null) {
                mCdnRuleRegex = Pattern.compile(ConfigConst.TFS_ZOOM_REGEX);
            }
            return mCdnRuleRegex.matcher(str);
        } catch (Exception e) {
            logger.e(e, "parseTfsRule exp!", new Object[0]);
            return null;
        }
    }

    private static Matcher parseTfsWHRule(String str) {
        try {
            if (mCdnWHRuleRegex == null) {
                mCdnWHRuleRegex = Pattern.compile(ConfigConst.TFS_ZOOM_WH_REGEX);
            }
            return mCdnWHRuleRegex.matcher(str);
        } catch (Exception e) {
            logger.e(e, "parseTfsWHRule exp!", new Object[0]);
            return null;
        }
    }

    private static Matcher parseNewTfsRule(String str) {
        try {
            if (mNewCdnWHRuleRegex == null) {
                mNewCdnWHRuleRegex = Pattern.compile(ConfigMgr.getInc().getCdnConfigItem().tfsCdnParseImageSizeRegex);
            }
            return mNewCdnWHRuleRegex.matcher(str);
        } catch (Exception e) {
            logger.e(e, "parseNewTfsRule exp!", new Object[0]);
            return null;
        }
    }
}
