package time;

public class TimeDriver {

	public static void main(String[] args) {
		clcok time = new clcok(18, 50, 0.0);
		clcok time2 = new clcok(2, 16, 0.0);
		clcok time3 = time.add(time, time2);
		System.out.println(time);
		System.out.println(time3);
		System.out.println(time.equals(time2));
		time.setHour(10);
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSeconds());

	}

}
