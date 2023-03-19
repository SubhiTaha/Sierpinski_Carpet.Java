import java.util.ArrayList;
import java.util.Arrays;

public class Module {
    String M_id;
    Student[] EnrolledSt;
    int size;

    public Module(String M_id) {
        this.M_id = M_id;
        this.EnrolledSt = new Student[5];
        this.size = 0;
    }

    public void EnrolledSt(Student student) {
        //check wether its there
        for (int index = 0; index < size; index++) {
            if (EnrolledSt[index].gets_id().equals(student.gets_id())) {
                System.out.println("\nError during enrollment\nStudent enrolled already\n\n");
                return;
            }
        }
        //Add Student
        EnrolledSt[size] = student;
        //increase size by one
        size++;
        Arrays.sort(EnrolledSt, 0, this.size);

    }

    public void unrollSt(Student s_id) {

        //remove student
        //Student id is found using a sequential search
        for (int index = 0; index < EnrolledSt.length; index++) {
            if (String.valueOf(EnrolledSt[index]).equals(String.valueOf(s_id))) {
                EnrolledSt[index] = null;
                //sort it here
                size--;
                break;
            }
        }

        //loop gets shifted
        int tmpSize = 0;
        Student[] tmp = new Student[EnrolledSt.length];
        for (int index = 0; index < EnrolledSt.length; index++) {
            if (EnrolledSt[index] != null) {
                tmp[tmpSize] = EnrolledSt[index];
                tmpSize++;
            }
        }
        for (int index = 0; index < EnrolledSt.length; index++) {
            EnrolledSt[index] = tmp[index];
        }
    }


    //not null elements are not null
    @Override
    public String toString() {
        StringBuilder Module = new StringBuilder("Module[" + M_id + "]\nEnrolled Students:\n");
        for (Student enrolledStudent : EnrolledSt) {
            if (enrolledStudent == null) {
                continue;
            } else {
                Module.append(enrolledStudent).append("\n");
            }
        }
        return Module.toString();
    }
}
