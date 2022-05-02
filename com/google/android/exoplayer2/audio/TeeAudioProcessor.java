package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class TeeAudioProcessor implements AudioProcessor {
    private final AudioBufferSink audioBufferSink;
    private ByteBuffer buffer = EMPTY_BUFFER;
    private int channelCount = -1;
    private int encoding;
    private boolean inputEnded;
    private boolean isActive;
    private ByteBuffer outputBuffer = EMPTY_BUFFER;
    private int sampleRateHz = -1;

    public interface AudioBufferSink {
        void flush(int i, int i2, int i3);

        void handleBuffer(ByteBuffer byteBuffer);
    }

    public TeeAudioProcessor(AudioBufferSink audioBufferSink2) {
        this.audioBufferSink = (AudioBufferSink) Assertions.checkNotNull(audioBufferSink2);
    }

    public final boolean configure(int i, int i2, int i3) throws AudioProcessor.UnhandledFormatException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1010752796, oncanceled);
            onCancelLoad.getMin(-1010752796, oncanceled);
        }
        this.sampleRateHz = i;
        this.channelCount = i2;
        this.encoding = i3;
        boolean z = this.isActive;
        this.isActive = true;
        if (!z) {
            return true;
        }
        return false;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final int getOutputChannelCount() {
        return this.channelCount;
    }

    public final int getOutputEncoding() {
        return this.encoding;
    }

    public final int getOutputSampleRateHz() {
        return this.sampleRateHz;
    }

    public final void queueInput(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining != 0) {
            this.audioBufferSink.handleBuffer(byteBuffer.asReadOnlyBuffer());
            if (this.buffer.capacity() < remaining) {
                this.buffer = ByteBuffer.allocateDirect(remaining).order(ByteOrder.nativeOrder());
            } else {
                this.buffer.clear();
            }
            this.buffer.put(byteBuffer);
            this.buffer.flip();
            this.outputBuffer = this.buffer;
        }
    }

    public final void queueEndOfStream() {
        this.inputEnded = true;
    }

    public final ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = EMPTY_BUFFER;
        return byteBuffer;
    }

    public final boolean isEnded() {
        return this.inputEnded && this.buffer == EMPTY_BUFFER;
    }

    public final void flush() {
        this.outputBuffer = EMPTY_BUFFER;
        this.inputEnded = false;
        this.audioBufferSink.flush(this.sampleRateHz, this.channelCount, this.encoding);
    }

    public final void reset() {
        flush();
        this.buffer = EMPTY_BUFFER;
        this.sampleRateHz = -1;
        this.channelCount = -1;
        this.encoding = -1;
    }

    public static final class WavFileAudioBufferSink implements AudioBufferSink {
        private static final int FILE_SIZE_MINUS_44_OFFSET = 40;
        private static final int FILE_SIZE_MINUS_8_OFFSET = 4;
        private static final int HEADER_LENGTH = 44;
        private static final String TAG = "WaveFileAudioBufferSink";
        private int bytesWritten;
        private int channelCount;
        private int counter;
        private int encoding;
        private final String outputFileNamePrefix;
        @Nullable
        private RandomAccessFile randomAccessFile;
        private int sampleRateHz;
        private final byte[] scratchBuffer;
        private final ByteBuffer scratchByteBuffer;

        public WavFileAudioBufferSink(String str) {
            this.outputFileNamePrefix = str;
            byte[] bArr = new byte[1024];
            this.scratchBuffer = bArr;
            this.scratchByteBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        public final void flush(int i, int i2, int i3) {
            try {
                reset();
            } catch (IOException e) {
                Log.e(TAG, "Error resetting", e);
            }
            this.sampleRateHz = i;
            this.channelCount = i2;
            this.encoding = i3;
        }

        public final void handleBuffer(ByteBuffer byteBuffer) {
            try {
                maybePrepareFile();
                writeBuffer(byteBuffer);
            } catch (IOException e) {
                Log.e(TAG, "Error writing data", e);
            }
        }

        private void maybePrepareFile() throws IOException {
            if (this.randomAccessFile == null) {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(getNextOutputFileName(), "rw");
                writeFileHeader(randomAccessFile2);
                this.randomAccessFile = randomAccessFile2;
                this.bytesWritten = 44;
            }
        }

        private void writeFileHeader(RandomAccessFile randomAccessFile2) throws IOException {
            randomAccessFile2.writeInt(WavUtil.RIFF_FOURCC);
            randomAccessFile2.writeInt(-1);
            randomAccessFile2.writeInt(WavUtil.WAVE_FOURCC);
            randomAccessFile2.writeInt(WavUtil.FMT_FOURCC);
            this.scratchByteBuffer.clear();
            this.scratchByteBuffer.putInt(16);
            this.scratchByteBuffer.putShort((short) WavUtil.getTypeForEncoding(this.encoding));
            this.scratchByteBuffer.putShort((short) this.channelCount);
            this.scratchByteBuffer.putInt(this.sampleRateHz);
            int pcmFrameSize = Util.getPcmFrameSize(this.encoding, this.channelCount);
            this.scratchByteBuffer.putInt(this.sampleRateHz * pcmFrameSize);
            this.scratchByteBuffer.putShort((short) pcmFrameSize);
            this.scratchByteBuffer.putShort((short) ((pcmFrameSize * 8) / this.channelCount));
            randomAccessFile2.write(this.scratchBuffer, 0, this.scratchByteBuffer.position());
            randomAccessFile2.writeInt(WavUtil.DATA_FOURCC);
            randomAccessFile2.writeInt(-1);
        }

        private void writeBuffer(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile2 = (RandomAccessFile) Assertions.checkNotNull(this.randomAccessFile);
            while (byteBuffer.hasRemaining()) {
                int min = Math.min(byteBuffer.remaining(), this.scratchBuffer.length);
                byteBuffer.get(this.scratchBuffer, 0, min);
                randomAccessFile2.write(this.scratchBuffer, 0, min);
                this.bytesWritten += min;
            }
        }

        private void reset() throws IOException {
            RandomAccessFile randomAccessFile2 = this.randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    this.scratchByteBuffer.clear();
                    this.scratchByteBuffer.putInt(this.bytesWritten - 8);
                    randomAccessFile2.seek(4);
                    randomAccessFile2.write(this.scratchBuffer, 0, 4);
                    this.scratchByteBuffer.clear();
                    this.scratchByteBuffer.putInt(this.bytesWritten - 44);
                    randomAccessFile2.seek(40);
                    randomAccessFile2.write(this.scratchBuffer, 0, 4);
                } catch (IOException e) {
                    Log.w(TAG, "Error updating file size", e);
                }
                try {
                    randomAccessFile2.close();
                } finally {
                    this.randomAccessFile = null;
                }
            }
        }

        private String getNextOutputFileName() {
            int i = this.counter;
            this.counter = i + 1;
            return Util.formatInvariant("%s-%04d.wav", this.outputFileNamePrefix, Integer.valueOf(i));
        }
    }
}
