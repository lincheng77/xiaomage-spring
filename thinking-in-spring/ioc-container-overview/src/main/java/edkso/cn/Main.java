package edkso.cn;

/**
 * @author dingmengdi
 */
public class Main {
    public static void main(String[] args) {
        Long time1 = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 100 * 100 * 100; i++) {
            for (int j = 0; j < 100 * 100 * 10; j++) {
                count++;
                if (count == Integer.MAX_VALUE) {
                    count = 0;
                }
            }
        }
        Long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);

    }
}