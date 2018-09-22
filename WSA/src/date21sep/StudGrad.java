public class StudGrad {
    public static void main(String[] arg) {
        String name = "abc";
        int m1 = 65, m2 = 78;
        float t, av;
        t = m1 + m2;
        av = t / 2;
        System.out.println("Average Marks " + av);

        if (av >= 90) {
            System.out.println("excellent");
        } else if (av >= 80 && av < 90) {
            System.out.println("Grade A");
        } else if (av >= 60 && av < 70) {
            System.out.println("Grade B");
        } else if (av >= 50 && av < 60) {
            System.out.println("Grade C");
        } else if (av < 50) {
            System.out.println("fail");
        }

    }
}