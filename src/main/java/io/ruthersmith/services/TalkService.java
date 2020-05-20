package io.ruthersmith.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.ruthersmith.model.Talk;
import io.ruthersmith.model.TalkRepository;

/* the commented code were use before connecting to the database, now we use in memory db*/

@Service
public class TalkService {
	
	@Autowired
	private TalkRepository talkRepository;

	
	public List<Talk> getTalks() {
		return (List<Talk>) talkRepository.findAll(); 
	}
	
	public Talk getTalk(int id) {
		//return talks.stream().filter( t -> t.getId() == id ).findFirst().get();
		 return talkRepository.findById(id).get();
	}

	public void addTalk(Talk talk) {
		//talks.add(talk);
		talkRepository.save(talk);
	}

	public void update(int id, Talk talk) {
		talkRepository.save(talk);
	}

	public void delete(int id) {
		//talks.removeIf(t -> t.getId() == id);
		talkRepository.deleteById(id);
	}
	
}
