package o;

import o.b;

public final class getExtendInfos implements getAdapterPosition<setExtendInfos> {
    private final b.C0007b<setLaunchParams> userConfigPreferenceProvider;

    public getExtendInfos(b.C0007b<setLaunchParams> bVar) {
        this.userConfigPreferenceProvider = bVar;
    }

    public final setExtendInfos get() {
        return newInstance(this.userConfigPreferenceProvider.get());
    }

    public static getExtendInfos create(b.C0007b<setLaunchParams> bVar) {
        return new getExtendInfos(bVar);
    }

    public static setExtendInfos newInstance(setLaunchParams setlaunchparams) {
        return new setExtendInfos(setlaunchparams);
    }
}
