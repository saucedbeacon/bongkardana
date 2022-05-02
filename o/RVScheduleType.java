package o;

import javax.inject.Inject;

public class RVScheduleType extends setSpeed<unmarshall, byteArrayToString> {
    private final isBackgroundRunning couponChannelInfoResultMapper;

    @Inject
    public RVScheduleType(isBackgroundRunning isbackgroundrunning) {
        this.couponChannelInfoResultMapper = isbackgroundrunning;
    }

    /* access modifiers changed from: protected */
    public byteArrayToString map(unmarshall unmarshall) {
        if (unmarshall == null) {
            return null;
        }
        byteArrayToString bytearraytostring = new byteArrayToString();
        bytearraytostring.setCouponChannelInfo(this.couponChannelInfoResultMapper.map(unmarshall.getCouponChannelInfos()));
        return bytearraytostring;
    }
}
