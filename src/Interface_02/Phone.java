package Interface_02;

public interface Phone {
	final int MAX_NUMBER_DIGITS = 11;

	void call(String number);

	default void powerOff() {
		System.out.println("電源を切ります。");

	}
}