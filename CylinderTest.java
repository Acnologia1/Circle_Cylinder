package Lession4;

public class CylinderTest {
    public  static void main(String[] args){
        Cylinder01 cylinder  =new Cylinder01();
        System.out.println(cylinder);

        cylinder = new Cylinder01(3);
        System.out.println(cylinder);
        cylinder  = new Cylinder01(5.0,8.0,"    star ");
        System.out.println(cylinder);
    }
}
