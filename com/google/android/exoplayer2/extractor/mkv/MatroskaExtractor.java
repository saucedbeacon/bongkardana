package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import o.onOptionsItemSelected;

public final class MatroskaExtractor implements Extractor {
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final ExtractorsFactory FACTORY = onOptionsItemSelected.setMax;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    /* access modifiers changed from: private */
    public static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final byte[] SSA_TIMECODE_EMPTY = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final byte[] SUBRIP_PREFIX = {Framer.STDOUT_FRAME_PREFIX, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final byte[] SUBRIP_TIMECODE_EMPTY = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    /* access modifiers changed from: private */
    public static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);
    private long blockDurationUs;
    private int blockFlags;
    private int blockLacingSampleCount;
    private int blockLacingSampleIndex;
    private int[] blockLacingSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private LongArray cueClusterPositions;
    private LongArray cueTimesUs;
    private long cuesContentPosition;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private boolean sampleRead;
    private boolean sampleSeenReferenceBlock;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final void release() {
    }

    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i);
    }

    MatroskaExtractor(EbmlReader ebmlReader, int i) {
        this.segmentContentPosition = -1;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.cuesContentPosition = -1;
        this.seekPositionAfterBuildingCues = -1;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlReaderOutput());
        this.seekForCuesEnabled = (i & 1) != 0 ? false : true;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
    }

    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return new Sniffer().sniff(extractorInput);
    }

    public final void init(ExtractorOutput extractorOutput2) {
        this.extractorOutput = extractorOutput2;
    }

    public final void seek(long j, long j2) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetSample();
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        this.sampleRead = false;
        boolean z = true;
        while (z && !this.sampleRead) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).outputPendingSampleMetadata();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void startMasterElement(int i, long j, long j2) throws ParserException {
        if (i == 160) {
            this.sampleSeenReferenceBlock = false;
        } else if (i == ID_TRACK_ENTRY) {
            this.currentTrack = new Track();
        } else if (i == ID_CUE_POINT) {
            this.seenClusterPositionForCurrentCuePoint = false;
        } else if (i == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1;
        } else if (i == ID_CONTENT_ENCRYPTION) {
            this.currentTrack.hasContentEncryption = true;
        } else if (i == ID_MASTERING_METADATA) {
            this.currentTrack.hasColorInfo = true;
        } else if (i == ID_SEGMENT) {
            long j3 = this.segmentContentPosition;
            if (j3 == -1 || j3 == j) {
                this.segmentContentPosition = j;
                this.segmentContentSize = j2;
                return;
            }
            throw new ParserException("Multiple Segment elements not supported");
        } else if (i == ID_CUES) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i != ID_CLUSTER || this.sentSeekMap) {
        } else {
            if (!this.seekForCuesEnabled || this.cuesContentPosition == -1) {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
                return;
            }
            this.seekForCues = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void endMasterElement(int i) throws ParserException {
        if (i != 160) {
            if (i == ID_TRACK_ENTRY) {
                if (isCodecSupported(this.currentTrack.codecId)) {
                    Track track = this.currentTrack;
                    track.initializeOutput(this.extractorOutput, track.number);
                    this.tracks.put(this.currentTrack.number, this.currentTrack);
                }
                this.currentTrack = null;
            } else if (i == ID_SEEK) {
                int i2 = this.seekEntryId;
                if (i2 != -1) {
                    long j = this.seekEntryPosition;
                    if (j != -1) {
                        if (i2 == ID_CUES) {
                            this.cuesContentPosition = j;
                            return;
                        }
                        return;
                    }
                }
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } else if (i != ID_CONTENT_ENCODING) {
                if (i != ID_CONTENT_ENCODINGS) {
                    if (i == 357149030) {
                        if (this.timecodeScale == C.TIME_UNSET) {
                            this.timecodeScale = 1000000;
                        }
                        long j2 = this.durationTimecode;
                        if (j2 != C.TIME_UNSET) {
                            this.durationUs = scaleTimecodeToUs(j2);
                        }
                    } else if (i != ID_TRACKS) {
                        if (i == ID_CUES && !this.sentSeekMap) {
                            this.extractorOutput.seekMap(buildSeekMap());
                            this.sentSeekMap = true;
                        }
                    } else if (this.tracks.size() != 0) {
                        this.extractorOutput.endTracks();
                    } else {
                        throw new ParserException("No valid tracks were found");
                    }
                } else if (this.currentTrack.hasContentEncryption && this.currentTrack.sampleStrippedBytes != null) {
                    throw new ParserException("Combining encryption and compression is not supported");
                }
            } else if (!this.currentTrack.hasContentEncryption) {
            } else {
                if (this.currentTrack.cryptoData != null) {
                    this.currentTrack.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                    return;
                }
                throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
            }
        } else if (this.blockState == 2) {
            if (!this.sampleSeenReferenceBlock) {
                this.blockFlags |= 1;
            }
            commitSampleToOutput(this.tracks.get(this.blockTrackNumber), this.blockTimeUs);
            this.blockState = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void integerElement(int i, long j) throws ParserException {
        if (i != ID_CONTENT_ENCODING_ORDER) {
            if (i != ID_CONTENT_ENCODING_SCOPE) {
                boolean z = false;
                switch (i) {
                    case ID_TRACK_TYPE /*131*/:
                        this.currentTrack.type = (int) j;
                        return;
                    case ID_FLAG_DEFAULT /*136*/:
                        Track track = this.currentTrack;
                        if (j == 1) {
                            z = true;
                        }
                        track.flagDefault = z;
                        return;
                    case ID_BLOCK_DURATION /*155*/:
                        this.blockDurationUs = scaleTimecodeToUs(j);
                        return;
                    case ID_CHANNELS /*159*/:
                        this.currentTrack.channelCount = (int) j;
                        return;
                    case ID_PIXEL_WIDTH /*176*/:
                        this.currentTrack.width = (int) j;
                        return;
                    case ID_CUE_TIME /*179*/:
                        this.cueTimesUs.add(scaleTimecodeToUs(j));
                        return;
                    case ID_PIXEL_HEIGHT /*186*/:
                        this.currentTrack.height = (int) j;
                        return;
                    case ID_TRACK_NUMBER /*215*/:
                        this.currentTrack.number = (int) j;
                        return;
                    case ID_TIME_CODE /*231*/:
                        this.clusterTimecodeUs = scaleTimecodeToUs(j);
                        return;
                    case ID_CUE_CLUSTER_POSITION /*241*/:
                        if (!this.seenClusterPositionForCurrentCuePoint) {
                            this.cueClusterPositions.add(j);
                            this.seenClusterPositionForCurrentCuePoint = true;
                            return;
                        }
                        return;
                    case ID_REFERENCE_BLOCK /*251*/:
                        this.sampleSeenReferenceBlock = true;
                        return;
                    case ID_CONTENT_COMPRESSION_ALGORITHM /*16980*/:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new ParserException(sb.toString());
                        }
                        return;
                    case ID_DOC_TYPE_READ_VERSION /*17029*/:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new ParserException(sb2.toString());
                        }
                        return;
                    case ID_EBML_READ_VERSION /*17143*/:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new ParserException(sb3.toString());
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_ALGORITHM /*18401*/:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new ParserException(sb4.toString());
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /*18408*/:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new ParserException(sb5.toString());
                        }
                        return;
                    case ID_SEEK_POSITION /*21420*/:
                        this.seekEntryPosition = j + this.segmentContentPosition;
                        return;
                    case ID_STEREO_MODE /*21432*/:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.currentTrack.stereoMode = 0;
                            return;
                        } else if (i2 == 1) {
                            this.currentTrack.stereoMode = 2;
                            return;
                        } else if (i2 == 3) {
                            this.currentTrack.stereoMode = 1;
                            return;
                        } else if (i2 == 15) {
                            this.currentTrack.stereoMode = 3;
                            return;
                        } else {
                            return;
                        }
                    case ID_DISPLAY_WIDTH /*21680*/:
                        this.currentTrack.displayWidth = (int) j;
                        return;
                    case ID_DISPLAY_UNIT /*21682*/:
                        this.currentTrack.displayUnit = (int) j;
                        return;
                    case ID_DISPLAY_HEIGHT /*21690*/:
                        this.currentTrack.displayHeight = (int) j;
                        return;
                    case ID_FLAG_FORCED /*21930*/:
                        Track track2 = this.currentTrack;
                        if (j == 1) {
                            z = true;
                        }
                        track2.flagForced = z;
                        return;
                    case ID_CODEC_DELAY /*22186*/:
                        this.currentTrack.codecDelayNs = j;
                        return;
                    case ID_SEEK_PRE_ROLL /*22203*/:
                        this.currentTrack.seekPreRollNs = j;
                        return;
                    case ID_AUDIO_BIT_DEPTH /*25188*/:
                        this.currentTrack.audioBitDepth = (int) j;
                        return;
                    case ID_DEFAULT_DURATION /*2352003*/:
                        this.currentTrack.defaultSampleDurationNs = (int) j;
                        return;
                    case ID_TIMECODE_SCALE /*2807729*/:
                        this.timecodeScale = j;
                        return;
                    default:
                        switch (i) {
                            case ID_COLOUR_RANGE /*21945*/:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.currentTrack.colorRange = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.currentTrack.colorRange = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case ID_COLOUR_TRANSFER /*21946*/:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.currentTrack.colorTransfer = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.currentTrack.colorTransfer = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.currentTrack.colorTransfer = 3;
                                return;
                            case ID_COLOUR_PRIMARIES /*21947*/:
                                this.currentTrack.hasColorInfo = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    this.currentTrack.colorSpace = 1;
                                    return;
                                } else if (i5 == 9) {
                                    this.currentTrack.colorSpace = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    this.currentTrack.colorSpace = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case ID_MAX_CLL /*21948*/:
                                this.currentTrack.maxContentLuminance = (int) j;
                                return;
                            case ID_MAX_FALL /*21949*/:
                                this.currentTrack.maxFrameAverageLuminance = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new ParserException(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new ParserException(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void floatElement(int i, double d) {
        if (i == ID_SAMPLING_FREQUENCY) {
            this.currentTrack.sampleRate = (int) d;
        } else if (i != ID_DURATION) {
            switch (i) {
                case ID_PRIMARY_R_CHROMATICITY_X /*21969*/:
                    this.currentTrack.primaryRChromaticityX = (float) d;
                    return;
                case ID_PRIMARY_R_CHROMATICITY_Y /*21970*/:
                    this.currentTrack.primaryRChromaticityY = (float) d;
                    return;
                case ID_PRIMARY_G_CHROMATICITY_X /*21971*/:
                    this.currentTrack.primaryGChromaticityX = (float) d;
                    return;
                case ID_PRIMARY_G_CHROMATICITY_Y /*21972*/:
                    this.currentTrack.primaryGChromaticityY = (float) d;
                    return;
                case ID_PRIMARY_B_CHROMATICITY_X /*21973*/:
                    this.currentTrack.primaryBChromaticityX = (float) d;
                    return;
                case ID_PRIMARY_B_CHROMATICITY_Y /*21974*/:
                    this.currentTrack.primaryBChromaticityY = (float) d;
                    return;
                case ID_WHITE_POINT_CHROMATICITY_X /*21975*/:
                    this.currentTrack.whitePointChromaticityX = (float) d;
                    return;
                case ID_WHITE_POINT_CHROMATICITY_Y /*21976*/:
                    this.currentTrack.whitePointChromaticityY = (float) d;
                    return;
                case ID_LUMNINANCE_MAX /*21977*/:
                    this.currentTrack.maxMasteringLuminance = (float) d;
                    return;
                case ID_LUMNINANCE_MIN /*21978*/:
                    this.currentTrack.minMasteringLuminance = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.durationTimecode = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    public final void stringElement(int i, String str) throws ParserException {
        if (i == 134) {
            this.currentTrack.codecId = str;
        } else if (i != 17026) {
            if (i == ID_LANGUAGE) {
                String unused = this.currentTrack.language = str;
            }
        } else if (!DOC_TYPE_WEBM.equals(str) && !DOC_TYPE_MATROSKA.equals(str)) {
            StringBuilder sb = new StringBuilder("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new ParserException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f3, code lost:
        throw new com.google.android.exoplayer2.ParserException("EBML lacing sample size out of range.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void binaryElement(int r20, int r21, com.google.android.exoplayer2.extractor.ExtractorInput r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 4
            r7 = 0
            r8 = 1
            if (r1 == r4) goto L_0x008e
            if (r1 == r5) goto L_0x008e
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0080
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0071
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0053
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0045
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0035
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r1 = r0.currentTrack
            byte[] r4 = new byte[r2]
            r1.projectionData = r4
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r1 = r0.currentTrack
            byte[] r1 = r1.projectionData
            r3.readFully(r1, r7, r2)
            return
        L_0x0035:
            com.google.android.exoplayer2.ParserException r2 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = java.lang.String.valueOf(r20)
            java.lang.String r3 = "Unexpected id: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x0045:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r1 = r0.currentTrack
            byte[] r4 = new byte[r2]
            r1.codecPrivate = r4
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r1 = r0.currentTrack
            byte[] r1 = r1.codecPrivate
            r3.readFully(r1, r7, r2)
            return
        L_0x0053:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r0.seekEntryIdBytes
            byte[] r1 = r1.data
            java.util.Arrays.fill(r1, r7)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r0.seekEntryIdBytes
            byte[] r1 = r1.data
            int r6 = r6 - r2
            r3.readFully(r1, r6, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r0.seekEntryIdBytes
            r1.setPosition(r7)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r0.seekEntryIdBytes
            long r1 = r1.readUnsignedInt()
            int r2 = (int) r1
            r0.seekEntryId = r2
            return
        L_0x0071:
            byte[] r1 = new byte[r2]
            r3.readFully(r1, r7, r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r2 = r0.currentTrack
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r3 = new com.google.android.exoplayer2.extractor.TrackOutput$CryptoData
            r3.<init>(r8, r1, r7, r7)
            r2.cryptoData = r3
            return
        L_0x0080:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r1 = r0.currentTrack
            byte[] r4 = new byte[r2]
            r1.sampleStrippedBytes = r4
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r1 = r0.currentTrack
            byte[] r1 = r1.sampleStrippedBytes
            r3.readFully(r1, r7, r2)
            return
        L_0x008e:
            int r4 = r0.blockState
            r9 = 8
            if (r4 != 0) goto L_0x00b3
            com.google.android.exoplayer2.extractor.mkv.VarintReader r4 = r0.varintReader
            long r10 = r4.readUnsignedVarint(r3, r7, r8, r9)
            int r4 = (int) r10
            r0.blockTrackNumber = r4
            com.google.android.exoplayer2.extractor.mkv.VarintReader r4 = r0.varintReader
            int r4 = r4.getLastLength()
            r0.blockTrackNumberLength = r4
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.blockDurationUs = r10
            r0.blockState = r8
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r0.scratch
            r4.reset()
        L_0x00b3:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r4 = r0.tracks
            int r10 = r0.blockTrackNumber
            java.lang.Object r4 = r4.get(r10)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r4 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r4
            if (r4 != 0) goto L_0x00c9
            int r1 = r0.blockTrackNumberLength
            int r1 = r2 - r1
            r3.skipFully(r1)
            r0.blockState = r7
            return
        L_0x00c9:
            int r10 = r0.blockState
            if (r10 != r8) goto L_0x0270
            r10 = 3
            r0.readScratch(r3, r10)
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r0.scratch
            byte[] r11 = r11.data
            r12 = 2
            byte r11 = r11[r12]
            r11 = r11 & 6
            int r11 = r11 >> r8
            r13 = 255(0xff, float:3.57E-43)
            if (r11 != 0) goto L_0x00f1
            r0.blockLacingSampleCount = r8
            int[] r6 = r0.blockLacingSampleSizes
            int[] r6 = ensureArrayCapacity(r6, r8)
            r0.blockLacingSampleSizes = r6
            int r11 = r0.blockTrackNumberLength
            int r2 = r2 - r11
            int r2 = r2 - r10
            r6[r7] = r2
            goto L_0x0207
        L_0x00f1:
            if (r1 != r5) goto L_0x0268
            r0.readScratch(r3, r6)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r0.scratch
            byte[] r14 = r14.data
            byte r14 = r14[r10]
            r14 = r14 & r13
            int r14 = r14 + r8
            r0.blockLacingSampleCount = r14
            int[] r15 = r0.blockLacingSampleSizes
            int[] r14 = ensureArrayCapacity(r15, r14)
            r0.blockLacingSampleSizes = r14
            if (r11 != r12) goto L_0x0116
            int r10 = r0.blockTrackNumberLength
            int r2 = r2 - r10
            int r2 = r2 - r6
            int r6 = r0.blockLacingSampleCount
            int r2 = r2 / r6
            java.util.Arrays.fill(r14, r7, r6, r2)
            goto L_0x0207
        L_0x0116:
            if (r11 != r8) goto L_0x014d
            r10 = 0
            r11 = 0
        L_0x011a:
            int r14 = r0.blockLacingSampleCount
            int r15 = r14 + -1
            if (r10 >= r15) goto L_0x0141
            int[] r14 = r0.blockLacingSampleSizes
            r14[r10] = r7
        L_0x0124:
            int r6 = r6 + r8
            r0.readScratch(r3, r6)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r0.scratch
            byte[] r14 = r14.data
            int r15 = r6 + -1
            byte r14 = r14[r15]
            r14 = r14 & r13
            int[] r15 = r0.blockLacingSampleSizes
            r16 = r15[r10]
            int r16 = r16 + r14
            r15[r10] = r16
            if (r14 == r13) goto L_0x0124
            r14 = r15[r10]
            int r11 = r11 + r14
            int r10 = r10 + 1
            goto L_0x011a
        L_0x0141:
            int[] r10 = r0.blockLacingSampleSizes
            int r14 = r14 - r8
            int r15 = r0.blockTrackNumberLength
            int r2 = r2 - r15
            int r2 = r2 - r6
            int r2 = r2 - r11
            r10[r14] = r2
            goto L_0x0207
        L_0x014d:
            if (r11 != r10) goto L_0x0258
            r10 = 0
            r11 = 0
        L_0x0151:
            int r14 = r0.blockLacingSampleCount
            int r15 = r14 + -1
            if (r10 >= r15) goto L_0x01fc
            int[] r14 = r0.blockLacingSampleSizes
            r14[r10] = r7
            int r6 = r6 + 1
            r0.readScratch(r3, r6)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r0.scratch
            byte[] r14 = r14.data
            int r15 = r6 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x01f4
            r16 = 0
            r14 = 0
        L_0x016d:
            if (r14 >= r9) goto L_0x01bf
            int r18 = 7 - r14
            int r18 = r8 << r18
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r0.scratch
            byte[] r5 = r5.data
            byte r5 = r5[r15]
            r5 = r5 & r18
            if (r5 == 0) goto L_0x01b5
            int r6 = r6 + r14
            r0.readScratch(r3, r6)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r0.scratch
            byte[] r5 = r5.data
            int r16 = r15 + 1
            byte r5 = r5[r15]
            r5 = r5 & r13
            r15 = r18 ^ -1
            r5 = r5 & r15
            long r7 = (long) r5
            r5 = r16
        L_0x0190:
            r16 = r7
            if (r5 >= r6) goto L_0x01a7
            long r7 = r16 << r9
            com.google.android.exoplayer2.util.ParsableByteArray r15 = r0.scratch
            byte[] r15 = r15.data
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r13
            long r12 = (long) r5
            long r7 = r7 | r12
            r5 = r16
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x0190
        L_0x01a7:
            if (r10 <= 0) goto L_0x01bf
            int r14 = r14 * 7
            int r14 = r14 + 6
            r7 = 1
            long r12 = r7 << r14
            long r12 = r12 - r7
            long r16 = r16 - r12
            goto L_0x01bf
        L_0x01b5:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x016d
        L_0x01bf:
            r7 = r16
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x01ec
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x01ec
            int r5 = (int) r7
            int[] r7 = r0.blockLacingSampleSizes
            if (r10 != 0) goto L_0x01d5
            goto L_0x01da
        L_0x01d5:
            int r8 = r10 + -1
            r8 = r7[r8]
            int r5 = r5 + r8
        L_0x01da:
            r7[r10] = r5
            int[] r5 = r0.blockLacingSampleSizes
            r5 = r5[r10]
            int r11 = r11 + r5
            int r10 = r10 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x0151
        L_0x01ec:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01f4:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01fc:
            int[] r5 = r0.blockLacingSampleSizes
            r7 = 1
            int r14 = r14 - r7
            int r7 = r0.blockTrackNumberLength
            int r2 = r2 - r7
            int r2 = r2 - r6
            int r2 = r2 - r11
            r5[r14] = r2
        L_0x0207:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.scratch
            byte[] r2 = r2.data
            r5 = 0
            byte r2 = r2[r5]
            int r2 = r2 << r9
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r0.scratch
            byte[] r5 = r5.data
            r6 = 1
            byte r5 = r5[r6]
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            r2 = r2 | r5
            long r5 = r0.clusterTimecodeUs
            long r7 = (long) r2
            long r7 = r0.scaleTimecodeToUs(r7)
            long r5 = r5 + r7
            r0.blockTimeUs = r5
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r0.scratch
            byte[] r2 = r2.data
            r5 = 2
            byte r2 = r2[r5]
            r2 = r2 & r9
            if (r2 != r9) goto L_0x0230
            r2 = 1
            goto L_0x0231
        L_0x0230:
            r2 = 0
        L_0x0231:
            int r6 = r4.type
            if (r6 == r5) goto L_0x0247
            r6 = 163(0xa3, float:2.28E-43)
            if (r1 != r6) goto L_0x0245
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r0.scratch
            byte[] r6 = r6.data
            byte r6 = r6[r5]
            r5 = 128(0x80, float:1.794E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x0245
            goto L_0x0247
        L_0x0245:
            r5 = 0
            goto L_0x0248
        L_0x0247:
            r5 = 1
        L_0x0248:
            if (r2 == 0) goto L_0x024d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x024e
        L_0x024d:
            r2 = 0
        L_0x024e:
            r2 = r2 | r5
            r0.blockFlags = r2
            r2 = 2
            r0.blockState = r2
            r2 = 0
            r0.blockLacingSampleIndex = r2
            goto L_0x0270
        L_0x0258:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = java.lang.String.valueOf(r11)
            java.lang.String r3 = "Unexpected lacing value: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0268:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0270:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x029b
        L_0x0274:
            int r1 = r0.blockLacingSampleIndex
            int r2 = r0.blockLacingSampleCount
            if (r1 >= r2) goto L_0x0297
            int[] r2 = r0.blockLacingSampleSizes
            r1 = r2[r1]
            r0.writeSampleData(r3, r4, r1)
            long r1 = r0.blockTimeUs
            int r5 = r0.blockLacingSampleIndex
            int r6 = r4.defaultSampleDurationNs
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.commitSampleToOutput(r4, r1)
            int r1 = r0.blockLacingSampleIndex
            r2 = 1
            int r1 = r1 + r2
            r0.blockLacingSampleIndex = r1
            goto L_0x0274
        L_0x0297:
            r1 = 0
            r0.blockState = r1
            return
        L_0x029b:
            r1 = 0
            int[] r2 = r0.blockLacingSampleSizes
            r1 = r2[r1]
            r0.writeSampleData(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.binaryElement(int, int, com.google.android.exoplayer2.extractor.ExtractorInput):void");
    }

    private void commitSampleToOutput(Track track, long j) {
        Track track2 = track;
        if (track2.trueHdSampleRechunker != null) {
            track2.trueHdSampleRechunker.sampleMetadata(track2, j);
        } else {
            long j2 = j;
            if (CODEC_ID_SUBRIP.equals(track2.codecId)) {
                commitSubtitleSample(track, SUBRIP_TIMECODE_FORMAT, 19, 1000, SUBRIP_TIMECODE_EMPTY);
            } else if (CODEC_ID_ASS.equals(track2.codecId)) {
                commitSubtitleSample(track, SSA_TIMECODE_FORMAT, 21, 10000, SSA_TIMECODE_EMPTY);
            }
            track2.output.sampleMetadata(j, this.blockFlags, this.sampleBytesWritten, 0, track2.cryptoData);
        }
        this.sampleRead = true;
        resetSample();
    }

    private void resetSample() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset();
    }

    private void readScratch(ExtractorInput extractorInput, int i) throws IOException, InterruptedException {
        if (this.scratch.limit() < i) {
            if (this.scratch.capacity() < i) {
                ParsableByteArray parsableByteArray = this.scratch;
                parsableByteArray.reset(Arrays.copyOf(parsableByteArray.data, Math.max(this.scratch.data.length * 2, i)), this.scratch.limit());
            }
            extractorInput.readFully(this.scratch.data, this.scratch.limit(), i - this.scratch.limit());
            this.scratch.setLimit(i);
        }
    }

    private void writeSampleData(ExtractorInput extractorInput, Track track, int i) throws IOException, InterruptedException {
        int i2;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
        } else if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
        } else {
            TrackOutput trackOutput = track.output;
            boolean z = true;
            if (!this.sampleEncodingHandled) {
                if (track.hasContentEncryption) {
                    this.blockFlags &= -1073741825;
                    int i3 = 128;
                    if (!this.sampleSignalByteRead) {
                        extractorInput.readFully(this.scratch.data, 0, 1);
                        this.sampleBytesRead++;
                        if ((this.scratch.data[0] & 128) != 128) {
                            this.sampleSignalByte = this.scratch.data[0];
                            this.sampleSignalByteRead = true;
                        } else {
                            throw new ParserException("Extension bit is set in signal byte");
                        }
                    }
                    if ((this.sampleSignalByte & 1) == 1) {
                        boolean z2 = (this.sampleSignalByte & 2) == 2;
                        this.blockFlags |= 1073741824;
                        if (!this.sampleInitializationVectorRead) {
                            extractorInput.readFully(this.encryptionInitializationVector.data, 0, 8);
                            this.sampleBytesRead += 8;
                            this.sampleInitializationVectorRead = true;
                            byte[] bArr = this.scratch.data;
                            if (!z2) {
                                i3 = 0;
                            }
                            bArr[0] = (byte) (i3 | 8);
                            this.scratch.setPosition(0);
                            trackOutput.sampleData(this.scratch, 1);
                            this.sampleBytesWritten++;
                            this.encryptionInitializationVector.setPosition(0);
                            trackOutput.sampleData(this.encryptionInitializationVector, 8);
                            this.sampleBytesWritten += 8;
                        }
                        if (z2) {
                            if (!this.samplePartitionCountRead) {
                                extractorInput.readFully(this.scratch.data, 0, 1);
                                this.sampleBytesRead++;
                                this.scratch.setPosition(0);
                                this.samplePartitionCount = this.scratch.readUnsignedByte();
                                this.samplePartitionCountRead = true;
                            }
                            int i4 = this.samplePartitionCount * 4;
                            this.scratch.reset(i4);
                            extractorInput.readFully(this.scratch.data, 0, i4);
                            this.sampleBytesRead += i4;
                            short s = (short) ((this.samplePartitionCount / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i5);
                            }
                            this.encryptionSubsampleDataBuffer.position(0);
                            this.encryptionSubsampleDataBuffer.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.samplePartitionCount;
                                if (i6 >= i2) {
                                    break;
                                }
                                int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                                if (i6 % 2 == 0) {
                                    this.encryptionSubsampleDataBuffer.putShort((short) (readUnsignedIntToInt - i7));
                                } else {
                                    this.encryptionSubsampleDataBuffer.putInt(readUnsignedIntToInt - i7);
                                }
                                i6++;
                                i7 = readUnsignedIntToInt;
                            }
                            int i8 = (i - this.sampleBytesRead) - i7;
                            if (i2 % 2 == 1) {
                                this.encryptionSubsampleDataBuffer.putInt(i8);
                            } else {
                                this.encryptionSubsampleDataBuffer.putShort((short) i8);
                                this.encryptionSubsampleDataBuffer.putInt(0);
                            }
                            this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i5);
                            trackOutput.sampleData(this.encryptionSubsampleData, i5);
                            this.sampleBytesWritten += i5;
                        }
                    }
                } else if (track.sampleStrippedBytes != null) {
                    this.sampleStrippedBytes.reset(track.sampleStrippedBytes, track.sampleStrippedBytes.length);
                }
                this.sampleEncodingHandled = true;
            }
            int limit = i + this.sampleStrippedBytes.limit();
            if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
                if (track.trueHdSampleRechunker != null) {
                    if (this.sampleStrippedBytes.limit() != 0) {
                        z = false;
                    }
                    Assertions.checkState(z);
                    track.trueHdSampleRechunker.startSample(extractorInput, this.blockFlags, limit);
                }
                while (true) {
                    int i9 = this.sampleBytesRead;
                    if (i9 >= limit) {
                        break;
                    }
                    readToOutput(extractorInput, trackOutput, limit - i9);
                }
            } else {
                byte[] bArr2 = this.nalLength.data;
                bArr2[0] = 0;
                bArr2[1] = 0;
                bArr2[2] = 0;
                int i10 = track.nalUnitLengthFieldLength;
                int i11 = 4 - track.nalUnitLengthFieldLength;
                while (this.sampleBytesRead < limit) {
                    int i12 = this.sampleCurrentNalBytesRemaining;
                    if (i12 == 0) {
                        readToTarget(extractorInput, bArr2, i11, i10);
                        this.nalLength.setPosition(0);
                        this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                        this.nalStartCode.setPosition(0);
                        trackOutput.sampleData(this.nalStartCode, 4);
                        this.sampleBytesWritten += 4;
                    } else {
                        this.sampleCurrentNalBytesRemaining = i12 - readToOutput(extractorInput, trackOutput, i12);
                    }
                }
            }
            if (CODEC_ID_VORBIS.equals(track.codecId)) {
                this.vorbisNumPageSamples.setPosition(0);
                trackOutput.sampleData(this.vorbisNumPageSamples, 4);
                this.sampleBytesWritten += 4;
            }
        }
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) throws IOException, InterruptedException {
        int length = bArr.length + i;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.data = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.data, 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.data, bArr.length, i);
        this.subtitleSample.reset(length);
    }

    private void commitSubtitleSample(Track track, String str, int i, long j, byte[] bArr) {
        setSampleDuration(this.subtitleSample.data, this.blockDurationUs, str, i, j, bArr);
        TrackOutput trackOutput = track.output;
        ParsableByteArray parsableByteArray = this.subtitleSample;
        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
        this.sampleBytesWritten += this.subtitleSample.limit();
    }

    private static void setSampleDuration(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        if (j == C.TIME_UNSET) {
            bArr4 = bArr2;
            bArr3 = bArr4;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - (((long) (i2 * 3600)) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - (((long) (i3 * 60)) * 1000000);
            int i4 = (int) (j4 / 1000000);
            int i5 = (int) ((j4 - (((long) i4) * 1000000)) / j2);
            Locale locale = Locale.US;
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            String str2 = str;
            bArr4 = Util.getUtf8Bytes(String.format(locale, str, objArr));
            bArr3 = bArr2;
        }
        byte[] bArr5 = bArr;
        int i6 = i;
        System.arraycopy(bArr4, 0, bArr, i, bArr3.length);
    }

    private void readToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int min = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, min);
        }
        this.sampleBytesRead += i2;
    }

    private int readToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) throws IOException, InterruptedException {
        int i2;
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft > 0) {
            i2 = Math.min(i, bytesLeft);
            trackOutput.sampleData(this.sampleStrippedBytes, i2);
        } else {
            i2 = trackOutput.sampleData(extractorInput, i, false);
        }
        this.sampleBytesRead += i2;
        this.sampleBytesWritten += i2;
        return i2;
    }

    private SeekMap buildSeekMap() {
        LongArray longArray;
        LongArray longArray2;
        if (this.segmentContentPosition == -1 || this.durationUs == C.TIME_UNSET || (longArray = this.cueTimesUs) == null || longArray.size() == 0 || (longArray2 = this.cueClusterPositions) == null || longArray2.size() != this.cueTimesUs.size()) {
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = this.cueTimesUs.size();
        int[] iArr = new int[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jArr3[i2] = this.cueTimesUs.get(i2);
            jArr[i2] = this.segmentContentPosition + this.cueClusterPositions.get(i2);
        }
        while (true) {
            int i3 = size - 1;
            if (i < i3) {
                int i4 = i + 1;
                iArr[i] = (int) (jArr[i4] - jArr[i]);
                jArr2[i] = jArr3[i4] - jArr3[i];
                i = i4;
            } else {
                iArr[i3] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArr[i3]);
                jArr2[i3] = this.durationUs - jArr3[i3];
                this.cueTimesUs = null;
                this.cueClusterPositions = null;
                return new ChunkIndex(iArr, jArr, jArr2, jArr3);
            }
        }
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1;
                return true;
            }
        }
        return false;
    }

    private long scaleTimecodeToUs(long j) throws ParserException {
        long j2 = this.timecodeScale;
        if (j2 != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j, j2, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    private static boolean isCodecSupported(String str) {
        return CODEC_ID_VP8.equals(str) || CODEC_ID_VP9.equals(str) || CODEC_ID_MPEG2.equals(str) || CODEC_ID_MPEG4_SP.equals(str) || CODEC_ID_MPEG4_ASP.equals(str) || CODEC_ID_MPEG4_AP.equals(str) || CODEC_ID_H264.equals(str) || CODEC_ID_H265.equals(str) || CODEC_ID_FOURCC.equals(str) || CODEC_ID_THEORA.equals(str) || CODEC_ID_OPUS.equals(str) || CODEC_ID_VORBIS.equals(str) || CODEC_ID_AAC.equals(str) || CODEC_ID_MP2.equals(str) || CODEC_ID_MP3.equals(str) || CODEC_ID_AC3.equals(str) || CODEC_ID_E_AC3.equals(str) || CODEC_ID_TRUEHD.equals(str) || CODEC_ID_DTS.equals(str) || CODEC_ID_DTS_EXPRESS.equals(str) || CODEC_ID_DTS_LOSSLESS.equals(str) || CODEC_ID_FLAC.equals(str) || CODEC_ID_ACM.equals(str) || CODEC_ID_PCM_INT_LIT.equals(str) || CODEC_ID_SUBRIP.equals(str) || CODEC_ID_ASS.equals(str) || CODEC_ID_VOBSUB.equals(str) || CODEC_ID_PGS.equals(str) || CODEC_ID_DVBSUB.equals(str);
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    final class InnerEbmlReaderOutput implements EbmlReaderOutput {
        public final int getElementType(int i) {
            switch (i) {
                case MatroskaExtractor.ID_TRACK_TYPE /*131*/:
                case MatroskaExtractor.ID_FLAG_DEFAULT /*136*/:
                case MatroskaExtractor.ID_BLOCK_DURATION /*155*/:
                case MatroskaExtractor.ID_CHANNELS /*159*/:
                case MatroskaExtractor.ID_PIXEL_WIDTH /*176*/:
                case MatroskaExtractor.ID_CUE_TIME /*179*/:
                case MatroskaExtractor.ID_PIXEL_HEIGHT /*186*/:
                case MatroskaExtractor.ID_TRACK_NUMBER /*215*/:
                case MatroskaExtractor.ID_TIME_CODE /*231*/:
                case MatroskaExtractor.ID_CUE_CLUSTER_POSITION /*241*/:
                case MatroskaExtractor.ID_REFERENCE_BLOCK /*251*/:
                case MatroskaExtractor.ID_CONTENT_COMPRESSION_ALGORITHM /*16980*/:
                case MatroskaExtractor.ID_DOC_TYPE_READ_VERSION /*17029*/:
                case MatroskaExtractor.ID_EBML_READ_VERSION /*17143*/:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_ALGORITHM /*18401*/:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /*18408*/:
                case MatroskaExtractor.ID_CONTENT_ENCODING_ORDER /*20529*/:
                case MatroskaExtractor.ID_CONTENT_ENCODING_SCOPE /*20530*/:
                case MatroskaExtractor.ID_SEEK_POSITION /*21420*/:
                case MatroskaExtractor.ID_STEREO_MODE /*21432*/:
                case MatroskaExtractor.ID_DISPLAY_WIDTH /*21680*/:
                case MatroskaExtractor.ID_DISPLAY_UNIT /*21682*/:
                case MatroskaExtractor.ID_DISPLAY_HEIGHT /*21690*/:
                case MatroskaExtractor.ID_FLAG_FORCED /*21930*/:
                case MatroskaExtractor.ID_COLOUR_RANGE /*21945*/:
                case MatroskaExtractor.ID_COLOUR_TRANSFER /*21946*/:
                case MatroskaExtractor.ID_COLOUR_PRIMARIES /*21947*/:
                case MatroskaExtractor.ID_MAX_CLL /*21948*/:
                case MatroskaExtractor.ID_MAX_FALL /*21949*/:
                case MatroskaExtractor.ID_CODEC_DELAY /*22186*/:
                case MatroskaExtractor.ID_SEEK_PRE_ROLL /*22203*/:
                case MatroskaExtractor.ID_AUDIO_BIT_DEPTH /*25188*/:
                case MatroskaExtractor.ID_DEFAULT_DURATION /*2352003*/:
                case MatroskaExtractor.ID_TIMECODE_SCALE /*2807729*/:
                    return 2;
                case 134:
                case 17026:
                case MatroskaExtractor.ID_LANGUAGE /*2274716*/:
                    return 3;
                case 160:
                case MatroskaExtractor.ID_TRACK_ENTRY /*174*/:
                case MatroskaExtractor.ID_CUE_TRACK_POSITIONS /*183*/:
                case MatroskaExtractor.ID_CUE_POINT /*187*/:
                case 224:
                case MatroskaExtractor.ID_AUDIO /*225*/:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_AES_SETTINGS /*18407*/:
                case MatroskaExtractor.ID_SEEK /*19899*/:
                case MatroskaExtractor.ID_CONTENT_COMPRESSION /*20532*/:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION /*20533*/:
                case MatroskaExtractor.ID_COLOUR /*21936*/:
                case MatroskaExtractor.ID_MASTERING_METADATA /*21968*/:
                case MatroskaExtractor.ID_CONTENT_ENCODING /*25152*/:
                case MatroskaExtractor.ID_CONTENT_ENCODINGS /*28032*/:
                case MatroskaExtractor.ID_PROJECTION /*30320*/:
                case MatroskaExtractor.ID_SEEK_HEAD /*290298740*/:
                case 357149030:
                case MatroskaExtractor.ID_TRACKS /*374648427*/:
                case MatroskaExtractor.ID_SEGMENT /*408125543*/:
                case MatroskaExtractor.ID_EBML /*440786851*/:
                case MatroskaExtractor.ID_CUES /*475249515*/:
                case MatroskaExtractor.ID_CLUSTER /*524531317*/:
                    return 1;
                case MatroskaExtractor.ID_BLOCK /*161*/:
                case MatroskaExtractor.ID_SIMPLE_BLOCK /*163*/:
                case MatroskaExtractor.ID_CONTENT_COMPRESSION_SETTINGS /*16981*/:
                case MatroskaExtractor.ID_CONTENT_ENCRYPTION_KEY_ID /*18402*/:
                case MatroskaExtractor.ID_SEEK_ID /*21419*/:
                case MatroskaExtractor.ID_CODEC_PRIVATE /*25506*/:
                case MatroskaExtractor.ID_PROJECTION_PRIVATE /*30322*/:
                    return 4;
                case MatroskaExtractor.ID_SAMPLING_FREQUENCY /*181*/:
                case MatroskaExtractor.ID_DURATION /*17545*/:
                case MatroskaExtractor.ID_PRIMARY_R_CHROMATICITY_X /*21969*/:
                case MatroskaExtractor.ID_PRIMARY_R_CHROMATICITY_Y /*21970*/:
                case MatroskaExtractor.ID_PRIMARY_G_CHROMATICITY_X /*21971*/:
                case MatroskaExtractor.ID_PRIMARY_G_CHROMATICITY_Y /*21972*/:
                case MatroskaExtractor.ID_PRIMARY_B_CHROMATICITY_X /*21973*/:
                case MatroskaExtractor.ID_PRIMARY_B_CHROMATICITY_Y /*21974*/:
                case MatroskaExtractor.ID_WHITE_POINT_CHROMATICITY_X /*21975*/:
                case MatroskaExtractor.ID_WHITE_POINT_CHROMATICITY_Y /*21976*/:
                case MatroskaExtractor.ID_LUMNINANCE_MAX /*21977*/:
                case MatroskaExtractor.ID_LUMNINANCE_MIN /*21978*/:
                    return 5;
                default:
                    return 0;
            }
        }

        public final boolean isLevel1Element(int i) {
            return i == 357149030 || i == MatroskaExtractor.ID_CLUSTER || i == MatroskaExtractor.ID_CUES || i == MatroskaExtractor.ID_TRACKS;
        }

        private InnerEbmlReaderOutput() {
        }

        public final void startMasterElement(int i, long j, long j2) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        public final void endMasterElement(int i) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i);
        }

        public final void integerElement(int i, long j) throws ParserException {
            MatroskaExtractor.this.integerElement(i, j);
        }

        public final void floatElement(int i, double d) throws ParserException {
            MatroskaExtractor.this.floatElement(i, d);
        }

        public final void stringElement(int i, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i, str);
        }

        public final void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException, InterruptedException {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }
    }

    static final class TrueHdSampleRechunker {
        private int blockFlags;
        private int chunkSize;
        private boolean foundSyncframe;
        private int sampleCount;
        private final byte[] syncframePrefix = new byte[10];
        private long timeUs;

        public final void reset() {
            this.foundSyncframe = false;
        }

        public final void startSample(ExtractorInput extractorInput, int i, int i2) throws IOException, InterruptedException {
            if (!this.foundSyncframe) {
                extractorInput.peekFully(this.syncframePrefix, 0, 10);
                extractorInput.resetPeekPosition();
                if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.syncframePrefix) != 0) {
                    this.foundSyncframe = true;
                    this.sampleCount = 0;
                } else {
                    return;
                }
            }
            if (this.sampleCount == 0) {
                this.blockFlags = i;
                this.chunkSize = 0;
            }
            this.chunkSize += i2;
        }

        public final void sampleMetadata(Track track, long j) {
            if (this.foundSyncframe) {
                int i = this.sampleCount;
                this.sampleCount = i + 1;
                if (i == 0) {
                    this.timeUs = j;
                }
                if (this.sampleCount >= 16) {
                    track.output.sampleMetadata(this.timeUs, this.blockFlags, this.chunkSize, 0, track.cryptoData);
                    this.sampleCount = 0;
                }
            }
        }

        public final void outputPendingSampleMetadata(Track track) {
            if (this.foundSyncframe && this.sampleCount > 0) {
                track.output.sampleMetadata(this.timeUs, this.blockFlags, this.chunkSize, 0, track.cryptoData);
                this.sampleCount = 0;
            }
        }
    }

    static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        public int audioBitDepth;
        public int channelCount;
        public long codecDelayNs;
        public String codecId;
        public byte[] codecPrivate;
        public int colorRange;
        public int colorSpace;
        public int colorTransfer;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public int displayHeight;
        public int displayUnit;
        public int displayWidth;
        public DrmInitData drmInitData;
        public boolean flagDefault;
        public boolean flagForced;
        public boolean hasColorInfo;
        public boolean hasContentEncryption;
        public int height;
        /* access modifiers changed from: private */
        public String language;
        public int maxContentLuminance;
        public int maxFrameAverageLuminance;
        public float maxMasteringLuminance;
        public float minMasteringLuminance;
        public int nalUnitLengthFieldLength;
        public int number;
        public TrackOutput output;
        public float primaryBChromaticityX;
        public float primaryBChromaticityY;
        public float primaryGChromaticityX;
        public float primaryGChromaticityY;
        public float primaryRChromaticityX;
        public float primaryRChromaticityY;
        public byte[] projectionData;
        public int sampleRate;
        public byte[] sampleStrippedBytes;
        public long seekPreRollNs;
        public int stereoMode;
        @Nullable
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public float whitePointChromaticityX;
        public float whitePointChromaticityY;
        public int width;

        private Track() {
            this.width = -1;
            this.height = -1;
            this.displayWidth = -1;
            this.displayHeight = -1;
            this.displayUnit = 0;
            this.projectionData = null;
            this.stereoMode = -1;
            this.hasColorInfo = false;
            this.colorSpace = -1;
            this.colorTransfer = -1;
            this.colorRange = -1;
            this.maxContentLuminance = 1000;
            this.maxFrameAverageLuminance = 200;
            this.primaryRChromaticityX = -1.0f;
            this.primaryRChromaticityY = -1.0f;
            this.primaryGChromaticityX = -1.0f;
            this.primaryGChromaticityY = -1.0f;
            this.primaryBChromaticityX = -1.0f;
            this.primaryBChromaticityY = -1.0f;
            this.whitePointChromaticityX = -1.0f;
            this.whitePointChromaticityY = -1.0f;
            this.maxMasteringLuminance = -1.0f;
            this.minMasteringLuminance = -1.0f;
            this.channelCount = 1;
            this.audioBitDepth = -1;
            this.sampleRate = 8000;
            this.codecDelayNs = 0;
            this.seekPreRollNs = 0;
            this.flagDefault = true;
            this.language = "eng";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d0, code lost:
            r26 = r1;
            r4 = com.google.android.exoplayer2.util.MimeTypes.AUDIO_RAW;
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x023b, code lost:
            r4 = r16;
            r1 = null;
            r26 = -1;
            r31 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ed, code lost:
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ee, code lost:
            r4 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x030b, code lost:
            r4 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x030d, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x030f, code lost:
            r26 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x0311, code lost:
            r31 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0313, code lost:
            r2 = r0.flagDefault | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0318, code lost:
            if (r0.flagForced == false) goto L_0x031b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x031a, code lost:
            r6 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x031b, code lost:
            r2 = r2 | r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0320, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.isAudio(r4) == false) goto L_0x0348;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0322, code lost:
            r1 = com.google.android.exoplayer2.Format.createAudioSampleFormat(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r31, r0.channelCount, r0.sampleRate, r26, r1, r0.drmInitData, r2, r0.language);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x034c, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.isVideo(r4) == false) goto L_0x03c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0350, code lost:
            if (r0.displayUnit != 0) goto L_0x0364;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0352, code lost:
            r2 = r0.displayWidth;
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0355, code lost:
            if (r2 != -1) goto L_0x0359;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0357, code lost:
            r2 = r0.width;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0359, code lost:
            r0.displayWidth = r2;
            r2 = r0.displayHeight;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x035d, code lost:
            if (r2 != -1) goto L_0x0361;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x035f, code lost:
            r2 = r0.height;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0361, code lost:
            r0.displayHeight = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0364, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0365, code lost:
            r5 = r0.displayWidth;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0369, code lost:
            if (r5 == r3) goto L_0x037d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x036b, code lost:
            r6 = r0.displayHeight;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x036d, code lost:
            if (r6 == r3) goto L_0x037d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x036f, code lost:
            r37 = ((float) (r0.height * r5)) / ((float) (r0.width * r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x037d, code lost:
            r37 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0381, code lost:
            if (r0.hasColorInfo == false) goto L_0x0395;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0383, code lost:
            r40 = new com.google.android.exoplayer2.video.ColorInfo(r0.colorSpace, r0.colorRange, r0.colorTransfer, getHdrStaticInfo());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0395, code lost:
            r40 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0397, code lost:
            r1 = com.google.android.exoplayer2.Format.createVideoSampleFormat(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r31, r0.width, r0.height, -1.0f, r1, -1, r37, r0.projectionData, r0.stereoMode, r40, r0.drmInitData);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c6, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_SUBRIP.equals(r4) == false) goto L_0x03d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x03c8, code lost:
            r1 = com.google.android.exoplayer2.Format.createTextSampleFormat(java.lang.Integer.toString(r44), r4, r2, r0.language, r0.drmInitData);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x03d4, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x03db, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.TEXT_SSA.equals(r4) == false) goto L_0x0410;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x03dd, code lost:
            r1 = new java.util.ArrayList(2);
            r1.add(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$300());
            r1.add(r0.codecPrivate);
            r1 = com.google.android.exoplayer2.Format.createTextSampleFormat(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r2, r0.language, -1, r0.drmInitData, Long.MAX_VALUE, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0414, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB.equals(r4) != false) goto L_0x042b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x041a, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_PGS.equals(r4) != false) goto L_0x042b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0420, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS.equals(r4) == false) goto L_0x0423;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x042a, code lost:
            throw new com.google.android.exoplayer2.ParserException("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x042b, code lost:
            r1 = com.google.android.exoplayer2.Format.createImageSampleFormat(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r2, r1, r0.language, r0.drmInitData);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0446, code lost:
            r2 = r43.track(r0.number, r5);
            r0.output = r2;
            r2.format(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x0453, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void initializeOutput(com.google.android.exoplayer2.extractor.ExtractorOutput r43, int r44) throws com.google.android.exoplayer2.ParserException {
            /*
                r42 = this;
                r0 = r42
                java.lang.String r1 = r0.codecId
                int r2 = r1.hashCode()
                r3 = 4
                r5 = 1
                r6 = 0
                r7 = 2
                r8 = 3
                switch(r2) {
                    case -2095576542: goto L_0x0153;
                    case -2095575984: goto L_0x0149;
                    case -1985379776: goto L_0x013e;
                    case -1784763192: goto L_0x0133;
                    case -1730367663: goto L_0x0128;
                    case -1482641358: goto L_0x011d;
                    case -1482641357: goto L_0x0112;
                    case -1373388978: goto L_0x0107;
                    case -933872740: goto L_0x00fc;
                    case -538363189: goto L_0x00f1;
                    case -538363109: goto L_0x00e6;
                    case -425012669: goto L_0x00da;
                    case -356037306: goto L_0x00ce;
                    case 62923557: goto L_0x00c2;
                    case 62923603: goto L_0x00b6;
                    case 62927045: goto L_0x00aa;
                    case 82338133: goto L_0x009f;
                    case 82338134: goto L_0x0094;
                    case 99146302: goto L_0x0088;
                    case 444813526: goto L_0x007c;
                    case 542569478: goto L_0x0070;
                    case 725957860: goto L_0x0064;
                    case 738597099: goto L_0x0058;
                    case 855502857: goto L_0x004d;
                    case 1422270023: goto L_0x0041;
                    case 1809237540: goto L_0x0036;
                    case 1950749482: goto L_0x002a;
                    case 1950789798: goto L_0x001e;
                    case 1951062397: goto L_0x0012;
                    default: goto L_0x0010;
                }
            L_0x0010:
                goto L_0x015d
            L_0x0012:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 11
                goto L_0x015e
            L_0x001e:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 21
                goto L_0x015e
            L_0x002a:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 16
                goto L_0x015e
            L_0x0036:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 2
                goto L_0x015e
            L_0x0041:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 24
                goto L_0x015e
            L_0x004d:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 7
                goto L_0x015e
            L_0x0058:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 25
                goto L_0x015e
            L_0x0064:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 23
                goto L_0x015e
            L_0x0070:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 19
                goto L_0x015e
            L_0x007c:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 9
                goto L_0x015e
            L_0x0088:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 27
                goto L_0x015e
            L_0x0094:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 1
                goto L_0x015e
            L_0x009f:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 0
                goto L_0x015e
            L_0x00aa:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 18
                goto L_0x015e
            L_0x00b6:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 15
                goto L_0x015e
            L_0x00c2:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 12
                goto L_0x015e
            L_0x00ce:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 20
                goto L_0x015e
            L_0x00da:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 26
                goto L_0x015e
            L_0x00e6:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 6
                goto L_0x015e
            L_0x00f1:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 4
                goto L_0x015e
            L_0x00fc:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 28
                goto L_0x015e
            L_0x0107:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 8
                goto L_0x015e
            L_0x0112:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 14
                goto L_0x015e
            L_0x011d:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 13
                goto L_0x015e
            L_0x0128:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 10
                goto L_0x015e
            L_0x0133:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 17
                goto L_0x015e
            L_0x013e:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 22
                goto L_0x015e
            L_0x0149:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 3
                goto L_0x015e
            L_0x0153:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 5
                goto L_0x015e
            L_0x015d:
                r1 = -1
            L_0x015e:
                java.lang.String r2 = ". Setting mimeType to "
                java.lang.String r10 = "Unsupported PCM bit depth: "
                java.lang.String r11 = "application/dvbsubs"
                java.lang.String r12 = "application/pgs"
                java.lang.String r13 = "application/vobsub"
                java.lang.String r14 = "text/x-ssa"
                java.lang.String r15 = "application/x-subrip"
                java.lang.String r16 = "audio/raw"
                r17 = 4096(0x1000, float:5.74E-42)
                java.lang.String r9 = "MatroskaExtractor"
                java.lang.String r4 = "audio/x-unknown"
                r18 = 0
                switch(r1) {
                    case 0: goto L_0x0308;
                    case 1: goto L_0x0304;
                    case 2: goto L_0x0300;
                    case 3: goto L_0x02f1;
                    case 4: goto L_0x02f1;
                    case 5: goto L_0x02f1;
                    case 6: goto L_0x02d9;
                    case 7: goto L_0x02c4;
                    case 8: goto L_0x02ae;
                    case 9: goto L_0x02aa;
                    case 10: goto L_0x0299;
                    case 11: goto L_0x024f;
                    case 12: goto L_0x0245;
                    case 13: goto L_0x0239;
                    case 14: goto L_0x0236;
                    case 15: goto L_0x0232;
                    case 16: goto L_0x022e;
                    case 17: goto L_0x0223;
                    case 18: goto L_0x021f;
                    case 19: goto L_0x021f;
                    case 20: goto L_0x021b;
                    case 21: goto L_0x0211;
                    case 22: goto L_0x01d8;
                    case 23: goto L_0x01af;
                    case 24: goto L_0x01ac;
                    case 25: goto L_0x01a9;
                    case 26: goto L_0x01a0;
                    case 27: goto L_0x019d;
                    case 28: goto L_0x0182;
                    default: goto L_0x017a;
                }
            L_0x017a:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x0182:
                byte[] r1 = new byte[r3]
                byte[] r2 = r0.codecPrivate
                byte r3 = r2[r6]
                r1[r6] = r3
                byte r3 = r2[r5]
                r1[r5] = r3
                byte r3 = r2[r7]
                r1[r7] = r3
                byte r2 = r2[r8]
                r1[r8] = r2
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r4 = r11
                goto L_0x030f
            L_0x019d:
                r4 = r12
                goto L_0x030d
            L_0x01a0:
                byte[] r1 = r0.codecPrivate
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r4 = r13
                goto L_0x030f
            L_0x01a9:
                r4 = r14
                goto L_0x030d
            L_0x01ac:
                r4 = r15
                goto L_0x030d
            L_0x01af:
                int r1 = r0.audioBitDepth
                int r1 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r1)
                if (r1 != 0) goto L_0x01d0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r10)
                int r3 = r0.audioBitDepth
                r1.append(r3)
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.w(r9, r1)
                goto L_0x030d
            L_0x01d0:
                r26 = r1
                r4 = r16
                r1 = r18
                goto L_0x0311
            L_0x01d8:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                byte[] r3 = r0.codecPrivate
                r1.<init>((byte[]) r3)
                boolean r1 = parseMsAcmCodecPrivate(r1)
                if (r1 == 0) goto L_0x0206
                int r1 = r0.audioBitDepth
                int r1 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r1)
                if (r1 != 0) goto L_0x01d0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r10)
                int r3 = r0.audioBitDepth
                r1.append(r3)
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.w(r9, r1)
                goto L_0x030d
            L_0x0206:
                java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                java.lang.String r1 = r1.concat(r4)
                com.google.android.exoplayer2.util.Log.w(r9, r1)
                goto L_0x030d
            L_0x0211:
                byte[] r1 = r0.codecPrivate
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x02ee
            L_0x021b:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x030b
            L_0x021f:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x030b
            L_0x0223:
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$TrueHdSampleRechunker r1 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$TrueHdSampleRechunker
                r1.<init>()
                r0.trueHdSampleRechunker = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x030b
            L_0x022e:
                java.lang.String r16 = "audio/eac3"
                goto L_0x030b
            L_0x0232:
                java.lang.String r16 = "audio/ac3"
                goto L_0x030b
            L_0x0236:
                java.lang.String r16 = "audio/mpeg"
                goto L_0x023b
            L_0x0239:
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x023b:
                r4 = r16
                r1 = r18
                r26 = -1
                r31 = 4096(0x1000, float:5.74E-42)
                goto L_0x0313
            L_0x0245:
                byte[] r1 = r0.codecPrivate
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x02ee
            L_0x024f:
                r17 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                byte[] r2 = r0.codecPrivate
                r1.add(r2)
                r2 = 8
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r9 = r0.codecDelayNs
                java.nio.ByteBuffer r3 = r3.putLong(r9)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r2 = r2.order(r3)
                long r3 = r0.seekPreRollNs
                java.nio.ByteBuffer r2 = r2.putLong(r3)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.lang.String r16 = "audio/opus"
                r4 = r16
                r26 = -1
                r31 = 5760(0x1680, float:8.071E-42)
                goto L_0x0313
            L_0x0299:
                r17 = 8192(0x2000, float:1.14794E-41)
                byte[] r1 = r0.codecPrivate
                java.util.List r1 = parseVorbisCodecPrivate(r1)
                java.lang.String r16 = "audio/vorbis"
                r4 = r16
                r26 = -1
                r31 = 8192(0x2000, float:1.14794E-41)
                goto L_0x0313
            L_0x02aa:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x030b
            L_0x02ae:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                byte[] r2 = r0.codecPrivate
                r1.<init>((byte[]) r2)
                android.util.Pair r1 = parseFourCcPrivate(r1)
                java.lang.Object r2 = r1.first
                r16 = r2
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L_0x02ee
            L_0x02c4:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                byte[] r2 = r0.codecPrivate
                r1.<init>((byte[]) r2)
                com.google.android.exoplayer2.video.HevcConfig r1 = com.google.android.exoplayer2.video.HevcConfig.parse(r1)
                java.util.List<byte[]> r2 = r1.initializationData
                int r1 = r1.nalUnitLengthFieldLength
                r0.nalUnitLengthFieldLength = r1
                java.lang.String r16 = "video/hevc"
                goto L_0x02ed
            L_0x02d9:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                byte[] r2 = r0.codecPrivate
                r1.<init>((byte[]) r2)
                com.google.android.exoplayer2.video.AvcConfig r1 = com.google.android.exoplayer2.video.AvcConfig.parse(r1)
                java.util.List<byte[]> r2 = r1.initializationData
                int r1 = r1.nalUnitLengthFieldLength
                r0.nalUnitLengthFieldLength = r1
                java.lang.String r16 = "video/avc"
            L_0x02ed:
                r1 = r2
            L_0x02ee:
                r4 = r16
                goto L_0x030f
            L_0x02f1:
                byte[] r1 = r0.codecPrivate
                if (r1 != 0) goto L_0x02f8
                r1 = r18
                goto L_0x02fc
            L_0x02f8:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x02fc:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x02ee
            L_0x0300:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x030b
            L_0x0304:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x030b
            L_0x0308:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x030b:
                r4 = r16
            L_0x030d:
                r1 = r18
            L_0x030f:
                r26 = -1
            L_0x0311:
                r31 = -1
            L_0x0313:
                boolean r2 = r0.flagDefault
                r2 = r2 | r6
                boolean r3 = r0.flagForced
                if (r3 == 0) goto L_0x031b
                r6 = 2
            L_0x031b:
                r2 = r2 | r6
                boolean r3 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r4)
                if (r3 == 0) goto L_0x0348
                java.lang.String r19 = java.lang.Integer.toString(r44)
                r21 = 0
                r22 = -1
                int r3 = r0.channelCount
                int r6 = r0.sampleRate
                com.google.android.exoplayer2.drm.DrmInitData r7 = r0.drmInitData
                java.lang.String r8 = r0.language
                r20 = r4
                r23 = r31
                r24 = r3
                r25 = r6
                r27 = r1
                r28 = r7
                r29 = r2
                r30 = r8
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.createAudioSampleFormat(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                goto L_0x0446
            L_0x0348:
                boolean r3 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r4)
                if (r3 == 0) goto L_0x03c2
                int r2 = r0.displayUnit
                if (r2 != 0) goto L_0x0364
                int r2 = r0.displayWidth
                r3 = -1
                if (r2 != r3) goto L_0x0359
                int r2 = r0.width
            L_0x0359:
                r0.displayWidth = r2
                int r2 = r0.displayHeight
                if (r2 != r3) goto L_0x0361
                int r2 = r0.height
            L_0x0361:
                r0.displayHeight = r2
                goto L_0x0365
            L_0x0364:
                r3 = -1
            L_0x0365:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = r0.displayWidth
                if (r5 == r3) goto L_0x037d
                int r6 = r0.displayHeight
                if (r6 == r3) goto L_0x037d
                int r2 = r0.height
                int r2 = r2 * r5
                float r2 = (float) r2
                int r3 = r0.width
                int r3 = r3 * r6
                float r3 = (float) r3
                float r2 = r2 / r3
                r37 = r2
                goto L_0x037f
            L_0x037d:
                r37 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x037f:
                boolean r2 = r0.hasColorInfo
                if (r2 == 0) goto L_0x0395
                byte[] r2 = r42.getHdrStaticInfo()
                com.google.android.exoplayer2.video.ColorInfo r3 = new com.google.android.exoplayer2.video.ColorInfo
                int r5 = r0.colorSpace
                int r6 = r0.colorRange
                int r8 = r0.colorTransfer
                r3.<init>(r5, r6, r8, r2)
                r40 = r3
                goto L_0x0397
            L_0x0395:
                r40 = r18
            L_0x0397:
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                int r2 = r0.width
                int r3 = r0.height
                r34 = -1082130432(0xffffffffbf800000, float:-1.0)
                r36 = -1
                byte[] r5 = r0.projectionData
                int r6 = r0.stereoMode
                com.google.android.exoplayer2.drm.DrmInitData r8 = r0.drmInitData
                r28 = r4
                r32 = r2
                r33 = r3
                r35 = r1
                r38 = r5
                r39 = r6
                r41 = r8
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.createVideoSampleFormat(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
                r5 = 2
                goto L_0x0446
            L_0x03c2:
                boolean r3 = r15.equals(r4)
                if (r3 == 0) goto L_0x03d7
                java.lang.String r1 = java.lang.Integer.toString(r44)
                java.lang.String r3 = r0.language
                com.google.android.exoplayer2.drm.DrmInitData r5 = r0.drmInitData
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.createTextSampleFormat(r1, r4, r2, r3, r5)
            L_0x03d4:
                r5 = 3
                goto L_0x0446
            L_0x03d7:
                boolean r3 = r14.equals(r4)
                if (r3 == 0) goto L_0x0410
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r7)
                byte[] r3 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.SSA_DIALOGUE_FORMAT
                r1.add(r3)
                byte[] r3 = r0.codecPrivate
                r1.add(r3)
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                java.lang.String r3 = r0.language
                r33 = -1
                com.google.android.exoplayer2.drm.DrmInitData r5 = r0.drmInitData
                r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r28 = r4
                r31 = r2
                r32 = r3
                r34 = r5
                r37 = r1
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.createTextSampleFormat(r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
                goto L_0x03d4
            L_0x0410:
                boolean r3 = r13.equals(r4)
                if (r3 != 0) goto L_0x042b
                boolean r3 = r12.equals(r4)
                if (r3 != 0) goto L_0x042b
                boolean r3 = r11.equals(r4)
                if (r3 == 0) goto L_0x0423
                goto L_0x042b
            L_0x0423:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x042b:
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                java.lang.String r3 = r0.language
                com.google.android.exoplayer2.drm.DrmInitData r5 = r0.drmInitData
                r28 = r4
                r31 = r2
                r32 = r1
                r33 = r3
                r34 = r5
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.createImageSampleFormat(r27, r28, r29, r30, r31, r32, r33, r34)
                goto L_0x03d4
            L_0x0446:
                int r2 = r0.number
                r3 = r43
                com.google.android.exoplayer2.extractor.TrackOutput r2 = r3.track(r2, r5)
                r0.output = r2
                r2.format(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.initializeOutput(com.google.android.exoplayer2.extractor.ExtractorOutput, int):void");
        }

        public final void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker2 = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker2 != null) {
                trueHdSampleRechunker2.outputPendingSampleMetadata(this);
            }
        }

        public final void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker2 = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker2 != null) {
                trueHdSampleRechunker2.reset();
            }
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put((byte) 0);
            wrap.putShort((short) ((int) ((this.primaryRChromaticityX * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.primaryRChromaticityY * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.primaryGChromaticityX * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.primaryGChromaticityY * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.primaryBChromaticityX * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.primaryBChromaticityY * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.whitePointChromaticityX * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.whitePointChromaticityY * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) (this.maxMasteringLuminance + 0.5f)));
            wrap.putShort((short) ((int) (this.minMasteringLuminance + 0.5f)));
            wrap.putShort((short) this.maxContentLuminance);
            wrap.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (readLittleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_H263, (Object) null);
                }
                if (readLittleEndianUnsignedInt == 826496599) {
                    byte[] bArr = parsableByteArray.data;
                    for (int position = parsableByteArray.getPosition() + 20; position < bArr.length - 4; position++) {
                        if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                            return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length)));
                        }
                    }
                    throw new ParserException("Failed to find FourCC VC1 initialization data");
                }
                Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while (bArr[i] == -1) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + bArr[i];
                    int i5 = 0;
                    while (bArr[i3] == -1) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + bArr[i3];
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        throw new ParserException("Error parsing vorbis codec private");
                    }
                    throw new ParserException("Error parsing vorbis codec private");
                }
                throw new ParserException("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort == 1) {
                    return true;
                }
                if (readLittleEndianUnsignedShort == MatroskaExtractor.WAVE_FORMAT_EXTENSIBLE) {
                    parsableByteArray.setPosition(24);
                    return parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits() && parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }
    }
}
