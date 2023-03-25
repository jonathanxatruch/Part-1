
public class Surgeon extends HospitalEmployee{
	protected String specialty;
	protected boolean operating;
	Surgeon(String empName, int empNumber, String empSpecialty, boolean isOperating) {
		super(empName, empNumber);
		specialty = empSpecialty;
		operating = isOperating;
	}
	
	@Override
	public String toString()
	{
		return name + "\t" + number + "\t" + specialty + "\tOperating: " + operating;
	}
	
	@Override
	public void work()
	{
		String isOperating;
		System.out.print(name + " works for the hospital. ");
		if(operating == true)
		isOperating = " operating now.";
		else 
		isOperating = " not operating now.";
		System.out.println(name + " is" + isOperating);
	}
}