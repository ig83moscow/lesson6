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
    public void swimOn(float requiredDistance) {
        if (requiredDistance > maxSwimDistance) {
            System.out.println("Не может проплыть " + requiredDistance);
            System.out.println("Максимум возможностей: " + maxRunDistance);
        } else {
            System.out.println("Расстояние для заплыва " + requiredDistance + " преодолено.");
        }

        {
            System.out.println();
        }
    }
}
