import java.util.Comparator;

class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge().compareTo(o2.getAge())!=0){
            return o2.getAge().compareTo(o1.getAge());
        }else{
            if(o1.getName().compareTo(o2.getName())!=0){
                return o1.getName().compareTo(o2.getName());
            }else{
                return o1.getId().compareTo(o2.getId());
            }
        }
    }
}
