package Zoo;

import Zoo.Animals.*;
import Zoo.Birds.*;
import Zoo.Fish.*;

import java.util.Arrays;
import java.util.Scanner;

public class Visitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(Zoolist.values()));
        System.out.println("Which one you are interested in? 1-8");
        switch (sc.nextInt()) {
            case 1:
                Cat.catSay();
                Animals.walk();
                break;
            case 2:
                Dog.say();
                Animals.walk();
                break;
            case 3:
                Lion.say();
                Animals.walk();
                break;
            case 4:
                Whale.say();
                Fish.swim();
                break;
            case 5:
                Chicken.say();
                Birds.fly();
                System.out.println("sometimes");
                break;
            case 6:
                Dove.say();
                Birds.fly();
                break;
            case 7:
                Piranha.say();
                Fish.swim();
                break;
            case 8:
                Salmon.say();
                Fish.swim();
                break;
            case 0:
                Watchman.sleep();
        }
    }
}