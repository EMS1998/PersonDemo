public class Person{//定义一个类？？类是什么？
    private String name;
    private int age;
    private int height;
        public Person(String name,int age,int height){//部署普通方法，是构造器。constructor
            this.name=name;//左边是属性，右边是传进来的变量
            this.age=age;
            this.height=height;
        }
        public int getAge(){
            return age;
        }
        public int getHeight(){
            
            return height;
        }
            @Override//重写父类方法
            public String toString (){
                return "person{"+
                "name='"+name+'\''+
                ",age="+age +
                ",height="+height+
                '}';
            }

}