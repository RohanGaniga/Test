package football;

import java.util.concurrent.TimeUnit;

public class Football {

	public static void main(String[] args) throws InterruptedException {
		int firstTeam = 0;
		int totalGoalsFirstTeam = 0;
		int secondTeam = 0;
		int totalGoalsSecondTeam = 0;
		for(int i = 0; i<5 ; i++) {
			firstTeam = (int)(Math.random()*2);
			totalGoalsFirstTeam = totalGoalsFirstTeam + firstTeam;
			if(firstTeam == 1) {
				System.out.println("First team scores!! "+totalGoalsFirstTeam+"-"+totalGoalsSecondTeam);
			}
			else {
				System.out.println("First team misses!!"+totalGoalsFirstTeam+"-"+totalGoalsSecondTeam);
			}
			TimeUnit.SECONDS.sleep(1);
			secondTeam = (int)(Math.random()*2);
			totalGoalsSecondTeam = totalGoalsSecondTeam + secondTeam;
			if(secondTeam == 1) {
				System.out.println("Second team scores!!"+totalGoalsFirstTeam+"-"+totalGoalsSecondTeam);
			}
			else {
				System.out.println("Second team misses!!"+totalGoalsFirstTeam+"-"+totalGoalsSecondTeam);
			}
			TimeUnit.SECONDS.sleep(1);
		}
		if(totalGoalsFirstTeam > totalGoalsSecondTeam) {
			System.out.println("First Team wins with "+totalGoalsFirstTeam+" goals");
		}
		else if(totalGoalsSecondTeam > totalGoalsFirstTeam) {
			System.out.println("Second Team wins with "+totalGoalsSecondTeam+" goals");
		}
		else {
			System.out.println("Its a draw. Time for sudden death!! The team which scores will win");
			TimeUnit.SECONDS.sleep(1);
			firstTeam = (int)(Math.random()*2);
			if(firstTeam == 1) {
				System.out.println("First team scores!!");
			}
			else {
				System.out.println("First team misses!!");
			}
			TimeUnit.SECONDS.sleep(1);
			secondTeam = (int)(Math.random()*2);
			if(secondTeam == 1) {
				System.out.println("Second team scores!!");
			}
			else {
				System.out.println("Second team misses!!");
			}
			if(firstTeam == secondTeam) {
				System.out.println("Another sudden death!! This one continues until one of 'em scores");
				TimeUnit.SECONDS.sleep(1);
				draw(firstTeam,secondTeam);
			}
			else {
				if(firstTeam > secondTeam) {
					System.out.println("First Team wins via sudden death");
				}
				else {
					System.out.println("Second Team wins via sudden death");
				}
			}
			
		}
	}

	private static void draw(int firstTeam, int secondTeam) throws InterruptedException {
		
		firstTeam = (int)(Math.random()*2);
		if(firstTeam == 1) {
			System.out.println("First team scores!!");
		}
		else {
			System.out.println("First team misses!!");
		}
		TimeUnit.SECONDS.sleep(1);
		secondTeam = (int)(Math.random()*2);
		if(secondTeam == 1) {
			System.out.println("Second team scores!!");
		}
		else {
			System.out.println("Second team misses!!");
		}
		if(secondTeam == firstTeam) {
			TimeUnit.SECONDS.sleep(1);
			draw(0,0);
		}
		else {
			if(secondTeam > firstTeam) {
				System.out.println("Second team wins. Finally!!");
			}
			else if(firstTeam > secondTeam) {
				System.out.println("First team wins. Finally!!");
			}
			return;
		}
	}

}
