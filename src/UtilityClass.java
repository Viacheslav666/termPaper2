import java.util.*;

public class UtilityClass {
    private final Map<Integer, Task> taskMap;


    public UtilityClass() {
        taskMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
    }

public void addTask1(String header, String descriptions, Type type, Task.taskRepeatability repeatability) throws IncorrectArgumentTaskException {

        Task task = new Task( header, descriptions, type, repeatability);
        taskMap.put(task.getId(), task);


}

    public void addTask(Task task) throws IncorrectArgumentTaskException {

        try { if(task != null){

            taskMap.put(task.getId(), task);}
        }
        catch (RuntimeException e) {
            throw new IncorrectArgumentTaskException("Ноль вводить нельзя");
        } finally {
            System.out.println("Создали");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtilityClass that = (UtilityClass) o;
        return taskMap.equals(that.taskMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskMap);
    }


    public void dateTask() {
        Map<Integer,Task> integerTaskMap = new HashMap<>();
        integerTaskMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(integerTaskEntry -> test())
                .forEach(System.out::println);

    }
    public void deleteTask(int getKey) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.remove(getKey);
//       integerStringMap = integerStringMap.entrySet().stream()
//                .map(Map.Entry::getKey)
//                .filter(t-> t.)

    }

    private static boolean test() {
        Calendar timeToday = Calendar.getInstance();
        Date r =  Task.getTimeTask();
        return r.equals(timeToday.getTime());
    }

    @Override
    public String toString() {
        return "Список задач" + getTaskList() ;
    }

    public Map<Integer,Task> getTaskList() {
        return taskMap;
    }
    public  void checkType(Type type) throws IncorrectArgumentTaskException {
        if(type == null){
            throw new IncorrectArgumentTaskException("Выберите из списка");
        }
    }

}
