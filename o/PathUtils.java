package o;

import android.view.ViewGroup;
import id.dana.sendmoney.contact.all.ContactViewHolder;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import o.convertDipToPx;

public final class PathUtils extends ContactViewHolder {
    public final /* synthetic */ void setMax(Object obj) {
        this.contactRichView.init((RecipientViewModel) obj, setMin());
        this.contactRichView.setOnClickListener(new extractPath(this));
    }

    /* renamed from: o.PathUtils$1  reason: invalid class name */
    public final class AnonymousClass1 extends ContactViewHolder {
        private String getMax;

        public final /* bridge */ /* synthetic */ void setMax(Object obj) {
            setMax((RecipientViewModel) obj);
        }

        public AnonymousClass1(ViewGroup viewGroup, setPhotoIndex setphotoindex, List<String> list) {
            super(viewGroup, setphotoindex, list);
        }

        public AnonymousClass1(ViewGroup viewGroup, setPhotoIndex setphotoindex, List<String> list, IComponent<List<String>> iComponent, List<String> list2) {
            super(viewGroup, setphotoindex, list, iComponent, list2);
        }

        public final void setMax(RecipientViewModel recipientViewModel) {
            this.contactRichView.enableInvite();
            this.contactRichView.init(recipientViewModel, setMin());
            this.contactRichView.setOnClickListener(new getDjangoNearestImageSize(this));
        }

        public final ContactViewHolder setMin(String str) {
            int length = str.length();
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1541275727, oncanceled);
                onCancelLoad.getMin(-1541275727, oncanceled);
            }
            this.getMax = str;
            return this;
        }

        static /* synthetic */ void getMax(AnonymousClass1 r3) {
            convertDipToPx.length length = new convertDipToPx.length(r3.length);
            length.getMax = TrackerKey.Event.REFERRER_INVITE_ATTEMPT;
            convertDipToPx.length max = length.setMax(TrackerKey.Property.INVITE_TYPE, TrackerKey.InviteType.USER_CONTACT);
            max.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
            List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            RecipientModel selectedRecipient = r3.contactRichView.getSelectedRecipient();
            selectedRecipient.invokeSuspend = RecipientSource.ALL_CONTACTS;
            r3.getMax().onRecipientSelected(selectedRecipient);
        }
    }

    public PathUtils(ViewGroup viewGroup, setPhotoIndex setphotoindex, List<String> list) {
        super(viewGroup, setphotoindex, list);
    }

    public final void setMax(RecipientViewModel recipientViewModel) {
        this.contactRichView.init(recipientViewModel, setMin());
        this.contactRichView.setOnClickListener(new extractPath(this));
    }

    static /* synthetic */ void setMax(PathUtils pathUtils) {
        RecipientModel selectedRecipient = pathUtils.contactRichView.getSelectedRecipient();
        selectedRecipient.invokeSuspend = RecipientSource.ALL_CONTACTS;
        pathUtils.getMax().onRecipientSelected(selectedRecipient);
    }
}
