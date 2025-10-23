package home_work_2.task1.sub6;
// Вывести таблицу умножения
public class Task6 {
    public static void main(String[] args) {
        System.out.println("/----------------------------------------------------/");
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                if (j <= 4){
                    if (j*i < 10){
                        System.out.print(j + " * " + i + " = " + (j*i) + "   / ");
                    } else {
                        if (i <= 9){
                            System.out.print(j + " * " + i + " = " + (j*i) + "  / ");
                        } else {
                            System.out.print(j + " * " + i + " = " + (j*i) + " / ");
                        }
                    }
                } else {
                    System.out.print(j + " * " + i + " = " + (j*i) + "\n");
                }
            }
        }
        System.out.println("/----------------------------------------------------/");
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                if (j <= 8){
                    if (j*i < 10){
                        System.out.print(j + " * " + i + " = " + (j*i) + "   / ");
                    } else {
                        if (i <= 9){
                            System.out.print(j + " * " + i + " = " + (j*i) + "  / ");
                        } else {
                            System.out.print(j + " * " + i + " = " + (j*i) + " / ");
                        }
                    }
                } else {
                    System.out.print(j + " * " + i + " = " + (j*i) + "\n");
                }
            }
        }
        System.out.println("/----------------------------------------------------/");
    }
}
