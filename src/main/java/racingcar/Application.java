package racingcar;

/*
 * [프로그래밍 요구사항]
 *
 * - 프로그램을 실행하는 시작점은 Application의 main()이다.
 * - JDK 8 버전에서 실행 가능해야 한다. JDK 8에서 정상 동작하지 않을 경우 0점 처리한다.
 * - 자바 코드 컨벤션을 지키면서 프로그래밍한다. https://naver.github.io/hackday-conventions-java
 * - indent depth를 3이 넘지 않도록 구현한다. 2까지만 허용.
 *      - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
 *      - 힌트 : indent depth를 줄이는 좋은 방법은 함수를 분리하는 것
 * - 3항 연산자를 쓰지 않는다.
 * - 함수가 한 가지 일만 하도록 최대한 작게 만든다.
 * - 프로그래밍 요구사항에서 별도로 변경 불가 안내가 없는 경우 파일 수정과 패키지 이동을 자유롭게 할 수 있다.
 *
 * [추가 요구사항]
 *
 * - 함수의 길이가 15라인을 넘어가지 않도록 한다.
 *      - 함수가 한 가지 일만 잘 하도록 구현한다.
 * - else 예약어를 쓰지 않는다.
 *      - 힌트 : if 조건절에서 값을 return 하는 방식으로 구현하면 else를 사용하지 않아도 된다.
 *      - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
 *
 * [프로그래밍 요구사항 - Car 객체]
 *
 * - 다음 Car 객체를 활용해 구현해야 한다.
 * - Car 기본 생성자를 추가할 수 없다.
 * - name, position 변수의 접근 제어자인 private 을 변경할 수 없다.
 * - 가능하면 setPosition(int position) 메소드를 추가하지 않고 구현한다.
 *
 * public class Car{
 *      private final String name;
 *      private int position = 0;
 *
 *      public Car(String name) {
 *          this.name = name;
 *      }
 *      
 *      // 추가 기능 구현
 * }
 *
 * [프로그래밍 요구사항 - Randoms, Console]
 *
 * - JDK에서 기본 제공하는 Random, Scanner API 대신
 *      camp.nextstep.edu.missionutils 에서 제공하는 Randoms, Console API를 활용해 구현해야 한다.
 *      - Random 값 추출은 camp.nextstep.edu.missionutils.Randoms 의 pickNumberInRange() 를 활용한다.
 *      - 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console 의 readLine() 을 활용한다.
 * - 프로그램 구현을 완료했을 때 src/test/java 디렉터리의 ApplicationTest 에 있는 모든 테스트 케이스가 성공해야 한다.
 *      테스트가 실패할 경우 0점 처리한다.
 *
 * [기능 요구사항]
 *
 * - 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
 * - 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
 * - 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
 * - 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
 * - 전진하는 조건은 0에서 9사이에서 무작위 값을 구한 후 무작위 값이 4이상일 경우이다.
 * - 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.
 * - 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
 * - 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException 를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
 * - 아래의 프로그래밍 실행 결과 예시와 동일하게 입력과 출력이 이루어져야 한다.
 *
 */

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
    	
    	
    }
}
