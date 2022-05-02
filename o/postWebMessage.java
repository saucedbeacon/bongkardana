package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001a"}, d2 = {"Lid/dana/domain/featureconfig/model/ReferralMessageTemplateConfig;", "", "messageIndonesia", "", "messageEnglish", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessageEnglish", "()Ljava/lang/String;", "setMessageEnglish", "(Ljava/lang/String;)V", "getMessageIndonesia", "setMessageIndonesia", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "insertReferralCode", "referralCode", "insertReferralLink", "referralLink", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class postWebMessage {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final String REFERRAL_CODE_KEY = "%referral_code%";
    private static final String REFERRAL_LINK_KEY = "%referral_link%";
    @SerializedName("message_en")
    @NotNull
    private String messageEnglish;
    @SerializedName("message_id")
    @NotNull
    private String messageIndonesia;

    public postWebMessage() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ postWebMessage copy$default(postWebMessage postwebmessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postwebmessage.messageIndonesia;
        }
        if ((i & 2) != 0) {
            str2 = postwebmessage.messageEnglish;
        }
        return postwebmessage.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.messageIndonesia;
    }

    @NotNull
    public final String component2() {
        return this.messageEnglish;
    }

    @NotNull
    public final postWebMessage copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "messageIndonesia");
        Intrinsics.checkNotNullParameter(str2, "messageEnglish");
        return new postWebMessage(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof postWebMessage)) {
            return false;
        }
        postWebMessage postwebmessage = (postWebMessage) obj;
        return Intrinsics.areEqual((Object) this.messageIndonesia, (Object) postwebmessage.messageIndonesia) && Intrinsics.areEqual((Object) this.messageEnglish, (Object) postwebmessage.messageEnglish);
    }

    public final int hashCode() {
        String str = this.messageIndonesia;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.messageEnglish;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralMessageTemplateConfig(messageIndonesia=");
        sb.append(this.messageIndonesia);
        sb.append(", messageEnglish=");
        sb.append(this.messageEnglish);
        sb.append(")");
        return sb.toString();
    }

    public postWebMessage(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "messageIndonesia");
        Intrinsics.checkNotNullParameter(str2, "messageEnglish");
        this.messageIndonesia = str;
        this.messageEnglish = str2;
    }

    @NotNull
    public final String getMessageIndonesia() {
        return this.messageIndonesia;
    }

    public final void setMessageIndonesia(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.messageIndonesia = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ postWebMessage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    @NotNull
    public final String getMessageEnglish() {
        return this.messageEnglish;
    }

    public final void setMessageEnglish(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.messageEnglish = str;
    }

    @NotNull
    public final postWebMessage insertReferralCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "referralCode");
        StringsKt.replace$default(this.messageIndonesia, REFERRAL_CODE_KEY, str, false, 4, (Object) null);
        StringsKt.replace$default(this.messageEnglish, REFERRAL_CODE_KEY, str, false, 4, (Object) null);
        return this;
    }

    @NotNull
    public final postWebMessage insertReferralLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "referralLink");
        StringsKt.replace$default(this.messageIndonesia, REFERRAL_LINK_KEY, str, false, 4, (Object) null);
        StringsKt.replace$default(this.messageEnglish, REFERRAL_LINK_KEY, str, false, 4, (Object) null);
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/domain/featureconfig/model/ReferralMessageTemplateConfig$Companion;", "", "()V", "REFERRAL_CODE_KEY", "", "REFERRAL_LINK_KEY", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
