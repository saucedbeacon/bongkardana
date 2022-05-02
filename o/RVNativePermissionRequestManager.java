package o;

import java.util.ArrayList;
import java.util.List;

public class RVNativePermissionRequestManager extends setSpeed<loadApp, onEmbedViewDestory> {
    public onEmbedViewDestory apply(loadApp loadapp) {
        return map(loadapp);
    }

    /* access modifiers changed from: protected */
    public onEmbedViewDestory map(loadApp loadapp) {
        if (loadapp == null) {
            return null;
        }
        onEmbedViewDestory onembedviewdestory = new onEmbedViewDestory();
        onembedviewdestory.setMaxId(loadapp.getMaxId());
        onembedviewdestory.setMinId(loadapp.getMinId());
        onembedviewdestory.setHasMore(loadapp.isHasMore());
        if (loadapp.getActivities() == null || loadapp.getActivities().isEmpty()) {
            return onembedviewdestory;
        }
        onembedviewdestory.setActivities(transform(loadapp.getActivities()));
        return onembedviewdestory;
    }

    private List<shouldOverrideUrlLoadingForUC> transform(List<setHeaders> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (setHeaders transform : list) {
            arrayList.add(transform(transform));
        }
        return arrayList;
    }

    private shouldOverrideUrlLoadingForUC transform(setHeaders setheaders) {
        if (setheaders == null) {
            return null;
        }
        shouldOverrideUrlLoadingForUC shouldoverrideurlloadingforuc = new shouldOverrideUrlLoadingForUC();
        shouldoverrideurlloadingforuc.setTargetNickname(setheaders.getTargetNickname());
        shouldoverrideurlloadingforuc.setCreatedTime(setheaders.getCreatedTime());
        shouldoverrideurlloadingforuc.setContent(setheaders.getContent());
        shouldoverrideurlloadingforuc.setVerb(setheaders.getVerb());
        shouldoverrideurlloadingforuc.setBizType(setheaders.getBizType());
        shouldoverrideurlloadingforuc.setActorNickname(setheaders.getActorNickname());
        shouldoverrideurlloadingforuc.setActivityId(setheaders.getActivityId());
        shouldoverrideurlloadingforuc.setActorAvatar(setheaders.getActorAvatar());
        shouldoverrideurlloadingforuc.setClickable(setheaders.isClickable());
        shouldoverrideurlloadingforuc.setRedirectUrl(setheaders.getRedirectUrl());
        shouldoverrideurlloadingforuc.setActivityTitle(setheaders.getActivityTitle());
        shouldoverrideurlloadingforuc.setActivityContent(setheaders.getActivityContent());
        shouldoverrideurlloadingforuc.setFeedType(setheaders.getFeedType());
        shouldoverrideurlloadingforuc.setImageUrl(setheaders.getImageUrl());
        return shouldoverrideurlloadingforuc;
    }
}
