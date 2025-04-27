public class Person {
    private String name; // 姓名
    private int age; // 年龄
    private int height; // 身高

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() { // 获取姓名
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", height=" + height + '}';
    }
}
