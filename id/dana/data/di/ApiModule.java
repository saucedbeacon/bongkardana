package id.dana.data.di;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import o.BackPressedPoint;
import o.TabStateListDrawable;
import o.UtdidDeviceIdProvider;
import o.addAnimatorListener;
import o.addEvent2Performance;
import o.addInfo;
import o.b;
import o.com_alibaba_ariver_app_api_ExtOpt$82$1;
import o.copyData;
import o.decode;
import o.finish;
import o.getNbUrl;
import o.getTextColor;
import o.isAtBottom;
import o.isDebugPanelExists;
import o.setAttrData;
import o.setBadgeColor;
import o.setBadgeSize;
import o.setExtUrl;
import o.setSelectedColor;

@Module
public class ApiModule {
    @Singleton
    @Provides
    public isAtBottom provideUserApi(UtdidDeviceIdProvider.getMin getmin) {
        return (isAtBottom) getmin.setMax("https://m.dana.id").getMax().setMin(isAtBottom.class);
    }

    @Singleton
    @Provides
    public decode provideNameCheckApi(@Named("SECURED_RETROFIT_NAMECHECK") UtdidDeviceIdProvider.getMin getmin) {
        return (decode) getmin.setMax("https://sec.m.dana.id").getMax().setMin(decode.class);
    }

    @Singleton
    @Provides
    public setAttrData provideConvertCardIndexNoApi(@Named("SECURED_RETROFIT") UtdidDeviceIdProvider.getMin getmin) {
        return (setAttrData) getmin.setMax("https://sec.m.dana.id").getMax().setMin(setAttrData.class);
    }

    @Singleton
    @Provides
    public finish provideBranchIoApi(@Named("SECURED_RETROFIT") UtdidDeviceIdProvider.getMin getmin) {
        return (finish) getmin.setMax("https://api2.branch.io/v1/").getMax().setMin(finish.class);
    }

    @Singleton
    @Provides
    public setExtUrl provideUserEmailAddressApi(UtdidDeviceIdProvider.getMin getmin) {
        return (setExtUrl) getmin.setMax("https://m.dana.id").getMax().setMin(setExtUrl.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Provides
    public TabStateListDrawable provideIpgRegistrationUrlApi(UtdidDeviceIdProvider.getMin getmin) {
        return (TabStateListDrawable) getmin.setMax("https://m.dana.id").getMax().setMin(TabStateListDrawable.class);
    }

    @Singleton
    @Provides
    public b.AnonymousClass8 provideBokuApi(UtdidDeviceIdProvider.getMin getmin) {
        return (b.AnonymousClass8) getmin.getMax().setMin(b.AnonymousClass8.class);
    }

    @Singleton
    @Provides
    public BackPressedPoint provideGeocoderApi(UtdidDeviceIdProvider.getMin getmin) {
        return (BackPressedPoint) getmin.setMax("https://maps.googleapis.com/").getMax().setMin(BackPressedPoint.class);
    }

    @Singleton
    @Provides
    public addAnimatorListener provideDanaCdnApi(UtdidDeviceIdProvider.getMin getmin) {
        return (addAnimatorListener) getmin.getMax().setMin(addAnimatorListener.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Provides
    public copyData provideNearbyPlacesApi(UtdidDeviceIdProvider.getMin getmin) {
        return (copyData) getmin.setMax("https://maps.googleapis.com/maps/api/").getMax().setMin(copyData.class);
    }

    @Singleton
    @Provides
    public com_alibaba_ariver_app_api_ExtOpt$82$1 provideLoyaltyApi(@Named("SECURED_RETROFIT") UtdidDeviceIdProvider.getMin getmin) {
        return (com_alibaba_ariver_app_api_ExtOpt$82$1) getmin.setMax("https://gateway-loyalty.dana.id").getMax().setMin(com_alibaba_ariver_app_api_ExtOpt$82$1.class);
    }

    @Singleton
    @Provides
    public addInfo provideCardQueryNoPrefixApi(UtdidDeviceIdProvider.getMin getmin) {
        return (addInfo) getmin.setMax("https://m.dana.id").getMax().setMin(addInfo.class);
    }

    @Singleton
    @Provides
    public setBadgeSize provideHereGeocodeApi(UtdidDeviceIdProvider.getMin getmin) {
        return (setBadgeSize) getmin.setMax("https://revgeocode.search.hereapi.com").getMax().setMin(setBadgeSize.class);
    }

    @Singleton
    @Provides
    public getTextColor provideHereAutocompleteApi(UtdidDeviceIdProvider.getMin getmin) {
        return (getTextColor) getmin.setMax("https://autosuggest.search.hereapi.com").getMax().setMin(getTextColor.class);
    }

    @Singleton
    @Provides
    public setBadgeColor provideHereLookupById(UtdidDeviceIdProvider.getMin getmin) {
        return (setBadgeColor) getmin.setMax("https://lookup.search.hereapi.com").getMax().setMin(setBadgeColor.class);
    }

    @Singleton
    @Provides
    public setSelectedColor provideHereTokenApi(UtdidDeviceIdProvider.getMin getmin) {
        return (setSelectedColor) getmin.setMax("https://account.api.here.com").getMax().setMin(setSelectedColor.class);
    }

    @Singleton
    @Provides
    public getNbUrl provideZendeskApi(UtdidDeviceIdProvider.getMin getmin) {
        return (getNbUrl) getmin.setMax("https://dana.zendesk.com").getMax().setMin(getNbUrl.class);
    }

    @Singleton
    @Provides
    public addEvent2Performance provideExploreDanaApi(UtdidDeviceIdProvider.getMin getmin) {
        return (addEvent2Performance) getmin.setMax("https://a.m.dana.id/resource/json/").getMax().setMin(addEvent2Performance.class);
    }

    @Singleton
    @Provides
    public isDebugPanelExists provideProductInfoFacade(@Named("SECURED_RETROFIT") UtdidDeviceIdProvider.getMin getmin) {
        return (isDebugPanelExists) getmin.setMax("https://m.dana.id").getMax().setMin(isDebugPanelExists.class);
    }
}
