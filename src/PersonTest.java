import java.util.*; // 导入工具类，比如List、ArrayList、Collections、Comparator

public class PersonTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        // 添加家人们
        people.add(new Person("Alice", 25, 165));
        people.add(new Person("Bob", 30, 180));
        people.add(new Person("Charlie", 30, 175));
        people.add(new Person("David", 20, 160));

        // 打印原始列表
        System.out.println("原始列表：");
        for (Person p : people) {
            System.out.println(p);
        }

        // 年龄从小到大，如果相同，身高低在前面
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
                if (ageComparison != 0) {
                    return ageComparison;
                } else {
                    return Integer.compare(p1.getHeight(), p2.getHeight());
                }
            }
        });

        // 排序后再打印一次
        System.out.println("\n排序后的列表：");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
