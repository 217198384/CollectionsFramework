package za.ac.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunMapTest {
RunMap map = new RunMap();

    @Test
    void testAddMap(){

        map.addMap("Tisetso");
        map.addMap("Tisetso");
        map.addMap("Tisetso");
        map.addMap("Tisetso");



        assertEquals(map.studentMap.size(), 4);

    }

    @Test void testRemoveMap(){
        StudentAccount student1 = new StudentAccount("Tisetso", "Kotoana",217198384);
        StudentAccount student2 = new StudentAccount("Azola", "zaama",217187384);
        StudentAccount student3 = new StudentAccount("Axolile", "Nkundla",217198384);


        map.addMap("Tisetso");
        map.addMap("Tisetso");
        map.addMap("Tisetso");
        map.addMap("Tisetso");

        map.removeMap("Tisetso");


        assertEquals(map.mapSize(), 2);

    }

    @Test void testFindMap(){

        map.addMap("Tisetso");
        map.addMap("Tisetso");
        map.addMap("Tisetso");
        map.addMap("Tisetso");



        assertEquals(map.findMap("Tisetso"), true);

    }
}