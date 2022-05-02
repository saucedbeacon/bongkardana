package com.alipay.multimedia.adjuster.adapter;

import com.alipay.multimedia.adjuster.data.APMImageInfo;
import com.alipay.multimedia.adjuster.data.UrlInfo;
import java.util.Map;

public interface ICdnAdapter {
    String adapterCdnZoomResult(String str, APMImageInfo.Format format, APMImageInfo.CutType cutType, int i, int i2, int i3, int i4, Map map);

    UrlInfo.Size adjustImageSize(String str, UrlInfo.Size size, UrlInfo.Size size2, APMImageInfo.CutType cutType);

    boolean canExecAdapterForUrl(String str);

    UrlInfo getBaseUrlAndImageSize(String str);

    boolean hasNotSupportCdnRule(String str, UrlInfo.Size size, APMImageInfo.CutType cutType);
}
