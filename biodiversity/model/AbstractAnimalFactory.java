package biodiversity.model;

public abstract class AbstractAnimalFactory {
	
	protected abstract Worm createWorm();

	public Worm getWorm() {
		return createWorm();
	}
}
