package com.mezonworks.solid.lsp.mediaplayer_lsp_violation;

public class WinampMediaPlayer extends MediaPlayer {

    public void playVideo() {
        try {
            throw new VideoUnsupportedException();
        } catch (VideoUnsupportedException e) {
            e.printStackTrace();
        }
    }
}
