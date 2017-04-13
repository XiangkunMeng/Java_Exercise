package chooseCourse;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public List CourseToSelect;
	public ListTest(){
		this.CourseToSelect = new ArrayList();
	}
	
	public void ListAdd(){
		Course cr1 = new Course("1", "离散数学");
		CourseToSelect.add(cr1);
		Course temp = (Course) CourseToSelect.get(0);
		System.out.println("已添加了一门课程："+temp.getId()+temp.getName());
		Course cr2 = new Course("2","高等数学" );
	}
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.ListAdd();
	}

}
