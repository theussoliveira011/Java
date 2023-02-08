public class Doctor{


	private static int next_id = 0;
	private int id;
	private String name;
	private String CPF;

	public Doctor(String name, String CPF){
		this.id += ++Doctor.next_id;
		this.name = name;
		this.CPF = CPF;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCPF(String CPF){
		this.CPF = CPF;
	}

	public String getCPF(){
		return CPF;
	}

	public int getId(){
		return id;
	}

}
