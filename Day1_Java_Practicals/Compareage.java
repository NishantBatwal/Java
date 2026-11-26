public class Compareage {
    public static void main(String[] args) {
        int age1 = 25;
        int age2 = 30;

       if(age1.hashCode() == age2.hashCode()) {
            System.out.println("True");
        } else if(age1.hashCode() > age2.hashCode()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
