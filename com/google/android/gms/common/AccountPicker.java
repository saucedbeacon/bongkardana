package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class AccountPicker {
    private AccountPicker() {
    }

    public static class AccountChooserOptions {
        /* access modifiers changed from: private */
        @Nullable
        public Account zza;
        /* access modifiers changed from: private */
        @Nullable
        public ArrayList<Account> zzb;
        /* access modifiers changed from: private */
        @Nullable
        public ArrayList<String> zzc;
        /* access modifiers changed from: private */
        public boolean zzd;
        /* access modifiers changed from: private */
        @Nullable
        public String zze;
        /* access modifiers changed from: private */
        @Nullable
        public Bundle zzf;
        /* access modifiers changed from: private */
        public boolean zzg;
        /* access modifiers changed from: private */
        public int zzh;
        /* access modifiers changed from: private */
        @Nullable
        public String zzi;
        /* access modifiers changed from: private */
        public boolean zzj;
        /* access modifiers changed from: private */
        @Nullable
        public zza zzk;
        /* access modifiers changed from: private */
        @Nullable
        public String zzl;
        /* access modifiers changed from: private */
        public boolean zzm;

        public static class zza {
        }

        public static class Builder {
            @Nullable
            private Account zza;
            @Nullable
            private ArrayList<Account> zzb;
            @Nullable
            private ArrayList<String> zzc;
            private boolean zzd = false;
            @Nullable
            private String zze;
            @Nullable
            private Bundle zzf;
            private boolean zzg = false;
            private int zzh = 0;
            private boolean zzi = false;

            public Builder setSelectedAccount(@Nullable Account account) {
                this.zza = account;
                return this;
            }

            public Builder setAllowableAccounts(@Nullable List<Account> list) {
                this.zzb = list == null ? null : new ArrayList<>(list);
                return this;
            }

            public Builder setAllowableAccountsTypes(@Nullable List<String> list) {
                this.zzc = list == null ? null : new ArrayList<>(list);
                return this;
            }

            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.zzd = z;
                return this;
            }

            public Builder setTitleOverrideText(@Nullable String str) {
                this.zze = str;
                return this;
            }

            public Builder setOptionsForAddingAccount(@Nullable Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                ArrayList unused = accountChooserOptions.zzc = this.zzc;
                ArrayList unused2 = accountChooserOptions.zzb = this.zzb;
                boolean unused3 = accountChooserOptions.zzd = this.zzd;
                zza unused4 = accountChooserOptions.zzk = null;
                String unused5 = accountChooserOptions.zzi = null;
                Bundle unused6 = accountChooserOptions.zzf = this.zzf;
                Account unused7 = accountChooserOptions.zza = this.zza;
                boolean unused8 = accountChooserOptions.zzg = false;
                String unused9 = accountChooserOptions.zzl = null;
                int unused10 = accountChooserOptions.zzh = 0;
                String unused11 = accountChooserOptions.zze = this.zze;
                boolean unused12 = accountChooserOptions.zzj = false;
                boolean unused13 = accountChooserOptions.zzm = false;
                return accountChooserOptions;
            }
        }
    }

    @Deprecated
    public static Intent newChooseAccountIntent(@Nullable Account account, @Nullable ArrayList<Account> arrayList, @Nullable String[] strArr, boolean z, @Nullable String str, @Nullable String str2, @Nullable String[] strArr2, @Nullable Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    public static Intent newChooseAccountIntent(AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        int i = 0;
        if (!accountChooserOptions.zzj) {
            Preconditions.checkArgument(accountChooserOptions.zzi == null, "We only support hostedDomain filter for account chip styled account picker");
            Preconditions.checkArgument(accountChooserOptions.zzk == null, "Consent is only valid for account chip styled account picker");
        }
        intent.setAction(accountChooserOptions.zzj ? "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE" : "com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.zzb);
        if (accountChooserOptions.zzc != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.zzc.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.zzf);
        intent.putExtra("selectedAccount", accountChooserOptions.zza);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.zzd);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.zze);
        intent.putExtra("setGmsCoreAccount", accountChooserOptions.zzg);
        intent.putExtra("realClientPackage", accountChooserOptions.zzl);
        intent.putExtra("overrideTheme", accountChooserOptions.zzh);
        if (accountChooserOptions.zzj) {
            i = 2;
        }
        intent.putExtra("overrideCustomTheme", i);
        intent.putExtra("hostedDomainFilter", accountChooserOptions.zzi);
        Bundle bundle = new Bundle();
        if (accountChooserOptions.zzj && !TextUtils.isEmpty(accountChooserOptions.zze)) {
            bundle.putString("title", accountChooserOptions.zze);
        }
        if (accountChooserOptions.zzk != null) {
            bundle.putBoolean("should_show_consent", true);
            bundle.putString("privacy_policy_url", (String) null);
            bundle.putString("terms_of_service_url", (String) null);
        }
        if (accountChooserOptions.zzm) {
            bundle.putBoolean("exclude_add_account", true);
        }
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
