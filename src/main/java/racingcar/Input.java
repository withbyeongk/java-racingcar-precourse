package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Input {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MIN_NAME_LENGTH = 1;

    public static int numOfRound(){
        // 몇 회 진행할 것인지 입력 받음.
        int stage = -1;
        try{
            String input = Console.readLine();

            stage = Integer.parseInt(input);
        } catch(IllegalArgumentException e){
            new IllegalArgumentException("[ERROR]입력 오류");
            return numOfRound();
        }
        System.out.println("STAGE IS "+stage);
        return stage;
    }

    public static ArrayList<Car> addCars() throws IllegalArgumentException {
        // 자동차 이름 입력(,를 구분으로 여러대 입력 가능)
        System.out.println("차량 등록 (\',\'로 구분): ");

        ArrayList<Car> carList;

        try{
            String cars = Console.readLine();

            String[] carArr = cars.split(",");

            carList = new ArrayList<Car>(carArr.length);

            for (String car : carArr) {
                validateCarName(car);

                Car c = new Car(car);

                carList.add(c);

            }

        } catch(IllegalArgumentException e){
            new IllegalArgumentException("[ERROR]차량 입력 오류");
            return addCars();
        }

        return carList;
    }

    public static void validateCarName(String carName) throws IllegalArgumentException {
        if(carName.length() > MAX_NAME_LENGTH || carName.length() < MIN_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR]차이름 글자제한 오류");
        }
    }
}
