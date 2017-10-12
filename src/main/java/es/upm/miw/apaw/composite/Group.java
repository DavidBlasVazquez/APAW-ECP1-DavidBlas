package es.upm.miw.apaw.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group implements Component {
    private String name;
	private List<Component> components;
	public Group (String name) {
		this.name = name;
		components = new ArrayList<Component>();
	}
	@Override
	public void remove(Component component) {
		components.remove(component);
	}
	@Override
	public void add(Component component) {
		components.add(component);
	}
	@Override
	public String view() {
		Iterator<Component> iterator = components.iterator();
		String str = name;
		while (iterator.hasNext()) {
			str += " " + iterator.next().view();
		}
        return str;
	}
	@Override
	public boolean isGroup() {
		return true;
	}
}
