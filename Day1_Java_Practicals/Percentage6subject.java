public class Percentage6subject {
    public static void main(String[] args) {
        int subject1 = 85;
        int subject2 = 90;
        int subject3 = 78;
        int subject4 = 92;
        int subject5 = 88;
        int subject6 = 95;

        int total = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
        double percentage = (double) total / 600 * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
