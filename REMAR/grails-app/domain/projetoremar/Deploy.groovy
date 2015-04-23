package projetoremar

class Deploy {
    static belongsTo = [desenvolvedor: Usuario]

    static constraints = {
        data_deploy (blank: false)
    }

    Date data_deploy
    String id_deploy
    String war_filename
}
