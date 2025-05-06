package app;

public abstract class DayEvent {
    private int dayNum;
    private String eventName;

    public DayEvent(int dayNum, String eventName) {
        this.dayNum = dayNum;
        this.eventName = eventName;
    }

    public abstract void eventStart();
}
