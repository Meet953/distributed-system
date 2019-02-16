package myApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum ModuleDao {

	instance;

	private Map<Integer, Module> modulesMap = new HashMap<Integer, Module>();

	private ModuleDao() {
	Module module1 = new Module();
	module1.setId(1);
	module1.setName("Software Engineer");
	module1.setHoursPerWeek(5);
	module1.setLecturer("Declan") ;
	modulesMap.put(1, module1);
	
	Module module2 = new Module();
	module2. setId(2);
	module2.setName("Project Engineer");
	module2.setHoursPerWeek(2);
	module2.setLecturer("Michael") ;
	modulesMap.put(2, module2);

	}

	public List<Module> getModules() {
	List<Module> modules = new ArrayList<Module>();
	modules.addAll(modulesMap.values());
	return modules;

	}

	public Module getModule(int id) {
	return modulesMap.get(id);

	}
}
