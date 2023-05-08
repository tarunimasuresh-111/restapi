package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.Pets;

import jakarta.transaction.Transactional;
@Repository
public interface PetsRepository extends JpaRepository<Pets, Integer> {
	@Modifying
	@Transactional
	@Query(value="select * from pets_details", nativeQuery = true)
	public List<Pets> getAllData();
	
	@Modifying
	@Transactional
	@Query(value="delete from pets_details where id=?1 and id=?2", nativeQuery = true)
	public void deleteById(@Param("pid") int pid,@Param("pname") String pname);
    
	@Modifying
	@Transactional
	@Query(value="update pets_details set id=?1 where pname=?2",nativeQuery = true)
	public void updateQuery(@Param("page") String page, @Param("pname") String pname);
	
	/*@Modifying
	@Transactional
	@Query("delete from Pets p where p.pname=?1")
	Integer deleteByName(@Param("pname") String pname);*/
	
	@Query("select p from Pets p where p.pname=?1")
	public List<Pets> get(@Param("pname") String pname);
	
	/*//@Modifying
	//@Transactional
	//@Query("update Pets p set p.pid=:id where p.pname=:name")
	public void update(@Param("pid") int pid,@Param("pname") String pname);*/

 
	
}
