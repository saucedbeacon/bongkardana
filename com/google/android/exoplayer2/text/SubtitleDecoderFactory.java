package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.MimeTypes;

public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() {
        public final boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return MimeTypes.TEXT_VTT.equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str) || MimeTypes.APPLICATION_PGS.equals(str);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.android.exoplayer2.text.SubtitleDecoder createDecoder(com.google.android.exoplayer2.Format r3) {
            /*
                r2 = this;
                java.lang.String r0 = r3.sampleMimeType
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1351681404: goto L_0x0074;
                    case -1248334819: goto L_0x0069;
                    case -1026075066: goto L_0x005f;
                    case -1004728940: goto L_0x0054;
                    case 691401887: goto L_0x004a;
                    case 822864842: goto L_0x003f;
                    case 930165504: goto L_0x0035;
                    case 1566015601: goto L_0x002b;
                    case 1566016562: goto L_0x0020;
                    case 1668750253: goto L_0x0016;
                    case 1693976202: goto L_0x000b;
                    default: goto L_0x0009;
                }
            L_0x0009:
                goto L_0x007f
            L_0x000b:
                java.lang.String r1 = "application/ttml+xml"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 3
                goto L_0x0080
            L_0x0016:
                java.lang.String r1 = "application/x-subrip"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 4
                goto L_0x0080
            L_0x0020:
                java.lang.String r1 = "application/cea-708"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 8
                goto L_0x0080
            L_0x002b:
                java.lang.String r1 = "application/cea-608"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 6
                goto L_0x0080
            L_0x0035:
                java.lang.String r1 = "application/x-mp4-cea-608"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 7
                goto L_0x0080
            L_0x003f:
                java.lang.String r1 = "text/x-ssa"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 1
                goto L_0x0080
            L_0x004a:
                java.lang.String r1 = "application/x-quicktime-tx3g"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 5
                goto L_0x0080
            L_0x0054:
                java.lang.String r1 = "text/vtt"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 0
                goto L_0x0080
            L_0x005f:
                java.lang.String r1 = "application/x-mp4-vtt"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 2
                goto L_0x0080
            L_0x0069:
                java.lang.String r1 = "application/pgs"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 10
                goto L_0x0080
            L_0x0074:
                java.lang.String r1 = "application/dvbsubs"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007f
                r0 = 9
                goto L_0x0080
            L_0x007f:
                r0 = -1
            L_0x0080:
                switch(r0) {
                    case 0: goto L_0x00cf;
                    case 1: goto L_0x00c7;
                    case 2: goto L_0x00c1;
                    case 3: goto L_0x00bb;
                    case 4: goto L_0x00b5;
                    case 5: goto L_0x00ad;
                    case 6: goto L_0x00a3;
                    case 7: goto L_0x00a3;
                    case 8: goto L_0x0099;
                    case 9: goto L_0x0091;
                    case 10: goto L_0x008b;
                    default: goto L_0x0083;
                }
            L_0x0083:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported format"
                r3.<init>(r0)
                throw r3
            L_0x008b:
                com.google.android.exoplayer2.text.pgs.PgsDecoder r3 = new com.google.android.exoplayer2.text.pgs.PgsDecoder
                r3.<init>()
                return r3
            L_0x0091:
                com.google.android.exoplayer2.text.dvb.DvbDecoder r0 = new com.google.android.exoplayer2.text.dvb.DvbDecoder
                java.util.List<byte[]> r3 = r3.initializationData
                r0.<init>(r3)
                return r0
            L_0x0099:
                com.google.android.exoplayer2.text.cea.Cea708Decoder r0 = new com.google.android.exoplayer2.text.cea.Cea708Decoder
                int r1 = r3.accessibilityChannel
                java.util.List<byte[]> r3 = r3.initializationData
                r0.<init>(r1, r3)
                return r0
            L_0x00a3:
                com.google.android.exoplayer2.text.cea.Cea608Decoder r0 = new com.google.android.exoplayer2.text.cea.Cea608Decoder
                java.lang.String r1 = r3.sampleMimeType
                int r3 = r3.accessibilityChannel
                r0.<init>(r1, r3)
                return r0
            L_0x00ad:
                com.google.android.exoplayer2.text.tx3g.Tx3gDecoder r0 = new com.google.android.exoplayer2.text.tx3g.Tx3gDecoder
                java.util.List<byte[]> r3 = r3.initializationData
                r0.<init>(r3)
                return r0
            L_0x00b5:
                com.google.android.exoplayer2.text.subrip.SubripDecoder r3 = new com.google.android.exoplayer2.text.subrip.SubripDecoder
                r3.<init>()
                return r3
            L_0x00bb:
                com.google.android.exoplayer2.text.ttml.TtmlDecoder r3 = new com.google.android.exoplayer2.text.ttml.TtmlDecoder
                r3.<init>()
                return r3
            L_0x00c1:
                com.google.android.exoplayer2.text.webvtt.Mp4WebvttDecoder r3 = new com.google.android.exoplayer2.text.webvtt.Mp4WebvttDecoder
                r3.<init>()
                return r3
            L_0x00c7:
                com.google.android.exoplayer2.text.ssa.SsaDecoder r0 = new com.google.android.exoplayer2.text.ssa.SsaDecoder
                java.util.List<byte[]> r3 = r3.initializationData
                r0.<init>(r3)
                return r0
            L_0x00cf:
                com.google.android.exoplayer2.text.webvtt.WebvttDecoder r3 = new com.google.android.exoplayer2.text.webvtt.WebvttDecoder
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.SubtitleDecoderFactory.AnonymousClass1.createDecoder(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.text.SubtitleDecoder");
        }
    };

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
