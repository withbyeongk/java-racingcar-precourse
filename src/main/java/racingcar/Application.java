package racingcar;

public class Application {
    public static void main(String[] args) {

        // 초기화
        Round r = new Round();
        r.init();

        r.printStage();

        // 횟수만큼 반복하여 진행
        r.run();

        // 우승자 출력
        r.winner();

    }

    public void errPrint(String errMsg) {
        System.out.println("[ERROR]"+errMsg);
    }

}
