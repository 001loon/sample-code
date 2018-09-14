package mycode;

public class ClockAngle {
//test change
	public static void main (String [] args) {
		String inputArgs = args[0];
		int ind = inputArgs.indexOf(":");
		String hourString = inputArgs.substring(0,ind);
		String minuteString = inputArgs.substring(ind +1);
		
		System.out.println("hourString = " + hourString + "  minuteString = " + minuteString);
		
		int hourInt = Integer.parseInt(hourString);
		int minuteInt = Integer.parseInt(minuteString);
		System.out.println("hourInt = " + hourInt + "  minuteInt = " + minuteInt);
		
		double myangle = clockAngle(hourInt, minuteInt);
		System.out.println("the angle is :: " + myangle);

	}

	public static double clockAngle(int hour, int minutes) {
		final double MINUTES_PER_HOUR = 60;
		final double DEGREES_PER_MINUTE = 360 / MINUTES_PER_HOUR;
		final double DEGREES_PER_HOUR = 360 / 12;

		double minuteAngle = minutes * DEGREES_PER_MINUTE;
		double hourAngle = hour * DEGREES_PER_HOUR + 
				(minutes / MINUTES_PER_HOUR) * DEGREES_PER_HOUR;

		double diff = Math.abs(minuteAngle - hourAngle);
		if (diff > 180) return 360 - diff;
		return diff;
	}
}
