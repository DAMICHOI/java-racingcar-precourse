package racinggame;

public class CarPosition {
	private static final int POSITION_INIT = 0;
	private int position;

	public CarPosition() {
		this.position = POSITION_INIT;
	}

	public int increase() {
		return this.position++;
	}

	public int getPosition() {
		return position;
	}

	@Override
	public String toString() {
		StringBuilder marker = new StringBuilder();
		for (int i = 0; i < position; i++) {
			marker.append("-");
		}
		return marker.toString();
	}
}
