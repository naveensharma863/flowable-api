package holidayrequest;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngines;

public class Test {

	public static void test() {
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		System.out.println(processEngine);
	}
}
