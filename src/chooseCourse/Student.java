package chooseCourse;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private String name;
	private String id;
	public Set Courses;

	public Student() {
		this.Courses = new HashSet();
	}

	// set和get方法
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            要设置的 id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	// 方法结束

}
