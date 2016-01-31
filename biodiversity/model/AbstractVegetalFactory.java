package biodiversity.model;

public abstract class AbstractVegetalFactory {

	protected abstract Tree createTree();

	public Tree getTree(){
		return createTree();
	}	
}
