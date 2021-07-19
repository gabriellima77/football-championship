package campeonato;

public class Clube {
	String name;
	int pts;
	int gb;
	
	Clube(String name) {
		this.name = name;
		this.pts = 0;
		this.gb = 0;
	}
	
	void ganhar(int gb){
		this.pts += 3;
		this.gb += gb;
	}
	
	void empatar() {
		this.pts += 1;
	}
	
	void perder(int gb) {
		this.gb += gb;
	}
}
