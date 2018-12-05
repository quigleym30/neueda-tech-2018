package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Passenger;


public interface PassengersRepository extends CrudRepository<Passenger, Integer>{

	Passenger findByPassengerId(Integer passengerId);

	Iterable<Passenger> findBySurvived(Integer survived);

	Iterable<Passenger> findByPClass(Integer pClass);

	Iterable<Passenger> findByNameContaining(String name);

	Iterable<Passenger> findBySex(String sex);

	Iterable<Passenger> findByAge(Integer age);

	Iterable<Passenger> findBySibSp(Integer sibSp);

	Iterable<Passenger> findByParch(Integer parch);

	Iterable<Passenger> findByTicket(String ticket);

	Iterable<Passenger> findByFare(Double fare);

	Iterable<Passenger> findByCabin(String cabin);

	Iterable<Passenger> findByembarked(String embarked);


}
