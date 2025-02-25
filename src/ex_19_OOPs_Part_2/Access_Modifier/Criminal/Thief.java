package ex_19_OOPs_Part_2.Access_Modifier.Criminal;

import ex_19_OOPs_Part_2.Access_Modifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
//        thief.canIshoot();  ----as outside the package/folder protected will not work
    }
}
