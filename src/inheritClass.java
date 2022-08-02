class employee{
    String name;
    int emp_id;
    int salary;
    public void setValue(int emp,String n,int s){
        this.name=n;
        this.emp_id=emp;
        this.salary=s;

    }
    public void getInfo1(){
        System.out.println(emp_id);
        System.out.println(salary);
        System.out.println(name);
    }

}
class programmer extends employee{
    int bonus;
    String language;
    public void setValue(int b,String l){
        this.bonus=b;
        this.language=l;

    }
    public  void getInfo(){
        System.out.println(bonus);
        System.out.println(language);
    }

}




public class inheritClass {

    public  static  void  main(String args[]){
        programmer p1=new programmer();
//        p1.setValue(10000,"Java");
//        p1.getInfo();
        p1.setValue(1001, "Swati",600000);
        p1.getInfo1();
        p1.setValue(10000,"Java");
        p1.getInfo();



    }
}
