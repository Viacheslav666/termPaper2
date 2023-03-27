import java.awt.*;
import java.util.Scanner;

import static java.lang.Thread.sleep;


public class Main {
    public static void main(String[] args) throws IncorrectArgumentTaskException {

        Task monday = new Task("lover", "Popsa", Type.PERSONAL, Task.taskRepeatability.DAILY_TASK);
        Task tuesday = new Task("Kotler", "Marketing", Type.PROFESSIONAL, Task.taskRepeatability.YEARLY_TASK);
        Task wednesday = new Task("Tatu", "Bisnes", Type.PERSONAL, Task.taskRepeatability.MONTH_TASK);
        System.out.println(monday);
        System.out.println(tuesday);
        System.out.println(wednesday);
        System.out.println(monday.getTimeTask());
        UtilityClass mod = new UtilityClass();
        mod.addTask(monday);
        mod.addTask(wednesday);
        System.out.println(mod);
        tuesday.deadLineTask();
        mod.dateTask();
        mod.deleteTask(1);
        System.out.println(mod);


        Scanner scanner = new Scanner(System.in);
        UtilityClass utilityClass = new UtilityClass();

        while (true) {
            System.out.println("1. Добавить задача");
            System.out.println("2. Получить задачу на день");
            System.out.println("3. Удалить по ID");
            System.out.println("4. Выход");
            System.out.print("Выберите пунт из меню ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Напишите название задачи: ");
                        scanner.nextLine();
                    String header = scanner.nextLine();
                    System.out.println("Напишите описание задачи: ");
                    String descriptions = scanner.nextLine();
                    System.out.println("Выберите тип(PERSONAL, PROFESSIONAL:");
                    Type s = Type.valueOf(scanner.nextLine());

                    System.out.println("Выберите повторяемость(ONE_TAME_TASK ):");
                    Enum e =  Task.taskRepeatability.valueOf(scanner.nextLine());
                    utilityClass.addTask1(header,descriptions,s, (Task.taskRepeatability) e);
                    System.out.println("Задача создана");
                case 2:
                    System.out.println("На сегодняшний день ваши задачи: ");
                    utilityClass.dateTask();
                case 3:
                    scanner.nextLine();
                    System.out.println("Введите номер задачи: ");
                    utilityClass.deleteTask(scanner.nextInt());
                case 4: System.exit(0);
                break;
                default:
                    System.out.println("Введите пункт из списка");
            }
        }

    }



}