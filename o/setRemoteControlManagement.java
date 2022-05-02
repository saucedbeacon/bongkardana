package o;

import android.content.Context;
import androidx.annotation.NonNull;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class setRemoteControlManagement {
    private static final String FREE_TRANSFER_COUNT = "FREE_TRANSFER_COUNT_";
    private static final String MONTH_OF_FREE_TRANSFER_CHECK = "MONTH_OF_FREE_TRANSFER_CHECK";
    private static final String PROMO_PREFERENCE = "PromoPreferenceproduction";
    private final onSingleFailed preferenceFacade;

    @Inject
    public setRemoteControlManagement(Context context) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(PROMO_PREFERENCE)).createData("local");
    }

    public void setFreeTransferCount(String str, int i) {
        this.preferenceFacade.saveData(getKey(str), Integer.valueOf(i));
    }

    @NonNull
    private String getKey(String str) {
        return FREE_TRANSFER_COUNT.concat(String.valueOf(str));
    }

    public void decrementFreeTransferCount(String str) {
        int freeTransferCount = getFreeTransferCount(str);
        if (freeTransferCount > 0) {
            this.preferenceFacade.saveData(getKey(str), Integer.valueOf(freeTransferCount - 1));
        }
    }

    public int getFreeTransferCount(String str) {
        Integer integer = this.preferenceFacade.getInteger(getKey(str));
        if (integer == null) {
            return 0;
        }
        return integer.intValue();
    }

    public void saveMonthOfFetchFreeTransfer(int i) {
        this.preferenceFacade.saveData(MONTH_OF_FREE_TRANSFER_CHECK, Integer.valueOf(i));
    }

    public int getMonthOfFetchFreeTransfer() {
        return this.preferenceFacade.getInteger(MONTH_OF_FREE_TRANSFER_CHECK).intValue();
    }

    public void clearAll() {
        this.preferenceFacade.clearAllData();
    }
}
