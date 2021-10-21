package mvc_pattern;

public class MVCPatternDemo {
	public static void main(String[] args) {

	     
	      Student model  = retriveStudentFromDatabase();

	      
	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      controller.setStudentName("Ram");

	      controller.updateView();
	   }

	   private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("sham");
	      student.setRollNo("1");
	      return student;
	   }

}
