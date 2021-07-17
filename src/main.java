public class main {

    public static void mai(String[] args)
    {
        AnimalWorld world = new AnimalWorld();

        Cat cat = world.newCat(200);
        Dog dog = world.newDog(500, 10);

        cat.runOn(150);
        cat.swimOn(5);

        dog.runOn( 550);
        dog.swimOn( 5);

        System.out.println("Всего животных:" + world.getAnimalsCount());
        System.out.println("Сколько собак:" + world.getDogsCount());
        System.out.println("Сколько кошек:" + world.getCatsCount());
    }
}
