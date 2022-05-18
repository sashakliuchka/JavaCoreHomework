package HomeWork1;

public class Cat extends Team {

    Cat(String name, float maxJump, float maxRun, float maxSwim) {
        super("Кот", name, maxJump, maxRun, maxSwim);
    }

    @Override
    protected int swim(float distance) {
        return Team.SWIM_NONE;
    }
}
