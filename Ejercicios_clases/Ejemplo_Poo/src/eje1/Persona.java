package eje1;

public class Persona {
	private String name;
	protected String lastName;
	private Integer CI;
	
	public Persona(String name, String lastName, Integer cI) {
		super();
		this.name = name;
		this.lastName = lastName;
		CI = cI;
	}

	//----------------------------------------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getCI() {
		return CI;
	}

	public void setCI(Integer cI) {
		CI = cI;
	}
	
	
	
	
}
