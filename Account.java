public class Account {

    double balancel;
    User user1, user2;

    public Account() {
        balancel = 10000;
        user1 = new User();
        user2 = new User();
    }

    @Override
    public String toString() {
        return "Account [balancel=" + balancel + ", user1=" + user1 + ", user2=" + user2 + "]";
    }

    public double widrawAmmount(int ammunt) {
        balancel = balancel - ammunt;
        return balancel;

    }

    public double depositiAmmount(int ammount) {
        balancel = balancel + ammount;
        return balancel;
    }

    public static void main(String[] args) {

        Account acc1 = new Account();
        acc1.user1.setId(101);
        acc1.user1.setName("hello1");
        acc1.user1.setAddress("indore");
        acc1.user1.setPhno(123445);

        acc1.user2.setId(102);
        acc1.user2.setName("hello2");
        acc1.user2.setAddress("Bhopal");
        acc1.user2.setPhno(9998888);

        System.out.println(acc1.user1.getId());
        System.out.println(acc1.user1.getName());
        System.out.println(acc1.user1.getAddress());
        System.out.println(acc1.user1.getPhno());
        System.out.println(acc1.depositiAmmount(500));
        System.out.println(acc1.widrawAmmount(800));

        // System.out.println(acc1);
    }

}
