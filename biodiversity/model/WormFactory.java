package biodiversity.model;

public class WormFactory extends AbstractAnimalFactory {

	@Override
	protected Worm createWorm() {
		// TODO Dummy implementation. To be improved in the future
		return new Worm();
	}

}
