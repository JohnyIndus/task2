package by.eugene.academy.less3;

public class Intro3less {

	public static void main(String[] args) {

		int numberOfSeconds = 0;
		int hour, min, sec;
		int saveNumberOfSeconds;
		numberOfSeconds = 78;
		saveNumberOfSeconds = numberOfSeconds;
		if ((numberOfSeconds > 86400) || (numberOfSeconds < 0)) {
			System.out.println("Неверное значение.");
			return;
		}
		hour = numberOfSeconds / 3600;
		numberOfSeconds = numberOfSeconds - hour * 3600;
		min = numberOfSeconds / 60;
		numberOfSeconds = numberOfSeconds - min * 60;
		sec = numberOfSeconds;
		System.out.println("В " + saveNumberOfSeconds + " секундах: " + hour + " ч. " + min + " мин. " + sec + " сек.");

		// TODO Auto-generated method stub

	}

}
