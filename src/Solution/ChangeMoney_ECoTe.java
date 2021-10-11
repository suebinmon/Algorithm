package Solution;
/*
* 이코테 2021 거스름돈
* https://www.youtube.com/watch?v=2zjoKjt97vQ&list=PLRx0vPvlEmdAghTr5mXQxGpHjWqSz0dgC&index=2
* */
public class ChangeMoney_ECoTe {
    public static void main(String[] args) {
        int money = 1260;
        int[] coinTypes = {500, 100, 50, 10};
        int cnt = 0;

        for (int i=0; i<4; i++) {
            cnt += money / coinTypes[i];
            money %= coinTypes[i];
        }

        System.out.println(cnt);
    }
}
