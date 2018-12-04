package uk.ac.belfastmet.dwarf.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarf.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	Iterable<Dwarf>	findByAuthor(String author);

	Dwarf findByDwarfId(Integer dwarfId);

	Iterable<Dwarf> findByName(String name);

	Dwarf findByNameAndAuthor(String name, String author);


}
