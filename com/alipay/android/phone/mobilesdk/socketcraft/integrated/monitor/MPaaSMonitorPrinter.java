package com.alipay.android.phone.mobilesdk.socketcraft.integrated.monitor;

import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorModel;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.DefaultMonitorPrinter;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.DataflowID;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.common.logging.api.monitor.Performance;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.monitor.api.MonitorFactory;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;

public class MPaaSMonitorPrinter extends DefaultMonitorPrinter {
    private static final String TAG = "MonitorPrinter";

    public void print(MonitorModel monitorModel) {
        try {
            if (monitorModel.itemMap.isEmpty()) {
                SCLogCatUtil.info(TAG, "itemMap is empty!");
                return;
            }
            Performance performance = new Performance();
            performance.setSubType(MonitorItemConstants.MONITOR_SUB_TYPE);
            performance.setParam1(MonitorItemConstants.PARTITION_NAME);
            performance.setParam2(MonitorItemConstants.LEVEL_INFO);
            performance.setParam3(monitorModel.logTitle);
            monitorModel.itemMap.entrySet();
            for (Map.Entry next : monitorModel.itemMap.entrySet()) {
                performance.getExtPramas().put(next.getKey(), next.getValue());
            }
            LoggerFactory.getMonitorLogger().performance(LogCategory.CATEGORY_NETWORK, performance);
            StringBuilder sb = new StringBuilder();
            sb.append(performance.getSubType());
            sb.append("_PERF");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(toPerformanceString(performance));
            sb2.append("\n");
            SCLogCatUtil.debug(obj, sb2.toString());
        } catch (Throwable th) {
            SCLogCatUtil.error(TAG, "monitorLog exception. ", th);
        }
    }

    public void noteTraficConsume(DataflowMonitorModel dataflowMonitorModel) {
        if (dataflowMonitorModel == null) {
            try {
                SCLogCatUtil.warn(TAG, "[noteTraficConsume] dataflowMonitorModel is null");
            } catch (Throwable th) {
                SCLogCatUtil.error(TAG, "[noteTraficConsume] exception. ", th);
            }
        } else {
            if (dataflowMonitorModel.methodName != null) {
                if (dataflowMonitorModel.methodName.trim().length() > 0) {
                    DataflowModel obtain = DataflowModel.obtain(DataflowID.WEB_SOCKET, dataflowMonitorModel.url, (long) dataflowMonitorModel.sendSize, (long) dataflowMonitorModel.receiveSize, dataflowMonitorModel.methodName);
                    obtain.appId = dataflowMonitorModel.ownerId;
                    if (DataflowMonitorModel.METHOD_NAME_SEND.equals(dataflowMonitorModel.methodName)) {
                        obtain.isUpload = true;
                    }
                    MonitorFactory.getMonitorContext().noteTraficConsume(obtain);
                    if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                        StringBuilder sb = new StringBuilder("[noteTraficConsume]  dataflowMonitorModel: ");
                        sb.append(dataflowMonitorModel.toString());
                        SCLogCatUtil.info(TAG, sb.toString());
                        return;
                    }
                    return;
                }
            }
            SCLogCatUtil.warn(TAG, "[noteTraficConsume] methodName is empty.");
        }
    }

    public String toPerformanceString(Performance performance) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(performance.getSubType());
        stringBuffer.append(",");
        stringBuffer.append(performance.getParam1());
        stringBuffer.append(",");
        stringBuffer.append(performance.getParam2());
        stringBuffer.append(",");
        stringBuffer.append(performance.getParam3());
        stringBuffer.append(",");
        for (String str : performance.getExtPramas().keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append((String) performance.getExtPramas().get(str));
            sb.append("^");
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }
}
