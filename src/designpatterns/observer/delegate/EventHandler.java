package designpatterns.observer.delegate;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {

    private List<Event> events;
    
    public EventHandler()
    {
    	events = new ArrayList<Event>();
    }
    
    public void addEvent(Object object, String methodName, Object...args)
    {
    	events.add(new Event(object, methodName, args));
    }
    
    public void notifyX() throws Exception
    {
        for (Event event : events)
        {
            event.invoke();
        }
    }
}
