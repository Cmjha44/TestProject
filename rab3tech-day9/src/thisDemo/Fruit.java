package thisDemo;
public class Fruit {
    int p=8;  // object attribute / instance variable
    // static String name="Prakriti";  // class attribute
    public void print() {
        int p=10;  // local variable
        System.out.println(p); //10
        System.out.println(this); //thisDemo.Fruit@7637f22
        System.out.println(this.p);//8
        
    }
}
