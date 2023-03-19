public class Student implements Comparable <Student> {
    //these are all data entries for a new student
        String s_id;
        String s_name;
        int s_year;

    public Student(String s_id) {
        this.s_id=s_id;
    }


    public String gets_id() { return s_id; }
        public void sets_id(String s_id) {
            this.s_id = s_id;
        }




        public String toString(){
        return "Student{idStudent=" + this.s_id;
        }

        //this makes it possible to compare between students
        @Override
        public int compareTo(Student o) {
            return
                    this.s_id.compareTo((o.s_id));
        }
    }

