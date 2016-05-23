package rensyuu;

public class Weaponsdeta {
	public int dps  ;
	String name;
	int mods;

	
	public int getDps() {
		
		return dps ;
	}

	public void setDps(int dps) {
		this.dps = dps;
		System.out.println("dps is" +this.getDps());
	}
	String getName() {
		return name;
	}
	void setName(String m){
		name = m;
	}
	int getMods(){
		return mods;
	}
	void setMods(int r){
		mods = r;
	}
	
	public Weaponsdeta() {
		
	}	

}
