package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.recipient.recent.RecentRecipientView;
import o.setMediaId;

public final class getLeftText implements getBindingAdapter<RecentRecipientView> {
    @InjectedFieldSignature("id.dana.sendmoney.recipient.recent.RecentRecipientView.presenter")
    public static void setMax(RecentRecipientView recentRecipientView, setMediaId.setMax setmax) {
        recentRecipientView.presenter = setmax;
    }

    @InjectedFieldSignature("id.dana.sendmoney.recipient.recent.RecentRecipientView.recentRecipientAdapter")
    public static void setMin(RecentRecipientView recentRecipientView, setIsAlbumMedia setisalbummedia) {
        recentRecipientView.recentRecipientAdapter = setisalbummedia;
    }
}
