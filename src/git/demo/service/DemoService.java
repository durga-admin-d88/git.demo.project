package git.demo.service;

import java.util.List;

import git.demo.controller.DemoController;

public interface DemoService {
	
	public List<DemoController> findAll();

}
