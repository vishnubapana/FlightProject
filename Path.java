package PriorityQueue;
import java.util.ArrayList;
import java.util.List;

class Path
{
	private List<String> path;
	private String Node;
	public Path()
	{
		path = new ArrayList<String>();
	}
	public void setNode(String Node)
	{
		this.Node = Node;
	}
	public String getNode()
	{
		return this.Node;
	}
	public Boolean exists(String node)
	{
		if(path.contains(node))
			return true;
		return false;
	}
	public void add(String node)
	{
		path.add(node);
	}
	public void delete(String node)
	{
		path.remove(node);
	}
}