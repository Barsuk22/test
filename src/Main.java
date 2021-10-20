public class Main {
    public static void main(String[] args) {
        Cat bigCat = new Cat(3000, "Murka", 2, "Grey");
        Cat smallCat = new Cat(3000, "Murka", 2, "Grey");

        bigCat.setName("Pushok");
        System.out.println("Имя большой кошки: " + bigCat.getName());
        System.out.println("Имя маленькой кошки: " + smallCat.getName());
    }
}
