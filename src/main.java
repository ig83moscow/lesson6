public class main {

    public static void mai(String[] args)
    {
        AnimalWorld world = new AnimalWorld();

        Cat cat = world.newCat(maxRunLimit 200);
        Dog dog = world.newDog(maxRunLimit = 500, maxSwimLimit = 10);

        cat.runOn(neededDistance 150);
        cat.swimOn(neededDistance 5);

        dog.runOn(neededDistance 550);
        dog.swimOn(neededDistance 5);

        System.out.println("Всего животных:" + world.getAnimalsCount());
        System.out.println("Сколько собак:" + world.getDogsCount());
        System.out.println("Сколько кошек:" + world.getCatsCount());
    }
}
