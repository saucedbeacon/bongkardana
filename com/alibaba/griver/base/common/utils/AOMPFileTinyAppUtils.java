package com.alibaba.griver.base.common.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.proxy.LocalIdTool;
import com.alibaba.griver.base.common.proxy.RVFileAbilityProxy;
import com.alibaba.griver.image.photo.PhotoContext;

public class AOMPFileTinyAppUtils {
    public static String getUserId() {
        RVFileAbilityProxy rVFileAbilityProxy = (RVFileAbilityProxy) RVProxy.get(RVFileAbilityProxy.class);
        if (rVFileAbilityProxy != null) {
            return rVFileAbilityProxy.getUserId();
        }
        RVLogger.e("AOMPFileTinyAppUtils", "provider ==null ");
        return null;
    }

    public static String encodeToLocalId(String str) {
        return LocalIdTool.get().encodeToLocalId(str);
    }

    public static String transferApPathToLocalPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String localPathFromId = getLocalPathFromId(str);
        return (TextUtils.isEmpty(localPathFromId) || !localPathFromId.startsWith(PhotoContext.FILE_SCHEME)) ? localPathFromId : localPathFromId.replaceAll(PhotoContext.FILE_SCHEME, "");
    }

    public static String getLocalPathFromId(String str) {
        String str2;
        String matchLocalId;
        if (str.endsWith(H5ResourceHandlerUtil.IMAGE)) {
            matchLocalId = matchLocalId(str, H5ResourceHandlerUtil.IMAGE);
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else if (str.endsWith("video")) {
            matchLocalId = matchLocalId(str, "video");
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else if (str.endsWith("audio")) {
            matchLocalId = matchLocalId(str, "audio");
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else if (str.endsWith(OfficeFileType.Pdf.fileType())) {
            matchLocalId = matchLocalId(str, OfficeFileType.Pdf.fileType());
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else if (str.endsWith(OfficeFileType.Doc.fileType())) {
            matchLocalId = matchLocalId(str, OfficeFileType.Doc.fileType());
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else if (str.endsWith(OfficeFileType.Docx.fileType())) {
            matchLocalId = matchLocalId(str, OfficeFileType.Docx.fileType());
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else if (str.endsWith(OfficeFileType.Xls.fileType())) {
            matchLocalId = matchLocalId(str, OfficeFileType.Xls.fileType());
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else if (str.endsWith(OfficeFileType.Xlsx.fileType())) {
            matchLocalId = matchLocalId(str, OfficeFileType.Xlsx.fileType());
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else if (str.endsWith(OfficeFileType.PPt.fileType())) {
            matchLocalId = matchLocalId(str, OfficeFileType.PPt.fileType());
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else if (str.endsWith(OfficeFileType.PPtx.fileType())) {
            matchLocalId = matchLocalId(str, OfficeFileType.PPtx.fileType());
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            }
        } else {
            matchLocalId = matchLocalId(str, H5ResourceHandlerUtil.OTHER);
            if (!TextUtils.isEmpty(matchLocalId)) {
                str = decodeToPath(matchLocalId);
            } else if (!TextUtils.isEmpty(str) && str.startsWith(LocalIdTool.PREFIX)) {
                str2 = decodeToPath(str);
                StringBuilder sb = new StringBuilder("id:");
                sb.append(str);
                sb.append(" filePath:");
                sb.append(str2);
                RVLogger.d("AOMPFileTinyAppUtils", sb.toString());
                return str2;
            }
        }
        String str3 = matchLocalId;
        str2 = str;
        str = str3;
        StringBuilder sb2 = new StringBuilder("id:");
        sb2.append(str);
        sb2.append(" filePath:");
        sb2.append(str2);
        RVLogger.d("AOMPFileTinyAppUtils", sb2.toString());
        return str2;
    }

    public static String matchLocalId(String str, String str2) {
        Uri parseUrl;
        String[] split;
        if (str == null || !str.startsWith(H5ResourceHandlerUtil.RESOURCE) || !str.endsWith(str2) || (parseUrl = H5UrlHelper.parseUrl(str)) == null || TextUtils.isEmpty(parseUrl.getPath()) || (split = parseUrl.getPath().replace("/", "").split("\\.")) == null || split.length <= 1) {
            return null;
        }
        String str3 = split[0];
        try {
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
            return null;
        } catch (Exception e) {
            RVLogger.e("AOMPFileTinyAppUtils", (Throwable) e);
            return null;
        }
    }

    public static String decodeToPath(String str) {
        return LocalIdTool.get().decodeToPath(str);
    }

    public static String getTypeFromMimeType(String str) {
        if (str == null) {
            return H5ResourceHandlerUtil.OTHER;
        }
        if (str.contains(H5ResourceHandlerUtil.IMAGE)) {
            return H5ResourceHandlerUtil.IMAGE;
        }
        if (str.contains("video")) {
            return "video";
        }
        if (str.contains("audio")) {
            return "audio";
        }
        if (str.contains(OfficeFileType.Pdf.fileType())) {
            return OfficeFileType.Pdf.fileType();
        }
        if (str.contains(OfficeFileType.Doc.fileType())) {
            return OfficeFileType.Doc.fileType();
        }
        if (str.contains(OfficeFileType.Docx.fileType())) {
            return OfficeFileType.Docx.fileType();
        }
        if (str.contains(OfficeFileType.Xls.fileType())) {
            return OfficeFileType.Xls.fileType();
        }
        if (str.contains(OfficeFileType.Xlsx.fileType())) {
            return OfficeFileType.Xlsx.fileType();
        }
        if (str.contains(OfficeFileType.PPt.fileType())) {
            return OfficeFileType.PPt.fileType();
        }
        if (str.contains(OfficeFileType.PPtx.fileType())) {
            return OfficeFileType.PPtx.fileType();
        }
        return H5ResourceHandlerUtil.OTHER;
    }
}
