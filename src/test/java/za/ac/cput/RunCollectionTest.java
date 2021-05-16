package za.ac.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunCollectionTest {
    RunCollection collection = new RunCollection();
    StudentAccount student = new StudentAccount();

    @Test void testAddCollection(){
        StudentAccount student1 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student2 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student3 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student4 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student5 = new StudentAccount("Tisetso", "Kotoana",217198384);

        collection.addCollection(student1);
        collection.addCollection(student2);
        collection.addCollection(student3);
        collection.addCollection(student4);
        collection.addCollection(student5);



        assertEquals(collection.collectionSize(), 5);

    }

    @Test void testRemoveCollection(){
        StudentAccount student1 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student2 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student3 = new StudentAccount("Tisetso", "Kotoana",217198384);

        collection.addCollection(student1);
        collection.addCollection(student2);
        collection.addCollection(student3);

        collection.removeCollection(student2);

        assertEquals(collection.collectionSize(), 2);

    }

    @Test void testFindCollection(){
        StudentAccount student1 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student2 = new StudentAccount("Avene", "Malibongwe",256198384);
        StudentAccount student3 = new StudentAccount("Axolile", "Nkundla",34598384);
        StudentAccount student6 = new StudentAccount("Zama", "Mbatha",54198384);

        collection.addCollection(student1);
        collection.addCollection(student2);
        collection.addCollection(student3);


        assertEquals(collection.findCollection(student3) ,true);

    }
}