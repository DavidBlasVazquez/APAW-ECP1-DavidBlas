package es.upm.miw.apaw.composite;

public interface Component {
    public abstract void remove (Component component );
	public abstract void add(Component component);
	public abstract boolean isGroup();
	public abstract String view();
}