/**
 * 无限睡眠，阻塞程序运行
 * @author Fickler
 * @date 2024/4/25 16:05
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR = 60 * 60 * 1000L;
        Thread.sleep(ONE_HOUR);
        System.out.println("睡完了");
    }
}
