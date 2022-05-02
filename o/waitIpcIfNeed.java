package o;

import id.dana.domain.profilemenu.model.SettingModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import o.TitleBarRightButtonView;

public final class waitIpcIfNeed {
    private List<SettingModel> formattedSettingsToShow = new ArrayList();
    private notNeedInitUc rawSettingJsonMapper;
    private List<isBind> sectionConfigToRun;
    private List<sendUcReceiver> settingConfigurations;

    public waitIpcIfNeed(notNeedInitUc notneedinituc, List<sendUcReceiver> list) {
        this.rawSettingJsonMapper = notneedinituc;
        this.sectionConfigToRun = new ArrayList();
        this.settingConfigurations = list;
    }

    public final TitleBarRightButtonView.AnonymousClass1<List<SettingModel>> getSettings(LinkedHashMap<String, LinkedHashMap<String, SettingModel>> linkedHashMap) {
        for (Map.Entry next : linkedHashMap.entrySet()) {
            List<sendUcReceiver> configInThisSection = getConfigInThisSection(this.settingConfigurations, next);
            if (needToRunConfigBeforeAddToList(configInThisSection)) {
                this.sectionConfigToRun.add(createConfigToRun(next, configInThisSection));
            } else {
                addSectionToList(next);
            }
        }
        if (this.sectionConfigToRun.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.just(this.formattedSettingsToShow);
        }
        return runSectionConfig().startWith(TitleBarRightButtonView.AnonymousClass1.just(new ArrayList(this.formattedSettingsToShow)));
    }

    private void addSectionToList(Map.Entry<String, LinkedHashMap<String, SettingModel>> entry) {
        this.formattedSettingsToShow.addAll(transformUnformattedSection(entry));
    }

    private isBind createConfigToRun(Map.Entry<String, LinkedHashMap<String, SettingModel>> entry, List<sendUcReceiver> list) {
        isBind isbind = new isBind(this.formattedSettingsToShow.size(), transformUnformattedSection(entry));
        isbind.add(list);
        return isbind;
    }

    private List<SettingModel> transformUnformattedSection(Map.Entry<String, LinkedHashMap<String, SettingModel>> entry) {
        return this.rawSettingJsonMapper.apply(entry);
    }

    private List<sendUcReceiver> getConfigInThisSection(List<sendUcReceiver> list, Map.Entry<String, LinkedHashMap<String, SettingModel>> entry) {
        ArrayList arrayList = new ArrayList();
        for (sendUcReceiver next : list) {
            if (isConfigExistInSection(entry, next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private boolean needToRunConfigBeforeAddToList(List<sendUcReceiver> list) {
        return !list.isEmpty();
    }

    private TitleBarRightButtonView.AnonymousClass1<List<SettingModel>> runSectionConfig() {
        return TitleBarRightButtonView.AnonymousClass1.zip(getSettingConfigToRun(), new setBind(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ List lambda$runSectionConfig$0(Object[] objArr) throws Exception {
        putBackRemovedSectionAfterConfigDone(this.sectionConfigToRun, this.formattedSettingsToShow);
        return this.formattedSettingsToShow;
    }

    private boolean isConfigExistInSection(Map.Entry<String, LinkedHashMap<String, SettingModel>> entry, sendUcReceiver senducreceiver) {
        return entry.getValue().get(senducreceiver.getSettingName()) != null;
    }

    private List<TitleBarRightButtonView.AnonymousClass1<List<SettingModel>>> getSettingConfigToRun() {
        ArrayList arrayList = new ArrayList();
        for (isBind configurationsToRun : this.sectionConfigToRun) {
            arrayList.add(configurationsToRun.getConfigurationsToRun());
        }
        return arrayList;
    }

    private List<SettingModel> putBackRemovedSectionAfterConfigDone(List<isBind> list, List<SettingModel> list2) {
        ListIterator<isBind> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            listIterator.previous().putBackToSettingList(list2);
        }
        return list2;
    }
}
