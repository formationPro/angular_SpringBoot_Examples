package fr.formation.inti.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.inti.Repository.IequipeRepository;
import fr.formation.inti.entities.Equipe;
import fr.formation.inti.service.ICrudService;

@RestController
@CrossOrigin
@RequestMapping("/apiEquipe")
public class equipeService implements ICrudService<Equipe, Integer>  {
	
	@Autowired
	IequipeRepository ier ;

	@Override
	@RequestMapping(value = "/equipes", method = RequestMethod.GET)
	public List<Equipe> getAll() {
		// TODO Auto-generated method stub
		return ier.findAll();
	}

	@Override
	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public Equipe findbyid(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		return ier.getOne(id);
	}

	@Override
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Equipe add(@RequestBody Equipe entity) {
		// TODO Auto-generated method stub
		return ier.save(entity);
	}

	@Override
	@RequestMapping(value = "/edit", method = RequestMethod.PUT)
	public Equipe update(@RequestBody Equipe entity) {
		// TODO Auto-generated method stub
		return ier.save(entity);
	}

	@Override
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		ier.deleteById(id);
	}

	@Override
	@RequestMapping(value = "/saveall", method = RequestMethod.POST)
	public void saveAll(Iterable<Equipe> entities) {
		// TODO Auto-generated method stub
		ier.saveAll(entities);
	}

}
