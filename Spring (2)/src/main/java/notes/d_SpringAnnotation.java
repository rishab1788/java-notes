package notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * // @component this tells Container to create object of this class
 * IOC container
 * this container takes and create object with camelcase
 * we can also have customize component
 *
 * @Service and @Repository are special cases of @Component.
 * They are technically the same but we use them for the different purposes.
 */
@Component("StudentRename")
class Student {
    @Value("101") // this set the value of it
    int roll;
}

public class d_SpringAnnotation {


    /**
     * DI namely the @Resource, @Inject, and @Autowired annotations.
     * These annotations provide classes with a declarative way to resolve dependencies. For example:
     * as opposed to
     * ArbitraryClass arbObject = new ArbitraryClass();
     * @Resource means get me a known resource by name. The name is extracted from the
     *           name of the annotated setter or field, or it is taken from the name-Parameter.
     * @Inject or @Autowired try to wire in a suitable other component by type.
     *
     * */


    /**
     * The @Resource Annotation
     * The @Resource annotation is part of the JSR-250 annotation collection and is packaged with Jakarta EE. This annotation has the following execution paths, listed by precedence:
     * Match by Name
     * Match by Type
     * Match by Qualifier (ignored if match is found by name)
     * These execution paths are applicable to both setter and field injection.
     */
    @Resource
    private Student resourceStudent;

    /**
     * this tells spring among the component that are being managed by you
     * reutrn particular impl which is matching the following class and impl s refrence
     * The behaviour of @Autowired annotation is similar to the @Inject annotation.
     * The only difference is that the @Autowired annotation is part of the Spring framework.
     * This annotation has the same execution paths as the @Inject annotation, listed in order of precedence:
     * Match by Type
     * Match by Qualifier
     * Match by Name
     */
    @Autowired
    private Student s; //here s also matching part


    /**
     * The @Inject Annotation
     * The @Inject annotation belongs to the JSR-330 annotations collection. This annotation has the following execution paths, listed by precedence:
     *
     * Match by Type
     * Match by Qualifier
     * Match by Name
     * */

    /**
     * class
     */
    @Configuration
    class c {

    }

}
/**
 * @Repository’s job is to catch persistence specific exceptions and rethrow them as one of Spring’s unified unchecked exception.
 *
 * For this Spring provides PersistenceExceptionTranslationPostProcessor, that requires to add in our application context:
 *
 * <bean class=
 *   "org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor"/>
 * This bean post processor adds an advisor to any bean that’s annotated with @Repository.
 * */
@Repository
class PersitanceAnnotation {

}


/**
 * @Service
 * We mark beans with @Service to indicate that it's holding the business logic.
 * So there's not any other specialty except using it in the service layer.
 * */