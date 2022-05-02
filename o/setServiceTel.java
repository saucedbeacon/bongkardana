package o;

import android.view.View;
import android.view.ViewGroup;
import com.alipay.iap.android.wallet.acl.oauth.OAuthService;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.social.view.UsernameView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuUsernameViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/profilemenu/model/SettingModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setServiceTel extends Ignore<SettingModel> {
    @NotNull
    public static final setMax setMin = new setMax((byte) 0);

    public final /* synthetic */ void setMax(Object obj) {
        String username;
        SettingModel settingModel = (SettingModel) obj;
        super.setMax(settingModel);
        if (settingModel != null && (username = settingModel.getUsername()) != null) {
            if (!(username.length() > 0) || StringsKt.equals(username, OAuthService.SCOPE_USER_NAME, true)) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                UsernameView usernameView = (UsernameView) view.findViewById(resetInternal.setMax.setTransition);
                if (usernameView != null) {
                    usernameView.showUsernameEmptyState();
                    return;
                }
                return;
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            UsernameView usernameView2 = (UsernameView) view2.findViewById(resetInternal.setMax.setTransition);
            if (usernameView2 != null) {
                usernameView2.hideUsernameEmptyState();
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            UsernameView usernameView3 = (UsernameView) view3.findViewById(resetInternal.setMax.setTransition);
            if (usernameView3 != null) {
                usernameView3.setUsername(username);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setServiceTel(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_profile_username, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuUsernameViewHolder$Companion;", "", "()V", "DUMMY_USERNAME_VALUE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
