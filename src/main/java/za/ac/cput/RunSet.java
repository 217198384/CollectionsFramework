package za.ac.cput;

import java.util.HashSet;
import java.util.Set;

public class RunSet {
    Set studentSet = new HashSet();


    public void addSet(StudentAccount info){
        studentSet.add(info);
    }

    public void removeSet(StudentAccount studentAccount){
        if(studentSet.contains(studentAccount)){
            studentSet.remove(studentAccount);
        }

    }

    public boolean findSet(StudentAccount studentAccount){
        if(studentSet.contains(studentAccount)){
            return true;
        }
        else{
            return false;
        }
    }

    public int setSize(){
        return studentSet.size();
    }
}
