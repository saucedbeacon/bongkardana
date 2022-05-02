package o;

import com.twilio.security.crypto.KeyException;
import com.twilio.security.logger.Level;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002J9\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\u0004\b\u0000\u0010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00180\u001eH\u0002¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/twilio/security/crypto/AndroidKeyManager;", "Lcom/twilio/security/crypto/KeyManager;", "androidKeyStore", "Lcom/twilio/security/crypto/AndroidKeyStore;", "(Lcom/twilio/security/crypto/AndroidKeyStore;)V", "cipher", "Lcom/twilio/security/crypto/key/cipher/Cipher;", "template", "Lcom/twilio/security/crypto/key/template/CipherTemplate;", "contains", "", "alias", "", "createCipherKey", "Ljavax/crypto/SecretKey;", "createSignerKeyPair", "Ljava/security/KeyPair;", "Lcom/twilio/security/crypto/key/template/SignerTemplate;", "delete", "", "getCipherKey", "getSecretKey", "getSignerKeyPair", "retryToGetValue", "T", "times", "", "delayInMillis", "", "block", "Lkotlin/Function0;", "(IJLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "signer", "Lcom/twilio/security/crypto/key/signer/Signer;", "security_release"}, k = 1, mv = {1, 1, 16})
public final class onBindViewHolder implements createViewHolder {
    /* access modifiers changed from: private */
    public final getItemViewType setMin;

    public onBindViewHolder(@NotNull getItemViewType getitemviewtype) {
        Intrinsics.checkParameterIsNotNull(getitemviewtype, "androidKeyStore");
        this.setMin = getitemviewtype;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009a A[Catch:{ Exception -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009b A[Catch:{ Exception -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e A[Catch:{ Exception -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f A[Catch:{ Exception -> 0x0102 }] */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.onViewAttachedToWindow length(@org.jetbrains.annotations.NotNull o.onDetachedFromRecyclerView r6) throws com.twilio.security.crypto.KeyException {
        /*
            r5 = this;
            java.lang.String r0 = "template"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            o.onAttachedToRecyclerView r0 = o.onAttachedToRecyclerView.setMax     // Catch:{ Exception -> 0x0102 }
            com.twilio.security.logger.Level r0 = com.twilio.security.logger.Level.Info     // Catch:{ Exception -> 0x0102 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0102 }
            java.lang.String r2 = "Getting signer for alias: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r2 = r6.getMax()     // Catch:{ Exception -> 0x0102 }
            r1.append(r2)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0102 }
            o.onAttachedToRecyclerView.getMin(r0, r1)     // Catch:{ Exception -> 0x0102 }
            o.onAttachedToRecyclerView r0 = o.onAttachedToRecyclerView.setMax     // Catch:{ Exception -> 0x0102 }
            com.twilio.security.logger.Level r0 = com.twilio.security.logger.Level.Debug     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = "Getting signer for template: "
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ Exception -> 0x0102 }
            o.onAttachedToRecyclerView.getMin(r0, r1)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = r6.getMax()     // Catch:{ Exception -> 0x0102 }
            boolean r0 = r5.getMax((java.lang.String) r0)     // Catch:{ Exception -> 0x0102 }
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r6.toFloatRange()     // Catch:{ Exception -> 0x0102 }
            if (r0 != 0) goto L_0x00a9
            o.onAttachedToRecyclerView r0 = o.onAttachedToRecyclerView.setMax     // Catch:{ Exception -> 0x0102 }
            com.twilio.security.logger.Level r0 = com.twilio.security.logger.Level.Info     // Catch:{ Exception -> 0x0102 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0102 }
            java.lang.String r2 = "Creating signer key pair for: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r2 = r6.getMax()     // Catch:{ Exception -> 0x0102 }
            r1.append(r2)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0102 }
            o.onAttachedToRecyclerView.getMin(r0, r1)     // Catch:{ Exception -> 0x0102 }
            o.getItemViewType r0 = r5.setMin     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = r6.length()     // Catch:{ Exception -> 0x0102 }
            android.security.keystore.KeyGenParameterSpec r2 = r6.setMin()     // Catch:{ Exception -> 0x0102 }
            java.security.KeyPair r0 = r0.getMin(r1, r2)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = r6.getMax()     // Catch:{ Exception -> 0x0102 }
            java.security.KeyPair r1 = r5.setMin(r1)     // Catch:{ Exception -> 0x0102 }
            r2 = 1
            if (r0 == 0) goto L_0x0097
            java.security.PublicKey r0 = r0.getPublic()     // Catch:{ Exception -> 0x0102 }
            if (r0 == 0) goto L_0x0097
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x0102 }
            if (r0 == 0) goto L_0x0097
            java.security.PublicKey r3 = r1.getPublic()     // Catch:{ Exception -> 0x0102 }
            java.lang.String r4 = "it.public"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Exception -> 0x0102 }
            byte[] r3 = r3.getEncoded()     // Catch:{ Exception -> 0x0102 }
            java.lang.String r4 = "it.public.encoded"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Exception -> 0x0102 }
            boolean r0 = java.util.Arrays.equals(r0, r3)     // Catch:{ Exception -> 0x0102 }
            if (r0 != r2) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r2 = 0
        L_0x0098:
            if (r2 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r1 = 0
        L_0x009c:
            if (r1 == 0) goto L_0x009f
            goto L_0x00bb
        L_0x009f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "New private key not found"
            r6.<init>(r0)     // Catch:{ Exception -> 0x0102 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ Exception -> 0x0102 }
            throw r6     // Catch:{ Exception -> 0x0102 }
        L_0x00a9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "The alias does not exist"
            r6.<init>(r0)     // Catch:{ Exception -> 0x0102 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ Exception -> 0x0102 }
            throw r6     // Catch:{ Exception -> 0x0102 }
        L_0x00b3:
            java.lang.String r0 = r6.getMax()     // Catch:{ Exception -> 0x0102 }
            java.security.KeyPair r1 = r5.setMin(r0)     // Catch:{ Exception -> 0x0102 }
        L_0x00bb:
            boolean r0 = r6 instanceof o.notifyDataSetChanged     // Catch:{ Exception -> 0x0102 }
            if (r0 == 0) goto L_0x00fc
            o.onViewDetachedFromWindow r0 = new o.onViewDetachedFromWindow     // Catch:{ Exception -> 0x0102 }
            java.lang.String r2 = r6.getMin()     // Catch:{ Exception -> 0x0102 }
            o.getItemViewType r3 = r5.setMin     // Catch:{ Exception -> 0x0102 }
            o.bindViewHolder r3 = (o.bindViewHolder) r3     // Catch:{ Exception -> 0x0102 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0102 }
            o.onAttachedToRecyclerView r1 = o.onAttachedToRecyclerView.setMax     // Catch:{ Exception -> 0x0102 }
            com.twilio.security.logger.Level r1 = com.twilio.security.logger.Level.Debug     // Catch:{ Exception -> 0x0102 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0102 }
            java.lang.String r3 = "Return "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0102 }
            java.lang.Class r3 = r0.getClass()     // Catch:{ Exception -> 0x0102 }
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ Exception -> 0x0102 }
            r2.append(r3)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r3 = " for "
            r2.append(r3)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r6 = r6.getMax()     // Catch:{ Exception -> 0x0102 }
            r2.append(r6)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0102 }
            o.onAttachedToRecyclerView.getMin(r1, r6)     // Catch:{ Exception -> 0x0102 }
            o.onViewAttachedToWindow r0 = (o.onViewAttachedToWindow) r0     // Catch:{ Exception -> 0x0102 }
            return r0
        L_0x00fc:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch:{ Exception -> 0x0102 }
            r6.<init>()     // Catch:{ Exception -> 0x0102 }
            throw r6     // Catch:{ Exception -> 0x0102 }
        L_0x0102:
            r6 = move-exception
            o.onAttachedToRecyclerView r0 = o.onAttachedToRecyclerView.setMax
            com.twilio.security.logger.Level r0 = com.twilio.security.logger.Level.Error
            java.lang.String r1 = r6.toString()
            o.onAttachedToRecyclerView.length(r0, r1)
            com.twilio.security.crypto.KeyException r0 = new com.twilio.security.crypto.KeyException
            r0.<init>(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onBindViewHolder.length(o.onDetachedFromRecyclerView):o.onViewAttachedToWindow");
    }

    private final KeyPair setMin(String str) {
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Info, "Getting signer key pair for: ".concat(String.valueOf(str)));
        if (getMax(str)) {
            KeyPair keyPair = (KeyPair) getMax(new setMin(this, str));
            if (keyPair != null) {
                return keyPair;
            }
            throw new IllegalArgumentException("Key pair not found");
        }
        throw new IllegalArgumentException("alias not found");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/security/KeyPair;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMin extends Lambda implements Function0<KeyPair> {
        final /* synthetic */ String $alias;
        final /* synthetic */ onBindViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(onBindViewHolder onbindviewholder, String str) {
            super(0);
            this.this$0 = onbindviewholder;
            this.$alias = str;
        }

        @Nullable
        public final KeyPair invoke() {
            getItemViewType min = this.this$0.setMin;
            String str = this.$alias;
            Intrinsics.checkParameterIsNotNull(str, "alias");
            KeyPair keyPair = null;
            Key key = min.setMin.getKey(str, (char[]) null);
            if (!(key instanceof PrivateKey)) {
                key = null;
            }
            PrivateKey privateKey = (PrivateKey) key;
            if (privateKey == null) {
                KeyStore.Entry entry = min.setMin.getEntry(str, (KeyStore.ProtectionParameter) null);
                if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                    entry = null;
                }
                KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
                privateKey = privateKeyEntry != null ? privateKeyEntry.getPrivateKey() : null;
                onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
                onAttachedToRecyclerView.getMin(Level.Debug, "Get private key for ".concat(String.valueOf(str)));
            }
            Certificate certificate = min.setMin.getCertificate(str);
            if (certificate == null) {
                KeyStore.Entry entry2 = min.setMin.getEntry(str, (KeyStore.ProtectionParameter) null);
                if (!(entry2 instanceof KeyStore.PrivateKeyEntry)) {
                    entry2 = null;
                }
                KeyStore.PrivateKeyEntry privateKeyEntry2 = (KeyStore.PrivateKeyEntry) entry2;
                certificate = privateKeyEntry2 != null ? privateKeyEntry2.getCertificate() : null;
                onAttachedToRecyclerView onattachedtorecyclerview2 = onAttachedToRecyclerView.setMax;
                onAttachedToRecyclerView.getMin(Level.Debug, "Get certificate for ".concat(String.valueOf(str)));
            }
            if (privateKey == null || certificate == null) {
                onAttachedToRecyclerView onattachedtorecyclerview3 = onAttachedToRecyclerView.setMax;
                Level level = Level.Debug;
                StringBuilder sb = new StringBuilder("Private key ");
                String str2 = "is null";
                sb.append(privateKey == null ? str2 : "is not null");
                sb.append(" and Certificate ");
                if (certificate != null) {
                    str2 = "is not null";
                }
                sb.append(str2);
                onAttachedToRecyclerView.getMin(level, sb.toString());
            } else {
                keyPair = new KeyPair(certificate.getPublicKey(), privateKey);
            }
            onAttachedToRecyclerView onattachedtorecyclerview4 = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.getMin(Level.Debug, "Return key pair for ".concat(String.valueOf(str)));
            return keyPair;
        }
    }

    @NotNull
    public final hasStableIds getMin(@NotNull hasObservers hasobservers) throws KeyException {
        SecretKey secretKey;
        Intrinsics.checkParameterIsNotNull(hasobservers, "template");
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        Level level = Level.Info;
        StringBuilder sb = new StringBuilder("Getting cipher for alias: ");
        sb.append(hasobservers.getMax());
        onAttachedToRecyclerView.getMin(level, sb.toString());
        onAttachedToRecyclerView onattachedtorecyclerview2 = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Debug, "Getting cipher for template: ".concat(String.valueOf(hasobservers)));
        try {
            if (getMax(hasobservers.getMax())) {
                secretKey = setMax(hasobservers.getMax());
            } else if (!hasobservers.toFloatRange()) {
                onAttachedToRecyclerView onattachedtorecyclerview3 = onAttachedToRecyclerView.setMax;
                Level level2 = Level.Info;
                StringBuilder sb2 = new StringBuilder("Creating cipher key for: ");
                sb2.append(hasobservers.getMax());
                onAttachedToRecyclerView.getMin(level2, sb2.toString());
                Key min = this.setMin.setMin(hasobservers.length(), hasobservers.setMin());
                secretKey = setMax(hasobservers.getMax());
                if (!(min != null && Intrinsics.areEqual((Object) min, (Object) secretKey))) {
                    secretKey = null;
                }
                if (secretKey == null) {
                    throw new IllegalArgumentException("New secret key not found");
                }
            } else {
                throw new IllegalStateException("The alias does not exist");
            }
            if (hasobservers instanceof onFailedToRecycleView) {
                return new onViewRecycled(secretKey, hasobservers.setMax(), this.setMin);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            onAttachedToRecyclerView onattachedtorecyclerview4 = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.length(Level.Error, e.toString());
            throw new KeyException(e);
        }
    }

    public final void getMin(@NotNull String str) throws KeyException {
        Intrinsics.checkParameterIsNotNull(str, "alias");
        try {
            if (getMax(str)) {
                this.setMin.setMax(str);
            }
        } catch (Exception e) {
            onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.length(Level.Error, e.toString());
            throw new KeyException(e);
        }
    }

    public final boolean getMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "alias");
        return this.setMin.getMax(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljavax/crypto/SecretKey;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class length extends Lambda implements Function0<SecretKey> {
        final /* synthetic */ String $alias;
        final /* synthetic */ onBindViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(onBindViewHolder onbindviewholder, String str) {
            super(0);
            this.this$0 = onbindviewholder;
            this.$alias = str;
        }

        @Nullable
        public final SecretKey invoke() {
            return onBindViewHolder.getMin(this.this$0, this.$alias);
        }
    }

    private final SecretKey setMax(String str) {
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Info, "Getting cipher key for: ".concat(String.valueOf(str)));
        SecretKey secretKey = (SecretKey) getMax(new length(this, str));
        if (secretKey != null) {
            return secretKey;
        }
        throw new IllegalArgumentException("Secret key not found");
    }

    private static <T> T getMax(Function0<? extends T> function0) {
        T t;
        int i = 0;
        while (i < 2) {
            i++;
            long j = ((long) i) * 100;
            try {
                t = function0.invoke();
            } catch (Exception e) {
                onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
                onAttachedToRecyclerView.length(Level.Error, e.toString());
                t = null;
            }
            if (t == null) {
                onAttachedToRecyclerView onattachedtorecyclerview2 = onAttachedToRecyclerView.setMax;
                onAttachedToRecyclerView.getMin(Level.Debug, "AndroidKeyManager: Retrying operation");
                TimeUnit.MILLISECONDS.sleep(j);
            } else {
                onAttachedToRecyclerView onattachedtorecyclerview3 = onAttachedToRecyclerView.setMax;
                onAttachedToRecyclerView.getMin(Level.Debug, "AndroidKeyManager: Successful operation");
                return t;
            }
        }
        T invoke = function0.invoke();
        onAttachedToRecyclerView onattachedtorecyclerview4 = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Debug, "AndroidKeyManager: Successful operation");
        return invoke;
    }

    public static final /* synthetic */ SecretKey getMin(onBindViewHolder onbindviewholder, String str) {
        if (onbindviewholder.getMax(str)) {
            getItemViewType getitemviewtype = onbindviewholder.setMin;
            Intrinsics.checkParameterIsNotNull(str, "alias");
            Key key = getitemviewtype.setMin.getKey(str, (char[]) null);
            if (!(key instanceof SecretKey)) {
                key = null;
            }
            SecretKey secretKey = (SecretKey) key;
            if (secretKey != null) {
                return secretKey;
            }
            KeyStore.Entry entry = getitemviewtype.setMin.getEntry(str, (KeyStore.ProtectionParameter) null);
            if (entry instanceof KeyStore.SecretKeyEntry) {
                SecretKey secretKey2 = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
                onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
                onAttachedToRecyclerView.getMin(Level.Debug, "Return secret key for ".concat(String.valueOf(str)));
                return secretKey2;
            }
            throw new IllegalStateException("Entry is not a secret key entry");
        }
        throw new IllegalArgumentException("alias not found");
    }
}
