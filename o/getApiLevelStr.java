package o;

import android.content.Context;
import o.b;

public final class getApiLevelStr implements getAdapterPosition<getApiLevelList> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<handleMessage> amcsConfigProvider;
    private final b.C0007b<getPermissions> contactDeviceNameMapperProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<setCtuExtInfo> networkRelationshipEntityDataProvider;
    private final b.C0007b<getSuccessScopes> persistenceRelationshipEntityDataProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;
    private final b.C0007b<setApiLevelStr> socialMediaDataFactoryProvider;
    private final b.C0007b<getCurrentLongitudeAndLatitude> socialPreferencesProvider;
    private final b.C0007b<getOrigin> userConfigRepositoryProvider;

    public getApiLevelStr(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getSuccessScopes> bVar5, b.C0007b<setCtuExtInfo> bVar6, b.C0007b<getCurrentLongitudeAndLatitude> bVar7, b.C0007b<getOrigin> bVar8, b.C0007b<handleMessage> bVar9, b.C0007b<getPermissions> bVar10, b.C0007b<setApiLevelStr> bVar11, b.C0007b<PluginInstallCallback> bVar12, b.C0007b<Context> bVar13) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.persistenceRelationshipEntityDataProvider = bVar5;
        this.networkRelationshipEntityDataProvider = bVar6;
        this.socialPreferencesProvider = bVar7;
        this.userConfigRepositoryProvider = bVar8;
        this.amcsConfigProvider = bVar9;
        this.contactDeviceNameMapperProvider = bVar10;
        this.socialMediaDataFactoryProvider = bVar11;
        this.serializerProvider = bVar12;
        this.contextProvider = bVar13;
    }

    public final getApiLevelList get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.persistenceRelationshipEntityDataProvider.get(), this.networkRelationshipEntityDataProvider.get(), this.socialPreferencesProvider.get(), this.userConfigRepositoryProvider.get(), this.amcsConfigProvider.get(), this.contactDeviceNameMapperProvider.get(), this.socialMediaDataFactoryProvider.get(), this.serializerProvider.get(), this.contextProvider.get());
    }

    public static getApiLevelStr create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getSuccessScopes> bVar5, b.C0007b<setCtuExtInfo> bVar6, b.C0007b<getCurrentLongitudeAndLatitude> bVar7, b.C0007b<getOrigin> bVar8, b.C0007b<handleMessage> bVar9, b.C0007b<getPermissions> bVar10, b.C0007b<setApiLevelStr> bVar11, b.C0007b<PluginInstallCallback> bVar12, b.C0007b<Context> bVar13) {
        return new getApiLevelStr(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13);
    }

    public static getApiLevelList newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r16, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, getSuccessScopes getsuccessscopes, setCtuExtInfo setctuextinfo, getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude, getOrigin getorigin, handleMessage handlemessage, getPermissions getpermissions, setApiLevelStr setapilevelstr, PluginInstallCallback pluginInstallCallback, Context context) {
        return new getApiLevelList(dialogLayout, r16, backKeyDownPoint, getapplaunchparams, getsuccessscopes, setctuextinfo, getcurrentlongitudeandlatitude, getorigin, handlemessage, getpermissions, setapilevelstr, pluginInstallCallback, context);
    }
}
