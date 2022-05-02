package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import id.dana.domain.profilemenu.model.SettingModel;
import o.changeMenuMode;

public final class toast extends changeMenuMode.setMin<SettingModel> {
    public final /* synthetic */ boolean getMax(@NonNull Object obj, @NonNull Object obj2) {
        return getMin((SettingModel) obj, (SettingModel) obj2);
    }

    public final /* synthetic */ boolean setMax(@NonNull Object obj, @NonNull Object obj2) {
        return getMax((SettingModel) obj, (SettingModel) obj2);
    }

    private static boolean getMax(@NonNull SettingModel settingModel, @NonNull SettingModel settingModel2) {
        return TextUtils.equals(settingModel.getName(), settingModel2.getName());
    }

    private static boolean getMin(@NonNull SettingModel settingModel, @NonNull SettingModel settingModel2) {
        return TextUtils.equals(settingModel.getTitle(), settingModel2.getTitle()) && TextUtils.equals(settingModel.getSubtitle(), settingModel2.getSubtitle()) && TextUtils.equals(settingModel.getSubtitleType(), settingModel2.getSubtitleType()) && settingModel.isNeedToShow() == settingModel2.isNeedToShow() && settingModel.isEnable() == settingModel2.isEnable() && settingModel.getViewType() == settingModel2.getViewType() && TextUtils.equals(settingModel.getBalance(), settingModel2.getBalance());
    }
}
