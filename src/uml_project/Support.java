package uml_project;

public class Support {
	private ERole role;
    private int hours;

    public Support(ERole role, int hours) {
        this.role = role;
        this.hours = hours;
    }

    public ERole getRole() {
        return role;
    }

    public int getHours() {
        return hours;
    }
    
    public void setRole(ERole role){
        this.role = role;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

}
