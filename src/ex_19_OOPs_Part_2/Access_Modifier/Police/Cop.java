package ex_19_OOPs_Part_2.Access_Modifier.Police;

public class Cop {
    int gun;
    String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot(){
        System.out.println("Yes, you can Shoot!!");
    }
}
