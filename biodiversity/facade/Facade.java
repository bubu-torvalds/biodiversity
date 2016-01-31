package biodiversity.facade;

import biodiversity.model.Tree;
import biodiversity.model.TreeFactory;
import biodiversity.model.Worm;
import biodiversity.model.WormFactory;

public class Facade {
	
	private WormFactory wormFactory;
	private TreeFactory treeFactory;
	
	public Worm addWorm() {
		return wormFactory.getWorm();
	}
	
	public Tree addTree() {
		return treeFactory.getTree();
	}
	
}
