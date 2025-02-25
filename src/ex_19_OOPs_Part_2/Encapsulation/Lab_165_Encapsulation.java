package ex_19_OOPs_Part_2.Encapsulation;

public class Lab_165_Encapsulation {
    public static void main(String[] args) {

        VWO_Login vwoLogin = new VWO_Login("ABCXYZ12","shailesh4508sing@gmail.com");
        System.out.println(vwoLogin.username);
        System.out.println(vwoLogin.password);
        vwoLogin.password = "Star@1234";
        System.out.println(vwoLogin.password);

        Good_Encapsulation_VWO_Login vwoLogin1 = new Good_Encapsulation_VWO_Login("shailesh4508singh@gmail.com","Star@1234");
        vwoLogin1.setUsername("Admin");
        System.out.println(vwoLogin1.getUsername());
        boolean Admin = true;
        vwoLogin1.setPassword("India@123",Admin = false);
        System.out.println(vwoLogin1.getPassword());

    }
}

class VWO_Login{
    String username;
    String password;

    public VWO_Login(String pass, String user) {
        this.password = pass;
        this.username = user;
    }
}

// Good Encapsulation//

class Good_Encapsulation_VWO_Login{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean Admin) {
        if (Admin) {
            this.password = password;
        }else {
            System.out.println("You are not an Admin");
        }
    }

    public Good_Encapsulation_VWO_Login(String user, String pass) {
        this.username = user;
        this.password = pass;
    }
}