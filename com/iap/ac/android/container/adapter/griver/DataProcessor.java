package com.iap.ac.android.container.adapter.griver;

import android.text.TextUtils;
import com.alibaba.griver.core.model.applist.AppCategory;
import com.alibaba.griver.core.model.applist.AppInfo;
import com.alibaba.griver.core.model.applist.AppInfosResult;
import com.iap.ac.android.common.container.model.AppInfoData;
import com.iap.ac.android.common.container.model.AppInfoListData;
import com.iap.ac.android.common.container.model.CategoryInfoData;
import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    protected static AppInfoListData convertAppListResult(AppInfosResult appInfosResult) {
        if (appInfosResult == null) {
            return null;
        }
        AppInfoListData appInfoListData = new AppInfoListData();
        appInfoListData.errorCode = appInfosResult.errorCode;
        appInfoListData.errorMessage = appInfosResult.errorMessage;
        appInfoListData.success = appInfosResult.success;
        appInfoListData.setTotalCount(appInfosResult.getTotalCount());
        List<AppInfo> appInfos = appInfosResult.getAppInfos();
        if (appInfos != null && appInfos.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (AppInfo next : appInfos) {
                if (next != null && !TextUtils.isEmpty(next.getIdentifier())) {
                    AppInfoData appInfoData = new AppInfoData();
                    appInfoData.setAppDesc(next.getIntroduction());
                    appInfoData.setAppId(next.getIdentifier());
                    appInfoData.setAppName(next.getName());
                    appInfoData.setAppSlogan(next.getSlogan());
                    appInfoData.setDeployVersion(next.getReleaseVersion());
                    appInfoData.setIconUrl(next.getIconURL());
                    List<AppCategory> categories = next.getCategories();
                    if (!(categories == null || categories.size() == 0)) {
                        ArrayList arrayList2 = new ArrayList();
                        for (AppCategory next2 : categories) {
                            if (next2 != null) {
                                CategoryInfoData categoryInfoData = new CategoryInfoData();
                                categoryInfoData.setCategory(next2.getName());
                                categoryInfoData.setCategoryId(next2.getIdentifier());
                                arrayList2.add(categoryInfoData);
                            }
                        }
                        appInfoData.setCategoryInfos(arrayList2);
                    }
                    arrayList.add(appInfoData);
                }
            }
            appInfoListData.setAppInfoList(arrayList);
        }
        return appInfoListData;
    }
}
