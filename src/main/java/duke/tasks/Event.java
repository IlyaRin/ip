package duke.tasks;

import duke.Parser;

public class Event extends Task {

    private final String time;

    public Event(String description, String time) {
        super(description, "Event");
        this.time = time;
    }
    
    public Event (String description, String time, boolean done) {
        super (description, "Event", done);
        this.time = time;
    }

    @Override
    public String getTime() {
        return this.time;
    }

    @Override
    public String toString() {
        Parser p = new Parser();
        if (done) {
            return String.format ("[E][DONE] %s (at: %s)", this.description, p.convertDate(time));
        } else {
            return String.format ("[E][NOT DONE] %s (at: %s)", this.description, p.convertDate(time));
        }
    }
}