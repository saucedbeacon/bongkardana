package o;

import android.security.keystore.KeyGenParameterSpec;
import com.twilio.security.logger.Level;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\bJ \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\bJ \u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u001dH\u0016J(\u0010#\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/twilio/security/crypto/AndroidKeyStore;", "Lcom/twilio/security/crypto/AndroidKeyStoreOperations;", "keyStore", "Ljava/security/KeyStore;", "(Ljava/security/KeyStore;)V", "contains", "", "alias", "", "createKey", "Ljava/security/Key;", "algorithm", "keyGenParameterSpec", "Landroid/security/keystore/KeyGenParameterSpec;", "createKeyPair", "Ljava/security/KeyPair;", "decrypt", "", "data", "Lcom/twilio/security/crypto/key/cipher/EncryptedData;", "cipherAlgorithm", "key", "deleteEntry", "", "encrypt", "getCertificate", "Ljava/security/cert/Certificate;", "getKeyPair", "getPrivateKey", "Ljava/security/PrivateKey;", "getSecretKey", "Ljavax/crypto/SecretKey;", "sign", "signatureAlgorithm", "private", "verify", "signature", "public", "Ljava/security/PublicKey;", "security_release"}, k = 1, mv = {1, 1, 16})
public final class getItemViewType implements bindViewHolder {
    final KeyStore setMin;

    public getItemViewType(@NotNull KeyStore keyStore) {
        Intrinsics.checkParameterIsNotNull(keyStore, "keyStore");
        this.setMin = keyStore;
    }

    public final boolean getMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "alias");
        return this.setMin.containsAlias(str);
    }

    public final synchronized void setMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "alias");
        this.setMin.deleteEntry(str);
        Unit unit = Unit.INSTANCE;
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Debug, "Deleted entry for ".concat(String.valueOf(str)));
    }

    @Nullable
    public final synchronized KeyPair getMin(@NotNull String str, @NotNull KeyGenParameterSpec keyGenParameterSpec) {
        KeyPair generateKeyPair;
        Intrinsics.checkParameterIsNotNull(str, "algorithm");
        Intrinsics.checkParameterIsNotNull(keyGenParameterSpec, "keyGenParameterSpec");
        Provider provider = this.setMin.getProvider();
        Intrinsics.checkExpressionValueIsNotNull(provider, "keyStore.provider");
        KeyPairGenerator instance = KeyPairGenerator.getInstance(str, provider.getName());
        instance.initialize(keyGenParameterSpec);
        Locale locale = Locale.getDefault();
        try {
            Locale.setDefault(Locale.US);
            generateKeyPair = instance.generateKeyPair();
            onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.getMin(Level.Debug, "Generated key pair type ".concat(String.valueOf(str)));
        } finally {
            Locale.setDefault(locale);
        }
        return generateKeyPair;
    }

    @Nullable
    public final synchronized Key setMin(@NotNull String str, @NotNull KeyGenParameterSpec keyGenParameterSpec) {
        SecretKey generateKey;
        Intrinsics.checkParameterIsNotNull(str, "algorithm");
        Intrinsics.checkParameterIsNotNull(keyGenParameterSpec, "keyGenParameterSpec");
        Provider provider = this.setMin.getProvider();
        Intrinsics.checkExpressionValueIsNotNull(provider, "keyStore.provider");
        KeyGenerator instance = KeyGenerator.getInstance(str, provider.getName());
        instance.init(keyGenParameterSpec);
        generateKey = instance.generateKey();
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Debug, "Generated key type ".concat(String.valueOf(str)));
        return generateKey;
    }

    @NotNull
    public final synchronized byte[] getMin(@NotNull byte[] bArr, @NotNull String str, @NotNull PrivateKey privateKey) {
        byte[] sign;
        Intrinsics.checkParameterIsNotNull(bArr, "data");
        Intrinsics.checkParameterIsNotNull(str, "signatureAlgorithm");
        Intrinsics.checkParameterIsNotNull(privateKey, "private");
        Signature instance = Signature.getInstance(str);
        instance.initSign(privateKey);
        instance.update(bArr);
        sign = instance.sign();
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Debug, "Sign data with ".concat(String.valueOf(str)));
        Intrinsics.checkExpressionValueIsNotNull(sign, "Signature.getInstance(si…h $signatureAlgorithm\") }");
        return sign;
    }

    @NotNull
    public final synchronized getItemId setMax(@NotNull byte[] bArr, @NotNull String str, @NotNull Key key) {
        getItemId getitemid;
        Intrinsics.checkParameterIsNotNull(bArr, "data");
        Intrinsics.checkParameterIsNotNull(str, "cipherAlgorithm");
        Intrinsics.checkParameterIsNotNull(key, "key");
        Cipher instance = Cipher.getInstance(str);
        instance.init(1, key);
        AlgorithmParameters parameters = instance.getParameters();
        Intrinsics.checkExpressionValueIsNotNull(parameters, "parameters");
        byte[] encoded = parameters.getEncoded();
        Intrinsics.checkExpressionValueIsNotNull(encoded, "parameters.encoded");
        AlgorithmParameters parameters2 = instance.getParameters();
        Intrinsics.checkExpressionValueIsNotNull(parameters2, "parameters");
        Provider provider = parameters2.getProvider();
        Intrinsics.checkExpressionValueIsNotNull(provider, "parameters.provider");
        String name = provider.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "parameters.provider.name");
        AlgorithmParameters parameters3 = instance.getParameters();
        Intrinsics.checkExpressionValueIsNotNull(parameters3, "parameters");
        String algorithm = parameters3.getAlgorithm();
        Intrinsics.checkExpressionValueIsNotNull(algorithm, "parameters.algorithm");
        setHasStableIds sethasstableids = new setHasStableIds(encoded, name, algorithm);
        byte[] doFinal = instance.doFinal(bArr);
        Intrinsics.checkExpressionValueIsNotNull(doFinal, "doFinal(data)");
        getitemid = new getItemId(sethasstableids, doFinal);
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        Level level = Level.Debug;
        StringBuilder sb = new StringBuilder("Encrypt data with ");
        sb.append(str);
        sb.append(" and result: ");
        sb.append(getitemid);
        onAttachedToRecyclerView.getMin(level, sb.toString());
        return getitemid;
    }

    @NotNull
    public final synchronized byte[] length(@NotNull getItemId getitemid, @NotNull String str, @NotNull Key key) {
        byte[] doFinal;
        Intrinsics.checkParameterIsNotNull(getitemid, "data");
        Intrinsics.checkParameterIsNotNull(str, "cipherAlgorithm");
        Intrinsics.checkParameterIsNotNull(key, "key");
        Cipher instance = Cipher.getInstance(str);
        AlgorithmParameters instance2 = AlgorithmParameters.getInstance(getitemid.setMin.setMin, getitemid.setMin.getMax);
        instance2.init(getitemid.setMin.getMin());
        instance.init(2, key, instance2);
        doFinal = instance.doFinal(getitemid.length());
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        Level level = Level.Debug;
        StringBuilder sb = new StringBuilder("Decrypt encrypt data ");
        sb.append(getitemid);
        sb.append(" with ");
        sb.append(str);
        onAttachedToRecyclerView.getMin(level, sb.toString());
        Intrinsics.checkExpressionValueIsNotNull(doFinal, "Cipher.getInstance(ciphe…with $cipherAlgorithm\") }");
        return doFinal;
    }
}
