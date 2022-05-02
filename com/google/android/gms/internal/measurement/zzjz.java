package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjz;
import com.google.android.gms.internal.measurement.zzkd;
import java.io.IOException;

public class zzjz<MessageType extends zzkd<MessageType, BuilderType>, BuilderType extends zzjz<MessageType, BuilderType>> extends zzin<MessageType, BuilderType> {
    protected MessageType zza;
    protected boolean zzb = false;
    private final MessageType zzc;

    protected zzjz(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzkd) messagetype.zzl(4, (Object) null, (Object) null);
    }

    private static final void zza(MessageType messagetype, MessageType messagetype2) {
        zzlq.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    public final MessageType zzaA() {
        MessageType zzaz = zzaD();
        boolean booleanValue = Boolean.TRUE.booleanValue();
        boolean z = true;
        byte byteValue = ((Byte) zzaz.zzl(1, (Object) null, (Object) null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean zzj = zzlq.zza().zzb(zzaz.getClass()).zzj(zzaz);
                if (booleanValue) {
                    zzaz.zzl(2, true != zzj ? null : zzaz, (Object) null);
                }
                z = zzj;
            }
        }
        if (z) {
            return zzaz;
        }
        throw new zzmg(zzaz);
    }

    public final BuilderType zzaB(MessageType messagetype) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zza(this.zza, messagetype);
        return this;
    }

    public final BuilderType zzaC(byte[] bArr, int i, int i2, zzjp zzjp) throws zzkn {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        try {
            zzlq.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i2, new zzir(zzjp));
            return this;
        } catch (zzkn e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkn.zza();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    public final /* synthetic */ zzin zzar(byte[] bArr, int i, int i2) throws zzkn {
        zzaC(bArr, 0, i2, zzjp.zza());
        return this;
    }

    public final /* synthetic */ zzin zzas(byte[] bArr, int i, int i2, zzjp zzjp) throws zzkn {
        zzaC(bArr, 0, i2, zzjp);
        return this;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ zzin zzat(zzio zzio) {
        zzaB((zzkd) zzio);
        return this;
    }

    /* access modifiers changed from: protected */
    public void zzax() {
        MessageType messagetype = (zzkd) this.zza.zzl(4, (Object) null, (Object) null);
        zza(messagetype, this.zza);
        this.zza = messagetype;
    }

    /* renamed from: zzay */
    public final BuilderType zzaq() {
        BuilderType buildertype = (zzjz) this.zzc.zzl(5, (Object) null, (Object) null);
        buildertype.zzaB(zzaD());
        return buildertype;
    }

    /* renamed from: zzaz */
    public MessageType zzaD() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        zzlq.zza().zzb(messagetype.getClass()).zzi(messagetype);
        this.zzb = true;
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzli zzbL() {
        return this.zzc;
    }
}
