package uk.ac.belfastmet.cereal.repositroies;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.cereal.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer>{

	Iterable<Cereal> findByManufacturerContaining(String manufacturer);

	Iterable<Cereal> findByCerealContaining(String cereal);

	Object findByCerealId(Integer cerealId);


}
