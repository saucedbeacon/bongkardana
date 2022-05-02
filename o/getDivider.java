package o;

import o.b;

public final class getDivider implements getAdapterPosition<showBackButton> {
    private final b.C0007b<unRegisterAppHandler> maintenanceBroadcastPreferenceProvider;

    public getDivider(b.C0007b<unRegisterAppHandler> bVar) {
        this.maintenanceBroadcastPreferenceProvider = bVar;
    }

    public final showBackButton get() {
        return newInstance(this.maintenanceBroadcastPreferenceProvider.get());
    }

    public static getDivider create(b.C0007b<unRegisterAppHandler> bVar) {
        return new getDivider(bVar);
    }

    public static showBackButton newInstance(unRegisterAppHandler unregisterapphandler) {
        return new showBackButton(unregisterapphandler);
    }
}
