package hw1;

public class Course {

    public static void main(String[] args) {

        String tempWinEvent = " получилось";
        String tempLossEvent = " не получилось";
        String eventName;
        String eventResult;

        hw1.Cat cat1 = new hw1.Cat("Мурзик", 2, 200, 1);
        hw1.Cat cat2 = new hw1.Cat("Матроскин", 2, 200, 1);
        hw1.Dog dog = new hw1.Dog("Тузик", 0.5f, 500, 10);
        hw1.Dog dog2 = new hw1.Dog("Барбос", 0.5f, 100, 0);

        hw1.Team[] arr = {cat1, cat2, dog, dog2};
        float jumpLength = 2.5f;
        float runLength = 250;
        float swimLength = 8;

        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getType() + " " + arr[i].getName() + " может ";

            eventName = "прыгнуть на " + arr[i].getMaxJump() + " м. Пытается прыгнуть на ";
            eventResult = (arr[i].jump(jumpLength)) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, jumpLength, eventResult);


            eventName = "пробежать на " + arr[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = arr[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = arr[i].swim(swimLength);
            eventName = "проплыть на " + arr[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == hw1.Team.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == hw1.Team.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " " + resultEvent);
    }

}
