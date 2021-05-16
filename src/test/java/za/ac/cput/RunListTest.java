package za.ac.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunListTest {
    RunList list = new RunList();
    StudentAccount student = new StudentAccount();

    @Test
    void testAddCollection(){
        StudentAccount student1 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student2 = new StudentAccount("Axolile", "Nkundla",217198384);
        StudentAccount student3 = new StudentAccount("Asanda", "Mbokwen",217198384);
        StudentAccount student4 = new StudentAccount("Aphiwe", "Qunta",217198384);
        StudentAccount student5 = new StudentAccount("Sesethu", "Kraai",217198384);

        list.addList(student1);
        list.addList(student2);
        list.addList(student3);
        list.addList(student4);
        list.addList(student5);



        assertEquals(list.ListSize(), 5);

    }

    @Test void testRemoveList(){
        StudentAccount student1 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student2 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student3 = new StudentAccount("Tisetso", "Kotoana",217198384);

        list.addList(student1);
        list.addList(student2);
        list.addList(student3);

        list.removeList(student2);

        assertEquals(list.ListSize(), 2);

    }

    @Test void testFindCollection(){
        StudentAccount student1 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student2 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student3 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student6 = new StudentAccount("Tisetso", "Kotoana",217198384);

        list.addList(student1);
        list.addList(student2);
        list.addList(student3);


        assertEquals(list.findList(student3) ,true);

    }

}