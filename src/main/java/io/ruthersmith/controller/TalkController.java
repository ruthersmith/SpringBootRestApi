package io.ruthersmith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.ruthersmith.model.Talk;
import io.ruthersmith.services.TalkService;

@RestController
public class TalkController {
	
	@Autowired
	private TalkService talkService;
	
	@RequestMapping("/talks")
	public List<Talk> getTalks() {
		return talkService.getTalks();
	}
	
	@RequestMapping("/talks/{id}")
	public Talk getTalk(@PathVariable String id) {
		return talkService.getTalk(Integer.parseInt(id));
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/talks")
	public void createTalk(@RequestBody Talk talk){
		talkService.addTalk(talk);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/talks/{id}")
	public void updateTalk(@PathVariable String id, @RequestBody Talk talk){
		talkService.update(Integer.parseInt(id), talk);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/talks/{id}")
	public void deleteTalk(@PathVariable String id){
		talkService.delete(Integer.parseInt(id));
	}

}
	