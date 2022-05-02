package o;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import o.SocketChannelIOHelper;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¨\u0006\n"}, d2 = {"Channel", "Lkotlinx/coroutines/channels/Channel;", "E", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlin/Function1;", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
public final class sendFragmentedFrame {
    public static /* synthetic */ SocketChannelIOHelper getMax(int i, BufferOverflow bufferOverflow, int i2) {
        SocketChannelIOHelper socketChannelIOHelper;
        configureBlocking configureblocking;
        boolean z = false;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        int i3 = 1;
        if (i == -2) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                SocketChannelIOHelper.getMax getmax = SocketChannelIOHelper.a_;
                i3 = SocketChannelIOHelper.getMax.setMin();
            }
            socketChannelIOHelper = new transfereTo(i3, bufferOverflow);
        } else if (i == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                z = true;
            }
            if (z) {
                socketChannelIOHelper = new sendFrame();
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (i == 0) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                configureblocking = new getResourceDescriptor();
            } else {
                configureblocking = new transfereTo(1, bufferOverflow);
            }
            return configureblocking;
        } else if (i == Integer.MAX_VALUE) {
            socketChannelIOHelper = new isConnecting();
        } else if (i == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) {
            socketChannelIOHelper = new sendFrame();
        } else {
            socketChannelIOHelper = new transfereTo(i, bufferOverflow);
        }
        return socketChannelIOHelper;
    }
}
