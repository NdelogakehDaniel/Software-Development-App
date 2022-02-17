
package com.restful;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author daniel
 */
@javax.ws.rs.ApplicationPath("")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.controller.AppointmentController.class);
        resources.add(com.controller.MeetingsController.class);
        resources.add(com.controller.PaymentController.class);
        resources.add(com.controller.ProgressController.class);
        resources.add(com.controller.ProjectController.class);
        resources.add(com.controller.ProjectMediaController.class);
        resources.add(com.controller.UserController.class);
        
    }
    
}
