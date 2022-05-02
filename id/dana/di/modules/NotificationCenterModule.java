package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.getCarrierName;
import o.getPhoneNumber;

@Module
public class NotificationCenterModule {
    private getCarrierName.setMax setMin;

    @Provides
    public getCarrierName.length setMax(getPhoneNumber getphonenumber) {
        return getphonenumber;
    }

    public NotificationCenterModule(getCarrierName.setMax setmax) {
        this.setMin = setmax;
    }

    @Provides
    public getCarrierName.setMax length() {
        return this.setMin;
    }
}
