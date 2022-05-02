package io.split.android.client.service.executor;

import io.split.android.client.dtos.Split;
import java.util.List;
import o.IInitializeComponent;
import o.IMalDetect;
import o.INoCaptchaComponent;
import o.LiteVMParamType;
import o.checkEnvAndFiles;
import o.destroyLiteVMInstance;
import o.getBizId;
import o.initNoCaptcha;
import o.isSoValid;
import o.isTokenExisted;
import o.onDetection;
import o.putNoCaptchaTraceRecord;
import o.reloadLiteVMInstance;

public interface SplitTaskFactory {
    IInitializeComponent createCleanUpDatabaseTask(long j);

    isSoValid createEventsRecorderTask();

    onDetection createFilterSplitsInCacheTask();

    destroyLiteVMInstance createImpressionsCountRecorderTask();

    getBizId createImpressionsRecorderTask();

    LiteVMParamType.PARAM_TYPE createLoadMySegmentsTask();

    INoCaptchaComponent createLoadSplitsTask();

    initNoCaptcha createMySegmentsSyncTask(boolean z);

    IMalDetect.ICallBack createMySegmentsUpdateTask(List<String> list);

    LiteVMParamType createSaveImpressionsCountTask(List<reloadLiteVMInstance> list);

    putNoCaptchaTraceRecord createSplitKillTask(Split split);

    checkEnvAndFiles createSplitsSyncTask(boolean z);

    isTokenExisted createSplitsUpdateTask(long j);
}
