package HW3;

/**
 * @author Александр Ключка
 * @date 5/27/2022
 */

import java.util.ArrayList;

public class BoxFruit<F> {

    private double weightFruit = 0.0;
    ArrayList<F> fruits = new ArrayList();

    public <F> BoxFruit(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(BoxFruit<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(BoxFruit<F> boxFruit){
        System.out.println("Before merging. Quantity box 1: " + fruits.size());
        System.out.println("Before merging. Quantity box 2: " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("After merging. Quantity box 1: " + fruits.size());
        System.out.println("After merging. Quantity box 2: " + boxFruit.fruits.size());
    }

}
