package o;

enum onStopLoading {
    UNKNOWN_EVENT(0),
    HEARTBEAT(1),
    DEX_ENV_ROOT(100),
    DEX_ENV_HOOK(101),
    DEX_ENV_DEBUGGER(102),
    DEX_ENV_EMULATOR(103),
    DEX_APP_TAMPER(104),
    DEX_APP_CERTIFICATE(105),
    DEX_APP_FILE(106),
    DEX_ENV_VIRTUAL_ENV(107);
    
    final int IsOverlapping;

    private onStopLoading(int i) {
        this.IsOverlapping = i;
    }
}
