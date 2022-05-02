package com.alipay.android.phone.mobilesdk.socketcraft.monitor;

import com.alipay.android.phone.mobilesdk.socketcraft.api.DefaultWebSocketClient;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.MonitorPrinterFactory;
import com.alipay.android.phone.mobilesdk.socketcraft.util.StringUtils;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class MonitorHelper {
    private SimpleStatistical simpleStatistical;
    private DefaultWebSocketClient webSocketClient;

    public MonitorHelper(DefaultWebSocketClient defaultWebSocketClient) {
        this.webSocketClient = defaultWebSocketClient;
    }

    public void printConnMonitorLog() {
        getSimpleStatistical().endConnAllTime = System.currentTimeMillis();
        MonitorModel createMonitorModel = createMonitorModel(MonitorItemConstants.WS_MONITOR_TITLE_CONN);
        createMonitorModel.appendDnsTime(String.valueOf(getSimpleStatistical().dnsTime));
        createMonitorModel.appendTcpTime(String.valueOf(getSimpleStatistical().tcpTime));
        createMonitorModel.appendSSLTime(String.valueOf(getSimpleStatistical().sslTime));
        createMonitorModel.appendWsHsTime(String.valueOf(getSimpleStatistical().wsHsTime));
        createMonitorModel.appendTargetHost(getSimpleStatistical().targetHost);
        createMonitorModel.appendAllTime(String.valueOf(getSimpleStatistical().getConnAllTime()));
        createMonitorModel.appendResult(true);
        MonitorPrinterFactory.getInstance().print(createMonitorModel);
    }

    public void printDisconnMonitorLog() {
        getSimpleStatistical().disconnectedTime = System.currentTimeMillis();
        MonitorModel createMonitorModel = createMonitorModel(MonitorItemConstants.WS_MONITOR_TITLE_DISCONN);
        createMonitorModel.appendDownMsgCount(String.valueOf(getSimpleStatistical().recvMsgCount));
        createMonitorModel.appendDownMsgLens(String.valueOf(getSimpleStatistical().recvMsgLenArray));
        createMonitorModel.appendUpMsgCount(String.valueOf(getSimpleStatistical().sendMsgCount));
        createMonitorModel.appendUpMsgLens(String.valueOf(getSimpleStatistical().sendMsgLenArray));
        createMonitorModel.appendLiveTime(String.valueOf(getSimpleStatistical().getLinkLiveTime()));
        MonitorPrinterFactory.getInstance().print(createMonitorModel);
        this.simpleStatistical = null;
    }

    public void printErrorMonitorLog(String str, String str2) {
        MonitorModel createMonitorModel = createMonitorModel("error");
        createMonitorModel.appendCode(str);
        createMonitorModel.appendErrMsg(str2);
        MonitorPrinterFactory.getInstance().print(createMonitorModel);
    }

    public MonitorModel createMonitorModel(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(2127515575, oncanceled);
            onCancelLoad.getMin(2127515575, oncanceled);
        }
        MonitorModel monitorModel = new MonitorModel();
        monitorModel.logTitle = str;
        monitorModel.appendAppId(this.webSocketClient.getBizUniqId());
        monitorModel.appendUrl(this.webSocketClient.getUrl());
        return monitorModel;
    }

    public void recordMonitorOfRecvMsg(int i) {
        SimpleStatistical simpleStatistical2 = getSimpleStatistical();
        simpleStatistical2.recvMsgCount++;
        if (simpleStatistical2.recvMsgLenArray == null || simpleStatistical2.recvMsgLenArray.length() <= 0) {
            simpleStatistical2.recvMsgLenArray = String.valueOf(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(simpleStatistical2.recvMsgLenArray);
        sb.append("_");
        sb.append(i);
        simpleStatistical2.recvMsgLenArray = sb.toString();
    }

    public void recordMonitorOfSndMsg(int i) {
        SimpleStatistical simpleStatistical2 = getSimpleStatistical();
        simpleStatistical2.sendMsgCount++;
        if (simpleStatistical2.sendMsgLenArray == null || simpleStatistical2.sendMsgLenArray.length() <= 0) {
            simpleStatistical2.sendMsgLenArray = String.valueOf(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(simpleStatistical2.sendMsgLenArray);
        sb.append("_");
        sb.append(i);
        simpleStatistical2.sendMsgLenArray = sb.toString();
    }

    public SimpleStatistical getSimpleStatistical() {
        SimpleStatistical simpleStatistical2 = this.simpleStatistical;
        if (simpleStatistical2 != null) {
            return simpleStatistical2;
        }
        SimpleStatistical simpleStatistical3 = new SimpleStatistical();
        this.simpleStatistical = simpleStatistical3;
        return simpleStatistical3;
    }

    public void recordStartConnAllTime() {
        getSimpleStatistical().startConnAllTime = System.currentTimeMillis();
    }

    public void recordConnectedTime() {
        getSimpleStatistical().connectedTime = System.currentTimeMillis();
    }

    public void recordDnsTime(long j) {
        if (j > 0) {
            getSimpleStatistical().dnsTime = j;
        }
    }

    public void recordTargetHost(String str) {
        if (!StringUtils.isEmpty(str) && !"null".equals(str)) {
            getSimpleStatistical().targetHost = str;
        }
    }

    public void recordTcpTime(long j) {
        if (j > 0) {
            getSimpleStatistical().tcpTime = j;
        }
    }

    public void recordSSLTime(long j) {
        if (j > 0) {
            getSimpleStatistical().sslTime = j;
        }
    }

    public void recordWsHsTime(long j) {
        if (j > 0) {
            getSimpleStatistical().wsHsTime = j;
        }
    }

    public final void noteTraficConsume(DataflowMonitorModel dataflowMonitorModel) {
        MonitorPrinterFactory.getInstance().noteTraficConsume(dataflowMonitorModel);
    }
}
