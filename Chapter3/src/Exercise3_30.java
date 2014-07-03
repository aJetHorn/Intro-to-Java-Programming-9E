/*
 * Current time. Display hour using a 12-hour clock
 */
public class Exercise3_30 {
	public static void main(String[] args){
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		String amOrPM = "AM";
		
		if (currentHour > 12){
			currentHour -= 12;
			amOrPM = "PM";
		}
		System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond + " " + amOrPM + " GMT");
	}
}
