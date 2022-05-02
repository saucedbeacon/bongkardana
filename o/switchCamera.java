package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.richview.splitbill.adapter.viewholder.RecentContactPayerViewHolder;
import id.dana.richview.splitbill.adapter.viewholder.SelectedContactPayerViewHolder;
import id.dana.sendmoney.model.RecipientModel;
import o.IMultiInstanceInvalidationCallback;

public class switchCamera extends IMultiInstanceInvalidationCallback.Stub<Ignore<RecipientModel>, RecipientModel> {
    public getMax length;

    public interface getMax {
        void getMax(RecipientModel recipientModel);

        void setMin(RecipientModel recipientModel);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getItemViewType(int r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.setMin((int) r4)
            id.dana.sendmoney.model.RecipientModel r4 = (id.dana.sendmoney.model.RecipientModel) r4
            java.lang.String r4 = r4.onNavigationEvent
            int r0 = r4.hashCode()
            r1 = 951526432(0x38b72420, float:8.732849E-5)
            r2 = 1
            if (r0 == r1) goto L_0x0022
            r1 = 1861976014(0x6efb7fce, float:3.8917622E28)
            if (r0 == r1) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            java.lang.String r0 = "recentContacts"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x002c
            r4 = 1
            goto L_0x002d
        L_0x0022:
            java.lang.String r0 = "contact"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x002c
            r4 = 0
            goto L_0x002d
        L_0x002c:
            r4 = -1
        L_0x002d:
            if (r4 == r2) goto L_0x0030
            return r2
        L_0x0030:
            r4 = 2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.switchCamera.getItemViewType(int):int");
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i != 2) {
            return new SelectedContactPayerViewHolder(viewGroup, this.length);
        }
        return new RecentContactPayerViewHolder(viewGroup, this.length);
    }
}
