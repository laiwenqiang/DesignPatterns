package C.观察者.儿子起床;

import java.util.ArrayList;
import java.util.List;

public class Baby implements Runnable{
	private List<ActionInterface> actionList = new ArrayList<ActionInterface>();
	
	public void addAction(ActionInterface action){
		this.actionList.add(action);
	}
	
	public void removeAction(ActionInterface action){
		this.actionList.remove(action);
	}
	
	private void wakeUp(){
		for(ActionInterface actionInterface : this.actionList){
			actionInterface.doAction();
		}
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5*1000);
			wakeUp();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
