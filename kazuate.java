import java.util.Scanner;

class Kazuate {
    private static int _kazuateNum = 50;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //5回まで試行
        for(int i = 0; i < 5; i++) {
            int inputNum = sc.nextInt();

            //2桁の正の整数以外の時はやり直し
            if(inputNum < 10 || 99 < inputNum) {
                continue;
            }

            //当たれば当たり表示を出して終了
            if(inputNum == _kazuateNum) {
                System.out.println("当たり");
                break;
            }

            //誤差を計算
            int dif = inputNum - _kazuateNum;

            if(0 < dif) {
                System.out.println("大きい");
            } else {
                System.out.println("小さい");
            }

            //差が20以上なら
            if(dif <= -20 || 20 <= dif) {
                System.out.println("20以上の差があり");
            }
        }

        sc.close();
    }
}