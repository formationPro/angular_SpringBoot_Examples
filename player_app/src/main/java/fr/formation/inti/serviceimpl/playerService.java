package fr.formation.inti.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.inti.Repository.Iplayerrepository;
import fr.formation.inti.entities.player;
import fr.formation.inti.service.ICrudService;

@RestController
@CrossOrigin
@RequestMapping("/apiPlayer")
public class playerService implements ICrudService<player, Integer>{

	@Autowired
	Iplayerrepository ipr ;
	
	

	@Override
	@RequestMapping(value = "/players", method = RequestMethod.GET)
	public List<player> getAll() {
		return ipr.findAll();
	}

	@Override
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public player add(@RequestBody player entity) {
		return ipr.save(entity);
		
	}

	
	@Override
	@RequestMapping(value = "/edit", method = RequestMethod.PUT)
	public player update(@RequestBody player entity) {
		return ipr.save(entity);
		
	}

	@Override
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id) {
		ipr.deleteById(id);
		
	}

	@Override
	@RequestMapping(value = "/saveall", method = RequestMethod.POST)
	public void saveAll(Iterable<player> entities) {
		ipr.saveAll(entities);
		
	}

	@Override
	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public player findbyid(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		return ipr.getOne(id);
	}




	
}
