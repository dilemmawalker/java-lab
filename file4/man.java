public class man{
    public static class person{
        String name="Yash";
        int age=20;
        int salary=100000;
    person(String n,int a,int s){
        this.name=n;
        this.age=a;
        this.salary=s;
    }
}
    public static void main(String []args){
        person obj=new person("leonardo",35,2000);
        System.out.println("Name: "+obj.name);
        System.out.println("Age: "+obj.age);
        System.out.println("Salary: "+obj.salary);
    }
}