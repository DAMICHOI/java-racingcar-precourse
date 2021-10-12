package racinggame.domain;

public enum MoveStatus {
	GO, STOP;

	public boolean isGo() {
		return this == GO;
	}

	public boolean isStop() {
		return this == STOP;
	}
}
