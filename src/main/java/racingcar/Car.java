package racingcar;

public class Car implements Vehicle {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

	@Override
	public String printWinner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int forwardCar() {
		// TODO Auto-generated method stub
		return 0;
	}

    // 추가 기능 구현
}
