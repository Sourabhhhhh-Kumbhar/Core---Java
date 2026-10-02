class Media {

    void play() {
        System.out.println("Playing media file");
    }
}

class AudioFile extends Media {

    void adjustVolume() {
        System.out.println("Adjusting audio volume");
    }
}

public class Downcasting {

    public static void main(String[] args) {

        Media m = new AudioFile(); // Upcasting

        m.play();

        AudioFile audio = (AudioFile) m; // Downcasting

        audio.adjustVolume();
    }
}