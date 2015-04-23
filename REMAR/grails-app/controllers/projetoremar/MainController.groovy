package projetoremar

import org.camunda.bpm.engine.*
import org.camunda.bpm.engine.runtime.Execution
import org.camunda.bpm.engine.runtime.ProcessInstance
import org.camunda.bpm.engine.repository.ProcessDefinition
import org.camunda.bpm.engine.repository.ProcessDefinitionQuery
import org.springframework.security.access.annotation.Secured


@Secured(['ROLE_PROF', 'ROLE_DESENVOLVEDOR'])
class MainController {

	def springSecurityService
	ManagementService managementService
	RuntimeService runtimeService
    RepositoryService repositoryService
    
    def index() {
    	def user = springSecurityService.currentUser
    	Set<Papel> userAuthorities = user.getAuthorities()
    	if (userAuthorities.any { it.authority == "ROLE_DESENVOLVEDOR" }) {
    		redirect action: "index", controller: "deploy"
		}
        else{
            if (userAuthorities.any { it.authority == "ROLE_PROF" }) {
            redirect action: "index", controller: "processoJogo"
            }
        }
	}
}
