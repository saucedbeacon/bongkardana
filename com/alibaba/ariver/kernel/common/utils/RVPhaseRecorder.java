package com.alibaba.ariver.kernel.common.utils;

import com.alibaba.ariver.kernel.common.Proxiable;

public interface RVPhaseRecorder extends Proxiable {
    void end();

    void start();

    void startPhase(RVTracePhase rVTracePhase);

    void stopPhase(RVTracePhase rVTracePhase);
}
