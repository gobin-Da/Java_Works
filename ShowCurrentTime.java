public class ShowCurrentTime {
		public static void main(String[] args){
			long totalMiliseconds = System.currentTimeMillis();
			long totalSeconds = totalMiliseconds / 1000;
			long currentSecond = totalSeconds %60;
			long totalMinutes = totalSeconds / 60;
			long currentMinutes = totalMinutes % 60;
			long totalHours = totalMinutes /60;
			long currentHour = totalHours % 24;
			

			if(currentHour <= 18){
				currentHour += 6;
				if(currentHour < 12 || currentHour == 24){
					currentHour = currentHour % 12;
					System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSecond + " AM" );
				}
				else if(currentHour >= 12 && currentHour < 24){
					currentHour = currentHour % 12;
					System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSecond + " PM" );
				}
			}
	    }
}