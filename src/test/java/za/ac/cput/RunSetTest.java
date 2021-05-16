package za.ac.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunSetTest {
   RunSet set = new RunSet();
   StudentAccount studentAccount = new StudentAccount();

   @Test
   void testAddSet(){
      StudentAccount student1 = new StudentAccount("Tiseto", "Kotoana",21658384);
      StudentAccount student2 = new StudentAccount("Nyameko", "Zepe",21719845);
      StudentAccount student3 = new StudentAccount("Axolile", "Nkundla",276698384);
      StudentAccount student4 = new StudentAccount("Asanda", "Mbokwen",547198384);
      StudentAccount student5 = new StudentAccount("Mbatha", "Zama",25668384);

      set.addSet(student1);
      set.addSet(student2);
      set.addSet(student3);
      set.addSet(student4);
      set.addSet(student5);




      assertEquals(set.setSize(), 5);

   }

   @Test void testRemoveSet(){
      StudentAccount student1 = new StudentAccount("Tisetso", "Kotoana",217198384);
      StudentAccount student2 = new StudentAccount("Tisetso", "Kotoana",217198384);
      StudentAccount student3 = new StudentAccount("Tisetso", "Kotoana",217198384);

      set.addSet(student1);
      set.addSet(student2);
      set.addSet(student3);


      set.removeSet(student2);

      assertEquals(set.setSize(), 2);

   }

   @Test void testFindSet(){
      StudentAccount student1 = new StudentAccount("Tisetso", "Kotoana",217198384);
      StudentAccount student2 = new StudentAccount("Tisetso", "Kotoana",217198384);
      StudentAccount student3 = new StudentAccount("Tisetso", "Kotoana",217198384);
      StudentAccount student6 = new StudentAccount("Tisetso", "Kotoana",217198384);

      set.addSet(student1);
      set.addSet(student2);
      set.addSet(student3);


      assertEquals(set.findSet(student3) ,true);

   }
}