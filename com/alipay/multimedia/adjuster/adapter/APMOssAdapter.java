package com.alipay.multimedia.adjuster.adapter;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.multimedia.adjuster.config.ConfigConst;
import com.alipay.multimedia.adjuster.config.ConfigMgr;
import com.alipay.multimedia.adjuster.data.APMImageInfo;
import com.alipay.multimedia.adjuster.data.UrlInfo;
import com.alipay.multimedia.adjuster.utils.AliCdnUtils;
import com.alipay.multimedia.adjuster.utils.Log;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class APMOssAdapter implements ICdnAdapter {
    private static final String TAG = "APMOssAdapter";
    private static final Log logger = Log.getLogger(TAG);
    private static Pattern mCdnRuleRegex;

    public UrlInfo.Size adjustImageSize(String str, UrlInfo.Size size, UrlInfo.Size size2, APMImageInfo.CutType cutType) {
        return size;
    }

    public boolean canExecAdapterForUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.isEmpty(parse.getHost()) && !str.contains("_") && !AliCdnUtils.checkUrlHostWithExact(parse.getHost(), ConfigMgr.getInc().getCdnConfigItem().ossCdnDomainExactBlackList) && !AliCdnUtils.checkUrlWithFuzzy(str, ConfigMgr.getInc().getCdnConfigItem().ossCdnDomainFuzzyBlackList) && AliCdnUtils.checkUrlWithFuzzy(str, ConfigMgr.getInc().getCdnConfigItem().ossCdnDomainList)) {
            return true;
        }
        return false;
    }

    public UrlInfo getBaseUrlAndImageSize(String str) {
        int i;
        int i2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        UrlInfo urlInfo = new UrlInfo();
        urlInfo.baseUrl = str;
        int lastIndexOf = str.lastIndexOf(AUScreenAdaptTool.PREFIX_ID);
        if (lastIndexOf > 0) {
            urlInfo.baseUrl = str.substring(0, lastIndexOf);
            return parseOssRule(urlInfo, str.substring(lastIndexOf, str.length()));
        }
        int indexOf = str.indexOf(".png");
        if (indexOf <= 0 || str.length() <= (i2 = indexOf + 4)) {
            int indexOf2 = str.indexOf(".jpg");
            if (indexOf2 > 0 && str.length() > (i = indexOf2 + 4)) {
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
            str2 = AUScreenAdaptTool.PREFIX_ID;
        } else {
            str2 = String.format("@%dw_%dh_1l", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        if (APMImageInfo.CutType.CUT_TYPE_CROP == cutType) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("_1e_1c");
            str2 = sb.toString();
        }
        if (i > 0 && i < 100) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(String.format("_%dq", new Object[]{Integer.valueOf(i)}));
            str2 = sb2.toString();
        }
        if (i4 > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(String.format("_%ds", new Object[]{Integer.valueOf(i4)}));
            str2 = sb3.toString();
        }
        if (APMImageInfo.Format.FORMAT_WEBP == format) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(".webp");
            return sb4.toString();
        } else if (!str.contains(".png")) {
            return str2;
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(".src");
            return sb5.toString();
        }
    }

    public boolean hasNotSupportCdnRule(String str, UrlInfo.Size size, APMImageInfo.CutType cutType) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        int indexOf = path.indexOf(AUScreenAdaptTool.PREFIX_ID);
        if (indexOf > 0) {
            path = path.substring(indexOf, path.length());
        }
        if (path.contains("_2e") || path.contains("_1e_1c_") || path.contains("-")) {
            return true;
        }
        if (!path.contains("|") || path.contains("_1l_")) {
            return false;
        }
        return true;
    }

    private static UrlInfo parseOssRule(UrlInfo urlInfo, String str) {
        try {
            if (mCdnRuleRegex == null) {
                mCdnRuleRegex = Pattern.compile(ConfigConst.OSS_ZOOM_REGEX);
            }
            Matcher matcher = mCdnRuleRegex.matcher(str);
            if (matcher.matches() && matcher.groupCount() == 5) {
                String group = matcher.group(1);
                if (group == null) {
                    group = matcher.group(2);
                }
                String group2 = matcher.group(3);
                String group3 = matcher.group(4);
                urlInfo.originSize = new UrlInfo.Size(!TextUtils.isEmpty(group) ? Integer.parseInt(group) : 0, !TextUtils.isEmpty(group2) ? Integer.parseInt(group2) : 0);
                if (!TextUtils.isEmpty(group3)) {
                    urlInfo.quality = Integer.parseInt(group3);
                }
            }
        } catch (Exception e) {
            logger.e(e, "parseOssRule exp!", new Object[0]);
        }
        return urlInfo;
    }
}
