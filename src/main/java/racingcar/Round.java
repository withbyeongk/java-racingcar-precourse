package racingcar;

import java.util.ArrayList;

public class Round {
    private int				stage;					// 전진 또는 멈춤 횟수(입력 받을 것)
    private int				carNum;					// 자동차 수
    private ArrayList<Car>	carList;				// 참가 차량 리스트
    private final int		DEFAULT_STAGE	= 10;	// stage 기본값
    private final int		DEFAULT_CAR_NUM	= 5;	// 자동차 수 기본값

    public Round() {
        stage	= DEFAULT_STAGE;
        carNum	= DEFAULT_CAR_NUM;
    }

    public Round(int inputStage, int inputCarNum) {
        stage	= inputStage;
        carNum	= inputCarNum;
    }

    public String printWinner() {


        return null;
    }
}
