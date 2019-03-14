package appliedprogramming.springboot.TopicController;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import appliedprogramming.springboot.TopicService.Topic_Service;
import appliedprogramming.springboot.TopicService.Topics;


@RestController
public class Topic_Controller {
	
	@Autowired
	private Topic_Service abc;
	
	
	@RequestMapping("/getalltopics")
	public List<Topics> GetAll()
	{
		return abc.GetAllTopics();
	}
	
	@RequestMapping("/getsingletopic/{id}")
	 public Topics getsingletopic(@PathVariable String id) 
	 {
		return abc.getSingleTopic(id);
	 }
	
	@RequestMapping(method =RequestMethod.POST, value= "/addtopic")
	public void addtopics(@RequestBody Topics a)
	{
		abc.AddTopic(a);
	}

	@RequestMapping(method =RequestMethod.PUT, value= "/updatetopic/{id}")
	public void updatetopic(@PathVariable String id,@RequestBody Topics t)
	{
		abc.UpdateTopic(id, t);
	}
	
	@RequestMapping(method =RequestMethod.DELETE, value= "/deletetopic/{id}")
	public void deletetopic(@PathVariable String id)
	{
		abc.DeleteTopic(id);
	}
}
