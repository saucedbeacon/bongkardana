package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class ResourceDownloadType extends parseFailed<Boolean, setMax> {
    private final GriverWhiteScreenStageMonitor recentRecipientRepository;

    @Inject
    public ResourceDownloadType(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        super(appxloadfailed, getscheme);
        this.recentRecipientRepository = griverWhiteScreenStageMonitor;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMax setmax) {
        return this.recentRecipientRepository.saveRecentBank(setmax.toRecentRecipient());
    }

    public static class setMax {
        private String alias;
        private String bankLogo;
        private String bankName;
        private String bankNumber;
        private String cardIndexNo;
        private String formattedMaskNumber;
        private String instId;
        private String instLocalName;
        private Long lastUpdated;
        private String payMethod;
        private String payOption;
        private String prefix;
        private String recipientName;
        private String senderName;
        private int transactionCount;
        private boolean visibleInQuickSend;

        private setMax(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Long l, boolean z) {
            this.recipientName = str;
            this.bankName = str2;
            this.bankNumber = str3;
            this.bankLogo = str4;
            this.alias = str5;
            this.instId = str6;
            this.instLocalName = str7;
            this.payMethod = str8;
            this.payOption = str9;
            this.senderName = str10;
            this.cardIndexNo = str11;
            this.formattedMaskNumber = str12;
            this.prefix = str13;
            this.transactionCount = i;
            this.lastUpdated = l;
            this.visibleInQuickSend = z;
        }

        public static setMax forSaveRecentBank(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, boolean z) {
            return new setMax(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, i, (Long) null, z);
        }

        public static setMax forUpdateRecentBankName(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Long l, boolean z) {
            return new setMax(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, i, l, z);
        }

        public GriverFullLinkStageMonitor toRecentRecipient() {
            return new GriverFullLinkStageMonitor(this.recipientName, this.bankNumber, this.bankName, this.bankLogo, this.alias, this.instId, this.instLocalName, this.payMethod, this.payOption, this.senderName, this.cardIndexNo, this.formattedMaskNumber, this.prefix, this.transactionCount, this.lastUpdated, this.visibleInQuickSend);
        }
    }
}
