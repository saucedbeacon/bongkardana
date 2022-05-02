package com.alibaba.griver.core.rpc;

import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.constants.GriverErrors;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.rpc.BaseGriverNetwork;
import com.alibaba.griver.base.common.rpc.BaseGriverRpcResult;
import com.alibaba.griver.base.common.rpc.OnRpcResultListener;
import com.alibaba.griver.core.model.aboutinfo.GetAboutInfoRequest;
import com.alibaba.griver.core.model.aboutinfo.GetAboutInfoResult;
import com.alibaba.griver.core.model.applist.AppInfosResult;
import com.alibaba.griver.core.model.applist.FetchAppListResult;
import com.alibaba.griver.core.model.applist.FetchAppsByIdsRequest;
import com.alibaba.griver.core.model.applist.FetchAppsByKeyWordsRequest;
import com.alibaba.griver.core.model.applist.FetchAppsRequest;
import com.alibaba.griver.core.model.applist.FetchAppsResult;
import com.alibaba.griver.core.model.codec.UrlCodecRequest;
import com.alibaba.griver.core.model.codec.UrlCodecResult;
import com.alipay.mobile.common.rpc.RpcException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class a extends BaseGriverNetwork<MiniProgramFacade> {
    public Class getFacadeClass() {
        return MiniProgramFacade.class;
    }

    public void a(final FetchAppsRequest fetchAppsRequest, final OnRpcResultListener onRpcResultListener) {
        if (fetchAppsRequest != null) {
            MonitorMap.Builder builder = new MonitorMap.Builder();
            builder.append("operationType", "alipay.intl.gmp.rpc.app.info.list.query");
            GriverMonitor.event(GriverMonitorConstants.EVENT_RPC_START, "GriverAppContainer", builder.build());
            GriverExecutors.getExecutor(ExecutorType.NETWORK).execute(new Runnable() {
                public void run() {
                    try {
                        FetchAppsResult fetchAppList = ((MiniProgramFacade) a.this.getFacade()).fetchAppList(fetchAppsRequest);
                        if (onRpcResultListener != null) {
                            onRpcResultListener.onResultSuccess(fetchAppList);
                        }
                    } catch (RpcException e) {
                        GriverLogger.e("MiniProgramProcessor", "rpc exception == ", e);
                        OnRpcResultListener onRpcResultListener = onRpcResultListener;
                        if (onRpcResultListener != null) {
                            onRpcResultListener.onResultFailed(e.getCode(), e.getMessage());
                        }
                        MonitorMap.Builder builder = new MonitorMap.Builder();
                        builder.append("operationType", "alipay.intl.gmp.rpc.app.info.list.query").exception(e).code(String.valueOf(e.getCode())).message(GriverMonitorConstants.MESSAGE_FETCH_APPS_ERROR);
                        GriverMonitor.error(GriverMonitorConstants.ERROR_RPC_EXCEPTION, "GriverAppContainer", builder.build());
                    }
                }
            });
        } else if (onRpcResultListener != null) {
            onRpcResultListener.onResultFailed(0, "request is null");
        }
    }

    public void a(List<String> list, final OnRpcResultListener<AppInfosResult> onRpcResultListener) {
        c(list, new OnRpcResultListener<FetchAppListResult>() {
            /* renamed from: a */
            public void onResultSuccess(FetchAppListResult fetchAppListResult) {
                OnRpcResultListener onRpcResultListener = onRpcResultListener;
                if (onRpcResultListener != null) {
                    onRpcResultListener.onResultSuccess(AppInfosResult.convertAppInfos(fetchAppListResult));
                }
            }

            public void onResultFailed(int i, String str) {
                OnRpcResultListener onRpcResultListener = onRpcResultListener;
                if (onRpcResultListener != null) {
                    onRpcResultListener.onResultFailed(i, str);
                }
            }
        });
    }

    private void c(final List<String> list, final OnRpcResultListener<FetchAppListResult> onRpcResultListener) {
        if (list != null && list.size() != 0) {
            GriverExecutors.getExecutor(ExecutorType.NETWORK).execute(new Runnable() {
                public void run() {
                    try {
                        GriverLogger.e("MiniProgramProcessor", "fetchAppInfoListByIds has been invoking first time ");
                        HashSet hashSet = new HashSet();
                        for (Object valueOf : list) {
                            hashSet.add(String.valueOf(valueOf));
                        }
                        FetchAppListResult fetchAppInfoListByIds = ((MiniProgramFacade) a.this.getFacade()).fetchAppInfoListByIds(new FetchAppsByIdsRequest(Arrays.asList(hashSet.toArray(new String[0]))));
                        a.this.a(fetchAppInfoListByIds, fetchAppInfoListByIds.getExceedAppIdList(), 1);
                        if (!fetchAppInfoListByIds.success) {
                            onRpcResultListener.onResultFailed(10000, fetchAppInfoListByIds.errorMessage);
                            return;
                        }
                        fetchAppInfoListByIds.setTotalCount(fetchAppInfoListByIds.getAppInfoList().size());
                        fetchAppInfoListByIds.setDeployAppInfoList(fetchAppInfoListByIds.getAppInfoList());
                        fetchAppInfoListByIds.setExceedAppIdList(new ArrayList());
                        StringBuilder sb = new StringBuilder("repeatGetAppInfoByids result = ");
                        sb.append(JSON.toJSONString(fetchAppInfoListByIds));
                        GriverLogger.e("MiniProgramProcessor", sb.toString());
                        if (onRpcResultListener == null) {
                            return;
                        }
                        if (fetchAppInfoListByIds == null || !fetchAppInfoListByIds.success) {
                            try {
                                onRpcResultListener.onResultFailed(Integer.parseInt(fetchAppInfoListByIds.errorCode), fetchAppInfoListByIds.errorMessage);
                            } catch (NumberFormatException e) {
                                GriverLogger.e("MiniProgramProcessor", "fetchAppInfoListByIds NumberFormatException");
                                onRpcResultListener.onResultFailed(2, e.getMessage());
                            }
                        } else {
                            onRpcResultListener.onResultSuccess((BaseGriverRpcResult) JSON.parseObject(JSON.toJSONString((Object) fetchAppInfoListByIds, SerializerFeature.DisableCircularReferenceDetect), FetchAppListResult.class));
                        }
                    } catch (RpcException e2) {
                        GriverLogger.e("MiniProgramProcessor", "rpc exception == ", e2);
                        OnRpcResultListener onRpcResultListener = onRpcResultListener;
                        if (onRpcResultListener != null) {
                            onRpcResultListener.onResultFailed(GriverErrors.NETWORK_ERROR, e2.getMessage());
                        }
                        MonitorMap.Builder builder = new MonitorMap.Builder();
                        builder.append("operationType", "alipay.intl.gmp.rpc.app.info.list.query fetchAppInfoListByIds").exception(e2).code(String.valueOf(e2.getCode())).message(GriverMonitorConstants.MESSAGE_FETCH_APPS_ERROR);
                        GriverMonitor.error(GriverMonitorConstants.ERROR_FETCH_APP_INFOS, "GriverAppContainer", builder.build());
                    }
                }
            });
        } else if (onRpcResultListener != null) {
            onRpcResultListener.onResultFailed(2, "Invalid parameters");
        }
    }

    public void b(List<String> list, final OnRpcResultListener<FetchAppListResult> onRpcResultListener) {
        c(list, new OnRpcResultListener<FetchAppListResult>() {
            /* renamed from: a */
            public void onResultSuccess(FetchAppListResult fetchAppListResult) {
                if (onRpcResultListener == null) {
                    return;
                }
                if (fetchAppListResult == null || !fetchAppListResult.success) {
                    onRpcResultListener.onResultFailed(fetchAppListResult.hashCode(), fetchAppListResult.errorMessage);
                } else {
                    onRpcResultListener.onResultSuccess(fetchAppListResult);
                }
            }

            public void onResultFailed(int i, String str) {
                onRpcResultListener.onResultFailed(i, str);
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(FetchAppListResult fetchAppListResult, List<String> list, int i) {
        if (list != null && list.size() != 0 && fetchAppListResult != null) {
            StringBuilder sb = new StringBuilder("fetchAppInfoListByIds has been invoking ");
            sb.append(i);
            sb.append(" times");
            GriverLogger.d("MiniProgramProcessor", sb.toString());
            try {
                FetchAppListResult fetchAppInfoListByIds = ((MiniProgramFacade) getFacade()).fetchAppInfoListByIds(new FetchAppsByIdsRequest(list));
                fetchAppListResult.getAppInfoList().addAll(fetchAppInfoListByIds.getAppInfoList());
                if (fetchAppInfoListByIds.getExceedAppIdList() != null) {
                    if (fetchAppInfoListByIds.getExceedAppIdList().size() >= list.size()) {
                        GriverLogger.e("MiniProgramProcessor", "fetchAppInfoListByIds server_unknown_error");
                        fetchAppListResult.success = false;
                        fetchAppListResult.errorCode = "3";
                        fetchAppListResult.errorMessage = "unknown error";
                        return;
                    }
                    a(fetchAppListResult, fetchAppInfoListByIds.getExceedAppIdList(), i + 1);
                }
            } catch (RpcException e) {
                StringBuilder sb2 = new StringBuilder("fetchAppInfoListByIds rpc exception for ");
                sb2.append(i);
                sb2.append(" time , exception == ");
                GriverLogger.e("MiniProgramProcessor", sb2.toString(), e);
                MonitorMap.Builder builder = new MonitorMap.Builder();
                builder.append("operationType", "alipay.intl.gmp.rpc.app.info.list.query repeatGetAppInfoByIds").append("requestCount", String.valueOf(i)).exception(e).code(String.valueOf(e.getCode())).message(GriverMonitorConstants.MESSAGE_FETCH_APPS_ERROR);
                GriverMonitor.error(GriverMonitorConstants.ERROR_FETCH_APP_INFOS, "GriverAppContainer", builder.build());
                fetchAppListResult.success = false;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e.getCode());
                fetchAppListResult.errorCode = sb3.toString();
                fetchAppListResult.errorMessage = e.getMessage();
            }
        } else if (fetchAppListResult != null) {
            fetchAppListResult.setExceedAppIdList(new ArrayList());
        }
    }

    public void a(final FetchAppsByKeyWordsRequest fetchAppsByKeyWordsRequest, final OnRpcResultListener<FetchAppListResult> onRpcResultListener) {
        if (fetchAppsByKeyWordsRequest == null) {
            if (onRpcResultListener != null) {
                onRpcResultListener.onResultFailed(2, "Invalid parameters");
            }
        } else if (fetchAppsByKeyWordsRequest.getKeyword() != null && fetchAppsByKeyWordsRequest.getKeyword().trim().length() != 0) {
            MonitorMap.Builder builder = new MonitorMap.Builder();
            builder.append("operationType", "alipay.intl.gmp.rpc.app.info.search");
            GriverMonitor.event(GriverMonitorConstants.EVENT_RPC_START, "GriverAppContainer", builder.build());
            GriverExecutors.getExecutor(ExecutorType.NETWORK).execute(new Runnable() {
                public void run() {
                    try {
                        FetchAppListResult fetchAppInfoListByKeyword = ((MiniProgramFacade) a.this.getFacade()).fetchAppInfoListByKeyword(fetchAppsByKeyWordsRequest);
                        fetchAppInfoListByKeyword.setDeployAppInfoList(fetchAppInfoListByKeyword.getAppInfoList());
                        if (onRpcResultListener == null) {
                            return;
                        }
                        if (fetchAppInfoListByKeyword == null) {
                            onRpcResultListener.onResultFailed(3, "result is null");
                        } else if (fetchAppInfoListByKeyword.success) {
                            onRpcResultListener.onResultSuccess((BaseGriverRpcResult) JSON.parseObject(JSON.toJSONString((Object) fetchAppInfoListByKeyword, SerializerFeature.DisableCircularReferenceDetect), FetchAppListResult.class));
                        } else {
                            onRpcResultListener.onResultFailed(2, JSON.toJSONString(fetchAppInfoListByKeyword));
                        }
                    } catch (RpcException e) {
                        GriverLogger.e("MiniProgramProcessor", "rpc exception == ", e);
                        OnRpcResultListener onRpcResultListener = onRpcResultListener;
                        if (onRpcResultListener != null) {
                            onRpcResultListener.onResultFailed(e.getCode(), e.getMessage());
                        }
                        MonitorMap.Builder builder = new MonitorMap.Builder();
                        builder.append("operationType", "alipay.intl.gmp.rpc.app.info.search").exception(e).code(String.valueOf(e.getCode())).message(GriverMonitorConstants.MESSAGE_FETCH_APPS_ERROR);
                        GriverMonitor.error(GriverMonitorConstants.ERROR_RPC_EXCEPTION, "GriverAppContainer", builder.build());
                    }
                }
            });
        } else if (onRpcResultListener != null) {
            onRpcResultListener.onResultFailed(2, "parameter keyword can not be null or empty");
        }
    }

    public void a(final GetAboutInfoRequest getAboutInfoRequest, final OnRpcResultListener onRpcResultListener) {
        if (getAboutInfoRequest != null) {
            MonitorMap.Builder builder = new MonitorMap.Builder();
            builder.append("operationType", "alipay.intl.gmp.rpc.miniprogram.about.query").appId(getAboutInfoRequest.getAppId()).version(getAboutInfoRequest.getVersion()).needAsynAppType(true);
            GriverMonitor.event(GriverMonitorConstants.EVENT_RPC_START, "GriverAppContainer", builder.build());
            GriverExecutors.getExecutor(ExecutorType.NETWORK).execute(new Runnable() {
                public void run() {
                    try {
                        GetAboutInfoResult aboutInfo = ((MiniProgramFacade) a.this.getFacade()).getAboutInfo(getAboutInfoRequest);
                        if (onRpcResultListener != null) {
                            onRpcResultListener.onResultSuccess(aboutInfo);
                        }
                    } catch (RpcException e) {
                        GriverLogger.e("MiniProgramProcessor", "rpc exception == ", e);
                        OnRpcResultListener onRpcResultListener = onRpcResultListener;
                        if (onRpcResultListener != null) {
                            onRpcResultListener.onResultFailed(e.getCode(), e.getMessage());
                        }
                        MonitorMap.Builder builder = new MonitorMap.Builder();
                        builder.append("operationType", "alipay.intl.gmp.rpc.miniprogram.about.query").appId(getAboutInfoRequest.getAppId()).version(getAboutInfoRequest.getVersion()).needAsynAppType(true).code(String.valueOf(e.getCode())).message(e.getMessage()).exception(e);
                        GriverMonitor.error(GriverMonitorConstants.ERROR_RPC_EXCEPTION, "GriverAppContainer", builder.build());
                    }
                }
            });
        } else if (onRpcResultListener != null) {
            onRpcResultListener.onResultFailed(0, "request is null");
        }
    }

    public void a(final UrlCodecRequest urlCodecRequest, final OnRpcResultListener onRpcResultListener) {
        if (urlCodecRequest != null) {
            MonitorMap.Builder builder = new MonitorMap.Builder();
            builder.append("operationType", "alipay.intl.gmp.rpc.app.codec.route").url(urlCodecRequest.getCode());
            GriverMonitor.event(GriverMonitorConstants.EVENT_RPC_START, "GriverAppContainer", builder.build());
            GriverExecutors.getExecutor(ExecutorType.NETWORK).execute(new Runnable() {
                public void run() {
                    try {
                        UrlCodecResult urlCodec = ((MiniProgramFacade) a.this.getFacade()).getUrlCodec(urlCodecRequest);
                        if (onRpcResultListener != null) {
                            onRpcResultListener.onResultSuccess(urlCodec);
                        }
                    } catch (RpcException e) {
                        GriverLogger.e("MiniProgramProcessor", "rpc exception == ", e);
                        OnRpcResultListener onRpcResultListener = onRpcResultListener;
                        if (onRpcResultListener != null) {
                            onRpcResultListener.onResultFailed(e.getCode(), e.getMessage());
                        }
                    }
                }
            });
        } else if (onRpcResultListener != null) {
            onRpcResultListener.onResultFailed(0, "request is null");
        }
    }
}
