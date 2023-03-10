import java.util.Scanner;

import static java.lang.Thread.sleep;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Task monday = new Task("lover", "Popsa", Type.PERSONAL, Task.taskRepeatability.DAILY_TASK);
        Task tuesday = new Task("Kotler", "Marketing", Type.PROFESSIONAL, Task.taskRepeatability.YEARLY_TASK);
        sleep(1000);
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

    }
    private static void printMenu() {
        System.out.println("""
                    1. Добавить задачу
                    2. Редактировать задачу
                    3. Удалить задачу
                    4. Получить задачи на указанный день
                    5. Получить архивные задачи
                    6. Получить сгруппированные по датам задачи
                    0. Выход"""
        );
    }

}