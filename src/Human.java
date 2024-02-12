public class Human {
    String name;
    int age;
    HairColor hairColor;
    AyeColor ayeColor;

    public Human(String name, int age, HairColor hairColor, AyeColor ayeColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.ayeColor = ayeColor;
    }

    @Override
    public String toString() {
        return String.format("imie %s,wiek %d,kolów %s,kolor oczu %s\n",name,age,hairColor,ayeColor);
    }
}
