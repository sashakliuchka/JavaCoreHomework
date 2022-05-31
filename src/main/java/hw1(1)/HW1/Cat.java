package hw1;

public class Cat extends hw1.Team {

    Cat(String name, float maxJump, float maxRun, float maxSwim) {
        super("Кот", name, maxJump, maxRun, maxSwim);
    }

    @Override
    protected int swim(float distance) {
        return hw1.Team.SWIM_NONE;
    }
}
