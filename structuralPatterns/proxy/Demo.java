package structuralPatterns.proxy;

import structuralPatterns.proxy.downloader.YoutubeDownloader;
import structuralPatterns.proxy.mediaLibrary.ThirdPartyYoutubeClass;
import structuralPatterns.proxy.proxy.YoutubeCacheProxy;

public class Demo {
    public static void main(String[] args) {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dance video");

        downloader.renderVideoPage("catzzzz");
        downloader.renderVideoPage("someVid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
