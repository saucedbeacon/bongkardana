package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class OnConfirmListener {
    public final List<setOnConfirmListener> getMin;
    private final List<WsMessageConstants> length;
    private final List<setOkButtonText> setMax;
    private final getInnerWebSocketContext setMin;

    public interface getMax extends appendDownMsgLens {
        void getMin(length length);
    }

    public /* synthetic */ OnConfirmListener(length length2, byte b) {
        this(length2);
    }

    private OnConfirmListener(length length2) {
        this.getMin = systemOut.setMax(length2.length, length2.getMax);
        this.setMin = length2.getMin;
        this.length = length2.setMin;
        this.setMax = length2.setMax;
        setMax();
    }

    public final asciiBytes setMax() {
        if (this.setMin == null) {
            return new exception2String(this.setMax);
        }
        new getMin(this.setMax);
        return this.setMin.getMin();
    }

    public final Base64$OutputStream length(Base64$OutputStream base64$OutputStream) {
        for (WsMessageConstants min : this.length) {
            base64$OutputStream = min.setMin();
        }
        return base64$OutputStream;
    }

    class getMin {
        private List<setOkButtonText> getMax;

        getMin(List<setOkButtonText> list) {
            this.getMax = list;
        }
    }

    public static class length {
        Set<Class<? extends SCNetworkAsyncTaskExecutorFactory>> getMax = systemOut.getMin();
        getInnerWebSocketContext getMin = null;
        public final List<setOnConfirmListener> length = new ArrayList();
        public final List<setOkButtonText> setMax = new ArrayList();
        final List<WsMessageConstants> setMin = new ArrayList();

        public final length length(Iterable<? extends appendDownMsgLens> iterable) {
            for (appendDownMsgLens appenddownmsglens : iterable) {
                if (appenddownmsglens instanceof getMax) {
                    ((getMax) appenddownmsglens).getMin(this);
                }
            }
            return this;
        }
    }
}
