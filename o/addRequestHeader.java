package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/data/twilio/repository/source/local/TwilioDialogPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "getNeverShowTwilioDialog", "", "phoneNumber", "", "getTwilioDialogDismissCount", "", "getTwilioDialogTimestamp", "", "saveNeverShowTwilioDialog", "neverShow", "saveTwilioDialogDismissCount", "dismissCount", "saveTwilioDialogTimestamp", "dateTimestamp", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class addRequestHeader {
    @NotNull
    public static final getMin setMin = new getMin((byte) 0);
    final onSingleFailed setMax;

    @Inject
    public addRequestHeader(@Nullable Context context) {
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup("TwilioDialogPreferenceproduction").setUseDrutherPreference(true)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(buil….createData(Source.LOCAL)");
        this.setMax = createData;
    }

    public final boolean length(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.setMax.saveData("twilio_dialog_dismiss_count".concat(String.valueOf(str)), Integer.valueOf(i));
        return true;
    }

    public final boolean setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Boolean bool = this.setMax.getBoolean("never_show_twilio_dialog".concat(String.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBool…LIO_DIALOG + phoneNumber)");
        return bool.booleanValue();
    }

    public final boolean getMax(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.setMax.saveData("never_show_twilio_dialog".concat(String.valueOf(str)), Boolean.valueOf(z));
        return true;
    }

    public final boolean length(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.setMax.saveData("never_show_twilio_dialog_timestamp".concat(String.valueOf(str)), Long.valueOf(j));
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/data/twilio/repository/source/local/TwilioDialogPreference$Companion;", "", "()V", "NEVER_SHOW_TWILIO_DIALOG", "", "TWILIO_DIALOG_DISMISS_COUNT", "TWILIO_DIALOG_PREFERENCE", "TWILIO_DIALOG_TIMESTAMP", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }
}
