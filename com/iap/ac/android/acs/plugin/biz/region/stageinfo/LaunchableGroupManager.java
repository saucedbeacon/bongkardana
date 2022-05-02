package com.iap.ac.android.acs.plugin.biz.region.stageinfo;

import android.os.Handler;
import android.os.Looper;
import com.iap.ac.android.acs.plugin.biz.region.config.RegionRPCConfigCenter;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.FetchStageInfoRepository;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.FetchStageInfosResult;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.StageAppInfo;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.StageContentInfo;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.StageInfo;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.TagInfo;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.LaunchableCategory;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.LaunchableGroup;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.MiniProgramLaunchableItem;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.callback.Callback;
import com.iap.ac.android.common.container.model.AppInfoData;
import com.iap.ac.android.common.container.model.AppInfoListData;
import com.iap.ac.android.common.container.model.CategoryInfoData;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import id.dana.domain.foundation.logger.PerformanceConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class LaunchableGroupManager {
    private static final String ERROR_CODE_API_BANED = "10100";
    private static final String ERROR_CODE_ARGS_ERROR = "10102";
    private static final String ERROR_CODE_FETCH_APPINFO = "20101";
    private static final String ERROR_CODE_FETCH_STAGE = "20100";
    private static final String TAG = LaunchableGroupManager.class.getSimpleName();
    private static LaunchableGroupManager stageInfoManager;
    private String TAG_HOT = "HOT";
    private String TAG_RED_DOT = "RED_DOT";
    private Handler handler = new Handler(Looper.getMainLooper());

    private LaunchableGroupManager() {
    }

    public static LaunchableGroupManager getInstance() {
        if (stageInfoManager == null) {
            synchronized (LaunchableGroupManager.class) {
                if (stageInfoManager == null) {
                    stageInfoManager = new LaunchableGroupManager();
                }
            }
        }
        return stageInfoManager;
    }

    public void fetchLaunchableGroupsWithCodes(final List<String> list, final FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        if (fetchLaunchableGroupsCallback == null) {
            ACLog.e(TAG, "callback is null");
        } else if (list == null || list.size() == 0) {
            ACLog.e(TAG, "stageCodes size should be greater than zero");
            postResultFailed(ERROR_CODE_ARGS_ERROR, "Parameter is invalid", fetchLaunchableGroupsCallback);
        } else if (!RegionRPCConfigCenter.INSTANCE.fetchStageInfoEnabled()) {
            postResultFailed(ERROR_CODE_API_BANED, "API is banned ", fetchLaunchableGroupsCallback);
        } else {
            IAPAsyncTask.asyncTask((Runnable) new Runnable() {
                public void run() {
                    FetchStageInfosResult fetchStageInfo = new FetchStageInfoRepository().fetchStageInfo(list);
                    if (fetchStageInfo == null || !fetchStageInfo.success) {
                        StringBuilder sb = new StringBuilder("BatchQueryByStageCode error: ");
                        sb.append(fetchStageInfo == null ? "" : fetchStageInfo.errorMessage);
                        String obj = sb.toString();
                        MonitorUtil.monitorRPCError(MonitorUtil.FETCH_STAGE_INFO_ERROR, LaunchableGroupManager.ERROR_CODE_FETCH_STAGE, obj);
                        LaunchableGroupManager.this.postResultFailed(LaunchableGroupManager.ERROR_CODE_FETCH_STAGE, obj, fetchLaunchableGroupsCallback);
                        return;
                    }
                    LaunchableGroupManager.this.fetchAppInfoListByIds(fetchStageInfo, fetchLaunchableGroupsCallback);
                }
            });
        }
    }

    public void fetchAppInfoListByIds(final FetchStageInfosResult fetchStageInfosResult, final FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        final HashMap hashMap = new HashMap();
        List appIds = getAppIds(fetchStageInfosResult);
        if (appIds == null) {
            appIds = new ArrayList();
        }
        WebContainer.getInstance("ac_biz").fetchAppInfoListByIds(appIds, new Callback<AppInfoListData>() {
            public void onResultSuccess(AppInfoListData appInfoListData) {
                if (appInfoListData == null || appInfoListData.getAppInfoList() == null || appInfoListData.getAppInfoList().size() == 0) {
                    LaunchableGroupManager.this.posetResultSuccess(hashMap, fetchLaunchableGroupsCallback);
                    return;
                }
                LaunchableGroupManager.this.reassignStageInfo(appInfoListData, fetchStageInfosResult, hashMap);
                LaunchableGroupManager.this.excludeInvalidAppInfo(hashMap);
                LaunchableGroupManager.this.posetResultSuccess(hashMap, fetchLaunchableGroupsCallback);
            }

            public void onResultFailed(int i, String str) {
                String concat = "FetchAppInfosByIds error: ".concat(String.valueOf(str));
                LaunchableGroupManager.this.postResultFailed(LaunchableGroupManager.ERROR_CODE_FETCH_APPINFO, concat, fetchLaunchableGroupsCallback);
                MonitorUtil.monitorRPCError(MonitorUtil.FETCH_STAGE_INFO_ERROR, LaunchableGroupManager.ERROR_CODE_FETCH_APPINFO, concat);
            }
        });
    }

    /* access modifiers changed from: private */
    public void reassignStageInfo(AppInfoListData appInfoListData, FetchStageInfosResult fetchStageInfosResult, Map<String, LaunchableGroup> map) {
        Map<String, StageInfo> map2 = fetchStageInfosResult.stageInfo;
        if (map == null) {
            map = new HashMap<>();
        }
        for (Map.Entry next : map2.entrySet()) {
            if (!(next == null || next.getKey() == null || next.getValue() == null)) {
                LaunchableGroup launchableGroup = new LaunchableGroup();
                map.put((String) next.getKey(), launchableGroup);
                reassignStageInfoInner(launchableGroup, (StageInfo) next.getValue(), appInfoListData.getAppInfoList());
            }
        }
    }

    private void reassignStageInfoInner(LaunchableGroup launchableGroup, StageInfo stageInfo, List<AppInfoData> list) {
        launchableGroup.code = stageInfo.stageCode;
        launchableGroup.displayName = stageInfo.displayName;
        if (stageInfo.contentInfoList != null) {
            ArrayList arrayList = new ArrayList();
            launchableGroup.launchableItems = arrayList;
            Iterator<StageContentInfo> it = stageInfo.contentInfoList.iterator();
            while (it.hasNext()) {
                StageContentInfo next = it.next();
                if (next == null || next.appInfo == null || next.appInfo.appId == null) {
                    it.remove();
                } else {
                    MiniProgramLaunchableItem miniProgramLaunchableItem = new MiniProgramLaunchableItem();
                    reassignAppInfo(miniProgramLaunchableItem, next, list);
                    if (miniProgramLaunchableItem.identifier != null) {
                        arrayList.add(miniProgramLaunchableItem);
                    }
                }
            }
            if (arrayList.size() == 0) {
                launchableGroup.launchableItems = null;
            }
        }
        if (stageInfo.subStageList != null) {
            List<StageInfo> list2 = stageInfo.subStageList;
            ArrayList arrayList2 = new ArrayList();
            for (StageInfo reassignStageInfoInner : list2) {
                LaunchableGroup launchableGroup2 = new LaunchableGroup();
                reassignStageInfoInner(launchableGroup2, reassignStageInfoInner, list);
                arrayList2.add(launchableGroup2);
            }
            if (arrayList2.size() > 0) {
                launchableGroup.launchableGroups = arrayList2;
            }
        }
    }

    private void reassignAppInfo(MiniProgramLaunchableItem miniProgramLaunchableItem, StageContentInfo stageContentInfo, List<AppInfoData> list) {
        StageAppInfo stageAppInfo = stageContentInfo.appInfo;
        for (AppInfoData next : list) {
            if (next != null && next.getAppId() != null && stageAppInfo.appId.equals(next.getAppId())) {
                miniProgramLaunchableItem.introduction = next.getAppDesc();
                miniProgramLaunchableItem.name = next.getAppName();
                miniProgramLaunchableItem.slogan = next.getAppSlogan();
                miniProgramLaunchableItem.releaseVersion = next.getDeployVersion();
                miniProgramLaunchableItem.iconURL = next.getIconUrl();
                miniProgramLaunchableItem.identifier = next.getAppId();
                List<CategoryInfoData> categoryInfos = next.getCategoryInfos();
                ArrayList arrayList = new ArrayList();
                if (categoryInfos != null && categoryInfos.size() > 0) {
                    for (CategoryInfoData next2 : categoryInfos) {
                        if (next2 != null) {
                            LaunchableCategory launchableCategory = new LaunchableCategory();
                            launchableCategory.name = next2.getCategory();
                            launchableCategory.identifier = next2.getCategoryId();
                            arrayList.add(launchableCategory);
                        }
                    }
                    miniProgramLaunchableItem.categories = arrayList;
                }
                if (getIconBadgeLabels(stageContentInfo).size() > 0) {
                    miniProgramLaunchableItem.iconBadgeLabels = getIconBadgeLabels(stageContentInfo);
                    return;
                }
                return;
            }
        }
    }

    private List<String> getIconBadgeLabels(StageContentInfo stageContentInfo) {
        ArrayList arrayList = new ArrayList();
        List<TagInfo> list = stageContentInfo.tagInfo;
        if (list != null) {
            for (TagInfo next : list) {
                if (next != null) {
                    String str = next.tagType;
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != -1034364087) {
                        if (hashCode != 103501) {
                            if (hashCode == 112785 && str.equals("red")) {
                                c = 0;
                            }
                        } else if (str.equals(PerformanceConstant.HOT_START_PREFIX)) {
                            c = 1;
                        }
                    } else if (str.equals("number")) {
                        c = 2;
                    }
                    if (c == 0) {
                        str = this.TAG_RED_DOT;
                    } else if (c == 1) {
                        str = this.TAG_HOT;
                    } else if (c == 2 && next.tagConfig != null) {
                        str = next.tagConfig.get("count");
                    }
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void excludeInvalidAppInfo(Map<String, LaunchableGroup> map) {
        for (LaunchableGroup next : map.values()) {
            if (!(next == null || next.launchableItems == null || next.launchableItems.size() == 0)) {
                Iterator<MiniProgramLaunchableItem> it = next.launchableItems.iterator();
                while (it.hasNext()) {
                    MiniProgramLaunchableItem next2 = it.next();
                    if (next2 == null || next2.identifier == null || next2.name == null) {
                        it.remove();
                    }
                }
            }
        }
    }

    private List<String> getAppIds(FetchStageInfosResult fetchStageInfosResult) {
        ArrayList arrayList = new ArrayList();
        Map<String, StageInfo> map = fetchStageInfosResult.stageInfo;
        if (map == null || map.isEmpty() || map.values() == null) {
            return arrayList;
        }
        for (StageInfo appIdsInner : map.values()) {
            getAppIdsInner(appIdsInner, arrayList);
        }
        return new ArrayList(new LinkedHashSet(arrayList));
    }

    public void getAppIdsInner(StageInfo stageInfo, List<String> list) {
        if (stageInfo == null) {
            return;
        }
        if (stageInfo.contentInfoList != null || stageInfo.subStageList != null) {
            List<StageInfo> list2 = stageInfo.subStageList;
            if (list2 != null) {
                for (StageInfo appIdsInner : list2) {
                    getAppIdsInner(appIdsInner, list);
                }
            }
            List<StageContentInfo> list3 = stageInfo.contentInfoList;
            if (list3 != null) {
                for (StageContentInfo next : list3) {
                    if (!(next == null || next.appInfo == null)) {
                        list.add(next.appInfo.appId);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void posetResultSuccess(final Map<String, LaunchableGroup> map, final FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fetchLaunchableGroupsCallback.onResponse(map);
        } else {
            this.handler.post(new Runnable() {
                public void run() {
                    fetchLaunchableGroupsCallback.onResponse(map);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void postResultFailed(final String str, final String str2, final FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fetchLaunchableGroupsCallback.onFailure(str, str2);
        } else {
            this.handler.post(new Runnable() {
                public void run() {
                    fetchLaunchableGroupsCallback.onFailure(str, str2);
                }
            });
        }
    }
}
