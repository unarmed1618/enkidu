package enkidu.main;

/*
 * One world exists
 */
public class Eridug {
	
	
	private LapisFetcher branch;
	private final Lapis root;
	private Lapis current;
	public Eridug() {
		branch = new LapisFetcher();
		root = branch.getRootLapis();
		current = branch.getRootLapis();
	}
	public LapisFetcher getBranch() {
		return branch;
	}
	public Lapis getRoot() {
		return root;
	}
	public Lapis getCurrent() {
		return current;
	}
	
}
