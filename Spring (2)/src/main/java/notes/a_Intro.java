package notes;
/**
 * Path vs ClassPath -
 * ClassPath - it describe where required .class file present
 * may not compile and run the program.
 * <p>
 * <p>
 * Path - Javac Test.java (compile .java file)
 * javac.exe executes -> its located in path location
 * path represents where binrays executable are presetnt
 * JDK/bin -> binary's executable
 */

/**
 * Spring vs. Spring Boot vs. Spring MVC
 * Sprint (Cake Ingredients ) Spring Boot - (Cake )
 * Spring - this improves Spring do the hard work and @Autowired @Controller
 *          Testability->
 *          Dependency of Injection or IOC ->
 *          Removes Duplication/plumbing code.
 *          Works above JDBC,ORM Framework
 *          Good Integration with other framework -> Hibernate for ORM.
 *
 *   Why are we Need Spring Boot?
 *   -> we are shifting towards microservice. 10 small microservice which
 *      has their on capabilities.
 *      creating Bean -> configure xml. same configuration for all microservice
 *      their where Spring auto configuration comes in.
 *
 *      -- what is does ? - Spring boot looks at a framework availble on class path
 *                          if it see datasource is not configured
 *                          it comes with the simple starter
 *
 *
 * Inversion of control (Take control of from user and provide it optimally in applicaiton  by framework)
 * In software engineering, inversion of control is a programming principle.
 * IoC inverts the flow of control as compared to traditional control flow. In IoC,
 * custom-written portions of a computer program receive the flow of control from a generic framework.
 *
 * Dependency inversion is the best example where we dont care creating the object and maitining life cycle of object
 * but spring-boot does for it,
 *  */
public class a_Intro {

}
