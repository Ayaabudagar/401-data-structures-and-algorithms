/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void BinaryTreeTest(){
//        Can successfully instantiate an empty tree
        BinaryTree<Integer> testBinary = new BinaryTree<>();
        assertNull(testBinary.root);


//        Can successfully instantiate a tree with a single root node
        BinaryTree<Integer> testBinary2 = new BinaryTree<>(1);
        assertEquals(1,testBinary2.root.value);


//        Can successfully add a left child and right child to a single root node
        testBinary2.root.leftChild = new Node<>(3);
        testBinary2.root.rightChild = new Node<>(5);
        assertEquals(3,testBinary2.root.leftChild.value);
        assertEquals(5,testBinary2.root.rightChild.value);


//        Can successfully return a collection from a preorder traversal
        assertEquals("[1, 3, 5]",testBinary2.preOrder(testBinary2.root).toString());


//        Can successfully return a collection from an inorder traversal
        assertEquals("[3, 1, 5]",testBinary2.inOrder(testBinary2.root).toString());


//        Can successfully return a collection from a postorder traversal
        assertEquals("[3, 5, 1]",testBinary2.postOrder(testBinary2.root).toString());



        //challenge 16 tests for method maximum
        // check for maximum in a normal binary tree
        assertEquals(5,testBinary2.maximum());


        // check for maximum in an empty tree
        assertEquals(0,testBinary.maximum());







        //challenge 17 tests
        //check for a normal binary tree
        assertEquals("[1, 3, 5]",App.breadthFirst(testBinary2).toString());


        //check for an empty tree
        assertEquals("[]",App.breadthFirst(testBinary).toString());






        //challenge 18 tests
        KaryTree<Integer> test = new KaryTree<>(4);
        test.add(3);
        test.add(5);
        test.add(15);
        test.add(1);
        KaryTree<String> test2=  App.fizzBuzzTree(test);

        //If the value is divisible by 3, replace the value with “Fizz”
        assertEquals("Fizz",test2.root.value);

        //If the value is divisible by 5, replace the value with “Buzz”
        assertEquals("Buzz",test2.root.allChildren.get(0).value);

        //If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
        assertEquals("FizzBuzz",test2.root.allChildren.get(1).value);

        //If the value is not divisible by 3 or 5, simply turn the number into a String.
        assertEquals("1",test2.root.allChildren.get(2).value);







    }
}