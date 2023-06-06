	package org.ass.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.ass.calculator.CommonUtil;
import org.ass.core.dto.UserDto;
import org.ass.core.entity.Airhostess;
import org.ass.core.entity.Brand;
import org.ass.core.entity.Captain;
import org.ass.core.entity.Company;
import org.ass.core.entity.Employee;
import org.ass.core.entity.Flight;
import org.ass.core.entity.Product;
import org.ass.core.entity.Team;
import org.ass.core.entity.UserEntity;
import org.ass.core.repository.AssociationRepository;
import org.ass.core.repository.Repositorym;
import org.ass.core.repository.UserHqlRepository;
//import org.ass.core.entity.UserEntity;
import org.ass.core.repository.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       UserEntity userEntity = new UserEntity();
       //userEntity.setAltkey(123);
       userEntity.setName("dinesh");
       userEntity.setEmail("d@jsp.com");
       userEntity.setPassword("456");
       userEntity.setCity("bangalore");
       userEntity.setCountry("India");
       userEntity.setPincode("3308");
       userEntity.setContactNumber("105");
       
       UserRepository repository = new UserRepository();
 //      repository.saveOrUpdateUseDetails(userEntity);
//       UserEntity entity = repository.findById(124);
//       System.out.println(entity);
       
       UserDto userDto=new UserDto();
       userDto.setAltkey(125);
       userDto.setName("rockstar dinesh");
       userDto.setCity("delhi");
       userDto.setPincode("3304");
       userDto.setCountry("australia");
      // repository.update(userDto);
       
       UserHqlRepository hqlRepository = new UserHqlRepository();
//       List<UserEntity> userEntityList = hqlRepository.findAll();
//       userEntityList.forEach(each->{
//    	   System.out.println(each);   
//       });
       
//       List<UserEntity>userEntitySortedList=
// 			  userEntityList.stream()
// 			  .filter(each->
// 			  each.getName()
// 			  .equalsIgnoreCase("Abhijeet"))
// 			  .collect(Collectors.toList()); 
       
//       List<UserEntity> findByName=hqlRepository.findByName("dinesh");
//       findByName.forEach(each->{
//    	   System.out.println(each);
//       });
       
//       List<UserEntity> updatePasswordByEmail=hqlRepository.updatePasswordByEmail("12345", "j@jsp.com");
//       updatePasswordByEmail.forEach(each->{
//    	   System.out.println(each);
//       });
       
       //hqlRepository.updatePasswordByEmail("updated password", "j@jsp.com");
       //hqlRepository.deleteByEmail("A@jsp.com");
       
       Team team = new Team();
       team.setName("football");
       team.setTeamSize("14");
       team.setTeamType("football");
       
       Captain captain = new Captain();
       captain.setCaptainName("sharma");
       captain.setAge("38");
       captain.setEmail("s@gmail.com");
       
       team.setCaptain(captain);
       
       AssociationRepository repository2 = new AssociationRepository();
       //repository2.saveTeamDetails(team);
       
       Airhostess airhostess = new Airhostess();
       airhostess.setName("karina");
       airhostess.setAge("24");
       
       Airhostess airhostess1 = new Airhostess();
       airhostess1.setName("priya");
       airhostess1.setAge("25");
       
       Airhostess airhostess2 = new Airhostess();
       airhostess2.setName("rani");
       airhostess2.setAge("31");
       
       ArrayList<Airhostess> arrayList = new ArrayList<>();
       arrayList.add(airhostess);
       arrayList.add(airhostess1);
       arrayList.add(airhostess2);
       
       Flight flight = new Flight();
       flight.setName("AirIndia");
       flight.setPrice("8000");
       flight.setNumOfSeats("110");
       
       flight.setAirhostessesList(arrayList);
       //repository2.saveFlightDetails(flight);
       
       
       Employee employee = new Employee();
       employee.setName("saif");
       employee.setEmail("s1@gmail.com");
       employee.setSalary("4,50,000");
       employee.setEmployeeAddress("Patna Bihar");
       
       Employee employee2 = new Employee();
       employee.setName("sadiya");
       employee.setEmail("sadiya2@gmail.com");
       employee.setSalary("5,50,000");
       employee.setEmployeeAddress("Bangalore");
       
       Employee employee3 = new Employee();
       employee.setName("Tanu");
       employee.setEmail("t3@gmail.com");
       employee.setSalary("3,50,000");
       employee.setEmployeeAddress("Delhi");
       
       ArrayList<Employee> arrayList2 = new ArrayList<>();
       arrayList2.add(employee);
       arrayList2.add(employee2);
       arrayList2.add(employee3);
       
       Company company = new Company();
       company.setName("Smart Technology Pvt. Ltd.");
       company.setCompanyType("Information Technology");
       company.setCompanyAddress("Marathahalli Bangalore");
       
       company.setEmplList(arrayList2);
//       repository2.saveEmployeeDetails(employee);
//       repository2.saveEmployeeDetails(employee2);
//       repository2.saveEmployeeDetails(employee3);
       
       
       Repositorym repo = new Repositorym();
       
       Product p1=new Product();
       p1.setProductName("curd");
       
       Product p2=new Product();
       p2.setProductName("milk");
       
       Product p3=new Product();
       p3.setProductName("ghee");
       
       ArrayList<Product> products = new ArrayList<Product>();
       
       products.add(p1);
       products.add(p2);
       products.add(p3);
       
       ArrayList<Brand> brands = new ArrayList<Brand>();
       
       Brand b1 = new Brand();
       b1.setBrand("amul");
       b1.setProducts(products);
       
       Brand b2 = new Brand();
       b2.setBrand("nandini");
       b2.setProducts(products);
       
       Brand b3 = new Brand();
       b3.setBrand("milkiMist");
       b3.setProducts(products);
       
       brands.add(b1);
       brands.add(b2);
       brands.add(b3);
       
       p1.setBrands(brands);
       p2.setBrands(brands);
       p3.setBrands(brands);
       
       //repo.saveBrand(b1);
    }
    
}
