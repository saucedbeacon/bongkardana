package o;

import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import o.OptionMenuRecyclerAdapter;
import o.UniformLocalAuthDialogExtensionImpl;

public final class GriverLocalAuthDialogExtensionImpl implements getAdapterPosition<UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.AnonymousClass1> {

    static final class getMin {
        /* access modifiers changed from: private */
        public static final GriverLocalAuthDialogExtensionImpl length = new GriverLocalAuthDialogExtensionImpl();
    }

    public static GriverLocalAuthDialogExtensionImpl getMax() {
        return getMin.length;
    }

    public final /* synthetic */ Object get() {
        return new Object() {
            public static OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 setMin(FileCache fileCache) {
                if (fileCache == null) {
                    return null;
                }
                String userId = fileCache.getUserId();
                String userName = fileCache.getUserName();
                String avatar = fileCache.getAvatar();
                String review = fileCache.getReview();
                int rating = fileCache.getRating();
                long modifyDate = fileCache.getModifyDate();
                long createdDate = fileCache.getCreatedDate();
                Iterable images = fileCache.getImages();
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(images, 10));
                Iterator it = images.iterator();
                while (it.hasNext()) {
                    getUtdid getutdid = (getUtdid) it.next();
                    Iterator it2 = it;
                    MerchantImageModel merchantImageModel = r12;
                    MerchantImageModel merchantImageModel2 = new MerchantImageModel(getutdid.getUserId(), getutdid.getUserName(), getutdid.getAvatar(), getutdid.getImageUrl(), 0, 16);
                    arrayList.add(merchantImageModel);
                    it = it2;
                }
                return new OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1(userId, userName, avatar, review, rating, modifyDate, createdDate, (List) arrayList);
            }
        };
    }
}
