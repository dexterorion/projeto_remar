import org.springframework.web.context.support.WebApplicationContextUtils
import projetoremar.Usuario
import projetoremar.Papel
import projetoremar.UsuarioPapel
import projetoremar.Professor
import org.camunda.bpm.engine.IdentityService
import org.camunda.bpm.engine.identity.User

import javax.servlet.http.HttpServletRequest

class BootStrap {

    IdentityService identityService

    def init = { servletContext ->

        HttpServletRequest.metaClass.isXhr = {->
            'XMLHttpRequest' == delegate.getHeader('X-Requested-With')
        }

        /*def adminPapel = new Papel(authority: "ROLE_ADMIN").save flush: true

        def admin = new Usuario(
            username: "admin",
            password: "admin",
            email: "admin@admin.com",
            name: "Administrador",
            enabled: true).save flush: true

        if(admin.hasErrors()){
            println admin.errors
        }

        UsuarioPapel.create(admin, adminPapel, true)

        print 'populando usuário admin - ok'
    
        User camundaProf = identityService.newUser("prof")
        camundaProf.setEmail("cleyton@prof.com")
        camundaProf.setFirstName("Cleyton")
        camundaProf.setPassword("prof")
        identityService.saveUser(camundaProf)

        def profPapel = new Papel(authority: "ROLE_PROF").save flush: true

        def professor = new Usuario(
            name: "Cleyton",
            username: "prof",
            password: "prof",
            email: "cleyton@prof.com",
            camunda_id: camundaProf.getId(),
            enabled: true).save flush: true

        if(professor.hasErrors()){
            println professor.errors
        }

        UsuarioPapel.create(professor, profPapel, true)

        print 'populando professor - ok'

        def alunoPapel = new Papel(authority: "ROLE_ALUNO").save flush: true

        def aluno = new Usuario(
            username: "aluno",
            password: "aluno",
            email: "aluno@ufscar.com",
            name: "Aluno",
            enabled: true).save flush: true

        if(aluno.hasErrors()){
            println aluno.errors
        }

        UsuarioPapel.create(aluno, alunoPapel, true)

        print 'populando aluno - ok'

        def desenvolvedorPapel = new Papel(authority: "ROLE_DESENVOLVEDOR").save flush: true

        def desenvolvedor = new Usuario(
            username:"desenvolvedor",
            password:"desenvolvedor",
            email: "desenvolvedor@desenvolvedor.com",
            name: "Desenvolvedor",
            enabled:true).save flush: true

        if(desenvolvedor.hasErrors()){
            println desenvolvedor.errors
        }

        UsuarioPapel.create(desenvolvedor, desenvolvedorPapel, true)

        print 'populando desenvolvedor - ok'
        */
        
        def springContext = WebApplicationContextUtils.getWebApplicationContext(servletContext)
        


    }
    def destroy = {
    }
}
