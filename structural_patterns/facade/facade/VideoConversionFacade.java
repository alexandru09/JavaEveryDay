package structural_patterns.facade.facade;

import structural_patterns.facade.media_library.AudioMixer;
import structural_patterns.facade.media_library.BitrateReader;
import structural_patterns.facade.media_library.Codec;
import structural_patterns.facade.media_library.CodecFactory;
import structural_patterns.facade.media_library.MPEG4CompressionCodec;
import structural_patterns.facade.media_library.OggCompressionCodec;
import structural_patterns.facade.media_library.VideoFile;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
