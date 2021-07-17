public class Cat extends Animal {
    // 1. Создать класс Кот с наследованием от класса Животное.
    public Cat(float maxRunDistance) { super(maxRunDistance, Integer.MIN_VALUE) ;}

    @Override
    public void swimOn(float neededDistance)
    {
        System.out.println("Кошки не умеют плавать\n") ;

    }

}
