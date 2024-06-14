package org.example;

public class Main {


    public static int multiplyTwoIntegersWithoutOperatorOrLoop(int a, int b) {
        if (b == 0) {
            return 0;
        }

        if (b < 0) {
            return -multiplyTwoIntegersWithoutOperatorOrLoop(a, -b);
        }

        return multiplyTwoIntegersWithoutOperatorOrLoop(a, b - 1) + a;
    }


    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegersWithoutOperatorOrLoop(5, 5));
        System.out.println(multiplyTwoIntegersWithoutOperatorOrLoop(5, -5));
        System.out.println(multiplyTwoIntegersWithoutOperatorOrLoop(-5, 5));
        System.out.println(multiplyTwoIntegersWithoutOperatorOrLoop(-5, -5));
        System.out.println(multiplyTwoIntegersWithoutOperatorOrLoop(1, -1));
        System.out.println(multiplyTwoIntegersWithoutOperatorOrLoop(-1, 1));
        System.out.println(multiplyTwoIntegersWithoutOperatorOrLoop(1, 1));


        SimpleBinaryTree tree = new SimpleBinaryTree();


        tree.insert(5);
        tree.insert(6);
        tree.insert(9);
        tree.insert(2);
        tree.insert(11);
        tree.insert(23);
        tree.insert(6);

    }
}