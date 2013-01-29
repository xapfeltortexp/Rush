package Rush.Object;

public class Arena {
	
	private String name;
	private int a_x;
	private int a_z;
	private int b_x;
	private int b_z;
	private Team team;
	
	public Arena(String name, int a_x, int a_z, int b_x, int b_z, Team team) {
		this.name = name;
		this.a_x = a_x;
		this.a_z = a_z;
		this.b_x = b_x;
		this.b_z = b_z;
		this.team = team;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getCoords() {		
		int[] coords = new int[4];
		coords[0] = this.a_x;
		coords[1] = this.a_z;
		coords[2] = this.b_x;
		coords[3] = this.b_z;		
		return coords;
	} 
	
	public Team getTeam() {
		return this.team;
	}
	
	public void setTeam(Team team) {
		this.team = team;
	}
	

}
