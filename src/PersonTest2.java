import java.util.*;

public class PersonTest2 {  // 第二题的测试类

    public Map<String, List<Person>> grouping(List<Person> persons) {
        Map<String, List<Person>> result = new HashMap<>();

        // 分组逻辑
        for (Person person : persons) {
            String name = person.getName();
            String firstLetter = String.valueOf(name.charAt(0)).toUpperCase();
            result.computeIfAbsent(firstLetter, k -> new ArrayList<>()).add(person);
        }

        return result;
    }

    public static void main(String[] args) {  // 第二题的 main 方法
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, 165));
        people.add(new Person("Bob", 30, 180));
        people.add(new Person("Charlie", 30, 175));
        people.add(new Person("David", 20, 160));
        people.add(new Person("alice", 25, 165));
        people.add(new Person("chen", 30, 180));

        PersonTest2 pt = new PersonTest2();  // 创建PersonTest2类实例
        Map<String, List<Person>> groupedPersons = pt.grouping(people);

        // 打印分组结果
        for (Map.Entry<String, List<Person>> entry : groupedPersons.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
