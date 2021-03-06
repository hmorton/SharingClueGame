package clueGame;

public class RoomCell extends BoardCell {
	private char roomInitial;
	private DoorDirection doorDirection;

	public enum DoorDirection {
		UP, DOWN, LEFT, RIGHT, NONE
	}

	public RoomCell() {
		super();
	}

	public RoomCell(String room) {
		super();
		roomInitial = room.charAt(0);
		if (room.length() == 2) {
			char direction = room.charAt(1);
			if (direction == 'U') {
				doorDirection = DoorDirection.UP;
			} else if (direction == 'D') {
				doorDirection = DoorDirection.DOWN;
			} else if (direction == 'L') {
				doorDirection = DoorDirection.LEFT;
			} else if (direction == 'R'){
				doorDirection = DoorDirection.RIGHT;
			} else{
				doorDirection = DoorDirection.NONE;
			}
		} else {
			doorDirection = DoorDirection.NONE;
		}
	}
	@Override
	public Boolean isRoom() {
		return true;
	}
	@Override
	public Boolean isDoorway(){
		if(doorDirection == DoorDirection.NONE){
			return false;
		}else{
			return true;
			}
	}
	public DoorDirection getDoorDirection() {
		return doorDirection;

	}
	public void setDoorDirection(DoorDirection doorDirection) {
		this.doorDirection = doorDirection;
	}

	public Character getInitial() {
		return roomInitial;
	}
	public void setInitial(char roomInitial) {
		this.roomInitial = roomInitial;
	}
}