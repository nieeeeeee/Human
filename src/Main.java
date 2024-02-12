import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imię człowieka\n");
        String humanName = scanner.next();
        ArrayList<Human> humans = new ArrayList<>();

        System.out.printf("podaj wiek %s\n",humanName);
        int humanAge = scanner.nextInt();
        System.out.printf("podaj kolor oczu %s a\n",humanName);

        String ayeColor = scanner.next();
        AyeColor ayeColorEnum;
        switch (ayeColor){
            case "brown":
                ayeColorEnum = AyeColor.brown;
            case "blue":
                ayeColorEnum = AyeColor.blue;
            case "green":
                ayeColorEnum = AyeColor.green;
            case "gray":
                ayeColorEnum = AyeColor.gray;
            default:
                ayeColorEnum = null;
        }
        System.out.printf("podaj kolor włosów %s a\n",humanName);

        String hairColor = scanner.next();
        HairColor hairColorEnum;
        switch (hairColor){
            case "white":
                hairColorEnum = HairColor.white;
            case "bright blond":
                hairColorEnum = HairColor.bright_blond;
            case "dark blond":
                hairColorEnum = HairColor.dark_blond;
            case "red":
                hairColorEnum = HairColor.red;
            default:
                hairColorEnum = null;
        }
        humans.add(new Human(humanName,humanAge, hairColorEnum, ayeColorEnum));
        System.out.println(humans);
    }
}