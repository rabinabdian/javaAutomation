package advanced;

import java.util.Arrays;

public class Student {

	private String name;
	private String email;
	private boolean active;
	private String phone;
	private double[] grades;

	public Student(String name, String email, boolean active, String phone, double[] grades) {
		this.name = name;
		this.email = email;
		this.active = active;
		this.phone = phone;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", active=" + active + ", phone=" + phone + ", grades="
				+ Arrays.toString(grades) + "]";
	}

	public double calcAvgGrade() {
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];
		}
		double avg = sum / grades.length;
		return avg;
	}

}
