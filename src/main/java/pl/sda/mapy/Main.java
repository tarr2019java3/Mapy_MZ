package pl.sda.mapy;

public class Main {

    public static void main(String[] args) {
	Generyka<String> generyka = new Generyka<String> ("Test");
        System.out.println (generyka.getFiled () );

        Generyka<Integer> generyka1 = new Generyka<Integer> (23233);
        System.out.println (generyka1.getFiled () );
    }
}
