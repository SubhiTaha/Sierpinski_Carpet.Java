import java.util.Collections;

    public class StudentSupportOffice {
        public static void main(String[] args) {
            //Here we create objects and add thingszzzz
            Student s1 = new Student("U0000001");
            Student s2 = new Student("U0000002");
            Student s3 = new Student("U0000003");
            Student s4 = new Student("U0000004");
            Student s5 = new Student("U0000005");

            Module CIS2206 = new Module("CIS2206");
            Module CIS2360 = new Module("CIS2360");
            Module CIS2205 = new Module("CIS2205");

            CIS2206.EnrolledSt(s1);
            CIS2206.EnrolledSt(s5);
            CIS2360.EnrolledSt(s1);
            CIS2360.EnrolledSt(s3);
            CIS2360.EnrolledSt(s4);
            CIS2205.EnrolledSt(s2);
            CIS2205.EnrolledSt(s4);
            CIS2205.EnrolledSt(s5);

            System.out.println("Student before Change" + "\n" + CIS2205 + "\n" + CIS2360 + "\n" + CIS2206);
            System.out.println("-------");
            CIS2206.unrollSt(s5);
            CIS2206.unrollSt(s3);
            CIS2206.unrollSt(s4);

            CIS2360.EnrolledSt(s2);
            CIS2360.EnrolledSt(s5);

            CIS2205.unrollSt(s2);
            CIS2205.unrollSt(s5);
            CIS2205.EnrolledSt(s1);
            CIS2205.EnrolledSt(s3);
            CIS2205.EnrolledSt(s3);

            System.out.println("Student after Change" + "\n" + CIS2205 + "\n" + CIS2360 + "\n" + CIS2206);


        }
    }



