package access;

public class Speaker {
      int volume;

    void VolumeUp() {
        if(volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            System.out.println("음량을 10 중가 시킵니다.");
            volume += 10;
        }

    }

    void VolumeDown() {

        volume -= 10;
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }

    public Speaker(int volume) {
        this.volume = volume;
    }
}
