package campeonato;
import java.util.Random;

public class Campeonato {
	String name;
	Clube clubes[] = new Clube[20];
	
	Campeonato(String name, String[] clubesNames) {
		this.name = name;
		for(int i = 0; i < clubes.length; i++) {
			clubes[i]  = new Clube(clubesNames[i]);
		}
	}
	
	void jogarCampeonato() {
		for(int i = 0; i < clubes.length; i++) {
			for(int j = 0; j < clubes.length; j++) {
				if(i == j) continue;
				this.jogarPartida(clubes[i], clubes[j]);
			}
		}
	}
	
	void jogarPartida(Clube m, Clube v) {
		Random rand = new Random();
		int mGoals = 0;
		int vGoals = 0;
		int probabilityM;
		int probabilityV;
		
		for(int i = 0; i < 90; i++) {
			probabilityM = rand.nextInt(100);
			probabilityV = rand.nextInt(100);
			// Trata a possibilidade de gol do time da casa
			if(probabilityM > 90) mGoals++;
			// Trata a possibilidade de gol do time visitante
			if(probabilityV > 95) vGoals++;
		}
		if(mGoals > vGoals) {
			m.ganhar(mGoals - vGoals);
			v.perder(vGoals - mGoals);
		} else if(vGoals > mGoals) {
			v.ganhar(vGoals - mGoals);
			m.perder(mGoals - vGoals);
		} else {
			m.empatar();
			v.empatar();
		}
	}
	
	Clube getCampeao() {
		Clube campeao = null;
		
		// Pega a maior pontuação do campeonato
		int topPts = 0;
		for(int i = 0; i < clubes.length; i++) {
			if(clubes[i].pts > topPts) topPts = clubes[i].pts;
		}
		
		// Pega o campeão
		for(int i = 0; i < clubes.length; i++) {
			if(clubes[i].pts == topPts) {
				if(campeao == null) campeao = clubes[i];
				else if(campeao.gb < clubes[i].gb) campeao = clubes[i];
			}
		}
		return campeao;
	}
}
