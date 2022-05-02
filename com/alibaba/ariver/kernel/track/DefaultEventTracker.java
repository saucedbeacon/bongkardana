package com.alibaba.ariver.kernel.track;

import android.os.SystemClock;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.track.Event;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Map;

public class DefaultEventTracker implements EventTracker {
    public void logPageAbnormal(Node node) {
    }

    public Event stub(Node node, String str) {
        return stub(node, str, SystemClock.elapsedRealtime());
    }

    public Event stub(Node node, String str, long j) {
        RVLogger.d("AriverKernel:EventTracker", "EventTracker stub ".concat(String.valueOf(str)));
        Event.Stub stub = new Event.Stub(j);
        stub.setTrackId(str);
        return stub;
    }

    public Event cost(Node node, String str, long j) {
        RVLogger.d("AriverKernel:EventTracker", "EventTracker cost ".concat(String.valueOf(str)));
        Event.Cost cost = new Event.Cost(j);
        cost.setTrackId(str);
        return cost;
    }

    public Event error(Node node, String str, String str2) {
        RVLogger.d("AriverKernel:EventTracker", "EventTracker error ".concat(String.valueOf(str)));
        Event.Error error = new Event.Error(str2);
        error.setTrackId(str);
        return error;
    }

    public Event whiteScreen(Node node, String str, String str2, Map<String, Object> map) {
        RVLogger.d("AriverKernel:EventTracker", "EventTracker whiteScreen ".concat(String.valueOf(str)));
        return null;
    }

    public Event whiteScreen(Node node, String str, String str2, String str3, Map<String, Object> map) {
        RVLogger.d("AriverKernel:EventTracker", "EventTracker whiteScreen ".concat(String.valueOf(str)));
        return null;
    }

    public Event whiteScreen(String str, String str2, Map<String, Object> map) {
        RVLogger.d("AriverKernel:EventTracker", "EventTracker whiteScreen ".concat(String.valueOf(str)));
        return null;
    }

    public Event interceptLoad(Node node, String str, Map<String, Object> map) {
        RVLogger.d("AriverKernel:EventTracker", "EventTracker interceptLoad ".concat(String.valueOf(str)));
        return null;
    }

    public void event(Node node, Event event) {
        RVLogger.d("AriverKernel:EventTracker", "EventTracker event ".concat(String.valueOf(event)));
    }

    public void addAttr(Node node, String str, String str2) {
        StringBuilder sb = new StringBuilder("EventTracker addAttr ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        RVLogger.d("AriverKernel:EventTracker", sb.toString());
    }
}
