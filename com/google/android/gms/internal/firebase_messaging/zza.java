package com.google.android.gms.internal.firebase_messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

final class zza implements ObjectEncoder<MessagingClientEvent> {
    static final zza zza = new zza();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;
    private static final FieldDescriptor zzf;
    private static final FieldDescriptor zzg;
    private static final FieldDescriptor zzh;
    private static final FieldDescriptor zzi;
    private static final FieldDescriptor zzj;
    private static final FieldDescriptor zzk;
    private static final FieldDescriptor zzl;
    private static final FieldDescriptor zzm;
    private static final FieldDescriptor zzn;
    private static final FieldDescriptor zzo;
    private static final FieldDescriptor zzp;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("projectNumber");
        zzv zzv = new zzv();
        zzv.zza(1);
        zzb = builder.withProperty(zzv.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("messageId");
        zzv zzv2 = new zzv();
        zzv2.zza(2);
        zzc = builder2.withProperty(zzv2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("instanceId");
        zzv zzv3 = new zzv();
        zzv3.zza(3);
        zzd = builder3.withProperty(zzv3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("messageType");
        zzv zzv4 = new zzv();
        zzv4.zza(4);
        zze = builder4.withProperty(zzv4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("sdkPlatform");
        zzv zzv5 = new zzv();
        zzv5.zza(5);
        zzf = builder5.withProperty(zzv5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        zzv zzv6 = new zzv();
        zzv6.zza(6);
        zzg = builder6.withProperty(zzv6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("collapseKey");
        zzv zzv7 = new zzv();
        zzv7.zza(7);
        zzh = builder7.withProperty(zzv7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("priority");
        zzv zzv8 = new zzv();
        zzv8.zza(8);
        zzi = builder8.withProperty(zzv8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("ttl");
        zzv zzv9 = new zzv();
        zzv9.zza(9);
        zzj = builder9.withProperty(zzv9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("topic");
        zzv zzv10 = new zzv();
        zzv10.zza(10);
        zzk = builder10.withProperty(zzv10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("bulkId");
        zzv zzv11 = new zzv();
        zzv11.zza(11);
        zzl = builder11.withProperty(zzv11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("event");
        zzv zzv12 = new zzv();
        zzv12.zza(12);
        zzm = builder12.withProperty(zzv12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("analyticsLabel");
        zzv zzv13 = new zzv();
        zzv13.zza(13);
        zzn = builder13.withProperty(zzv13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("campaignId");
        zzv zzv14 = new zzv();
        zzv14.zza(14);
        zzo = builder14.withProperty(zzv14.zzb()).build();
        FieldDescriptor.Builder builder15 = FieldDescriptor.builder("composerLabel");
        zzv zzv15 = new zzv();
        zzv15.zza(15);
        zzp = builder15.withProperty(zzv15.zzb()).build();
    }

    private zza() {
    }

    public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, messagingClientEvent.getProjectNumber());
        objectEncoderContext.add(zzc, (Object) messagingClientEvent.getMessageId());
        objectEncoderContext.add(zzd, (Object) messagingClientEvent.getInstanceId());
        objectEncoderContext.add(zze, (Object) messagingClientEvent.getMessageType());
        objectEncoderContext.add(zzf, (Object) messagingClientEvent.getSdkPlatform());
        objectEncoderContext.add(zzg, (Object) messagingClientEvent.getPackageName());
        objectEncoderContext.add(zzh, (Object) messagingClientEvent.getCollapseKey());
        objectEncoderContext.add(zzi, messagingClientEvent.getPriority());
        objectEncoderContext.add(zzj, messagingClientEvent.getTtl());
        objectEncoderContext.add(zzk, (Object) messagingClientEvent.getTopic());
        objectEncoderContext.add(zzl, messagingClientEvent.getBulkId());
        objectEncoderContext.add(zzm, (Object) messagingClientEvent.getEvent());
        objectEncoderContext.add(zzn, (Object) messagingClientEvent.getAnalyticsLabel());
        objectEncoderContext.add(zzo, messagingClientEvent.getCampaignId());
        objectEncoderContext.add(zzp, (Object) messagingClientEvent.getComposerLabel());
    }
}
