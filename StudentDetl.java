class  Student
{
	String name;
	int age;
	int marks;
}
class StudentDetl
{
    public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.name="shiva";
		s1.age=22;
		s1.marks=80;
		System.out.println(s1.name+"\n"+s1.age+"\n"+s1.marks);
	}
}