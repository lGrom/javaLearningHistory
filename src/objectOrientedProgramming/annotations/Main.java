package objectOrientedProgramming.annotations;

public class Main {
    @importance(1)
    public static void main(String[] args) {
        System.out.println("I'm the most important :D");
        lessImportantThing();
        moreImportantThing();
    }

    /**
     *<p> The least important thing in this program</p>
     *
     **/
    @importance(3)
    private static void lessImportantThing() {
        System.out.println("I'm the least important D:");
    }

    /**
     *<p> The second most important thing in this program</p>
     *
     **/
    @importance(2)
    private static void moreImportantThing() {
        System.out.println("I'm the second most important :|");
    }
}
