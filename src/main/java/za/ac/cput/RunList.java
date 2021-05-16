package za.ac.cput;
import java.util.*;


public class RunList {
    List  studentList = new LinkedList();

    public void addList(StudentAccount info){
        studentList.add(info);
    }

    public boolean findList(StudentAccount studentAccount){
        if(studentList.contains(studentAccount)){
            return true;
        }
        else{
            return false;
        }
    }

    public void removeList(StudentAccount studentAccount){
        if(studentList.contains(studentAccount)){
            studentList.remove(studentAccount);
        }

    }

    public int ListSize(){
        return studentList.size();
    }
}
