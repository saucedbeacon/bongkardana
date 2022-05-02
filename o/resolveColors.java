package o;

import android.content.Context;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import kotlin.Metadata;
import o.b;
import o.html;
import o.populateText;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/data/announcement/repository/source/network/AnnouncementFacade;", "", "getAnnouncements", "Lid/dana/data/announcement/repository/source/network/result/AnnouncementResult;", "announcementRequest", "Lid/dana/data/announcement/repository/source/network/request/AnnouncementRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface resolveColors {
    @OperationType("alipayplus.mobilewallet.announcement.getAnnouncement")
    @NotNull
    @SignCheck
    populateText getAnnouncements(@NotNull populateText.Cdefault defaultR);

    /* renamed from: o.resolveColors$default  reason: invalid class name */
    public final class Cdefault implements getAdapterPosition<adjustAlpha> {
        private final b.C0007b<html.Cdefault> announcementPreferenceProvider;
        private final b.C0007b<Context> contextProvider;
        private final b.C0007b<PluginInstallCallback> serializerProvider;

        public Cdefault(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2, b.C0007b<html.Cdefault> bVar3) {
            this.contextProvider = bVar;
            this.serializerProvider = bVar2;
            this.announcementPreferenceProvider = bVar3;
        }

        public final adjustAlpha get() {
            return newInstance(this.contextProvider.get(), this.serializerProvider.get(), this.announcementPreferenceProvider.get());
        }

        public static Cdefault create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2, b.C0007b<html.Cdefault> bVar3) {
            return new Cdefault(bVar, bVar2, bVar3);
        }

        public static adjustAlpha newInstance(Context context, PluginInstallCallback pluginInstallCallback, html.Cdefault defaultR) {
            return new adjustAlpha(context, pluginInstallCallback, defaultR);
        }
    }
}
