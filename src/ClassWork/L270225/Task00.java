package ClassWork.L270225;

public class Task00 {
    public static void main(String[] args) throws CloneNotSupportedException {

        User user =new User("дима",18);
        User user2 =new User("дима",18);

        System.out.println("user2.equals(user)->" +user2.equals(user));
        System.out.println(user==user2);
//        Object user3=new User("Катя",25);
//        Object users=new User[3];
//        User user4=(User) users;
        System.out.println("user2 hashcode ->"+user2.hashCode());
        System.out.println("user2 hashcode ->"+user.hashCode());

        User user5 =user2.clone();
        System.out.println(user5==user);
        System.out.println(user);
        System.out.println(user5);
    }
}
