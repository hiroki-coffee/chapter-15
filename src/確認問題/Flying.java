package 確認問題;

public interface Flying {
	void fly();

	default void powerOff() {
		System.out.println("飛んでいる場合は、落下します。");
	}

}
