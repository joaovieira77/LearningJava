package estatic;

public class Main {

    public static void main(String[] args) {



        // static = Modifies a variable or method belong to the class,

        //               rather than to any specific object.

        //               Commonly used for utility methods or shared resources.



        Friend friend1 = new Friend("Spongebob");

        Friend friend2 = new Friend("Patrick");

        Friend friend3 = new Friend("Squidward");

        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Mr. Krabs");



        Friend.showFriends();

    }

}
