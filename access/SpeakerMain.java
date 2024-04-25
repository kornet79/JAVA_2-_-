package access;

public class SpeakerMain {


    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.VolumeUp();
        speaker.showVolume();

        speaker.VolumeUp();
        speaker.showVolume();


        System.out.println("volune 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume();
    }

}
