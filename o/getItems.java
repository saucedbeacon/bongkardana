package o;

import javax.inject.Singleton;

final class getItems implements RedDotDrawable {
    private final getTabBarItemColorModel getMax;

    public getItems(getTabBarItemColorModel gettabbaritemcolormodel) {
        this.getMax = gettabbaritemcolormodel;
    }

    public final Object apply(Object obj) {
        return this.getMax.apply(obj);
    }

    @Singleton
    public class core {
        public GriverCommonResourceProxy transform(attach attach) {
            if (attach == null) {
                return null;
            }
            GriverCommonResourceProxy griverCommonResourceProxy = new GriverCommonResourceProxy();
            griverCommonResourceProxy.setUserId(attach.getUserId());
            griverCommonResourceProxy.setNickname(attach.getNickname());
            griverCommonResourceProxy.setAvatarUrl(attach.getAvatarUrl());
            griverCommonResourceProxy.setAmount(attach.getAmount());
            griverCommonResourceProxy.setCurrency(attach.getCurrency());
            griverCommonResourceProxy.setPhoneMask(attach.getPhoneMask());
            griverCommonResourceProxy.setPhoneNumber(attach.getPhoneNumber());
            griverCommonResourceProxy.setSessionId(attach.getSessionId());
            griverCommonResourceProxy.setUUID(attach.getUUID());
            griverCommonResourceProxy.setUsername(attach.getUsername());
            return griverCommonResourceProxy;
        }

        public attach transform(GriverCommonResourceProxy griverCommonResourceProxy) {
            if (griverCommonResourceProxy == null) {
                return null;
            }
            attach attach = new attach();
            attach.setUserId(griverCommonResourceProxy.getUserId());
            attach.setNickname(griverCommonResourceProxy.getNickname());
            attach.setAvatarUrl(griverCommonResourceProxy.getAvatarUrl());
            attach.setAmount(griverCommonResourceProxy.getAmount());
            attach.setCurrency(griverCommonResourceProxy.getCurrency());
            attach.setPhoneMask(griverCommonResourceProxy.getPhoneMask());
            attach.setPhoneNumber(griverCommonResourceProxy.getPhoneNumber());
            attach.setSessionId(griverCommonResourceProxy.getSessionId());
            attach.setUUID(griverCommonResourceProxy.getUUID());
            attach.setUsername(griverCommonResourceProxy.getUsername());
            return attach;
        }
    }
}
