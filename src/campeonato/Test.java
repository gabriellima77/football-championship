package campeonato;

public class Test {
	
	static void showTable(Campeonato c) {
		System.out.println("-------------- Brasileirão --------------");
		for(int i = 0; i < c.clubes.length; i++) {
			System.out.println("Time: " + c.clubes[i].name + ", Pts: " + c.clubes[i].pts + ", Saldo de Gols: " + c.clubes[i].gb + "\n");
		}
		System.out.println("----------------------------------------------------");
	}
	
	public static void main(String[] args) {
		String clubesNames[] = {
			"Palmeiras", "Atlético-MG", "Fortaleza", "Bragantino", "Athletico-PR",
			"Flamengo", "Ceará", "Bahia", "Fluminense", "Santos", "Atlético-GO",
			"Corinthians", "Internacional", "Juventude", "São Paulo", "América-MG",
			"Cuiabá", "Sport", "Grêmio", "Chapecoense"
		};
		
		Campeonato brasileirao = new Campeonato(clubesNames);
		brasileirao.jogarCampeonato();
		Clube campeao = brasileirao.getCampeao();
		System.out.println("============== O campeão =============="); 
		System.out.println("Nome: " + campeao.name + "\nPts: " + campeao.pts + "\nSaldo de Gols: " + campeao.gb);
	}
}
	
	
