package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.pay.screen.AddNewCardFragment;
import o.enableLayers;
import o.getPageSize;

public final class getSavedFileList implements getBindingAdapter<AddNewCardFragment> {
    @InjectedFieldSignature("id.dana.pay.screen.AddNewCardFragment.addNewCardPresenter")
    public static void getMin(AddNewCardFragment addNewCardFragment, enableLayers.setMin setmin) {
        addNewCardFragment.addNewCardPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.pay.screen.AddNewCardFragment.offlinePayPresenter")
    public static void length(AddNewCardFragment addNewCardFragment, getPageSize.setMin setmin) {
        addNewCardFragment.offlinePayPresenter = setmin;
    }
}
