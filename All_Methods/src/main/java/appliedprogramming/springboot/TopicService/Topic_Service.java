package appliedprogramming.springboot.TopicService;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class Topic_Service {

	private List<Topics> top=new ArrayList<>(Arrays.asList(	

		new Topics("DP", "Design Pattern", "Elective Course"),
		new Topics("AP", "Applied Programming", "Core Course"),
		new Topics("ARM", "Advanced Research Method", "Core Course")
			));
	
public List<Topics> GetAllTopics()
{
	return top;
}

public Topics getSingleTopic(String id)
{
	Topics t_var=null;
	for(Topics t:top )	
	{
		if(t.getId().equals(id))
		{
			t_var=t;
			break;
		}
	}
	return t_var;
}


public void AddTopic(Topics t)
{
	top.add(t);
}

public void UpdateTopic(String id, Topics tt )
{
	for(int i=0 ; i<top.size();i++)
	{
		Topics t=top.get(i);
		if(t.getId().equals(id))
		{
			top.set(i, tt);
			return;
		}
	}
}

public void DeleteTopic(String id)
{
	for(int i=0;i<top.size();i++)
	{
		Topics t=top.get(i);
		if(t.getId().equals(id))
		{
			top.remove(i);
			return;
		}
	}
}
}
