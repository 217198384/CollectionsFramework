package za.ac.cput;

import java.util.ArrayList;
import java.util.Collection;

public class RunCollection {
    Collection studentCollection = new ArrayList();

    public void addCollection(StudentAccount info){
        studentCollection.add(info);
    }

    public void removeCollection(StudentAccount studentAccount){
        if(studentCollection.contains(studentAccount)){
            studentCollection.remove(studentAccount);
        }

    }

    public boolean findCollection(StudentAccount studentAccount){
        if(studentCollection.contains(studentAccount)){
            return true;
        }
        else{
            return false;
        }
    }

    public int collectionSize(){
        return studentCollection.size();
    }
}
