package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public void forwardCar(int n) {
        this.position += n;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int goOrStop() {
        // 랜덤으로 0~9까지 수 뽑기

        // 뽑은 수가 4이상이면 go, 아니면 stop


        return 0;
    }

}
