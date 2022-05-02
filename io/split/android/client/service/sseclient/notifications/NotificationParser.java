package io.split.android.client.service.sseclient.notifications;

import androidx.annotation.NonNull;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import o.IUMIDInitListenerEx;
import o.createLoadingDialog;

public class NotificationParser {
    private static final String EVENT_TYPE_ERROR = "error";
    private static final String EVENT_TYPE_FIELD = "event";

    @NonNull
    public IncomingNotification parseIncoming(String str) throws JsonSyntaxException {
        try {
            RawNotification rawNotification = (RawNotification) IUMIDInitListenerEx.fromJson(str, RawNotification.class);
            try {
                NotificationType type = ((IncomingNotificationType) IUMIDInitListenerEx.fromJson(rawNotification.getData(), IncomingNotificationType.class)).getType();
                if (type == null) {
                    type = NotificationType.OCCUPANCY;
                }
                return new IncomingNotification(type, rawNotification.getChannel(), rawNotification.getData(), rawNotification.getTimestamp());
            } catch (JsonSyntaxException e) {
                StringBuilder sb = new StringBuilder("Error parsing notification: ");
                sb.append(e.getLocalizedMessage());
                createLoadingDialog.e(sb.toString());
                return null;
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder("Unexpected error while parsing incomming notification: ");
                sb2.append(e2.getLocalizedMessage());
                createLoadingDialog.e(sb2.toString());
                return null;
            }
        } catch (JsonSyntaxException e3) {
            StringBuilder sb3 = new StringBuilder("Unexpected error while parsing raw notification: ");
            sb3.append(e3.getLocalizedMessage());
            createLoadingDialog.e(sb3.toString());
            return null;
        }
    }

    @NonNull
    public SplitsChangeNotification parseSplitUpdate(String str) throws JsonSyntaxException {
        return (SplitsChangeNotification) IUMIDInitListenerEx.fromJson(str, SplitsChangeNotification.class);
    }

    @NonNull
    public SplitKillNotification parseSplitKill(String str) throws JsonSyntaxException {
        return (SplitKillNotification) IUMIDInitListenerEx.fromJson(str, SplitKillNotification.class);
    }

    public MySegmentChangeNotification parseMySegmentUpdate(String str) throws JsonSyntaxException {
        return (MySegmentChangeNotification) IUMIDInitListenerEx.fromJson(str, MySegmentChangeNotification.class);
    }

    public OccupancyNotification parseOccupancy(String str) throws JsonSyntaxException {
        return (OccupancyNotification) IUMIDInitListenerEx.fromJson(str, OccupancyNotification.class);
    }

    public ControlNotification parseControl(String str) throws JsonSyntaxException {
        return (ControlNotification) IUMIDInitListenerEx.fromJson(str, ControlNotification.class);
    }

    public StreamingError parseError(String str) throws JsonSyntaxException {
        return (StreamingError) IUMIDInitListenerEx.fromJson(str, StreamingError.class);
    }

    public boolean isError(Map<String, String> map) {
        return map != null && "error".equals(map.get("event"));
    }
}
