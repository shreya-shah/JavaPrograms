public class MemberVariable {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "Harry Potter";
        m.age = 30;
        m.salary = 2500.3;

        System.out.println("Member name: "+m.name);
        System.out.println("Member age: "+m.age);
        System.out.println("Member salary: "+m.salary);
    }
}
