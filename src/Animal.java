public abstract class Animal {

    private float maxRunDistance;
    private float maxSwimDistance;

    public Animal(float maxRunDistance, float maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void runOn(float neededDistance) {
        if (neededDistance > maxRunDistance) {
            System.out.println("не может пробежать" + neededDistance);
            System.out.println("Больше не может бежать" + maxRunDistance);
        } else {
            System.out.println("Расстояние для заплыва" + neededDistance + "преодоление максимума" + maxRunDistance);
        }
    }
}
