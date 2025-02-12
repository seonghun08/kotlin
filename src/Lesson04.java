import sample.JavaMoney;

public class Lesson04 {
    public static void main(String[] args) {
        JavaMoney m1 = new JavaMoney(2_000L);
        JavaMoney m2 = new JavaMoney(1_000L);

        if (m1.compareTo(m2) > 0) {
            System.out.println("Money1이 Money2보다 금액이 큽니다.");
        } else if (m1.compareTo(m2) == 0) {
            System.out.println("Money1이 Money2보다 금액이 동일합니다.");
        } else {
            System.out.println("Money1이 Money2보다 금액이 작습니다.");
        }

        JavaMoney m3 = m1;
        JavaMoney m4 = new JavaMoney(2_000L);

        System.out.println(m1 == m3);
        System.out.println(m2 == m3);
        System.out.println(m3.equals(m4)); // @equals, @hashCode override

        JavaMoney m5 = m1.plus(m2);
        boolean isTrue = m5.getAmount() == (m1.getAmount() + m2.getAmount());
        System.out.println(isTrue);
    }
}
