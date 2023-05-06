package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;


public class Round {
    private int				stage;		// 전진 또는 멈춤 횟수(입력 받을 것)
    private int				carNum;		// 자동차 수
    private ArrayList<Car>	carList;	// 참가 차량 리스트

    public Round() {
    }

    public void init(){

        this.stage = Input.numOfRound();

        this.carList = Input.addCars();

    }

    public void run(){
        for(int s=0; s<stage; s++){
            System.out.println();
            System.out.println("ROUND " + (s+1));

            // 랜덤으로 0~9까지 수 뽑기
            int[] ranArr = new int[carList.size()];

            for(int i=0; i<ranArr.length; i++){
                ranArr[i] = Randoms.pickNumberInRange(0,9);
            }

            // 뽑은 수가 4이상이면 go, 아니면 stop
            validateMove(ranArr);

            move(ranArr);

            printPosition();
        }
    }

    public void move(int[] ranArr){
        for(int i=0; i<carList.size(); i++){
            carList.get(i).move(ranArr[i]);
        }
    }

    public int[] validateMove(int[] ranArr){
        for(int i=0; i<ranArr.length; i++){
            if(ranArr[i] < 4){
                ranArr[i] = 0;
            }
        }
        return ranArr;
    }

    public void printPosition(){
        for(int i=0; i<carList.size(); i++){
            System.out.println(carList.get(i).getName() + " : " + carList.get(i).getPosition());
        }
    }

    public void winner(){
        int max = maxPosition();

        ArrayList<Car> winners = new ArrayList<Car>(stage);

        for(int i=0; i<carList.size(); i++){
            if( max == carList.get(i).getPosition() ){
                winners.add(carList.get(i));
            }
        }
        printWinner(winners);
    }

    public int maxPosition(){
        int max = 0;
        for(int i=0; i<carList.size(); i++){
            for(int j=0; j<carList.size(); j++){
                if( carList.get(i).getPosition() > carList.get(j).getPosition()){
                    max = carList.get(i).getPosition();
                }
            }
        }
        return max;
    }

    public void printWinner(ArrayList<Car> winners){
        System.out.println("==WINNER==");
        System.out.println("우승차량 :");
        for(int i=0; i<winners.size(); i++){
            System.out.println(winners.get(i).getName()+" : " + winners.get(i).getPosition());
        }
    }

    public void printStage(){
        System.out.println();
        System.out.println("THIS ROUND STAGE NUM IS " +this.stage);
    }

    public void printInfo() {
        System.out.println("==ROUND INFORMATION==");
        System.out.println("STAGE IS "+stage);
        System.out.println("참가차량 소개");
        for(int i=0; i<carList.size(); i++){
            System.out.println(carList.get(i)+" ");
        }
    }

}
