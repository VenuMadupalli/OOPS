package Compare;

public class Student implements Comparable<Student>{
    int Id;
    float marks;
    public Student(int Id, float marks){
        this.Id= Id;
        this.marks= marks;
    }
    @Override
    public int compareTo(Student o) {
        int diff=(int) (this.marks- o.marks);
        //if diff==0 both are equal
        //if diff <0 o is bigger
        //else o is small
        return diff;
    }
}
