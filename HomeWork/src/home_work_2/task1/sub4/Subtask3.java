package home_work_2.task1.sub4;

public class Subtask3 {
    public static void main(String[] args) {
        long a = 1;
        long previousStep;
        long nextStep;

        while (true) {
            previousStep = a;
            nextStep = a * (-19);
            if (nextStep / (-19) != a) {
                System.out.println("Значение до переполнения: " + previousStep);
                System.out.println("Значение после переполнения: " + nextStep);
                break;
            }
            a = nextStep;
        }
    }
}