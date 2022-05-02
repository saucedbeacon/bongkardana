package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.myprofile.viewholder.ProfileMenuAppVersionViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuDefferedViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuFaceAuthViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuHeaderViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuPaymentAuthViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuUserKYBViewHolder;
import id.dana.myprofile.viewholder.ProfileMenuUserServiceViewHolder;
import o.IMultiInstanceInvalidationCallback;

public class getImageResId extends IMultiInstanceInvalidationCallback.Stub<Ignore<SettingModel>, SettingModel> {
    public /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        Ignore ignore = (Ignore) valueof;
        ignore.setIsRecyclable(false);
        super.onBindViewHolder(ignore, i);
    }

    public int getItemViewType(int i) {
        return ((SettingModel) setMin(i)).getViewType();
    }

    public final boolean setMax(int i) {
        return i == -1 || i >= getMax().size();
    }

    public final void getMax(Ignore<SettingModel> ignore, int i) {
        ignore.setIsRecyclable(false);
        super.onBindViewHolder(ignore, i);
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new ProfileMenuHeaderViewHolder(viewGroup);
            case 3:
                return new ProfileMenuUserKYBViewHolder(viewGroup);
            case 4:
                return new ProfileMenuAppVersionViewHolder(viewGroup);
            case 5:
                return new IpcMsgServerService(viewGroup);
            case 6:
                return new ProfileMenuPaymentAuthViewHolder(viewGroup);
            case 7:
                return new ProfileMenuDefferedViewHolder(viewGroup);
            case 8:
                return new getServiceEmail(viewGroup);
            case 9:
                return new ProfileMenuFaceAuthViewHolder(viewGroup);
            case 11:
                return new getServiceTel(viewGroup);
            case 14:
                return new getIconUrl(viewGroup);
            case 15:
                return new setAppIntro(viewGroup);
            case 16:
                return new setServiceTel(viewGroup);
            default:
                return new ProfileMenuUserServiceViewHolder(viewGroup);
        }
    }
}
